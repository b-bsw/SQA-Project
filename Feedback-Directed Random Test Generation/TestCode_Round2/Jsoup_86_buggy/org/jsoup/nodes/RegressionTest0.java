package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = comment2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.select.NodeVisitor nodeVisitor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = comment2.traverse(nodeVisitor4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node5.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable12, (int) '#', outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = document11.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = comment2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = document6.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        boolean boolean11 = comment8.hasParent();
        java.lang.String str13 = comment8.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment2.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node8.unwrap();
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
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = comment2.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = document4.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.Class<?> wildcardClass8 = node7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = document6.after(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = comment2.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = comment2.after("\n<!--hi!-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node4 = comment2.wrap("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node4.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = document4.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node12 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node12.parent();
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
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = document4.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean13 = comment11.hasSameValue((java.lang.Object) 1);
        boolean boolean14 = comment11.hasParent();
        java.lang.String str16 = comment11.absUrl("hi!");
        org.jsoup.nodes.Node node18 = comment11.removeAttr("");
        comment11.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        org.jsoup.select.NodeFilter nodeFilter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment2.filter(nodeFilter8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node14 = comment8.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node15 = comment8.shallowClone();
        org.jsoup.select.NodeFilter nodeFilter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = comment8.filter(nodeFilter16);
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
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean14 = comment12.hasSameValue((java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        org.jsoup.nodes.Node node9 = node8.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node8.clearAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node9 = comment7.wrap("\n<!--hi!-->");
        boolean boolean10 = comment7.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.before((org.jsoup.nodes.Node) comment7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = comment2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = node10.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node4 = comment2.wrap("\n<!--hi!-->");
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean9 = comment7.hasSameValue((java.lang.Object) 1);
        boolean boolean10 = comment7.hasParent();
        java.lang.String str12 = comment7.absUrl("hi!");
        org.jsoup.nodes.Node node13 = comment7.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = node4.equals((java.lang.Object) node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        org.jsoup.nodes.Node node9 = node8.previousSibling();
        org.jsoup.select.NodeFilter nodeFilter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.filter(nodeFilter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        java.lang.String str5 = comment2.baseUri();
        java.lang.Class<?> wildcardClass6 = comment2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        boolean boolean5 = comment2.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration6 = comment2.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        java.lang.String str11 = comment2.outerHtml();
        org.jsoup.nodes.Node node12 = comment2.parentNode();
        org.jsoup.select.NodeFilter nodeFilter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.filter(nodeFilter13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        java.lang.String str8 = comment2.getData();
        java.lang.Class<?> wildcardClass9 = comment2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        comment2.setBaseUri("hi!");
        int int12 = comment2.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment2.after("#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        java.lang.Class<?> wildcardClass5 = comment2.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.lang.String str5 = comment2.nodeName();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        java.lang.Class<?> wildcardClass7 = node6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node14 = comment8.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node15 = comment8.shallowClone();
        org.jsoup.nodes.Node node16 = node15.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.before("\n<!--hi!-->");
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
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.lang.String str5 = comment2.nodeName();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        boolean boolean7 = node6.hasParent();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment10.childNodes();
        org.jsoup.nodes.Node node12 = comment10.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node6.after(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node12 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.childNodes();
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
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.lang.String str4 = comment2.getData();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable5, (int) (short) -1, outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        org.jsoup.select.NodeFilter nodeFilter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = comment2.filter(nodeFilter9);
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
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node4 = comment2.wrap("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList5 = node4.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment2.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = comment2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = node5.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable6, (int) ' ', outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str10 = comment8.absUrl("hi!");
        boolean boolean11 = comment8.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment2.after((org.jsoup.nodes.Node) comment8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node9.unwrap();
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
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = comment2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        java.lang.String str11 = comment2.outerHtml();
        org.jsoup.nodes.Node node12 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = node12.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean11 = comment9.hasSameValue((java.lang.Object) 1);
        boolean boolean12 = comment9.hasParent();
        java.lang.String str14 = comment9.absUrl("hi!");
        org.jsoup.nodes.Node node15 = comment9.parentNode();
        comment9.setBaseUri("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str10 = comment8.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment8.childNodesCopy();
        boolean boolean12 = comment8.isXmlDeclaration();
        int int13 = comment8.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment2.after((org.jsoup.nodes.Node) comment8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        comment2.outerHtmlTail(appendable9, (int) (short) -1, outputSettings11);
        org.jsoup.nodes.Attributes attributes13 = comment2.attributes();
        java.lang.Class<?> wildcardClass14 = attributes13.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.lang.String str5 = comment2.nodeName();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        org.jsoup.select.NodeVisitor nodeVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment2.traverse(nodeVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean9 = comment7.hasSameValue((java.lang.Object) 1);
        int int10 = comment7.siblingIndex();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean15 = comment13.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node16 = comment13.nextSibling();
        boolean boolean17 = comment7.equals((java.lang.Object) comment13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment2.after((org.jsoup.nodes.Node) comment7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        java.lang.String str4 = comment2.nodeName();
        boolean boolean6 = comment2.hasAttr("\n<!---->");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#comment" + "'", str4, "#comment");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str3 = comment1.attr("#comment");
        java.lang.Class<?> wildcardClass4 = comment1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node12 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment2.before("\n<!---->");
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
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = comment2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = comment2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node14 = comment8.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node15 = comment8.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment8.unwrap();
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
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = node8.getClass();
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
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        java.lang.String str11 = comment2.outerHtml();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean16 = comment14.hasSameValue((java.lang.Object) 1);
        boolean boolean17 = comment14.hasParent();
        org.jsoup.nodes.Node node20 = comment14.attr("", "hi!");
        java.lang.String str22 = comment14.attr("");
        java.lang.String str24 = comment14.absUrl("hi!");
        org.jsoup.nodes.Node node25 = comment14.parent();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith(node25);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        java.lang.Class<?> wildcardClass9 = comment2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (int) (short) 1, outputSettings6);
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable8, (int) (byte) 10, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = comment2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean9 = comment7.hasSameValue((java.lang.Object) 1);
        boolean boolean10 = comment7.hasParent();
        org.jsoup.nodes.Node node13 = comment7.attr("", "hi!");
        java.lang.String str15 = comment7.attr("");
        org.jsoup.nodes.Document document16 = comment7.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = comment2.after((org.jsoup.nodes.Node) document16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        java.lang.String str5 = comment2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = comment2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
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
        org.jsoup.select.NodeVisitor nodeVisitor17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment2.traverse(nodeVisitor17);
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
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.attr("hi!", "");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable9, (int) (byte) 100, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        java.lang.String str5 = comment2.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration6 = comment2.asXmlDeclaration();
        org.jsoup.select.NodeFilter nodeFilter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment2.filter(nodeFilter7);
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
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node3 = comment1.before("#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (int) (short) 1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable9, (int) (byte) 0, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (int) (short) 1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node8.wrap("\n<!--hi!-->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment12.childNodes();
        java.lang.String str14 = comment12.outerHtml();
        org.jsoup.nodes.Node node15 = comment12.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        java.lang.String str6 = comment2.getData();
        org.jsoup.nodes.Document document7 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = document7.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        java.lang.String str12 = comment2.outerHtml();
        java.lang.String str13 = comment2.toString();
        org.jsoup.select.NodeFilter nodeFilter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment2.filter(nodeFilter14);
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
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (int) (short) 1, outputSettings6);
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str11 = comment10.getData();
        org.jsoup.nodes.Document document12 = comment10.ownerDocument();
        org.jsoup.nodes.Node node15 = comment10.attr("", "");
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean20 = comment18.hasSameValue((java.lang.Object) 1);
        boolean boolean21 = comment18.hasParent();
        org.jsoup.nodes.Node node24 = comment18.attr("", "hi!");
        org.jsoup.nodes.Node node25 = node24.previousSibling();
        org.jsoup.nodes.Node node26 = node24.parentNode();
        boolean boolean27 = node15.hasSameValue((java.lang.Object) node24);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = comment2.after(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node14 = comment8.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node15 = comment8.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            node15.setBaseUri("");
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
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node12 = comment2.parentNode();
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str16 = comment15.getData();
        org.jsoup.nodes.Document document17 = comment15.ownerDocument();
        org.jsoup.nodes.Node node20 = comment15.attr("", "");
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean25 = comment23.hasSameValue((java.lang.Object) 1);
        boolean boolean26 = comment23.hasParent();
        org.jsoup.nodes.Node node29 = comment23.attr("", "hi!");
        org.jsoup.nodes.Node node30 = node29.previousSibling();
        org.jsoup.nodes.Node node31 = node29.parentNode();
        boolean boolean32 = node20.hasSameValue((java.lang.Object) node29);
        org.jsoup.nodes.Node node33 = node20.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = node12.equals((java.lang.Object) node20);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(node33);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment2.after("\n<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
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
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable15, 1, outputSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment11.childNodesCopy();
        java.lang.String str13 = comment11.nodeName();
        java.lang.String str14 = comment11.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node8.before((org.jsoup.nodes.Node) comment11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!---->" + "'", str14, "\n<!---->");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node8.nextSibling();
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
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = document6.wrap("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.String str5 = comment2.attr("hi!");
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        comment8.outerHtmlTail(appendable12, (int) (short) -1, outputSettings14);
        java.lang.String str16 = comment8.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#comment" + "'", str16, "#comment");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment2.outerHtmlTail(appendable10, (int) (byte) 100, outputSettings12);
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable14, (int) (byte) 0, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        org.jsoup.nodes.Node node5 = comment2.shallowClone();
        org.jsoup.nodes.Node node6 = node5.root();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.siblingNodes();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean12 = comment10.hasSameValue((java.lang.Object) 1);
        boolean boolean13 = comment10.hasParent();
        org.jsoup.nodes.Node node16 = comment10.attr("", "hi!");
        java.lang.String str18 = comment10.attr("");
        org.jsoup.nodes.Document document19 = comment10.ownerDocument();
        org.jsoup.nodes.Node node21 = comment10.removeAttr("#comment");
        java.lang.String str22 = comment10.nodeName();
        org.jsoup.nodes.Node node24 = comment10.removeAttr("hi!");
        boolean boolean26 = comment10.hasAttr("hi!");
        org.jsoup.nodes.Node node27 = comment10.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = node5.after((org.jsoup.nodes.Node) comment10);
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
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
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
        org.jsoup.select.NodeFilter nodeFilter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = comment2.filter(nodeFilter16);
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
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
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
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean19 = comment17.hasSameValue((java.lang.Object) 1);
        boolean boolean20 = comment17.hasParent();
        org.jsoup.nodes.Document document21 = comment17.ownerDocument();
        boolean boolean23 = comment17.hasAttr("#comment");
        org.jsoup.nodes.Node node24 = comment17.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment17);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node8.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        java.lang.String str5 = comment2.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration6 = comment2.asXmlDeclaration();
        java.lang.Class<?> wildcardClass7 = comment2.getClass();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
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
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str21 = comment20.getData();
        org.jsoup.nodes.Document document22 = comment20.ownerDocument();
        org.jsoup.nodes.Node node25 = comment20.attr("", "");
        java.lang.String str26 = comment20.getData();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
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
        // The following exception was thrown during execution in test generation
        try {
            node14.setBaseUri("#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
        int int9 = comment2.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = comment2.before("#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment15);
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
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
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
            java.util.List<org.jsoup.nodes.Node> nodeList17 = node16.childNodes();
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
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment2.clearAttributes();
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
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = comment2.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        org.jsoup.nodes.Node node9 = comment2.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node14 = comment8.removeAttr("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        org.jsoup.nodes.Node node9 = node8.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodes();
        org.jsoup.nodes.Node node11 = node8.parentNode();
        org.jsoup.select.NodeFilter nodeFilter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.filter(nodeFilter12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean13 = comment11.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node14 = comment11.nextSibling();
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        comment11.outerHtmlTail(appendable15, (int) (short) -1, outputSettings17);
        java.lang.String str20 = comment11.attr("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = node8.equals((java.lang.Object) "\n<!--hi!-->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.String str5 = comment2.absUrl("\n<!---->");
        java.lang.Class<?> wildcardClass6 = comment2.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        java.lang.String str12 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node13 = comment2.parent();
        org.jsoup.select.NodeFilter nodeFilter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.filter(nodeFilter14);
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
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = comment2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        int int11 = comment8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment8.siblingNodes();
        java.lang.String str13 = comment8.outerHtml();
        org.jsoup.nodes.Node node14 = comment8.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment2.after(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node10 = comment7.attr("", "");
        org.jsoup.nodes.Node node11 = comment7.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node4.before(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        comment2.setBaseUri("\n<!--hi!-->");
        org.jsoup.nodes.Node node14 = comment2.attr("", "#comment");
        java.lang.Class<?> wildcardClass15 = node14.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        int int3 = comment2.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = comment2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        boolean boolean9 = comment2.hasParent();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!---->");
        boolean boolean12 = comment2.hasParent();
        org.jsoup.select.NodeFilter nodeFilter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment2.filter(nodeFilter13);
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
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        java.lang.String str6 = comment2.getData();
        java.lang.String str7 = comment2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment2.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        comment2.setBaseUri("\n<!---->");
        org.jsoup.nodes.Node node8 = comment2.nextSibling();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean13 = comment11.hasSameValue((java.lang.Object) 1);
        boolean boolean14 = comment11.hasParent();
        boolean boolean16 = comment11.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean17 = comment11.isXmlDeclaration();
        boolean boolean18 = comment11.hasParent();
        org.jsoup.nodes.Node node20 = comment11.removeAttr("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node8.after((org.jsoup.nodes.Node) comment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
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
            org.jsoup.nodes.Node node18 = node16.after("hi!");
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
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node2 = comment1.parentNode();
        org.jsoup.nodes.Node node3 = comment1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = comment1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node14.shallowClone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        org.jsoup.nodes.Node node6 = comment2.clone();
        org.jsoup.select.NodeFilter nodeFilter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment2.filter(nodeFilter7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node6 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            node6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        org.jsoup.nodes.Node node9 = node8.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node9.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        org.jsoup.select.NodeVisitor nodeVisitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = comment2.traverse(nodeVisitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = comment2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
        org.jsoup.select.NodeFilter nodeFilter30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = comment15.filter(nodeFilter30);
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
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        java.lang.String str12 = comment2.absUrl("hi!");
        int int13 = comment2.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = comment2.absUrl("");
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
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        int int7 = comment2.childNodeSize();
        java.lang.String str9 = comment2.absUrl("#comment");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = comment2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment2.outerHtmlTail(appendable10, (int) (byte) 100, outputSettings12);
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = comment16.childNodes();
        org.jsoup.nodes.Node node18 = comment16.clone();
        org.jsoup.nodes.Node node19 = comment16.shallowClone();
        org.jsoup.nodes.Node node20 = node19.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = comment2.before(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
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
            org.jsoup.nodes.Node node14 = node12.after("\n<!--hi!-->");
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
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = comment2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = document4.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        java.lang.String str5 = comment2.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration6 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node7 = xmlDeclaration6.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node10.before((org.jsoup.nodes.Node) comment13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
        org.jsoup.select.NodeVisitor nodeVisitor18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = comment12.traverse(nodeVisitor18);
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
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node13 = comment2.wrap("\n<!--hi!-->");
        org.jsoup.nodes.Document document14 = comment2.ownerDocument();
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = document14.traverse(nodeVisitor15);
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
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        java.lang.String str8 = comment2.getData();
        boolean boolean10 = comment2.hasAttr("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        boolean boolean8 = comment2.hasAttr("#comment");
        org.jsoup.nodes.Node node9 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList10 = node9.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        org.jsoup.select.NodeFilter nodeFilter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment2.filter(nodeFilter12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment2.outerHtmlTail(appendable10, (int) (byte) 100, outputSettings12);
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        comment2.outerHtmlTail(appendable14, 10, outputSettings16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Node node4 = comment2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = node4.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        org.jsoup.nodes.Document document9 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = document9.unwrap();
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
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.root();
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.traverse(nodeVisitor10);
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
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
            org.jsoup.nodes.Node node19 = comment2.before("\n<!--hi!-->");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#comment" + "'", str17, "#comment");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
        org.jsoup.nodes.Comment comment32 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str34 = comment32.absUrl("hi!");
        java.lang.String str35 = comment32.nodeName();
        org.jsoup.nodes.Node node36 = comment32.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = node36.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = comment2.before(node36);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#comment" + "'", str35, "#comment");
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(nodeList37);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = comment2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Document document9 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = document9.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            node6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean24 = comment22.hasSameValue((java.lang.Object) 1);
        int int25 = comment22.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = comment22.siblingNodes();
        comment22.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes29 = comment22.attributes();
        // The following exception was thrown during execution in test generation
        try {
            node19.replaceWith((org.jsoup.nodes.Node) comment22);
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
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(attributes29);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node8.parent();
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
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        boolean boolean8 = comment2.hasAttr("#comment");
        org.jsoup.nodes.Node node9 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.toString();
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean13 = comment11.hasSameValue((java.lang.Object) 1);
        int int14 = comment11.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment11.siblingNodes();
        java.lang.String str16 = comment11.outerHtml();
        org.jsoup.nodes.Node node17 = comment11.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            node8.replaceWith(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n<!--hi!-->" + "'", str16, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.parentNode();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str14 = comment12.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node15 = comment12.root();
        // The following exception was thrown during execution in test generation
        try {
            node9.replaceWith(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        boolean boolean13 = comment2.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment2.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        java.lang.String str5 = comment2.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration6 = comment2.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration6.remove();
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
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Node node9 = comment2.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        org.jsoup.select.NodeVisitor nodeVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment2.traverse(nodeVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment2.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = comment2.asXmlDeclaration();
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
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        java.lang.String str6 = comment2.getData();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean11 = comment9.hasSameValue((java.lang.Object) 1);
        boolean boolean12 = comment9.hasParent();
        org.jsoup.nodes.Node node15 = comment9.attr("", "hi!");
        java.lang.String str17 = comment9.attr("");
        java.lang.String str19 = comment9.absUrl("hi!");
        int int20 = comment9.siblingIndex();
        org.jsoup.nodes.Node node21 = comment9.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = comment2.after(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Attributes attributes2 = comment1.attributes();
        int int3 = comment1.childNodeSize();
        org.jsoup.nodes.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = comment1.before(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (int) (short) 1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node8.shallowClone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = comment12.wrap("");
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
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
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
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        org.jsoup.nodes.Node node6 = comment2.clone();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean11 = comment9.hasSameValue((java.lang.Object) 1);
        boolean boolean12 = comment9.hasParent();
        java.lang.String str14 = comment9.absUrl("hi!");
        org.jsoup.nodes.Node node15 = comment9.parentNode();
        comment9.setBaseUri("\n<!--hi!-->");
        comment9.setBaseUri("");
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        comment9.outerHtmlTail(appendable20, (int) (byte) 100, outputSettings22);
        int int24 = comment9.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node6.after((org.jsoup.nodes.Node) comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        boolean boolean4 = comment2.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = comment2.after("#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = comment2.after("#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = comment2.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        boolean boolean5 = comment2.hasSameValue((java.lang.Object) (byte) 10);
        org.jsoup.nodes.Attributes attributes6 = comment2.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment2.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment2.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str10 = comment2.nodeName();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!");
        boolean boolean13 = comment2.hasSameValue((java.lang.Object) comment12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment12.wrap("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node3 = comment2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str8 = comment7.getData();
        org.jsoup.nodes.Document document9 = comment7.ownerDocument();
        org.jsoup.nodes.Node node12 = comment7.attr("", "");
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean17 = comment15.hasSameValue((java.lang.Object) 1);
        boolean boolean18 = comment15.hasParent();
        org.jsoup.nodes.Node node21 = comment15.attr("", "hi!");
        org.jsoup.nodes.Node node22 = node21.previousSibling();
        org.jsoup.nodes.Node node23 = node21.parentNode();
        boolean boolean24 = node12.hasSameValue((java.lang.Object) node21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = comment2.before(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = comment15.childNodes();
        java.lang.String str17 = comment15.outerHtml();
        org.jsoup.nodes.Node node18 = comment15.previousSibling();
        comment15.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.lang.String str5 = comment2.nodeName();
        org.jsoup.nodes.Node node7 = comment2.removeAttr("\n<!--hi!-->");
        org.jsoup.select.NodeFilter nodeFilter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment2.filter(nodeFilter8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.lang.String str5 = comment2.nodeName();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node6.childNodesCopy();
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
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = document4.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.lang.String str5 = comment2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = comment2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = comment2.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        java.lang.String str6 = comment2.getData();
        org.jsoup.nodes.Document document7 = comment2.ownerDocument();
        java.lang.String str8 = comment2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        comment2.setBaseUri("\n<!---->");
        org.jsoup.nodes.Node node8 = comment2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = node8.getClass();
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
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.lang.Class<?> wildcardClass4 = comment2.getClass();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        boolean boolean7 = comment2.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment2.clearAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        boolean boolean8 = comment2.hasAttr("#comment");
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node5 = comment2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList6 = node5.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        org.jsoup.nodes.Document document9 = comment2.ownerDocument();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean14 = comment12.hasSameValue((java.lang.Object) 1);
        boolean boolean15 = comment12.hasParent();
        java.lang.String str17 = comment12.absUrl("hi!");
        org.jsoup.nodes.Node node18 = comment12.parentNode();
        comment12.setBaseUri("\n<!--hi!-->");
        comment12.setBaseUri("");
        org.jsoup.nodes.Comment comment25 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean27 = comment25.hasSameValue((java.lang.Object) 1);
        boolean boolean28 = comment25.hasParent();
        org.jsoup.nodes.Node node31 = comment25.attr("", "hi!");
        java.lang.String str33 = comment25.attr("");
        org.jsoup.nodes.Document document34 = comment25.ownerDocument();
        org.jsoup.nodes.Node node36 = comment25.removeAttr("#comment");
        java.lang.String str37 = comment25.nodeName();
        org.jsoup.nodes.Node node38 = comment25.shallowClone();
        boolean boolean39 = comment12.hasSameValue((java.lang.Object) comment25);
        org.jsoup.nodes.Node node41 = comment25.removeAttr("");
        // The following exception was thrown during execution in test generation
        try {
            document9.replaceWith(node41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNull(document34);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#comment" + "'", str37, "#comment");
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node41);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment2.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        org.jsoup.nodes.Node node12 = comment2.attr("hi!", "\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str13 = comment12.getData();
        org.jsoup.nodes.Document document14 = comment12.ownerDocument();
        org.jsoup.nodes.Node node17 = comment12.attr("", "");
        java.lang.String str18 = comment12.getData();
        int int19 = comment12.siblingIndex();
        java.lang.String str21 = comment12.attr("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = node9.hasSameValue((java.lang.Object) str21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        boolean boolean5 = comment2.hasSameValue((java.lang.Object) (byte) 10);
        org.jsoup.nodes.Attributes attributes6 = comment2.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration7.childNodesCopy();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (int) (short) 1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        org.jsoup.select.NodeFilter nodeFilter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node8.filter(nodeFilter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = comment12.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
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
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        boolean boolean13 = comment2.isXmlDeclaration();
        comment2.setBaseUri("");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean23 = comment21.hasSameValue((java.lang.Object) 1);
        int int24 = comment21.siblingIndex();
        org.jsoup.nodes.Comment comment27 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean29 = comment27.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node30 = comment27.nextSibling();
        boolean boolean31 = comment21.equals((java.lang.Object) comment27);
        org.jsoup.nodes.Node node33 = comment27.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node34 = comment27.shallowClone();
        org.jsoup.nodes.Node node35 = node34.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith(node34);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(node35);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("");
        int int19 = comment18.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = comment7.after((org.jsoup.nodes.Node) comment18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        org.jsoup.nodes.Node node6 = comment2.clone();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node9 = comment8.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.lang.String str4 = comment2.getData();
        org.jsoup.nodes.Document document5 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = document5.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Attributes attributes6 = comment2.attributes();
        java.lang.Class<?> wildcardClass7 = attributes6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
        org.jsoup.select.NodeFilter nodeFilter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = comment2.filter(nodeFilter18);
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
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node10 = comment2.removeAttr("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            node10.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment2.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node5 = comment2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node5.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        comment2.setBaseUri("\n<!---->");
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        boolean boolean11 = node8.equals((java.lang.Object) comment10);
        org.jsoup.nodes.Node node12 = node8.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node8.siblingNodes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.String str4 = comment2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = comment2.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node22.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        int int11 = comment2.childNodeSize();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable12, (int) (short) 1, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = comment2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        boolean boolean30 = comment17.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = comment2.after((org.jsoup.nodes.Node) comment17);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#comment" + "'", str25, "#comment");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#comment" + "'", str29, "#comment");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node18 = comment17.root();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = comment17.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = comment17.asXmlDeclaration();
        comment17.setBaseUri("\n<!---->");
        org.jsoup.nodes.Node node23 = comment17.shallowClone();
        org.jsoup.nodes.Comment comment25 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        boolean boolean26 = node23.equals((java.lang.Object) comment25);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = comment2.before(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(xmlDeclaration20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str3 = comment1.attr("#comment");
        org.jsoup.select.NodeFilter nodeFilter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = comment1.filter(nodeFilter4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        org.jsoup.select.NodeFilter nodeFilter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment2.filter(nodeFilter11);
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
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.root();
        java.lang.Class<?> wildcardClass10 = node9.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str10 = comment2.nodeName();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!");
        boolean boolean13 = comment2.hasSameValue((java.lang.Object) comment12);
        // The following exception was thrown during execution in test generation
        try {
            comment12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        int int7 = comment2.childNodeSize();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment2.outerHtmlTail(appendable8, (int) ' ', outputSettings10);
        boolean boolean13 = comment2.hasAttr("");
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable14, (int) (byte) 100, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        java.lang.String str12 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node13 = comment2.parent();
        boolean boolean15 = comment2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = comment2.childNodes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        int int6 = comment2.childNodeSize();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str11 = comment9.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment9.childNodesCopy();
        boolean boolean13 = comment9.isXmlDeclaration();
        int int14 = comment9.childNodeSize();
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        comment9.outerHtmlTail(appendable15, (int) ' ', outputSettings17);
        java.lang.String str20 = comment9.absUrl("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#comment" + "'", str17, "#comment");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        comment2.setBaseUri("hi!");
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment11.childNodes();
        org.jsoup.nodes.Node node13 = comment11.clone();
        int int14 = comment11.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node13 = comment2.wrap("\n<!--hi!-->");
        org.jsoup.nodes.Node node16 = comment2.attr("hi!", "\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = comment2.unwrap();
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
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = comment2.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Node node4 = comment2.nextSibling();
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node2 = comment1.parentNode();
        org.jsoup.nodes.Node node3 = comment1.clone();
        org.jsoup.nodes.Node node4 = comment1.parentNode();
        boolean boolean6 = comment1.hasAttr("hi!");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = comment2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean18 = comment16.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node19 = comment16.nextSibling();
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        comment16.outerHtmlTail(appendable20, (int) (short) -1, outputSettings22);
        java.lang.String str25 = comment16.attr("\n<!--hi!-->");
        java.lang.String str26 = comment16.outerHtml();
        java.lang.String str27 = comment16.toString();
        java.lang.String str28 = comment16.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node13.after((org.jsoup.nodes.Node) comment16);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\n<!--hi!-->" + "'", str26, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\n<!--hi!-->" + "'", str27, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.root();
        java.lang.String str6 = comment2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        boolean boolean4 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node8 = comment7.root();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment7.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment7.asXmlDeclaration();
        org.jsoup.nodes.Document document11 = comment7.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment2.before((org.jsoup.nodes.Node) comment7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Node node4 = comment2.nextSibling();
        int int5 = comment2.siblingIndex();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable6, (int) (byte) -1, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node13 = comment2.wrap("\n<!--hi!-->");
        java.lang.String str15 = comment2.attr("");
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable16, (int) 'a', outputSettings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        boolean boolean7 = comment2.hasAttr("");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = node9.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.wrap("\n<!---->");
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
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        boolean boolean15 = node13.equals((java.lang.Object) 0L);
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean20 = comment18.hasSameValue((java.lang.Object) 1);
        boolean boolean21 = comment18.hasParent();
        boolean boolean23 = comment18.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean24 = comment18.isXmlDeclaration();
        org.jsoup.nodes.Node node25 = comment18.root();
        org.jsoup.nodes.Comment comment28 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node31 = comment28.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList32 = comment28.childNodes();
        boolean boolean33 = comment18.equals((java.lang.Object) comment28);
        java.lang.String str35 = comment28.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = node13.after((org.jsoup.nodes.Node) comment28);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        java.lang.String str7 = comment2.outerHtml();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable8, 10, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        org.jsoup.nodes.Document document7 = comment2.ownerDocument();
        org.jsoup.nodes.Node node10 = comment2.attr("hi!", "#comment");
        boolean boolean11 = comment2.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        org.jsoup.nodes.Node node6 = node5.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node5.clearAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.childNodes();
        java.lang.String str11 = comment2.outerHtml();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        java.lang.Class<?> wildcardClass5 = comment2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.after("\n<!--hi!-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
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
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        comment2.setBaseUri("\n<!---->");
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
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
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Comment comment4 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean6 = comment4.hasSameValue((java.lang.Object) 1);
        int int7 = comment4.siblingIndex();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean12 = comment10.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node13 = comment10.nextSibling();
        boolean boolean14 = comment4.equals((java.lang.Object) comment10);
        org.jsoup.nodes.Node node15 = comment4.root();
        boolean boolean16 = comment4.isXmlDeclaration();
        boolean boolean17 = comment4.hasParent();
        org.jsoup.nodes.Node node18 = comment4.root();
        // The following exception was thrown during execution in test generation
        try {
            comment1.replaceWith(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment2.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        boolean boolean14 = comment2.hasAttr("");
        java.lang.Class<?> wildcardClass15 = comment2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
        org.jsoup.nodes.Comment comment25 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str27 = comment25.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = comment25.childNodesCopy();
        boolean boolean29 = comment25.isXmlDeclaration();
        int int30 = comment25.childNodeSize();
        java.lang.Appendable appendable31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        comment25.outerHtmlTail(appendable31, (int) ' ', outputSettings33);
        boolean boolean36 = comment25.hasAttr("");
        org.jsoup.nodes.Comment comment39 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str40 = comment39.getData();
        org.jsoup.nodes.Document document41 = comment39.ownerDocument();
        org.jsoup.nodes.Comment comment44 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean46 = comment44.hasSameValue((java.lang.Object) 1);
        boolean boolean47 = comment44.hasParent();
        org.jsoup.nodes.Node node50 = comment44.attr("", "hi!");
        java.lang.String str52 = comment44.attr("");
        org.jsoup.nodes.Document document53 = comment44.ownerDocument();
        org.jsoup.nodes.Node node55 = comment44.removeAttr("#comment");
        java.lang.String str56 = comment44.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = comment44.childNodesCopy();
        boolean boolean58 = comment39.hasSameValue((java.lang.Object) nodeList57);
        boolean boolean59 = comment25.equals((java.lang.Object) comment39);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean60 = node22.equals((java.lang.Object) comment39);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNull(document41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNull(document53);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "#comment" + "'", str56, "#comment");
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        comment2.setBaseUri("\n<!---->");
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        boolean boolean11 = node8.equals((java.lang.Object) comment10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment10.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node2 = comment1.parentNode();
        org.jsoup.nodes.Node node3 = comment1.clone();
        org.jsoup.nodes.Node node4 = comment1.parentNode();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean9 = comment7.hasSameValue((java.lang.Object) 1);
        int int10 = comment7.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment7.siblingNodes();
        java.lang.String str12 = comment7.outerHtml();
        org.jsoup.nodes.Node node13 = comment7.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment1.after(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str9 = comment8.getData();
        org.jsoup.nodes.Document document10 = comment8.ownerDocument();
        org.jsoup.nodes.Node node13 = comment8.attr("", "");
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean18 = comment16.hasSameValue((java.lang.Object) 1);
        boolean boolean19 = comment16.hasParent();
        org.jsoup.nodes.Node node22 = comment16.attr("", "hi!");
        org.jsoup.nodes.Node node23 = node22.previousSibling();
        org.jsoup.nodes.Node node24 = node22.parentNode();
        boolean boolean25 = node13.hasSameValue((java.lang.Object) node22);
        org.jsoup.nodes.Node node26 = node13.shallowClone();
        node13.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = comment2.after("\n<!--hi!-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment2.wrap("#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        java.lang.String str7 = comment2.outerHtml();
        int int8 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean13 = comment11.hasSameValue((java.lang.Object) 1);
        boolean boolean14 = comment11.hasParent();
        org.jsoup.nodes.Node node17 = comment11.attr("", "hi!");
        org.jsoup.nodes.Node node18 = node17.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = node17.childNodes();
        boolean boolean20 = node17.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = comment2.before(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodesCopy();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        java.lang.String str12 = comment2.absUrl("hi!");
        int int13 = comment2.siblingIndex();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!---->");
        org.jsoup.select.NodeVisitor nodeVisitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = comment2.traverse(nodeVisitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        java.lang.String str11 = comment2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.siblingNodes();
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment2.traverse(nodeVisitor13);
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
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean25 = comment23.hasSameValue((java.lang.Object) 1);
        boolean boolean26 = comment23.hasParent();
        java.lang.String str28 = comment23.absUrl("hi!");
        org.jsoup.nodes.Node node30 = comment23.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = comment23.childNodes();
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
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(nodeList31);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
        java.lang.Class<?> wildcardClass16 = comment2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Document document6 = xmlDeclaration5.ownerDocument();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str10 = comment9.getData();
        org.jsoup.nodes.Document document11 = comment9.ownerDocument();
        org.jsoup.nodes.Node node14 = comment9.attr("", "");
        boolean boolean15 = comment9.isXmlDeclaration();
        org.jsoup.nodes.Attributes attributes16 = comment9.attributes();
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean21 = comment19.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node22 = comment19.nextSibling();
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        comment19.outerHtmlTail(appendable23, (int) (short) -1, outputSettings25);
        java.lang.String str27 = comment19.nodeName();
        boolean boolean28 = comment9.hasSameValue((java.lang.Object) comment19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = document6.after((org.jsoup.nodes.Node) comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#comment" + "'", str27, "#comment");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node14 = comment8.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node15 = comment8.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node15.before("");
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
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        comment2.setBaseUri("hi!");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable9, (int) '#', outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = node10.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        boolean boolean7 = comment2.hasAttr("");
        boolean boolean9 = comment2.hasAttr("#comment");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node14 = comment8.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node15 = node14.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = node15.getClass();
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
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!---->", "#comment");
        org.jsoup.nodes.Node node3 = comment2.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = node3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        org.jsoup.select.NodeFilter nodeFilter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node5.filter(nodeFilter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Attributes attributes2 = comment1.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = comment1.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes2);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        java.lang.String str6 = comment2.getData();
        org.jsoup.nodes.Document document7 = comment2.ownerDocument();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node11 = comment10.root();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment10.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = comment10.asXmlDeclaration();
        org.jsoup.nodes.Document document14 = comment10.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            document7.replaceWith((org.jsoup.nodes.Node) document14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(xmlDeclaration13);
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
        org.jsoup.nodes.Attributes attributes20 = comment2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = comment2.before("#comment");
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
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = comment2.after("");
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
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        boolean boolean9 = comment2.hasParent();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!---->");
        boolean boolean12 = comment2.hasParent();
        org.jsoup.nodes.Node node13 = comment2.shallowClone();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node18 = comment16.wrap("\n<!--hi!-->");
        boolean boolean19 = comment16.isXmlDeclaration();
        org.jsoup.nodes.Node node21 = comment16.wrap("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node13.after(node21);
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
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.attr("hi!", "");
        java.lang.String str10 = comment2.attr("");
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
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = comment7.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node23.before("\n<!--hi!-->");
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
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (int) (short) 1, outputSettings6);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment2.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Node node15 = comment2.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node15.unwrap();
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
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration6 = comment2.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment2.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(xmlDeclaration6);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        comment2.setBaseUri("\n<!---->");
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        boolean boolean11 = node8.equals((java.lang.Object) comment10);
        org.jsoup.nodes.Node node12 = node8.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = node12.ownerDocument();
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
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = comment2.before("\n<!---->");
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
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        comment2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.childNodesCopy();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
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
            org.jsoup.nodes.Node node18 = comment2.after("hi!");
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
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = comment2.before("\n<!--hi!-->");
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
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        int int5 = comment2.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = comment2.after("\n<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Node node4 = comment2.nextSibling();
        boolean boolean5 = comment2.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = comment2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        org.jsoup.nodes.Node node9 = node8.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node8.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.lang.String str5 = comment2.nodeName();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        java.lang.String str7 = node6.outerHtml();
        org.jsoup.nodes.Node node8 = node6.parent();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node6.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!---->" + "'", str7, "\n<!---->");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        org.jsoup.nodes.Node node6 = comment2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node6.before("\n<!--hi!-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        org.jsoup.nodes.Node node5 = comment2.shallowClone();
        org.jsoup.nodes.Node node6 = node5.root();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.siblingNodes();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str12 = comment10.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment10.childNodesCopy();
        boolean boolean14 = comment10.isXmlDeclaration();
        int int15 = comment10.childNodeSize();
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        comment10.outerHtmlTail(appendable16, (int) ' ', outputSettings18);
        java.lang.String str21 = comment10.absUrl("\n<!---->");
        org.jsoup.nodes.Node node22 = comment10.previousSibling();
        java.lang.String str24 = comment10.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node5.after((org.jsoup.nodes.Node) comment10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        int int3 = comment2.childNodeSize();
        org.jsoup.nodes.Node node4 = comment2.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
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
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        comment2.setBaseUri("\n<!---->");
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node8.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node13 = comment2.wrap("\n<!--hi!-->");
        org.jsoup.nodes.Node node16 = comment2.attr("hi!", "\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment2.after("#comment");
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
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodesCopy();
        org.jsoup.select.NodeVisitor nodeVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment2.traverse(nodeVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node4.after("\n<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node9.unwrap();
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
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
        org.jsoup.select.NodeFilter nodeFilter27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = node23.filter(nodeFilter27);
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
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = comment2.attributes();
        org.jsoup.nodes.Node node6 = comment2.parent();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean11 = comment9.hasSameValue((java.lang.Object) 1);
        boolean boolean12 = comment9.hasParent();
        boolean boolean14 = comment9.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean15 = comment9.isXmlDeclaration();
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        comment9.outerHtmlTail(appendable16, (int) (short) -1, outputSettings18);
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        org.jsoup.select.NodeFilter nodeFilter21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = comment2.filter(nodeFilter21);
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
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        org.jsoup.nodes.Node node5 = comment2.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node5.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        boolean boolean9 = comment2.hasParent();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment2.unwrap();
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
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment2.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        java.lang.String str8 = comment2.toString();
        java.lang.String str9 = comment2.nodeName();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean14 = comment12.hasSameValue((java.lang.Object) 1);
        int int15 = comment12.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment2.after((org.jsoup.nodes.Node) comment12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        org.jsoup.nodes.Node node8 = comment2.parent();
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
        int int9 = comment2.siblingIndex();
        java.lang.Class<?> wildcardClass10 = comment2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        boolean boolean9 = comment2.hasParent();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!---->");
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment14.childNodes();
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        comment14.outerHtmlTail(appendable16, (int) (short) 1, outputSettings18);
        org.jsoup.nodes.Node node20 = comment14.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            node11.replaceWith(node20);
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
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        org.jsoup.nodes.Document document9 = comment2.ownerDocument();
        org.jsoup.nodes.Document document10 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment2.after("#comment");
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
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        org.jsoup.nodes.Attributes attributes11 = comment2.attributes();
        boolean boolean12 = comment2.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment2.unwrap();
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
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
        org.jsoup.nodes.Node node19 = comment2.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str24 = comment22.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = comment22.childNodesCopy();
        org.jsoup.nodes.Node node28 = comment22.attr("#comment", "");
        org.jsoup.nodes.Node node29 = comment22.nextSibling();
        org.jsoup.nodes.Node node32 = comment22.attr("\n<!--hi!-->", "");
        org.jsoup.nodes.Node node33 = node32.shallowClone();
        org.jsoup.nodes.Node node34 = node33.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = node33.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = node19.before(node33);
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
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(nodeList35);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node22 = comment21.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = comment21.childNodesCopy();
        org.jsoup.nodes.Comment comment26 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = comment26.childNodes();
        org.jsoup.nodes.Node node28 = comment26.clone();
        org.jsoup.nodes.Node node29 = comment26.shallowClone();
        org.jsoup.nodes.Node node30 = node29.root();
        boolean boolean31 = comment21.equals((java.lang.Object) node30);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = comment2.before((org.jsoup.nodes.Node) comment21);
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
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        org.jsoup.nodes.Comment comment25 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = comment25.childNodes();
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        comment25.outerHtmlTail(appendable27, (int) (short) 1, outputSettings29);
        org.jsoup.nodes.Node node31 = comment25.parentNode();
        java.lang.Appendable appendable32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        comment25.outerHtmlTail(appendable32, 1, outputSettings34);
        org.jsoup.nodes.Node node36 = comment25.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            node7.replaceWith((org.jsoup.nodes.Node) comment25);
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
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node36);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        java.lang.String str11 = comment2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.siblingNodes();
        org.jsoup.nodes.Node node14 = comment2.removeAttr("hi!");
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
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.root();
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.traverse(nodeVisitor10);
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
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        org.jsoup.nodes.Node node13 = comment2.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.childNodes();
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
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        boolean boolean11 = comment2.hasAttr("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment2.wrap("#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = comment2.attributes();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        int int11 = comment8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment8.siblingNodes();
        java.lang.String str13 = comment8.outerHtml();
        org.jsoup.nodes.Node node14 = comment8.root();
        org.jsoup.nodes.Node node15 = comment8.root();
        java.lang.String str16 = comment8.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = comment2.after((org.jsoup.nodes.Node) comment8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Node node15 = comment2.shallowClone();
        boolean boolean16 = node15.hasParent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.root();
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        org.jsoup.nodes.Node node12 = comment2.attr("\n<!---->", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node12.unwrap();
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
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        org.jsoup.nodes.Node node13 = comment2.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = node13.getClass();
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
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        java.lang.String str7 = comment2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment2.childNodesCopy();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean13 = comment11.hasAttr("hi!");
        org.jsoup.nodes.Node node14 = comment11.parentNode();
        int int15 = comment11.siblingIndex();
        org.jsoup.nodes.Node node17 = comment11.removeAttr("#comment");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment2.before((org.jsoup.nodes.Node) comment11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        boolean boolean5 = comment2.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        org.jsoup.nodes.Node node13 = comment2.clone();
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
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = comment2.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
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
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        org.jsoup.nodes.Node node13 = comment2.clone();
        int int14 = comment2.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment2.before("\n<!---->");
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
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = comment8.after("#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
        org.jsoup.nodes.Node node17 = comment2.parentNode();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        java.lang.String str6 = comment2.getData();
        java.lang.String str7 = comment2.baseUri();
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
            org.jsoup.nodes.Node node23 = comment2.after(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
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
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        boolean boolean4 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment2.clone();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment8.siblingNodes();
        java.lang.String str13 = comment8.toString();
        org.jsoup.nodes.Node node14 = comment8.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment2.after(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment2.childNodesCopy();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str16 = comment14.absUrl("hi!");
        java.lang.String str17 = comment14.nodeName();
        org.jsoup.nodes.Node node19 = comment14.removeAttr("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#comment" + "'", str17, "#comment");
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Document document9 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = document9.shallowClone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean7 = comment2.hasAttr("");
        org.jsoup.nodes.Node node8 = comment2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node8.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.lang.String str5 = comment2.nodeName();
        org.jsoup.nodes.Node node7 = comment2.removeAttr("\n<!--hi!-->");
        java.lang.String str8 = comment2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!---->" + "'", str8, "\n<!---->");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.lang.String str5 = comment2.nodeName();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        org.jsoup.nodes.Node node7 = comment2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.wrap("\n<!--\n<!---->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean9 = comment7.hasSameValue((java.lang.Object) 1);
        boolean boolean10 = comment7.hasParent();
        org.jsoup.nodes.Node node13 = comment7.attr("", "hi!");
        java.lang.String str15 = comment7.attr("");
        org.jsoup.nodes.Document document16 = comment7.ownerDocument();
        org.jsoup.nodes.Node node18 = comment7.removeAttr("#comment");
        java.lang.String str19 = comment7.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = comment7.childNodesCopy();
        boolean boolean21 = comment2.hasSameValue((java.lang.Object) nodeList20);
        org.jsoup.select.NodeVisitor nodeVisitor22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = comment2.traverse(nodeVisitor22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#comment" + "'", str19, "#comment");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, 100, outputSettings8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node14 = comment8.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node15 = comment8.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = node15.hasParent();
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
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        boolean boolean9 = comment2.hasParent();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!---->");
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean16 = comment14.hasSameValue((java.lang.Object) 1);
        int int17 = comment14.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = comment14.siblingNodes();
        java.lang.String str19 = comment14.outerHtml();
        org.jsoup.nodes.Node node20 = comment14.root();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node20.siblingNodes();
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("");
        int int24 = comment23.siblingIndex();
        boolean boolean25 = node20.equals((java.lang.Object) comment23);
        // The following exception was thrown during execution in test generation
        try {
            node11.replaceWith(node20);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<!--hi!-->" + "'", str19, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        org.jsoup.nodes.Document document7 = comment2.ownerDocument();
        org.jsoup.nodes.Node node10 = comment2.attr("hi!", "#comment");
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node14 = comment13.clearAttributes();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str18 = comment17.getData();
        org.jsoup.nodes.Document document19 = comment17.ownerDocument();
        org.jsoup.nodes.Node node22 = comment17.attr("", "");
        org.jsoup.nodes.Comment comment25 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean27 = comment25.hasSameValue((java.lang.Object) 1);
        boolean boolean28 = comment25.hasParent();
        org.jsoup.nodes.Node node31 = comment25.attr("", "hi!");
        org.jsoup.nodes.Node node32 = node31.previousSibling();
        org.jsoup.nodes.Node node33 = node31.parentNode();
        boolean boolean34 = node22.hasSameValue((java.lang.Object) node31);
        org.jsoup.nodes.Node node35 = node22.shallowClone();
        org.jsoup.nodes.Node node36 = node22.parent();
        boolean boolean37 = comment13.hasSameValue((java.lang.Object) node36);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = node10.after(node36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
        java.lang.Appendable appendable32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment15.outerHtmlHead(appendable32, (int) (short) 100, outputSettings34);
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
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.lang.String str4 = comment2.getData();
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        org.jsoup.nodes.Node node7 = comment2.clearAttributes();
        int int8 = node7.siblingIndex();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList25 = node24.childNodesCopy();
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
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment2.after("hi!");
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
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        boolean boolean8 = comment2.hasSameValue((java.lang.Object) (short) 100);
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean10 = comment2.equals(obj9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = comment2.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Node node4 = comment2.nextSibling();
        boolean boolean5 = comment2.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = comment2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = comment2.clearAttributes();
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
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
        int int20 = node19.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node19.after("hi!");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node5.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node19.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str22 = comment21.getData();
        org.jsoup.nodes.Document document23 = comment21.ownerDocument();
        org.jsoup.nodes.Node node26 = comment21.attr("", "");
        boolean boolean27 = comment21.isXmlDeclaration();
        org.jsoup.nodes.Node node28 = comment21.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node18.before((org.jsoup.nodes.Node) comment21);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        org.jsoup.nodes.Node node5 = comment2.shallowClone();
        org.jsoup.nodes.Node node7 = comment2.removeAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
            java.util.List<org.jsoup.nodes.Node> nodeList15 = document14.childNodes();
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
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Document document6 = xmlDeclaration5.ownerDocument();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment9.childNodesCopy();
        java.lang.String str11 = comment9.nodeName();
        java.lang.String str12 = comment9.outerHtml();
        org.jsoup.nodes.Node node13 = comment9.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = document6.hasSameValue((java.lang.Object) comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#comment" + "'", str11, "#comment");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!---->" + "'", str12, "\n<!---->");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.toString();
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        java.lang.String str9 = comment2.baseUri();
        java.lang.String str10 = comment2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node3 = comment2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = comment2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        int int11 = comment2.siblingIndex();
        org.jsoup.nodes.Node node12 = comment2.shallowClone();
        org.jsoup.nodes.Node node13 = node12.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.after("\n<!--\n<!---->-->");
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
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        org.jsoup.nodes.Node node9 = comment2.attr("hi!", "#comment");
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        comment2.setBaseUri("\n<!---->");
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        boolean boolean11 = node8.equals((java.lang.Object) comment10);
        org.jsoup.nodes.Node node12 = node8.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node12.clone();
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
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        org.jsoup.nodes.Node node18 = node15.parentNode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!---->" + "'", str17, "\n<!---->");
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
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
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        java.lang.String str8 = comment2.toString();
        java.lang.String str9 = comment2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        java.lang.String str12 = comment2.absUrl("hi!");
        int int13 = comment2.siblingIndex();
        java.lang.String str14 = comment2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        int int7 = comment2.childNodeSize();
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node12 = comment11.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment11.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = node8.equals((java.lang.Object) comment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        int int11 = comment2.siblingIndex();
        org.jsoup.nodes.Node node12 = comment2.shallowClone();
        org.jsoup.nodes.Node node13 = node12.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node12.before("\n<!--\n<!---->-->");
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
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        org.jsoup.nodes.Node node6 = comment2.clone();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment9.childNodes();
        org.jsoup.nodes.Node node11 = comment9.clone();
        org.jsoup.nodes.Node node12 = comment9.shallowClone();
        org.jsoup.nodes.Node node13 = node12.root();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node12.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node6.before(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        int int7 = comment2.childNodeSize();
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node3 = comment2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = comment2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        java.lang.String str3 = comment2.getData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        org.jsoup.nodes.Node node18 = node17.nextSibling();
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
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment9.childNodes();
        java.lang.String str11 = comment9.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment2.before((org.jsoup.nodes.Node) comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        boolean boolean11 = comment2.hasAttr("#comment");
        java.lang.String str12 = comment2.getData();
        boolean boolean14 = comment2.hasAttr("");
        java.lang.Class<?> wildcardClass15 = comment2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = comment2.after("\n<!--hi!-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        java.lang.String str8 = comment2.toString();
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
        org.jsoup.nodes.Node node9 = node8.root();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node13 = comment12.root();
        boolean boolean14 = comment12.isXmlDeclaration();
        org.jsoup.nodes.Node node15 = comment12.clone();
        // The following exception was thrown during execution in test generation
        try {
            node8.replaceWith((org.jsoup.nodes.Node) comment12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        org.jsoup.select.NodeVisitor nodeVisitor24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node20.traverse(nodeVisitor24);
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
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n<!--hi!-->" + "'", str23, "\n<!--hi!-->");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node13.after("\n<!---->");
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
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node5.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        comment2.setBaseUri("\n<!--hi!-->");
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean16 = comment14.hasSameValue((java.lang.Object) 1);
        int int17 = comment14.siblingIndex();
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        comment14.outerHtmlTail(appendable18, 100, outputSettings20);
        java.lang.String str23 = comment14.absUrl("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = comment2.before((org.jsoup.nodes.Node) comment14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = comment2.before("\n<!--hi!-->");
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
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment2.outerHtmlTail(appendable10, 100, outputSettings12);
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str17 = comment15.attr("#comment");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment2.before((org.jsoup.nodes.Node) comment15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        java.lang.String str6 = comment2.getData();
        java.lang.String str7 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.clone();
        org.jsoup.nodes.Document document9 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = document9.clearAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        java.lang.String str4 = comment2.nodeName();
        java.lang.String str5 = comment2.outerHtml();
        org.jsoup.nodes.Node node6 = comment2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node6.root();
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
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.childNodes();
        org.jsoup.nodes.Node node12 = node10.parentNode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "#comment");
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean13 = comment11.hasAttr("hi!");
        org.jsoup.nodes.Node node14 = comment11.parentNode();
        int int15 = comment11.siblingIndex();
        org.jsoup.nodes.Node node17 = comment11.removeAttr("#comment");
        org.jsoup.nodes.Node node18 = comment11.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node8.after((org.jsoup.nodes.Node) comment11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
        org.jsoup.select.NodeVisitor nodeVisitor22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = comment12.traverse(nodeVisitor22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
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
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        comment2.setBaseUri("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment2.siblingNodes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.root();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        java.lang.String str9 = comment8.nodeName();
        boolean boolean10 = node5.equals((java.lang.Object) comment8);
        boolean boolean11 = node5.hasParent();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean16 = comment14.hasSameValue((java.lang.Object) 1);
        boolean boolean17 = comment14.hasParent();
        java.lang.String str19 = comment14.absUrl("hi!");
        org.jsoup.nodes.Node node20 = comment14.parentNode();
        comment14.setBaseUri("\n<!--hi!-->");
        org.jsoup.nodes.Attributes attributes23 = comment14.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node5.after((org.jsoup.nodes.Node) comment14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(attributes23);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        org.jsoup.nodes.Node node7 = comment2.parent();
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
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
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean3 = comment2.isXmlDeclaration();
        boolean boolean4 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node6 = comment2.removeAttr("");
        java.lang.String str8 = comment2.attr("\n<!--hi!-->");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable9, (int) (short) 10, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment2.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        java.lang.String str4 = comment2.nodeName();
        java.lang.String str5 = comment2.outerHtml();
        org.jsoup.select.NodeFilter nodeFilter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = comment2.filter(nodeFilter6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#comment" + "'", str4, "#comment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!---->" + "'", str5, "\n<!---->");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node3 = comment2.clearAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = node3.childNodes();
        org.jsoup.select.NodeFilter nodeFilter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node3.filter(nodeFilter5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        org.jsoup.nodes.Attributes attributes3 = comment2.attributes();
        org.junit.Assert.assertNotNull(attributes3);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = comment2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.toString();
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node8.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        int int6 = comment2.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment2.before("\n<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.lang.String str4 = comment2.getData();
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        org.jsoup.nodes.Node node7 = comment2.clearAttributes();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean12 = comment10.hasSameValue((java.lang.Object) 1);
        int int13 = comment10.siblingIndex();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean18 = comment16.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node19 = comment16.nextSibling();
        boolean boolean20 = comment10.equals((java.lang.Object) comment16);
        org.jsoup.nodes.Node node21 = comment10.root();
        boolean boolean22 = comment10.isXmlDeclaration();
        boolean boolean23 = comment10.hasParent();
        boolean boolean24 = comment10.isXmlDeclaration();
        org.jsoup.nodes.Node node25 = comment10.clearAttributes();
        int int26 = comment10.childNodeSize();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        java.lang.String str4 = comment2.nodeName();
        java.lang.String str5 = comment2.outerHtml();
        org.jsoup.nodes.Node node6 = comment2.previousSibling();
        org.jsoup.select.NodeFilter nodeFilter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node6.filter(nodeFilter7);
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
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        comment2.outerHtmlTail(appendable9, (int) (short) -1, outputSettings11);
        java.lang.String str13 = comment2.baseUri();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        org.jsoup.select.NodeFilter nodeFilter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.filter(nodeFilter10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("");
        boolean boolean2 = comment1.hasParent();
        java.lang.String str3 = comment1.nodeName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node2 = comment1.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList3 = node2.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = comment2.before("#comment");
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
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node19.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
        org.jsoup.select.NodeFilter nodeFilter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = comment8.filter(nodeFilter16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
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
        java.lang.String str18 = comment2.attr("\n<!---->");
        java.lang.Class<?> wildcardClass19 = comment2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#comment" + "'", str16, "#comment");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (int) (short) 1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        java.lang.String str9 = comment2.baseUri();
        org.jsoup.nodes.Node node10 = comment2.clone();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable11, (int) 'a', outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node2 = comment1.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = node2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
            org.jsoup.nodes.Node node14 = comment2.before("hi!");
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
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node13 = comment2.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment2.unwrap();
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
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node3 = comment2.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment2.after("\n<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str6 = comment5.getData();
        org.jsoup.nodes.Document document7 = comment5.ownerDocument();
        org.jsoup.nodes.Node node10 = comment5.attr("", "");
        java.lang.String str11 = comment5.getData();
        int int12 = comment5.siblingIndex();
        java.lang.String str14 = comment5.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment5.siblingNodes();
        java.lang.String str16 = comment5.getData();
        org.jsoup.nodes.Attributes attributes17 = comment5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        org.jsoup.nodes.Attributes attributes11 = comment2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Node node16 = comment2.removeAttr("");
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
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean7 = comment2.hasAttr("");
        org.jsoup.nodes.Node node8 = comment2.parent();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        comment2.outerHtmlTail(appendable9, (int) (short) -1, outputSettings11);
        org.jsoup.select.NodeFilter nodeFilter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment2.filter(nodeFilter13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "\n<!---->");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (int) '#', outputSettings5);
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable7, 0, outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        java.lang.String str11 = comment2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.siblingNodes();
        java.lang.Class<?> wildcardClass13 = comment2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Node node9 = comment2.root();
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
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable15, (-1), outputSettings17);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        org.jsoup.select.NodeVisitor nodeVisitor20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = comment11.traverse(nodeVisitor20);
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
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
        org.jsoup.nodes.Node node9 = node8.root();
        org.jsoup.nodes.Node node10 = node8.parentNode();
        org.jsoup.nodes.Node node11 = node8.shallowClone();
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
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        org.jsoup.nodes.Node node9 = node8.previousSibling();
        org.jsoup.nodes.Node node10 = node8.parentNode();
        org.jsoup.nodes.Node node12 = node8.wrap("\n<!--hi!-->");
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean17 = comment15.hasSameValue((java.lang.Object) 1);
        boolean boolean18 = comment15.hasParent();
        java.lang.String str20 = comment15.absUrl("hi!");
        org.jsoup.nodes.Node node22 = comment15.removeAttr("");
        java.lang.String str23 = comment15.toString();
        int int24 = comment15.siblingIndex();
        org.jsoup.nodes.Node node25 = comment15.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            node8.replaceWith((org.jsoup.nodes.Node) comment15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n<!--hi!-->" + "'", str23, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable7, (-1), outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = comment2.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment2.unwrap();
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
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        java.lang.String str6 = comment2.getData();
        java.lang.String str7 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.clone();
        org.jsoup.nodes.Document document9 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = document9.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        boolean boolean34 = comment12.hasAttr("");
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        org.jsoup.nodes.Comment comment24 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = comment24.childNodes();
        org.jsoup.nodes.Node node26 = comment24.clone();
        org.jsoup.nodes.Node node27 = node26.clone();
        org.jsoup.nodes.Node node28 = node27.parent();
        org.jsoup.nodes.Node node29 = node27.nextSibling();
        org.jsoup.nodes.Node node30 = node27.root();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith(node27);
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
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        boolean boolean5 = comment2.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = comment2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node13 = comment2.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        java.lang.String str25 = comment2.attr("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = comment2.childNode((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        org.jsoup.nodes.Node node5 = node4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = node5.childNodesCopy();
        int int7 = node5.siblingIndex();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        boolean boolean7 = comment2.hasAttr("#comment");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable8, (int) '4', outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str8 = comment2.attr("#comment");
        boolean boolean9 = comment2.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        org.jsoup.nodes.Node node13 = comment2.clone();
        org.jsoup.nodes.Node node14 = node13.root();
        org.jsoup.select.NodeFilter nodeFilter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node13.filter(nodeFilter15);
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
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        boolean boolean4 = comment2.isXmlDeclaration();
        java.lang.String str5 = comment2.nodeName();
        org.jsoup.select.NodeFilter nodeFilter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = comment2.filter(nodeFilter6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.String str4 = comment2.outerHtml();
        org.jsoup.nodes.Node node5 = comment2.previousSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable6, (int) (short) 0, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.root();
        org.jsoup.nodes.Node node9 = comment2.root();
        java.lang.String str10 = comment2.getData();
        org.jsoup.nodes.Node node13 = comment2.attr("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
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
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        boolean boolean4 = comment2.isXmlDeclaration();
        java.lang.String str5 = comment2.nodeName();
        java.lang.String str6 = comment2.nodeName();
        java.lang.Class<?> wildcardClass7 = comment2.getClass();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#comment" + "'", str6, "#comment");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Document document9 = comment2.ownerDocument();
        org.jsoup.nodes.Attributes attributes10 = comment2.attributes();
        java.lang.Class<?> wildcardClass11 = comment2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        org.jsoup.nodes.Node node6 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node6.childNodesCopy();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        org.jsoup.nodes.Node node17 = comment8.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node17.nextSibling();
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
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("");
        java.lang.String str2 = comment1.nodeName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#comment" + "'", str2, "#comment");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = comment16.before("\n<!---->");
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
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        org.jsoup.nodes.Node node7 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            node7.remove();
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
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Document document9 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.lang.String str5 = comment2.nodeName();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        org.jsoup.nodes.Node node7 = comment2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = node7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node2 = comment1.previousSibling();
        int int3 = comment1.siblingIndex();
        boolean boolean4 = comment1.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = comment1.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node13 = comment2.wrap("\n<!--hi!-->");
        org.jsoup.nodes.Node node14 = comment2.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node14.childNodesCopy();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
        java.lang.Class<?> wildcardClass24 = comment2.getClass();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.lang.String str5 = comment2.nodeName();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        boolean boolean7 = node6.hasParent();
        org.jsoup.nodes.Node node8 = node6.clearAttributes();
        org.jsoup.nodes.Node node9 = node8.parentNode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
        java.lang.String str22 = comment1.nodeName();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#comment" + "'", str22, "#comment");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.toString();
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        int int9 = comment2.childNodeSize();
        comment2.setBaseUri("\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node12 = comment2.clearAttributes();
        java.lang.String str14 = comment2.absUrl("\n<!--\n<!---->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment2.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.String str4 = comment2.outerHtml();
        org.jsoup.nodes.Node node5 = comment2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node5.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        java.lang.String str4 = comment2.nodeName();
        java.lang.String str5 = comment2.outerHtml();
        org.jsoup.nodes.Node node6 = comment2.previousSibling();
        boolean boolean8 = comment2.hasSameValue((java.lang.Object) 10L);
        org.jsoup.nodes.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = comment2.before(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#comment" + "'", str4, "#comment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!---->" + "'", str5, "\n<!---->");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.String str5 = comment2.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = comment2.before("\n<!--hi!-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean20 = comment18.hasSameValue((java.lang.Object) 1);
        int int21 = comment18.siblingIndex();
        org.jsoup.nodes.Comment comment24 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean26 = comment24.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node27 = comment24.nextSibling();
        boolean boolean28 = comment18.equals((java.lang.Object) comment24);
        org.jsoup.nodes.Node node30 = comment24.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node31 = comment24.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            node15.replaceWith((org.jsoup.nodes.Node) comment24);
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
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        org.jsoup.select.NodeFilter nodeFilter20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = comment6.filter(nodeFilter20);
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
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.String str4 = comment2.outerHtml();
        org.jsoup.nodes.Node node5 = comment2.previousSibling();
        comment2.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable16, (int) 'a', outputSettings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        org.jsoup.nodes.Node node19 = comment2.previousSibling();
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
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node13 = comment2.root();
        org.jsoup.nodes.Node node14 = comment2.shallowClone();
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.traverse(nodeVisitor15);
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
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = comment2.absUrl("");
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
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        comment2.setBaseUri("\n<!--hi!-->");
        org.jsoup.nodes.Node node14 = comment2.attr("", "#comment");
        org.jsoup.nodes.Node node15 = node14.nextSibling();
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str20 = comment18.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = comment18.childNodesCopy();
        boolean boolean23 = comment18.hasAttr("");
        org.jsoup.nodes.Node node24 = comment18.parent();
        org.jsoup.nodes.Comment comment27 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str29 = comment27.absUrl("hi!");
        java.lang.String str30 = comment27.nodeName();
        org.jsoup.nodes.Node node31 = comment27.shallowClone();
        boolean boolean32 = comment18.hasSameValue((java.lang.Object) node31);
        org.jsoup.nodes.Node node33 = comment18.shallowClone();
        java.lang.String str35 = comment18.attr("\n<!--\n<!---->-->");
        // The following exception was thrown during execution in test generation
        try {
            node15.replaceWith((org.jsoup.nodes.Node) comment18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#comment" + "'", str30, "#comment");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
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
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        java.lang.String str6 = comment2.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = comment2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        boolean boolean11 = comment2.hasAttr("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment2.after("\n<!--\n<!---->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        java.lang.String str6 = comment2.getData();
        java.lang.String str7 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        org.jsoup.nodes.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node8.after(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        java.lang.Class<?> wildcardClass4 = comment2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        boolean boolean11 = comment2.hasAttr("#comment");
        java.lang.String str12 = comment2.getData();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment2.siblingNodes();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable14, (int) (short) 0, outputSettings16);
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
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        boolean boolean8 = comment2.hasAttr("#comment");
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.root();
        org.jsoup.nodes.Node node9 = comment2.root();
        java.lang.String str10 = comment2.getData();
        org.jsoup.nodes.Node node13 = comment2.attr("hi!", "hi!");
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean18 = comment16.hasSameValue((java.lang.Object) 1);
        boolean boolean19 = comment16.hasParent();
        boolean boolean21 = comment16.hasSameValue((java.lang.Object) (byte) -1);
        java.lang.String str22 = comment16.getData();
        int int23 = comment16.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = comment2.after((org.jsoup.nodes.Node) comment16);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node4 = comment2.wrap("\n<!--hi!-->");
        boolean boolean5 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node7 = comment2.wrap("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        comment2.outerHtmlTail(appendable15, 100, outputSettings17);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        org.jsoup.select.NodeVisitor nodeVisitor24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = comment2.traverse(nodeVisitor24);
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
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean11 = comment9.hasSameValue((java.lang.Object) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment9.siblingNodes();
        boolean boolean13 = comment2.equals((java.lang.Object) nodeList12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment2.clearAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node23.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        boolean boolean9 = comment2.hasParent();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!---->");
        boolean boolean12 = comment2.hasParent();
        org.jsoup.nodes.Node node13 = comment2.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment2.childNode((int) (byte) -1);
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
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        java.lang.String str11 = comment2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment2.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
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
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        java.lang.String str11 = comment2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.siblingNodes();
        int int13 = comment2.siblingIndex();
        java.lang.Class<?> wildcardClass14 = comment2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.lang.String str4 = comment2.getData();
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable6, (int) 'a', outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.root();
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        boolean boolean10 = comment2.isXmlDeclaration();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node3 = comment2.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = node3.before("#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        org.jsoup.nodes.Node node3 = comment2.parent();
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
            java.lang.String str21 = comment2.absUrl("");
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
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable20, (int) (short) 1, outputSettings22);
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
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        boolean boolean5 = comment2.hasSameValue((java.lang.Object) (byte) 10);
        org.jsoup.nodes.Attributes attributes6 = comment2.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean12 = comment10.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node13 = comment10.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment10.siblingNodes();
        java.lang.String str15 = comment10.toString();
        boolean boolean16 = comment10.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--hi!-->" + "'", str15, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        org.jsoup.select.NodeVisitor nodeVisitor17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment7.traverse(nodeVisitor17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        java.lang.Class<?> wildcardClass7 = comment2.getClass();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
}

