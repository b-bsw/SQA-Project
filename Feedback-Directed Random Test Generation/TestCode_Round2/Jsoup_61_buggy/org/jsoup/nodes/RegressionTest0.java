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
        org.jsoup.parser.Tag tag0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element2 = new org.jsoup.nodes.Element(tag0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jsoup.parser.Tag tag0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element2 = new org.jsoup.nodes.Element(tag0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jsoup.parser.Tag tag0 = null;
        org.jsoup.nodes.Attributes attributes2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag0, "", attributes2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jsoup.nodes.Node node0 = null;
        boolean boolean1 = org.jsoup.nodes.Element.preserveWhitespace(node0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jsoup.parser.Tag tag0 = null;
        org.jsoup.nodes.Attributes attributes2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag0, "hi!", attributes2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.NodeVisitor nodeVisitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = element2.traverse(nodeVisitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = element1.appendElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = element1.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            element3.outerHtmlHead(appendable4, 0, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = element1.getElementById("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            element5.outerHtmlHead(appendable6, (int) (short) 0, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.nodes.Element element6 = element1.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = element6.className();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            element1.outerHtmlHead(appendable4, (int) '#', outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        java.lang.Class<?> wildcardClass4 = element3.getClass();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        java.lang.String str3 = element1.outerHtml();
        org.jsoup.select.Evaluator evaluator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = element1.is(evaluator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<hi!></hi!>" + "'", str3, "<hi!></hi!>");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element5 = element1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = element5.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = element5.is("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!': unexpected token at '!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            element8.outerHtmlTail(appendable9, 1, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element3.getElementsByAttributeValueEnding("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        java.lang.String str5 = element1.attr("hi!");
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            element1.outerHtmlTail(appendable6, (int) (byte) -1, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element2.getElementsByAttributeValueEnding("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node5.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        org.jsoup.parser.Tag tag6 = element5.tag();
        org.jsoup.nodes.Attributes attributes8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag6, "hi!", attributes8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        int int6 = element3.siblingIndex();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element12 = element10.tagName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element3.before((org.jsoup.nodes.Node) element12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = node4.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.select.NodeVisitor nodeVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = element5.traverse(nodeVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        java.lang.String str6 = element2.tagName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = element2.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        org.jsoup.parser.Tag tag6 = element5.tag();
        java.lang.Class<?> wildcardClass7 = element5.getClass();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        int int6 = element3.siblingIndex();
        org.jsoup.select.Evaluator evaluator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = element3.is(evaluator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements5 = element2.getElementsByAttributeStarting("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.nodes.Element element6 = element1.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element6.getElementsByAttributeStarting("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = element1.after("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element2.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        java.lang.String str7 = element5.cssSelector();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element5.attr("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        java.lang.String str3 = element1.outerHtml();
        org.jsoup.nodes.Attributes attributes4 = element1.attributes();
        org.jsoup.select.NodeVisitor nodeVisitor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = element1.traverse(nodeVisitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<hi!></hi!>" + "'", str3, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(attributes4);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        java.lang.String str7 = element5.val();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element5.getElementsByAttribute("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        java.util.List<org.jsoup.nodes.Node> nodeList3 = element1.childNodesCopy();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element9 = element5.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = element9.dataset();
        org.jsoup.nodes.Element element12 = element9.tagName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            element1.replaceWith((org.jsoup.nodes.Node) element12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        java.lang.Class<?> wildcardClass4 = element2.getClass();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = element2.is("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!': unexpected token at '!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        java.lang.String str10 = element1.val();
        java.util.regex.Pattern pattern11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element1.getElementsMatchingOwnText(pattern11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = element1.classNames((java.util.Set<java.lang.String>) strSet9);
        // The following exception was thrown during execution in test generation
        try {
            element1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element5 = element1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.nodes.Element element6 = element1.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = element6.nodeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.nodes.Element element11 = element9.prepend("");
        java.lang.String str12 = element11.html();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = element11.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueMatching("<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements16 = element14.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element18 = element14.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = element18.dataset();
        org.jsoup.nodes.Element element21 = element18.tagName("hi!");
        org.jsoup.nodes.Element element23 = element21.prepend("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = element9.after((org.jsoup.nodes.Node) element21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.nodes.Element element6 = element1.previousElementSibling();
        org.jsoup.nodes.Element element7 = element1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes8 = element7.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.nodes.Element element11 = element9.prepend("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = element11.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node4 = element1.root();
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueContaining("<hi!></hi!>", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = element1.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        boolean boolean4 = element2.equals((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = element2.appendElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            element5.outerHtmlHead(appendable6, (int) (short) 10, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.prependText("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element10.prepend("");
        org.jsoup.nodes.Node node14 = element13.previousSibling();
        org.jsoup.select.Elements elements16 = element13.getElementsMatchingOwnText("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = element1.insertChildren((int) '4', (java.util.Collection<org.jsoup.nodes.Element>) elements16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element2.siblingNodes();
        java.util.regex.Pattern pattern9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element2.getElementsMatchingOwnText(pattern9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element10.prepend("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element15 = element12.attr("hi!", true);
        org.jsoup.select.Elements elements17 = element15.getElementsMatchingOwnText("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = element15.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = element1.classNames((java.util.Set<java.lang.String>) strSet9);
        java.lang.String str12 = element1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element1.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi! class=\"hi!\"></hi!>" + "'", str12, "<hi! class=\"hi!\"></hi!>");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.prepend("");
        org.jsoup.select.Elements elements12 = element8.siblingElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element1.insertChildren((int) ' ', (java.util.Collection<org.jsoup.nodes.Element>) elements12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        int int6 = element3.siblingIndex();
        org.jsoup.select.Elements elements8 = element3.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = element3.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = element5.after("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.removeClass("");
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingOwnText("hi!");
        boolean boolean8 = element3.equals((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element3.getElementsByAttributeValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.getElementById("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList6 = element5.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        org.jsoup.parser.Tag tag6 = element5.tag();
        java.lang.String str8 = element5.attr("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element5.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = element1.classNames((java.util.Set<java.lang.String>) strSet9);
        org.jsoup.nodes.Element element13 = element11.val("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element13.attr("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        java.lang.Object obj10 = null;
        boolean boolean11 = element2.equals(obj10);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element2.textNodes();
        boolean boolean13 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element2);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.removeClass("");
        java.lang.String str4 = element1.cssSelector();
        java.lang.String str5 = element1.data();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.nodes.Element element7 = element5.val("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element7.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = element5.is("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '': unexpected token at ''");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element12 = element2.attr("hi!", "");
        org.jsoup.parser.Tag tag13 = element2.tag();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element16 = element15.empty();
        java.lang.String str17 = element15.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element2.before((org.jsoup.nodes.Node) element15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<hi!></hi!>" + "'", str17, "<hi!></hi!>");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element8 = element2.appendText("hi!");
        org.jsoup.nodes.Element element9 = element2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element9.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueMatching("<hi!></hi!>", "<hi!></hi!>");
        java.lang.String str13 = element9.outerHtml();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>" + "'", str13, "<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = element8.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        java.lang.String str3 = element1.outerHtml();
        org.jsoup.nodes.Attributes attributes4 = element1.attributes();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element1.attr("", "<hi! class=\"hi!\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<hi!></hi!>" + "'", str3, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element8 = element2.appendText("hi!");
        org.jsoup.nodes.Element element9 = element2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element2.appendElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = element5.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            element5.outerHtmlHead(appendable9, (int) (short) -1, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.getElementById("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = element5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        org.jsoup.parser.Tag tag6 = element5.tag();
        java.lang.String str8 = element5.attr("<hi!></hi!>");
        java.util.regex.Pattern pattern9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element5.getElementsMatchingOwnText(pattern9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.nodes.Element element7 = element5.val("");
        org.jsoup.nodes.Document document8 = element7.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = document8.parents();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.nodes.Element element7 = element5.val("");
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = element5.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.removeClass("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueStarting("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        java.util.regex.Pattern pattern6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = element5.getElementsMatchingOwnText(pattern6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = element6.prependText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            element6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.nodes.Node node6 = element5.previousSibling();
        java.lang.Integer int7 = element5.elementSiblingIndex();
        org.jsoup.select.Elements elements10 = element5.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element5.getElementById("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        org.jsoup.select.NodeVisitor nodeVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = element1.traverse(nodeVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        boolean boolean5 = element2.hasClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = element2.select("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!></hi!>': unexpected token at '<hi!></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.nodes.Node node6 = element5.previousSibling();
        org.jsoup.select.Elements elements8 = element5.getElementsContainingText("<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element5.prepend("hi!");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            element10.outerHtmlTail(appendable11, (int) (byte) 100, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.nodes.Element element6 = element1.previousElementSibling();
        org.jsoup.nodes.Element element7 = element1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element7.html("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element8 = element2.appendText("hi!");
        org.jsoup.nodes.Element element9 = element2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = element2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = element1.classNames((java.util.Set<java.lang.String>) strSet9);
        java.lang.String str12 = element1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element1.before("<hi! class=\"hi!\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi! class=\"hi!\"></hi!>" + "'", str12, "<hi! class=\"hi!\"></hi!>");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        java.lang.String str7 = element5.cssSelector();
        java.util.regex.Pattern pattern9 = null;
        org.jsoup.select.Elements elements10 = element5.getElementsByAttributeValueMatching("", pattern9);
        org.jsoup.nodes.Element element12 = element5.getElementById("<hi! class=\"hi!\"></hi!>");
        java.util.regex.Pattern pattern13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element12.getElementsMatchingOwnText(pattern13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element13 = element9.tagName("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = element9.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element20 = element5.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element23 = element22.empty();
        org.jsoup.select.Elements elements24 = element22.parents();
        org.jsoup.nodes.Node node25 = element22.nextSibling();
        org.jsoup.nodes.Element element27 = element22.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList28 = element22.dataNodes();
        org.jsoup.nodes.Element element30 = element22.val("hi!");
        org.jsoup.nodes.Element element32 = element30.prepend("");
        // The following exception was thrown during execution in test generation
        try {
            element5.replaceWith((org.jsoup.nodes.Node) element32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(dataNodeList28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.nodes.Node node6 = element5.previousSibling();
        org.jsoup.select.Elements elements8 = element5.getElementsContainingText("<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element5.prepend("hi!");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.select.Elements elements14 = element12.parents();
        org.jsoup.nodes.Node node15 = element12.nextSibling();
        org.jsoup.nodes.Element element17 = element12.addClass("<hi!></hi!>");
        org.jsoup.parser.Tag tag18 = element12.tag();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element22 = element21.empty();
        java.lang.String str23 = element21.outerHtml();
        org.jsoup.nodes.Attributes attributes24 = element21.attributes();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag18, "hi!", attributes24);
        org.jsoup.select.Elements elements26 = element25.siblingElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element27 = element5.after((org.jsoup.nodes.Node) element25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<hi!></hi!>" + "'", str23, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element13 = element9.tagName("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = element9.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element20 = element5.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element23 = element5.attr("<hi! class=\"hi!\"></hi!>", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = element23.after("<hi! class=\"hi!\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        java.lang.String str6 = element2.tagName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element2.getElementsByAttribute("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.prependText("<hi!></hi!>");
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            element1.outerHtmlTail(appendable7, (int) (short) 0, outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.parser.Tag tag8 = element2.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        java.util.regex.Pattern pattern11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element10.getElementsMatchingText(pattern11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        java.lang.String str3 = element1.outerHtml();
        org.jsoup.nodes.Attributes attributes4 = element1.attributes();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element10 = element7.prepend("");
        org.jsoup.select.Elements elements12 = element7.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Element element13 = element1.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.nodes.Element element14 = element7.clone();
        org.jsoup.select.Evaluator evaluator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = element14.is(evaluator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<hi!></hi!>" + "'", str3, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        org.jsoup.parser.Tag tag6 = element5.tag();
        org.jsoup.nodes.Element element8 = element5.addClass("<hi! class=\"hi!\"></hi!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            element5.outerHtmlHead(appendable9, (int) 'a', outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingOwnText("hi!");
        boolean boolean12 = element9.hasText();
        org.jsoup.nodes.Node node13 = element9.parentNode();
        org.jsoup.nodes.Element element14 = element9.previousElementSibling();
        org.jsoup.nodes.Element element15 = element9.parent();
        boolean boolean16 = element7.hasSameValue((java.lang.Object) element9);
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element20 = element19.empty();
        org.jsoup.nodes.Element element21 = element20.empty();
        org.jsoup.nodes.Element element23 = element20.prepend("");
        org.jsoup.select.Elements elements25 = element23.getElementsContainingOwnText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element26 = element9.insertChildren(10, (java.util.Collection<org.jsoup.nodes.Element>) elements25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements10 = element2.children();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Element element14 = element13.empty();
        org.jsoup.nodes.Element element16 = element13.append("<hi!></hi!>");
        org.jsoup.nodes.Element element18 = element16.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element21 = element20.empty();
        org.jsoup.nodes.Element element22 = element21.empty();
        org.jsoup.nodes.Element element24 = element22.tagName("hi!");
        org.jsoup.nodes.Element element26 = element24.val("");
        org.jsoup.nodes.Element element27 = element18.prependChild((org.jsoup.nodes.Node) element26);
        java.lang.String[] strArray30 = new java.lang.String[] { "<hi! class=\"hi!\"></hi!>", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        org.jsoup.nodes.Element element33 = element18.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element34 = element2.classNames((java.util.Set<java.lang.String>) strSet31);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element36 = element2.child(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "<hi! class=\"hi!\"></hi!>", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        java.lang.String[] strArray19 = new java.lang.String[] { "<hi! class=\"hi!\"></hi!>", "" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        org.jsoup.nodes.Element element22 = element7.classNames((java.util.Set<java.lang.String>) strSet20);
        org.jsoup.select.Elements elements23 = element22.parents();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = element22.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "<hi! class=\"hi!\"></hi!>", "" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        int int5 = element1.childNodeSize();
        java.lang.String str6 = element1.html();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element1.getElementsByTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements10 = element2.children();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Element element14 = element13.empty();
        org.jsoup.nodes.Element element16 = element13.append("<hi!></hi!>");
        org.jsoup.nodes.Element element18 = element16.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element21 = element20.empty();
        org.jsoup.nodes.Element element22 = element21.empty();
        org.jsoup.nodes.Element element24 = element22.tagName("hi!");
        org.jsoup.nodes.Element element26 = element24.val("");
        org.jsoup.nodes.Element element27 = element18.prependChild((org.jsoup.nodes.Node) element26);
        java.lang.String[] strArray30 = new java.lang.String[] { "<hi! class=\"hi!\"></hi!>", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        org.jsoup.nodes.Element element33 = element18.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element34 = element2.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.select.Elements elements35 = element34.getAllElements();
        java.lang.Class<?> wildcardClass36 = elements35.getClass();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "<hi! class=\"hi!\"></hi!>", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element12 = element2.attr("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element12.getElementsByAttributeValueContaining("", "<hi! class=\"hi!\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.nodes.Element element8 = element2.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueStarting("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = element1.classNames((java.util.Set<java.lang.String>) strSet9);
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element14 = element13.empty();
        org.jsoup.select.Elements elements15 = element13.parents();
        org.jsoup.nodes.Node node16 = element13.nextSibling();
        org.jsoup.nodes.Element element18 = element13.prependText("<hi!></hi!>");
        org.jsoup.select.Elements elements20 = element13.getElementsByAttribute("<hi! class=\"<hi!></hi!>\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            element11.replaceWith((org.jsoup.nodes.Node) element13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueMatching("<hi!></hi!>", "<hi!></hi!>");
        java.util.regex.Pattern pattern13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element9.getElementsMatchingText(pattern13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        int int6 = element3.siblingIndex();
        org.jsoup.nodes.Node node7 = element3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element3.child((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element8 = element2.appendText("hi!");
        java.lang.String str9 = element8.nodeName();
        java.lang.String str10 = element8.cssSelector();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = element8.attr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node4 = element1.root();
        int int5 = node4.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            node4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.nodes.Element element6 = element1.previousElementSibling();
        org.jsoup.nodes.Element element7 = element1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element7.after("<hi! class=\"hi!\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.nodes.Element element11 = element9.prepend("");
        org.jsoup.nodes.Node node12 = element9.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            element9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        org.jsoup.parser.Tag tag6 = element5.tag();
        org.jsoup.select.Elements elements7 = element5.siblingElements();
        org.jsoup.nodes.Element element9 = element5.tagName("<hi! class=\"hi!\"></hi!>");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            element5.outerHtmlTail(appendable10, (int) (byte) -1, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        boolean boolean5 = element2.hasClass("hi!");
        java.lang.Integer int6 = element2.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element12 = element9.append("<hi!></hi!>");
        org.jsoup.nodes.Element element13 = element2.appendChild((org.jsoup.nodes.Node) element9);
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            element2.outerHtmlHead(appendable14, (int) (short) 10, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.nodes.Element element7 = element5.val("");
        org.jsoup.nodes.Document document8 = element7.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = document8.prependText("<hi! class=\"<hi!></hi!>\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element9 = element2.attr("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>", true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = element9.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        java.lang.String str10 = element1.val();
        int int11 = element1.siblingIndex();
        java.lang.Class<?> wildcardClass12 = element1.getClass();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jsoup.parser.Tag tag0 = null;
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element3.empty();
        org.jsoup.nodes.Element element5 = element4.empty();
        org.jsoup.nodes.Element element7 = element4.prepend("");
        org.jsoup.select.Elements elements8 = element4.siblingElements();
        org.jsoup.select.Elements elements9 = element4.getAllElements();
        org.jsoup.select.Elements elements11 = element4.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements12 = element4.children();
        org.jsoup.nodes.Attributes attributes13 = element4.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag0, "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>", attributes13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.select.Elements elements7 = element1.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        java.lang.String str11 = element9.outerHtml();
        org.jsoup.nodes.Attributes attributes12 = element9.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element15 = element14.empty();
        org.jsoup.nodes.Element element16 = element15.empty();
        org.jsoup.nodes.Element element18 = element15.prepend("");
        org.jsoup.select.Elements elements20 = element15.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Element element21 = element9.appendChild((org.jsoup.nodes.Node) element15);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element9.siblingNodes();
        org.jsoup.nodes.Element element23 = element9.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = element1.before((org.jsoup.nodes.Node) element23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi!></hi!>" + "'", str11, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements5 = element1.getElementsByAttributeValueEnding("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        java.lang.String str3 = element1.outerHtml();
        org.jsoup.nodes.Attributes attributes4 = element1.attributes();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element10 = element7.prepend("");
        org.jsoup.select.Elements elements12 = element10.getElementsContainingOwnText("hi!");
        int int13 = element10.childNodeSize();
        org.jsoup.nodes.Element element14 = element10.empty();
        // The following exception was thrown during execution in test generation
        try {
            element1.replaceWith((org.jsoup.nodes.Node) element14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<hi!></hi!>" + "'", str3, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Node node7 = element5.root();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements12 = element10.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element14 = element10.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = element14.dataset();
        org.jsoup.nodes.Element element17 = element14.tagName("hi!");
        org.jsoup.select.Elements elements19 = element17.getElementsMatchingOwnText("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = element5.insertChildren((int) (byte) 10, (java.util.Collection<org.jsoup.nodes.Element>) elements19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        java.lang.String str5 = element1.ownText();
        java.lang.Class<?> wildcardClass6 = element1.getClass();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element8.html("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element8.after("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.removeClass("");
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements7 = element5.parents();
        org.jsoup.nodes.Node node8 = element5.nextSibling();
        org.jsoup.nodes.Element element10 = element5.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList11 = element5.dataNodes();
        org.jsoup.nodes.Element element13 = element5.val("hi!");
        org.jsoup.nodes.Element element15 = element13.prepend("");
        org.jsoup.select.Elements elements17 = element13.getElementsByIndexGreaterThan((int) ' ');
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element13.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            element1.replaceWith((org.jsoup.nodes.Node) element13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(dataNodeList11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element13 = element9.tagName("hi!");
        java.lang.String str14 = element9.toString();
        org.jsoup.nodes.Element element15 = element5.appendChild((org.jsoup.nodes.Node) element9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = element15.is("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '': unexpected token at ''");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<hi!></hi!>" + "'", str14, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.select.Elements elements7 = element1.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element10.prepend("");
        org.jsoup.select.Elements elements14 = element10.siblingElements();
        org.jsoup.select.Elements elements15 = element10.getAllElements();
        org.jsoup.select.Elements elements17 = element10.getElementsByIndexLessThan((int) (short) -1);
        java.lang.Object obj18 = null;
        boolean boolean19 = element10.equals(obj18);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList20 = element10.textNodes();
        org.jsoup.nodes.Element element21 = element10.clone();
        org.jsoup.nodes.Element element23 = element10.html("<hi!></hi!>");
        org.jsoup.nodes.Element element24 = element1.prependChild((org.jsoup.nodes.Node) element23);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements27 = element23.getElementsByAttributeValueEnding("", "<hi! class=\"<hi!></hi!>\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(textNodeList20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        element5.setBaseUri("<hi!></hi!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            element5.outerHtmlHead(appendable9, (int) (byte) 10, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        java.lang.String str3 = element1.outerHtml();
        org.jsoup.nodes.Attributes attributes4 = element1.attributes();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element10 = element7.prepend("");
        org.jsoup.select.Elements elements12 = element7.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Element element13 = element1.appendChild((org.jsoup.nodes.Node) element7);
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element1.siblingNodes();
        org.jsoup.nodes.Element element15 = element1.empty();
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            element15.outerHtmlHead(appendable16, (int) (byte) 10, outputSettings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<hi!></hi!>" + "'", str3, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element13 = element9.toggleClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = element13.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element10.prepend("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Document document13 = element10.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = document13.getElementsByAttributeValueEnding("<hi! class=\"hi!\"></hi!>", "<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.nodes.Node node6 = element5.previousSibling();
        org.jsoup.select.Elements elements8 = element5.getElementsMatchingOwnText("<hi!></hi!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            element5.outerHtmlTail(appendable9, (int) 'a', outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.nodes.Node node6 = element5.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element5.after("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.select.Elements elements9 = element1.children();
        org.jsoup.nodes.Element element10 = element1.empty();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element1.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element1.select("<hi! class=\"hi!\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"hi!\"></hi!>': unexpected token at '<hi! class=\"hi!\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        org.jsoup.parser.Tag tag6 = element5.tag();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = element5.dataset();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element13 = element9.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = element13.dataset();
        org.jsoup.nodes.Element element16 = element13.tagName("hi!");
        org.jsoup.nodes.Element element18 = element16.prepend("hi!");
        org.jsoup.select.Elements elements20 = element16.getElementsMatchingOwnText("hi!");
        org.jsoup.nodes.Element element22 = element16.removeClass("");
        // The following exception was thrown during execution in test generation
        try {
            element5.replaceWith((org.jsoup.nodes.Node) element16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.nodes.Element element11 = element9.prepend("");
        java.lang.String str12 = element11.html();
        java.lang.String str13 = element11.val();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements17 = element15.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element19 = element15.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = element19.dataset();
        org.jsoup.nodes.Element element22 = element19.tagName("hi!");
        org.jsoup.select.Elements elements24 = element22.getElementsMatchingOwnText("");
        org.jsoup.nodes.Element element25 = element11.prependChild((org.jsoup.nodes.Node) element22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = element11.is("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>': unexpected token at '<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jsoup.parser.Tag tag0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element2 = new org.jsoup.nodes.Element(tag0, "<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            element1.outerHtmlTail(appendable10, 0, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jsoup.parser.Tag tag0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element2 = new org.jsoup.nodes.Element(tag0, "<hi! class=\"<hi!></hi!>\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.regex.Pattern pattern8 = null;
        org.jsoup.select.Elements elements9 = element1.getElementsByAttributeValueMatching("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>", pattern8);
        java.util.regex.Pattern pattern10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element1.getElementsMatchingText(pattern10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element10.prepend("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element15 = element12.attr("hi!", true);
        org.jsoup.select.Elements elements17 = element15.getElementsMatchingOwnText("<hi!></hi!>");
        org.jsoup.select.Evaluator evaluator18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = element15.is(evaluator18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.nodes.Element element8 = element2.nextElementSibling();
        org.jsoup.parser.Tag tag9 = element2.tag();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            element2.outerHtmlHead(appendable10, (int) (byte) -1, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        // The following exception was thrown during execution in test generation
        try {
            element1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.select.Elements elements7 = element5.getElementsByIndexLessThan((-1));
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element10.empty();
        java.lang.String str12 = element10.outerHtml();
        org.jsoup.nodes.Attributes attributes13 = element10.attributes();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element16 = element15.empty();
        org.jsoup.nodes.Element element17 = element16.empty();
        org.jsoup.nodes.Element element19 = element16.prepend("");
        org.jsoup.select.Elements elements21 = element16.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Element element22 = element10.appendChild((org.jsoup.nodes.Node) element16);
        java.util.List<org.jsoup.nodes.Node> nodeList23 = element10.siblingNodes();
        org.jsoup.nodes.Element element24 = element10.empty();
        org.jsoup.select.Elements elements25 = element10.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element26 = element5.insertChildren((int) 'a', (java.util.Collection<org.jsoup.nodes.Element>) elements25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi!></hi!>" + "'", str12, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        java.lang.String str3 = element1.outerHtml();
        org.jsoup.nodes.Attributes attributes4 = element1.attributes();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element10 = element7.prepend("");
        org.jsoup.select.Elements elements12 = element7.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Element element13 = element1.appendChild((org.jsoup.nodes.Node) element7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element7.getElementsByTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<hi!></hi!>" + "'", str3, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        java.lang.String str3 = element1.outerHtml();
        org.jsoup.nodes.Attributes attributes4 = element1.attributes();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element10 = element7.prepend("");
        org.jsoup.select.Elements elements12 = element7.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Element element13 = element1.appendChild((org.jsoup.nodes.Node) element7);
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element1.siblingNodes();
        org.jsoup.nodes.Element element15 = element1.empty();
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = element1.traverse(nodeVisitor16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<hi!></hi!>" + "'", str3, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element10.prepend("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element15 = element12.attr("hi!", true);
        org.jsoup.select.Elements elements16 = element15.children();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            element15.outerHtmlHead(appendable17, (int) (short) 1, outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element6.textNodes();
        java.lang.String str8 = element6.ownText();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element12 = element11.empty();
        org.jsoup.nodes.Element element14 = element11.prepend("");
        element11.setBaseUri("hi!");
        org.jsoup.nodes.Element element18 = element11.prepend("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element6.after((org.jsoup.nodes.Node) element11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(textNodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element8.html("");
        element12.setBaseUri("<hi! class=\"<hi!></hi!>\"></hi!>");
        boolean boolean15 = element12.hasText();
        org.jsoup.nodes.Element element17 = element12.removeClass("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element21 = element20.empty();
        org.jsoup.nodes.Element element22 = element21.empty();
        org.jsoup.nodes.Element element24 = element21.prepend("");
        org.jsoup.select.Elements elements25 = element21.children();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element26 = element12.insertChildren(10, (java.util.Collection<org.jsoup.nodes.Element>) elements25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.nodes.Element element7 = element5.val("");
        org.jsoup.nodes.Element element9 = element5.appendElement("<hi! class=\"<hi!></hi!>\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element5.getElementsByAttribute("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        boolean boolean12 = element8.hasClass("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        java.util.regex.Pattern pattern13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element8.getElementsMatchingText(pattern13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        boolean boolean18 = element7.hasClass("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element20 = element7.prependText("");
        org.jsoup.select.Elements elements21 = element20.children();
        boolean boolean23 = element20.hasAttr("<hi! class=\"<hi!></hi!>\"></hi!>");
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        // The following exception was thrown during execution in test generation
        try {
            element20.outerHtmlTail(appendable24, 0, outputSettings26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element9 = element2.attr("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>", true);
        org.jsoup.nodes.Element element12 = element2.attr("<hi! class=\"<hi!></hi!>\"></hi!>", "<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        org.jsoup.select.Elements elements15 = element12.getElementsByAttributeValueNot("<hi! class=\"<hi!></hi!>\"></hi!>", "hi!");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.regex.Pattern pattern7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element1.getElementsMatchingOwnText(pattern7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.nodes.Element element10 = element9.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element10.siblingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element10.prepend("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Document document13 = element10.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element10.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = element6.addClass("hi!");
        java.util.regex.Pattern pattern9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element8.getElementsMatchingText(pattern9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element13 = element9.tagName("hi!");
        org.jsoup.parser.Tag tag14 = element13.tag();
        org.jsoup.select.Elements elements15 = element13.siblingElements();
        org.jsoup.nodes.Element element17 = element13.tagName("<hi! class=\"hi!\"></hi!>");
        org.jsoup.select.Elements elements20 = element13.getElementsByAttributeValueMatching("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>", "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element21 = element5.insertChildren((int) (short) 10, (java.util.Collection<org.jsoup.nodes.Element>) elements20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        java.lang.Object obj10 = null;
        boolean boolean11 = element2.equals(obj10);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element2.textNodes();
        org.jsoup.nodes.Element element13 = element2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element13.child((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.prependText("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element12 = element8.tagName("hi!");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element8.classNames((java.util.Set<java.lang.String>) strSet16);
        java.util.Set<java.lang.String> strSet19 = element8.classNames();
        org.jsoup.nodes.Element element20 = element6.classNames(strSet19);
        org.jsoup.select.NodeVisitor nodeVisitor21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = element6.traverse(nodeVisitor21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements7 = element2.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Element element8 = element2.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = element8.ownText();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String str6 = element1.toString();
        org.jsoup.nodes.Element element8 = element1.toggleClass("<hi!></hi!>");
        java.lang.String str9 = element1.tagName();
        // The following exception was thrown during execution in test generation
        try {
            element1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi!></hi!>" + "'", str6, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        boolean boolean6 = element3.isBlock();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element3.select("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!': unexpected token at '!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element9 = element2.attr("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>", true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element2.select("hi!.<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!.<hi!></hi!>': unexpected token at '!.<hi!></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.nodes.Element element7 = element5.prependElement("hi!");
        org.jsoup.nodes.Node node8 = element5.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element5.childNodesCopy();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = element1.classNames((java.util.Set<java.lang.String>) strSet9);
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements15 = element13.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element17 = element13.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = element17.dataset();
        org.jsoup.nodes.Element element20 = element17.tagName("hi!");
        org.jsoup.nodes.Element element22 = element20.prepend("hi!");
        org.jsoup.nodes.Element element24 = element20.html("");
        // The following exception was thrown during execution in test generation
        try {
            element1.replaceWith((org.jsoup.nodes.Node) element20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element8.html("");
        java.lang.String str13 = element8.nodeName();
        org.jsoup.nodes.Element element14 = element8.previousElementSibling();
        boolean boolean15 = element8.hasText();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element13 = element9.tagName("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = element9.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element20 = element5.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element22 = element5.text("");
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements26 = element24.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element28 = element24.tagName("hi!");
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.jsoup.nodes.Element element34 = element24.classNames((java.util.Set<java.lang.String>) strSet32);
        org.jsoup.nodes.Element element36 = element34.val("<hi!></hi!>");
        org.jsoup.select.Elements elements39 = element34.getElementsByAttributeValueStarting("hi!", "<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element40 = element22.prependChild((org.jsoup.nodes.Node) element34);
        org.jsoup.nodes.Element element41 = element22.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = element41.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNull(element41);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        element2.setBaseUri("hi!");
        org.jsoup.nodes.Element element9 = element2.getElementById("hi!.<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueMatching("<hi! class=\"<hi!></hi!>\"></hi!>", "<hi! class=\"hi!\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String str6 = element1.toString();
        org.jsoup.nodes.Element element8 = element1.toggleClass("<hi!></hi!>");
        org.jsoup.nodes.Document document9 = element8.ownerDocument();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi!></hi!>" + "'", str6, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements9 = element7.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node10 = element7.root();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Element element14 = element13.empty();
        org.jsoup.nodes.Element element16 = element13.prepend("");
        org.jsoup.nodes.Node node17 = element16.previousSibling();
        org.jsoup.nodes.Element element18 = element7.appendChild((org.jsoup.nodes.Node) element16);
        org.jsoup.nodes.Element element19 = element16.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = element5.after((org.jsoup.nodes.Node) element19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        java.lang.String str10 = element1.val();
        org.jsoup.nodes.Element element12 = element1.prependText("");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element15 = element14.empty();
        org.jsoup.nodes.Element element16 = element15.empty();
        org.jsoup.nodes.Element element18 = element15.prepend("");
        org.jsoup.select.Elements elements19 = element15.siblingElements();
        org.jsoup.select.Elements elements20 = element15.getAllElements();
        org.jsoup.nodes.Element element22 = element15.appendElement("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element23 = element1.before((org.jsoup.nodes.Node) element22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.nodes.Element element8 = element2.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = element8.attr("<hi! class=\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements7 = element2.getElementsByIndexGreaterThan(10);
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element2.childNodes();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element12 = element11.empty();
        org.jsoup.nodes.Element element14 = element11.prepend("");
        org.jsoup.select.Elements elements15 = element11.siblingElements();
        org.jsoup.select.Elements elements16 = element11.getAllElements();
        org.jsoup.select.Elements elements18 = element11.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element21 = element11.attr("hi!", "");
        org.jsoup.nodes.Node node22 = element21.parentNode();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements26 = element24.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element28 = element24.tagName("hi!");
        org.jsoup.parser.Tag tag29 = element28.tag();
        org.jsoup.select.Elements elements30 = element28.siblingElements();
        org.jsoup.nodes.Element element32 = element28.tagName("<hi! class=\"hi!\"></hi!>");
        java.lang.String str33 = element28.outerHtml();
        org.jsoup.nodes.Element element34 = element21.appendChild((org.jsoup.nodes.Node) element28);
        java.lang.String str35 = element21.tagName();
        org.jsoup.nodes.Element element36 = element2.appendChild((org.jsoup.nodes.Node) element21);
        java.lang.Appendable appendable37 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = null;
        // The following exception was thrown during execution in test generation
        try {
            element36.outerHtmlTail(appendable37, (int) '#', outputSettings39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>" + "'", str33, "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(element36);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element9 = element5.addClass("<hi! class=\"\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueEnding("", "<hi! class=\"<hi!></hi!>\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element7.removeClass("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = node5.hasSameValue((java.lang.Object) element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        boolean boolean5 = element2.hasClass("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element2.dataset();
        org.jsoup.select.Elements elements8 = element2.getElementsByAttributeStarting("<hi! class=\"hi!\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = element2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element5.childNodesCopy();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element12 = element8.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = element12.dataset();
        org.jsoup.nodes.Element element15 = element12.tagName("hi!");
        org.jsoup.nodes.Element element17 = element15.prepend("hi!");
        org.jsoup.nodes.Element element19 = element17.prepend("<hi! class=\"<hi!></hi!>\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            element5.replaceWith((org.jsoup.nodes.Node) element17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element12 = element2.attr("hi!", "");
        org.jsoup.nodes.Node node13 = element12.parentNode();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements17 = element15.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element19 = element15.tagName("hi!");
        org.jsoup.parser.Tag tag20 = element19.tag();
        org.jsoup.select.Elements elements21 = element19.siblingElements();
        org.jsoup.nodes.Element element23 = element19.tagName("<hi! class=\"hi!\"></hi!>");
        java.lang.String str24 = element19.outerHtml();
        org.jsoup.nodes.Element element25 = element12.appendChild((org.jsoup.nodes.Node) element19);
        org.jsoup.nodes.Element element26 = element25.nextElementSibling();
        java.util.regex.Pattern pattern27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements28 = element25.getElementsMatchingText(pattern27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>" + "'", str24, "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNull(element26);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        java.lang.String str7 = element5.cssSelector();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element5.before("hi!.<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        java.lang.Integer int11 = element10.elementSiblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element10.before("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        boolean boolean5 = element2.hasClass("hi!");
        java.lang.Integer int6 = element2.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element12 = element9.append("<hi!></hi!>");
        org.jsoup.nodes.Element element13 = element2.appendChild((org.jsoup.nodes.Node) element9);
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            element9.outerHtmlTail(appendable14, (int) (byte) 0, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.childNodesCopy();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        boolean boolean13 = element10.hasClass("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = element10.dataset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element5.after((org.jsoup.nodes.Node) element10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node4 = element1.root();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element10 = element7.prepend("");
        org.jsoup.nodes.Node node11 = element10.previousSibling();
        org.jsoup.nodes.Element element12 = element1.appendChild((org.jsoup.nodes.Node) element10);
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements16 = element14.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element18 = element14.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = element18.dataset();
        org.jsoup.nodes.Element element21 = element18.tagName("hi!");
        org.jsoup.nodes.Element element23 = element21.prepend("hi!");
        org.jsoup.nodes.Element element25 = element23.prepend("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element28 = element25.attr("hi!", true);
        org.jsoup.nodes.Element element29 = element10.before((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element33 = element32.empty();
        org.jsoup.nodes.Element element34 = element33.empty();
        org.jsoup.nodes.Element element36 = element33.prepend("");
        org.jsoup.select.Elements elements37 = element33.siblingElements();
        org.jsoup.select.Elements elements38 = element33.getAllElements();
        org.jsoup.nodes.Element element39 = element29.insertChildren((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements38);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements42 = element29.getElementsByAttributeValueNot("<hi!></hi!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element39);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        java.lang.String str10 = element1.val();
        org.jsoup.nodes.Element element12 = element1.prependText("");
        // The following exception was thrown during execution in test generation
        try {
            element12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.children();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = element2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.childNodesCopy();
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = element5.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.nodes.Element element7 = element5.prependElement("hi!");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            element7.outerHtmlTail(appendable8, 100, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueMatching("<hi!></hi!>", "<hi!></hi!>");
        java.lang.String str13 = element9.cssSelector();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = element9.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.<hi!></hi!>" + "'", str13, "hi!.<hi!></hi!>");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        java.lang.String str6 = element2.tagName();
        java.lang.String str8 = element2.attr("hi!");
        org.jsoup.nodes.Element element10 = element2.removeClass("<hi!></hi!>");
        java.lang.String str11 = element10.cssSelector();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements15 = element13.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element17 = element13.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = element17.dataset();
        org.jsoup.nodes.Element element20 = element17.tagName("hi!");
        org.jsoup.nodes.Element element22 = element20.prepend("hi!");
        org.jsoup.nodes.Element element24 = element20.html("");
        java.lang.String str25 = element20.nodeName();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = element20.dataset();
        org.jsoup.select.Elements elements27 = element20.children();
        org.jsoup.select.Elements elements29 = element20.getElementsByIndexLessThan((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element30 = element10.after((org.jsoup.nodes.Node) element20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements29);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = element2.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node4 = element1.root();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element10 = element7.prepend("");
        org.jsoup.nodes.Node node11 = element10.previousSibling();
        org.jsoup.nodes.Element element12 = element1.appendChild((org.jsoup.nodes.Node) element10);
        org.jsoup.nodes.Element element13 = element10.empty();
        org.jsoup.nodes.Node node14 = element13.parentNode();
        element13.setBaseUri("<hi!></hi!>");
        java.lang.Class<?> wildcardClass17 = element13.getClass();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element13 = element9.tagName("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = element9.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element20 = element5.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element22 = element5.text("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = element22.is("hi!.<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!.<hi!></hi!>': unexpected token at '!.<hi!></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node4 = element1.root();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element10 = element8.tagName("hi!");
        org.jsoup.select.Elements elements11 = element10.parents();
        org.jsoup.nodes.Node node12 = element10.nextSibling();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements16 = element14.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element18 = element14.tagName("hi!");
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.jsoup.nodes.Element element24 = element14.classNames((java.util.Set<java.lang.String>) strSet22);
        org.jsoup.nodes.Element element25 = element10.classNames((java.util.Set<java.lang.String>) strSet22);
        boolean boolean26 = element1.equals((java.lang.Object) strSet22);
        java.util.List<org.jsoup.nodes.Node> nodeList27 = element1.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element29 = element1.before("<>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeList27);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node4 = element1.root();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element10 = element7.prepend("");
        org.jsoup.nodes.Node node11 = element10.previousSibling();
        org.jsoup.nodes.Element element12 = element1.appendChild((org.jsoup.nodes.Node) element10);
        org.jsoup.nodes.Element element13 = element10.empty();
        org.jsoup.nodes.Node node14 = element13.parentNode();
        element13.setBaseUri("<hi!></hi!>");
        org.jsoup.nodes.Document document17 = element13.ownerDocument();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(document17);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.select.Elements elements9 = element1.children();
        org.jsoup.nodes.Element element10 = element1.empty();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element1.childNodes();
        org.jsoup.nodes.Element element13 = element1.val("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        boolean boolean14 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            element5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = element1.classNames((java.util.Set<java.lang.String>) strSet9);
        org.jsoup.nodes.Element element13 = element1.removeClass("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element15 = element1.append("hi!");
        org.jsoup.select.Elements elements17 = element15.getElementsMatchingText("hi!.<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = element15.select("<hi! class=\"hi!\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"hi!\"></hi!>': unexpected token at '<hi! class=\"hi!\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node4 = element1.root();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element10 = element8.tagName("hi!");
        org.jsoup.select.Elements elements11 = element10.parents();
        org.jsoup.nodes.Node node12 = element10.nextSibling();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements16 = element14.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element18 = element14.tagName("hi!");
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.jsoup.nodes.Element element24 = element14.classNames((java.util.Set<java.lang.String>) strSet22);
        org.jsoup.nodes.Element element25 = element10.classNames((java.util.Set<java.lang.String>) strSet22);
        boolean boolean26 = element1.equals((java.lang.Object) strSet22);
        org.jsoup.nodes.Element element28 = element1.addClass("");
        boolean boolean30 = element1.hasClass("<>>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element13 = element9.tagName("hi!");
        java.lang.String str14 = element9.toString();
        org.jsoup.nodes.Element element15 = element5.appendChild((org.jsoup.nodes.Node) element9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = element9.is("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!></hi!>': unexpected token at '<hi!></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<hi!></hi!>" + "'", str14, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        java.lang.String str6 = element2.tagName();
        java.lang.String str8 = element2.attr("hi!");
        org.jsoup.nodes.Element element10 = element2.removeClass("<hi!></hi!>");
        java.lang.String str11 = element10.cssSelector();
        org.jsoup.nodes.Element element12 = element10.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element12.getElementsByIndexLessThan((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = element1.classNames((java.util.Set<java.lang.String>) strSet9);
        org.jsoup.nodes.Element element13 = element11.val("<hi!></hi!>");
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            element13.outerHtmlHead(appendable14, 1, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.nodes.Element element10 = element9.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = element10.absUrl("<hi! class=\"hi!\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node4 = element1.root();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element10 = element7.prepend("");
        org.jsoup.nodes.Node node11 = element10.previousSibling();
        org.jsoup.nodes.Element element12 = element1.appendChild((org.jsoup.nodes.Node) element10);
        java.lang.String str13 = element1.nodeName();
        org.jsoup.select.Elements elements15 = element1.getElementsByClass("hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element18 = element17.empty();
        org.jsoup.select.Elements elements19 = element17.parents();
        org.jsoup.nodes.Node node20 = element17.nextSibling();
        org.jsoup.nodes.Element element22 = element17.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList23 = element17.dataNodes();
        org.jsoup.nodes.Element element25 = element17.val("hi!");
        org.jsoup.nodes.Element element27 = element25.prepend("");
        org.jsoup.select.Elements elements29 = element25.getElementsByIndexGreaterThan((int) ' ');
        java.util.List<org.jsoup.nodes.Node> nodeList30 = element25.childNodes();
        org.jsoup.nodes.Element element32 = element25.getElementById("<hi! class=\"hi!\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element33 = element1.prependChild((org.jsoup.nodes.Node) element32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(dataNodeList23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNull(element32);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = element1.classNames((java.util.Set<java.lang.String>) strSet9);
        org.jsoup.nodes.Element element13 = element11.val("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = element11.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element8 = element2.appendText("hi!");
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueEnding("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>", "<hi! class=\"hi!\"></hi!>");
        java.lang.String str12 = element8.nodeName();
        org.jsoup.select.Evaluator evaluator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = element8.is(evaluator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element9 = element5.addClass("<hi! class=\"\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = element9.attr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.prependText("<hi!></hi!>");
        org.jsoup.nodes.Node node7 = element6.previousSibling();
        org.jsoup.nodes.Element element9 = element6.text("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element6.after("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element12 = element2.attr("hi!", "");
        org.jsoup.parser.Tag tag13 = element2.tag();
        boolean boolean14 = element2.hasText();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element17 = element16.empty();
        org.jsoup.nodes.Element element18 = element17.empty();
        org.jsoup.nodes.Element element20 = element17.prepend("");
        java.lang.String str21 = element17.tagName();
        java.lang.String str23 = element17.attr("hi!");
        org.jsoup.nodes.Element element25 = element17.removeClass("<hi!></hi!>");
        java.lang.String str26 = element25.cssSelector();
        // The following exception was thrown during execution in test generation
        try {
            element2.replaceWith((org.jsoup.nodes.Node) element25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node3 = element1.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element13 = element9.tagName("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = element9.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element20 = element5.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element23 = element5.attr("<hi! class=\"hi!\"></hi!>", false);
        org.jsoup.nodes.Element element24 = element23.parent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = element24.hasClass("<hi! class=\"hi!\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNull(element24);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        boolean boolean11 = element2.hasAttr("");
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            element2.outerHtmlHead(appendable12, 0, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.nodes.Element element7 = element5.prependElement("hi!");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Element element10 = element7.getElementById("<>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element10.wrap("<hi!>\n hi!\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element8 = element2.appendText("hi!");
        org.jsoup.nodes.Element element9 = element2.clone();
        org.jsoup.nodes.Element element11 = element9.html("");
        java.lang.Class<?> wildcardClass12 = element11.getClass();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node4 = element1.root();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element10 = element7.prepend("");
        org.jsoup.nodes.Node node11 = element10.previousSibling();
        org.jsoup.nodes.Element element12 = element1.appendChild((org.jsoup.nodes.Node) element10);
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements16 = element14.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element18 = element14.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = element18.dataset();
        org.jsoup.nodes.Element element21 = element18.tagName("hi!");
        org.jsoup.nodes.Element element23 = element21.prepend("hi!");
        org.jsoup.nodes.Element element25 = element23.prepend("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element28 = element25.attr("hi!", true);
        org.jsoup.nodes.Element element29 = element10.before((org.jsoup.nodes.Node) element25);
        java.util.regex.Pattern pattern30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements31 = element10.getElementsMatchingText(pattern30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.prependText("<hi!></hi!>");
        org.jsoup.select.Elements elements9 = element1.getElementsByAttributeValueContaining("<hi! class=\"hi!\"></hi!>", "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element12 = element11.empty();
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Element element15 = element13.tagName("hi!");
        org.jsoup.nodes.Node node17 = element15.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element1.after(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        java.lang.String str3 = element1.data();
        java.lang.String str4 = element1.ownText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element1.getElementsByAttributeStarting("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = element5.getElementById("<hi! class=\"hi!\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element9.getElementsByTag("<hi! class=\"<hi!></hi!>\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.select.Elements elements7 = element1.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element10.prepend("");
        org.jsoup.select.Elements elements14 = element10.siblingElements();
        org.jsoup.select.Elements elements15 = element10.getAllElements();
        org.jsoup.select.Elements elements17 = element10.getElementsByIndexLessThan((int) (short) -1);
        java.lang.Object obj18 = null;
        boolean boolean19 = element10.equals(obj18);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList20 = element10.textNodes();
        org.jsoup.nodes.Element element21 = element10.clone();
        org.jsoup.nodes.Element element23 = element10.html("<hi!></hi!>");
        org.jsoup.nodes.Element element24 = element1.prependChild((org.jsoup.nodes.Node) element23);
        org.jsoup.select.Elements elements26 = element24.getElementsContainingText("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.select.Evaluator evaluator27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = element24.is(evaluator27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(textNodeList20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        // The following exception was thrown during execution in test generation
        try {
            element10.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        boolean boolean6 = element3.isBlock();
        org.jsoup.select.Elements elements7 = element3.children();
        org.jsoup.nodes.Element element8 = element3.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes9 = element8.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node4 = element1.root();
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueContaining("<hi!></hi!>", "hi!");
        java.util.regex.Pattern pattern8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element1.getElementsMatchingOwnText(pattern8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        java.lang.String str3 = element1.outerHtml();
        org.jsoup.nodes.Attributes attributes4 = element1.attributes();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element10 = element7.prepend("");
        org.jsoup.select.Elements elements12 = element7.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Element element13 = element1.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = element7.traverse(nodeVisitor14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<hi!></hi!>" + "'", str3, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        java.lang.String str10 = element1.val();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements14 = element12.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element16 = element12.tagName("hi!");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        org.jsoup.nodes.Element element22 = element12.classNames((java.util.Set<java.lang.String>) strSet20);
        java.util.Set<java.lang.String> strSet23 = element12.classNames();
        org.jsoup.nodes.Element element24 = element1.classNames(strSet23);
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements28 = element26.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element30 = element26.tagName("hi!");
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.jsoup.nodes.Element element36 = element26.classNames((java.util.Set<java.lang.String>) strSet34);
        org.jsoup.nodes.Element element38 = element26.removeClass("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element40 = element26.append("hi!");
        boolean boolean41 = element24.hasSameValue((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element10.tagName("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.select.Elements elements15 = element10.getElementsByAttributeValue("<hi! class=\"\"></hi!>", "<hi! class=\"<hi!></hi!>\"></hi!>");
        java.util.regex.Pattern pattern16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = element10.getElementsMatchingText(pattern16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        java.lang.String[] strArray19 = new java.lang.String[] { "<hi! class=\"hi!\"></hi!>", "" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        org.jsoup.nodes.Element element22 = element7.classNames((java.util.Set<java.lang.String>) strSet20);
        org.jsoup.select.Elements elements23 = element22.parents();
        org.jsoup.nodes.Node node24 = element22.nextSibling();
        org.jsoup.select.Elements elements26 = element22.getElementsContainingText("<hi! class=\"hi!\"></hi!>");
        org.jsoup.select.Elements elements28 = element22.getElementsByTag("hi!");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "<hi! class=\"hi!\"></hi!>", "" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements28);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements7 = element2.getElementsByIndexGreaterThan(10);
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            element2.outerHtmlHead(appendable8, (int) '#', outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element13 = element9.tagName("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = element9.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element20 = element5.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element22 = element5.text("");
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        // The following exception was thrown during execution in test generation
        try {
            element22.outerHtmlTail(appendable23, (int) (short) 10, outputSettings25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!></hi!>");
        java.util.regex.Pattern pattern2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements3 = element1.getElementsMatchingOwnText(pattern2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.nodes.Element element11 = element9.tagName("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element15 = element14.empty();
        org.jsoup.nodes.Element element16 = element15.empty();
        org.jsoup.nodes.Element element18 = element15.prepend("");
        org.jsoup.select.Elements elements19 = element15.siblingElements();
        org.jsoup.select.Elements elements20 = element15.getAllElements();
        org.jsoup.select.Elements elements22 = element15.getElementsByIndexLessThan((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element23 = element9.insertChildren((int) '#', (java.util.Collection<org.jsoup.nodes.Element>) elements22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        java.lang.String str7 = element5.cssSelector();
        java.util.regex.Pattern pattern9 = null;
        org.jsoup.select.Elements elements10 = element5.getElementsByAttributeValueMatching("", pattern9);
        java.lang.String str11 = element5.outerHtml();
        org.jsoup.nodes.Element element13 = element5.text("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = element5.getElementsByAttributeValueNot("<hi!></hi!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi!></hi!>" + "'", str11, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        java.lang.Object obj10 = null;
        boolean boolean11 = element2.equals(obj10);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element2.textNodes();
        java.util.regex.Pattern pattern14 = null;
        org.jsoup.select.Elements elements15 = element2.getElementsByAttributeValueMatching("hi!", pattern14);
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element2.child((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueMatching("<hi!></hi!>", "<hi!></hi!>");
        java.lang.String str13 = element9.cssSelector();
        org.jsoup.select.Elements elements15 = element9.getElementsByAttribute("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element9.childNodesCopy();
        java.lang.String str17 = element9.toString();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.<hi!></hi!>" + "'", str13, "hi!.<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>" + "'", str17, "<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        java.lang.String str6 = element2.ownText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element2.before("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element10.tagName("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.select.Elements elements14 = element12.getElementsContainingText("hi!.<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element8 = element2.appendText("hi!");
        org.jsoup.nodes.Element element9 = element2.clone();
        java.lang.String str10 = element9.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element9.appendElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str10, "<hi!>\n hi!\n</hi!>");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = element5.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element8.val("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.nodes.Element element6 = element1.previousElementSibling();
        org.jsoup.select.Elements elements7 = element1.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element1.select("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>': unexpected token at '<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        org.jsoup.parser.Tag tag6 = element5.tag();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = element5.dataset();
        org.jsoup.nodes.Element element9 = element5.text("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = element9.is("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>': unexpected token at '<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element10.prepend("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element15 = element12.attr("hi!", true);
        java.lang.String str16 = element12.cssSelector();
        org.jsoup.nodes.Element element18 = element12.child(0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements21 = element12.getElementsByAttributeValueNot("", "<hi! class=\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        int int5 = element1.childNodeSize();
        java.lang.String str6 = element1.html();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element12 = element10.tagName("hi!");
        org.jsoup.nodes.Element element14 = element12.val("");
        org.jsoup.nodes.Document document15 = element14.ownerDocument();
        boolean boolean16 = element1.equals((java.lang.Object) document15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList17 = document15.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element12 = element2.attr("hi!", "");
        org.jsoup.nodes.Node node13 = element12.parentNode();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements17 = element15.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element19 = element15.tagName("hi!");
        org.jsoup.parser.Tag tag20 = element19.tag();
        org.jsoup.select.Elements elements21 = element19.siblingElements();
        org.jsoup.nodes.Element element23 = element19.tagName("<hi! class=\"hi!\"></hi!>");
        java.lang.String str24 = element19.outerHtml();
        org.jsoup.nodes.Element element25 = element12.appendChild((org.jsoup.nodes.Node) element19);
        java.util.List<org.jsoup.nodes.Node> nodeList26 = element12.childNodesCopy();
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        // The following exception was thrown during execution in test generation
        try {
            element12.outerHtmlHead(appendable27, (int) (short) 100, outputSettings29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>" + "'", str24, "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(nodeList26);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element12 = element2.attr("hi!", "");
        org.jsoup.nodes.Node node13 = element12.parentNode();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements17 = element15.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element19 = element15.tagName("hi!");
        org.jsoup.parser.Tag tag20 = element19.tag();
        org.jsoup.select.Elements elements21 = element19.siblingElements();
        org.jsoup.nodes.Element element23 = element19.tagName("<hi! class=\"hi!\"></hi!>");
        java.lang.String str24 = element19.outerHtml();
        org.jsoup.nodes.Element element25 = element12.appendChild((org.jsoup.nodes.Node) element19);
        org.jsoup.select.Elements elements27 = element12.getElementsMatchingOwnText("<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>" + "'", str24, "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element8 = element2.appendText("hi!");
        java.lang.String str9 = element8.nodeName();
        org.jsoup.nodes.Element element10 = element8.clone();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = element10.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        java.lang.String str8 = element5.data();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String str6 = element1.toString();
        org.jsoup.nodes.Element element8 = element1.toggleClass("<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element1.append("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element1.after("<hi! class=\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi!></hi!>" + "'", str6, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingOwnText("hi!");
        java.lang.String str8 = element5.nodeName();
        org.jsoup.nodes.Element element10 = element5.prepend("<hi! class=\"\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element5.child((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        boolean boolean18 = element7.hasClass("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element20 = element7.prependText("");
        org.jsoup.nodes.Element element22 = element20.prepend("");
        org.jsoup.select.NodeVisitor nodeVisitor23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = element22.traverse(nodeVisitor23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element9.tagName("hi!");
        org.jsoup.select.Elements elements12 = element11.parents();
        org.jsoup.nodes.Node node13 = element11.nextSibling();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements17 = element15.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element19 = element15.tagName("hi!");
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        org.jsoup.nodes.Element element25 = element15.classNames((java.util.Set<java.lang.String>) strSet23);
        org.jsoup.nodes.Element element26 = element11.classNames((java.util.Set<java.lang.String>) strSet23);
        org.jsoup.nodes.Element element27 = element2.classNames((java.util.Set<java.lang.String>) strSet23);
        org.jsoup.parser.Tag tag28 = element2.tag();
        java.lang.Appendable appendable29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        // The following exception was thrown during execution in test generation
        try {
            element2.outerHtmlTail(appendable29, 0, outputSettings31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(tag28);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.removeClass("");
        org.jsoup.nodes.Element element5 = element1.appendElement("<>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = element1.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.parser.Tag tag8 = element2.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexGreaterThan((int) (byte) 0);
        org.jsoup.nodes.Element element14 = element10.appendText("hi!");
        org.jsoup.select.Elements elements16 = element14.getElementsByIndexGreaterThan((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = element14.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        java.util.regex.Pattern pattern4 = null;
        org.jsoup.select.Elements elements5 = element1.getElementsByAttributeValueMatching("<hi!></hi!>", pattern4);
        java.lang.String str6 = element1.html();
        org.jsoup.nodes.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element1.prependChild(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        java.lang.Object obj10 = null;
        boolean boolean11 = element2.equals(obj10);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element2.textNodes();
        java.util.regex.Pattern pattern14 = null;
        org.jsoup.select.Elements elements15 = element2.getElementsByAttributeValueMatching("hi!", pattern14);
        java.lang.String str16 = element2.id();
        // The following exception was thrown during execution in test generation
        try {
            element2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.nodes.Element element7 = element2.text("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element7.child((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        java.lang.String str6 = element2.ownText();
        java.lang.String str8 = element2.attr("<hi! class=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.prependText("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element12 = element8.tagName("hi!");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element8.classNames((java.util.Set<java.lang.String>) strSet16);
        java.util.Set<java.lang.String> strSet19 = element8.classNames();
        org.jsoup.nodes.Element element20 = element6.classNames(strSet19);
        element6.setBaseUri("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements24 = element6.select("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!': unexpected token at '!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.parser.Tag tag8 = element2.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexGreaterThan((int) (byte) 0);
        org.jsoup.nodes.Element element14 = element10.appendText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element14.before("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element10.prepend("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element15 = element12.attr("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = element15.before("<hi! class=\"hi!\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element8 = element2.appendText("hi!");
        org.jsoup.nodes.Element element9 = element2.clone();
        java.lang.String str11 = element9.attr("hi!.<hi!></hi!>");
        org.jsoup.nodes.Node node12 = element9.parentNode();
        java.util.regex.Pattern pattern13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element9.getElementsMatchingOwnText(pattern13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.nodes.Element element10 = element9.parent();
        org.jsoup.select.Elements elements11 = element9.getAllElements();
        boolean boolean12 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element9);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingOwnText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = element5.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element9 = element5.addClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Document document10 = element9.ownerDocument();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        java.lang.String str7 = element5.cssSelector();
        org.jsoup.select.Elements elements8 = element5.parents();
        org.jsoup.nodes.Element element9 = element5.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = element9.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.select.Elements elements9 = element1.children();
        boolean boolean10 = element1.hasText();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        java.util.regex.Pattern pattern4 = null;
        org.jsoup.select.Elements elements5 = element1.getElementsByAttributeValueMatching("<hi!></hi!>", pattern4);
        org.jsoup.select.Elements elements7 = element1.getElementsByIndexLessThan((int) (short) 1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        org.jsoup.parser.Tag tag7 = element1.tag();
        boolean boolean9 = element1.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            element1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        org.jsoup.parser.Tag tag7 = element1.tag();
        org.jsoup.nodes.Element element9 = element1.append("<hi! class=\"hi!\"></hi!>");
        java.util.regex.Pattern pattern10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element9.getElementsMatchingOwnText(pattern10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element8.html("");
        java.lang.String str13 = element8.nodeName();
        org.jsoup.nodes.Element element14 = element8.previousElementSibling();
        org.jsoup.nodes.Element element15 = element8.empty();
        org.jsoup.nodes.Node node16 = element8.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node16.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element12 = element2.attr("hi!", "");
        java.lang.String str13 = element2.text();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        boolean boolean11 = element2.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = element2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        java.lang.String str6 = element2.tagName();
        java.lang.String str8 = element2.attr("hi!");
        org.jsoup.nodes.Element element10 = element2.removeClass("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = element2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = element1.classNames((java.util.Set<java.lang.String>) strSet9);
        java.lang.String str12 = element1.toString();
        boolean boolean14 = element1.hasAttr("");
        java.lang.String str15 = element1.data();
        org.jsoup.select.Evaluator evaluator16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = element1.is(evaluator16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi! class=\"hi!\"></hi!>" + "'", str12, "<hi! class=\"hi!\"></hi!>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element8 = element2.appendText("hi!");
        java.lang.String str9 = element8.nodeName();
        java.lang.String str10 = element8.cssSelector();
        java.lang.String str11 = element8.ownText();
        java.lang.Class<?> wildcardClass12 = element8.getClass();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = element1.classNames((java.util.Set<java.lang.String>) strSet9);
        java.util.Set<java.lang.String> strSet12 = element1.classNames();
        org.jsoup.nodes.Element element14 = element1.getElementById("<hi!></hi!>");
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element17 = element16.empty();
        org.jsoup.nodes.Element element18 = element17.empty();
        org.jsoup.nodes.Element element20 = element18.tagName("hi!");
        org.jsoup.nodes.Element element22 = element20.val("");
        org.jsoup.nodes.Document document23 = element22.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = element14.appendChild((org.jsoup.nodes.Node) element22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNull(document23);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.nodes.Node node6 = element5.previousSibling();
        org.jsoup.select.Elements elements8 = element5.getElementsContainingText("<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element5.prepend("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = element10.is("<hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>': unexpected token at '<hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.appendText("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element1.attr("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.select.Elements elements12 = element8.getElementsMatchingOwnText("hi!");
        org.jsoup.nodes.Element element14 = element8.removeClass("");
        int int15 = element8.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = element8.is("hi!.<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!.<hi!></hi!>': unexpected token at '!.<hi!></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.parser.Tag tag8 = element2.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        org.jsoup.select.Elements elements11 = element10.getAllElements();
        boolean boolean13 = element10.hasClass("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element15 = element10.text("<hi! class=\"hi!\"></hi!>");
        org.jsoup.select.Elements elements18 = element15.getElementsByAttributeValueStarting("<hi!></hi!>", "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element10.prepend("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Node node14 = element10.removeAttr("<hi! class=\"\"></hi!>");
        java.lang.String str15 = element10.baseUri();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.nodes.Element element8 = element2.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element8.append("<>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements10 = element2.children();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Element element14 = element13.empty();
        org.jsoup.nodes.Element element16 = element13.append("<hi!></hi!>");
        org.jsoup.nodes.Element element18 = element16.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element21 = element20.empty();
        org.jsoup.nodes.Element element22 = element21.empty();
        org.jsoup.nodes.Element element24 = element22.tagName("hi!");
        org.jsoup.nodes.Element element26 = element24.val("");
        org.jsoup.nodes.Element element27 = element18.prependChild((org.jsoup.nodes.Node) element26);
        java.lang.String[] strArray30 = new java.lang.String[] { "<hi! class=\"hi!\"></hi!>", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        org.jsoup.nodes.Element element33 = element18.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element34 = element2.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.select.Elements elements35 = element34.getAllElements();
        org.jsoup.select.Evaluator evaluator36 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = element34.is(evaluator36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "<hi! class=\"hi!\"></hi!>", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(elements35);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingOwnText("");
        boolean boolean11 = element8.isBlock();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element8.textNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element8.after("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(textNodeList12);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        java.lang.String str3 = element1.data();
        java.lang.String str4 = element1.ownText();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.select.Elements elements8 = element6.parents();
        org.jsoup.nodes.Node node9 = element6.nextSibling();
        org.jsoup.nodes.Element element11 = element6.addClass("<hi!></hi!>");
        org.jsoup.parser.Tag tag12 = element6.tag();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element16 = element15.empty();
        java.lang.String str17 = element15.outerHtml();
        org.jsoup.nodes.Attributes attributes18 = element15.attributes();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag12, "hi!", attributes18);
        java.lang.String str20 = element19.className();
        org.jsoup.nodes.Element element21 = element19.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = element1.before((org.jsoup.nodes.Node) element19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<hi!></hi!>" + "'", str17, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.children();
        org.jsoup.nodes.Element element8 = element2.text("<hi! class=\"hi!\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element2.tagName("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Tag name must not be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        org.jsoup.parser.Tag tag6 = element5.tag();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = element5.dataset();
        org.jsoup.nodes.Element element9 = element5.text("hi!");
        java.lang.Integer int10 = element9.elementSiblingIndex();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Element element18 = element16.toggleClass("");
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements22 = element20.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element24 = element20.tagName("hi!");
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        org.jsoup.nodes.Element element30 = element20.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Element element31 = element16.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Attributes attributes32 = element16.attributes();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(attributes32);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        boolean boolean18 = element7.hasClass("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element20 = element7.prependText("");
        org.jsoup.nodes.Element element22 = element20.prepend("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements25 = element20.getElementsByAttributeValue("<hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        java.lang.String str3 = element1.outerHtml();
        org.jsoup.nodes.Attributes attributes4 = element1.attributes();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element10 = element7.prepend("");
        org.jsoup.select.Elements elements12 = element7.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Element element13 = element1.appendChild((org.jsoup.nodes.Node) element7);
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element1.siblingNodes();
        org.jsoup.nodes.Element element15 = element1.empty();
        org.jsoup.select.Elements elements16 = element1.getAllElements();
        java.lang.String str17 = element1.outerHtml();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<hi!></hi!>" + "'", str3, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<hi!></hi!>" + "'", str17, "<hi!></hi!>");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        int int5 = element1.childNodeSize();
        java.util.regex.Pattern pattern6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = element1.getElementsMatchingOwnText(pattern6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        org.jsoup.parser.Tag tag6 = element5.tag();
        org.jsoup.select.Elements elements7 = element5.siblingElements();
        org.jsoup.nodes.Element element9 = element5.tagName("<hi! class=\"hi!\"></hi!>");
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueMatching("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>", "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element16 = element15.empty();
        org.jsoup.nodes.Element element17 = element16.empty();
        org.jsoup.nodes.Element element19 = element17.tagName("hi!");
        org.jsoup.select.Elements elements20 = element19.parents();
        org.jsoup.nodes.Node node21 = element19.nextSibling();
        org.jsoup.nodes.Element element23 = element19.appendText("<hi!></hi!>");
        java.lang.String str24 = element19.cssSelector();
        org.jsoup.select.Elements elements25 = element19.parents();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element26 = element5.insertChildren((int) (byte) 1, (java.util.Collection<org.jsoup.nodes.Element>) elements25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        java.lang.Object obj10 = null;
        boolean boolean11 = element2.equals(obj10);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element2.textNodes();
        java.util.regex.Pattern pattern14 = null;
        org.jsoup.select.Elements elements15 = element2.getElementsByAttributeValueMatching("hi!", pattern14);
        boolean boolean17 = element2.equals((java.lang.Object) 1.0d);
        element2.setBaseUri("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = element2.is("hi!.<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!.<hi!></hi!>': unexpected token at '!.<hi!></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsContainingText("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Document document10 = element2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = document10.html("<hi! class=\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.nodes.Element element8 = element2.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element8.attr("<hi! class=\"hi!\"></hi!>", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node4 = element1.root();
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueContaining("<hi!></hi!>", "hi!");
        org.jsoup.select.Elements elements9 = element1.getElementsByIndexEquals((int) 'a');
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Element element6 = element1.getElementById("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element1.tagName("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Tag name must not be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.select.Elements elements9 = element1.children();
        org.jsoup.nodes.Element element10 = element1.empty();
        org.jsoup.nodes.Element element12 = element10.tagName("<>>");
        org.jsoup.nodes.Document document13 = element10.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = document13.child((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        java.util.regex.Pattern pattern18 = null;
        org.jsoup.select.Elements elements19 = element16.getElementsByAttributeValueMatching("<hi!></hi!>", pattern18);
        java.lang.String str20 = element16.nodeName();
        java.lang.Class<?> wildcardClass21 = element16.getClass();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<hi!></hi!>" + "'", str20, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element8 = element2.appendText("hi!");
        java.lang.String str9 = element8.nodeName();
        java.lang.String str10 = element8.cssSelector();
        org.jsoup.nodes.Element element12 = element8.addClass("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        org.jsoup.parser.Tag tag13 = element8.tag();
        org.jsoup.select.Elements elements15 = element8.getElementsMatchingText("<hi! class=\"hi!\"></hi!>");
        element8.setBaseUri("<hi!></hi!>");
        org.jsoup.select.Elements elements19 = element8.getElementsByIndexLessThan((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements22 = element8.getElementsByAttributeValueStarting("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.select.Elements elements9 = element1.children();
        org.jsoup.nodes.Element element10 = element1.empty();
        org.jsoup.nodes.Element element12 = element10.tagName("<>>");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements16 = element14.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element18 = element14.tagName("hi!");
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.jsoup.nodes.Element element24 = element14.classNames((java.util.Set<java.lang.String>) strSet22);
        java.util.Set<java.lang.String> strSet25 = element14.classNames();
        org.jsoup.nodes.Element element26 = element12.appendChild((org.jsoup.nodes.Node) element14);
        java.util.Set<java.lang.String> strSet27 = element12.classNames();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = element6.prependText("hi!");
        org.jsoup.nodes.Node node9 = element6.nextSibling();
        java.lang.String str10 = element6.id();
        org.jsoup.select.Elements elements12 = element6.getElementsByAttribute("<hi! class=\"<hi!></hi!>\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element6.getElementsByAttributeValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        org.jsoup.parser.Tag tag6 = element5.tag();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = element5.dataset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element5.after("<hi! class=\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = element5.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.select.Elements elements7 = element5.getElementsByIndexLessThan((-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = element5.is("<hi! class=\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"\"></hi!>': unexpected token at '<hi! class=\"\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element13 = element9.tagName("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = element9.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element20 = element5.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element22 = element5.text("");
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements26 = element24.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element28 = element24.tagName("hi!");
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.jsoup.nodes.Element element34 = element24.classNames((java.util.Set<java.lang.String>) strSet32);
        org.jsoup.nodes.Element element36 = element34.val("<hi!></hi!>");
        org.jsoup.select.Elements elements39 = element34.getElementsByAttributeValueStarting("hi!", "<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element40 = element22.prependChild((org.jsoup.nodes.Node) element34);
        java.util.List<org.jsoup.nodes.Node> nodeList41 = element34.childNodes();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(nodeList41);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node4 = element1.root();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element10 = element7.prepend("");
        org.jsoup.nodes.Node node11 = element10.previousSibling();
        org.jsoup.nodes.Element element12 = element1.appendChild((org.jsoup.nodes.Node) element10);
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements16 = element14.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element18 = element14.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = element18.dataset();
        org.jsoup.nodes.Element element21 = element18.tagName("hi!");
        org.jsoup.nodes.Element element23 = element21.prepend("hi!");
        org.jsoup.nodes.Element element25 = element23.prepend("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element28 = element25.attr("hi!", true);
        org.jsoup.nodes.Element element29 = element10.before((org.jsoup.nodes.Node) element25);
        java.lang.String str30 = element29.toString();
        org.jsoup.select.NodeVisitor nodeVisitor31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = element29.traverse(nodeVisitor31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<hi!></hi!>" + "'", str30, "<hi!></hi!>");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.nodes.Element element6 = element1.previousElementSibling();
        org.jsoup.select.Elements elements7 = element1.getAllElements();
        java.lang.String str8 = element1.text();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.parser.Tag tag8 = element2.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag8, "<hi! class=\"<hi!></hi!>\"></hi!>");
        int int13 = element12.siblingIndex();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            element12.outerHtmlHead(appendable14, (int) (byte) 100, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        boolean boolean4 = element2.equals((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass5 = element2.getClass();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        java.util.regex.Pattern pattern7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element5.getElementsMatchingOwnText(pattern7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.appendText("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueEnding("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>", "<>>");
        boolean boolean13 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element9);
        org.jsoup.select.Evaluator evaluator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = element9.is(evaluator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.val();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.nodes.Element element7 = element5.prependElement("hi!");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element12 = element11.empty();
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Element element15 = element12.prepend("");
        org.jsoup.select.Elements elements16 = element12.siblingElements();
        org.jsoup.select.Elements elements17 = element12.getAllElements();
        org.jsoup.select.Elements elements19 = element12.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements20 = element12.children();
        org.jsoup.nodes.Attributes attributes21 = element12.attributes();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag8, "", attributes21);
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements27 = element25.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node28 = element25.root();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element31 = element30.empty();
        org.jsoup.nodes.Element element32 = element31.empty();
        org.jsoup.nodes.Element element34 = element31.prepend("");
        org.jsoup.nodes.Node node35 = element34.previousSibling();
        org.jsoup.nodes.Element element36 = element25.appendChild((org.jsoup.nodes.Node) element34);
        java.lang.String str37 = element25.nodeName();
        org.jsoup.nodes.Attributes attributes38 = element25.attributes();
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element(tag8, "hi!", attributes38);
        java.util.List<org.jsoup.nodes.Node> nodeList40 = element39.childNodesCopy();
        org.jsoup.select.Elements elements42 = element39.getElementsContainingOwnText("");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(elements42);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements7 = element2.getElementsByIndexGreaterThan(10);
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element2.childNodes();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element12 = element11.empty();
        org.jsoup.nodes.Element element14 = element11.prepend("");
        org.jsoup.select.Elements elements15 = element11.siblingElements();
        org.jsoup.select.Elements elements16 = element11.getAllElements();
        org.jsoup.select.Elements elements18 = element11.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element21 = element11.attr("hi!", "");
        org.jsoup.nodes.Node node22 = element21.parentNode();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements26 = element24.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element28 = element24.tagName("hi!");
        org.jsoup.parser.Tag tag29 = element28.tag();
        org.jsoup.select.Elements elements30 = element28.siblingElements();
        org.jsoup.nodes.Element element32 = element28.tagName("<hi! class=\"hi!\"></hi!>");
        java.lang.String str33 = element28.outerHtml();
        org.jsoup.nodes.Element element34 = element21.appendChild((org.jsoup.nodes.Node) element28);
        java.lang.String str35 = element21.tagName();
        org.jsoup.nodes.Element element36 = element2.appendChild((org.jsoup.nodes.Node) element21);
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements40 = element38.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element42 = element38.tagName("hi!");
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        org.jsoup.nodes.Element element48 = element38.classNames((java.util.Set<java.lang.String>) strSet46);
        org.jsoup.nodes.Element element50 = element48.val("<hi!></hi!>");
        org.jsoup.nodes.Element element51 = element36.prependChild((org.jsoup.nodes.Node) element48);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean53 = element51.is("<>>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<>>': unexpected token at '<>>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>" + "'", str33, "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element51);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.prependText("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = element1.prependElement("<hi! class=\"hi!\"></hi!>");
        org.jsoup.select.Elements elements9 = element8.parents();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        java.lang.String str3 = element1.outerHtml();
        org.jsoup.nodes.Attributes attributes4 = element1.attributes();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element10 = element7.prepend("");
        org.jsoup.select.Elements elements12 = element7.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Element element13 = element1.appendChild((org.jsoup.nodes.Node) element7);
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element1.siblingNodes();
        org.jsoup.nodes.Element element15 = element1.empty();
        org.jsoup.select.Elements elements16 = element15.parents();
        java.lang.String str17 = element15.nodeName();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<hi!></hi!>" + "'", str3, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        java.lang.String str7 = element2.nodeName();
        org.jsoup.select.Elements elements9 = element2.getElementsByTag("<hi! class=\"<hi!></hi!>\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element2.select("<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">\n hi!\n</hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">? hi!?</hi!>': unexpected token at '<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">? hi!?</hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        boolean boolean6 = element3.isBlock();
        org.jsoup.select.Elements elements7 = element3.children();
        java.lang.String str8 = element3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = element3.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element13 = element9.tagName("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = element9.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element20 = element5.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element23 = element5.attr("<hi! class=\"hi!\"></hi!>", false);
        java.util.List<org.jsoup.nodes.Node> nodeList24 = element23.siblingNodes();
        java.lang.Integer int25 = element23.elementSiblingIndex();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        java.lang.String[] strArray19 = new java.lang.String[] { "<hi! class=\"hi!\"></hi!>", "" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        org.jsoup.nodes.Element element22 = element7.classNames((java.util.Set<java.lang.String>) strSet20);
        org.jsoup.select.Elements elements23 = element22.parents();
        org.jsoup.nodes.Node node24 = element22.nextSibling();
        org.jsoup.select.Elements elements26 = element22.getElementsContainingText("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element28 = element22.prependElement("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "<hi! class=\"hi!\"></hi!>", "" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        element2.setBaseUri("hi!");
        org.jsoup.nodes.Element element9 = element2.prepend("hi!");
        java.util.regex.Pattern pattern10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element9.getElementsMatchingText(pattern10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        boolean boolean18 = element7.hasClass("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element20 = element7.prependText("");
        org.jsoup.nodes.Element element22 = element20.prepend("");
        org.jsoup.select.Elements elements25 = element22.getElementsByAttributeValueMatching("", "<hi!></hi!>");
        element22.setBaseUri("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        org.jsoup.select.Evaluator evaluator28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = element22.is(evaluator28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element13 = element9.toggleClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element13.tagName("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Tag name must not be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        java.lang.Object obj10 = null;
        boolean boolean11 = element2.equals(obj10);
        org.jsoup.nodes.Element element13 = element2.html("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element13.getElementsByAttributeStarting("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        boolean boolean5 = element2.hasClass("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element2.dataset();
        org.jsoup.select.Elements elements8 = element2.getElementsByAttributeStarting("<hi! class=\"hi!\"></hi!>");
        java.lang.String str9 = element2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = element2.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!></hi!>" + "'", str9, "<hi!></hi!>");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element8 = element2.appendText("hi!");
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueEnding("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>", "<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element13 = element8.tagName("<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">\n hi!\n</hi!>");
        org.jsoup.select.Elements elements14 = element8.siblingElements();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        org.jsoup.parser.Tag tag7 = element1.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element10.empty();
        java.lang.String str12 = element10.outerHtml();
        org.jsoup.nodes.Attributes attributes13 = element10.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag7, "hi!", attributes13);
        java.lang.String str15 = element14.className();
        org.jsoup.nodes.Element element16 = element14.clone();
        org.jsoup.select.Elements elements19 = element14.getElementsByAttributeValueNot("<hi! class=\"hi!\"></hi!>", "hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements21 = element14.getElementsContainingText("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi!></hi!>" + "'", str12, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        boolean boolean11 = element2.hasAttr("");
        org.jsoup.nodes.Element element13 = element2.append("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        java.util.regex.Pattern pattern14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element2.getElementsMatchingOwnText(pattern14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.prependText("<hi!></hi!>");
        org.jsoup.nodes.Node node7 = element6.previousSibling();
        org.jsoup.nodes.Element element8 = element6.parent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = element8.hasAttr("<hi! class=\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Element element8 = element5.appendElement("<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">\n hi!\n</hi!>");
        java.lang.String str9 = element8.data();
        org.jsoup.nodes.Node node10 = element8.previousSibling();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueMatching("<hi!></hi!>", "<hi!></hi!>");
        java.lang.String str13 = element9.cssSelector();
        org.jsoup.nodes.Element element15 = element9.html("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements20 = element18.getElementsContainingOwnText("hi!");
        boolean boolean21 = element18.hasText();
        org.jsoup.nodes.Node node22 = element18.parentNode();
        org.jsoup.select.Elements elements24 = element18.getElementsByIndexLessThan((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = element9.insertChildren((int) (short) 10, (java.util.Collection<org.jsoup.nodes.Element>) elements24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.<hi!></hi!>" + "'", str13, "hi!.<hi!></hi!>");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element10.prepend("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element15 = element12.attr("hi!", true);
        org.jsoup.select.Elements elements16 = element15.children();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            element15.outerHtmlHead(appendable17, 1, outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!></hi!>");
        java.lang.String str2 = element1.cssSelector();
        java.util.regex.Pattern pattern3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements4 = element1.getElementsMatchingText(pattern3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<hi!></hi!>" + "'", str2, "<hi!></hi!>");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.nodes.Node node6 = element5.previousSibling();
        org.jsoup.select.Elements elements8 = element5.getElementsContainingText("<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element5.prepend("hi!");
        boolean boolean11 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element5);
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            element5.outerHtmlTail(appendable12, (int) (byte) 100, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.parser.Tag tag8 = element2.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexGreaterThan((int) (byte) 0);
        org.jsoup.nodes.Element element14 = element10.appendText("hi!");
        java.lang.String str15 = element10.tagName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = element10.child((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsMatchingText("hi!");
        java.lang.String str13 = element9.absUrl("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        org.jsoup.select.Elements elements15 = element9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element18 = element17.empty();
        org.jsoup.nodes.Element element19 = element18.empty();
        org.jsoup.nodes.Element element21 = element18.prepend("");
        element18.setBaseUri("hi!");
        org.jsoup.nodes.Element element25 = element18.prepend("hi!");
        java.util.Set<java.lang.String> strSet26 = element25.classNames();
        org.jsoup.nodes.Element element27 = element9.appendChild((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Element element29 = element27.html("hi!");
        org.jsoup.select.Elements elements31 = element29.getElementsByIndexEquals((int) (byte) -1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingOwnText("hi!");
        java.lang.String str8 = element5.nodeName();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element12 = element11.empty();
        org.jsoup.nodes.Element element13 = element12.empty();
        boolean boolean15 = element12.hasClass("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = element12.dataset();
        org.jsoup.select.Elements elements18 = element12.getElementsByAttributeStarting("<hi! class=\"hi!\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element5.insertChildren((int) (byte) 100, (java.util.Collection<org.jsoup.nodes.Element>) elements18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi! class=\"\">\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        boolean boolean11 = element2.hasAttr("");
        org.jsoup.nodes.Element element13 = element2.append("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.jsoup.select.Elements elements16 = element2.getElementsByAttributeValueStarting("<hi! class=\"hi!\"></hi!>", "<hi! class=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.nodes.Element element7 = element5.prependElement("hi!");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element12 = element11.empty();
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Element element15 = element12.prepend("");
        org.jsoup.select.Elements elements16 = element12.siblingElements();
        org.jsoup.select.Elements elements17 = element12.getAllElements();
        org.jsoup.select.Elements elements19 = element12.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements20 = element12.children();
        org.jsoup.nodes.Attributes attributes21 = element12.attributes();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag8, "", attributes21);
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements27 = element25.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node28 = element25.root();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element31 = element30.empty();
        org.jsoup.nodes.Element element32 = element31.empty();
        org.jsoup.nodes.Element element34 = element31.prepend("");
        org.jsoup.nodes.Node node35 = element34.previousSibling();
        org.jsoup.nodes.Element element36 = element25.appendChild((org.jsoup.nodes.Node) element34);
        java.lang.String str37 = element25.nodeName();
        org.jsoup.nodes.Attributes attributes38 = element25.attributes();
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element(tag8, "hi!", attributes38);
        java.util.List<org.jsoup.nodes.Node> nodeList40 = element39.childNodesCopy();
        java.lang.String str41 = element39.nodeName();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.children();
        java.lang.Class<?> wildcardClass7 = elements6.getClass();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.nodes.Element element7 = element2.text("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element7.getElementsByAttributeValueNot("hi!.<hi!></hi!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element5.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Element element18 = element16.toggleClass("");
        boolean boolean20 = element18.hasClass("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        java.lang.String str6 = element2.tagName();
        java.lang.String str8 = element2.attr("hi!");
        org.jsoup.nodes.Element element10 = element2.removeClass("<hi!></hi!>");
        java.lang.String str11 = element10.cssSelector();
        org.jsoup.nodes.Element element12 = element10.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = element12.hasClass("<hi! value=\"\"></hi!>\n<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element8 = element2.appendText("hi!");
        java.lang.String str9 = element8.nodeName();
        org.jsoup.nodes.Element element11 = element8.toggleClass("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element8.getElementsByAttributeValueNot("<hi! value=\"\"></hi!>\n<hi!></hi!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element8 = element2.appendText("hi!");
        org.jsoup.nodes.Element element9 = element2.clone();
        org.jsoup.nodes.Element element11 = element9.html("");
        java.lang.String str12 = element9.toString();
        boolean boolean13 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element9);
        org.jsoup.select.Elements elements15 = element9.getElementsByClass("<hi! class=\"\">\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi!></hi!>" + "'", str12, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        org.jsoup.select.Elements elements10 = element9.parents();
        org.jsoup.nodes.Node node11 = element9.nextSibling();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements15 = element13.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element17 = element13.tagName("hi!");
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        org.jsoup.nodes.Element element23 = element13.classNames((java.util.Set<java.lang.String>) strSet21);
        org.jsoup.nodes.Element element24 = element9.classNames((java.util.Set<java.lang.String>) strSet21);
        org.jsoup.nodes.Element element26 = element9.text("");
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements30 = element28.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element32 = element28.tagName("hi!");
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        org.jsoup.nodes.Element element38 = element28.classNames((java.util.Set<java.lang.String>) strSet36);
        org.jsoup.nodes.Element element40 = element38.val("<hi!></hi!>");
        org.jsoup.select.Elements elements43 = element38.getElementsByAttributeValueStarting("hi!", "<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element44 = element26.prependChild((org.jsoup.nodes.Node) element38);
        org.jsoup.nodes.Element element47 = element26.attr("<hi! class=\"<hi!></hi!>\"></hi!>", false);
        boolean boolean48 = element3.equals((java.lang.Object) element47);
        org.jsoup.nodes.Node node49 = element47.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements52 = element47.getElementsByAttributeValueEnding("<hi!>\n hi!\n</hi!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(node49);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.nodes.Element element11 = element9.prepend("");
        org.jsoup.select.Elements elements13 = element9.getElementsByIndexGreaterThan((int) ' ');
        org.jsoup.nodes.Node node15 = element9.removeAttr("<hi! class=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.nodes.Node node6 = element5.previousSibling();
        org.jsoup.select.Elements elements8 = element5.getElementsContainingText("<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element5.prepend("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueEnding("", "<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">\n hi!\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.nodes.Element element11 = element9.prepend("");
        org.jsoup.nodes.Node node12 = element9.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element9.before("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        java.lang.String str7 = element5.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element5.before("<>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<hi!></hi!>" + "'", str7, "<hi!></hi!>");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Element element8 = element5.appendElement("<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">\n hi!\n</hi!>");
        org.jsoup.select.Elements elements10 = element5.getElementsByAttribute("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.jsoup.nodes.Element element12 = element5.appendElement("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements16 = element14.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element18 = element14.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = element18.dataset();
        org.jsoup.nodes.Element element21 = element18.tagName("hi!");
        org.jsoup.nodes.Element element23 = element21.prepend("hi!");
        org.jsoup.nodes.Element element25 = element21.html("");
        element25.setBaseUri("<hi! class=\"<hi!></hi!>\"></hi!>");
        boolean boolean28 = element25.hasText();
        boolean boolean29 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element25);
        java.lang.String str31 = element25.attr("<hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element32 = element5.before((org.jsoup.nodes.Node) element25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element10.prepend("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Node node14 = element10.removeAttr("<hi! class=\"\"></hi!>");
        java.lang.String str15 = element10.val();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.select.Elements elements5 = element1.children();
        org.jsoup.nodes.Node node6 = element1.parentNode();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element8.removeClass("");
        java.lang.String str11 = element8.cssSelector();
        org.jsoup.nodes.Element element13 = element8.prependText("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element1.prependChild((org.jsoup.nodes.Node) element13);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList15 = element13.textNodes();
        java.lang.String str16 = element13.className();
        java.lang.String str17 = element13.baseUri();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(textNodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element9 = element5.addClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Node node10 = element9.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element9.before("<>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.nodes.Element element7 = element5.prependElement("hi!");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element12 = element11.empty();
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Element element15 = element12.prepend("");
        org.jsoup.select.Elements elements16 = element12.siblingElements();
        org.jsoup.select.Elements elements17 = element12.getAllElements();
        org.jsoup.select.Elements elements19 = element12.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements20 = element12.children();
        org.jsoup.nodes.Attributes attributes21 = element12.attributes();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag8, "", attributes21);
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements27 = element25.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node28 = element25.root();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element31 = element30.empty();
        org.jsoup.nodes.Element element32 = element31.empty();
        org.jsoup.nodes.Element element34 = element31.prepend("");
        org.jsoup.nodes.Node node35 = element34.previousSibling();
        org.jsoup.nodes.Element element36 = element25.appendChild((org.jsoup.nodes.Node) element34);
        java.lang.String str37 = element25.nodeName();
        org.jsoup.nodes.Attributes attributes38 = element25.attributes();
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element(tag8, "hi!", attributes38);
        java.util.List<org.jsoup.nodes.Node> nodeList40 = element39.childNodesCopy();
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element43 = element42.empty();
        org.jsoup.nodes.Element element44 = element43.empty();
        org.jsoup.nodes.Element element46 = element44.tagName("hi!");
        org.jsoup.select.Elements elements47 = element46.parents();
        org.jsoup.nodes.Node node48 = element46.nextSibling();
        org.jsoup.nodes.Element element50 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements52 = element50.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element54 = element50.tagName("hi!");
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet58 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet58, strArray57);
        org.jsoup.nodes.Element element60 = element50.classNames((java.util.Set<java.lang.String>) strSet58);
        org.jsoup.nodes.Element element61 = element46.classNames((java.util.Set<java.lang.String>) strSet58);
        org.jsoup.nodes.Element element63 = element46.text("");
        org.jsoup.nodes.Element element65 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements67 = element65.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element69 = element65.tagName("hi!");
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet73 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet73, strArray72);
        org.jsoup.nodes.Element element75 = element65.classNames((java.util.Set<java.lang.String>) strSet73);
        org.jsoup.nodes.Element element77 = element75.val("<hi!></hi!>");
        org.jsoup.select.Elements elements80 = element75.getElementsByAttributeValueStarting("hi!", "<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element81 = element63.prependChild((org.jsoup.nodes.Node) element75);
        // The following exception was thrown during execution in test generation
        try {
            element39.replaceWith((org.jsoup.nodes.Node) element75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(elements67);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(element75);
        org.junit.Assert.assertNotNull(element77);
        org.junit.Assert.assertNotNull(elements80);
        org.junit.Assert.assertNotNull(element81);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element8 = element2.appendText("hi!");
        java.lang.String str9 = element8.nodeName();
        java.lang.String str10 = element8.cssSelector();
        org.jsoup.nodes.Element element12 = element8.addClass("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element15 = element8.attr("<hi! class=\"<hi!></hi!>\"></hi!>", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = element8.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element8 = element2.appendText("hi!");
        org.jsoup.nodes.Element element9 = element8.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList10 = element9.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi! class=\"<hi!></hi!>\"></hi!>");
        boolean boolean2 = element1.isBlock();
        org.jsoup.select.Elements elements4 = element1.getElementsContainingText("<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">\n hi!\n</hi!>");
        java.lang.String str6 = element1.absUrl("<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">\n hi!\n</hi!>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = element1.classNames((java.util.Set<java.lang.String>) strSet9);
        java.lang.String str12 = element1.toString();
        boolean boolean14 = element1.hasAttr("");
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements18 = element16.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element20 = element16.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = element20.dataset();
        org.jsoup.nodes.Element element23 = element20.tagName("hi!");
        org.jsoup.nodes.Element element25 = element23.prepend("hi!");
        org.jsoup.select.Elements elements27 = element23.getElementsMatchingOwnText("hi!");
        org.jsoup.nodes.Element element29 = element23.removeClass("");
        org.jsoup.select.Elements elements31 = element29.getElementsByAttributeStarting("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        int int32 = element29.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element33 = element1.after((org.jsoup.nodes.Node) element29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi! class=\"hi!\"></hi!>" + "'", str12, "<hi! class=\"hi!\"></hi!>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.nodes.Element element11 = element9.prepend("");
        java.lang.String str12 = element11.html();
        java.lang.String str13 = element11.val();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements17 = element15.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element19 = element15.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = element19.dataset();
        org.jsoup.nodes.Element element22 = element19.tagName("hi!");
        org.jsoup.select.Elements elements24 = element22.getElementsMatchingOwnText("");
        org.jsoup.nodes.Element element25 = element11.prependChild((org.jsoup.nodes.Node) element22);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = element22.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        boolean boolean18 = element7.hasClass("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element20 = element7.prependText("");
        org.jsoup.select.Elements elements21 = element7.getAllElements();
        org.jsoup.nodes.Element element23 = element7.prependText("hi!");
        java.lang.String str24 = element23.tagName();
        org.jsoup.nodes.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element26 = element23.prependChild(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<hi!></hi!>" + "'", str24, "<hi!></hi!>");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList6 = element5.textNodes();
        org.jsoup.select.Elements elements8 = element5.getElementsContainingText("<hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(textNodeList6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.nodes.Node node7 = element5.removeAttr("hi!");
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.nodes.Element element7 = element5.prependElement("hi!");
        java.lang.String str8 = element7.html();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = element7.is("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!': unexpected token at '!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        java.util.List<org.jsoup.nodes.Node> nodeList3 = element1.childNodesCopy();
        boolean boolean5 = element1.hasAttr("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.prepend("");
        org.jsoup.nodes.Node node12 = element11.previousSibling();
        org.jsoup.select.Elements elements14 = element11.getElementsContainingText("<hi!></hi!>");
        org.jsoup.nodes.Element element16 = element11.prepend("hi!");
        org.jsoup.nodes.Element element18 = element11.appendText("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element1.before((org.jsoup.nodes.Node) element18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.select.Elements elements9 = element1.children();
        org.jsoup.nodes.Element element10 = element1.empty();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element1.childNodes();
        org.jsoup.nodes.Element element13 = element1.val("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.jsoup.nodes.Element element14 = element13.clone();
        org.jsoup.select.Elements elements17 = element14.getElementsByAttributeValue("hi!.<hi!></hi!>", "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element14.child((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        java.lang.String str6 = element2.tagName();
        java.lang.String str8 = element2.attr("hi!");
        org.jsoup.nodes.Element element10 = element2.removeClass("<hi!></hi!>");
        boolean boolean12 = element2.hasAttr("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        java.util.regex.Pattern pattern13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element2.getElementsMatchingOwnText(pattern13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element9.tagName("hi!");
        org.jsoup.select.Elements elements12 = element11.parents();
        org.jsoup.nodes.Node node13 = element11.nextSibling();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements17 = element15.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element19 = element15.tagName("hi!");
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        org.jsoup.nodes.Element element25 = element15.classNames((java.util.Set<java.lang.String>) strSet23);
        org.jsoup.nodes.Element element26 = element11.classNames((java.util.Set<java.lang.String>) strSet23);
        org.jsoup.nodes.Element element27 = element2.classNames((java.util.Set<java.lang.String>) strSet23);
        java.lang.Appendable appendable28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        // The following exception was thrown during execution in test generation
        try {
            element27.outerHtmlTail(appendable28, 100, outputSettings30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        boolean boolean5 = element2.hasClass("hi!");
        java.lang.Integer int6 = element2.elementSiblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element2.getElementsByAttributeValue("", "<hi! class=\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        java.lang.Object obj10 = null;
        boolean boolean11 = element2.equals(obj10);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element2.textNodes();
        java.util.regex.Pattern pattern14 = null;
        org.jsoup.select.Elements elements15 = element2.getElementsByAttributeValueMatching("hi!", pattern14);
        java.lang.String str16 = element2.id();
        org.jsoup.select.NodeVisitor nodeVisitor17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = element2.traverse(nodeVisitor17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.nodes.Element element7 = element5.prependElement("hi!");
        org.jsoup.select.Elements elements8 = element5.siblingElements();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element10.prepend("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element15 = element12.attr("hi!", true);
        java.lang.String str16 = element12.cssSelector();
        org.jsoup.nodes.Element element18 = element12.child(0);
        java.util.List<org.jsoup.nodes.Node> nodeList19 = element18.siblingNodes();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueMatching("<hi!></hi!>", "<hi!></hi!>");
        java.lang.String str13 = element9.cssSelector();
        org.jsoup.select.Elements elements15 = element9.getElementsByAttribute("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        java.lang.String str16 = element9.tagName();
        org.jsoup.nodes.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            element9.replaceWith(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.<hi!></hi!>" + "'", str13, "hi!.<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.prependText("<hi!></hi!>");
        org.jsoup.nodes.Node node7 = element6.previousSibling();
        org.jsoup.nodes.Element element9 = element6.val("<hi!></hi!>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element12 = element11.empty();
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Element element15 = element12.prepend("");
        org.jsoup.select.Elements elements16 = element12.siblingElements();
        org.jsoup.select.Elements elements17 = element12.getAllElements();
        org.jsoup.select.Elements elements19 = element12.getElementsContainingText("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Document document20 = element12.ownerDocument();
        boolean boolean21 = element9.hasSameValue((java.lang.Object) document20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element23 = document20.wrap("<>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        boolean boolean4 = element2.equals((java.lang.Object) (byte) 10);
        java.util.Set<java.lang.String> strSet5 = element2.classNames();
        org.jsoup.nodes.Node node6 = element2.nextSibling();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element9 = element2.attr("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>", true);
        java.lang.String str10 = element9.cssSelector();
        org.jsoup.select.Elements elements11 = element9.parents();
        boolean boolean12 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element9);
        boolean boolean14 = element9.hasAttr("<hi! value=\"\"></hi!>\n<hi!></hi!>");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        java.lang.String str5 = element1.attr("hi!");
        org.jsoup.nodes.Element element7 = element1.prepend("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element9 = element1.html("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element12 = element11.empty();
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Element element15 = element12.prepend("");
        org.jsoup.select.Elements elements16 = element12.siblingElements();
        org.jsoup.select.Elements elements17 = element12.getAllElements();
        org.jsoup.select.Elements elements19 = element12.getElementsByIndexLessThan((int) (short) -1);
        java.lang.Object obj20 = null;
        boolean boolean21 = element12.equals(obj20);
        org.jsoup.select.Elements elements23 = element12.getElementsMatchingText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = element1.before((org.jsoup.nodes.Node) element12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Node node7 = element5.root();
        java.lang.String str8 = element5.data();
        org.jsoup.nodes.Element element10 = element5.removeClass("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        org.jsoup.parser.Tag tag11 = element5.tag();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            element5.outerHtmlTail(appendable12, (int) '#', outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element12 = element2.attr("hi!", "");
        org.jsoup.nodes.Node node13 = element12.parentNode();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements17 = element15.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element19 = element15.tagName("hi!");
        org.jsoup.parser.Tag tag20 = element19.tag();
        org.jsoup.select.Elements elements21 = element19.siblingElements();
        org.jsoup.nodes.Element element23 = element19.tagName("<hi! class=\"hi!\"></hi!>");
        java.lang.String str24 = element19.outerHtml();
        org.jsoup.nodes.Element element25 = element12.appendChild((org.jsoup.nodes.Node) element19);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList26 = element25.textNodes();
        org.jsoup.select.Elements elements29 = element25.getElementsByAttributeValueNot("<hi! class=\"\">\n <hi!></hi!>\n</hi!>", "<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = element25.is("<>>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<>>': unexpected token at '<>>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>" + "'", str24, "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(textNodeList26);
        org.junit.Assert.assertNotNull(elements29);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        java.lang.String[] strArray19 = new java.lang.String[] { "<hi! class=\"hi!\"></hi!>", "" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        org.jsoup.nodes.Element element22 = element7.classNames((java.util.Set<java.lang.String>) strSet20);
        org.jsoup.select.Elements elements23 = element22.parents();
        org.jsoup.nodes.Node node24 = element22.nextSibling();
        org.jsoup.select.Elements elements26 = element22.getElementsContainingText("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element29 = element28.empty();
        org.jsoup.nodes.Element element30 = element29.empty();
        org.jsoup.nodes.Element element32 = element29.prepend("");
        org.jsoup.select.Elements elements33 = element29.siblingElements();
        org.jsoup.nodes.Element element36 = element29.attr("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>", true);
        java.lang.String str37 = element36.cssSelector();
        org.jsoup.select.Elements elements38 = element36.parents();
        boolean boolean39 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element36);
        // The following exception was thrown during execution in test generation
        try {
            element22.replaceWith((org.jsoup.nodes.Node) element36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "<hi! class=\"hi!\"></hi!>", "" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element10.prepend("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Node node14 = element10.removeAttr("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element15 = element10.parent();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(element15);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        org.jsoup.parser.Tag tag7 = element1.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element10.empty();
        java.lang.String str12 = element10.outerHtml();
        org.jsoup.nodes.Attributes attributes13 = element10.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag7, "hi!", attributes13);
        java.lang.String str15 = element14.className();
        org.jsoup.nodes.Element element16 = element14.clone();
        org.jsoup.nodes.Element element18 = element16.append("hi!.<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = element16.siblingNodes();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi!></hi!>" + "'", str12, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.prependText("<hi!></hi!>");
        org.jsoup.nodes.Node node7 = element6.previousSibling();
        org.jsoup.nodes.Element element9 = element6.val("<hi!></hi!>");
        org.jsoup.nodes.Element element11 = element9.appendElement("<hi!></hi!>");
        org.jsoup.nodes.Element element13 = element11.prependElement("<hi! class=\"\"></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList14 = element13.textNodes();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(textNodeList14);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueMatching("<hi!></hi!>", "<hi!></hi!>");
        java.lang.String str13 = element9.cssSelector();
        org.jsoup.nodes.Element element15 = element9.html("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element17 = element9.child(0);
        org.jsoup.nodes.Element element19 = element9.toggleClass("hi!");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.<hi!></hi!>" + "'", str13, "hi!.<hi!></hi!>");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        java.lang.String str6 = element2.ownText();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            element2.outerHtmlTail(appendable7, (int) ' ', outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element4 = element3.empty();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element3.childNodesCopy();
        boolean boolean7 = element3.hasAttr("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.select.Elements elements9 = element3.getElementsContainingText("<hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element1.before((org.jsoup.nodes.Node) element3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element10.prepend("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Node node14 = element10.removeAttr("<hi! class=\"\"></hi!>");
        java.lang.String str15 = element10.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = element10.is("<hi! class=\"hi!\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"hi!\"></hi!>': unexpected token at '<hi! class=\"hi!\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        java.lang.Object obj10 = null;
        boolean boolean11 = element2.equals(obj10);
        org.jsoup.nodes.Element element13 = element2.html("hi!");
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements17 = element15.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element19 = element15.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = element19.dataset();
        org.jsoup.nodes.Element element22 = element19.tagName("hi!");
        org.jsoup.nodes.Element element24 = element22.prepend("hi!");
        org.jsoup.nodes.Element element26 = element22.html("");
        java.lang.String str27 = element22.nodeName();
        org.jsoup.nodes.Element element28 = element22.previousElementSibling();
        org.jsoup.nodes.Element element29 = element22.empty();
        org.jsoup.nodes.Element element31 = element22.appendText("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element32 = element31.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element33 = element13.before((org.jsoup.nodes.Node) element32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element32);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        org.jsoup.parser.Tag tag6 = element5.tag();
        org.jsoup.select.Elements elements7 = element5.siblingElements();
        org.jsoup.nodes.Element element9 = element5.tagName("<hi! class=\"hi!\"></hi!>");
        java.lang.String str10 = element5.outerHtml();
        org.jsoup.nodes.Document document11 = element5.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = document11.text("<hi! class=\"hi!\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>" + "'", str10, "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueMatching("<hi!></hi!>", "<hi!></hi!>");
        java.lang.String str13 = element9.cssSelector();
        org.jsoup.nodes.Element element15 = element9.html("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element17 = element9.child(0);
        org.jsoup.select.Evaluator evaluator18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = element17.is(evaluator18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.<hi!></hi!>" + "'", str13, "hi!.<hi!></hi!>");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements10 = element2.children();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Element element14 = element13.empty();
        org.jsoup.nodes.Element element16 = element13.append("<hi!></hi!>");
        org.jsoup.nodes.Element element18 = element16.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element21 = element20.empty();
        org.jsoup.nodes.Element element22 = element21.empty();
        org.jsoup.nodes.Element element24 = element22.tagName("hi!");
        org.jsoup.nodes.Element element26 = element24.val("");
        org.jsoup.nodes.Element element27 = element18.prependChild((org.jsoup.nodes.Node) element26);
        java.lang.String[] strArray30 = new java.lang.String[] { "<hi! class=\"hi!\"></hi!>", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        org.jsoup.nodes.Element element33 = element18.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element34 = element2.classNames((java.util.Set<java.lang.String>) strSet31);
        java.util.List<org.jsoup.nodes.Node> nodeList35 = element2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = element2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "<hi! class=\"hi!\"></hi!>", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(nodeList35);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element13 = element9.tagName("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = element9.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element20 = element5.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element23 = element5.attr("<hi! class=\"hi!\"></hi!>", false);
        java.util.List<org.jsoup.nodes.Node> nodeList24 = element23.siblingNodes();
        org.jsoup.nodes.Node node25 = element23.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int26 = node25.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        java.util.List<org.jsoup.nodes.Node> nodeList3 = element1.childNodesCopy();
        boolean boolean5 = element1.hasAttr("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.select.Elements elements6 = element1.parents();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String str6 = element1.toString();
        org.jsoup.nodes.Element element8 = element1.toggleClass("<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element1.append("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Element element14 = element13.empty();
        org.jsoup.nodes.Element element16 = element14.tagName("hi!");
        boolean boolean17 = element14.isBlock();
        org.jsoup.nodes.Element element18 = element10.appendChild((org.jsoup.nodes.Node) element14);
        org.jsoup.nodes.Node node20 = element18.removeAttr("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Document document21 = node20.ownerDocument();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi!></hi!>" + "'", str6, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(document21);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element9 = element2.attr("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>", true);
        // The following exception was thrown during execution in test generation
        try {
            element2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        java.lang.String[] strArray19 = new java.lang.String[] { "<hi! class=\"hi!\"></hi!>", "" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        org.jsoup.nodes.Element element22 = element7.classNames((java.util.Set<java.lang.String>) strSet20);
        org.jsoup.select.Elements elements23 = element22.parents();
        org.jsoup.select.Elements elements25 = element22.getElementsByIndexEquals((int) (short) 10);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "<hi! class=\"hi!\"></hi!>", "" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element8 = element2.appendText("hi!");
        java.lang.String str9 = element8.nodeName();
        java.lang.String str10 = element8.cssSelector();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList11 = element8.dataNodes();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = element8.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(dataNodeList11);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        int int7 = element5.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element5.attr("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        int int5 = element1.childNodeSize();
        org.jsoup.parser.Tag tag6 = element1.tag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element1.after("<hi! value=\"\"></hi!>\n<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.select.Elements elements5 = element1.children();
        org.jsoup.nodes.Node node6 = element1.parentNode();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element8.removeClass("");
        java.lang.String str11 = element8.cssSelector();
        org.jsoup.nodes.Element element13 = element8.prependText("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element1.prependChild((org.jsoup.nodes.Node) element13);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList15 = element13.textNodes();
        java.lang.String str16 = element13.className();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = element13.dataset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element13.tagName("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Tag name must not be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(textNodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        java.lang.String str10 = element9.data();
        org.jsoup.nodes.Node node11 = element9.nextSibling();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        java.util.regex.Pattern pattern18 = null;
        org.jsoup.select.Elements elements19 = element16.getElementsByAttributeValueMatching("<hi!></hi!>", pattern18);
        org.jsoup.select.Elements elements21 = element16.getElementsByClass("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        java.lang.String str22 = element16.data();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = element16.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        java.util.List<org.jsoup.nodes.Node> nodeList3 = element1.childNodesCopy();
        org.jsoup.nodes.Node node4 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.parents();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements9 = element7.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element11 = element7.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = element11.dataset();
        org.jsoup.nodes.Element element14 = element11.tagName("hi!");
        org.jsoup.nodes.Element element16 = element14.prepend("hi!");
        org.jsoup.select.Elements elements18 = element14.getElementsMatchingOwnText("hi!");
        org.jsoup.nodes.Element element20 = element14.removeClass("");
        org.jsoup.select.Elements elements22 = element20.getElementsByAttributeStarting("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        int int23 = element20.childNodeSize();
        org.jsoup.select.Elements elements25 = element20.getElementsByIndexGreaterThan((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            element1.replaceWith((org.jsoup.nodes.Node) element20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.children();
        org.jsoup.nodes.Element element8 = element2.text("<hi! class=\"hi!\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element2.child((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.prependText("<hi!></hi!>");
        org.jsoup.nodes.Node node7 = element6.previousSibling();
        org.jsoup.nodes.Element element9 = element6.removeClass("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element11 = element9.append("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.jsoup.select.Elements elements13 = element9.getElementsMatchingOwnText("<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.nodes.Element element11 = element9.prepend("");
        org.jsoup.select.Elements elements13 = element9.getElementsByIndexGreaterThan((int) ' ');
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element9.childNodes();
        org.jsoup.nodes.Element element16 = element9.getElementById("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element19 = element18.empty();
        org.jsoup.nodes.Element element20 = element19.empty();
        org.jsoup.nodes.Element element22 = element19.prepend("");
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element25 = element24.empty();
        org.jsoup.nodes.Element element26 = element25.empty();
        org.jsoup.nodes.Element element28 = element26.tagName("hi!");
        org.jsoup.select.Elements elements29 = element28.parents();
        org.jsoup.nodes.Node node30 = element28.nextSibling();
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements34 = element32.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element36 = element32.tagName("hi!");
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.jsoup.nodes.Element element42 = element32.classNames((java.util.Set<java.lang.String>) strSet40);
        org.jsoup.nodes.Element element43 = element28.classNames((java.util.Set<java.lang.String>) strSet40);
        org.jsoup.nodes.Element element44 = element19.classNames((java.util.Set<java.lang.String>) strSet40);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element45 = element16.classNames((java.util.Set<java.lang.String>) strSet40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element44);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        org.jsoup.parser.Tag tag6 = element5.tag();
        java.lang.String str8 = element5.attr("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = element5.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element8 = element2.appendText("hi!");
        org.jsoup.nodes.Element element9 = element2.clone();
        java.lang.String str11 = element9.attr("hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element14 = element13.empty();
        org.jsoup.nodes.Element element15 = element14.empty();
        org.jsoup.nodes.Element element17 = element15.tagName("hi!");
        org.jsoup.select.Elements elements18 = element17.parents();
        org.jsoup.nodes.Node node19 = element17.root();
        // The following exception was thrown during execution in test generation
        try {
            element9.replaceWith(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        java.lang.Object obj10 = null;
        boolean boolean11 = element2.equals(obj10);
        org.jsoup.select.Elements elements13 = element2.getElementsMatchingText("hi!");
        org.jsoup.select.Elements elements15 = element2.getElementsMatchingText("");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.parser.Tag tag8 = element2.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexGreaterThan((int) (byte) 0);
        org.jsoup.nodes.Element element14 = element10.appendText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = element10.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element9 = element2.attr("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>", true);
        org.jsoup.parser.Tag tag10 = element9.tag();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag10, "<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "<hi! class=\"hi!\"></hi!>", attributes14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        java.lang.String str7 = element5.cssSelector();
        java.util.regex.Pattern pattern9 = null;
        org.jsoup.select.Elements elements10 = element5.getElementsByAttributeValueMatching("", pattern9);
        java.lang.String str11 = element5.outerHtml();
        org.jsoup.nodes.Element element13 = element5.text("<hi!></hi!>");
        org.jsoup.nodes.Node node14 = element5.nextSibling();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi!></hi!>" + "'", str11, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = element6.prependText("hi!");
        org.jsoup.nodes.Node node9 = element6.nextSibling();
        java.lang.String str10 = element6.id();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.select.Elements elements14 = element12.parents();
        java.lang.String str16 = element12.attr("hi!");
        org.jsoup.nodes.Element element18 = element12.prepend("<hi! class=\"hi!\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element6.before((org.jsoup.nodes.Node) element12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element10.tagName("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element14 = element10.text("<hi!></hi!>");
        org.jsoup.nodes.Element element15 = element10.previousElementSibling();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(element15);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element8 = element2.appendText("hi!");
        java.lang.String str9 = element8.nodeName();
        java.lang.String str10 = element8.cssSelector();
        org.jsoup.nodes.Element element12 = element8.addClass("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element15 = element8.attr("<hi! class=\"<hi!></hi!>\"></hi!>", false);
        org.jsoup.select.Elements elements17 = element15.getElementsMatchingOwnText("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = element15.is("<>>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<>>': unexpected token at '<>>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element13 = element9.tagName("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = element9.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element20 = element5.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element23 = element5.attr("<hi! class=\"hi!\"></hi!>", false);
        org.jsoup.select.Elements elements25 = element5.getElementsContainingText("<hi! value=\"\"></hi!>\n<hi!></hi!>");
        org.jsoup.nodes.Element element26 = element5.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            element26.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNull(element26);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.select.Elements elements5 = element1.children();
        org.jsoup.nodes.Node node6 = element1.parentNode();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element8.removeClass("");
        java.lang.String str11 = element8.cssSelector();
        org.jsoup.nodes.Element element13 = element8.prependText("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element1.prependChild((org.jsoup.nodes.Node) element13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element14.after("<hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        java.lang.String str3 = element1.outerHtml();
        org.jsoup.nodes.Attributes attributes4 = element1.attributes();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element10 = element7.prepend("");
        org.jsoup.select.Elements elements12 = element7.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Element element13 = element1.appendChild((org.jsoup.nodes.Node) element7);
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            element13.outerHtmlTail(appendable14, 1, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<hi!></hi!>" + "'", str3, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        java.lang.String str10 = element1.val();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements14 = element12.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element16 = element12.tagName("hi!");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        org.jsoup.nodes.Element element22 = element12.classNames((java.util.Set<java.lang.String>) strSet20);
        java.util.Set<java.lang.String> strSet23 = element12.classNames();
        org.jsoup.nodes.Element element24 = element1.classNames(strSet23);
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element28 = element26.removeClass("");
        java.lang.String str29 = element26.cssSelector();
        org.jsoup.nodes.Element element31 = element26.prependText("<hi!></hi!>");
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements35 = element33.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node36 = element33.root();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element39 = element38.empty();
        org.jsoup.nodes.Element element40 = element39.empty();
        org.jsoup.nodes.Element element42 = element39.prepend("");
        org.jsoup.nodes.Node node43 = element42.previousSibling();
        org.jsoup.nodes.Element element44 = element33.appendChild((org.jsoup.nodes.Node) element42);
        java.lang.String str45 = element33.nodeName();
        boolean boolean46 = element31.equals((java.lang.Object) str45);
        org.jsoup.select.Elements elements49 = element31.getElementsByAttributeValueStarting("<hi! class=\"hi!\"></hi!>", "hi!.<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            element24.replaceWith((org.jsoup.nodes.Node) element31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(elements49);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        java.lang.String str6 = element2.tagName();
        java.lang.String str8 = element2.attr("hi!");
        org.jsoup.nodes.Element element10 = element2.removeClass("<hi!></hi!>");
        java.lang.String str11 = element10.cssSelector();
        org.jsoup.parser.Tag tag12 = element10.tag();
        org.jsoup.select.Elements elements14 = element10.getElementsByAttribute("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element16 = element10.append("hi!.hi!");
        java.lang.Class<?> wildcardClass17 = element10.getClass();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.nodes.Element element11 = element9.prepend("");
        org.jsoup.nodes.Element element13 = element9.toggleClass("<hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>");
        org.jsoup.nodes.Element element15 = element9.val("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = element15.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = element5.appendText("<hi!></hi!>");
        java.lang.String str10 = element5.cssSelector();
        org.jsoup.select.Elements elements11 = element5.parents();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element5.before("<hi! class=\"\">\n <hi!></hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element9.tagName("hi!");
        org.jsoup.select.Elements elements12 = element11.parents();
        org.jsoup.nodes.Node node13 = element11.nextSibling();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements17 = element15.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element19 = element15.tagName("hi!");
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        org.jsoup.nodes.Element element25 = element15.classNames((java.util.Set<java.lang.String>) strSet23);
        org.jsoup.nodes.Element element26 = element11.classNames((java.util.Set<java.lang.String>) strSet23);
        org.jsoup.nodes.Element element27 = element2.classNames((java.util.Set<java.lang.String>) strSet23);
        org.jsoup.select.Elements elements29 = element2.getElementsByIndexGreaterThan((int) '4');
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements29);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.children();
        org.jsoup.select.Elements elements8 = element2.getElementsByTag("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        java.lang.String str9 = element2.id();
        org.jsoup.nodes.Node node10 = element2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element2.tagName("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Tag name must not be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsMatchingText("hi!");
        java.lang.String str13 = element9.absUrl("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        org.jsoup.select.Elements elements15 = element9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Node node16 = element9.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = node16.absUrl("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = element5.getElementById("<hi! class=\"hi!\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueNot("<<hi!></hi!>></<hi!></hi!>>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Element element8 = element5.tagName("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.select.Elements elements9 = element5.getAllElements();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element8.html("");
        java.lang.String str13 = element8.nodeName();
        java.lang.String str14 = element8.baseUri();
        java.lang.String str16 = element8.absUrl("<hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String str6 = element1.toString();
        org.jsoup.nodes.Element element8 = element1.toggleClass("<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element8.tagName("<hi! class=\"hi!\"></hi!>");
        int int11 = element8.childNodeSize();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi!></hi!>" + "'", str6, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element5.childNodesCopy();
        org.jsoup.nodes.Element element7 = element5.nextElementSibling();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.nodes.Node node6 = element5.previousSibling();
        org.jsoup.select.Elements elements8 = element5.getElementsContainingText("<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element5.prepend("hi!");
        org.jsoup.nodes.Element element12 = element10.html("hi!.<hi!></hi!>");
        int int13 = element10.childNodeSize();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueMatching("<hi!></hi!>", "<hi!></hi!>");
        java.lang.String str13 = element9.cssSelector();
        org.jsoup.nodes.Element element15 = element9.html("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element17 = element9.appendElement("<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">\n hi!\n</hi!>");
        java.util.regex.Pattern pattern18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = element17.getElementsMatchingOwnText(pattern18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.<hi!></hi!>" + "'", str13, "hi!.<hi!></hi!>");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.childNodesCopy();
        java.lang.String str8 = element5.tagName();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        java.lang.Integer int10 = element9.elementSiblingIndex();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Element element14 = element13.empty();
        org.jsoup.nodes.Element element16 = element13.prepend("");
        org.jsoup.select.Elements elements17 = element13.siblingElements();
        org.jsoup.select.Elements elements18 = element13.getAllElements();
        org.jsoup.parser.Tag tag19 = element13.tag();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag19, "<hi!></hi!>");
        org.jsoup.select.Elements elements23 = element21.getElementsByIndexGreaterThan((int) (byte) 0);
        org.jsoup.select.Elements elements25 = element21.getElementsByAttributeStarting("<hi!></hi!>");
        org.jsoup.nodes.Node node26 = element21.root();
        org.jsoup.nodes.Element element27 = element9.appendChild(node26);
        java.lang.String str28 = element9.text();
        java.lang.String str30 = element9.attr("<hi! class=\"\"></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList31 = element9.dataNodes();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(dataNodeList31);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.prependText("<hi!></hi!>");
        org.jsoup.nodes.Node node7 = element6.previousSibling();
        org.jsoup.nodes.Element element9 = element6.val("<hi!></hi!>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element12 = element11.empty();
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Element element15 = element12.prepend("");
        org.jsoup.select.Elements elements16 = element12.siblingElements();
        org.jsoup.select.Elements elements17 = element12.getAllElements();
        org.jsoup.select.Elements elements19 = element12.getElementsContainingText("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Document document20 = element12.ownerDocument();
        boolean boolean21 = element9.hasSameValue((java.lang.Object) document20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements23 = document20.getElementsByTag("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.select.Elements elements5 = element1.children();
        org.jsoup.nodes.Element element6 = element1.parent();
        boolean boolean7 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        java.lang.Integer int8 = element1.elementSiblingIndex();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            element1.outerHtmlHead(appendable9, (int) (short) 10, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Node node11 = element10.previousSibling();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            element10.outerHtmlTail(appendable12, (int) 'a', outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element12 = element2.attr("hi!", "");
        org.jsoup.parser.Tag tag13 = element2.tag();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element17 = element16.empty();
        org.jsoup.nodes.Element element18 = element17.empty();
        org.jsoup.nodes.Attributes attributes19 = element17.attributes();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag13, "<hi! class=\"hi!\"></hi!>", attributes19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements22 = element20.select("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!></hi!>': unexpected token at '<hi!></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = element6.prependText("hi!");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            element8.outerHtmlHead(appendable9, (int) (short) 1, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        boolean boolean18 = element7.hasClass("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element20 = element7.prependText("");
        org.jsoup.select.Elements elements21 = element7.getAllElements();
        org.jsoup.nodes.Element element23 = element7.prepend("<hi!></hi!>");
        org.jsoup.nodes.Node node24 = element7.parentNode();
        boolean boolean25 = org.jsoup.nodes.Element.preserveWhitespace(node24);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element9 = element5.addClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element11 = element5.appendElement("<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements13 = element11.getElementsContainingText("<hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = element11.getElementsByAttributeValueContaining("<hi! class=\"\"></hi!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        org.jsoup.parser.Tag tag6 = element5.tag();
        org.jsoup.select.Elements elements7 = element5.siblingElements();
        org.jsoup.nodes.Element element9 = element5.tagName("<hi! class=\"hi!\"></hi!>");
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueMatching("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>", "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element5.child(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.nodes.Element element11 = element9.prepend("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element9.attr("", "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element2.appendText("<hi! class=\"<hi!></hi!>\"></hi!>");
        java.util.regex.Pattern pattern9 = null;
        org.jsoup.select.Elements elements10 = element7.getElementsByAttributeValueMatching("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>", pattern9);
        java.util.regex.Pattern pattern12 = null;
        org.jsoup.select.Elements elements13 = element7.getElementsByAttributeValueMatching("<hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>", pattern12);
        org.jsoup.select.Elements elements15 = element7.getElementsContainingOwnText("<hi! class=\"<hi!></hi!> hi!\" value=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        java.lang.String str3 = element1.outerHtml();
        java.util.Set<java.lang.String> strSet4 = element1.classNames();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements8 = element6.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node9 = element6.root();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element12 = element11.empty();
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Element element15 = element12.prepend("");
        org.jsoup.nodes.Node node16 = element15.previousSibling();
        org.jsoup.nodes.Element element17 = element6.appendChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Element element18 = element15.empty();
        org.jsoup.nodes.Node node19 = element18.parentNode();
        boolean boolean20 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element21 = element1.after((org.jsoup.nodes.Node) element18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<hi!></hi!>" + "'", str3, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.removeClass("");
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingOwnText("hi!");
        boolean boolean8 = element3.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Node node9 = element3.previousSibling();
        org.jsoup.nodes.Element element11 = element3.appendText("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        org.jsoup.select.Evaluator evaluator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = element11.is(evaluator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.prependText("<hi!></hi!>");
        org.jsoup.select.Elements elements8 = element6.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element10 = element6.tagName("<hi! class=\"hi!\"></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element6.siblingNodes();
        org.jsoup.nodes.Element element12 = element6.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element6.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements7 = element2.getElementsByIndexGreaterThan(10);
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element2.childNodes();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element12 = element11.empty();
        org.jsoup.nodes.Element element14 = element11.prepend("");
        org.jsoup.select.Elements elements15 = element11.siblingElements();
        org.jsoup.select.Elements elements16 = element11.getAllElements();
        org.jsoup.select.Elements elements18 = element11.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element21 = element11.attr("hi!", "");
        org.jsoup.nodes.Node node22 = element21.parentNode();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements26 = element24.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element28 = element24.tagName("hi!");
        org.jsoup.parser.Tag tag29 = element28.tag();
        org.jsoup.select.Elements elements30 = element28.siblingElements();
        org.jsoup.nodes.Element element32 = element28.tagName("<hi! class=\"hi!\"></hi!>");
        java.lang.String str33 = element28.outerHtml();
        org.jsoup.nodes.Element element34 = element21.appendChild((org.jsoup.nodes.Node) element28);
        java.lang.String str35 = element21.tagName();
        org.jsoup.nodes.Element element36 = element2.appendChild((org.jsoup.nodes.Node) element21);
        org.jsoup.nodes.Attributes attributes37 = element2.attributes();
        java.lang.String str38 = element2.nodeName();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>" + "'", str33, "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        java.lang.String str10 = element1.val();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements14 = element12.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element16 = element12.tagName("hi!");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        org.jsoup.nodes.Element element22 = element12.classNames((java.util.Set<java.lang.String>) strSet20);
        java.util.Set<java.lang.String> strSet23 = element12.classNames();
        org.jsoup.nodes.Element element24 = element1.classNames(strSet23);
        org.jsoup.nodes.Element element25 = element24.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = element25.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNull(element25);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        java.lang.Object obj10 = null;
        boolean boolean11 = element2.equals(obj10);
        org.jsoup.nodes.Element element13 = element2.append("<hi! class=\"<hi!></hi!>\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = element2.getElementsByAttributeValueEnding("<<hi!></hi!>></<hi!></hi!>>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element5 = element1.parent();
        org.jsoup.nodes.Element element6 = element1.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = element6.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        int int5 = element1.childNodeSize();
        org.jsoup.parser.Tag tag6 = element1.tag();
        org.jsoup.select.Elements elements8 = element1.getElementsMatchingOwnText("<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements9 = element1.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element1.childNodesCopy();
        org.jsoup.select.Elements elements12 = element1.getElementsByTag("<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsMatchingText("hi!");
        java.lang.String str13 = element9.absUrl("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        org.jsoup.select.Elements elements15 = element9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element18 = element17.empty();
        org.jsoup.nodes.Element element19 = element18.empty();
        org.jsoup.nodes.Element element21 = element18.prepend("");
        element18.setBaseUri("hi!");
        org.jsoup.nodes.Element element25 = element18.prepend("hi!");
        java.util.Set<java.lang.String> strSet26 = element25.classNames();
        org.jsoup.nodes.Element element27 = element9.appendChild((org.jsoup.nodes.Node) element25);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element29 = element9.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String str6 = element1.toString();
        org.jsoup.select.Elements elements8 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element10 = element1.prepend("<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements13 = element1.getElementsByAttributeValueEnding("<hi! class=\"\"></hi!>", "<hi! class=\"<hi!></hi!>\"></hi!>");
        java.lang.String str14 = element1.className();
        java.lang.String str15 = element1.outerHtml();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi!></hi!>" + "'", str6, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>" + "'", str15, "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        java.util.regex.Pattern pattern5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element1.getElementsMatchingOwnText(pattern5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element9 = element2.attr("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>", true);
        org.jsoup.parser.Tag tag10 = element9.tag();
        java.util.regex.Pattern pattern11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element9.getElementsMatchingOwnText(pattern11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element8.html("");
        java.lang.String str13 = element8.nodeName();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = element8.dataset();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element17 = element16.empty();
        org.jsoup.nodes.Element element18 = element17.empty();
        org.jsoup.nodes.Element element20 = element17.prepend("");
        element17.setBaseUri("hi!");
        org.jsoup.nodes.Element element24 = element17.prepend("hi!");
        java.util.Set<java.lang.String> strSet25 = element24.classNames();
        org.jsoup.nodes.Element element26 = element8.classNames(strSet25);
        org.jsoup.nodes.Element element27 = element26.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            element27.setBaseUri("<>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNull(element27);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        java.lang.Integer int10 = element9.elementSiblingIndex();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Element element14 = element13.empty();
        org.jsoup.nodes.Element element16 = element13.prepend("");
        org.jsoup.select.Elements elements17 = element13.siblingElements();
        org.jsoup.select.Elements elements18 = element13.getAllElements();
        org.jsoup.parser.Tag tag19 = element13.tag();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag19, "<hi!></hi!>");
        org.jsoup.select.Elements elements23 = element21.getElementsByIndexGreaterThan((int) (byte) 0);
        org.jsoup.select.Elements elements25 = element21.getElementsByAttributeStarting("<hi!></hi!>");
        org.jsoup.nodes.Node node26 = element21.root();
        org.jsoup.nodes.Element element27 = element9.appendChild(node26);
        org.jsoup.select.Elements elements28 = element9.siblingElements();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements28);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        java.lang.String str3 = element2.ownText();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = element2.siblingNodes();
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element2.getElementsByAttributeValueMatching("<hi! class=\"<hi!></hi!> hi!\" value=\"hi!\"></hi!>", pattern6);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        boolean boolean5 = element2.hasClass("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element2.dataset();
        org.jsoup.select.Elements elements8 = element2.getElementsByAttributeStarting("<hi! class=\"hi!\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = element2.is("<hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>': unexpected token at '<hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element13 = element9.tagName("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = element9.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element20 = element5.classNames((java.util.Set<java.lang.String>) strSet17);
        boolean boolean21 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element5);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element23 = element5.child((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        org.jsoup.parser.Tag tag7 = element1.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element10.empty();
        java.lang.String str12 = element10.outerHtml();
        org.jsoup.nodes.Attributes attributes13 = element10.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag7, "hi!", attributes13);
        java.lang.String str15 = element14.className();
        org.jsoup.nodes.Element element16 = element14.clone();
        org.jsoup.nodes.Document document17 = element16.ownerDocument();
        java.util.regex.Pattern pattern18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = document17.getElementsMatchingOwnText(pattern18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi!></hi!>" + "'", str12, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNull(document17);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.select.Elements elements5 = element1.children();
        org.jsoup.nodes.Document document6 = element1.ownerDocument();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        boolean boolean5 = element2.hasClass("hi!");
        java.lang.Integer int6 = element2.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element12 = element9.append("<hi!></hi!>");
        org.jsoup.nodes.Element element13 = element2.appendChild((org.jsoup.nodes.Node) element9);
        java.util.Set<java.lang.String> strSet14 = element9.classNames();
        org.jsoup.select.Elements elements16 = element9.getElementsContainingText("<<hi!></hi!>></<hi!></hi!>>");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String str6 = element1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = element1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi!></hi!>" + "'", str6, "<hi!></hi!>");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.select.Elements elements9 = element1.children();
        org.jsoup.nodes.Element element10 = element1.empty();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            element10.outerHtmlTail(appendable11, (int) (short) -1, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        java.lang.Object obj10 = null;
        boolean boolean11 = element2.equals(obj10);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element2.textNodes();
        java.util.regex.Pattern pattern14 = null;
        org.jsoup.select.Elements elements15 = element2.getElementsByAttributeValueMatching("hi!", pattern14);
        boolean boolean17 = element2.equals((java.lang.Object) 1.0d);
        org.jsoup.nodes.Element element18 = element2.clone();
        java.util.regex.Pattern pattern20 = null;
        org.jsoup.select.Elements elements21 = element2.getElementsByAttributeValueMatching("<hi!>\n hi!\n</hi!>", pattern20);
        org.jsoup.nodes.Document document22 = element2.ownerDocument();
        java.lang.String str23 = element2.className();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.removeClass("");
        org.jsoup.nodes.Document document4 = element1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = document4.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        java.lang.String str7 = element5.cssSelector();
        java.util.regex.Pattern pattern9 = null;
        org.jsoup.select.Elements elements10 = element5.getElementsByAttributeValueMatching("", pattern9);
        org.jsoup.nodes.Element element12 = element5.getElementById("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element14 = element5.appendElement("<hi! class=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        java.lang.String str7 = element5.cssSelector();
        java.util.regex.Pattern pattern9 = null;
        org.jsoup.select.Elements elements10 = element5.getElementsByAttributeValueMatching("", pattern9);
        java.lang.String str11 = element5.outerHtml();
        org.jsoup.nodes.Element element13 = element5.text("<hi!></hi!>");
        java.lang.Integer int14 = element13.elementSiblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element13.wrap("<hi! class=\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi!></hi!>" + "'", str11, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        java.lang.String str7 = element5.cssSelector();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element10.prepend("");
        org.jsoup.select.Elements elements14 = element10.siblingElements();
        org.jsoup.nodes.Element element16 = element10.appendText("hi!");
        org.jsoup.nodes.Element element17 = element10.clone();
        org.jsoup.nodes.Element element19 = element17.html("");
        boolean boolean20 = element5.equals((java.lang.Object) element19);
        // The following exception was thrown during execution in test generation
        try {
            element19.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element8.html("");
        java.lang.String str13 = element8.nodeName();
        org.jsoup.nodes.Element element14 = element8.previousElementSibling();
        org.jsoup.nodes.Element element15 = element8.empty();
        org.jsoup.nodes.Element element17 = element8.appendText("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element20 = element19.empty();
        org.jsoup.nodes.Element element21 = element20.empty();
        org.jsoup.nodes.Element element23 = element21.tagName("hi!");
        org.jsoup.nodes.Element element25 = element23.val("");
        java.lang.String str26 = element25.className();
        java.lang.String str27 = element25.text();
        // The following exception was thrown during execution in test generation
        try {
            element8.replaceWith((org.jsoup.nodes.Node) element25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        java.lang.Integer int10 = element9.elementSiblingIndex();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Element element14 = element13.empty();
        org.jsoup.nodes.Element element16 = element13.prepend("");
        org.jsoup.select.Elements elements17 = element13.siblingElements();
        org.jsoup.select.Elements elements18 = element13.getAllElements();
        org.jsoup.parser.Tag tag19 = element13.tag();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag19, "<hi!></hi!>");
        org.jsoup.select.Elements elements23 = element21.getElementsByIndexGreaterThan((int) (byte) 0);
        org.jsoup.select.Elements elements25 = element21.getElementsByAttributeStarting("<hi!></hi!>");
        org.jsoup.nodes.Node node26 = element21.root();
        org.jsoup.nodes.Element element27 = element9.appendChild(node26);
        org.jsoup.select.Elements elements30 = element9.getElementsByAttributeValueStarting("<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">\n hi!\n</hi!>", "<hi!></hi!>");
        org.jsoup.parser.Tag tag31 = element9.tag();
        org.jsoup.select.Evaluator evaluator32 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = element9.is(evaluator32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(tag31);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node4 = element1.root();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element10 = element7.prepend("");
        org.jsoup.nodes.Node node11 = element10.previousSibling();
        org.jsoup.nodes.Element element12 = element1.appendChild((org.jsoup.nodes.Node) element10);
        java.lang.String str13 = element1.nodeName();
        org.jsoup.nodes.Element element15 = element1.getElementById("<>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Tag tag16 = element15.tag();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(element15);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element5.childNodesCopy();
        java.lang.String str9 = element5.ownText();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = element5.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.nodes.Element element11 = element9.prepend("");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element14 = element13.empty();
        org.jsoup.nodes.Element element15 = element14.empty();
        org.jsoup.nodes.Element element17 = element14.prepend("");
        org.jsoup.select.Elements elements18 = element14.siblingElements();
        org.jsoup.select.Elements elements19 = element14.getAllElements();
        org.jsoup.select.Elements elements21 = element14.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements22 = element14.children();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element25 = element24.empty();
        org.jsoup.nodes.Element element26 = element25.empty();
        org.jsoup.nodes.Element element28 = element25.append("<hi!></hi!>");
        org.jsoup.nodes.Element element30 = element28.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element33 = element32.empty();
        org.jsoup.nodes.Element element34 = element33.empty();
        org.jsoup.nodes.Element element36 = element34.tagName("hi!");
        org.jsoup.nodes.Element element38 = element36.val("");
        org.jsoup.nodes.Element element39 = element30.prependChild((org.jsoup.nodes.Node) element38);
        java.lang.String[] strArray42 = new java.lang.String[] { "<hi! class=\"hi!\"></hi!>", "" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        org.jsoup.nodes.Element element45 = element30.classNames((java.util.Set<java.lang.String>) strSet43);
        org.jsoup.nodes.Element element46 = element14.classNames((java.util.Set<java.lang.String>) strSet43);
        org.jsoup.nodes.Element element47 = element11.appendChild((org.jsoup.nodes.Node) element14);
        boolean boolean49 = element14.hasClass("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        int int50 = element14.siblingIndex();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "<hi! class=\"hi!\"></hi!>", "" });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        org.jsoup.parser.Tag tag6 = element5.tag();
        java.lang.String str8 = element5.attr("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element5.clone();
        org.jsoup.select.Elements elements11 = element9.getElementsContainingText("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements15 = element13.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element17 = element13.tagName("hi!");
        org.jsoup.parser.Tag tag18 = element17.tag();
        // The following exception was thrown during execution in test generation
        try {
            element9.replaceWith((org.jsoup.nodes.Node) element17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(tag18);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        java.lang.Object obj10 = null;
        boolean boolean11 = element2.equals(obj10);
        org.jsoup.select.Elements elements13 = element2.getElementsMatchingText("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element2.siblingNodes();
        java.util.regex.Pattern pattern15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = element2.getElementsMatchingOwnText(pattern15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.parser.Tag tag8 = element2.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element12 = element11.empty();
        org.jsoup.nodes.Element element14 = element11.append("<hi!></hi!>");
        java.lang.String str15 = element11.ownText();
        java.lang.Integer int16 = element11.elementSiblingIndex();
        org.jsoup.nodes.Node node17 = element11.root();
        org.jsoup.nodes.Element element18 = element2.appendChild(node17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = element18.is("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '': unexpected token at ''");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        java.lang.String str3 = element1.outerHtml();
        org.jsoup.nodes.Attributes attributes4 = element1.attributes();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element10 = element7.prepend("");
        org.jsoup.select.Elements elements12 = element7.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Element element13 = element1.appendChild((org.jsoup.nodes.Node) element7);
        java.lang.String str14 = element1.baseUri();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element17 = element16.empty();
        org.jsoup.nodes.Element element18 = element17.empty();
        org.jsoup.nodes.Element element20 = element17.append("<hi!></hi!>");
        org.jsoup.nodes.Element element22 = element20.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element25 = element24.empty();
        org.jsoup.nodes.Element element26 = element25.empty();
        org.jsoup.nodes.Element element28 = element26.tagName("hi!");
        org.jsoup.nodes.Element element30 = element28.val("");
        org.jsoup.nodes.Element element31 = element22.prependChild((org.jsoup.nodes.Node) element30);
        boolean boolean33 = element22.hasClass("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element35 = element22.prependText("");
        org.jsoup.select.Elements elements36 = element35.children();
        java.lang.String str37 = element35.cssSelector();
        // The following exception was thrown during execution in test generation
        try {
            element1.replaceWith((org.jsoup.nodes.Node) element35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<hi!></hi!>" + "'", str3, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<hi!></hi!>" + "'", str37, "<hi!></hi!>");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.nodes.Element element11 = element9.prepend("");
        org.jsoup.select.Elements elements13 = element9.getElementsByIndexGreaterThan((int) ' ');
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element9.childNodes();
        org.jsoup.nodes.Element element16 = element9.getElementById("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element19 = element18.empty();
        org.jsoup.nodes.Element element20 = element19.empty();
        org.jsoup.nodes.Element element22 = element19.prepend("");
        org.jsoup.nodes.Node node23 = element22.previousSibling();
        org.jsoup.select.Elements elements25 = element22.getElementsContainingText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList26 = element22.dataNodes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = element16.hasSameValue((java.lang.Object) dataNodeList26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(dataNodeList26);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node4 = element1.root();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element10 = element7.prepend("");
        org.jsoup.nodes.Node node11 = element10.previousSibling();
        org.jsoup.nodes.Element element12 = element1.appendChild((org.jsoup.nodes.Node) element10);
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements16 = element14.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element18 = element14.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = element18.dataset();
        org.jsoup.nodes.Element element21 = element18.tagName("hi!");
        org.jsoup.nodes.Element element23 = element21.prepend("hi!");
        org.jsoup.nodes.Element element25 = element23.prepend("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element28 = element25.attr("hi!", true);
        org.jsoup.nodes.Element element29 = element10.before((org.jsoup.nodes.Node) element25);
        java.lang.String str30 = element10.data();
        java.lang.String str31 = element10.baseUri();
        boolean boolean32 = element10.isBlock();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element9 = element2.attr("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>", true);
        org.jsoup.select.Elements elements11 = element9.getElementsMatchingOwnText("<hi! class=\"\"></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element9.siblingNodes();
        org.jsoup.select.Elements elements15 = element9.getElementsByAttributeValueEnding("<hi! class=\"\"></hi!>", "<hi! class=\"<hi!></hi!> hi!\" value=\"<hi! class=&quot;hi!&quot;></hi!>\"></hi!>");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!></hi!>");
        org.jsoup.select.Evaluator evaluator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = element1.is(evaluator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.parser.Tag tag8 = element2.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element12 = element11.empty();
        org.jsoup.nodes.Element element14 = element11.append("<hi!></hi!>");
        java.lang.String str15 = element11.ownText();
        java.lang.Integer int16 = element11.elementSiblingIndex();
        org.jsoup.nodes.Node node17 = element11.root();
        org.jsoup.nodes.Element element18 = element2.appendChild(node17);
        java.lang.String str19 = element2.outerHtml();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<hi!>\n <hi!>\n  <hi!></hi!>\n </hi!>\n</hi!>" + "'", str19, "<hi!>\n <hi!>\n  <hi!></hi!>\n </hi!>\n</hi!>");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        boolean boolean18 = element7.hasClass("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element20 = element7.prependText("");
        org.jsoup.nodes.Element element22 = element20.prepend("");
        element22.setBaseUri("");
        boolean boolean26 = element22.hasAttr("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.removeClass("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = element1.siblingNodes();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String str6 = element1.toString();
        org.jsoup.nodes.Element element8 = element1.toggleClass("<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element8.tagName("<hi! class=\"hi!\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element10.child(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi!></hi!>" + "'", str6, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        boolean boolean18 = element7.hasClass("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element20 = element7.prependText("");
        org.jsoup.select.Elements elements21 = element20.children();
        java.lang.String str22 = element20.cssSelector();
        org.jsoup.select.Elements elements25 = element20.getElementsByAttributeValueEnding("<hi! class=\"\"></hi!>", "<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">\n hi!\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            element20.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<hi!></hi!>" + "'", str22, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element13 = element9.tagName("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = element9.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element20 = element5.classNames((java.util.Set<java.lang.String>) strSet17);
        boolean boolean21 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element5);
        org.jsoup.select.Elements elements24 = element5.getElementsByAttributeValueStarting("hi!", "<hi! class=\"hi!\"></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = element5.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements28 = element5.getElementsByAttributeValueNot("<hi! class=\"<hi!></hi!> hi!\" value=\"<hi! class=&quot;hi!&quot;></hi!>\"></hi!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        java.lang.Object obj10 = null;
        boolean boolean11 = element2.equals(obj10);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element2.textNodes();
        java.util.regex.Pattern pattern14 = null;
        org.jsoup.select.Elements elements15 = element2.getElementsByAttributeValueMatching("hi!", pattern14);
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element2.siblingNodes();
        org.jsoup.select.Elements elements18 = element2.getElementsByAttribute("<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">\n hi!\n</hi!>");
        org.jsoup.select.Evaluator evaluator19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = element2.is(evaluator19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        org.jsoup.parser.Tag tag7 = element1.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element10.empty();
        java.lang.String str12 = element10.outerHtml();
        org.jsoup.nodes.Attributes attributes13 = element10.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag7, "hi!", attributes13);
        java.lang.String str15 = element14.className();
        org.jsoup.nodes.Element element16 = element14.clone();
        org.jsoup.nodes.Element element18 = element16.append("hi!.<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = element16.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi!></hi!>" + "'", str12, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element10.tagName("<hi! class=\"<hi!></hi!>\"></hi!>");
        java.lang.String str13 = element12.ownText();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.nodes.Element element11 = element9.tagName("<hi! class=\"hi!\"></hi!>");
        java.lang.String str12 = element9.ownText();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsContainingText("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Document document10 = element2.ownerDocument();
        java.lang.String str11 = element2.toString();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi!></hi!>" + "'", str11, "<hi!></hi!>");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = element1.classNames((java.util.Set<java.lang.String>) strSet9);
        java.lang.String str12 = element1.toString();
        java.lang.String str13 = element1.text();
        org.jsoup.nodes.Attributes attributes14 = element1.attributes();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi! class=\"hi!\"></hi!>" + "'", str12, "<hi! class=\"hi!\"></hi!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.select.Elements elements12 = element8.getElementsMatchingOwnText("hi!");
        org.jsoup.nodes.Element element14 = element8.val("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            element14.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Element element8 = element5.tagName("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = element5.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        boolean boolean18 = element7.hasClass("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element20 = element7.prependText("");
        org.jsoup.select.Elements elements21 = element7.getAllElements();
        org.jsoup.nodes.Element element23 = element7.prepend("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = element7.siblingNodes();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(nodeList24);
    }
}

