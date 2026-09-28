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
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.siblingNodes();
        org.jsoup.nodes.Node node10 = node8.parent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Node node12 = comment2.attr("", "\n<!---->");
        java.lang.String str13 = node12.outerHtml();
        boolean boolean14 = node12.hasParent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!---->" + "'", str13, "\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
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
        org.jsoup.nodes.Node node22 = comment2.parentNode();
        java.lang.Object obj23 = null;
        boolean boolean24 = comment2.hasSameValue(obj23);
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable25, 10, outputSettings27);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node4 = comment2.wrap("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            node4.setBaseUri("\n<!--#comment-->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        java.lang.String str8 = comment2.getData();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment2.childNodesCopy();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable10, (int) '#', outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        boolean boolean4 = comment2.hasParent();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean9 = comment7.hasAttr("hi!");
        org.jsoup.nodes.Node node10 = comment7.parentNode();
        int int11 = comment7.siblingIndex();
        java.lang.String str12 = comment7.outerHtml();
        int int13 = comment7.siblingIndex();
        org.jsoup.nodes.Node node14 = comment7.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        java.lang.String str35 = comment25.toString();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\n<!---->" + "'", str35, "\n<!---->");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Node node9 = comment2.root();
        java.lang.Class<?> wildcardClass10 = comment2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        comment2.setBaseUri("\n<!--hi!-->");
        org.jsoup.nodes.Node node14 = comment2.attr("", "#comment");
        org.jsoup.nodes.Node node15 = comment2.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = comment2.asXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration16.siblingNodes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(xmlDeclaration16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
            org.jsoup.nodes.Node node30 = node23.after("\n<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        java.util.List<org.jsoup.nodes.Node> nodeList22 = node12.childNodes();
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
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        int int3 = comment2.childNodeSize();
        org.jsoup.nodes.Node node4 = comment2.previousSibling();
        java.lang.String str6 = comment2.absUrl("hi!");
        java.lang.String str7 = comment2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--#comment-->" + "'", str7, "\n<!--#comment-->");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        int int3 = comment2.childNodeSize();
        org.jsoup.nodes.Node node4 = comment2.clone();
        int int5 = node4.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        boolean boolean11 = comment8.hasParent();
        java.lang.String str13 = comment8.absUrl("hi!");
        org.jsoup.nodes.Node node14 = comment8.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node4.after((org.jsoup.nodes.Node) comment8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
        org.jsoup.nodes.Attributes attributes20 = comment12.attributes();
        org.jsoup.nodes.Node node22 = comment12.wrap("\n<!--\n<!---->-->");
        boolean boolean23 = comment12.isXmlDeclaration();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        java.lang.String str8 = comment2.toString();
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        org.jsoup.nodes.Node node10 = comment2.clearAttributes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = comment2.unwrap();
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
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        org.jsoup.select.NodeFilter nodeFilter37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = comment2.filter(nodeFilter37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "\n<!--#comment-->");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.attr("hi!", "");
        org.jsoup.nodes.Node node9 = comment2.previousSibling();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable10, (int) (byte) 1, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node14 = comment8.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node18 = comment17.root();
        java.lang.String str19 = comment17.getData();
        org.jsoup.nodes.Node node20 = comment17.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            comment8.replaceWith(node20);
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
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        java.lang.String str12 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment2.childNodesCopy();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable17, 0, outputSettings19);
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
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        comment2.setBaseUri("hi!");
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        java.lang.String str10 = comment2.nodeName();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment2.outerHtmlTail(appendable11, (-1), outputSettings13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        org.jsoup.nodes.Node node6 = comment2.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node6.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        java.lang.String str11 = comment2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.siblingNodes();
        org.jsoup.nodes.Node node15 = comment2.attr("#comment", "");
        org.jsoup.nodes.Document document16 = node15.ownerDocument();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        org.jsoup.nodes.Node node21 = node20.parent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!---->");
        boolean boolean2 = comment1.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = comment1.before("\n<!--#comment-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        org.jsoup.nodes.Node node9 = comment2.attr("hi!", "#comment");
        boolean boolean10 = comment2.hasParent();
        java.lang.String str11 = comment2.toString();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!---->" + "'", str11, "\n<!---->");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        org.jsoup.nodes.Document document18 = node17.ownerDocument();
        org.jsoup.select.NodeVisitor nodeVisitor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = document18.traverse(nodeVisitor19);
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
        org.junit.Assert.assertNull(document18);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        org.jsoup.nodes.Node node3 = comment2.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = comment2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node19 = comment18.root();
        java.lang.String str20 = comment18.getData();
        org.jsoup.nodes.Node node21 = comment18.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = comment18.siblingNodes();
        org.jsoup.nodes.Node node23 = comment18.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = node15.hasSameValue((java.lang.Object) comment18);
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
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node3 = comment2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node5 = comment2.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node5.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        // The following exception was thrown during execution in test generation
        try {
            node16.remove();
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
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        org.jsoup.nodes.Node node20 = comment2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node20.before("\n<!--\n<!---->-->");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        java.lang.String str16 = comment2.nodeName();
        org.jsoup.nodes.Node node17 = comment2.clearAttributes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--hi!-->" + "'", str15, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#comment" + "'", str16, "#comment");
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        java.lang.Class<?> wildcardClass19 = comment2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = comment2.before("hi!");
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
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        java.lang.String str13 = comment2.absUrl("hi!");
        org.jsoup.nodes.Attributes attributes14 = comment2.attributes();
        org.jsoup.select.NodeFilter nodeFilter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment2.filter(nodeFilter15);
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
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = comment16.wrap("hi!");
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
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = comment16.asXmlDeclaration();
        java.lang.Appendable appendable21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment16.outerHtmlHead(appendable21, (int) ' ', outputSettings23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xmlDeclaration20);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
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
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.parentNode();
        boolean boolean11 = comment2.hasAttr("\n<!--hi!-->");
        java.lang.String str12 = comment2.baseUri();
        java.lang.String str14 = comment2.attr("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment2.after("\n<!--hi!-->");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = document4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        org.jsoup.nodes.Node node20 = comment2.attr("\n<!--#comment-->", "\n<!--\n<!--#comment-->-->");
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
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = comment2.attributes();
        org.jsoup.nodes.Node node6 = comment2.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList7 = node6.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str24 = comment23.getData();
        org.jsoup.nodes.Document document25 = comment23.ownerDocument();
        org.jsoup.nodes.Node node28 = comment23.attr("", "");
        boolean boolean29 = comment23.isXmlDeclaration();
        org.jsoup.nodes.Attributes attributes30 = comment23.attributes();
        org.jsoup.nodes.Comment comment33 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean35 = comment33.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node36 = comment33.nextSibling();
        java.lang.Appendable appendable37 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = null;
        comment33.outerHtmlTail(appendable37, (int) (short) -1, outputSettings39);
        java.lang.String str41 = comment33.nodeName();
        boolean boolean42 = comment23.hasSameValue((java.lang.Object) comment33);
        java.lang.String str43 = comment23.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = comment2.before((org.jsoup.nodes.Node) comment23);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#comment" + "'", str41, "#comment");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\n<!--hi!-->" + "'", str43, "\n<!--hi!-->");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        org.jsoup.nodes.Node node7 = comment2.parentNode();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment10.childNodes();
        org.jsoup.nodes.Node node12 = comment10.clone();
        int int13 = comment10.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = comment10.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node7.after((org.jsoup.nodes.Node) xmlDeclaration14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xmlDeclaration14);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        comment2.setBaseUri("\n<!---->");
        org.jsoup.nodes.Node node8 = comment2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node8.parentNode();
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
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        org.jsoup.nodes.Node node32 = comment2.shallowClone();
        org.jsoup.nodes.Document document33 = comment2.ownerDocument();
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
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(document33);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node4 = comment2.wrap("\n<!--hi!-->");
        boolean boolean5 = comment2.isXmlDeclaration();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable6, (int) (short) 0, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = comment2.clearAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        org.jsoup.nodes.Node node27 = node17.parent();
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
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        java.lang.String str6 = comment2.baseUri();
        org.jsoup.nodes.Node node7 = comment2.parentNode();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "#comment");
        org.jsoup.nodes.Node node3 = comment2.parentNode();
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        comment2.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes9 = comment2.attributes();
        java.lang.String str11 = comment2.attr("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        java.lang.String str21 = comment2.toString();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n<!---->" + "'", str21, "\n<!---->");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node14 = comment8.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node15 = comment8.shallowClone();
        boolean boolean16 = node15.hasParent();
        boolean boolean17 = node15.hasParent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        java.lang.String str8 = comment2.toString();
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Attributes attributes12 = comment2.attributes();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        comment2.setBaseUri("\n<!--hi!-->");
        org.jsoup.nodes.Node node14 = comment2.attr("", "#comment");
        org.jsoup.nodes.Node node15 = node14.nextSibling();
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = comment18.childNodes();
        java.lang.String str20 = comment18.outerHtml();
        org.jsoup.nodes.Node node21 = comment18.previousSibling();
        comment18.setBaseUri("hi!");
        org.jsoup.nodes.Comment comment26 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str27 = comment26.getData();
        org.jsoup.nodes.Document document28 = comment26.ownerDocument();
        org.jsoup.nodes.Node node31 = comment26.attr("", "");
        java.lang.String str32 = comment26.getData();
        int int33 = comment26.siblingIndex();
        boolean boolean35 = comment26.hasAttr("#comment");
        java.lang.String str36 = comment26.getData();
        org.jsoup.nodes.Node node37 = comment26.nextSibling();
        boolean boolean38 = comment18.equals((java.lang.Object) node37);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = node14.after(node37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n<!--hi!-->" + "'", str20, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNull(document28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        boolean boolean8 = comment2.hasAttr("#comment");
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean13 = comment11.hasAttr("hi!");
        org.jsoup.nodes.Node node14 = comment11.parentNode();
        int int15 = comment11.siblingIndex();
        org.jsoup.nodes.Node node17 = comment11.removeAttr("#comment");
        org.jsoup.nodes.Node node18 = comment11.root();
        org.jsoup.nodes.Node node21 = comment11.attr("", "\n<!---->");
        boolean boolean22 = comment11.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = comment2.after((org.jsoup.nodes.Node) comment11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        java.lang.String str13 = comment2.nodeName();
        org.jsoup.nodes.Node node15 = comment2.removeAttr("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        org.jsoup.nodes.Attributes attributes20 = comment12.attributes();
        org.jsoup.nodes.Node node22 = comment12.wrap("\n<!--\n<!---->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = comment12.after("hi!");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        org.jsoup.select.NodeVisitor nodeVisitor23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node22.traverse(nodeVisitor23);
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
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, 100, outputSettings8);
        org.jsoup.nodes.Node node10 = comment2.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node10.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.lang.String str5 = comment2.nodeName();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        org.jsoup.nodes.Node node7 = comment2.previousSibling();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean12 = comment10.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node13 = comment10.nextSibling();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        comment10.outerHtmlTail(appendable14, (int) (short) -1, outputSettings16);
        org.jsoup.nodes.Node node18 = comment10.root();
        org.jsoup.nodes.Node node20 = comment10.removeAttr("#comment");
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean25 = comment23.hasSameValue((java.lang.Object) 1);
        boolean boolean26 = comment23.hasParent();
        org.jsoup.nodes.Node node29 = comment23.attr("", "hi!");
        java.lang.String str31 = comment23.attr("");
        org.jsoup.nodes.Document document32 = comment23.ownerDocument();
        org.jsoup.nodes.Node node34 = comment23.removeAttr("#comment");
        java.lang.String str35 = comment23.nodeName();
        org.jsoup.nodes.Node node38 = comment23.attr("", "#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList39 = node38.siblingNodes();
        boolean boolean40 = node20.equals((java.lang.Object) node38);
        boolean boolean41 = node20.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(document32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#comment" + "'", str35, "#comment");
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
            org.jsoup.nodes.Node node15 = comment2.after("\n<!--\n<!---->-->");
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
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.lang.String str4 = comment2.getData();
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        org.jsoup.nodes.Node node7 = comment2.removeAttr("");
        org.jsoup.nodes.Node node8 = node7.clearAttributes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "\n<!---->");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (int) '#', outputSettings5);
        org.jsoup.nodes.Node node7 = comment2.shallowClone();
        org.jsoup.nodes.Node node8 = comment2.parent();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        comment2.outerHtmlTail(appendable9, (int) (byte) 1, outputSettings11);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        java.lang.String str8 = comment2.getData();
        java.lang.String str10 = comment2.attr("#comment");
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment2.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Attributes attributes6 = xmlDeclaration5.attributes();
        org.jsoup.nodes.Node node7 = xmlDeclaration5.root();
        node7.setBaseUri("\n<!--\n<!---->-->");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node14 = comment8.wrap("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = node14.hasParent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        comment2.setBaseUri("hi!");
        org.jsoup.nodes.Node node12 = comment2.root();
        org.jsoup.nodes.Node node15 = comment2.attr("\n<!--hi!-->", "hi!");
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node19 = comment18.root();
        boolean boolean20 = comment18.isXmlDeclaration();
        java.lang.String str21 = comment18.nodeName();
        java.lang.String str22 = comment18.nodeName();
        org.jsoup.nodes.Comment comment25 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean27 = comment25.hasSameValue((java.lang.Object) 1);
        boolean boolean28 = comment25.hasParent();
        boolean boolean30 = comment25.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean31 = comment25.isXmlDeclaration();
        boolean boolean32 = comment25.hasParent();
        org.jsoup.nodes.Node node34 = comment25.removeAttr("\n<!---->");
        boolean boolean35 = comment18.equals((java.lang.Object) node34);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = node15.after((org.jsoup.nodes.Node) comment18);
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
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#comment" + "'", str21, "#comment");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#comment" + "'", str22, "#comment");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        // The following exception was thrown during execution in test generation
        try {
            comment24.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!--hi!-->");
        java.lang.String str6 = comment2.attr("hi!");
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Node node10 = comment2.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Node node15 = comment2.shallowClone();
        org.jsoup.nodes.Node node16 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = comment2.unwrap();
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
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Node node10 = comment2.clearAttributes();
        org.jsoup.nodes.Node node11 = comment2.shallowClone();
        org.jsoup.nodes.Document document12 = comment2.ownerDocument();
        org.jsoup.select.NodeFilter nodeFilter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment2.filter(nodeFilter13);
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
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.root();
        org.jsoup.select.NodeFilter nodeFilter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node4.filter(nodeFilter5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        java.lang.String str12 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node13 = comment2.parent();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str18 = comment16.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = comment16.childNodesCopy();
        boolean boolean21 = comment16.hasAttr("");
        org.jsoup.nodes.Node node22 = comment16.parent();
        org.jsoup.nodes.Comment comment25 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str27 = comment25.absUrl("hi!");
        java.lang.String str28 = comment25.nodeName();
        org.jsoup.nodes.Node node29 = comment25.shallowClone();
        boolean boolean30 = comment16.hasSameValue((java.lang.Object) node29);
        java.lang.String str32 = comment16.absUrl("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = comment16.siblingNodes();
        boolean boolean34 = comment16.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#comment" + "'", str28, "#comment");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.lang.String str4 = comment2.getData();
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        org.jsoup.nodes.Node node7 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = comment2.attr("\n<!---->", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.root();
        org.jsoup.nodes.Node node3 = comment1.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = comment1.after("\n<!--hi!-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
        int int9 = comment2.siblingIndex();
        boolean boolean11 = comment2.hasAttr("\n<!--\n<!---->-->");
        boolean boolean13 = comment2.hasAttr("#comment");
        boolean boolean15 = comment2.hasAttr("\n<!--#comment-->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean25 = comment23.hasSameValue((java.lang.Object) 1);
        int int26 = comment23.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = comment23.siblingNodes();
        java.lang.String str28 = comment23.outerHtml();
        org.jsoup.nodes.Node node29 = comment23.root();
        org.jsoup.nodes.Node node30 = comment23.nextSibling();
        org.jsoup.nodes.Node node33 = comment23.attr("\n<!---->", "");
        org.jsoup.nodes.Node node34 = node33.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith(node34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\n<!--hi!-->" + "'", str28, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Node node15 = comment2.shallowClone();
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
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Node node4 = comment2.nextSibling();
        boolean boolean5 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node6 = comment2.root();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean12 = comment10.hasSameValue((java.lang.Object) 1);
        boolean boolean13 = comment10.hasParent();
        java.lang.String str15 = comment10.absUrl("hi!");
        org.jsoup.nodes.Node node16 = comment10.parentNode();
        comment10.setBaseUri("\n<!--hi!-->");
        comment10.setBaseUri("");
        java.lang.Appendable appendable21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        comment10.outerHtmlTail(appendable21, (int) (byte) 100, outputSettings23);
        java.lang.String str25 = comment10.outerHtml();
        org.jsoup.nodes.Node node26 = comment10.parentNode();
        org.jsoup.nodes.Comment comment29 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str31 = comment29.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList32 = comment29.childNodesCopy();
        java.lang.String str33 = comment29.getData();
        org.jsoup.nodes.Document document34 = comment29.ownerDocument();
        boolean boolean35 = comment10.hasSameValue((java.lang.Object) comment29);
        java.lang.String str37 = comment29.attr("\n<!--#comment-->");
        boolean boolean38 = node6.hasSameValue((java.lang.Object) "\n<!--#comment-->");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n<!--hi!-->" + "'", str25, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(document34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        java.lang.String str6 = comment2.getData();
        org.jsoup.nodes.Node node7 = comment2.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node13 = comment2.previousSibling();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        org.jsoup.nodes.Node node14 = comment2.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList15 = node14.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.root();
        org.jsoup.nodes.Node node3 = comment1.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = node5.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        boolean boolean5 = comment2.hasParent();
        java.lang.String str6 = comment2.baseUri();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str10 = comment9.getData();
        org.jsoup.nodes.Document document11 = comment9.ownerDocument();
        org.jsoup.nodes.Node node14 = comment9.attr("", "");
        java.lang.String str15 = comment9.getData();
        int int16 = comment9.siblingIndex();
        java.lang.String str18 = comment9.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = comment9.siblingNodes();
        int int20 = comment9.siblingIndex();
        int int21 = comment9.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = comment1.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node3 = comment1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList2);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean7 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Document document8 = comment2.ownerDocument();
        org.jsoup.nodes.Node node10 = comment2.wrap("\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        java.lang.String str7 = comment2.outerHtml();
        int int8 = comment2.siblingIndex();
        org.jsoup.nodes.Document document9 = comment2.ownerDocument();
        boolean boolean11 = comment2.hasAttr("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.parentNode();
        boolean boolean11 = comment2.hasAttr("\n<!--hi!-->");
        java.lang.String str13 = comment2.absUrl("#comment");
        boolean boolean14 = comment2.hasParent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        org.jsoup.nodes.Attributes attributes9 = comment2.attributes();
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        org.jsoup.nodes.Node node10 = comment2.root();
        org.jsoup.nodes.Node node12 = comment2.removeAttr("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.siblingNodes();
        org.jsoup.nodes.Node node14 = node12.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
        java.lang.Class<?> wildcardClass23 = comment2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
            node28.remove();
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
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment2.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.root();
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        org.jsoup.nodes.Node node12 = comment2.attr("\n<!---->", "");
        org.jsoup.nodes.Node node13 = comment2.root();
        org.jsoup.nodes.Node node14 = node13.root();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str18 = comment16.attr("#comment");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node14.before((org.jsoup.nodes.Node) comment16);
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
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str8 = comment2.attr("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment2.childNodesCopy();
        java.lang.String str10 = comment2.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment2.after("#comment");
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
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        org.jsoup.nodes.Node node20 = comment2.nextSibling();
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
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node4 = comment2.wrap("\n<!--hi!-->");
        boolean boolean5 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node6 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node6.wrap("#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!---->");
        org.jsoup.select.NodeVisitor nodeVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node3 = comment1.traverse(nodeVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        org.jsoup.nodes.Node node9 = comment2.attr("hi!", "#comment");
        java.lang.String str11 = comment2.attr("\n<!--\n<!---->-->");
        java.lang.String str12 = comment2.outerHtml();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!---->" + "'", str12, "\n<!---->");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        java.lang.String str17 = node15.outerHtml();
        org.jsoup.select.NodeFilter nodeFilter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node15.filter(nodeFilter18);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!---->" + "'", str17, "\n<!---->");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->");
        java.lang.String str3 = comment1.attr("\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node3 = comment2.clone();
        boolean boolean5 = comment2.hasAttr("hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        int int11 = comment2.siblingIndex();
        org.jsoup.nodes.Node node12 = comment2.shallowClone();
        org.jsoup.nodes.Node node13 = node12.clone();
        org.jsoup.nodes.Node node14 = node13.parent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node6 = comment2.parentNode();
        java.lang.String str8 = comment2.absUrl("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment2.childNodes();
        org.jsoup.nodes.Node node10 = comment2.parent();
        java.lang.String str12 = comment2.attr("\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        java.lang.String str13 = comment2.absUrl("hi!");
        org.jsoup.nodes.Attributes attributes14 = comment2.attributes();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        comment2.setBaseUri("\n<!---->");
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        org.jsoup.nodes.Node node9 = comment2.parentNode();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable10, 100, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node2 = comment1.previousSibling();
        int int3 = comment1.siblingIndex();
        int int4 = comment1.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment1.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        java.lang.String str6 = comment2.baseUri();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable7, (int) (short) 100, outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--\n<!---->-->");
        org.jsoup.select.NodeFilter nodeFilter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = comment2.filter(nodeFilter3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        boolean boolean10 = comment2.hasSameValue((java.lang.Object) 1.0d);
        java.lang.String str11 = comment2.getData();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.siblingNodes();
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("\n<!---->", "\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment2.before((org.jsoup.nodes.Node) comment15);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        java.lang.Class<?> wildcardClass29 = node26.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        java.lang.String str11 = comment2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.siblingNodes();
        int int13 = comment2.siblingIndex();
        int int14 = comment2.childNodeSize();
        org.jsoup.nodes.Node node15 = comment2.nextSibling();
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable16, 10, outputSettings18);
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
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!---->");
        boolean boolean2 = comment1.isXmlDeclaration();
        java.lang.String str4 = comment1.attr("\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        java.lang.String str5 = comment2.baseUri();
        java.lang.Object obj6 = null;
        boolean boolean7 = comment2.hasSameValue(obj6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
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
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.parentNode();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean8 = comment6.hasSameValue((java.lang.Object) 1);
        boolean boolean9 = comment6.hasParent();
        org.jsoup.nodes.Node node12 = comment6.attr("", "hi!");
        java.lang.String str14 = comment6.attr("");
        org.jsoup.nodes.Document document15 = comment6.ownerDocument();
        org.jsoup.nodes.Node node17 = comment6.removeAttr("#comment");
        java.lang.String str18 = comment6.nodeName();
        org.jsoup.nodes.Node node20 = comment6.removeAttr("hi!");
        boolean boolean22 = comment6.hasAttr("hi!");
        org.jsoup.nodes.Node node25 = comment6.attr("hi!", "#comment");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = comment2.after((org.jsoup.nodes.Node) comment6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#comment" + "'", str18, "#comment");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = comment2.before("");
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
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        boolean boolean7 = comment2.hasAttr("");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = node9.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node9.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        java.lang.String str8 = comment2.toString();
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        org.jsoup.nodes.Node node10 = comment2.shallowClone();
        comment2.setBaseUri("hi!");
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean17 = comment15.hasSameValue((java.lang.Object) 1);
        int int18 = comment15.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = comment15.siblingNodes();
        java.lang.String str21 = comment15.attr("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = comment15.childNodesCopy();
        org.jsoup.nodes.Comment comment25 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean27 = comment25.hasSameValue((java.lang.Object) 1);
        int int28 = comment25.siblingIndex();
        org.jsoup.nodes.Comment comment31 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean33 = comment31.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node34 = comment31.nextSibling();
        boolean boolean35 = comment25.equals((java.lang.Object) comment31);
        org.jsoup.nodes.Node node36 = comment25.root();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = node36.childNodes();
        org.jsoup.nodes.Node node38 = node36.previousSibling();
        boolean boolean39 = comment15.hasSameValue((java.lang.Object) node36);
        java.lang.String str40 = node36.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = node36.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = comment2.after(node36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\n<!--hi!-->" + "'", str40, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList41);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        org.jsoup.nodes.Node node27 = node5.wrap("\n<!--\n<!--#comment-->-->");
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
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.parentNode();
        boolean boolean11 = comment2.hasAttr("\n<!--hi!-->");
        java.lang.String str13 = comment2.absUrl("#comment");
        org.jsoup.nodes.Node node14 = comment2.clone();
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable15, (int) (short) 10, outputSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str3 = comment1.attr("#comment");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration4 = comment1.asXmlDeclaration();
        java.lang.String str5 = xmlDeclaration4.outerHtml();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(xmlDeclaration4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<?i?>" + "'", str5, "<?i?>");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        java.lang.Class<?> wildcardClass31 = node30.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        boolean boolean8 = comment2.hasAttr("#comment");
        org.jsoup.nodes.Node node9 = comment2.parentNode();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean14 = comment12.hasSameValue((java.lang.Object) 1);
        boolean boolean15 = comment12.hasParent();
        java.lang.String str17 = comment12.absUrl("hi!");
        java.lang.String str18 = comment12.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = node9.hasSameValue((java.lang.Object) str18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n<!--hi!-->" + "'", str18, "\n<!--hi!-->");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.lang.String str4 = comment2.getData();
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        org.jsoup.nodes.Node node7 = comment2.clearAttributes();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        java.lang.String str11 = comment10.toString();
        // The following exception was thrown during execution in test generation
        try {
            node7.replaceWith((org.jsoup.nodes.Node) comment10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!---->" + "'", str11, "\n<!---->");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        java.lang.String str5 = comment2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = comment2.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        int int11 = comment2.siblingIndex();
        org.jsoup.nodes.Node node12 = comment2.shallowClone();
        java.lang.String str13 = comment2.baseUri();
        boolean boolean14 = comment2.isXmlDeclaration();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str9 = comment2.attr("");
        org.jsoup.nodes.Node node12 = comment2.attr("\n<!--\n<!---->-->", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node12 = comment2.attr("\n<!--hi!-->", "\n<!---->");
        java.lang.String str13 = comment2.baseUri();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        // The following exception was thrown during execution in test generation
        try {
            node7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(xmlDeclaration13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
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
        org.jsoup.nodes.Document document19 = comment2.ownerDocument();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(document19);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        org.jsoup.nodes.Node node14 = comment2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = comment2.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.childNodes();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean15 = comment13.hasSameValue((java.lang.Object) 1);
        boolean boolean16 = comment13.hasParent();
        java.lang.String str18 = comment13.absUrl("hi!");
        org.jsoup.nodes.Node node19 = comment13.parentNode();
        org.jsoup.nodes.Node node20 = comment13.clearAttributes();
        java.lang.Class<?> wildcardClass21 = comment13.getClass();
        boolean boolean22 = comment2.hasSameValue((java.lang.Object) wildcardClass21);
        org.jsoup.nodes.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = comment2.after(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        comment2.setBaseUri("hi!");
        int int12 = comment2.childNodeSize();
        org.jsoup.nodes.Node node13 = comment2.clone();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        org.jsoup.nodes.Comment comment42 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean44 = comment42.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node45 = comment42.nextSibling();
        java.lang.Appendable appendable46 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = null;
        comment42.outerHtmlTail(appendable46, (int) (short) -1, outputSettings48);
        java.lang.String str51 = comment42.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node53 = comment42.wrap("\n<!--hi!-->");
        org.jsoup.nodes.Node node56 = comment42.attr("hi!", "\n<!---->");
        org.jsoup.nodes.Comment comment59 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str61 = comment59.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList62 = comment59.childNodesCopy();
        boolean boolean63 = comment59.isXmlDeclaration();
        int int64 = comment59.childNodeSize();
        java.lang.Appendable appendable65 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = null;
        comment59.outerHtmlTail(appendable65, (int) ' ', outputSettings67);
        java.lang.String str70 = comment59.absUrl("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList71 = comment59.childNodes();
        org.jsoup.nodes.Node node74 = comment59.attr("\n<!--hi!-->", "\n<!---->");
        int int75 = comment59.childNodeSize();
        boolean boolean76 = comment42.equals((java.lang.Object) comment59);
        java.lang.String str77 = comment42.getData();
        // The following exception was thrown during execution in test generation
        try {
            node9.replaceWith((org.jsoup.nodes.Node) comment42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(nodeList71);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
        java.lang.Appendable appendable34 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = null;
        comment2.outerHtmlTail(appendable34, (int) (short) -1, outputSettings36);
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
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
        java.lang.String str19 = comment2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = comment2.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
        org.jsoup.select.NodeVisitor nodeVisitor20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = comment2.traverse(nodeVisitor20);
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
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "#comment");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.junit.Assert.assertNotNull(xmlDeclaration3);
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        // The following exception was thrown during execution in test generation
        try {
            comment6.remove();
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
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        java.lang.String str13 = comment2.nodeName();
        java.lang.String str14 = comment2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment2.after("\n<!--hi!-->");
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
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.siblingNodes();
        java.lang.String str7 = comment2.absUrl("\n<!--hi!-->");
        comment2.setBaseUri("\n<!--\n<!---->-->");
        java.lang.Class<?> wildcardClass10 = comment2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
            org.jsoup.nodes.Node node38 = node15.before("\n<!--hi!-->");
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
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean23 = comment21.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node24 = comment21.nextSibling();
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        comment21.outerHtmlTail(appendable25, (int) (short) -1, outputSettings27);
        java.lang.String str30 = comment21.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node32 = comment21.wrap("\n<!--hi!-->");
        org.jsoup.nodes.Node node35 = comment21.attr("hi!", "\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = node35.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            comment12.replaceWith(node35);
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
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeList36);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        java.lang.String str8 = comment2.toString();
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment2.asXmlDeclaration();
        java.lang.String str12 = comment2.attr("");
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean17 = comment15.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node18 = comment15.nextSibling();
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        comment15.outerHtmlTail(appendable19, (int) (short) -1, outputSettings21);
        java.lang.String str23 = comment15.nodeName();
        int int24 = comment15.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = comment2.after((org.jsoup.nodes.Node) comment15);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#comment" + "'", str23, "#comment");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean24 = comment22.hasSameValue((java.lang.Object) 1);
        boolean boolean25 = comment22.hasParent();
        boolean boolean27 = comment22.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean28 = comment22.isXmlDeclaration();
        boolean boolean29 = comment22.hasParent();
        org.jsoup.nodes.Node node31 = comment22.removeAttr("\n<!---->");
        boolean boolean32 = comment22.hasParent();
        int int33 = comment22.childNodeSize();
        org.jsoup.nodes.Node node36 = comment22.attr("\n<!--\n<!---->-->", "");
        org.jsoup.nodes.Comment comment39 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList40 = comment39.childNodes();
        java.lang.String str42 = comment39.attr("hi!");
        java.lang.String str43 = comment39.baseUri();
        boolean boolean44 = comment22.equals((java.lang.Object) str43);
        java.util.List<org.jsoup.nodes.Node> nodeList45 = comment22.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node46 = node19.after((org.jsoup.nodes.Node) comment22);
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
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(nodeList45);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.root();
        java.lang.String str4 = comment1.attr("\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
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
        org.jsoup.nodes.Node node22 = comment2.attr("#comment", "\n<!--#comment-->");
        org.jsoup.select.NodeFilter nodeFilter23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = comment2.filter(nodeFilter23);
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
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Document document6 = xmlDeclaration5.ownerDocument();
        java.lang.Class<?> wildcardClass7 = xmlDeclaration5.getClass();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        org.jsoup.nodes.Node node25 = comment24.clone();
        org.jsoup.nodes.Comment comment28 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean30 = comment28.hasSameValue((java.lang.Object) 1);
        boolean boolean31 = comment28.hasParent();
        java.lang.String str33 = comment28.absUrl("hi!");
        org.jsoup.nodes.Node node35 = comment28.removeAttr("");
        comment28.setBaseUri("hi!");
        int int38 = comment28.childNodeSize();
        org.jsoup.nodes.Node node39 = comment28.clone();
        boolean boolean40 = node25.equals((java.lang.Object) node39);
        java.util.List<org.jsoup.nodes.Node> nodeList41 = node25.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = node20.hasSameValue((java.lang.Object) nodeList41);
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
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(nodeList41);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        org.jsoup.nodes.Node node8 = node7.parentNode();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean13 = comment11.hasSameValue((java.lang.Object) 1);
        boolean boolean14 = comment11.hasParent();
        boolean boolean16 = comment11.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean17 = comment11.isXmlDeclaration();
        boolean boolean18 = comment11.hasParent();
        org.jsoup.nodes.Node node20 = comment11.removeAttr("\n<!---->");
        boolean boolean21 = comment11.hasParent();
        java.lang.String str22 = comment11.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node7.after((org.jsoup.nodes.Node) comment11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#comment" + "'", str22, "#comment");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        org.jsoup.select.NodeFilter nodeFilter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment2.filter(nodeFilter7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = comment16.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment12.outerHtmlHead(appendable24, (int) (short) 10, outputSettings26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        java.lang.String str23 = comment2.baseUri();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--\n<!---->-->");
        org.jsoup.nodes.Attributes attributes2 = comment1.attributes();
        org.junit.Assert.assertNotNull(attributes2);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        java.lang.String str5 = comment2.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration6 = comment2.asXmlDeclaration();
        java.lang.String str7 = comment2.nodeName();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
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
        java.lang.String str20 = comment2.attr("\n<!--\n<!--#comment-->-->");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration6 = comment2.asXmlDeclaration();
        java.lang.String str7 = comment2.getData();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(xmlDeclaration6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        java.util.List<org.jsoup.nodes.Node> nodeList18 = comment2.childNodes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node5.before("\n<!--\n<!--#comment-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
        org.jsoup.nodes.Node node28 = comment2.shallowClone();
        int int29 = comment2.siblingIndex();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean15 = comment13.hasSameValue((java.lang.Object) 1);
        int int16 = comment13.siblingIndex();
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean21 = comment19.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node22 = comment19.nextSibling();
        boolean boolean23 = comment13.equals((java.lang.Object) comment19);
        org.jsoup.nodes.Node node24 = comment13.root();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = node24.childNodes();
        org.jsoup.nodes.Node node26 = node24.clearAttributes();
        org.jsoup.nodes.Node node27 = node26.root();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
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
        java.lang.Class<?> wildcardClass20 = node19.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        java.lang.String str5 = comment2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = comment2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        comment2.setBaseUri("hi!");
        int int9 = comment2.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.before("\n<!--#comment-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        java.lang.String str12 = comment2.getData();
        java.lang.String str14 = comment2.absUrl("\n<!--hi!-->");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable15, (int) (short) 1, outputSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        comment2.setBaseUri("\n<!--hi!-->");
        org.jsoup.nodes.Node node14 = comment2.attr("", "#comment");
        org.jsoup.nodes.Node node15 = node14.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = node15.hasParent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        boolean boolean5 = comment2.hasSameValue((java.lang.Object) (byte) 10);
        org.jsoup.nodes.Node node6 = comment2.previousSibling();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("");
        java.lang.String str10 = comment2.absUrl("hi!");
        boolean boolean12 = comment2.hasAttr("\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("<?i?>");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        org.jsoup.nodes.Node node10 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node10.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        boolean boolean4 = comment2.isXmlDeclaration();
        java.lang.String str5 = comment2.nodeName();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment2.before((org.jsoup.nodes.Node) comment7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        java.lang.String str5 = comment2.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration6 = comment2.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration6);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean7 = comment2.hasAttr("hi!");
        int int8 = comment2.childNodeSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "#comment");
        boolean boolean3 = comment2.isXmlDeclaration();
        comment2.setBaseUri("\n<!--#comment-->");
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str9 = comment8.getData();
        org.jsoup.nodes.Document document10 = comment8.ownerDocument();
        org.jsoup.nodes.Node node13 = comment8.attr("", "");
        java.lang.String str14 = comment8.getData();
        int int15 = comment8.siblingIndex();
        java.lang.String str17 = comment8.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = comment8.siblingNodes();
        org.jsoup.nodes.Node node20 = comment8.removeAttr("hi!");
        java.lang.String str21 = comment8.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = comment2.before((org.jsoup.nodes.Node) comment8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n<!--hi!-->" + "'", str21, "\n<!--hi!-->");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean3 = comment2.isXmlDeclaration();
        boolean boolean4 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node6 = comment2.removeAttr("");
        org.jsoup.nodes.Node node7 = comment2.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment2.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        boolean boolean2 = comment1.isXmlDeclaration();
        java.lang.String str3 = comment1.nodeName();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean8 = comment6.hasSameValue((java.lang.Object) 1);
        boolean boolean9 = comment6.hasParent();
        boolean boolean11 = comment6.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean12 = comment6.isXmlDeclaration();
        boolean boolean13 = comment6.hasParent();
        org.jsoup.nodes.Node node15 = comment6.removeAttr("\n<!---->");
        boolean boolean16 = comment6.hasParent();
        int int17 = comment6.childNodeSize();
        comment6.setBaseUri("");
        boolean boolean20 = comment1.hasSameValue((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
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
        java.lang.Class<?> wildcardClass29 = node23.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        java.lang.String str8 = comment2.toString();
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Attributes attributes12 = comment2.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("\n<!---->", "\n<!---->");
        java.lang.String str17 = comment16.outerHtml();
        boolean boolean18 = comment16.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration13.replaceWith((org.jsoup.nodes.Node) comment16);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--\n<!---->-->" + "'", str17, "\n<!--\n<!---->-->");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable17, (int) '#', outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        java.lang.String str8 = comment2.absUrl("\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
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
        org.jsoup.nodes.Comment comment28 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node29 = comment28.previousSibling();
        int int30 = comment28.siblingIndex();
        org.jsoup.nodes.Node node33 = comment28.attr("\n<!--hi!-->", "\n<!---->");
        org.jsoup.nodes.Node node34 = node33.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = comment10.before(node33);
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
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = comment2.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#comment" + "'", str17, "#comment");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
        org.jsoup.nodes.Node node28 = node23.root();
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
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        org.jsoup.nodes.Document document9 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = document9.hasParent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        boolean boolean20 = comment2.hasAttr("#comment");
        org.jsoup.nodes.Attributes attributes21 = comment2.attributes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributes21);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("\n<!--\n<!---->-->");
        java.lang.String str17 = comment16.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment2.before((org.jsoup.nodes.Node) comment16);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--\n<!---->-->" + "'", str17, "\n<!--\n<!---->-->");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        java.lang.String str23 = comment2.baseUri();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        int int6 = comment2.childNodeSize();
        org.jsoup.nodes.Node node9 = comment2.attr("\n<!---->", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node9.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        java.lang.String str7 = comment2.getData();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment2.siblingNodes();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean13 = comment11.hasSameValue((java.lang.Object) 1);
        boolean boolean14 = comment11.hasParent();
        boolean boolean16 = comment11.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean17 = comment11.isXmlDeclaration();
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        comment11.outerHtmlTail(appendable18, (int) (short) -1, outputSettings20);
        java.lang.String str22 = comment11.baseUri();
        org.jsoup.nodes.Node node23 = comment11.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = node23.childNodesCopy();
        boolean boolean25 = comment2.equals((java.lang.Object) node23);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = comment2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        java.lang.String str6 = comment2.getData();
        org.jsoup.nodes.Node node7 = comment2.root();
        comment2.setBaseUri("<?i?>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
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
        java.util.List<org.jsoup.nodes.Node> nodeList19 = comment2.childNodesCopy();
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
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
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
        org.jsoup.nodes.Node node28 = comment2.shallowClone();
        int int29 = node28.siblingIndex();
        org.jsoup.select.NodeVisitor nodeVisitor30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = node28.traverse(nodeVisitor30);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "\n<!---->");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (int) '#', outputSettings5);
        org.jsoup.nodes.Node node7 = comment2.shallowClone();
        org.jsoup.nodes.Node node8 = comment2.nextSibling();
        org.jsoup.nodes.Node node9 = comment2.previousSibling();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str8 = comment2.attr("#comment");
        java.lang.String str9 = comment2.getData();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean14 = comment12.hasSameValue((java.lang.Object) 1);
        boolean boolean15 = comment12.hasParent();
        java.lang.String str17 = comment12.absUrl("hi!");
        org.jsoup.nodes.Node node19 = comment12.removeAttr("");
        org.jsoup.nodes.Node node20 = comment12.previousSibling();
        boolean boolean21 = comment2.hasSameValue((java.lang.Object) node20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        java.lang.String str12 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node13 = comment2.parent();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node17 = comment16.root();
        boolean boolean18 = comment16.isXmlDeclaration();
        java.lang.String str19 = comment16.nodeName();
        java.lang.String str20 = comment16.nodeName();
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean25 = comment23.hasSameValue((java.lang.Object) 1);
        boolean boolean26 = comment23.hasParent();
        boolean boolean28 = comment23.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean29 = comment23.isXmlDeclaration();
        boolean boolean30 = comment23.hasParent();
        org.jsoup.nodes.Node node32 = comment23.removeAttr("\n<!---->");
        boolean boolean33 = comment16.equals((java.lang.Object) node32);
        java.lang.String str34 = comment16.toString();
        // The following exception was thrown during execution in test generation
        try {
            node13.replaceWith((org.jsoup.nodes.Node) comment16);
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
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#comment" + "'", str19, "#comment");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#comment" + "'", str20, "#comment");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\n<!--hi!-->" + "'", str34, "\n<!--hi!-->");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
        org.jsoup.nodes.Comment comment41 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean43 = comment41.hasSameValue((java.lang.Object) 1);
        boolean boolean44 = comment41.hasParent();
        org.jsoup.nodes.Document document45 = comment41.ownerDocument();
        boolean boolean47 = comment41.hasAttr("#comment");
        boolean boolean48 = comment41.hasParent();
        org.jsoup.nodes.Document document49 = comment41.ownerDocument();
        org.jsoup.nodes.Node node50 = comment41.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node51 = node22.before(node50);
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(document45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(document49);
        org.junit.Assert.assertNotNull(node50);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--hi!-->", "\n<!--\n<!---->-->");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("#comment", "");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = document3.equals((java.lang.Object) comment6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        int int22 = comment2.siblingIndex();
        org.jsoup.nodes.Node node24 = comment2.removeAttr("");
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable25, (int) (short) 1, outputSettings27);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration6 = comment2.asXmlDeclaration();
        boolean boolean7 = comment2.isXmlDeclaration();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(xmlDeclaration6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        org.jsoup.nodes.Document document9 = comment2.ownerDocument();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment2.outerHtmlTail(appendable10, 100, outputSettings12);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        java.lang.String str6 = comment2.getData();
        java.lang.String str7 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        org.jsoup.nodes.Node node10 = comment2.removeAttr("\n<!--\n<!---->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.childNodesCopy();
        org.jsoup.nodes.Node node12 = node10.clearAttributes();
        org.jsoup.select.NodeFilter nodeFilter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node10.filter(nodeFilter13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--hi!-->", "");
        java.lang.String str3 = comment2.baseUri();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = comment2.asXmlDeclaration();
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
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        java.lang.String str11 = comment2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.siblingNodes();
        org.jsoup.nodes.Node node14 = comment2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node14.siblingNodes();
        org.jsoup.nodes.Node node16 = node14.parentNode();
        org.jsoup.nodes.Node node17 = node14.previousSibling();
        org.jsoup.select.NodeFilter nodeFilter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node17.filter(nodeFilter18);
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
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("");
        int int2 = comment1.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = comment1.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Node node11 = comment2.wrap("\n<!--hi!-->");
        boolean boolean13 = comment2.hasAttr("\n<!---->");
        java.lang.String str15 = comment2.attr("hi!");
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean20 = comment18.hasSameValue((java.lang.Object) 1);
        boolean boolean21 = comment18.hasParent();
        org.jsoup.nodes.Node node22 = comment18.parentNode();
        org.jsoup.nodes.Node node23 = comment18.parent();
        org.jsoup.nodes.Node node24 = comment18.clearAttributes();
        boolean boolean25 = comment2.hasSameValue((java.lang.Object) node24);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        int int7 = comment2.childNodeSize();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment2.outerHtmlTail(appendable8, (int) ' ', outputSettings10);
        java.lang.String str13 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.Node node14 = comment2.root();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node13 = comment2.wrap("\n<!--hi!-->");
        org.jsoup.nodes.Node node16 = comment2.attr("\n<!--hi!-->", "\n<!--\n<!---->-->");
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = comment15.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        java.lang.String str11 = comment2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.siblingNodes();
        org.jsoup.nodes.Node node15 = comment2.attr("#comment", "");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = comment2.childNodes();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable17, (int) (short) 100, outputSettings19);
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
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        java.lang.String str8 = comment2.getData();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment2.childNodesCopy();
        java.lang.String str10 = comment2.baseUri();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (int) (short) 1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        java.lang.String str9 = comment2.baseUri();
        org.jsoup.nodes.Node node10 = comment2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment2.after("\n<!--\n<!---->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str8 = comment2.attr("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment13.childNodesCopy();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean19 = comment17.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node20 = comment17.nextSibling();
        java.lang.Appendable appendable21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        comment17.outerHtmlTail(appendable21, (int) (short) -1, outputSettings23);
        java.lang.String str25 = comment17.nodeName();
        org.jsoup.nodes.Comment comment27 = new org.jsoup.nodes.Comment("hi!");
        boolean boolean28 = comment17.hasSameValue((java.lang.Object) comment27);
        java.lang.String str29 = comment17.nodeName();
        boolean boolean30 = comment13.hasSameValue((java.lang.Object) comment17);
        java.lang.String str31 = comment17.baseUri();
        org.jsoup.nodes.Node node32 = comment17.clearAttributes();
        org.jsoup.nodes.Comment comment35 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str37 = comment35.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = comment35.childNodesCopy();
        org.jsoup.nodes.Node node41 = comment35.attr("#comment", "");
        boolean boolean42 = comment35.hasParent();
        org.jsoup.nodes.Node node43 = comment35.parentNode();
        boolean boolean44 = comment17.hasSameValue((java.lang.Object) comment35);
        org.jsoup.nodes.Node node47 = comment35.attr("\n<!--hi!-->", "\n<!--\n<!--#comment-->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node48 = node10.before((org.jsoup.nodes.Node) comment35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#comment" + "'", str25, "#comment");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#comment" + "'", str29, "#comment");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(node47);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node13 = comment2.root();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean18 = comment16.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node19 = comment16.nextSibling();
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        comment16.outerHtmlTail(appendable20, (int) (short) -1, outputSettings22);
        boolean boolean25 = comment16.hasAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node26 = comment16.root();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment16);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        java.lang.String str11 = comment2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.siblingNodes();
        int int13 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node17 = comment16.root();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = comment16.childNodesCopy();
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        comment16.outerHtmlTail(appendable19, (int) (short) 1, outputSettings21);
        java.util.List<org.jsoup.nodes.Node> nodeList23 = comment16.childNodesCopy();
        org.jsoup.nodes.Node node24 = comment16.clone();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith(node24);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node6 = comment2.removeAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node6.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = node8.wrap("\n<!--\n<!---->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node10.parent();
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
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.root();
        org.jsoup.nodes.Node node9 = node8.clearAttributes();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("#comment", "");
        boolean boolean13 = comment12.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            node9.replaceWith((org.jsoup.nodes.Node) comment12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        int int17 = comment2.childNodeSize();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Document document8 = comment2.ownerDocument();
        org.jsoup.select.NodeFilter nodeFilter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = document8.filter(nodeFilter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.toString();
        boolean boolean8 = comment2.isXmlDeclaration();
        boolean boolean10 = comment2.hasAttr("\n<!--\n<!---->-->");
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean15 = comment13.hasSameValue((java.lang.Object) 1);
        boolean boolean16 = comment13.hasParent();
        java.lang.String str18 = comment13.absUrl("hi!");
        org.jsoup.nodes.Node node20 = comment13.removeAttr("");
        org.jsoup.nodes.Node node21 = comment13.previousSibling();
        int int22 = comment13.siblingIndex();
        org.jsoup.nodes.Node node23 = comment13.shallowClone();
        org.jsoup.nodes.Node node24 = node23.clone();
        org.jsoup.nodes.Document document25 = node24.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = comment2.before((org.jsoup.nodes.Node) document25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(document25);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        org.jsoup.nodes.Node node7 = comment2.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = node7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!--hi!-->");
        java.lang.String str6 = comment2.attr("hi!");
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        java.lang.String str9 = comment2.baseUri();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
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
        org.jsoup.select.NodeVisitor nodeVisitor40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node41 = comment22.traverse(nodeVisitor40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
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
        boolean boolean37 = comment19.hasParent();
        java.lang.Appendable appendable38 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment19.outerHtmlHead(appendable38, (int) (byte) 1, outputSettings40);
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
        org.jsoup.nodes.Node node9 = node8.root();
        // The following exception was thrown during execution in test generation
        try {
            node8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = document23.wrap("");
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
        org.junit.Assert.assertNull(document23);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!---->", "\n<!---->");
        org.jsoup.nodes.Node node3 = comment2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = node3.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = comment10.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean3 = comment2.isXmlDeclaration();
        boolean boolean4 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node6 = comment2.removeAttr("");
        org.jsoup.nodes.Node node7 = comment2.clearAttributes();
        int int8 = node7.siblingIndex();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
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
        comment2.setBaseUri("#comment");
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
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        org.jsoup.nodes.Node node20 = comment2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = comment2.childNodes();
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
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        org.jsoup.nodes.Node node38 = comment2.root();
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
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
        boolean boolean32 = comment2.isXmlDeclaration();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Node node4 = comment2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.siblingNodes();
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = comment2.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.after("hi!");
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
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        org.jsoup.nodes.Node node5 = node4.clone();
        org.jsoup.nodes.Node node6 = node4.shallowClone();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str11 = comment9.absUrl("hi!");
        java.lang.String str12 = comment9.nodeName();
        boolean boolean13 = node4.hasSameValue((java.lang.Object) str12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node4.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#comment" + "'", str12, "#comment");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.attr("hi!", "");
        boolean boolean9 = node8.hasParent();
        org.jsoup.nodes.Node node10 = node8.parentNode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        org.jsoup.nodes.Node node12 = comment2.attr("hi!", "\n<!--hi!-->");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment2.childNodes();
        org.jsoup.nodes.Node node14 = comment2.shallowClone();
        org.jsoup.select.NodeFilter nodeFilter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.filter(nodeFilter15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        java.lang.String str4 = comment2.baseUri();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str8 = comment7.getData();
        org.jsoup.nodes.Document document9 = comment7.ownerDocument();
        org.jsoup.nodes.Node node12 = comment7.attr("", "");
        java.lang.String str13 = comment7.getData();
        int int14 = comment7.siblingIndex();
        boolean boolean16 = comment7.hasAttr("#comment");
        java.lang.String str17 = comment7.getData();
        boolean boolean19 = comment7.hasAttr("");
        boolean boolean20 = comment7.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = comment2.after((org.jsoup.nodes.Node) comment7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        org.jsoup.nodes.Node node5 = comment2.wrap("<?i?>");
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node5.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        org.jsoup.nodes.Document document9 = comment2.ownerDocument();
        org.jsoup.nodes.Document document10 = comment2.ownerDocument();
        boolean boolean11 = comment2.hasParent();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment2.after("\n<!--hi!-->");
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
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
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
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment18.outerHtmlHead(appendable24, (int) (short) 100, outputSettings26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        comment2.setBaseUri("hi!");
        int int12 = comment2.childNodeSize();
        org.jsoup.nodes.Node node13 = comment2.clone();
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
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        comment2.setBaseUri("hi!");
        int int12 = comment2.childNodeSize();
        org.jsoup.nodes.Node node13 = comment2.clone();
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.traverse(nodeVisitor14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        org.jsoup.nodes.Node node20 = comment2.parentNode();
        org.jsoup.nodes.Node node22 = comment2.removeAttr("\n<!--\n<!---->-->");
        org.jsoup.nodes.Document document23 = node22.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node22.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(document23);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        java.lang.Class<?> wildcardClass32 = nodeList31.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
        org.jsoup.nodes.Node node26 = node22.clearAttributes();
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
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.root();
        org.jsoup.nodes.Node node3 = comment1.clone();
        org.jsoup.nodes.Node node4 = comment1.root();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node13 = comment2.root();
        boolean boolean14 = comment2.isXmlDeclaration();
        org.jsoup.select.NodeFilter nodeFilter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment2.filter(nodeFilter15);
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
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
        java.util.List<org.jsoup.nodes.Node> nodeList26 = node25.childNodesCopy();
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
        org.junit.Assert.assertNotNull(nodeList26);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        comment2.setBaseUri("\n<!---->");
        int int8 = comment2.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable9, (-1), outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.lang.String str5 = comment2.nodeName();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node6.childNodesCopy();
        boolean boolean8 = node6.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node6.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
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
            boolean boolean29 = node28.hasParent();
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
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = comment2.unwrap();
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
        org.junit.Assert.assertNotNull(attributes21);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.clone();
        boolean boolean10 = comment2.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        org.jsoup.nodes.Node node13 = comment2.clone();
        org.jsoup.nodes.Node node14 = node13.root();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node20 = comment17.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = comment17.childNodes();
        boolean boolean23 = comment17.hasSameValue((java.lang.Object) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            node14.replaceWith((org.jsoup.nodes.Node) comment17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        java.lang.String str7 = comment2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment2.childNodesCopy();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable9, (-1), outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        org.jsoup.nodes.Document document7 = comment2.ownerDocument();
        org.jsoup.nodes.Attributes attributes8 = comment2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment2.clearAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        comment8.outerHtmlTail(appendable16, (int) (short) 10, outputSettings18);
        java.util.List<org.jsoup.nodes.Node> nodeList20 = comment8.siblingNodes();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        boolean boolean10 = comment2.hasParent();
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        java.lang.String str12 = comment2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
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
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str24 = comment22.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = comment22.childNodesCopy();
        boolean boolean26 = comment22.isXmlDeclaration();
        int int27 = comment22.childNodeSize();
        java.lang.Appendable appendable28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        comment22.outerHtmlTail(appendable28, (int) ' ', outputSettings30);
        java.lang.String str33 = comment22.absUrl("\n<!---->");
        java.lang.String str35 = comment22.absUrl("\n<!---->");
        java.lang.String str36 = comment22.getData();
        java.lang.String str38 = comment22.absUrl("#comment");
        boolean boolean39 = comment22.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(xmlDeclaration13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("");
        java.lang.String str9 = comment2.getData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str20 = comment19.getData();
        org.jsoup.nodes.Document document21 = comment19.ownerDocument();
        org.jsoup.nodes.Node node24 = comment19.attr("", "");
        java.lang.String str25 = comment19.getData();
        int int26 = comment19.siblingIndex();
        java.lang.String str28 = comment19.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = comment19.siblingNodes();
        org.jsoup.nodes.Node node31 = comment19.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList32 = node31.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            comment8.replaceWith(node31);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(nodeList32);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
            comment2.remove();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean7 = comment2.hasAttr("");
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean12 = comment10.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node13 = comment10.nextSibling();
        org.jsoup.nodes.Node node14 = comment10.shallowClone();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node17 = comment16.parentNode();
        org.jsoup.nodes.Node node18 = comment16.clone();
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        java.lang.Class<?> wildcardClass21 = comment20.getClass();
        boolean boolean22 = node18.equals((java.lang.Object) wildcardClass21);
        boolean boolean23 = node14.hasSameValue((java.lang.Object) wildcardClass21);
        boolean boolean24 = node14.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = comment2.before(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node2 = comment1.previousSibling();
        int int3 = comment1.siblingIndex();
        org.jsoup.nodes.Node node6 = comment1.attr("\n<!--hi!-->", "\n<!---->");
        java.lang.Class<?> wildcardClass7 = node6.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        org.jsoup.nodes.Node node5 = comment2.shallowClone();
        org.jsoup.nodes.Node node7 = comment2.removeAttr("");
        java.lang.Object obj8 = null;
        boolean boolean9 = node7.equals(obj8);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!---->", "\n<!---->");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean9 = comment7.hasSameValue((java.lang.Object) 1);
        int int10 = comment7.siblingIndex();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean15 = comment13.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node16 = comment13.nextSibling();
        boolean boolean17 = comment7.equals((java.lang.Object) comment13);
        org.jsoup.nodes.Node node18 = comment7.root();
        boolean boolean19 = comment7.isXmlDeclaration();
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean24 = comment22.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node25 = comment22.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = comment22.siblingNodes();
        java.lang.Class<?> wildcardClass27 = comment22.getClass();
        boolean boolean28 = comment7.hasSameValue((java.lang.Object) wildcardClass27);
        java.util.List<org.jsoup.nodes.Node> nodeList29 = comment7.siblingNodes();
        boolean boolean31 = comment7.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node4 = comment2.wrap("\n<!--hi!-->");
        boolean boolean5 = comment2.isXmlDeclaration();
        comment2.setBaseUri("\n<!--\n<!---->-->");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment2.outerHtmlTail(appendable8, 100, outputSettings10);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node12.wrap("hi!");
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
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        java.lang.String str4 = comment2.baseUri();
        org.jsoup.nodes.Node node5 = comment2.root();
        java.lang.String str6 = comment2.getData();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node12 = comment9.attr("", "");
        org.jsoup.nodes.Node node15 = comment9.attr("#comment", "#comment");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment2.before(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean3 = comment2.isXmlDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration4 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment2.parent();
        org.jsoup.nodes.Node node7 = comment2.removeAttr("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.String str4 = comment2.outerHtml();
        org.jsoup.nodes.Node node5 = comment2.previousSibling();
        comment2.setBaseUri("hi!");
        java.lang.String str8 = comment2.outerHtml();
        boolean boolean9 = comment2.hasParent();
        java.lang.Class<?> wildcardClass10 = comment2.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
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
        boolean boolean17 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = comment20.childNodes();
        org.jsoup.nodes.Node node22 = comment20.clone();
        org.jsoup.nodes.Node node23 = comment20.shallowClone();
        org.jsoup.nodes.Node node24 = node23.root();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = node23.childNodesCopy();
        org.jsoup.nodes.Comment comment28 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean30 = comment28.hasSameValue((java.lang.Object) 1);
        boolean boolean31 = comment28.hasParent();
        org.jsoup.nodes.Node node34 = comment28.attr("", "hi!");
        java.lang.String str36 = comment28.attr("");
        org.jsoup.nodes.Document document37 = comment28.ownerDocument();
        org.jsoup.nodes.Node node39 = comment28.removeAttr("#comment");
        java.lang.String str40 = comment28.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = comment28.childNodesCopy();
        boolean boolean42 = comment28.isXmlDeclaration();
        boolean boolean43 = node23.equals((java.lang.Object) comment28);
        org.jsoup.nodes.Node node45 = comment28.removeAttr("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith(node45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNull(document37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "#comment" + "'", str40, "#comment");
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node45);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
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
        org.jsoup.nodes.Comment comment24 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean26 = comment24.hasSameValue((java.lang.Object) 1);
        int int27 = comment24.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = comment24.siblingNodes();
        java.lang.String str29 = comment24.outerHtml();
        org.jsoup.nodes.Node node30 = comment24.root();
        org.jsoup.nodes.Node node31 = comment24.root();
        org.jsoup.nodes.Node node32 = node31.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = comment6.before(node32);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\n<!--hi!-->" + "'", str29, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str8 = comment2.attr("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment2.childNodesCopy();
        int int10 = comment2.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment2.before("\n<!--\n<!---->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = comment2.before(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        int int3 = comment2.childNodeSize();
        org.jsoup.nodes.Node node4 = comment2.previousSibling();
        java.lang.String str6 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node7 = comment2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node7.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
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
        comment2.setBaseUri("");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (int) (short) 1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        java.lang.String str9 = comment2.baseUri();
        org.jsoup.nodes.Node node10 = comment2.clone();
        org.jsoup.nodes.Node node11 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node11.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        org.jsoup.nodes.Node node7 = comment2.root();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str11 = comment10.getData();
        boolean boolean12 = comment2.equals((java.lang.Object) str11);
        java.lang.String str14 = comment2.absUrl("\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.root();
        java.lang.String str6 = comment2.baseUri();
        boolean boolean7 = comment2.hasParent();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.root();
        org.jsoup.nodes.Node node9 = node8.previousSibling();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean14 = comment12.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node15 = comment12.nextSibling();
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        comment12.outerHtmlTail(appendable16, (int) (short) -1, outputSettings18);
        java.lang.String str20 = comment12.nodeName();
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!");
        boolean boolean23 = comment12.hasSameValue((java.lang.Object) comment22);
        java.lang.String str24 = comment12.nodeName();
        boolean boolean25 = comment12.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node8.before((org.jsoup.nodes.Node) comment12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#comment" + "'", str20, "#comment");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#comment" + "'", str24, "#comment");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str8 = comment2.attr("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        org.jsoup.nodes.Attributes attributes11 = comment2.attributes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
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
            org.jsoup.nodes.Node node16 = comment2.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.lang.String str5 = comment2.nodeName();
        boolean boolean6 = comment2.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
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
        java.util.List<org.jsoup.nodes.Node> nodeList20 = comment16.childNodes();
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
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
        org.jsoup.select.NodeFilter nodeFilter20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = comment7.filter(nodeFilter20);
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
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable25, (int) 'a', outputSettings27);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
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
        org.jsoup.nodes.Node node21 = comment2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document22 = node21.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        java.util.List<org.jsoup.nodes.Node> nodeList19 = comment2.siblingNodes();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        int int6 = comment2.childNodeSize();
        org.jsoup.nodes.Node node9 = comment2.attr("\n<!---->", "hi!");
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean14 = comment12.hasSameValue((java.lang.Object) 1);
        int int15 = comment12.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = comment12.siblingNodes();
        java.lang.String str17 = comment12.outerHtml();
        org.jsoup.nodes.Node node18 = comment12.root();
        org.jsoup.nodes.Node node19 = comment12.nextSibling();
        org.jsoup.nodes.Node node22 = comment12.attr("\n<!---->", "");
        boolean boolean24 = comment12.hasAttr("#comment");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = comment2.after((org.jsoup.nodes.Node) comment12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
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
        org.jsoup.nodes.Comment comment24 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str26 = comment24.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = comment24.childNodesCopy();
        org.jsoup.nodes.Node node30 = comment24.attr("#comment", "");
        org.jsoup.nodes.Node node31 = node30.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = comment2.before(node30);
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
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#comment" + "'", str19, "#comment");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        java.lang.String str7 = comment2.outerHtml();
        int int8 = comment2.siblingIndex();
        java.lang.String str9 = comment2.getData();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        java.util.List<org.jsoup.nodes.Node> nodeList29 = node28.childNodesCopy();
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
        org.junit.Assert.assertNotNull(nodeList29);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
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
        java.lang.String str27 = comment2.nodeName();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#comment" + "'", str27, "#comment");
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        comment2.setBaseUri("\n<!---->");
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        boolean boolean11 = node8.equals((java.lang.Object) comment10);
        org.jsoup.nodes.Node node12 = node8.nextSibling();
        org.jsoup.select.NodeFilter nodeFilter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.filter(nodeFilter13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
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
        java.lang.String str21 = comment2.absUrl("\n<!--#comment-->");
        boolean boolean22 = comment2.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = comment2.unwrap();
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
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node23.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        comment2.outerHtmlTail(appendable5, (int) (short) 1, outputSettings7);
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment2.childNodesCopy();
        java.lang.Class<?> wildcardClass10 = comment2.getClass();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node2 = comment1.parentNode();
        java.lang.String str3 = comment1.nodeName();
        org.jsoup.nodes.Node node4 = comment1.shallowClone();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean9 = comment7.hasAttr("hi!");
        org.jsoup.nodes.Node node10 = comment7.parentNode();
        int int11 = comment7.siblingIndex();
        org.jsoup.nodes.Node node13 = comment7.removeAttr("#comment");
        org.jsoup.nodes.Node node14 = comment7.root();
        org.jsoup.nodes.Node node16 = comment7.wrap("\n<!--hi!-->");
        boolean boolean18 = comment7.hasAttr("\n<!---->");
        boolean boolean19 = node4.hasSameValue((java.lang.Object) comment7);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.root();
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        org.jsoup.nodes.Node node12 = comment2.attr("\n<!---->", "");
        org.jsoup.nodes.Node node13 = comment2.root();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable14, (int) (byte) 1, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node4 = comment2.wrap("\n<!--hi!-->");
        org.jsoup.nodes.Node node7 = comment2.attr("hi!", "");
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment2.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
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
        java.lang.String str23 = comment2.absUrl("\n<!--hi!-->");
        java.lang.String str24 = comment2.baseUri();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        org.jsoup.nodes.Document document7 = node6.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = document7.after("\n<!--\n<!--#comment-->-->");
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
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        boolean boolean19 = comment18.isXmlDeclaration();
        comment18.setBaseUri("\n<!--#comment-->");
        org.jsoup.nodes.Node node22 = comment18.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment18);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        java.lang.String str8 = comment2.toString();
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment2.asXmlDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = comment2.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment2.before("\n<!--hi!-->");
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
        org.junit.Assert.assertNotNull(xmlDeclaration11);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        java.lang.String str4 = comment2.toString();
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--\n<!--#comment-->-->" + "'", str4, "\n<!--\n<!--#comment-->-->");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        boolean boolean8 = comment2.isXmlDeclaration();
        java.lang.String str9 = comment2.toString();
        boolean boolean10 = comment2.hasParent();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node7 = comment2.attr("", "\n<!--\n<!---->-->");
        org.jsoup.nodes.Node node8 = node7.previousSibling();
        org.jsoup.select.NodeFilter nodeFilter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node7.filter(nodeFilter9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
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
        org.jsoup.select.NodeFilter nodeFilter34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = comment2.filter(nodeFilter34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
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
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
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
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment7.outerHtmlHead(appendable22, (int) (short) 1, outputSettings24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = document20.clone();
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
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
        org.jsoup.nodes.Node node9 = node8.root();
        org.jsoup.nodes.Node node10 = node8.parentNode();
        org.jsoup.nodes.Node node11 = node8.shallowClone();
        org.jsoup.nodes.Node node12 = node8.clearAttributes();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Attributes attributes15 = comment14.attributes();
        int int16 = comment14.childNodeSize();
        int int17 = comment14.siblingIndex();
        boolean boolean18 = node12.hasSameValue((java.lang.Object) int17);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
        org.jsoup.nodes.Document document18 = node17.ownerDocument();
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node24 = comment21.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = comment21.childNodes();
        org.jsoup.nodes.Document document26 = comment21.ownerDocument();
        org.jsoup.nodes.Node node29 = comment21.attr("hi!", "#comment");
        boolean boolean30 = node17.hasSameValue((java.lang.Object) "#comment");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = node17.before("#comment");
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
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Node node10 = node9.root();
        org.jsoup.nodes.Node node11 = node9.parentNode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (int) (short) 1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        java.lang.String str9 = comment2.baseUri();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("\n<!---->", "\n<!---->");
        boolean boolean13 = comment2.equals((java.lang.Object) "\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = comment2.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment2.after("\n<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        org.jsoup.nodes.Document document9 = comment2.ownerDocument();
        org.jsoup.nodes.Document document10 = comment2.ownerDocument();
        boolean boolean11 = comment2.hasParent();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.childNodes();
        org.jsoup.nodes.Node node13 = comment2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node13.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
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
        org.jsoup.nodes.Node node39 = comment2.parent();
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
        org.junit.Assert.assertNull(node39);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = comment2.after("<?i?>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
        java.lang.String str15 = comment2.baseUri();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node12 = comment2.parentNode();
        org.jsoup.nodes.Node node13 = comment2.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment2.siblingNodes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        boolean boolean20 = node18.hasSameValue((java.lang.Object) 1.0d);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node2 = comment1.parentNode();
        org.jsoup.nodes.Node node3 = comment1.clone();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (short) 10, outputSettings6);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.childNodesCopy();
        org.jsoup.nodes.Node node10 = node8.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.childNodes();
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
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        comment2.setBaseUri("");
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
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        java.lang.String str22 = comment2.nodeName();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#comment" + "'", str22, "#comment");
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node19.unwrap();
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
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
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
        java.lang.String str19 = comment2.absUrl("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = comment2.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97");
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
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        org.jsoup.select.NodeVisitor nodeVisitor18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node17.traverse(nodeVisitor18);
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
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        java.lang.String str12 = comment2.getData();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
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
        org.jsoup.nodes.Node node16 = comment2.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.before("\n<!--hi!-->");
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
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment2.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
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
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
        org.jsoup.nodes.Node node22 = comment2.parentNode();
        java.lang.Object obj23 = null;
        boolean boolean24 = comment2.hasSameValue(obj23);
        java.lang.String str26 = comment2.absUrl("#comment");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = comment2.clearAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.root();
        org.jsoup.nodes.Node node3 = comment1.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment7.childNodes();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        comment7.outerHtmlTail(appendable9, (int) (short) 1, outputSettings11);
        org.jsoup.nodes.Node node13 = comment7.parentNode();
        java.lang.String str14 = comment7.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment1.after((org.jsoup.nodes.Node) comment7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
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
        java.lang.Appendable appendable21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        comment2.outerHtmlTail(appendable21, 0, outputSettings23);
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
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        org.jsoup.nodes.Node node19 = comment2.shallowClone();
        org.jsoup.nodes.Attributes attributes20 = comment2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = comment2.childNodesCopy();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        int int20 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean25 = comment23.hasSameValue((java.lang.Object) 1);
        boolean boolean26 = comment23.hasParent();
        boolean boolean27 = comment23.isXmlDeclaration();
        int int28 = comment23.childNodeSize();
        org.jsoup.nodes.Node node30 = comment23.removeAttr("");
        boolean boolean31 = comment2.hasSameValue((java.lang.Object) node30);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = comment2.before("\n<!--\n<!--#comment-->-->");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
        org.jsoup.nodes.Document document18 = node17.ownerDocument();
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node24 = comment21.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = comment21.childNodes();
        org.jsoup.nodes.Document document26 = comment21.ownerDocument();
        org.jsoup.nodes.Node node29 = comment21.attr("hi!", "#comment");
        boolean boolean30 = node17.hasSameValue((java.lang.Object) "#comment");
        org.jsoup.nodes.Node node32 = node17.wrap("\n<!---->");
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
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        java.lang.String str5 = comment2.baseUri();
        boolean boolean7 = comment2.hasAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node8 = comment2.root();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.root();
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Node node10 = node9.clearAttributes();
        org.jsoup.nodes.Document document11 = node9.ownerDocument();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.lang.String str4 = comment2.getData();
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        org.jsoup.nodes.Node node7 = comment2.removeAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node7.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
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
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean23 = comment21.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node24 = comment21.nextSibling();
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        comment21.outerHtmlTail(appendable25, (int) (short) -1, outputSettings27);
        java.lang.String str30 = comment21.attr("\n<!--hi!-->");
        java.lang.String str31 = comment21.outerHtml();
        java.lang.String str32 = comment21.toString();
        java.lang.String str34 = comment21.absUrl("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList35 = comment21.childNodesCopy();
        java.lang.String str36 = comment21.nodeName();
        org.jsoup.nodes.Comment comment38 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node39 = comment38.root();
        org.jsoup.nodes.Node node40 = comment38.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = comment38.childNodesCopy();
        boolean boolean42 = comment21.equals((java.lang.Object) comment38);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node43 = comment2.after((org.jsoup.nodes.Node) comment38);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\n<!--hi!-->" + "'", str31, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\n<!--hi!-->" + "'", str32, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#comment" + "'", str36, "#comment");
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node3 = comment2.clearAttributes();
        boolean boolean4 = comment2.hasParent();
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable6, (int) (byte) 10, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        org.jsoup.nodes.Node node9 = comment2.clearAttributes();
        org.jsoup.nodes.Node node10 = node9.clone();
        java.lang.Class<?> wildcardClass11 = node10.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node3 = comment2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment7.childNodes();
        org.jsoup.nodes.Node node9 = comment7.clone();
        org.jsoup.nodes.Node node10 = comment7.shallowClone();
        org.jsoup.nodes.Node node11 = node10.root();
        boolean boolean12 = comment2.equals((java.lang.Object) node11);
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
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
        int int21 = comment2.childNodeSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
        org.jsoup.nodes.Node node32 = xmlDeclaration30.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = xmlDeclaration30.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        int int11 = comment2.siblingIndex();
        org.jsoup.nodes.Attributes attributes12 = comment2.attributes();
        org.jsoup.nodes.Node node13 = comment2.parent();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        comment2.outerHtmlTail(appendable14, (-1), outputSettings16);
        java.lang.String str18 = comment2.baseUri();
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        int int22 = comment21.childNodeSize();
        org.jsoup.nodes.Node node23 = comment21.previousSibling();
        java.lang.String str25 = comment21.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = comment2.before((org.jsoup.nodes.Node) comment21);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "#comment");
        org.jsoup.nodes.Node node11 = comment2.attr("", "");
        int int12 = comment2.childNodeSize();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        boolean boolean9 = comment2.hasParent();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!---->");
        java.lang.Class<?> wildcardClass12 = node11.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = comment2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = comment2.unwrap();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node5 = comment2.previousSibling();
        boolean boolean6 = comment2.isXmlDeclaration();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("\n<!--#comment-->", "\n<!--hi!-->");
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        boolean boolean11 = comment8.hasParent();
        org.jsoup.nodes.Node node14 = comment8.attr("", "hi!");
        java.lang.String str16 = comment8.attr("");
        org.jsoup.nodes.Document document17 = comment8.ownerDocument();
        org.jsoup.nodes.Node node19 = comment8.removeAttr("#comment");
        java.lang.String str20 = comment8.nodeName();
        org.jsoup.nodes.Node node22 = comment8.removeAttr("hi!");
        int int23 = comment8.siblingIndex();
        org.jsoup.nodes.Node node25 = comment8.removeAttr("#comment");
        int int26 = node25.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = comment2.after(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#comment" + "'", str20, "#comment");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        boolean boolean4 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment2.shallowClone();
        org.jsoup.nodes.Node node6 = node5.clearAttributes();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str10 = comment9.getData();
        boolean boolean11 = comment9.isXmlDeclaration();
        org.jsoup.nodes.Node node12 = comment9.shallowClone();
        org.jsoup.nodes.Node node13 = node12.clearAttributes();
        boolean boolean14 = node6.hasSameValue((java.lang.Object) node12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node21 = comment20.root();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = comment20.childNodesCopy();
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        comment20.outerHtmlTail(appendable23, (int) (short) 1, outputSettings25);
        java.util.List<org.jsoup.nodes.Node> nodeList27 = comment20.childNodesCopy();
        boolean boolean28 = node17.hasSameValue((java.lang.Object) comment20);
        java.util.List<org.jsoup.nodes.Node> nodeList29 = comment20.siblingNodes();
        org.jsoup.select.NodeFilter nodeFilter30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = comment20.filter(nodeFilter30);
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
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(nodeList29);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!---->", "#comment");
        org.jsoup.nodes.Node node3 = comment2.shallowClone();
        java.lang.String str4 = comment2.toString();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        comment2.outerHtmlTail(appendable5, (int) (short) 1, outputSettings7);
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean13 = comment11.hasSameValue((java.lang.Object) 1);
        int int14 = comment11.siblingIndex();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean19 = comment17.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node20 = comment17.nextSibling();
        boolean boolean21 = comment11.equals((java.lang.Object) comment17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = comment2.after((org.jsoup.nodes.Node) comment17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--\n<!---->-->" + "'", str4, "\n<!--\n<!---->-->");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        int int7 = comment2.childNodeSize();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment2.outerHtmlTail(appendable8, (int) ' ', outputSettings10);
        java.lang.String str12 = comment2.toString();
        java.lang.String str14 = comment2.attr("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!---->" + "'", str12, "\n<!---->");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
        org.jsoup.nodes.Node node23 = comment2.attr("\n<!---->", "\n<!--hi!-->");
        org.jsoup.nodes.Node node25 = comment2.wrap("\n<!--hi!-->");
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable26, (-1), outputSettings28);
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
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<!---->" + "'", str19, "\n<!---->");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        comment2.setBaseUri("\n<!--hi!-->");
        org.jsoup.nodes.Node node14 = comment2.attr("", "#comment");
        org.jsoup.nodes.Node node15 = comment2.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = comment2.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment2.before("\n<!--#comment-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(xmlDeclaration16);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment2.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration8.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(xmlDeclaration8);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--hi!-->", "<?i?>");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.attr("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
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
        org.jsoup.select.NodeFilter nodeFilter20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node16.filter(nodeFilter20);
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
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
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
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        comment12.outerHtmlTail(appendable19, (int) (short) 100, outputSettings21);
        org.jsoup.select.NodeVisitor nodeVisitor23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = comment12.traverse(nodeVisitor23);
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
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        boolean boolean11 = comment2.hasAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node12 = comment2.parent();
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean17 = comment15.hasSameValue((java.lang.Object) 1);
        boolean boolean18 = comment15.hasParent();
        org.jsoup.nodes.Document document19 = comment15.ownerDocument();
        boolean boolean21 = comment15.hasAttr("#comment");
        org.jsoup.nodes.Comment comment24 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str25 = comment24.getData();
        org.jsoup.nodes.Document document26 = comment24.ownerDocument();
        org.jsoup.nodes.Node node29 = comment24.attr("", "");
        java.lang.String str30 = comment24.getData();
        int int31 = comment24.siblingIndex();
        boolean boolean32 = comment15.equals((java.lang.Object) comment24);
        boolean boolean34 = comment24.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = comment2.after((org.jsoup.nodes.Node) comment24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node3 = comment2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment7.childNodes();
        org.jsoup.nodes.Node node9 = comment7.clone();
        org.jsoup.nodes.Node node10 = comment7.shallowClone();
        org.jsoup.nodes.Node node11 = node10.root();
        boolean boolean12 = comment2.equals((java.lang.Object) node11);
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable13, (int) (byte) 1, outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        org.jsoup.nodes.Node node7 = comment2.root();
        org.jsoup.nodes.Attributes attributes8 = comment2.attributes();
        org.jsoup.select.NodeFilter nodeFilter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = comment2.filter(nodeFilter9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
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
        org.jsoup.nodes.Node node20 = comment2.parentNode();
        org.jsoup.nodes.Node node22 = comment2.removeAttr("\n<!--\n<!---->-->");
        org.jsoup.nodes.Document document23 = node22.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList24 = document23.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(document23);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("");
        boolean boolean2 = comment1.hasParent();
        int int3 = comment1.childNodeSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--hi!-->", "\n<!--\n<!--#comment-->-->");
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.lang.String str5 = comment2.nodeName();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        org.jsoup.nodes.Node node7 = comment2.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment2.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
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
        // The following exception was thrown during execution in test generation
        try {
            node17.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.siblingNodes();
        java.lang.String str7 = comment2.absUrl("\n<!--hi!-->");
        comment2.setBaseUri("\n<!--\n<!---->-->");
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str14 = comment12.absUrl("hi!");
        org.jsoup.nodes.Node node15 = comment12.previousSibling();
        int int16 = comment12.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Node node16 = comment2.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.before("\n<!--\n<!--#comment-->-->");
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
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
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
        org.jsoup.nodes.Node node18 = comment2.removeAttr("#comment");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = comment2.before("");
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
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        int int2 = comment1.childNodeSize();
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable3, (int) (short) -1, outputSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.lang.String str5 = comment2.nodeName();
        boolean boolean6 = comment2.hasParent();
        boolean boolean7 = comment2.isXmlDeclaration();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Node node11 = comment2.wrap("\n<!--hi!-->");
        boolean boolean13 = comment2.hasAttr("\n<!---->");
        java.lang.String str14 = comment2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment2.before("\n<!--#comment-->");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str9 = comment2.attr("");
        org.jsoup.nodes.Node node12 = comment2.attr("\n<!---->", "#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment2.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
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
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        comment12.outerHtmlTail(appendable19, (int) (short) 100, outputSettings21);
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment12.outerHtmlHead(appendable23, 1, outputSettings25);
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
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
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
        java.lang.String str21 = comment2.getData();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node2 = comment1.parentNode();
        java.lang.String str3 = comment1.nodeName();
        org.jsoup.nodes.Node node4 = comment1.root();
        java.lang.String str6 = comment1.attr("<?i?>");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node6 = comment2.parentNode();
        org.jsoup.nodes.Node node7 = comment2.parent();
        org.jsoup.nodes.Node node8 = comment2.clearAttributes();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str12 = comment11.getData();
        org.jsoup.nodes.Document document13 = comment11.ownerDocument();
        org.jsoup.nodes.Node node16 = comment11.attr("", "");
        java.lang.String str17 = comment11.getData();
        int int18 = comment11.siblingIndex();
        boolean boolean20 = comment11.hasAttr("#comment");
        java.lang.String str21 = comment11.getData();
        boolean boolean23 = comment11.hasAttr("");
        java.lang.String str25 = comment11.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        java.lang.Class<?> wildcardClass28 = node27.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.lang.String str5 = comment2.nodeName();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        org.jsoup.nodes.Node node7 = node6.parent();
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node6.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Attributes attributes2 = comment1.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment1.childNodes();
        boolean boolean5 = comment1.hasAttr("\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean3 = comment2.isXmlDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration4 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment2.parent();
        org.jsoup.nodes.Node node7 = comment2.removeAttr("\n<!---->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment2.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(xmlDeclaration8);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        org.jsoup.nodes.Node node17 = node16.root();
        org.jsoup.nodes.Document document18 = node17.ownerDocument();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(document18);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean24 = comment22.hasSameValue((java.lang.Object) 1);
        boolean boolean25 = comment22.hasParent();
        org.jsoup.nodes.Node node28 = comment22.attr("", "hi!");
        java.lang.String str30 = comment22.attr("");
        org.jsoup.nodes.Document document31 = comment22.ownerDocument();
        org.jsoup.nodes.Node node33 = comment22.removeAttr("#comment");
        java.lang.String str34 = comment22.nodeName();
        org.jsoup.nodes.Node node35 = comment22.shallowClone();
        org.jsoup.nodes.Node node36 = comment22.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = node18.after(node36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNull(document31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#comment" + "'", str34, "#comment");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node36);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        boolean boolean5 = comment2.hasSameValue((java.lang.Object) (byte) 10);
        org.jsoup.nodes.Attributes attributes6 = comment2.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        boolean boolean9 = comment2.hasAttr("\n<!--\n<!---->-->");
        org.jsoup.nodes.Node node10 = comment2.shallowClone();
        node10.setBaseUri("\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("#comment");
        java.lang.String str5 = comment1.absUrl("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = comment1.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
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
        org.jsoup.nodes.Node node18 = comment2.removeAttr("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = node18.childNodesCopy();
        org.jsoup.nodes.Node node20 = node18.shallowClone();
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node26 = comment23.attr("", "");
        boolean boolean28 = comment23.hasAttr("");
        boolean boolean30 = comment23.hasAttr("#comment");
        java.lang.String str31 = comment23.toString();
        int int32 = comment23.childNodeSize();
        java.lang.String str34 = comment23.attr("\n<!--\n<!---->-->");
        // The following exception was thrown during execution in test generation
        try {
            node20.replaceWith((org.jsoup.nodes.Node) comment23);
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
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\n<!---->" + "'", str31, "\n<!---->");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
        org.jsoup.nodes.Node node23 = comment2.attr("\n<!---->", "\n<!--hi!-->");
        org.jsoup.nodes.Node node25 = comment2.wrap("\n<!--hi!-->");
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable26, (int) 'a', outputSettings28);
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
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<!---->" + "'", str19, "\n<!---->");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = comment21.after("\n<!--\n<!---->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        int int7 = comment2.childNodeSize();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment2.outerHtmlTail(appendable8, (int) ' ', outputSettings10);
        java.lang.String str12 = comment2.toString();
        org.jsoup.nodes.Node node13 = comment2.nextSibling();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!---->" + "'", str12, "\n<!---->");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.lang.String str4 = comment2.getData();
        comment2.setBaseUri("\n<!--\n<!---->-->");
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        comment2.outerHtmlTail(appendable7, 10, outputSettings9);
        java.lang.String str11 = comment2.toString();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        comment2.outerHtmlTail(appendable12, (int) (short) -1, outputSettings14);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.siblingNodes();
        java.lang.String str7 = comment2.absUrl("\n<!--hi!-->");
        comment2.setBaseUri("\n<!--\n<!---->-->");
        java.lang.String str10 = comment2.getData();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable11, (int) ' ', outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.root();
        org.jsoup.nodes.Attributes attributes5 = comment2.attributes();
        java.lang.String str6 = comment2.getData();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        comment2.setBaseUri("hi!");
        int int12 = comment2.childNodeSize();
        org.jsoup.nodes.Node node13 = comment2.clone();
        org.jsoup.nodes.Node node15 = comment2.wrap("\n<!--#comment-->");
        java.lang.Class<?> wildcardClass16 = comment2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node6 = comment2.parentNode();
        org.jsoup.nodes.Node node7 = comment2.parent();
        org.jsoup.nodes.Node node8 = comment2.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = comment2.before("\n<!--hi!-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        org.jsoup.nodes.Node node5 = node4.clone();
        org.jsoup.nodes.Node node6 = node4.shallowClone();
        org.jsoup.nodes.Node node7 = node6.nextSibling();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node13 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.childNodes();
        org.jsoup.nodes.Node node15 = node13.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList16 = node15.childNodes();
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
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        java.lang.String str18 = comment7.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = comment7.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!---->" + "'", str17, "\n<!---->");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node4 = comment2.wrap("\n<!--hi!-->");
        boolean boolean5 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node6 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = node6.hasParent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
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
        java.util.List<org.jsoup.nodes.Node> nodeList34 = comment28.siblingNodes();
        org.jsoup.select.NodeVisitor nodeVisitor35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = comment28.traverse(nodeVisitor35);
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
        org.junit.Assert.assertNotNull(nodeList34);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        int int7 = comment2.childNodeSize();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment2.outerHtmlTail(appendable8, (int) ' ', outputSettings10);
        java.lang.String str12 = comment2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = comment2.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!---->" + "'", str12, "\n<!---->");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!---->", "#comment");
        org.jsoup.nodes.Node node3 = comment2.shallowClone();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str8 = comment6.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node11 = comment6.attr("#comment", "");
        boolean boolean12 = comment2.equals((java.lang.Object) node11);
        node11.setBaseUri("#comment");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
        java.lang.String str27 = comment10.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = comment10.childNodes();
        org.jsoup.nodes.Node node29 = comment10.parentNode();
        java.lang.String str30 = comment10.baseUri();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#comment" + "'", str27, "#comment");
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        org.jsoup.nodes.Node node5 = comment2.shallowClone();
        org.jsoup.nodes.Node node7 = comment2.removeAttr("");
        boolean boolean8 = node7.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            node7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
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
        org.jsoup.nodes.Node node21 = comment2.removeAttr("\n<!--\n<!---->-->");
        java.lang.Class<?> wildcardClass22 = node21.getClass();
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
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment2.childNodes();
        java.lang.String str10 = comment2.absUrl("#comment");
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment2.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
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
        org.jsoup.nodes.Comment comment40 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean42 = comment40.hasSameValue((java.lang.Object) 1);
        boolean boolean43 = comment40.hasParent();
        org.jsoup.nodes.Node node44 = comment40.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node45 = node18.before((org.jsoup.nodes.Node) comment40);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(document33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(node44);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
            org.jsoup.nodes.Node node15 = comment2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        java.lang.String str8 = comment2.toString();
        java.lang.String str9 = comment2.nodeName();
        int int10 = comment2.childNodeSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        java.lang.String str6 = comment2.getData();
        java.lang.String str7 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.clone();
        org.jsoup.nodes.Document document9 = comment2.ownerDocument();
        int int10 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str15 = comment13.absUrl("hi!");
        java.lang.String str16 = comment13.nodeName();
        org.jsoup.nodes.Node node17 = comment13.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#comment" + "'", str16, "#comment");
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Node node16 = comment2.removeAttr("");
        org.jsoup.nodes.Node node17 = node16.parentNode();
        node16.setBaseUri("<?i?>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node2 = comment1.parentNode();
        org.jsoup.nodes.Node node3 = comment1.clone();
        org.jsoup.nodes.Node node4 = comment1.parentNode();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean9 = comment7.hasSameValue((java.lang.Object) 1);
        boolean boolean10 = comment7.hasParent();
        java.lang.String str12 = comment7.absUrl("hi!");
        org.jsoup.nodes.Node node13 = comment7.parentNode();
        org.jsoup.nodes.Node node14 = comment7.clearAttributes();
        org.jsoup.nodes.Node node15 = node14.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment1.before(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.root();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        java.lang.String str9 = comment8.nodeName();
        boolean boolean10 = node5.equals((java.lang.Object) comment8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment8.after("#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
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
            org.jsoup.nodes.Node node35 = comment2.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        boolean boolean24 = comment2.hasAttr("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
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
        org.jsoup.nodes.Node node20 = comment2.parentNode();
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
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node16.clearAttributes();
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
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
        org.jsoup.select.NodeFilter nodeFilter27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = comment20.filter(nodeFilter27);
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
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.lang.String str5 = comment2.nodeName();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        org.jsoup.nodes.Node node7 = comment2.previousSibling();
        org.jsoup.nodes.Attributes attributes8 = comment2.attributes();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str13 = comment11.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment11.childNodesCopy();
        java.lang.String str15 = comment11.getData();
        org.jsoup.nodes.Document document16 = comment11.ownerDocument();
        java.lang.String str17 = comment11.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment2.after((org.jsoup.nodes.Node) comment11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
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
        boolean boolean19 = comment2.hasParent();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = comment2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = comment2.unwrap();
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
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        boolean boolean7 = comment2.hasAttr("");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
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
        org.jsoup.select.NodeFilter nodeFilter22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node21.filter(nodeFilter22);
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
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        comment2.outerHtmlTail(appendable5, (int) (short) 1, outputSettings7);
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment2.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.wrap("#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        boolean boolean9 = comment2.hasParent();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!---->");
        boolean boolean12 = comment2.hasParent();
        int int13 = comment2.childNodeSize();
        comment2.setBaseUri("");
        java.lang.String str16 = comment2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment2.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#comment" + "'", str16, "#comment");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str10 = comment2.nodeName();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!");
        boolean boolean13 = comment2.hasSameValue((java.lang.Object) comment12);
        org.jsoup.nodes.Node node14 = comment12.clearAttributes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
        java.lang.String str20 = comment2.attr("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = comment2.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
        java.lang.String str18 = comment2.baseUri();
        java.lang.String str19 = comment2.baseUri();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node3 = comment2.clearAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = node3.childNodes();
        org.jsoup.nodes.Node node5 = node3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node3.after("#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
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
        org.jsoup.select.NodeFilter nodeFilter22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = comment2.filter(nodeFilter22);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n<!--hi!-->" + "'", str21, "\n<!--hi!-->");
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node4 = comment2.wrap("\n<!--hi!-->");
        boolean boolean5 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node6 = comment2.parentNode();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment9.childNodes();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment9.outerHtmlTail(appendable11, (int) (short) 1, outputSettings13);
        org.jsoup.nodes.Node node15 = comment9.previousSibling();
        java.lang.String str16 = comment9.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = comment9.childNodesCopy();
        java.lang.String str18 = comment9.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = comment2.before((org.jsoup.nodes.Node) comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node22.after("\n<!---->");
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
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
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
        org.jsoup.nodes.Node node26 = node5.parentNode();
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
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        java.lang.String str11 = comment2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.siblingNodes();
        org.jsoup.nodes.Node node15 = comment2.attr("#comment", "");
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = comment18.childNodes();
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        comment18.outerHtmlTail(appendable20, (int) (short) 1, outputSettings22);
        org.jsoup.nodes.Node node24 = comment18.parentNode();
        java.lang.String str25 = comment18.baseUri();
        org.jsoup.nodes.Comment comment28 = new org.jsoup.nodes.Comment("\n<!---->", "\n<!---->");
        boolean boolean29 = comment18.equals((java.lang.Object) "\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = node15.before((org.jsoup.nodes.Node) comment18);
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
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment2.outerHtmlTail(appendable10, (int) (byte) 100, outputSettings12);
        java.lang.String str14 = comment2.toString();
        org.jsoup.nodes.Document document15 = comment2.ownerDocument();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
        org.junit.Assert.assertNull(document15);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        int int3 = comment2.childNodeSize();
        java.lang.String str4 = comment2.outerHtml();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--#comment-->" + "'", str4, "\n<!--#comment-->");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
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
        boolean boolean21 = comment2.hasParent();
        org.jsoup.nodes.Node node22 = comment2.parentNode();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#comment" + "'", str4, "#comment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!---->" + "'", str5, "\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        java.lang.String str4 = comment2.nodeName();
        java.lang.String str5 = comment2.outerHtml();
        org.jsoup.nodes.Node node6 = comment2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node6.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#comment" + "'", str4, "#comment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!---->" + "'", str5, "\n<!---->");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
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
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = comment20.childNodesCopy();
        org.jsoup.nodes.Node node22 = comment20.clone();
        boolean boolean23 = comment20.hasParent();
        org.jsoup.nodes.Node node24 = comment20.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = comment2.before(node24);
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
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
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
            node37.setBaseUri("\n<!--\n<!---->-->");
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
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
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
        java.lang.String str27 = comment2.toString();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\n<!--hi!-->" + "'", str27, "\n<!--hi!-->");
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        java.lang.String str7 = comment2.getData();
        java.lang.String str8 = comment2.getData();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str12 = comment11.getData();
        org.jsoup.nodes.Document document13 = comment11.ownerDocument();
        org.jsoup.nodes.Node node16 = comment11.attr("", "");
        boolean boolean17 = comment11.isXmlDeclaration();
        org.jsoup.nodes.Attributes attributes18 = comment11.attributes();
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean23 = comment21.hasSameValue((java.lang.Object) 1);
        boolean boolean24 = comment21.hasParent();
        org.jsoup.nodes.Node node27 = comment21.attr("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = node27.childNodes();
        boolean boolean29 = comment11.equals((java.lang.Object) nodeList28);
        org.jsoup.nodes.Node node30 = comment11.nextSibling();
        int int31 = comment11.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment10.childNodes();
        java.lang.String str12 = comment10.outerHtml();
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node18 = comment15.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = comment15.childNodes();
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        comment15.outerHtmlTail(appendable20, 100, outputSettings22);
        boolean boolean24 = comment10.equals((java.lang.Object) comment15);
        boolean boolean25 = comment10.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        org.jsoup.nodes.Node node7 = comment2.root();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str11 = comment10.getData();
        boolean boolean12 = comment2.equals((java.lang.Object) str11);
        org.jsoup.nodes.Attributes attributes13 = comment2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
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
        org.jsoup.select.NodeVisitor nodeVisitor26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = comment16.traverse(nodeVisitor26);
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
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "");
        org.jsoup.nodes.Node node3 = comment2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList4 = node3.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
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
        java.lang.Appendable appendable40 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = null;
        comment24.outerHtmlTail(appendable40, (int) '4', outputSettings42);
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
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment2.outerHtmlTail(appendable10, 100, outputSettings12);
        org.jsoup.nodes.Node node15 = comment2.removeAttr("\n<!--\n<!---->-->");
        org.jsoup.nodes.Node node16 = node15.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = node16.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "#comment");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        comment2.outerHtmlTail(appendable9, (int) (short) 10, outputSettings11);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.String str5 = comment2.attr("hi!");
        boolean boolean7 = comment2.hasAttr("");
        java.lang.String str9 = comment2.attr("\n<!--hi!-->");
        java.lang.String str10 = comment2.baseUri();
        comment2.setBaseUri("");
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment2.before("\n<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
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
        org.jsoup.nodes.Node node21 = comment2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList22 = node21.siblingNodes();
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
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        comment2.setBaseUri("\n<!--hi!-->");
        org.jsoup.nodes.Node node14 = comment2.attr("", "#comment");
        org.jsoup.nodes.Node node15 = comment2.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = comment2.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment2.after("#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(xmlDeclaration16);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
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
        java.lang.String str24 = comment2.nodeName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#comment" + "'", str24, "#comment");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node12 = comment10.wrap("\n<!--hi!-->");
        boolean boolean13 = comment10.isXmlDeclaration();
        org.jsoup.nodes.Node node14 = comment10.parentNode();
        boolean boolean15 = comment2.hasSameValue((java.lang.Object) node14);
        org.jsoup.nodes.Node node18 = comment2.attr("hi!", "<?i?>");
        org.jsoup.nodes.Node node19 = node18.parent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node13 = comment2.wrap("\n<!--hi!-->");
        org.jsoup.nodes.Node node14 = comment2.shallowClone();
        java.lang.String str16 = comment2.attr("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
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
        org.jsoup.nodes.Node node34 = comment2.attr("\n<!--hi!-->", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = comment2.after("#comment");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(xmlDeclaration30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        boolean boolean5 = comment2.hasSameValue((java.lang.Object) (byte) 10);
        org.jsoup.nodes.Attributes attributes6 = comment2.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        boolean boolean8 = xmlDeclaration7.hasParent();
        org.jsoup.select.NodeFilter nodeFilter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration7.filter(nodeFilter9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.root();
        org.jsoup.nodes.Node node3 = comment1.clone();
        org.jsoup.nodes.Node node4 = node3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node4.before("\n<!--#comment-->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        boolean boolean9 = comment2.hasParent();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!---->");
        boolean boolean12 = comment2.hasParent();
        org.jsoup.nodes.Node node13 = comment2.shallowClone();
        java.lang.String str14 = comment2.nodeName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
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
        org.jsoup.nodes.Document document19 = comment2.ownerDocument();
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
        org.junit.Assert.assertNull(document19);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node2 = comment1.shallowClone();
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node8 = comment5.attr("", "");
        org.jsoup.nodes.Node node11 = comment5.attr("#comment", "#comment");
        boolean boolean12 = comment1.hasSameValue((java.lang.Object) comment5);
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node18 = comment15.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = comment15.childNodes();
        org.jsoup.nodes.Node node20 = comment15.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = comment5.before(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node13 = comment2.wrap("\n<!--hi!-->");
        java.lang.String str15 = comment2.attr("");
        comment2.setBaseUri("\n<!---->");
        comment2.setBaseUri("hi!");
        boolean boolean20 = comment2.isXmlDeclaration();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
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
        org.jsoup.nodes.Attributes attributes18 = comment2.attributes();
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean23 = comment21.hasSameValue((java.lang.Object) 1);
        int int24 = comment21.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = comment21.siblingNodes();
        boolean boolean26 = comment21.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = comment2.before((org.jsoup.nodes.Node) comment21);
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
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable7, (int) '#', outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = comment2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
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
        org.jsoup.nodes.Node node19 = node18.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node19.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        comment2.setBaseUri("hi!");
        org.jsoup.nodes.Node node12 = comment2.root();
        org.jsoup.nodes.Node node15 = comment2.attr("\n<!--hi!-->", "hi!");
        node15.setBaseUri("");
        org.jsoup.nodes.Node node18 = node15.parent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        java.lang.String str4 = comment2.baseUri();
        java.lang.String str6 = comment2.absUrl("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        org.jsoup.nodes.Node node7 = comment2.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment2.childNodes();
        boolean boolean9 = comment2.isXmlDeclaration();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("");
        int int2 = comment1.siblingIndex();
        org.jsoup.nodes.Node node5 = comment1.attr("\n<!--\n<!---->-->", "#comment");
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment1.outerHtmlTail(appendable6, (int) (byte) -1, outputSettings8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.String str5 = comment2.attr("hi!");
        org.jsoup.select.NodeFilter nodeFilter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = comment2.filter(nodeFilter6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
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
        org.jsoup.nodes.Node node32 = xmlDeclaration30.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node32.before("<?i?>");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertNotNull(xmlDeclaration30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.root();
        java.lang.String str6 = comment2.baseUri();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean11 = comment9.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node12 = comment9.nextSibling();
        org.jsoup.nodes.Node node13 = comment9.shallowClone();
        org.jsoup.nodes.Node node14 = comment9.parent();
        int int15 = comment9.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment2.before((org.jsoup.nodes.Node) comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
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
        org.jsoup.nodes.Node node21 = node20.parent();
        org.jsoup.nodes.Comment comment24 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean26 = comment24.hasSameValue((java.lang.Object) 1);
        boolean boolean27 = comment24.hasParent();
        java.lang.String str29 = comment24.absUrl("hi!");
        org.jsoup.nodes.Node node31 = comment24.removeAttr("");
        org.jsoup.nodes.Node node32 = comment24.previousSibling();
        int int33 = comment24.siblingIndex();
        org.jsoup.nodes.Attributes attributes34 = comment24.attributes();
        org.jsoup.nodes.Node node35 = comment24.parent();
        org.jsoup.nodes.Node node37 = comment24.removeAttr("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = node21.hasSameValue((java.lang.Object) node37);
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
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node37);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (int) (short) 1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        java.lang.String str9 = comment2.baseUri();
        org.jsoup.nodes.Node node10 = comment2.clone();
        org.jsoup.nodes.Node node11 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = comment2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        java.lang.String str6 = comment2.getData();
        java.lang.String str7 = comment2.baseUri();
        boolean boolean8 = comment2.isXmlDeclaration();
        java.lang.String str9 = comment2.getData();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
        org.jsoup.nodes.Node node35 = comment15.attr("#comment", "\n<!--hi!-->");
        org.jsoup.nodes.Comment comment38 = new org.jsoup.nodes.Comment("\n<!---->", "\n<!---->");
        org.jsoup.nodes.Node node40 = comment38.removeAttr("\n<!--hi!-->");
        boolean boolean41 = node40.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = comment15.after(node40);
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
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!---->", "\n<!---->");
        java.lang.String str3 = comment2.outerHtml();
        int int4 = comment2.siblingIndex();
        java.lang.String str6 = comment2.attr("");
        org.jsoup.select.NodeFilter nodeFilter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment2.filter(nodeFilter7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--\n<!---->-->" + "'", str3, "\n<!--\n<!---->-->");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("<?i?>", "hi!");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable3, (int) '4', outputSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
        org.jsoup.nodes.Node node23 = comment2.wrap("\n<!--\n<!---->-->");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#comment" + "'", str20, "#comment");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
    }
}

