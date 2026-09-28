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
        org.jsoup.nodes.Node node0 = null;
        boolean boolean1 = org.jsoup.nodes.Element.preserveWhitespace(node0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
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
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
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
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
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
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = element2.hasParent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
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
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueEnding("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements9 = element7.getElementsByClass("hi!");
        org.jsoup.nodes.Element element11 = element7.html("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element5.after((org.jsoup.nodes.Node) element7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = element1.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            element2.doSetBaseUri("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.nextElementSibling();
        org.jsoup.nodes.Attributes attributes11 = element9.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element1.after((org.jsoup.nodes.Node) element9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
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
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element6 = element5.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element6.getElementsByIndexEquals((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueNot("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.parser.Tag tag8 = element7.tag();
        java.util.Set<java.lang.String> strSet9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element7.classNames(strSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsByClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element1.after((org.jsoup.nodes.Node) element9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Element element5 = element1.attr("", "");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element8 = element7.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element5.before((org.jsoup.nodes.Node) element7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Element element5 = element1.attr("", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueStarting("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element1.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.select.Evaluator evaluator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = element1.is(evaluator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Element element5 = element1.attr("", "");
        java.util.regex.Pattern pattern6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = element5.getElementsMatchingText(pattern6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.select.Elements elements6 = element1.getAllElements();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = element1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element1.child((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element6 = element5.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element5.getElementsByClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = element1.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        boolean boolean6 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements7 = element1.children();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.nextElementSibling();
        org.jsoup.nodes.Attributes attributes11 = element9.attributes();
        org.jsoup.nodes.Element element13 = element9.text("");
        int int14 = element9.siblingIndex();
        org.jsoup.nodes.Element element16 = element9.text("hi!");
        // The following exception was thrown during execution in test generation
        try {
            element1.replaceWith((org.jsoup.nodes.Node) element16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueNot("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.util.regex.Pattern pattern8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element1.getElementsMatchingOwnText(pattern8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element1.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        java.lang.String str7 = element1.val();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            element1.outerHtmlHead(appendable8, (int) (short) 1, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element9 = element6.appendText("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = element6.is("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '': unexpected token at ''");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element8.getElementsByAttributeStarting("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.lang.String str8 = element7.text();
        org.jsoup.select.Elements elements11 = element7.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element7.getElementsByAttributeValueContaining("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.select.Elements elements7 = element1.getAllElements();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = element1.textNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element1.getElementsByAttributeValueNot("", "<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(textNodeList8);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        org.jsoup.nodes.Element element6 = element1.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = element6.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        java.lang.String str8 = element1.cssSelector();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = element1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.tagName();
        org.jsoup.nodes.Element element12 = element1.text("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements16 = element14.getElementsByClass("hi!");
        org.jsoup.nodes.Element element18 = element14.html("");
        org.jsoup.nodes.Element element19 = element18.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = element18.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element21 = element1.after((org.jsoup.nodes.Node) element18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element8.nextElementSibling();
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element8);
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.parent();
        org.jsoup.nodes.Node node14 = element12.parentNode();
        org.jsoup.select.Elements elements16 = element12.getElementsByIndexLessThan(1);
        boolean boolean17 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element12);
        org.jsoup.select.Elements elements18 = element12.children();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements22 = element20.getElementsByClass("hi!");
        org.jsoup.nodes.Element element24 = element20.html("");
        org.jsoup.nodes.Element element25 = element24.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = element24.siblingNodes();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element29 = element28.parent();
        org.jsoup.nodes.Node node30 = element28.parentNode();
        org.jsoup.select.Elements elements32 = element28.getElementsByIndexLessThan(1);
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element35 = element34.nextElementSibling();
        org.jsoup.nodes.Attributes attributes36 = element34.attributes();
        org.jsoup.nodes.Element element38 = element34.text("");
        int int39 = element34.siblingIndex();
        org.jsoup.nodes.Element element41 = element34.text("hi!");
        boolean boolean42 = element34.hasParent();
        java.lang.String str43 = element34.tagName();
        org.jsoup.nodes.Node[] nodeArray44 = new org.jsoup.nodes.Node[] { element8, element12, element24, element28, element34 };
        org.jsoup.nodes.Element element45 = element1.insertChildren((int) (short) 0, nodeArray44);
        int int46 = element1.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements48 = element1.select("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!': unexpected token at '!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(nodeArray44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element8.getElementsByAttributeStarting("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element8.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Element element5 = element1.attr("", "");
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements12 = element10.getElementsByClass("hi!");
        org.jsoup.select.Elements elements13 = element10.getAllElements();
        boolean boolean14 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element10);
        org.jsoup.select.Elements elements15 = element10.siblingElements();
        org.jsoup.select.Elements elements16 = element10.getAllElements();
        org.jsoup.select.Elements elements18 = element10.getElementsMatchingOwnText("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element1.before((org.jsoup.nodes.Node) element10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Element element5 = element1.attr("", "");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element8.nextElementSibling();
        org.jsoup.nodes.Element element12 = element8.attr("", "");
        org.jsoup.select.Elements elements15 = element8.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element5.insertChildren((int) (byte) 10, (java.util.Collection<org.jsoup.nodes.Element>) elements15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "hi!");
        org.jsoup.select.Evaluator evaluator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = element10.is(evaluator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.nodes.Node node7 = element1.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            element1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node3 = element1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = element1.textNodes();
        org.jsoup.nodes.Node node9 = element1.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element1.getElementsByAttributeValue("<hi!></hi!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(textNodeList8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.tagName();
        java.lang.String str11 = element1.text();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element14 = element13.nextElementSibling();
        org.jsoup.nodes.Attributes attributes15 = element13.attributes();
        org.jsoup.nodes.Element element16 = element1.prependChild((org.jsoup.nodes.Node) element13);
        java.util.Collection<org.jsoup.nodes.Element> elementCollection18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element1.insertChildren(1, elementCollection18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Children collection to be inserted must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        java.util.regex.Pattern pattern6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = element1.getElementsMatchingText(pattern6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        java.lang.String str6 = element5.val();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = element5.is("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!></hi!>': unexpected token at '<hi!></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Element element5 = element1.attr("", "");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements9 = element7.getElementsByClass("hi!");
        org.jsoup.nodes.Element element11 = element7.html("");
        org.jsoup.nodes.Element element13 = element7.toggleClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList14 = element7.textNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element1.before((org.jsoup.nodes.Node) element7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(textNodeList14);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Element element5 = element1.attr("", "");
        java.lang.String str6 = element5.text();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element8.nextElementSibling();
        org.jsoup.nodes.Attributes attributes10 = element8.attributes();
        java.lang.String str11 = element8.cssSelector();
        org.jsoup.nodes.Element element13 = element8.prependText("hi!");
        org.jsoup.nodes.Element element14 = element13.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element5.after((org.jsoup.nodes.Node) element14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "hi!");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        org.jsoup.select.Elements elements14 = element12.getElementsContainingOwnText("hi!");
        boolean boolean15 = element12.hasText();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.lang.String str8 = element7.text();
        java.lang.String str9 = element7.id();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element7.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.lang.String str8 = element7.text();
        org.jsoup.select.Elements elements11 = element7.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi!></hi!>");
        element7.doSetBaseUri("hi!");
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements17 = element15.getElementsByClass("hi!");
        org.jsoup.nodes.Element element19 = element15.html("");
        org.jsoup.nodes.Element element21 = element15.toggleClass("");
        java.lang.String str22 = element21.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element23 = element7.after((org.jsoup.nodes.Node) element21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.select.Elements elements7 = element1.getAllElements();
        boolean boolean8 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements13 = element11.getElementsByClass("hi!");
        org.jsoup.nodes.Element element15 = element11.html("");
        org.jsoup.nodes.Element element17 = element11.toggleClass("");
        org.jsoup.parser.Tag tag18 = element17.tag();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag18, "hi!");
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag18, "<hi!></hi!>");
        org.jsoup.select.Elements elements24 = element22.getElementsContainingOwnText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = element1.insertChildren((int) '4', (java.util.Collection<org.jsoup.nodes.Element>) elements24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = element1.before("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        element1.doSetBaseUri("hi!");
        java.util.regex.Pattern pattern6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = element1.getElementsMatchingOwnText(pattern6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.nodes.Element element4 = element1.empty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = element1.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (short) -1);
        java.util.regex.Pattern pattern6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = element1.getElementsMatchingOwnText(pattern6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.lang.String str8 = element1.html();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList9 = element1.dataNodes();
        org.jsoup.nodes.Document document10 = element1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = document10.data();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(dataNodeList9);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element6 = element5.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.siblingNodes();
        org.jsoup.select.Evaluator evaluator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = element5.is(evaluator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        java.lang.String str4 = element1.toString();
        java.util.regex.Pattern pattern5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element1.getElementsMatchingOwnText(pattern5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = element1.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element6 = element5.parent();
        // The following exception was thrown during execution in test generation
        try {
            element6.setBaseUri("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.nodes.Element element8 = element1.prepend("<hi!>\n hi!\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element1.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements13 = element7.getElementsByTag("hi!");
        org.jsoup.nodes.Element element15 = element7.tagName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = element7.child((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element8.selectFirst("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!></hi!>': unexpected token at '<hi!></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = element2.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsByClass("hi!");
        org.jsoup.select.Elements elements13 = element8.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.select.Elements elements16 = element8.getElementsByAttributeValueMatching("", "<hi!></hi!>");
        org.jsoup.nodes.Node[] nodeArray17 = new org.jsoup.nodes.Node[] { element8 };
        org.jsoup.nodes.Element element18 = element1.insertChildren((-1), nodeArray17);
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            element18.outerHtmlTail(appendable19, 0, outputSettings21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(nodeArray17);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element7.childNodes;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element7.getElementsByClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = element1.textNodes();
        org.jsoup.nodes.Node node9 = element1.clearAttributes();
        org.jsoup.nodes.Node node10 = node9.previousSibling();
        boolean boolean11 = org.jsoup.nodes.Element.preserveWhitespace(node9);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(textNodeList8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element9 = element6.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements13 = element11.getElementsByClass("hi!");
        org.jsoup.nodes.Element element15 = element11.html("");
        java.lang.String str16 = element15.val();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = element18.childNodes();
        org.jsoup.nodes.Element element20 = element15.appendTo(element18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element21 = element9.after((org.jsoup.nodes.Node) element18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Attributes attributes6 = element1.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element1.getElementsByAttributeValueContaining("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.lang.String str8 = element1.html();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList9 = element1.dataNodes();
        org.jsoup.nodes.Document document10 = element1.ownerDocument();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = document10.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(dataNodeList9);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        org.jsoup.nodes.Node node11 = element8.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.select.Elements elements3 = element1.children();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            element1.outerHtmlTail(appendable4, 10, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(elements3);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        java.lang.String str8 = element1.cssSelector();
        boolean boolean10 = element1.hasClass("<hi!></hi!>");
        org.jsoup.nodes.Element element12 = element1.removeClass("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element1.tagName("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Tag name must not be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = element1.textNodes();
        org.jsoup.nodes.Attributes attributes9 = element1.attributes();
        org.jsoup.select.Elements elements11 = element1.getElementsContainingText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            element1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(textNodeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.appendElement("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element8.child((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.select.Elements elements7 = element1.getAllElements();
        boolean boolean8 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element1.getElementsByAttribute("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element7.childNodes;
        org.jsoup.nodes.Element element10 = element7.prependText("<hi!></hi!>");
        org.jsoup.select.Elements elements13 = element7.getElementsByAttributeValueMatching("<hi!>\n hi!\n</hi!>", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element7.child((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = node3.hasAttr("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements13 = element7.getElementsByTag("hi!");
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element17 = element16.nextElementSibling();
        boolean boolean18 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element16);
        int int19 = element16.siblingIndex();
        org.jsoup.nodes.Element element22 = element16.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements24 = element22.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements26 = element22.getElementsByIndexLessThan((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element27 = element7.insertChildren(10, (java.util.Collection<org.jsoup.nodes.Element>) elements26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.tagName();
        org.jsoup.select.Elements elements12 = element1.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.select.Elements elements13 = element1.parents();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element17 = element16.nextElementSibling();
        boolean boolean18 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element16);
        int int19 = element16.siblingIndex();
        org.jsoup.nodes.Element element22 = element16.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements24 = element22.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements26 = element22.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements28 = element22.getElementsByTag("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element29 = element1.insertChildren(100, (java.util.Collection<org.jsoup.nodes.Element>) elements28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements28);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
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
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.nodes.Node node7 = element1.clearAttributes();
        org.jsoup.nodes.Element element9 = element1.addClass("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = element1.is("<hi!>\n <hi!></hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!>? <hi!></hi!>?</hi!>': unexpected token at '<hi!>? <hi!></hi!>?</hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = element1.childNodes();
        org.jsoup.select.Elements elements5 = element1.getElementsByAttributeValue("<hi!></hi!>", "hi!");
        java.lang.String str6 = element1.cssSelector();
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.nodes.Node node7 = element1.clearAttributes();
        org.jsoup.nodes.Element element9 = element1.addClass("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element9.after("<hi!>\n <hi!></hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.nodeName();
        org.jsoup.select.NodeVisitor nodeVisitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = element1.traverse(nodeVisitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.siblingElements();
        org.jsoup.select.Elements elements7 = element1.getAllElements();
        org.jsoup.select.Elements elements9 = element1.getElementsMatchingOwnText("");
        boolean boolean11 = element1.hasAttr("");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        element14.setBaseUri("hi!");
        org.jsoup.nodes.Element element17 = element14.empty();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element20 = element19.parent();
        org.jsoup.nodes.Node node21 = element19.parentNode();
        org.jsoup.select.Elements elements23 = element19.getElementsByIndexLessThan(1);
        boolean boolean24 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element19);
        org.jsoup.select.Elements elements26 = element19.getElementsContainingOwnText("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = element28.childNodes();
        org.jsoup.select.Elements elements32 = element28.getElementsByAttributeValue("<hi!></hi!>", "hi!");
        java.lang.String str33 = element28.cssSelector();
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element36 = element35.nextElementSibling();
        org.jsoup.nodes.Attributes attributes37 = element35.attributes();
        org.jsoup.nodes.Element element39 = element35.text("");
        int int40 = element35.siblingIndex();
        org.jsoup.nodes.Element element42 = element35.text("hi!");
        java.lang.String str43 = element42.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList44 = element42.siblingNodes();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements48 = element46.getElementsByClass("hi!");
        org.jsoup.nodes.Element element50 = element46.html("");
        org.jsoup.nodes.Element element51 = element50.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList52 = element50.siblingNodes();
        org.jsoup.nodes.Element element54 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements56 = element54.getElementsByClass("hi!");
        org.jsoup.nodes.Element element58 = element54.html("");
        org.jsoup.nodes.Element element60 = element54.toggleClass("");
        java.lang.String str61 = element60.text();
        java.lang.String str62 = element60.id();
        org.jsoup.nodes.Element element63 = element50.doClone((org.jsoup.nodes.Node) element60);
        org.jsoup.nodes.Node node64 = element60.previousSibling();
        java.lang.String str65 = element60.id();
        org.jsoup.nodes.Node[] nodeArray66 = new org.jsoup.nodes.Node[] { element14, element19, element28, element42, element60 };
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element67 = element1.insertChildren((int) (short) 1, nodeArray66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNull(element36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str43, "<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNull(element51);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(nodeArray66);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.lang.String str8 = element1.html();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList9 = element1.dataNodes();
        java.lang.String str11 = element1.absUrl("hi!");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements15 = element13.getElementsByClass("hi!");
        java.lang.String str16 = element13.toString();
        java.lang.String str17 = element13.id();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element1.before((org.jsoup.nodes.Node) element13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(dataNodeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<hi!></hi!>" + "'", str16, "<hi!></hi!>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element9 = element6.appendText("<hi!></hi!>");
        java.util.regex.Pattern pattern10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element9.getElementsMatchingOwnText(pattern10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.tagName();
        java.lang.String str11 = element1.text();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = element1.is("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!></hi!>': unexpected token at '<hi!></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.parents();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element8.nextElementSibling();
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element8);
        int int11 = element8.siblingIndex();
        org.jsoup.nodes.Element element14 = element8.attr("hi!", "<hi!></hi!>");
        java.lang.String str15 = element8.cssSelector();
        boolean boolean17 = element8.hasClass("<hi!></hi!>");
        org.jsoup.nodes.Element element18 = element1.doClone((org.jsoup.nodes.Node) element8);
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element21 = element20.parent();
        org.jsoup.nodes.Node node22 = element20.parentNode();
        org.jsoup.select.Elements elements24 = element20.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList25 = element20.childNodes;
        org.jsoup.nodes.Element element27 = element20.prepend("<hi!>\n hi!\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element28 = element1.before((org.jsoup.nodes.Node) element20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        java.util.regex.Pattern pattern8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element1.getElementsMatchingText(pattern8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.select.Elements elements9 = element1.getElementsByAttributeValueMatching("", "<hi!></hi!>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements13 = element11.getElementsByClass("hi!");
        org.jsoup.nodes.Element element15 = element11.html("");
        org.jsoup.nodes.Element element16 = element15.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = element15.siblingNodes();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements21 = element19.getElementsByClass("hi!");
        org.jsoup.nodes.Element element23 = element19.html("");
        org.jsoup.nodes.Element element25 = element19.toggleClass("");
        java.lang.String str26 = element25.text();
        java.lang.String str27 = element25.id();
        org.jsoup.nodes.Element element28 = element15.doClone((org.jsoup.nodes.Node) element25);
        element25.doSetBaseUri("hi!");
        org.jsoup.nodes.Element element31 = element1.prependChild((org.jsoup.nodes.Node) element25);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element33 = element31.tagName("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Tag name must not be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element31);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.nodes.Element element4 = element1.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element4.getElementsByAttributeStarting("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element6 = element5.nextElementSibling();
        org.jsoup.nodes.Attributes attributes7 = element5.attributes();
        org.jsoup.nodes.Element element9 = element5.text("");
        int int10 = element5.siblingIndex();
        org.jsoup.nodes.Element element12 = element5.text("hi!");
        boolean boolean13 = element5.hasParent();
        java.lang.String str14 = element5.tagName();
        org.jsoup.select.Elements elements16 = element5.getElementsByIndexGreaterThan((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = element2.insertChildren((int) (short) 1, (java.util.Collection<org.jsoup.nodes.Element>) elements16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        org.jsoup.nodes.Element element10 = element1.prepend("hi!");
        org.jsoup.nodes.Element element11 = element10.clone();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element14 = element13.nextElementSibling();
        boolean boolean15 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element13);
        int int16 = element13.siblingIndex();
        org.jsoup.nodes.Element element19 = element13.attr("hi!", "<hi!></hi!>");
        java.lang.String str20 = element13.cssSelector();
        boolean boolean22 = element13.hasClass("<hi!></hi!>");
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        element24.setBaseUri("hi!");
        org.jsoup.nodes.Element element27 = element24.empty();
        org.jsoup.nodes.Element element28 = element13.appendChild((org.jsoup.nodes.Node) element27);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element29 = element11.before((org.jsoup.nodes.Node) element13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element6 = element5.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element6.prependElement("<hi!>\n hi!\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        java.lang.String str3 = element1.tagName();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element7 = element1.toggleClass("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element8 = element7.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element8.text("<hi! class=\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.nodes.Node node7 = element1.clearAttributes();
        org.jsoup.nodes.Element element9 = element1.addClass("");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueContaining("<hi!></hi!>", "<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element15 = element9.attr("", false);
        org.jsoup.select.Elements elements18 = element9.getElementsByAttributeValueEnding("hi!", "<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = element9.is("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '': unexpected token at ''");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList6 = element1.dataNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element1.selectFirst("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!': unexpected token at '!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(dataNodeList6);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        java.lang.String str7 = element1.val();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = element1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.lang.String str8 = element1.html();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList9 = element1.dataNodes();
        java.lang.String str11 = element1.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = element1.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(dataNodeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        java.lang.String str7 = element1.outerHtml();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<hi!></hi!>" + "'", str7, "<hi!></hi!>");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element8.childNodesCopy();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element13.childNodes();
        org.jsoup.nodes.Element element15 = element8.appendTo(element13);
        org.jsoup.nodes.Element element17 = element15.getElementById("<hi!></hi!>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(element17);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Element element5 = element1.attr("<hi!></hi!>", true);
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("", "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        org.jsoup.nodes.Element element10 = element1.appendText("");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            element1.outerHtmlHead(appendable11, (int) (short) 100, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element1.childNodesCopy();
        java.lang.String str6 = element1.outerHtml();
        org.jsoup.nodes.Element element7 = element1.shallowClone();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        element10.setBaseUri("hi!");
        org.jsoup.select.Elements elements14 = element10.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element18 = element17.nextElementSibling();
        boolean boolean19 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element22 = element21.parent();
        org.jsoup.nodes.Node node23 = element21.parentNode();
        org.jsoup.select.Elements elements25 = element21.getElementsByIndexLessThan(1);
        boolean boolean26 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element21);
        org.jsoup.select.Elements elements27 = element21.children();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements31 = element29.getElementsByClass("hi!");
        org.jsoup.nodes.Element element33 = element29.html("");
        org.jsoup.nodes.Element element34 = element33.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = element33.siblingNodes();
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element38 = element37.parent();
        org.jsoup.nodes.Node node39 = element37.parentNode();
        org.jsoup.select.Elements elements41 = element37.getElementsByIndexLessThan(1);
        org.jsoup.nodes.Element element43 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element44 = element43.nextElementSibling();
        org.jsoup.nodes.Attributes attributes45 = element43.attributes();
        org.jsoup.nodes.Element element47 = element43.text("");
        int int48 = element43.siblingIndex();
        org.jsoup.nodes.Element element50 = element43.text("hi!");
        boolean boolean51 = element43.hasParent();
        java.lang.String str52 = element43.tagName();
        org.jsoup.nodes.Node[] nodeArray53 = new org.jsoup.nodes.Node[] { element17, element21, element33, element37, element43 };
        org.jsoup.nodes.Element element54 = element10.insertChildren((int) (short) 0, nodeArray53);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element55 = element7.insertChildren((int) (byte) 100, nodeArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi!></hi!>" + "'", str6, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNull(element34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNull(element38);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNull(element44);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(nodeArray53);
        org.junit.Assert.assertNotNull(element54);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        java.lang.String str8 = element1.cssSelector();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = element1.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element1.childNodesCopy();
        boolean boolean7 = element1.hasClass("");
        org.jsoup.nodes.Document document8 = element1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = document8.tagName("<hi! class=\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element8 = element7.nextElementSibling();
        boolean boolean9 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element7);
        element7.doSetBaseUri("hi!");
        org.jsoup.nodes.Element element12 = element7.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element1.after((org.jsoup.nodes.Node) element7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        java.lang.String str9 = element8.outerHtml();
        org.jsoup.nodes.Element element11 = element8.appendText("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = element8.is("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!': unexpected token at '!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str9, "<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Element element5 = element1.attr("", "");
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element1.previousElementSibling();
        org.jsoup.nodes.Element element10 = element1.nextElementSibling();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements14 = element12.getElementsByClass("hi!");
        org.jsoup.nodes.Element element16 = element12.html("");
        org.jsoup.nodes.Element element18 = element12.toggleClass("");
        java.lang.String str19 = element18.text();
        org.jsoup.select.Elements elements22 = element18.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi!></hi!>");
        element18.doSetBaseUri("hi!");
        java.lang.String str25 = element18.html();
        // The following exception was thrown during execution in test generation
        try {
            element1.replaceWith((org.jsoup.nodes.Node) element18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Node node12 = element7.clearAttributes();
        java.lang.String str13 = node12.outerHtml();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<hi!></hi!>" + "'", str13, "<hi!></hi!>");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.appendElement("<hi!></hi!>");
        java.lang.String[] strArray15 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element20 = element18.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element22 = element20.text("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements25 = element22.getElementsByAttributeValueNot("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.lang.String str8 = element1.html();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList9 = element1.dataNodes();
        org.jsoup.nodes.Node node10 = element1.previousSibling();
        org.jsoup.nodes.Node[] nodeArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element1.insertChildren((int) (short) 100, nodeArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Children collection to be inserted must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(dataNodeList9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Attributes attributes6 = element1.attributes();
        // The following exception was thrown during execution in test generation
        try {
            element1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("", "hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements12 = element10.getElementsByClass("hi!");
        org.jsoup.nodes.Element element14 = element10.html("");
        org.jsoup.nodes.Element element15 = element14.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element14.siblingNodes();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements20 = element18.getElementsByClass("hi!");
        org.jsoup.nodes.Element element22 = element18.html("");
        org.jsoup.nodes.Element element24 = element18.toggleClass("");
        java.lang.String str25 = element24.text();
        java.lang.String str26 = element24.id();
        org.jsoup.nodes.Element element27 = element14.doClone((org.jsoup.nodes.Node) element24);
        element24.doSetBaseUri("hi!");
        org.jsoup.nodes.Element element30 = element1.prependChild((org.jsoup.nodes.Node) element24);
        org.jsoup.select.Elements elements32 = element1.getElementsContainingText("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element35 = element34.nextElementSibling();
        org.jsoup.nodes.Element element38 = element34.attr("", "");
        org.jsoup.select.Elements elements41 = element34.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Element element42 = element34.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element43 = element1.after((org.jsoup.nodes.Node) element34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNull(element42);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = element1.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            element1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList2);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Element element5 = element1.attr("", "");
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element1.previousElementSibling();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements13 = element11.getElementsByClass("hi!");
        org.jsoup.select.Elements elements14 = element11.getAllElements();
        boolean boolean15 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element11);
        org.jsoup.select.Elements elements16 = element11.parents();
        boolean boolean17 = element11.hasText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element9.appendChild((org.jsoup.nodes.Node) element11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element7.childNodes;
        org.jsoup.nodes.Element element10 = element7.prependText("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element10.child((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        java.lang.String str8 = element6.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element6.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = element6.is("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '': unexpected token at ''");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.tagName();
        org.jsoup.select.Elements elements12 = element1.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.nodes.Element element14 = element1.text("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements18 = element16.getElementsByClass("hi!");
        org.jsoup.nodes.Element element20 = element16.html("");
        org.jsoup.nodes.Element element21 = element1.doClone((org.jsoup.nodes.Node) element20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements23 = element21.getElementsByTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.nodes.Element element8 = element1.prepend("<hi!>\n hi!\n</hi!>");
        java.util.Set<java.lang.String> strSet9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element1.classNames(strSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.tagName();
        org.jsoup.select.Elements elements12 = element1.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.select.Elements elements13 = element1.parents();
        org.jsoup.nodes.Element element15 = element1.getElementById("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = element1.selectFirst("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNull(element15);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Node node4 = element1.parentNode();
        org.jsoup.select.Elements elements6 = element1.getElementsContainingOwnText("");
        org.jsoup.nodes.Element element7 = element1.clone();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements12 = element10.getElementsByClass("hi!");
        org.jsoup.select.Elements elements13 = element10.getAllElements();
        boolean boolean14 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element10);
        org.jsoup.nodes.Element element17 = element10.attr("", "hi!");
        java.lang.String str18 = element17.html();
        org.jsoup.nodes.Element element20 = element17.appendElement("<hi!></hi!>");
        java.lang.String[] strArray24 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        org.jsoup.nodes.Element element27 = element20.classNames((java.util.Set<java.lang.String>) strSet25);
        org.jsoup.nodes.Element element29 = element27.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element31 = element29.text("");
        org.jsoup.nodes.Element element33 = element31.append("<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements35 = element33.getElementsContainingText("<hi!>\n <hi!></hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element36 = element1.insertChildren((int) '#', (java.util.Collection<org.jsoup.nodes.Element>) elements35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements35);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element8.childNodesCopy();
        org.jsoup.select.Elements elements12 = element8.parents();
        org.jsoup.parser.Tag tag13 = element8.tag();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag13, "<hi!></hi!>");
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            element15.outerHtmlHead(appendable16, (int) 'a', outputSettings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsMatchingText("");
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("<hi!>\n hi!\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        element8.doSetBaseUri("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element15 = element8.attr("hi!", true);
        boolean boolean16 = element15.isBlock();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.appendElement("<hi!></hi!>");
        java.lang.String[] strArray15 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element20 = element18.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element22 = element20.text("");
        org.jsoup.nodes.Element element24 = element22.append("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element28 = element27.nextElementSibling();
        boolean boolean29 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element27);
        int int30 = element27.siblingIndex();
        org.jsoup.nodes.Element element33 = element27.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements35 = element33.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements37 = element33.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element38 = element24.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements37);
        org.jsoup.select.Evaluator evaluator39 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = element38.is(evaluator39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNull(element28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element38);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        java.lang.String str4 = element1.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = element1.child((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            element1.outerHtmlHead(appendable4, (int) (short) 1, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements13 = element7.getElementsByTag("hi!");
        org.jsoup.nodes.Element element15 = element7.tagName("hi!");
        org.jsoup.nodes.Node node16 = element15.nextSibling();
        org.jsoup.nodes.Element element17 = element15.empty();
        org.jsoup.nodes.Element element18 = element17.clone();
        // The following exception was thrown during execution in test generation
        try {
            element17.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element8.nextElementSibling();
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element8);
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.parent();
        org.jsoup.nodes.Node node14 = element12.parentNode();
        org.jsoup.select.Elements elements16 = element12.getElementsByIndexLessThan(1);
        boolean boolean17 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element12);
        org.jsoup.select.Elements elements18 = element12.children();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements22 = element20.getElementsByClass("hi!");
        org.jsoup.nodes.Element element24 = element20.html("");
        org.jsoup.nodes.Element element25 = element24.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = element24.siblingNodes();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element29 = element28.parent();
        org.jsoup.nodes.Node node30 = element28.parentNode();
        org.jsoup.select.Elements elements32 = element28.getElementsByIndexLessThan(1);
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element35 = element34.nextElementSibling();
        org.jsoup.nodes.Attributes attributes36 = element34.attributes();
        org.jsoup.nodes.Element element38 = element34.text("");
        int int39 = element34.siblingIndex();
        org.jsoup.nodes.Element element41 = element34.text("hi!");
        boolean boolean42 = element34.hasParent();
        java.lang.String str43 = element34.tagName();
        org.jsoup.nodes.Node[] nodeArray44 = new org.jsoup.nodes.Node[] { element8, element12, element24, element28, element34 };
        org.jsoup.nodes.Element element45 = element1.insertChildren((int) (short) 0, nodeArray44);
        int int46 = element1.siblingIndex();
        org.jsoup.select.Elements elements47 = element1.getAllElements();
        java.lang.Appendable appendable48 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = null;
        // The following exception was thrown during execution in test generation
        try {
            element1.outerHtmlTail(appendable48, (int) (byte) 1, outputSettings50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(nodeArray44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(elements47);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        org.jsoup.nodes.Element element6 = element1.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = element6.hasAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        element8.doSetBaseUri("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements16 = element14.getElementsByClass("hi!");
        org.jsoup.nodes.Element element18 = element14.html("");
        org.jsoup.nodes.Element element20 = element14.toggleClass("");
        org.jsoup.parser.Tag tag21 = element20.tag();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag21, "hi!");
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag21, "<hi!></hi!>");
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements29 = element27.getElementsByClass("hi!");
        org.jsoup.select.Elements elements30 = element27.getAllElements();
        boolean boolean31 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element27);
        org.jsoup.select.Elements elements32 = element27.siblingElements();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = element27.childNodes;
        boolean boolean34 = element25.equals((java.lang.Object) nodeList33);
        org.jsoup.nodes.Element element35 = element8.prependChild((org.jsoup.nodes.Node) element25);
        java.lang.String str36 = element25.tagName();
        java.lang.Appendable appendable37 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = null;
        // The following exception was thrown during execution in test generation
        try {
            element25.outerHtmlHead(appendable37, (-1), outputSettings39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.nodes.Node node7 = element1.clearAttributes();
        org.jsoup.nodes.Element element9 = element1.addClass("");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueContaining("<hi!></hi!>", "<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element15 = element9.attr("", false);
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements20 = element18.getElementsByClass("hi!");
        org.jsoup.select.Elements elements21 = element18.getAllElements();
        boolean boolean22 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements27 = element25.getElementsByClass("hi!");
        org.jsoup.select.Elements elements30 = element25.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.select.Elements elements33 = element25.getElementsByAttributeValueMatching("", "<hi!></hi!>");
        org.jsoup.nodes.Node[] nodeArray34 = new org.jsoup.nodes.Node[] { element25 };
        org.jsoup.nodes.Element element35 = element18.insertChildren((-1), nodeArray34);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element36 = element15.insertChildren((int) '#', nodeArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(nodeArray34);
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("", "hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements12 = element10.getElementsByClass("hi!");
        org.jsoup.nodes.Element element14 = element10.html("");
        org.jsoup.nodes.Element element15 = element14.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element14.siblingNodes();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements20 = element18.getElementsByClass("hi!");
        org.jsoup.nodes.Element element22 = element18.html("");
        org.jsoup.nodes.Element element24 = element18.toggleClass("");
        java.lang.String str25 = element24.text();
        java.lang.String str26 = element24.id();
        org.jsoup.nodes.Element element27 = element14.doClone((org.jsoup.nodes.Node) element24);
        element24.doSetBaseUri("hi!");
        org.jsoup.nodes.Element element30 = element1.prependChild((org.jsoup.nodes.Node) element24);
        org.jsoup.nodes.Element element32 = element30.addClass("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = element30.is("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!>? &lt;hi! class=\"\"&gt;&lt;/hi!&gt;?</hi!>': unexpected token at '<hi!>? &lt;hi! class=\"\"&gt;&lt;/hi!&gt;?</hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements13 = element11.getElementsByClass("hi!");
        org.jsoup.select.Elements elements14 = element11.getAllElements();
        boolean boolean15 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element11);
        org.jsoup.nodes.Element element18 = element11.attr("", "hi!");
        java.lang.String str19 = element18.html();
        org.jsoup.nodes.Element element21 = element18.appendElement("<hi!></hi!>");
        java.lang.String[] strArray25 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        org.jsoup.nodes.Element element28 = element21.classNames((java.util.Set<java.lang.String>) strSet26);
        org.jsoup.nodes.Element element30 = element28.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element32 = element30.text("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element33 = element7.after((org.jsoup.nodes.Node) element30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.parents();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element1.getElementsByAttributeValueContaining("", "<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.siblingElements();
        org.jsoup.select.Elements elements7 = element1.getAllElements();
        org.jsoup.nodes.Element element9 = element1.prepend("<hi!>\n hi!\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element1.appendElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        java.lang.String str6 = element5.val();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element8.childNodes();
        org.jsoup.nodes.Element element10 = element5.appendTo(element8);
        boolean boolean11 = element8.hasParent();
        java.util.regex.Pattern pattern12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element8.getElementsMatchingText(pattern12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        boolean boolean6 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements7 = element1.children();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            element1.outerHtmlHead(appendable8, (int) (short) 10, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element1.childNodesCopy();
        boolean boolean7 = element1.hasClass("");
        java.util.regex.Pattern pattern8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element1.getElementsMatchingOwnText(pattern8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.nodes.Element element4 = element1.empty();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element1.textNodes();
        // The following exception was thrown during execution in test generation
        try {
            element1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(textNodeList5);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element7 = element1.toggleClass("<hi!>\n hi!\n</hi!>");
        element7.setBaseUri("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Document document10 = element7.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = document10.nextElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element9 = element6.appendText("<hi!></hi!>");
        java.lang.String str10 = element9.className();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element9.doClone((org.jsoup.nodes.Node) element12);
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element16 = element15.nextElementSibling();
        org.jsoup.nodes.Attributes attributes17 = element15.attributes();
        java.lang.String str18 = element15.cssSelector();
        org.jsoup.nodes.Element element20 = element15.prependText("hi!");
        org.jsoup.nodes.Element element21 = element20.empty();
        org.jsoup.nodes.Element element23 = element20.appendText("<hi!></hi!>");
        java.lang.String str24 = element23.className();
        org.jsoup.select.Elements elements26 = element23.getElementsByAttributeStarting("<hi!>\n <hi!></hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element27 = element12.before((org.jsoup.nodes.Node) element23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.lang.String str8 = element1.html();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList9 = element1.dataNodes();
        java.lang.String str11 = element1.absUrl("hi!");
        org.jsoup.select.Elements elements13 = element1.getElementsByIndexGreaterThan((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element1.child((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(dataNodeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.select.Elements elements7 = element1.getAllElements();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element10.nextElementSibling();
        org.jsoup.nodes.Attributes attributes12 = element10.attributes();
        org.jsoup.nodes.Element element14 = element10.text("");
        int int15 = element10.siblingIndex();
        org.jsoup.nodes.Element element17 = element10.text("hi!");
        org.jsoup.select.Elements elements19 = element17.getElementsMatchingText("");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = element17.childNodesCopy();
        org.jsoup.select.Elements elements21 = element17.parents();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = element1.insertChildren((int) ' ', (java.util.Collection<org.jsoup.nodes.Element>) elements21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element8.nextElementSibling();
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element8);
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.parent();
        org.jsoup.nodes.Node node14 = element12.parentNode();
        org.jsoup.select.Elements elements16 = element12.getElementsByIndexLessThan(1);
        boolean boolean17 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element12);
        org.jsoup.select.Elements elements18 = element12.children();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements22 = element20.getElementsByClass("hi!");
        org.jsoup.nodes.Element element24 = element20.html("");
        org.jsoup.nodes.Element element25 = element24.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = element24.siblingNodes();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element29 = element28.parent();
        org.jsoup.nodes.Node node30 = element28.parentNode();
        org.jsoup.select.Elements elements32 = element28.getElementsByIndexLessThan(1);
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element35 = element34.nextElementSibling();
        org.jsoup.nodes.Attributes attributes36 = element34.attributes();
        org.jsoup.nodes.Element element38 = element34.text("");
        int int39 = element34.siblingIndex();
        org.jsoup.nodes.Element element41 = element34.text("hi!");
        boolean boolean42 = element34.hasParent();
        java.lang.String str43 = element34.tagName();
        org.jsoup.nodes.Node[] nodeArray44 = new org.jsoup.nodes.Node[] { element8, element12, element24, element28, element34 };
        org.jsoup.nodes.Element element45 = element1.insertChildren((int) (short) 0, nodeArray44);
        org.jsoup.nodes.Element element46 = element1.shallowClone();
        org.jsoup.nodes.Element element48 = element46.appendText("<hi! class=\"\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element50 = element48.selectFirst("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!': unexpected token at '!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(nodeArray44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element48);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.appendElement("<hi!></hi!>");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = element8.dataset();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        element8.doSetBaseUri("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element14 = element8.toggleClass("<hi! class=\"\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element14.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.appendElement("<hi!></hi!>");
        java.lang.String[] strArray15 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element11.classNames((java.util.Set<java.lang.String>) strSet16);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = element18.getElementById("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element8 = element7.nextElementSibling();
        org.jsoup.nodes.Attributes attributes9 = element7.attributes();
        org.jsoup.nodes.Element element11 = element7.text("");
        int int12 = element7.siblingIndex();
        org.jsoup.nodes.Element element14 = element7.text("hi!");
        java.lang.String str15 = element14.outerHtml();
        org.jsoup.nodes.Element element17 = element14.appendText("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element1.after((org.jsoup.nodes.Node) element14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str15, "<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        java.lang.String str8 = element1.cssSelector();
        boolean boolean10 = element1.hasClass("<hi!></hi!>");
        org.jsoup.nodes.Element element12 = element1.removeClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList13 = element1.dataNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element1.getElementsByClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(dataNodeList13);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element8.nextElementSibling();
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element8);
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.parent();
        org.jsoup.nodes.Node node14 = element12.parentNode();
        org.jsoup.select.Elements elements16 = element12.getElementsByIndexLessThan(1);
        boolean boolean17 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element12);
        org.jsoup.select.Elements elements18 = element12.children();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements22 = element20.getElementsByClass("hi!");
        org.jsoup.nodes.Element element24 = element20.html("");
        org.jsoup.nodes.Element element25 = element24.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = element24.siblingNodes();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element29 = element28.parent();
        org.jsoup.nodes.Node node30 = element28.parentNode();
        org.jsoup.select.Elements elements32 = element28.getElementsByIndexLessThan(1);
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element35 = element34.nextElementSibling();
        org.jsoup.nodes.Attributes attributes36 = element34.attributes();
        org.jsoup.nodes.Element element38 = element34.text("");
        int int39 = element34.siblingIndex();
        org.jsoup.nodes.Element element41 = element34.text("hi!");
        boolean boolean42 = element34.hasParent();
        java.lang.String str43 = element34.tagName();
        org.jsoup.nodes.Node[] nodeArray44 = new org.jsoup.nodes.Node[] { element8, element12, element24, element28, element34 };
        org.jsoup.nodes.Element element45 = element1.insertChildren((int) (short) 0, nodeArray44);
        org.jsoup.nodes.Element element46 = element1.shallowClone();
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element49 = element48.nextElementSibling();
        boolean boolean50 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element48);
        int int51 = element48.siblingIndex();
        org.jsoup.nodes.Element element54 = element48.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements56 = element54.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements58 = element54.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Node node59 = element54.clearAttributes();
        org.jsoup.nodes.Element element60 = element1.appendChild(node59);
        org.jsoup.nodes.Node node62 = node59.removeAttr("<hi!>\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(nodeArray44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNull(element49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertNotNull(elements58);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(node62);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.nodes.Element element4 = element1.empty();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements8 = element6.getElementsByClass("hi!");
        org.jsoup.select.Elements elements9 = element6.getAllElements();
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element6);
        org.jsoup.nodes.Element element13 = element6.attr("", "hi!");
        java.lang.String str14 = element13.html();
        org.jsoup.nodes.Element element16 = element13.appendElement("<hi!></hi!>");
        java.lang.String[] strArray20 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        org.jsoup.nodes.Element element23 = element16.classNames((java.util.Set<java.lang.String>) strSet21);
        org.jsoup.nodes.Element element24 = element4.classNames((java.util.Set<java.lang.String>) strSet21);
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements28 = element26.getElementsByClass("hi!");
        org.jsoup.select.Elements elements29 = element26.getAllElements();
        boolean boolean30 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element26);
        org.jsoup.select.Elements elements33 = element26.getElementsByAttributeValueMatching("", "hi!");
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements37 = element35.getElementsByClass("hi!");
        org.jsoup.nodes.Element element39 = element35.html("");
        org.jsoup.nodes.Element element40 = element39.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = element39.siblingNodes();
        org.jsoup.nodes.Element element43 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements45 = element43.getElementsByClass("hi!");
        org.jsoup.nodes.Element element47 = element43.html("");
        org.jsoup.nodes.Element element49 = element43.toggleClass("");
        java.lang.String str50 = element49.text();
        java.lang.String str51 = element49.id();
        org.jsoup.nodes.Element element52 = element39.doClone((org.jsoup.nodes.Node) element49);
        element49.doSetBaseUri("hi!");
        org.jsoup.nodes.Element element55 = element26.prependChild((org.jsoup.nodes.Node) element49);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element56 = element24.after((org.jsoup.nodes.Node) element26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNull(element40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element55);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.tagName();
        org.jsoup.select.Elements elements12 = element1.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.nodes.Element element14 = element1.text("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements18 = element16.getElementsByClass("hi!");
        org.jsoup.nodes.Element element20 = element16.html("");
        org.jsoup.nodes.Element element21 = element1.doClone((org.jsoup.nodes.Node) element20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements24 = element1.getElementsByAttributeValue("<hi!></hi!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.siblingElements();
        org.jsoup.select.Elements elements7 = element1.getAllElements();
        org.jsoup.select.Elements elements9 = element1.getElementsMatchingOwnText("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = element1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element1.child((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        element8.doSetBaseUri("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements16 = element14.getElementsByClass("hi!");
        org.jsoup.nodes.Element element18 = element14.html("");
        org.jsoup.nodes.Element element20 = element14.toggleClass("");
        org.jsoup.parser.Tag tag21 = element20.tag();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag21, "hi!");
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag21, "<hi!></hi!>");
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements29 = element27.getElementsByClass("hi!");
        org.jsoup.select.Elements elements30 = element27.getAllElements();
        boolean boolean31 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element27);
        org.jsoup.select.Elements elements32 = element27.siblingElements();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = element27.childNodes;
        boolean boolean34 = element25.equals((java.lang.Object) nodeList33);
        org.jsoup.nodes.Element element35 = element8.prependChild((org.jsoup.nodes.Node) element25);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements38 = element25.getElementsByAttributeValueEnding("", "<hi!>\n <hi!></hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.select.NodeFilter nodeFilter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = element1.filter(nodeFilter5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element6 = element5.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.siblingNodes();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsByClass("hi!");
        org.jsoup.nodes.Element element13 = element9.html("");
        org.jsoup.nodes.Element element15 = element9.toggleClass("");
        java.lang.String str16 = element15.text();
        java.lang.String str17 = element15.id();
        org.jsoup.nodes.Element element18 = element5.doClone((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element21 = element20.nextElementSibling();
        org.jsoup.nodes.Attributes attributes22 = element20.attributes();
        org.jsoup.nodes.Element element24 = element20.text("");
        int int25 = element20.siblingIndex();
        org.jsoup.nodes.Element element27 = element20.text("hi!");
        boolean boolean28 = element20.hasParent();
        java.lang.String str29 = element20.tagName();
        java.lang.String str30 = element20.text();
        org.jsoup.nodes.Node node32 = element20.removeAttr("<hi! class=\"\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element33 = element5.after(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element6 = element5.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.siblingNodes();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsByClass("hi!");
        org.jsoup.nodes.Element element13 = element9.html("");
        org.jsoup.nodes.Element element15 = element9.toggleClass("");
        java.lang.String str16 = element15.text();
        java.lang.String str17 = element15.id();
        org.jsoup.nodes.Element element18 = element5.doClone((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Node node19 = element15.previousSibling();
        java.lang.String str20 = element15.id();
        java.lang.String str21 = element15.cssSelector();
        org.jsoup.nodes.Node node22 = element15.previousSibling();
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        // The following exception was thrown during execution in test generation
        try {
            element15.outerHtmlHead(appendable23, (int) (short) 0, outputSettings25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.tagName();
        org.jsoup.select.Elements elements12 = element1.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.nodes.Element element14 = element1.text("<hi! class=\"\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = element1.is("<hi!>\n <hi!></hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!>? <hi!></hi!>?</hi!>': unexpected token at '<hi!>? <hi!></hi!>?</hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Element element5 = element1.attr("", "");
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.select.NodeFilter nodeFilter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = element1.filter(nodeFilter9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element7.childNodes;
        org.jsoup.nodes.Element element10 = element7.prependText("<hi!></hi!>");
        org.jsoup.select.Elements elements13 = element7.getElementsByAttributeValueMatching("<hi!>\n hi!\n</hi!>", "");
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element16 = element15.nextElementSibling();
        org.jsoup.nodes.Attributes attributes17 = element15.attributes();
        java.lang.String str18 = element15.cssSelector();
        org.jsoup.nodes.Element element20 = element15.prependText("hi!");
        org.jsoup.nodes.Element element21 = element20.empty();
        java.lang.String str22 = element20.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = element20.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            element7.replaceWith((org.jsoup.nodes.Node) element20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(nodeList23);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Element element5 = element1.attr("", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = element5.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element5 = element1.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList6 = element5.ensureChildNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        element1.setBaseUri("");
        org.jsoup.select.Elements elements10 = element1.getElementsContainingOwnText("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element1.selectFirst("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!': unexpected token at '!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = element1.textNodes();
        org.jsoup.nodes.Element element10 = element1.addClass("");
        // The following exception was thrown during execution in test generation
        try {
            element10.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(textNodeList8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.appendElement("<hi!></hi!>");
        java.lang.String[] strArray15 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element20 = element18.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element22 = element20.text("");
        org.jsoup.nodes.Element element24 = element22.append("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element28 = element27.nextElementSibling();
        boolean boolean29 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element27);
        int int30 = element27.siblingIndex();
        org.jsoup.nodes.Element element33 = element27.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements35 = element33.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements37 = element33.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element38 = element24.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements37);
        org.jsoup.nodes.Element element39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element40 = element38.appendTo(element39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNull(element28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element38);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = element1.is("<hi! hi!=\"<hi!></hi!>\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! hi!=\"<hi!></hi!>\"></hi!>': unexpected token at '<hi! hi!=\"<hi!></hi!>\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.lang.String str8 = element1.html();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList9 = element1.dataNodes();
        org.jsoup.nodes.Document document10 = element1.ownerDocument();
        java.util.regex.Pattern pattern11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element1.getElementsMatchingOwnText(pattern11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(dataNodeList9);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        org.jsoup.nodes.Element element10 = element1.prepend("hi!");
        java.lang.String str11 = element10.className();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            element10.outerHtmlHead(appendable12, 0, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.siblingElements();
        org.jsoup.select.Elements elements7 = element1.getAllElements();
        org.jsoup.select.Elements elements9 = element1.getElementsMatchingOwnText("");
        org.jsoup.nodes.Element element11 = element1.val("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element11.tagName("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Tag name must not be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element6 = element5.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.siblingNodes();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsByClass("hi!");
        org.jsoup.nodes.Element element13 = element9.html("");
        org.jsoup.nodes.Element element15 = element9.toggleClass("");
        java.lang.String str16 = element15.text();
        java.lang.String str17 = element15.id();
        org.jsoup.nodes.Element element18 = element5.doClone((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Node node19 = element15.previousSibling();
        java.lang.String str20 = element15.id();
        java.lang.String str21 = element15.cssSelector();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element15.childNodes;
        java.lang.String str23 = element15.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = element15.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str23, "<hi! class=\"\"></hi!>");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.appendElement("<hi!></hi!>");
        java.lang.String[] strArray15 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.select.Elements elements20 = element18.getElementsByAttribute("<hi!>\n hi!\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = element18.selectFirst("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!></hi!>': unexpected token at '<hi!></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.appendElement("<hi!></hi!>");
        java.lang.String[] strArray15 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element20 = element18.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element22 = element20.text("");
        org.jsoup.nodes.Element element24 = element22.append("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element26 = element24.text("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element28 = element24.selectFirst("<hi! class=\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"\"></hi!>': unexpected token at '<hi! class=\"\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        java.lang.String str6 = element5.cssSelector();
        java.lang.String str7 = element5.val();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            element1.outerHtmlTail(appendable5, (int) 'a', outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        org.jsoup.nodes.Element element6 = element1.previousElementSibling();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsByClass("hi!");
        org.jsoup.nodes.Element element12 = element8.html("");
        org.jsoup.nodes.Element element14 = element8.toggleClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList15 = element8.textNodes();
        org.jsoup.nodes.Node node16 = element8.clearAttributes();
        org.jsoup.nodes.Node node17 = node16.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element1.appendChild(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(textNodeList15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element6 = element5.nextElementSibling();
        org.jsoup.nodes.Attributes attributes7 = element5.attributes();
        org.jsoup.nodes.Element element9 = element5.text("");
        int int10 = element5.siblingIndex();
        org.jsoup.select.Elements elements11 = element5.getAllElements();
        boolean boolean12 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element5);
        boolean boolean13 = element5.hasAttributes();
        org.jsoup.nodes.Element element14 = element5.empty();
        boolean boolean15 = element1.hasSameValue((java.lang.Object) element5);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.siblingElements();
        org.jsoup.select.Elements elements7 = element1.getAllElements();
        org.jsoup.nodes.Element element9 = element1.prepend("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Evaluator evaluator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = element1.is(evaluator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList6 = element1.dataNodes();
        org.jsoup.nodes.Node node7 = element1.nextSibling();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(dataNodeList6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        org.jsoup.nodes.Element element6 = element1.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element6.appendText("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.select.Elements elements7 = element1.getAllElements();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = element1.textNodes();
        org.jsoup.select.Elements elements9 = element1.children();
        java.util.Set<java.lang.String> strSet10 = element1.classNames();
        org.jsoup.nodes.Element element12 = element1.removeClass("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            element1.outerHtmlTail(appendable13, (int) '#', outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(textNodeList8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element1.textNodes();
        boolean boolean11 = element1.hasClass("<hi!>\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(textNodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element1.select("<hi! hi!=\"<hi!></hi!>\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! hi!=\"<hi!></hi!>\"></hi!>': unexpected token at '<hi! hi!=\"<hi!></hi!>\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        java.lang.String str6 = element5.val();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element8.childNodes();
        org.jsoup.nodes.Element element10 = element5.appendTo(element8);
        boolean boolean11 = element8.hasParent();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        element13.setBaseUri("hi!");
        org.jsoup.select.Elements elements17 = element13.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Attributes attributes18 = element13.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element8.before((org.jsoup.nodes.Node) element13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Node node4 = element1.parentNode();
        org.jsoup.select.Elements elements6 = element1.getElementsContainingOwnText("");
        org.jsoup.nodes.Element element7 = element1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element1.select("<hi!>\n hi!\n</hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!>? hi!?</hi!>': unexpected token at '<hi!>? hi!?</hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.nodes.Element element8 = element1.empty();
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        element12.setBaseUri("hi!");
        org.jsoup.select.Elements elements16 = element12.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element18 = element12.toggleClass("<hi!>\n hi!\n</hi!>");
        element18.setBaseUri("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element21 = element8.prependChild((org.jsoup.nodes.Node) element18);
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        // The following exception was thrown during execution in test generation
        try {
            element21.outerHtmlTail(appendable22, (int) '4', outputSettings24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        java.lang.String str2 = element1.text();
        java.util.regex.Pattern pattern3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements4 = element1.getElementsMatchingOwnText(pattern3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.lang.String str8 = element1.html();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element1.after("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        java.lang.String str9 = element8.outerHtml();
        org.jsoup.nodes.Element element11 = element8.appendText("");
        org.jsoup.nodes.Node node13 = element8.removeAttr("");
        org.jsoup.parser.Tag tag14 = element8.tag();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements19 = element17.getElementsByClass("hi!");
        org.jsoup.nodes.Element element21 = element17.html("");
        org.jsoup.nodes.Element element23 = element17.toggleClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element17.textNodes();
        org.jsoup.nodes.Attributes attributes25 = element17.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag14, "hi!", attributes25);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str9, "<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(textNodeList24);
        org.junit.Assert.assertNotNull(attributes25);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.appendElement("<hi!></hi!>");
        java.lang.String[] strArray15 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element20 = element18.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element22 = element20.text("");
        org.jsoup.nodes.Element element24 = element20.appendText("<hi!></hi!>");
        boolean boolean25 = element24.hasParent();
        org.jsoup.nodes.Node node26 = element24.unwrap();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.parser.Tag tag5 = element1.tag();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag5, "<hi!>\n hi!\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element7.before("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag5);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        java.util.regex.Pattern pattern10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element8.getElementsMatchingOwnText(pattern10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Element element5 = element1.attr("", "");
        boolean boolean7 = element5.hasClass("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = element5.textNodes();
        java.lang.String str9 = element5.ownText();
        java.lang.String str10 = element5.ownText();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(textNodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.tagName();
        org.jsoup.select.Elements elements12 = element1.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.select.Elements elements13 = element1.parents();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            element1.outerHtmlHead(appendable14, 1, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element9 = element6.appendText("<hi!></hi!>");
        java.lang.String str11 = element6.attr("");
        java.lang.String str12 = element6.className();
        org.jsoup.nodes.Element element14 = element6.append("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements18 = element16.getElementsByClass("hi!");
        org.jsoup.select.Elements elements19 = element16.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = element16.childNodesCopy();
        java.lang.String str21 = element16.outerHtml();
        org.jsoup.nodes.Element element22 = element16.shallowClone();
        org.jsoup.nodes.Element element23 = element16.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = element14.after((org.jsoup.nodes.Node) element23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<hi!></hi!>" + "'", str21, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element9 = element6.appendText("<hi!></hi!>");
        java.lang.String str10 = element9.className();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element9.doClone((org.jsoup.nodes.Node) element12);
        org.jsoup.select.Elements elements15 = element9.getElementsByTag("<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.siblingElements();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element1.childNodes;
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            element1.outerHtmlTail(appendable8, (int) (byte) -1, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        java.lang.String str9 = element8.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element8.siblingNodes();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements14 = element12.getElementsByClass("hi!");
        org.jsoup.nodes.Element element16 = element12.html("");
        org.jsoup.nodes.Element element18 = element12.toggleClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList19 = element12.textNodes();
        org.jsoup.nodes.Attributes attributes20 = element12.attributes();
        org.jsoup.select.Elements elements22 = element12.getElementsContainingText("hi!");
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element25 = element24.nextElementSibling();
        org.jsoup.nodes.Attributes attributes26 = element24.attributes();
        org.jsoup.nodes.Element element28 = element24.text("");
        int int29 = element24.siblingIndex();
        org.jsoup.select.Elements elements30 = element24.getAllElements();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList31 = element24.textNodes();
        org.jsoup.select.Elements elements32 = element24.children();
        java.util.Set<java.lang.String> strSet33 = element24.classNames();
        org.jsoup.nodes.Element element34 = element12.classNames(strSet33);
        org.jsoup.nodes.Element element35 = element8.classNames(strSet33);
        java.util.regex.Pattern pattern36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements37 = element35.getElementsMatchingOwnText(pattern36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str9, "<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(textNodeList19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(textNodeList31);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Node node4 = element1.parentNode();
        org.jsoup.select.Elements elements6 = element1.getElementsContainingOwnText("");
        org.jsoup.nodes.Element element7 = element1.clone();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList8 = element7.dataNodes();
        java.lang.String str9 = element7.baseUri();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(dataNodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.parents();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element8.nextElementSibling();
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element8);
        int int11 = element8.siblingIndex();
        org.jsoup.nodes.Element element14 = element8.attr("hi!", "<hi!></hi!>");
        java.lang.String str15 = element8.cssSelector();
        boolean boolean17 = element8.hasClass("<hi!></hi!>");
        org.jsoup.nodes.Element element18 = element1.doClone((org.jsoup.nodes.Node) element8);
        org.jsoup.select.Elements elements20 = element18.getElementsMatchingText("<hi!>\n hi!\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList21 = element18.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Capacity: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.nodes.Element element8 = element1.removeClass("<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueStarting("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element13 = element8.val("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        java.lang.Class<?> wildcardClass14 = element8.getClass();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element8.nextElementSibling();
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element8);
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.parent();
        org.jsoup.nodes.Node node14 = element12.parentNode();
        org.jsoup.select.Elements elements16 = element12.getElementsByIndexLessThan(1);
        boolean boolean17 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element12);
        org.jsoup.select.Elements elements18 = element12.children();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements22 = element20.getElementsByClass("hi!");
        org.jsoup.nodes.Element element24 = element20.html("");
        org.jsoup.nodes.Element element25 = element24.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = element24.siblingNodes();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element29 = element28.parent();
        org.jsoup.nodes.Node node30 = element28.parentNode();
        org.jsoup.select.Elements elements32 = element28.getElementsByIndexLessThan(1);
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element35 = element34.nextElementSibling();
        org.jsoup.nodes.Attributes attributes36 = element34.attributes();
        org.jsoup.nodes.Element element38 = element34.text("");
        int int39 = element34.siblingIndex();
        org.jsoup.nodes.Element element41 = element34.text("hi!");
        boolean boolean42 = element34.hasParent();
        java.lang.String str43 = element34.tagName();
        org.jsoup.nodes.Node[] nodeArray44 = new org.jsoup.nodes.Node[] { element8, element12, element24, element28, element34 };
        org.jsoup.nodes.Element element45 = element1.insertChildren((int) (short) 0, nodeArray44);
        // The following exception was thrown during execution in test generation
        try {
            element45.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(nodeArray44);
        org.junit.Assert.assertNotNull(element45);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        element8.doSetBaseUri("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements16 = element14.getElementsByClass("hi!");
        org.jsoup.nodes.Element element18 = element14.html("");
        org.jsoup.nodes.Element element20 = element14.toggleClass("");
        org.jsoup.parser.Tag tag21 = element20.tag();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag21, "hi!");
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag21, "<hi!></hi!>");
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements29 = element27.getElementsByClass("hi!");
        org.jsoup.select.Elements elements30 = element27.getAllElements();
        boolean boolean31 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element27);
        org.jsoup.select.Elements elements32 = element27.siblingElements();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = element27.childNodes;
        boolean boolean34 = element25.equals((java.lang.Object) nodeList33);
        org.jsoup.nodes.Element element35 = element8.prependChild((org.jsoup.nodes.Node) element25);
        org.jsoup.select.Evaluator evaluator36 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = element35.is(evaluator36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.appendElement("<hi!></hi!>");
        java.lang.String[] strArray15 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element20 = element18.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element22 = element20.text("");
        org.jsoup.nodes.Element element24 = element22.append("<hi! class=\"\"></hi!>");
        java.lang.String str25 = element24.className();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element27 = element24.appendElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<hi!></hi!>" + "'", str25, "<hi!></hi!>");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element8.childNodesCopy();
        org.jsoup.select.Elements elements12 = element8.parents();
        org.jsoup.parser.Tag tag13 = element8.tag();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements17 = element15.getElementsByClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            element8.replaceWith((org.jsoup.nodes.Node) element15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        java.lang.String str3 = element1.text();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements13 = element7.getElementsByTag("hi!");
        org.jsoup.nodes.Element element15 = element7.tagName("hi!");
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element18 = element17.parent();
        org.jsoup.nodes.Node node19 = element17.parentNode();
        org.jsoup.select.Elements elements21 = element17.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element17.childNodes;
        org.jsoup.nodes.Element element24 = element17.prepend("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element25 = element15.prependChild((org.jsoup.nodes.Node) element24);
        org.jsoup.nodes.Element element27 = element25.append("<hi! value=\"hi!\">\n hi!\n</hi!>");
        org.jsoup.select.Elements elements29 = element27.getElementsContainingText("<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(element18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements29);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements13 = element7.getElementsByTag("hi!");
        org.jsoup.nodes.Element element15 = element7.tagName("hi!");
        org.jsoup.nodes.Node node16 = element15.nextSibling();
        org.jsoup.nodes.Element element17 = element15.empty();
        org.jsoup.nodes.Element element18 = element15.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = element15.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.appendElement("<hi!></hi!>");
        java.lang.String[] strArray15 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element20 = element18.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element22 = element20.text("");
        org.jsoup.nodes.Element element24 = element22.append("<hi! class=\"\"></hi!>");
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        // The following exception was thrown during execution in test generation
        try {
            element22.outerHtmlHead(appendable25, (int) '4', outputSettings27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.nodes.Element element4 = element1.empty();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements8 = element6.getElementsByClass("hi!");
        org.jsoup.select.Elements elements9 = element6.getAllElements();
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element6);
        org.jsoup.nodes.Element element13 = element6.attr("", "hi!");
        java.lang.String str14 = element13.html();
        org.jsoup.nodes.Element element16 = element13.appendElement("<hi!></hi!>");
        java.lang.String[] strArray20 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        org.jsoup.nodes.Element element23 = element16.classNames((java.util.Set<java.lang.String>) strSet21);
        org.jsoup.nodes.Element element24 = element4.classNames((java.util.Set<java.lang.String>) strSet21);
        org.jsoup.select.Evaluator evaluator25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = element4.is(evaluator25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "hi!");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        org.jsoup.select.Elements elements14 = element12.getElementsContainingOwnText("hi!");
        java.lang.String str15 = element12.tagName();
        boolean boolean17 = element12.hasAttr("<hi!>\n <hi!></hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element12.appendElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element6 = element5.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.siblingNodes();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsByClass("hi!");
        org.jsoup.nodes.Element element13 = element9.html("");
        org.jsoup.nodes.Element element15 = element9.toggleClass("");
        java.lang.String str16 = element15.text();
        java.lang.String str17 = element15.id();
        org.jsoup.nodes.Element element18 = element5.doClone((org.jsoup.nodes.Node) element15);
        boolean boolean19 = element18.isBlock();
        java.lang.String str20 = element18.data();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element9 = element6.appendText("<hi!></hi!>");
        java.lang.String str11 = element6.attr("");
        java.lang.String str12 = element6.className();
        org.jsoup.nodes.Element element14 = element6.append("<hi!>\n hi!\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element6.child((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element8.nextElementSibling();
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element8);
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.parent();
        org.jsoup.nodes.Node node14 = element12.parentNode();
        org.jsoup.select.Elements elements16 = element12.getElementsByIndexLessThan(1);
        boolean boolean17 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element12);
        org.jsoup.select.Elements elements18 = element12.children();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements22 = element20.getElementsByClass("hi!");
        org.jsoup.nodes.Element element24 = element20.html("");
        org.jsoup.nodes.Element element25 = element24.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = element24.siblingNodes();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element29 = element28.parent();
        org.jsoup.nodes.Node node30 = element28.parentNode();
        org.jsoup.select.Elements elements32 = element28.getElementsByIndexLessThan(1);
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element35 = element34.nextElementSibling();
        org.jsoup.nodes.Attributes attributes36 = element34.attributes();
        org.jsoup.nodes.Element element38 = element34.text("");
        int int39 = element34.siblingIndex();
        org.jsoup.nodes.Element element41 = element34.text("hi!");
        boolean boolean42 = element34.hasParent();
        java.lang.String str43 = element34.tagName();
        org.jsoup.nodes.Node[] nodeArray44 = new org.jsoup.nodes.Node[] { element8, element12, element24, element28, element34 };
        org.jsoup.nodes.Element element45 = element1.insertChildren((int) (short) 0, nodeArray44);
        org.jsoup.nodes.Element element46 = element1.shallowClone();
        org.jsoup.nodes.Document document47 = element46.ownerDocument();
        java.util.regex.Pattern pattern48 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements49 = element46.getElementsMatchingText(pattern48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(nodeArray44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNull(document47);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.nodes.Node node7 = element1.clearAttributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = element1.dataset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = element1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element1.childNodesCopy();
        boolean boolean7 = element1.hasClass("");
        org.jsoup.nodes.Document document8 = element1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.DataNode> dataNodeList9 = document8.dataNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element1.childNodesCopy();
        java.lang.String str6 = element1.outerHtml();
        org.jsoup.nodes.Element element7 = element1.shallowClone();
        org.jsoup.nodes.Element element8 = element1.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element8.getElementsByTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi!></hi!>" + "'", str6, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.nodes.Element element8 = element1.removeClass("<hi! class=\"\"></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element8.childNodesCopy();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        org.jsoup.nodes.Element element10 = element1.appendText("");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.select.Elements elements15 = element10.getElementsByAttributeValueNot("<hi!></hi!>", "<hi! value=\"hi!\">\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.tagName();
        java.lang.String str11 = element1.text();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            element1.outerHtmlTail(appendable12, 0, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Element element5 = element1.attr("", "");
        org.jsoup.nodes.Node node6 = element1.previousSibling();
        org.jsoup.select.Elements elements9 = element1.getElementsByAttributeValueMatching("hi!", "<hi!></hi!>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.siblingElements();
        org.jsoup.select.Elements elements7 = element1.getAllElements();
        org.jsoup.select.Elements elements9 = element1.getElementsMatchingOwnText("");
        org.jsoup.nodes.Element element11 = element1.val("");
        java.lang.String str13 = element1.absUrl("<hi!>\n <hi!></hi!>\n</hi!>");
        java.lang.String str15 = element1.absUrl("<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements13 = element11.getElementsByClass("hi!");
        org.jsoup.nodes.Element element15 = element11.html("");
        org.jsoup.nodes.Element element17 = element11.toggleClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList18 = element11.textNodes();
        org.jsoup.nodes.Attributes attributes19 = element11.attributes();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag8, "<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>", attributes19);
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag8, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element25 = element24.nextElementSibling();
        org.jsoup.nodes.Attributes attributes26 = element24.attributes();
        org.jsoup.nodes.Element element28 = element24.text("");
        int int29 = element24.siblingIndex();
        org.jsoup.nodes.Element element31 = element24.text("hi!");
        boolean boolean32 = element24.hasParent();
        java.lang.String str33 = element24.tagName();
        org.jsoup.select.Elements elements35 = element24.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.nodes.Element element37 = element24.text("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements41 = element39.getElementsByClass("hi!");
        org.jsoup.nodes.Element element43 = element39.html("");
        org.jsoup.nodes.Element element44 = element24.doClone((org.jsoup.nodes.Node) element43);
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList45 = element24.dataNodes();
        org.jsoup.nodes.Element element46 = element22.appendTo(element24);
        java.util.regex.Pattern pattern47 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements48 = element22.getElementsMatchingOwnText(pattern47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(textNodeList18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(dataNodeList45);
        org.junit.Assert.assertNotNull(element46);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        org.jsoup.nodes.Element element10 = element1.prepend("hi!");
        java.lang.String str11 = element10.className();
        org.jsoup.nodes.Element element13 = element10.text("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element13.after("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.parser.Tag tag5 = element1.tag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = element1.select("<hi! hi!=\"<hi!></hi!>\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! hi!=\"<hi!></hi!>\"></hi!>': unexpected token at '<hi! hi!=\"<hi!></hi!>\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag5);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Element element5 = element1.attr("", "");
        java.lang.String str6 = element5.text();
        org.jsoup.nodes.Element element8 = element5.toggleClass("<hi!>\n hi!\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element5.select("<hi! hi!=\"<hi!></hi!>\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! hi!=\"<hi!></hi!>\"></hi!>': unexpected token at '<hi! hi!=\"<hi!></hi!>\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "hi!");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexGreaterThan((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element10.getElementsByAttributeValueContaining("", "<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        java.lang.String str9 = element8.outerHtml();
        org.jsoup.nodes.Element element11 = element8.appendText("");
        org.jsoup.nodes.Node node13 = element8.removeAttr("");
        org.jsoup.parser.Tag tag14 = element8.tag();
        org.jsoup.select.Elements elements16 = element8.getElementsByAttributeStarting("<hi! hi!=\"<hi!></hi!>\"></hi!>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str9, "<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element8.nextElementSibling();
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element8);
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.parent();
        org.jsoup.nodes.Node node14 = element12.parentNode();
        org.jsoup.select.Elements elements16 = element12.getElementsByIndexLessThan(1);
        boolean boolean17 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element12);
        org.jsoup.select.Elements elements18 = element12.children();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements22 = element20.getElementsByClass("hi!");
        org.jsoup.nodes.Element element24 = element20.html("");
        org.jsoup.nodes.Element element25 = element24.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = element24.siblingNodes();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element29 = element28.parent();
        org.jsoup.nodes.Node node30 = element28.parentNode();
        org.jsoup.select.Elements elements32 = element28.getElementsByIndexLessThan(1);
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element35 = element34.nextElementSibling();
        org.jsoup.nodes.Attributes attributes36 = element34.attributes();
        org.jsoup.nodes.Element element38 = element34.text("");
        int int39 = element34.siblingIndex();
        org.jsoup.nodes.Element element41 = element34.text("hi!");
        boolean boolean42 = element34.hasParent();
        java.lang.String str43 = element34.tagName();
        org.jsoup.nodes.Node[] nodeArray44 = new org.jsoup.nodes.Node[] { element8, element12, element24, element28, element34 };
        org.jsoup.nodes.Element element45 = element1.insertChildren((int) (short) 0, nodeArray44);
        java.util.regex.Pattern pattern46 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements47 = element45.getElementsMatchingText(pattern46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(nodeArray44);
        org.junit.Assert.assertNotNull(element45);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.nodes.Element element8 = element7.nextElementSibling();
        java.lang.String str9 = element7.toString();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements13 = element11.getElementsByClass("hi!");
        org.jsoup.select.Elements elements14 = element11.getAllElements();
        boolean boolean15 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element11);
        org.jsoup.select.Elements elements16 = element11.siblingElements();
        org.jsoup.select.Elements elements17 = element11.getAllElements();
        org.jsoup.nodes.Element element19 = element11.prepend("<hi!>\n hi!\n</hi!>");
        java.lang.String str20 = element19.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            element7.replaceWith((org.jsoup.nodes.Node) element19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str9, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element7 = element1.toggleClass("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element8 = element7.parent();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element12 = element11.parent();
        org.jsoup.nodes.Node node13 = element11.parentNode();
        org.jsoup.select.Elements elements15 = element11.getElementsByIndexLessThan(1);
        boolean boolean16 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element11);
        org.jsoup.select.Elements elements18 = element11.getElementsContainingOwnText("<hi!>\n <hi!></hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element8.insertChildren((int) '#', (java.util.Collection<org.jsoup.nodes.Element>) elements18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        java.lang.String str6 = element5.val();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element8.childNodes();
        org.jsoup.nodes.Element element10 = element5.appendTo(element8);
        org.jsoup.nodes.Element element12 = element10.html("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements14 = element10.getElementsContainingText("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = element10.select("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!>? &lt;hi! class=\"\"&gt;&lt;/hi!&gt;?</hi!>': unexpected token at '<hi!>? &lt;hi! class=\"\"&gt;&lt;/hi!&gt;?</hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element7 = element1.toggleClass("<hi!>\n hi!\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element7.ensureChildNodes();
        java.lang.Class<?> wildcardClass9 = element7.getClass();
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.nodes.Element element8 = element1.removeClass("<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueStarting("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element13 = element8.val("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element8.getElementsByTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsByClass("hi!");
        org.jsoup.select.Elements elements13 = element8.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.select.Elements elements16 = element8.getElementsByAttributeValueMatching("", "<hi!></hi!>");
        org.jsoup.nodes.Node[] nodeArray17 = new org.jsoup.nodes.Node[] { element8 };
        org.jsoup.nodes.Element element18 = element1.insertChildren((-1), nodeArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements21 = element18.getElementsByAttributeValueNot("", "<hi! hi!=\"<hi!></hi!>\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(nodeArray17);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element6 = element5.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.siblingNodes();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsByClass("hi!");
        org.jsoup.nodes.Element element13 = element9.html("");
        org.jsoup.nodes.Element element15 = element9.toggleClass("");
        java.lang.String str16 = element15.text();
        java.lang.String str17 = element15.id();
        org.jsoup.nodes.Element element18 = element5.doClone((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Node node19 = element15.previousSibling();
        java.lang.String str20 = element15.id();
        java.lang.String str21 = element15.cssSelector();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element15.childNodes;
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements26 = element24.getElementsByClass("hi!");
        org.jsoup.nodes.Element element28 = element24.html("");
        java.lang.String str29 = element28.val();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList32 = element31.childNodes();
        org.jsoup.nodes.Element element33 = element28.appendTo(element31);
        // The following exception was thrown during execution in test generation
        try {
            element15.replaceWith((org.jsoup.nodes.Node) element28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(element33);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element5 = element1.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValue("<hi!>\n hi!\n</hi!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.nodes.Node node7 = element1.clearAttributes();
        org.jsoup.nodes.Element element9 = element1.addClass("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element1.child((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "hi!");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        org.jsoup.select.Elements elements14 = element12.getElementsContainingOwnText("hi!");
        java.lang.String str15 = element12.baseUri();
        java.lang.Class<?> wildcardClass16 = element12.getClass();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<hi!></hi!>" + "'", str15, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.parents();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element8.nextElementSibling();
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element8);
        int int11 = element8.siblingIndex();
        org.jsoup.nodes.Element element14 = element8.attr("hi!", "<hi!></hi!>");
        java.lang.String str15 = element8.cssSelector();
        boolean boolean17 = element8.hasClass("<hi!></hi!>");
        org.jsoup.nodes.Element element18 = element1.doClone((org.jsoup.nodes.Node) element8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = element18.child((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        java.lang.String str8 = element1.cssSelector();
        boolean boolean10 = element1.hasClass("<hi!></hi!>");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        element12.setBaseUri("hi!");
        org.jsoup.nodes.Element element15 = element12.empty();
        org.jsoup.nodes.Element element16 = element1.appendChild((org.jsoup.nodes.Node) element15);
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            element1.outerHtmlHead(appendable17, 0, outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.nodes.Element element8 = element1.prepend("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element11 = element8.attr("<hi!></hi!>", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element8.selectFirst("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        java.lang.String str6 = element5.val();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element8.childNodes();
        org.jsoup.nodes.Element element10 = element5.appendTo(element8);
        boolean boolean11 = element8.hasParent();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element14 = element13.nextElementSibling();
        org.jsoup.nodes.Attributes attributes15 = element13.attributes();
        org.jsoup.nodes.Element element17 = element13.text("");
        int int18 = element13.siblingIndex();
        org.jsoup.nodes.Element element20 = element13.text("hi!");
        boolean boolean21 = element13.hasParent();
        java.lang.String str22 = element13.tagName();
        org.jsoup.nodes.Element element24 = element13.text("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            element8.replaceWith((org.jsoup.nodes.Node) element24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element1.textNodes();
        java.lang.String str10 = element1.data();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(textNodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.siblingElements();
        org.jsoup.select.Elements elements7 = element1.getAllElements();
        org.jsoup.select.Elements elements9 = element1.getElementsMatchingOwnText("");
        boolean boolean11 = element1.hasAttr("");
        java.lang.String str12 = element1.data();
        java.lang.String str13 = element1.className();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.siblingElements();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element1.childNodes;
        java.lang.String str8 = element1.id();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element1.select("&lt;hi!&gt;&lt;/hi!&gt;");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '&lt;hi!&gt;&lt;/hi!&gt;': unexpected token at '&lt;hi!&gt;&lt;/hi!&gt;'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element1.getElementsByAttribute("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Element element5 = element1.attr("", "");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements9 = element7.getElementsByClass("hi!");
        org.jsoup.nodes.Element element11 = element7.html("");
        org.jsoup.nodes.Element element13 = element7.toggleClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList14 = element7.textNodes();
        org.jsoup.nodes.Node node15 = element7.clearAttributes();
        element7.nodelistChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = element5.before((org.jsoup.nodes.Node) element7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(textNodeList14);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = element1.textNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element1.after("<hi! hi!=\"<hi!></hi!>\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(textNodeList8);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = element1.childNodes();
        org.jsoup.select.Elements elements5 = element1.getElementsByAttributeValue("<hi!></hi!>", "hi!");
        boolean boolean6 = element1.isBlock();
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        java.lang.String str6 = element5.val();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element8.childNodes();
        org.jsoup.nodes.Element element10 = element5.appendTo(element8);
        org.jsoup.select.Elements elements13 = element8.getElementsByAttributeValueEnding("<hi! class=\"\"></hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements15 = element8.getElementsContainingOwnText("<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element6 = element5.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.siblingNodes();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsByClass("hi!");
        org.jsoup.nodes.Element element13 = element9.html("");
        org.jsoup.nodes.Element element15 = element9.toggleClass("");
        java.lang.String str16 = element15.text();
        java.lang.String str17 = element15.id();
        org.jsoup.nodes.Element element18 = element5.doClone((org.jsoup.nodes.Node) element15);
        element15.doSetBaseUri("hi!");
        java.lang.String str21 = element15.html();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements23 = element15.getElementsByTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.nodes.Node node7 = element1.clearAttributes();
        org.jsoup.nodes.Element element9 = element1.addClass("");
        org.jsoup.nodes.Element element11 = element1.html("<hi!>\n <hi!></hi!>\n</hi!>");
        int int12 = element1.childNodeSize();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element15 = element14.nextElementSibling();
        org.jsoup.nodes.Attributes attributes16 = element14.attributes();
        org.jsoup.nodes.Element element18 = element14.text("");
        int int19 = element14.siblingIndex();
        org.jsoup.nodes.Element element21 = element14.text("hi!");
        org.jsoup.select.Elements elements23 = element21.getElementsMatchingText("");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = element21.childNodesCopy();
        org.jsoup.select.Elements elements26 = element21.getElementsByIndexLessThan((int) (byte) 1);
        java.lang.String str27 = element21.id();
        boolean boolean28 = element21.isBlock();
        org.jsoup.select.Elements elements29 = element21.siblingElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element30 = element1.after((org.jsoup.nodes.Node) element21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(elements29);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element1.childNodesCopy();
        java.util.Set<java.lang.String> strSet6 = element1.classNames();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element1.getElementsByAttributeValueNot("<hi! class=\"\"></hi!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag8, "<hi! value=\"hi!\">\n hi!\n</hi!>");
        org.jsoup.nodes.Element element16 = element14.appendElement("<hi! hi!=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements20 = element18.getElementsByClass("hi!");
        org.jsoup.select.Elements elements23 = element18.getElementsByAttributeValueEnding("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            element14.replaceWith((org.jsoup.nodes.Node) element18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.tagName();
        java.lang.String str11 = element1.text();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element14 = element13.nextElementSibling();
        org.jsoup.nodes.Attributes attributes15 = element13.attributes();
        org.jsoup.nodes.Element element16 = element1.prependChild((org.jsoup.nodes.Node) element13);
        org.jsoup.nodes.Attributes attributes17 = element13.attributes();
        org.jsoup.nodes.Element element18 = element13.firstElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = element18.is("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNull(element18);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Element element5 = element1.attr("", "");
        org.jsoup.nodes.Node node6 = element1.previousSibling();
        java.lang.Class<?> wildcardClass7 = element1.getClass();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.nodeName();
        int int3 = element1.siblingIndex();
        org.jsoup.nodes.Element element5 = element1.prepend("<hi!>\n <hi!></hi!>\n</hi!>");
        java.lang.Class<?> wildcardClass6 = element5.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.parser.Tag tag5 = element1.tag();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag5, "<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element8 = element7.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element8.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "hi!");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexGreaterThan((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = element10.is("&lt;hi!&gt;&lt;/hi!&gt;");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '&lt;hi!&gt;&lt;/hi!&gt;': unexpected token at '&lt;hi!&gt;&lt;/hi!&gt;'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.tagName();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.nextElementSibling();
        org.jsoup.nodes.Attributes attributes14 = element12.attributes();
        org.jsoup.nodes.Element element16 = element12.text("");
        int int17 = element12.siblingIndex();
        org.jsoup.select.Elements elements18 = element12.getAllElements();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList19 = element12.textNodes();
        org.jsoup.select.Elements elements20 = element12.children();
        java.util.Set<java.lang.String> strSet21 = element12.classNames();
        org.jsoup.nodes.Element element22 = element1.classNames(strSet21);
        java.util.regex.Pattern pattern23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements24 = element22.getElementsMatchingOwnText(pattern23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(textNodeList19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.tagName();
        org.jsoup.select.Elements elements12 = element1.getElementsByIndexGreaterThan((int) (byte) 100);
        element1.setBaseUri("<hi! hi!=\"<hi!></hi!>\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = element1.is("<hi! hi!=\"<hi!></hi!>\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! hi!=\"<hi!></hi!>\"></hi!>': unexpected token at '<hi! hi!=\"<hi!></hi!>\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element7 = element1.toggleClass("<hi!>\n hi!\n</hi!>");
        element7.setBaseUri("<hi!>\n hi!\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element7.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        org.jsoup.nodes.Element element10 = element1.appendText("");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements14 = element12.getElementsByClass("hi!");
        org.jsoup.select.Elements elements15 = element12.getAllElements();
        boolean boolean16 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element12);
        org.jsoup.nodes.Element element19 = element12.attr("", "hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList20 = element12.textNodes();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements24 = element22.getElementsByClass("hi!");
        org.jsoup.nodes.Element element26 = element22.html("");
        org.jsoup.nodes.Element element28 = element22.toggleClass("");
        java.lang.String str29 = element28.text();
        java.lang.String str30 = element28.id();
        boolean boolean31 = element12.hasSameValue((java.lang.Object) str30);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element32 = element1.before((org.jsoup.nodes.Node) element12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(textNodeList20);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.appendElement("<hi!></hi!>");
        java.lang.String[] strArray15 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element20 = element18.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element22 = element20.text("");
        org.jsoup.nodes.Element element24 = element22.append("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = element26.childNodes();
        element22.childNodes = nodeList27;
        java.lang.String str29 = element22.id();
        org.jsoup.nodes.Element element31 = element22.wrap("<hi!>\n hi!\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element33 = element22.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(element31);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        java.lang.String str6 = element5.val();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element8.childNodes();
        org.jsoup.nodes.Element element10 = element5.appendTo(element8);
        org.jsoup.nodes.Element element12 = element10.html("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements14 = element10.getElementsContainingText("<hi!></hi!>");
        org.jsoup.select.Elements elements17 = element10.getElementsByAttributeValue("<hi!>\n <hi!></hi!>\n</hi!>", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element10.selectFirst("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!>? &lt;hi!&gt;&lt;/hi!&gt;?</hi!>': unexpected token at '<hi!>? &lt;hi!&gt;&lt;/hi!&gt;?</hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element6 = element5.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.siblingNodes();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsByClass("hi!");
        org.jsoup.nodes.Element element13 = element9.html("");
        org.jsoup.nodes.Element element15 = element9.toggleClass("");
        java.lang.String str16 = element15.text();
        java.lang.String str17 = element15.id();
        org.jsoup.nodes.Element element18 = element5.doClone((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements22 = element20.getElementsByClass("hi!");
        org.jsoup.nodes.Element element24 = element20.html("");
        org.jsoup.nodes.Element element26 = element20.toggleClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList27 = element20.textNodes();
        org.jsoup.nodes.Node node28 = element20.clearAttributes();
        element20.nodelistChanged();
        int int30 = element20.elementSiblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element31 = element5.after((org.jsoup.nodes.Node) element20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(textNodeList27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.siblingElements();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element1.childNodes;
        java.lang.String str8 = element1.id();
        org.jsoup.nodes.Document document9 = element1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Tag tag10 = document9.tag();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Element element5 = element1.attr("", "");
        org.jsoup.nodes.Node node6 = element1.previousSibling();
        int int7 = element1.siblingIndex();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.lang.String str8 = element1.html();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList9 = element1.dataNodes();
        java.lang.String str11 = element1.absUrl("hi!");
        org.jsoup.select.Elements elements13 = element1.getElementsByIndexGreaterThan((int) (byte) -1);
        org.jsoup.select.Elements elements16 = element1.getElementsByAttributeValueNot("<hi! hi!=\"<hi!></hi!>\"></hi!>", "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(dataNodeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.nodes.Element element8 = element1.empty();
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        element12.setBaseUri("hi!");
        org.jsoup.select.Elements elements16 = element12.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element18 = element12.toggleClass("<hi!>\n hi!\n</hi!>");
        element18.setBaseUri("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element21 = element8.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.select.Elements elements22 = element21.children();
        boolean boolean23 = element21.isBlock();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element6 = element5.nextElementSibling();
        org.jsoup.nodes.Attributes attributes7 = element5.attributes();
        org.jsoup.nodes.Element element9 = element5.text("");
        int int10 = element5.siblingIndex();
        org.jsoup.nodes.Element element12 = element5.text("hi!");
        java.lang.String str13 = element12.outerHtml();
        org.jsoup.nodes.Node node15 = element12.removeAttr("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element16 = element1.appendChild((org.jsoup.nodes.Node) element12);
        org.jsoup.nodes.Node node18 = element12.removeAttr("<hi! hi!=\"<hi!></hi!>\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = element12.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str13, "<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements13 = element7.getElementsByTag("hi!");
        org.jsoup.nodes.Element element15 = element7.tagName("hi!");
        org.jsoup.nodes.Node node16 = element15.nextSibling();
        org.jsoup.nodes.Element element17 = element15.empty();
        org.jsoup.nodes.Element element18 = element15.empty();
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            element15.outerHtmlHead(appendable19, (int) (byte) 1, outputSettings21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements13 = element7.getElementsByTag("hi!");
        org.jsoup.nodes.Element element15 = element7.tagName("hi!");
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element18 = element17.parent();
        org.jsoup.nodes.Node node19 = element17.parentNode();
        org.jsoup.select.Elements elements21 = element17.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element17.childNodes;
        org.jsoup.nodes.Element element24 = element17.prepend("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element25 = element15.prependChild((org.jsoup.nodes.Node) element24);
        org.jsoup.nodes.Element element27 = element25.append("<hi! value=\"hi!\">\n hi!\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            element27.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(element18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        element8.doSetBaseUri("<hi!>\n <hi!></hi!>\n</hi!>");
        boolean boolean14 = element8.hasClass("hi!");
        java.lang.String str15 = element8.outerHtml();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str15, "<hi!>\n hi!\n</hi!>");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.appendElement("<hi!></hi!>");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements15 = element13.getElementsByClass("hi!");
        org.jsoup.select.Elements elements16 = element13.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = element13.childNodesCopy();
        java.util.Set<java.lang.String> strSet18 = element13.classNames();
        org.jsoup.nodes.Element element19 = element8.classNames(strSet18);
        org.jsoup.select.Elements elements22 = element8.getElementsByAttributeValueStarting("<hi! hi!=\"<hi!></hi!>\"></hi!>", "<hi! hi!=\"<hi!></hi!>\"></hi!>");
        java.util.regex.Pattern pattern23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements24 = element8.getElementsMatchingOwnText(pattern23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.appendElement("<hi!></hi!>");
        java.lang.String[] strArray15 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element20 = element18.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element22 = element20.text("");
        org.jsoup.nodes.Element element24 = element22.append("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element28 = element27.nextElementSibling();
        boolean boolean29 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element27);
        int int30 = element27.siblingIndex();
        org.jsoup.nodes.Element element33 = element27.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements35 = element33.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements37 = element33.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element38 = element24.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements37);
        org.jsoup.nodes.Element element40 = element38.prependText("");
        org.jsoup.nodes.Element element42 = element38.prependText("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        java.lang.String str43 = element38.ownText();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNull(element28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<hi!> &lt;hi! class=\"\"&gt;&lt;/hi!&gt; </hi!>" + "'", str43, "<hi!> &lt;hi! class=\"\"&gt;&lt;/hi!&gt; </hi!>");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        element1.doSetBaseUri("hi!");
        org.jsoup.nodes.Element element6 = element1.shallowClone();
        java.lang.String str7 = element1.nodeName();
        org.jsoup.nodes.Element element9 = element1.getElementById("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            element9.doSetBaseUri("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        element1.nodelistChanged();
        org.jsoup.select.Elements elements7 = element1.parents();
        org.jsoup.nodes.Element element9 = element1.removeClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Attributes attributes10 = element1.attributes();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements15 = element13.getElementsByClass("hi!");
        org.jsoup.select.Elements elements18 = element13.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.select.Elements elements21 = element13.getElementsByAttributeValueMatching("", "<hi!></hi!>");
        boolean boolean22 = element13.hasParent();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements26 = element24.getElementsByClass("hi!");
        org.jsoup.select.Elements elements27 = element24.getAllElements();
        boolean boolean28 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element24);
        org.jsoup.nodes.Element element31 = element24.attr("", "hi!");
        java.lang.String str32 = element31.html();
        org.jsoup.nodes.Element element34 = element31.appendElement("<hi!></hi!>");
        java.lang.String[] strArray38 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        org.jsoup.nodes.Element element41 = element34.classNames((java.util.Set<java.lang.String>) strSet39);
        org.jsoup.nodes.Element element43 = element41.val("<hi!>\n <hi!></hi!>\n</hi!>");
        java.lang.String str44 = element43.baseUri();
        element43.setBaseUri("hi!");
        org.jsoup.nodes.Node[] nodeArray47 = new org.jsoup.nodes.Node[] { element13, element43 };
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element48 = element1.insertChildren(10, nodeArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(nodeArray47);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.nodes.Element element8 = element1.empty();
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        element12.setBaseUri("hi!");
        org.jsoup.select.Elements elements16 = element12.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element18 = element12.toggleClass("<hi!>\n hi!\n</hi!>");
        element18.setBaseUri("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element21 = element8.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element24 = element23.nextElementSibling();
        boolean boolean25 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element23);
        element23.doSetBaseUri("hi!");
        boolean boolean28 = element23.hasText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element29 = element21.after((org.jsoup.nodes.Node) element23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNull(element24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsMatchingText("");
        java.util.Set<java.lang.String> strSet6 = element1.classNames();
        element1.doSetBaseUri("hi!");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        element1.nodelistChanged();
        org.jsoup.nodes.Element element4 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element5 = element4.nextElementSibling();
        boolean boolean6 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element4);
        int int7 = element4.siblingIndex();
        org.jsoup.nodes.Element element10 = element4.attr("hi!", "<hi!></hi!>");
        java.lang.String str11 = element4.cssSelector();
        boolean boolean13 = element4.hasClass("<hi!></hi!>");
        org.jsoup.nodes.Element element15 = element4.removeClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element15.childNodes;
        // The following exception was thrown during execution in test generation
        try {
            element1.replaceWith((org.jsoup.nodes.Node) element15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element7 = element1.toggleClass("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element8 = element7.parent();
        int int9 = element7.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element7.after("<hi!>\n <hi!></hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        int int7 = element1.childNodeSize();
        java.lang.String str8 = element1.tagName();
        org.jsoup.nodes.Element element9 = element1.previousElementSibling();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element8.childNodesCopy();
        org.jsoup.select.Elements elements13 = element8.getElementsByIndexLessThan((int) (byte) 1);
        java.lang.String str14 = element8.id();
        boolean boolean15 = element8.isBlock();
        org.jsoup.select.Elements elements18 = element8.getElementsByAttributeValueMatching("<hi!>\n <hi!></hi!>\n</hi!>", "<hi! =\"hi!\">\n</hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList19 = element8.textNodes();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(textNodeList19);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.parents();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element8.nextElementSibling();
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element8);
        int int11 = element8.siblingIndex();
        org.jsoup.nodes.Element element14 = element8.attr("hi!", "<hi!></hi!>");
        java.lang.String str15 = element8.cssSelector();
        boolean boolean17 = element8.hasClass("<hi!></hi!>");
        org.jsoup.nodes.Element element18 = element1.doClone((org.jsoup.nodes.Node) element8);
        org.jsoup.nodes.Node node19 = element8.root();
        org.jsoup.select.NodeFilter nodeFilter20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = element8.filter(nodeFilter20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Node node4 = element1.parentNode();
        org.jsoup.select.Elements elements6 = element1.getElementsContainingOwnText("");
        org.jsoup.nodes.Element element7 = element1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element1.child((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Element element5 = element1.attr("", "");
        org.jsoup.nodes.Document document6 = element5.ownerDocument();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            element5.outerHtmlHead(appendable7, (int) 'a', outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.parser.Tag tag5 = element1.tag();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag5, "<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element8 = element7.shallowClone();
        java.util.regex.Pattern pattern10 = null;
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueMatching("hi!", pattern10);
        boolean boolean13 = element8.hasAttr("");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        org.jsoup.nodes.Element element10 = element1.prepend("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = element10.dataset();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.nodes.Element element8 = element7.nextElementSibling();
        java.lang.String str9 = element7.toString();
        org.jsoup.select.Elements elements12 = element7.getElementsByAttributeValueStarting("<hi! class=\"\"></hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str9, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.appendElement("<hi!></hi!>");
        java.lang.String[] strArray15 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.select.Elements elements20 = element18.getElementsByAttribute("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element22 = element18.val("&lt;hi!&gt;&lt;/hi!&gt;");
        org.jsoup.nodes.Node node23 = element18.previousSibling();
        java.lang.String str24 = element18.html();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        element1.nodelistChanged();
        boolean boolean8 = element1.equals((java.lang.Object) (byte) -1);
        org.jsoup.nodes.Element element10 = element1.prependElement("<hi! value=\"hi!\">\n hi!\n</hi!>");
        org.jsoup.nodes.Element element11 = element1.parent();
        org.jsoup.nodes.Element element12 = element1.parent();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Node node4 = element1.parentNode();
        org.jsoup.select.Elements elements6 = element1.getElementsContainingOwnText("");
        org.jsoup.nodes.Element element7 = element1.clone();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList8 = element7.dataNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element7.selectFirst("<hi! class=\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"\"></hi!>': unexpected token at '<hi! class=\"\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(dataNodeList8);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element6 = element5.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.siblingNodes();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsByClass("hi!");
        org.jsoup.nodes.Element element13 = element9.html("");
        org.jsoup.nodes.Element element15 = element9.toggleClass("");
        java.lang.String str16 = element15.text();
        java.lang.String str17 = element15.id();
        org.jsoup.nodes.Element element18 = element5.doClone((org.jsoup.nodes.Node) element15);
        element15.doSetBaseUri("hi!");
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements24 = element22.getElementsByClass("hi!");
        org.jsoup.select.Elements elements25 = element22.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = element22.childNodesCopy();
        java.util.Set<java.lang.String> strSet27 = element22.classNames();
        org.jsoup.nodes.Element element28 = element15.classNames(strSet27);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = element28.is("<hi! =\"hi!\">\n</hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! =\"hi!\">?</hi!>': unexpected token at '<hi! =\"hi!\">?</hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(element28);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.tagName();
        java.lang.String str11 = element1.text();
        org.jsoup.nodes.Node node13 = element1.removeAttr("<hi! class=\"\"></hi!>");
        java.lang.String str14 = element1.data();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Node node4 = element1.previousSibling();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element9 = element6.appendText("<hi!></hi!>");
        java.lang.String str10 = element9.className();
        org.jsoup.nodes.Element element11 = element9.empty();
        int int12 = element9.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = element9.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element9 = element6.appendText("<hi!></hi!>");
        java.lang.String str10 = element9.html();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element9.tagName("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Tag name must not be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "&lt;hi!&gt;&lt;/hi!&gt;" + "'", str10, "&lt;hi!&gt;&lt;/hi!&gt;");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.lang.String str8 = element7.text();
        org.jsoup.select.Elements elements11 = element7.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi!></hi!>");
        java.lang.String str12 = element7.toString();
        java.lang.String str14 = element7.attr("<hi!>\n hi!\n</hi!>");
        java.lang.String str15 = element7.html();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList16 = element7.dataNodes();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str12, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(dataNodeList16);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "hi!");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements16 = element14.getElementsByClass("hi!");
        org.jsoup.select.Elements elements17 = element14.getAllElements();
        boolean boolean18 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element14);
        org.jsoup.select.Elements elements19 = element14.siblingElements();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = element14.childNodes;
        boolean boolean21 = element12.equals((java.lang.Object) nodeList20);
        java.util.regex.Pattern pattern22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements23 = element12.getElementsMatchingText(pattern22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Element element5 = element1.attr("", "");
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi!></hi!>");
        java.lang.String str9 = element1.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element1.childNodes();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.nodes.Element element8 = element1.removeClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Node node9 = element8.previousSibling();
        org.jsoup.parser.Tag tag10 = element8.tag();
        boolean boolean12 = element8.hasAttr("<hi!>\n <hi!></hi!>\n</hi!>");
        boolean boolean13 = element8.isBlock();
        org.jsoup.nodes.Node node14 = element8.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element8.before("<hi! class=\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.siblingElements();
        org.jsoup.select.Elements elements7 = element1.getAllElements();
        org.jsoup.select.Elements elements9 = element1.getElementsMatchingOwnText("");
        org.jsoup.nodes.Element element11 = element1.val("");
        org.jsoup.nodes.Element element13 = element1.append("");
        org.jsoup.nodes.Node node14 = element1.previousSibling();
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.traverse(nodeVisitor15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        java.lang.String str8 = element1.cssSelector();
        int int9 = element1.siblingIndex();
        org.jsoup.nodes.Element element11 = element1.getElementById("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element11.after("<hi!>\n <hi!></hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element6 = element5.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.siblingNodes();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsByClass("hi!");
        org.jsoup.nodes.Element element13 = element9.html("");
        org.jsoup.nodes.Element element15 = element9.toggleClass("");
        java.lang.String str16 = element15.text();
        java.lang.String str17 = element15.id();
        org.jsoup.nodes.Element element18 = element5.doClone((org.jsoup.nodes.Node) element15);
        element15.doSetBaseUri("hi!");
        java.lang.String str22 = element15.attr("");
        org.jsoup.nodes.Element element23 = element15.previousElementSibling();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(element23);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.parents();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element8.nextElementSibling();
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element8);
        int int11 = element8.siblingIndex();
        org.jsoup.nodes.Element element14 = element8.attr("hi!", "<hi!></hi!>");
        java.lang.String str15 = element8.cssSelector();
        boolean boolean17 = element8.hasClass("<hi!></hi!>");
        org.jsoup.nodes.Element element18 = element1.doClone((org.jsoup.nodes.Node) element8);
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element21 = element20.nextElementSibling();
        org.jsoup.nodes.Attributes attributes22 = element20.attributes();
        org.jsoup.nodes.Element element24 = element20.text("");
        int int25 = element20.siblingIndex();
        org.jsoup.nodes.Element element27 = element20.text("hi!");
        org.jsoup.select.Elements elements29 = element27.getElementsMatchingText("");
        element27.doSetBaseUri("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element34 = element27.attr("hi!", true);
        org.jsoup.select.Elements elements36 = element34.getElementsMatchingText("<hi! hi!=\"<hi!></hi!>\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element37 = element8.before((org.jsoup.nodes.Node) element34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(elements36);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element1.childNodesCopy();
        java.lang.String str6 = element1.outerHtml();
        org.jsoup.nodes.Element element7 = element1.shallowClone();
        org.jsoup.nodes.Element element10 = element1.attr("<hi!></hi!>", "<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements15 = element13.getElementsByClass("hi!");
        org.jsoup.select.Elements elements18 = element13.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.select.Elements elements21 = element13.getElementsByAttributeValueMatching("", "<hi!></hi!>");
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements25 = element23.getElementsByClass("hi!");
        org.jsoup.nodes.Element element27 = element23.html("");
        org.jsoup.nodes.Element element28 = element27.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = element27.siblingNodes();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements33 = element31.getElementsByClass("hi!");
        org.jsoup.nodes.Element element35 = element31.html("");
        org.jsoup.nodes.Element element37 = element31.toggleClass("");
        java.lang.String str38 = element37.text();
        java.lang.String str39 = element37.id();
        org.jsoup.nodes.Element element40 = element27.doClone((org.jsoup.nodes.Node) element37);
        element37.doSetBaseUri("hi!");
        org.jsoup.nodes.Element element43 = element13.prependChild((org.jsoup.nodes.Node) element37);
        org.jsoup.select.Elements elements45 = element37.getElementsMatchingOwnText("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element46 = element10.insertChildren((int) (byte) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements45);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList47 = element10.textNodes();
        java.util.Map<java.lang.String, java.lang.String> strMap48 = element10.dataset();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi!></hi!>" + "'", str6, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNull(element28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(textNodeList47);
        org.junit.Assert.assertNotNull(strMap48);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element5 = element1.nextElementSibling();
        java.util.regex.Pattern pattern6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = element5.getElementsMatchingOwnText(pattern6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.nodes.Element element4 = element1.empty();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element1.textNodes();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsByClass("hi!");
        org.jsoup.nodes.Element element12 = element8.html("");
        java.lang.String str13 = element12.val();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element15.childNodes();
        org.jsoup.nodes.Element element17 = element12.appendTo(element15);
        org.jsoup.select.Elements elements19 = element15.getElementsByTag("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element20 = element1.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.Element>) elements19);
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        element22.setBaseUri("hi!");
        org.jsoup.nodes.Element element25 = element22.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element26 = element1.after((org.jsoup.nodes.Node) element22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element8 = element1.attr("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element1.getElementsByAttributeStarting("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        java.lang.String str4 = element1.toString();
        java.lang.String str5 = element1.id();
        java.lang.String str6 = element1.cssSelector();
        org.jsoup.nodes.Node node8 = element1.removeAttr("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = element1.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Node node12 = element7.clearAttributes();
        boolean boolean13 = element7.hasText();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements13 = element7.getElementsByTag("hi!");
        org.jsoup.nodes.Element element15 = element7.tagName("hi!");
        java.lang.String str16 = element15.ownText();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        java.util.Collection<org.jsoup.nodes.Element> elementCollection7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element5.insertChildren((-1), elementCollection7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Children collection to be inserted must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.parents();
        boolean boolean7 = element1.hasText();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsByClass("hi!");
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.nodes.Node node15 = element9.clearAttributes();
        org.jsoup.nodes.Element element17 = element9.addClass("");
        org.jsoup.select.Elements elements20 = element17.getElementsByAttributeValueContaining("<hi!></hi!>", "<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element23 = element17.attr("", false);
        java.util.List<org.jsoup.nodes.Node> nodeList24 = element17.ensureChildNodes();
        org.jsoup.nodes.Element element25 = element1.prependChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element31 = element30.nextElementSibling();
        org.jsoup.nodes.Attributes attributes32 = element30.attributes();
        java.lang.String str33 = element30.cssSelector();
        org.jsoup.nodes.Element element35 = element30.prependText("hi!");
        org.jsoup.nodes.Element element36 = element35.empty();
        org.jsoup.nodes.Element element38 = element35.appendText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList39 = element35.siblingNodes();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element42 = element41.nextElementSibling();
        org.jsoup.nodes.Attributes attributes43 = element41.attributes();
        org.jsoup.nodes.Element element45 = element41.text("");
        org.jsoup.nodes.Element element47 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element48 = element47.nextElementSibling();
        org.jsoup.nodes.Attributes attributes49 = element47.attributes();
        org.jsoup.nodes.Element element51 = element47.text("");
        int int52 = element47.siblingIndex();
        org.jsoup.nodes.Element element54 = element47.text("hi!");
        boolean boolean55 = element47.hasParent();
        java.lang.String str56 = element47.tagName();
        org.jsoup.nodes.Element element58 = element47.text("<hi!></hi!>");
        java.util.Map<java.lang.String, java.lang.String> strMap59 = element58.dataset();
        org.jsoup.nodes.Element element61 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element62 = element61.nextElementSibling();
        boolean boolean63 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element61);
        element61.doSetBaseUri("hi!");
        boolean boolean66 = element61.hasText();
        org.jsoup.nodes.Node node67 = element61.nextSibling();
        org.jsoup.nodes.Node[] nodeArray68 = new org.jsoup.nodes.Node[] { element28, element35, element41, element58, node67 };
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element69 = element1.insertChildren((int) (byte) -1, nodeArray68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array must not contain any null objects");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNull(element31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNull(element42);
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNull(element48);
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(strMap59);
        org.junit.Assert.assertNull(element62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(nodeArray68);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element7 = element1.toggleClass("<hi!>\n hi!\n</hi!>");
        element7.setBaseUri("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = element7.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.nodes.Element element8 = element1.removeClass("<hi! class=\"\"></hi!>");
        int int9 = element8.childNodeSize();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element1.childNodesCopy();
        boolean boolean7 = element1.hasClass("");
        org.jsoup.nodes.Document document8 = element1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = document8.attr("&lt;hi!&gt;&lt;/hi!&gt;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.nodes.Element element8 = element1.removeClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Node node9 = element8.previousSibling();
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeStarting("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element6 = element5.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.siblingNodes();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsByClass("hi!");
        org.jsoup.nodes.Element element13 = element9.html("");
        org.jsoup.nodes.Element element15 = element9.toggleClass("");
        java.lang.String str16 = element15.text();
        java.lang.String str17 = element15.id();
        org.jsoup.nodes.Element element18 = element5.doClone((org.jsoup.nodes.Node) element15);
        boolean boolean19 = element18.isBlock();
        java.lang.String str20 = element18.className();
        java.lang.String str21 = element18.toString();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<hi!></hi!>" + "'", str21, "<hi!></hi!>");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.tagName();
        org.jsoup.nodes.Element element12 = element1.text("<hi!></hi!>");
        org.jsoup.select.Elements elements14 = element1.getElementsByAttributeStarting("<hi!></hi!>");
        org.jsoup.nodes.Element element16 = element1.getElementById("<hi!>\n <hi!></hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = element16.hasClass("<hi! =\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(element16);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        int int7 = element1.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = element1.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsByClass("hi!");
        org.jsoup.select.Elements elements11 = element8.getAllElements();
        boolean boolean12 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element8);
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements17 = element15.getElementsByClass("hi!");
        org.jsoup.select.Elements elements20 = element15.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.select.Elements elements23 = element15.getElementsByAttributeValueMatching("", "<hi!></hi!>");
        org.jsoup.nodes.Node[] nodeArray24 = new org.jsoup.nodes.Node[] { element15 };
        org.jsoup.nodes.Element element25 = element8.insertChildren((-1), nodeArray24);
        java.lang.String str26 = element25.outerHtml();
        java.lang.String str28 = element25.absUrl("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element29 = element1.doClone((org.jsoup.nodes.Node) element25);
        java.lang.Appendable appendable30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        // The following exception was thrown during execution in test generation
        try {
            element29.outerHtmlHead(appendable30, (int) (short) 0, outputSettings32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(nodeArray24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<hi!>\n <hi!></hi!>\n</hi!>" + "'", str26, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.lang.String str8 = element7.text();
        org.jsoup.select.Elements elements11 = element7.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements15 = element13.getElementsByClass("hi!");
        org.jsoup.nodes.Element element17 = element13.html("");
        org.jsoup.nodes.Element element19 = element13.toggleClass("");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = element19.childNodes;
        element7.childNodes = nodeList20;
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element7.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = element7.child((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element8.childNodesCopy();
        org.jsoup.select.Elements elements12 = element8.parents();
        org.jsoup.select.Elements elements14 = element8.getElementsByIndexGreaterThan((int) (short) 100);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.select.Elements elements8 = element1.getElementsMatchingOwnText("");
        org.jsoup.nodes.Element element10 = element1.html("");
        org.jsoup.nodes.Element element11 = element1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element11.children();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element8.childNodesCopy();
        org.jsoup.select.Elements elements12 = element8.parents();
        org.jsoup.parser.Tag tag13 = element8.tag();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag13, "<hi!></hi!>");
        java.util.regex.Pattern pattern16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = element15.getElementsMatchingText(pattern16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element5 = element1.nextElementSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = element1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Element element5 = element1.attr("", "");
        org.jsoup.nodes.Element element6 = element1.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element1.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.nodes.Element element4 = element1.empty();
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Node node8 = element1.parentNode();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements12 = element10.getElementsByClass("hi!");
        org.jsoup.nodes.Element element14 = element10.html("");
        org.jsoup.nodes.Element element16 = element10.toggleClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element10.textNodes();
        org.jsoup.nodes.Element element19 = element10.addClass("");
        org.jsoup.nodes.Element element20 = element1.doClone((org.jsoup.nodes.Node) element10);
        java.lang.String str21 = element20.toString();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<hi!></hi!>" + "'", str21, "<hi!></hi!>");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.select.Elements elements9 = element6.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Node node10 = element6.parentNode();
        org.jsoup.select.Elements elements11 = element6.children();
        boolean boolean12 = element6.hasAttributes();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        element8.doSetBaseUri("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element14 = element8.toggleClass("<hi! class=\"\"></hi!>");
        java.lang.String str15 = element8.text();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "hi!");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        org.jsoup.select.Elements elements14 = element12.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements18 = element16.getElementsByClass("hi!");
        org.jsoup.nodes.Element element20 = element16.html("");
        org.jsoup.nodes.Element element21 = element20.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element20.siblingNodes();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements26 = element24.getElementsByClass("hi!");
        org.jsoup.nodes.Element element28 = element24.html("");
        org.jsoup.nodes.Element element30 = element24.toggleClass("");
        java.lang.String str31 = element30.text();
        java.lang.String str32 = element30.id();
        org.jsoup.nodes.Element element33 = element20.doClone((org.jsoup.nodes.Node) element30);
        org.jsoup.nodes.Element element35 = element33.getElementById("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element36 = element12.prependChild((org.jsoup.nodes.Node) element35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNull(element35);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        element1.nodelistChanged();
        boolean boolean8 = element1.equals((java.lang.Object) (byte) -1);
        boolean boolean10 = element1.hasClass("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element12 = element1.appendElement("&lt;hi!&gt;&lt;/hi!&gt;");
        java.lang.String str13 = element1.val();
        boolean boolean14 = element1.isBlock();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.appendElement("<hi!></hi!>");
        java.lang.String[] strArray15 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element20 = element18.val("<hi!>\n <hi!></hi!>\n</hi!>");
        java.lang.String str21 = element20.baseUri();
        java.lang.String str22 = element20.text();
        org.jsoup.nodes.Element element23 = element20.firstElementSibling();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(element23);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        element8.doSetBaseUri("<hi!>\n <hi!></hi!>\n</hi!>");
        boolean boolean14 = element8.hasClass("hi!");
        org.jsoup.nodes.Element element16 = element8.val("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = element16.is("<hi!>\n hi!\n</hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!>? hi!?</hi!>': unexpected token at '<hi!>? hi!?</hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.select.Elements elements9 = element1.getElementsByAttributeValueMatching("", "<hi!></hi!>");
        boolean boolean10 = element1.hasParent();
        java.lang.String str11 = element1.toString();
        org.jsoup.nodes.Element element12 = element1.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element1.tagName("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Tag name must not be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi!></hi!>" + "'", str11, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "hi!");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        org.jsoup.select.Elements elements14 = element12.getElementsContainingOwnText("hi!");
        java.lang.String str15 = element12.baseUri();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element18 = element17.nextElementSibling();
        boolean boolean19 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element17);
        int int20 = element17.siblingIndex();
        org.jsoup.nodes.Element element23 = element17.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements25 = element23.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements27 = element23.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements29 = element23.getElementsByTag("hi!");
        org.jsoup.nodes.Element element31 = element23.tagName("hi!");
        org.jsoup.nodes.Node node32 = element31.nextSibling();
        org.jsoup.nodes.Element element33 = element31.empty();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = element31.siblingNodes();
        element12.childNodes = nodeList34;
        java.lang.String str36 = element12.val();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = element12.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<hi!></hi!>" + "'", str15, "<hi!></hi!>");
        org.junit.Assert.assertNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element6 = element5.nextElementSibling();
        org.jsoup.nodes.Attributes attributes7 = element5.attributes();
        org.jsoup.nodes.Element element9 = element5.text("");
        int int10 = element5.siblingIndex();
        org.jsoup.nodes.Element element12 = element5.text("hi!");
        java.lang.String str13 = element12.outerHtml();
        org.jsoup.nodes.Node node15 = element12.removeAttr("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element16 = element1.appendChild((org.jsoup.nodes.Node) element12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element16.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str13, "<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        java.lang.String str8 = element6.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element6.childNodesCopy();
        org.jsoup.select.Elements elements11 = element6.getElementsMatchingOwnText("<hi! hi!=\"<hi!></hi!>\"></hi!>");
        org.jsoup.select.Elements elements13 = element6.getElementsContainingOwnText("<hi! =\"hi!\">\n</hi!>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.nodes.Element element8 = element1.removeClass("<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueStarting("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n hi!\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element8.getElementsByAttributeValueNot("", "<hi! hi!=\"<hi!></hi!>\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        element1.nodelistChanged();
        boolean boolean8 = element1.equals((java.lang.Object) (byte) -1);
        boolean boolean10 = element1.hasClass("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        element13.setBaseUri("hi!");
        org.jsoup.select.Elements elements17 = element13.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element21 = element20.nextElementSibling();
        boolean boolean22 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element20);
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element25 = element24.parent();
        org.jsoup.nodes.Node node26 = element24.parentNode();
        org.jsoup.select.Elements elements28 = element24.getElementsByIndexLessThan(1);
        boolean boolean29 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element24);
        org.jsoup.select.Elements elements30 = element24.children();
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements34 = element32.getElementsByClass("hi!");
        org.jsoup.nodes.Element element36 = element32.html("");
        org.jsoup.nodes.Element element37 = element36.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList38 = element36.siblingNodes();
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element41 = element40.parent();
        org.jsoup.nodes.Node node42 = element40.parentNode();
        org.jsoup.select.Elements elements44 = element40.getElementsByIndexLessThan(1);
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element47 = element46.nextElementSibling();
        org.jsoup.nodes.Attributes attributes48 = element46.attributes();
        org.jsoup.nodes.Element element50 = element46.text("");
        int int51 = element46.siblingIndex();
        org.jsoup.nodes.Element element53 = element46.text("hi!");
        boolean boolean54 = element46.hasParent();
        java.lang.String str55 = element46.tagName();
        org.jsoup.nodes.Node[] nodeArray56 = new org.jsoup.nodes.Node[] { element20, element24, element36, element40, element46 };
        org.jsoup.nodes.Element element57 = element13.insertChildren((int) (short) 0, nodeArray56);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element58 = element1.insertChildren((int) (byte) 1, nodeArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNull(element37);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNull(element41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNull(element47);
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(nodeArray56);
        org.junit.Assert.assertNotNull(element57);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.tagName();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.nextElementSibling();
        org.jsoup.nodes.Attributes attributes14 = element12.attributes();
        org.jsoup.nodes.Element element16 = element12.text("");
        int int17 = element12.siblingIndex();
        org.jsoup.select.Elements elements18 = element12.getAllElements();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList19 = element12.textNodes();
        org.jsoup.select.Elements elements20 = element12.children();
        java.util.Set<java.lang.String> strSet21 = element12.classNames();
        org.jsoup.nodes.Element element22 = element1.classNames(strSet21);
        org.jsoup.nodes.Element element24 = element22.prepend("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element27 = element26.parent();
        org.jsoup.nodes.Node node28 = element26.parentNode();
        org.jsoup.select.Elements elements30 = element26.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = element26.childNodes;
        element22.childNodes = nodeList31;
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(textNodeList19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNull(element27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(nodeList31);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element9 = element6.appendText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element6.siblingNodes();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements14 = element12.getElementsByClass("hi!");
        org.jsoup.select.Elements elements15 = element12.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element12.childNodesCopy();
        java.util.Set<java.lang.String> strSet17 = element12.classNames();
        org.jsoup.nodes.Element element18 = element6.classNames(strSet17);
        org.jsoup.nodes.Element element20 = element6.tagName("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.select.NodeVisitor nodeVisitor21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = element20.traverse(nodeVisitor21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element8.childNodesCopy();
        org.jsoup.select.Elements elements13 = element8.getElementsByIndexLessThan((int) (byte) 1);
        java.lang.String str14 = element8.id();
        boolean boolean15 = element8.isBlock();
        org.jsoup.select.Elements elements18 = element8.getElementsByAttributeValueMatching("<hi!>\n <hi!></hi!>\n</hi!>", "<hi! =\"hi!\">\n</hi!>");
        org.jsoup.nodes.Element element19 = element8.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements22 = element19.getElementsByAttributeValueMatching("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>", "<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNull(element19);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element1.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = element1.child((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.parser.Tag tag5 = element1.tag();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag5, "");
        org.jsoup.select.Elements elements9 = element7.getElementsByAttribute("&lt;hi!&gt;&lt;/hi!&gt;");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.nodes.Element element4 = element1.empty();
        boolean boolean5 = element1.hasText();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.nodes.Element element8 = element1.empty();
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        element12.setBaseUri("hi!");
        org.jsoup.select.Elements elements16 = element12.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element18 = element12.toggleClass("<hi!>\n hi!\n</hi!>");
        element18.setBaseUri("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element21 = element8.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.select.Elements elements22 = element21.children();
        java.lang.String str24 = element21.attr("");
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element27 = element26.nextElementSibling();
        org.jsoup.nodes.Attributes attributes28 = element26.attributes();
        org.jsoup.nodes.Element element30 = element26.text("");
        int int31 = element26.siblingIndex();
        org.jsoup.nodes.Element element33 = element26.text("hi!");
        org.jsoup.select.Elements elements35 = element33.getElementsMatchingText("");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = element33.childNodesCopy();
        org.jsoup.select.Elements elements37 = element33.parents();
        org.jsoup.parser.Tag tag38 = element33.tag();
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element(tag38, "<hi!></hi!>");
        java.lang.String str41 = element40.ownText();
        // The following exception was thrown during execution in test generation
        try {
            element21.replaceWith((org.jsoup.nodes.Node) element40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(element27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element1.childNodes;
        org.jsoup.select.Elements elements9 = element1.getElementsByClass("<hi! value=\"hi!\">\n hi!\n</hi!>");
        org.jsoup.select.Elements elements10 = element1.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = element1.is("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!': unexpected token at '!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.nodes.Node node7 = element1.clearAttributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = element1.dataset();
        org.jsoup.nodes.Element element10 = element1.val("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements11 = element10.siblingElements();
        org.jsoup.select.Elements elements13 = element10.getElementsMatchingText("");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        org.jsoup.nodes.Element element10 = element1.appendText("");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Node node14 = element10.removeAttr("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Node node15 = node14.parentNode();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        java.lang.String str6 = element5.val();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element8.childNodes();
        org.jsoup.nodes.Element element10 = element5.appendTo(element8);
        org.jsoup.nodes.Element element12 = element10.html("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements14 = element10.getElementsContainingText("<hi!></hi!>");
        org.jsoup.nodes.Element element17 = element10.attr("<hi! class=\"\"></hi!>", false);
        java.lang.String str18 = element17.text();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = element17.dataset();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("", "hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements12 = element10.getElementsByClass("hi!");
        org.jsoup.nodes.Element element14 = element10.html("");
        org.jsoup.nodes.Element element15 = element14.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element14.siblingNodes();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements20 = element18.getElementsByClass("hi!");
        org.jsoup.nodes.Element element22 = element18.html("");
        org.jsoup.nodes.Element element24 = element18.toggleClass("");
        java.lang.String str25 = element24.text();
        java.lang.String str26 = element24.id();
        org.jsoup.nodes.Element element27 = element14.doClone((org.jsoup.nodes.Node) element24);
        element24.doSetBaseUri("hi!");
        org.jsoup.nodes.Element element30 = element1.prependChild((org.jsoup.nodes.Node) element24);
        org.jsoup.nodes.Element element32 = element30.addClass("<hi!></hi!>");
        org.jsoup.select.Elements elements34 = element32.getElementsByIndexLessThan((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = element32.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements34);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.lang.String str8 = element1.html();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList9 = element1.dataNodes();
        java.lang.String str11 = element1.absUrl("hi!");
        org.jsoup.select.Elements elements13 = element1.getElementsByIndexGreaterThan((int) (byte) -1);
        org.jsoup.nodes.Node node14 = element1.nextSibling();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(dataNodeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("", "hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements12 = element10.getElementsByClass("hi!");
        org.jsoup.nodes.Element element14 = element10.html("");
        org.jsoup.nodes.Element element15 = element14.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element14.siblingNodes();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements20 = element18.getElementsByClass("hi!");
        org.jsoup.nodes.Element element22 = element18.html("");
        org.jsoup.nodes.Element element24 = element18.toggleClass("");
        java.lang.String str25 = element24.text();
        java.lang.String str26 = element24.id();
        org.jsoup.nodes.Element element27 = element14.doClone((org.jsoup.nodes.Node) element24);
        element24.doSetBaseUri("hi!");
        org.jsoup.nodes.Element element30 = element1.prependChild((org.jsoup.nodes.Node) element24);
        org.jsoup.select.Elements elements32 = element24.getElementsByAttribute("<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements32);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.select.Elements elements9 = element1.getElementsByAttributeValueMatching("", "<hi!></hi!>");
        boolean boolean10 = element1.hasParent();
        java.lang.String str11 = element1.toString();
        org.jsoup.nodes.Element element12 = element1.empty();
        java.lang.String str13 = element12.outerHtml();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi!></hi!>" + "'", str11, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<hi!></hi!>" + "'", str13, "<hi!></hi!>");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.nodes.Element element8 = element1.empty();
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        element12.setBaseUri("hi!");
        org.jsoup.select.Elements elements16 = element12.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element18 = element12.toggleClass("<hi!>\n hi!\n</hi!>");
        element18.setBaseUri("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element21 = element8.prependChild((org.jsoup.nodes.Node) element18);
        java.util.Set<java.lang.String> strSet22 = element21.classNames();
        java.util.regex.Pattern pattern23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements24 = element21.getElementsMatchingOwnText(pattern23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.nodes.Element element8 = element1.removeClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Node node9 = element8.previousSibling();
        org.jsoup.parser.Tag tag10 = element8.tag();
        org.jsoup.select.Elements elements12 = element8.getElementsByAttributeStarting("&lt;hi!&gt;&lt;/hi!&gt;");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        java.lang.String str8 = element6.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element6.childNodesCopy();
        org.jsoup.nodes.Element element10 = element6.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element6.getElementsByAttributeValueEnding("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements8 = element6.getElementsByClass("hi!");
        java.lang.String str9 = element6.toString();
        org.jsoup.parser.Tag tag10 = element6.tag();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag10, "<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element13 = element12.shallowClone();
        org.jsoup.select.Elements elements16 = element12.getElementsByAttributeValueEnding("<hi! class=\"\"></hi!>", "hi!");
        org.jsoup.nodes.Element element17 = element1.appendChild((org.jsoup.nodes.Node) element12);
        org.jsoup.nodes.Element element18 = element12.nextElementSibling();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!></hi!>" + "'", str9, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNull(element18);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element8.nextElementSibling();
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element8);
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.parent();
        org.jsoup.nodes.Node node14 = element12.parentNode();
        org.jsoup.select.Elements elements16 = element12.getElementsByIndexLessThan(1);
        boolean boolean17 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element12);
        org.jsoup.select.Elements elements18 = element12.children();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements22 = element20.getElementsByClass("hi!");
        org.jsoup.nodes.Element element24 = element20.html("");
        org.jsoup.nodes.Element element25 = element24.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = element24.siblingNodes();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element29 = element28.parent();
        org.jsoup.nodes.Node node30 = element28.parentNode();
        org.jsoup.select.Elements elements32 = element28.getElementsByIndexLessThan(1);
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element35 = element34.nextElementSibling();
        org.jsoup.nodes.Attributes attributes36 = element34.attributes();
        org.jsoup.nodes.Element element38 = element34.text("");
        int int39 = element34.siblingIndex();
        org.jsoup.nodes.Element element41 = element34.text("hi!");
        boolean boolean42 = element34.hasParent();
        java.lang.String str43 = element34.tagName();
        org.jsoup.nodes.Node[] nodeArray44 = new org.jsoup.nodes.Node[] { element8, element12, element24, element28, element34 };
        org.jsoup.nodes.Element element45 = element1.insertChildren((int) (short) 0, nodeArray44);
        org.jsoup.nodes.Element element46 = element1.shallowClone();
        org.jsoup.nodes.Element element47 = element1.clone();
        org.jsoup.select.Elements elements49 = element47.getElementsByAttributeStarting("<hi!> &lt;hi! class=\"\"&gt;&lt;/hi!&gt; </hi!>");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(nodeArray44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(elements49);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        element8.doSetBaseUri("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element14 = element8.toggleClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Node node15 = element14.previousSibling();
        org.jsoup.nodes.Element element17 = element14.addClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements21 = element19.getElementsByClass("hi!");
        org.jsoup.select.Elements elements22 = element19.getAllElements();
        boolean boolean23 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element19);
        org.jsoup.nodes.Element element26 = element19.attr("", "hi!");
        java.lang.String str27 = element26.html();
        org.jsoup.nodes.Element element29 = element26.appendElement("<hi!></hi!>");
        java.lang.String[] strArray33 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.jsoup.nodes.Element element36 = element29.classNames((java.util.Set<java.lang.String>) strSet34);
        org.jsoup.nodes.Element element38 = element36.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element40 = element38.text("");
        org.jsoup.nodes.Element element42 = element40.append("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element44 = element40.tagName("<hi!></hi!>");
        org.jsoup.nodes.Node node45 = element44.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element46 = element17.before(node45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNull(node45);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.appendElement("<hi!></hi!>");
        java.lang.String[] strArray15 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element20 = element18.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element22 = element20.text("");
        java.lang.String str23 = element20.tagName();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<hi!></hi!>" + "'", str23, "<hi!></hi!>");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.siblingElements();
        org.jsoup.select.Elements elements7 = element1.getAllElements();
        org.jsoup.select.Elements elements9 = element1.getElementsMatchingOwnText("");
        org.jsoup.nodes.Element element11 = element1.val("");
        java.lang.String str13 = element1.absUrl("<hi!>\n <hi!></hi!>\n</hi!>");
        java.util.Set<java.lang.String> strSet14 = element1.classNames();
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = element1.traverse(nodeVisitor15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.tagName();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.nextElementSibling();
        org.jsoup.nodes.Attributes attributes14 = element12.attributes();
        org.jsoup.nodes.Element element16 = element12.text("");
        int int17 = element12.siblingIndex();
        org.jsoup.select.Elements elements18 = element12.getAllElements();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList19 = element12.textNodes();
        org.jsoup.select.Elements elements20 = element12.children();
        java.util.Set<java.lang.String> strSet21 = element12.classNames();
        org.jsoup.nodes.Element element22 = element1.classNames(strSet21);
        org.jsoup.nodes.Element element24 = element1.prepend("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements27 = element24.getElementsByAttributeValueNot("<hi!>\n hi!\n</hi!>", "<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        boolean boolean29 = element24.hasClass("<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(textNodeList19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = element1.textNodes();
        org.jsoup.nodes.Element element10 = element1.addClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList11 = element10.dataNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element10.child(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(textNodeList8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(dataNodeList11);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element6 = element5.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.siblingNodes();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsByClass("hi!");
        org.jsoup.nodes.Element element13 = element9.html("");
        org.jsoup.nodes.Element element15 = element9.toggleClass("");
        java.lang.String str16 = element15.text();
        java.lang.String str17 = element15.id();
        org.jsoup.nodes.Element element18 = element5.doClone((org.jsoup.nodes.Node) element15);
        java.lang.String str19 = element18.data();
        org.jsoup.select.Elements elements22 = element18.getElementsByAttributeValueContaining("<hi!></hi!>", "<hi! =\"hi!\">\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            element18.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        element1.setBaseUri("<hi!>\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        java.lang.String str9 = element8.outerHtml();
        org.jsoup.nodes.Element element11 = element8.appendText("");
        org.jsoup.nodes.Node node13 = element8.removeAttr("");
        org.jsoup.parser.Tag tag14 = element8.tag();
        org.jsoup.select.Elements elements16 = element8.getElementsByIndexGreaterThan((int) (short) 0);
        org.jsoup.nodes.Element element18 = element8.addClass("<hi!>\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str9, "<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.cssSelector();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element1.select("<hi! class=\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"\"></hi!>': unexpected token at '<hi! class=\"\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexLessThan((int) 'a');
        java.lang.String str10 = element7.html();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            element7.outerHtmlTail(appendable11, (int) '#', outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Element element5 = element1.attr("", "");
        java.lang.String str6 = element1.id();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsByClass("hi!");
        org.jsoup.nodes.Element element12 = element8.html("");
        org.jsoup.nodes.Element element14 = element8.toggleClass("");
        java.lang.String str15 = element14.text();
        org.jsoup.select.Elements elements18 = element14.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements22 = element20.getElementsByClass("hi!");
        org.jsoup.nodes.Element element24 = element20.html("");
        org.jsoup.nodes.Element element26 = element20.toggleClass("");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = element26.childNodes;
        element14.childNodes = nodeList27;
        element1.childNodes = nodeList27;
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element32 = element31.parent();
        org.jsoup.nodes.Node node33 = element31.parentNode();
        org.jsoup.select.Elements elements35 = element31.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList36 = element31.childNodes;
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements40 = element38.getElementsByClass("hi!");
        org.jsoup.select.Elements elements41 = element38.getAllElements();
        boolean boolean42 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element38);
        org.jsoup.nodes.Element element45 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements47 = element45.getElementsByClass("hi!");
        org.jsoup.select.Elements elements50 = element45.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.select.Elements elements53 = element45.getElementsByAttributeValueMatching("", "<hi!></hi!>");
        org.jsoup.nodes.Node[] nodeArray54 = new org.jsoup.nodes.Node[] { element45 };
        org.jsoup.nodes.Element element55 = element38.insertChildren((-1), nodeArray54);
        java.lang.String str56 = element55.outerHtml();
        java.lang.String str58 = element55.absUrl("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element59 = element31.doClone((org.jsoup.nodes.Node) element55);
        org.jsoup.nodes.Element element60 = element1.doClone((org.jsoup.nodes.Node) element55);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element62 = element1.selectFirst("<hi!> &lt;hi! class=\"\"&gt;&lt;/hi!&gt; </hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!> &lt;hi! class=\"\"&gt;&lt;/hi!&gt; </hi!>': unexpected token at '<hi!> &lt;hi! class=\"\"&gt;&lt;/hi!&gt; </hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNull(element32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(nodeArray54);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "<hi!>\n <hi!></hi!>\n</hi!>" + "'", str56, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element60);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = element5.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "hi!");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        org.jsoup.select.Elements elements14 = element12.getElementsContainingOwnText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element12.child((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element6 = element5.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.siblingNodes();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsByClass("hi!");
        org.jsoup.nodes.Element element13 = element9.html("");
        org.jsoup.nodes.Element element15 = element9.toggleClass("");
        java.lang.String str16 = element15.text();
        java.lang.String str17 = element15.id();
        org.jsoup.nodes.Element element18 = element5.doClone((org.jsoup.nodes.Node) element15);
        element15.doSetBaseUri("hi!");
        org.jsoup.nodes.Element element21 = element15.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element23 = element21.tagName("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Tag name must not be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.nodes.Node node7 = element1.clearAttributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = element1.dataset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = element1.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi! hi!=\"<hi!></hi!>\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node3 = element1.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.nodes.Element element8 = element1.removeClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Node node9 = element8.previousSibling();
        org.jsoup.parser.Tag tag10 = element8.tag();
        int int11 = element8.elementSiblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element8.getElementsByAttributeValueStarting("", "<hi! =\"hi!\">\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.tagName();
        org.jsoup.select.Elements elements12 = element1.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.select.Elements elements13 = element1.parents();
        org.jsoup.select.Elements elements14 = element1.parents();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element17 = element16.nextElementSibling();
        org.jsoup.nodes.Element element20 = element16.attr("", "");
        org.jsoup.nodes.Element element21 = element16.empty();
        org.jsoup.select.Elements elements23 = element16.getElementsByIndexLessThan(10);
        // The following exception was thrown during execution in test generation
        try {
            element1.replaceWith((org.jsoup.nodes.Node) element16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        element1.doSetBaseUri("hi!");
        org.jsoup.nodes.Element element6 = element1.shallowClone();
        java.lang.String str7 = element1.nodeName();
        org.jsoup.nodes.Element element9 = element1.getElementById("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element9.getAllElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.appendElement("<hi!></hi!>");
        java.lang.String[] strArray15 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element20 = element18.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element22 = element18.removeClass("<hi!>\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = element1.is("<hi!> &lt;hi! class=\"\"&gt;&lt;/hi!&gt; </hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!> &lt;hi! class=\"\"&gt;&lt;/hi!&gt; </hi!>': unexpected token at '<hi!> &lt;hi! class=\"\"&gt;&lt;/hi!&gt; </hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.lang.String str8 = element7.text();
        org.jsoup.select.Elements elements11 = element7.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements15 = element13.getElementsByClass("hi!");
        org.jsoup.nodes.Element element17 = element13.html("");
        org.jsoup.nodes.Element element19 = element13.toggleClass("");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = element19.childNodes;
        element7.childNodes = nodeList20;
        java.lang.String str22 = element7.data();
        org.jsoup.nodes.Element element24 = element7.getElementById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = element24.hasText();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(element24);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        java.lang.String str9 = element8.outerHtml();
        org.jsoup.nodes.Element element11 = element8.appendText("");
        org.jsoup.nodes.Node node13 = element8.removeAttr("");
        org.jsoup.parser.Tag tag14 = element8.tag();
        java.lang.Class<?> wildcardClass15 = tag14.getClass();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str9, "<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element9 = element6.appendText("<hi!></hi!>");
        java.lang.String str10 = element9.className();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element9.doClone((org.jsoup.nodes.Node) element12);
        org.jsoup.nodes.Attributes attributes14 = element12.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = element12.select("&lt;hi!&gt;&lt;/hi!&gt;");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '&lt;hi!&gt;&lt;/hi!&gt;': unexpected token at '&lt;hi!&gt;&lt;/hi!&gt;'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        java.lang.String str6 = element5.val();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element8.childNodes();
        org.jsoup.nodes.Element element10 = element5.appendTo(element8);
        org.jsoup.nodes.Element element12 = element10.html("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element14 = element10.tagName("<hi! class=\"\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = element10.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.nodes.Element element8 = element1.removeClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Node node9 = element8.previousSibling();
        org.jsoup.parser.Tag tag10 = element8.tag();
        org.jsoup.select.Elements elements12 = element8.getElementsContainingOwnText("&lt;hi!&gt;&lt;/hi!&gt;");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = element8.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.appendElement("<hi!></hi!>");
        java.lang.String[] strArray15 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element20 = element18.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element22 = element20.text("");
        org.jsoup.nodes.Element element24 = element22.append("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element26 = element24.text("");
        org.jsoup.nodes.Node node27 = element26.parentNode();
        org.jsoup.nodes.Element element28 = element26.parent();
        java.lang.String str29 = element26.val();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<hi!>\n <hi!></hi!>\n</hi!>" + "'", str29, "<hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.nodes.Node node7 = element1.clearAttributes();
        org.jsoup.nodes.Element element9 = element1.addClass("");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueContaining("<hi!></hi!>", "<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element15 = element9.attr("", false);
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element9.ensureChildNodes();
        org.jsoup.nodes.Element element18 = element9.text("");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        java.lang.String str8 = element1.cssSelector();
        boolean boolean10 = element1.hasClass("<hi!></hi!>");
        org.jsoup.nodes.Element element12 = element1.removeClass("<hi!></hi!>");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexGreaterThan((int) ' ');
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.appendElement("<hi!></hi!>");
        java.lang.String[] strArray15 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element20 = element18.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element22 = element20.text("");
        org.jsoup.nodes.Element element24 = element22.append("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element26 = element22.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements30 = element28.getElementsByClass("hi!");
        org.jsoup.select.Elements elements31 = element28.getAllElements();
        boolean boolean32 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element28);
        org.jsoup.nodes.Element element35 = element28.attr("", "hi!");
        java.lang.String str36 = element35.html();
        org.jsoup.nodes.Element element38 = element35.appendElement("<hi!></hi!>");
        java.lang.String[] strArray42 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        org.jsoup.nodes.Element element45 = element38.classNames((java.util.Set<java.lang.String>) strSet43);
        org.jsoup.nodes.Element element47 = element45.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element49 = element47.text("");
        org.jsoup.nodes.Element element51 = element49.append("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList54 = element53.childNodes();
        element49.childNodes = nodeList54;
        element26.replaceWith((org.jsoup.nodes.Node) element49);
        java.lang.Appendable appendable57 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = null;
        // The following exception was thrown during execution in test generation
        try {
            element26.outerHtmlTail(appendable57, (int) (byte) 10, outputSettings59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(nodeList54);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.nodes.Node node7 = element1.clearAttributes();
        org.jsoup.nodes.Element element9 = element1.addClass("");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueContaining("<hi!></hi!>", "<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element15 = element9.attr("", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = element9.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.nodes.Node node7 = element1.clearAttributes();
        org.jsoup.nodes.Element element9 = element1.addClass("");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueContaining("<hi!></hi!>", "<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element15 = element9.attr("", false);
        java.util.regex.Pattern pattern16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = element9.getElementsMatchingOwnText(pattern16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!> &lt;hi! class=\"\"&gt;&lt;/hi!&gt; </hi!>");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            element1.outerHtmlHead(appendable2, (int) (short) -1, outputSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.appendElement("<hi!></hi!>");
        java.lang.String[] strArray15 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element20 = element18.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element22 = element20.text("");
        org.jsoup.nodes.Element element24 = element22.append("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element26 = element22.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements30 = element28.getElementsByClass("hi!");
        org.jsoup.select.Elements elements31 = element28.getAllElements();
        boolean boolean32 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element28);
        org.jsoup.nodes.Element element35 = element28.attr("", "hi!");
        java.lang.String str36 = element35.html();
        org.jsoup.nodes.Element element38 = element35.appendElement("<hi!></hi!>");
        java.lang.String[] strArray42 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        org.jsoup.nodes.Element element45 = element38.classNames((java.util.Set<java.lang.String>) strSet43);
        org.jsoup.nodes.Element element47 = element45.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element49 = element47.text("");
        org.jsoup.nodes.Element element51 = element49.append("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList54 = element53.childNodes();
        element49.childNodes = nodeList54;
        element26.replaceWith((org.jsoup.nodes.Node) element49);
        element26.setBaseUri("<hi! value=\"hi!\">\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(nodeList54);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element6 = element5.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.siblingNodes();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsByClass("hi!");
        org.jsoup.nodes.Element element13 = element9.html("");
        org.jsoup.nodes.Element element15 = element9.toggleClass("");
        java.lang.String str16 = element15.text();
        java.lang.String str17 = element15.id();
        org.jsoup.nodes.Element element18 = element5.doClone((org.jsoup.nodes.Node) element15);
        element15.doSetBaseUri("hi!");
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements24 = element22.getElementsByClass("hi!");
        org.jsoup.select.Elements elements25 = element22.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = element22.childNodesCopy();
        java.util.Set<java.lang.String> strSet27 = element22.classNames();
        org.jsoup.nodes.Element element28 = element15.classNames(strSet27);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = element28.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(element28);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element8.childNodesCopy();
        org.jsoup.select.Elements elements12 = element8.parents();
        org.jsoup.parser.Tag tag13 = element8.tag();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag13, "<hi!></hi!>");
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        element18.setBaseUri("hi!");
        org.jsoup.select.Elements elements22 = element18.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Attributes attributes23 = element18.attributes();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element(tag13, "<hi!>\n hi!\n</hi!>", attributes23);
        boolean boolean25 = element24.hasAttributes();
        java.lang.String str26 = element24.tagName();
        java.lang.String str27 = element24.val();
        org.jsoup.select.Elements elements29 = element24.getElementsByIndexGreaterThan((int) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList30 = element24.ensureChildNodes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = element24.is("&lt;hi!&gt;&lt;/hi!&gt;");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '&lt;hi!&gt;&lt;/hi!&gt;': unexpected token at '&lt;hi!&gt;&lt;/hi!&gt;'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(nodeList30);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.nodes.Element element8 = element1.prepend("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements12 = element10.getElementsByClass("hi!");
        org.jsoup.nodes.Element element14 = element10.html("");
        java.lang.String str15 = element14.val();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element17.childNodes();
        org.jsoup.nodes.Element element19 = element14.appendTo(element17);
        org.jsoup.select.Elements elements22 = element17.getElementsByAttributeValueEnding("<hi! class=\"\"></hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element23 = element1.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.select.NodeFilter nodeFilter24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = element1.filter(nodeFilter24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements13 = element7.getElementsByTag("hi!");
        org.jsoup.nodes.Element element15 = element7.tagName("hi!");
        org.jsoup.nodes.Element element17 = element7.appendElement("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element19 = element17.val("<hi! hi!=\"<hi!></hi!>\"></hi!>");
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        // The following exception was thrown during execution in test generation
        try {
            element17.outerHtmlTail(appendable20, (int) ' ', outputSettings22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.appendElement("<hi!></hi!>");
        java.lang.String[] strArray15 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element20 = element18.val("<hi!>\n <hi!></hi!>\n</hi!>");
        java.lang.String str21 = element20.baseUri();
        element20.setBaseUri("hi!");
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        element25.setBaseUri("hi!");
        org.jsoup.nodes.Element element28 = element25.empty();
        org.jsoup.nodes.Element element29 = element20.after((org.jsoup.nodes.Node) element28);
        java.util.Collection<org.jsoup.nodes.Element> elementCollection31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element32 = element20.insertChildren((int) '#', elementCollection31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Children collection to be inserted must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.lang.String str8 = element1.html();
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element1.appendTo(element9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.nodes.Element element8 = element1.empty();
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        element12.setBaseUri("hi!");
        org.jsoup.select.Elements elements16 = element12.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element18 = element12.toggleClass("<hi!>\n hi!\n</hi!>");
        element18.setBaseUri("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element21 = element8.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.select.Elements elements22 = element21.children();
        java.lang.String str23 = element21.nodeName();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi! =\"\"></hi!>");
        boolean boolean3 = element1.hasClass("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = element1.after(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element6 = element5.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.siblingNodes();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsByClass("hi!");
        org.jsoup.nodes.Element element13 = element9.html("");
        org.jsoup.nodes.Element element15 = element9.toggleClass("");
        java.lang.String str16 = element15.text();
        java.lang.String str17 = element15.id();
        org.jsoup.nodes.Element element18 = element5.doClone((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Node node19 = element15.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = element15.childNodes();
        org.jsoup.nodes.Element element22 = element15.prepend("");
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element25 = element24.nextElementSibling();
        boolean boolean26 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element24);
        int int27 = element24.siblingIndex();
        org.jsoup.nodes.Element element30 = element24.attr("hi!", "<hi!></hi!>");
        java.lang.String str31 = element24.cssSelector();
        boolean boolean33 = element24.hasClass("<hi!></hi!>");
        org.jsoup.nodes.Element element35 = element24.removeClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = element35.childNodes;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element37 = element15.after((org.jsoup.nodes.Node) element35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(nodeList36);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element8 = element7.nextElementSibling();
        org.jsoup.nodes.Element element11 = element7.attr("", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element1.before((org.jsoup.nodes.Node) element11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.siblingElements();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element1.childNodes;
        org.jsoup.select.Elements elements10 = element1.getElementsByAttributeValueStarting("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element12 = element1.appendElement("&lt;hi!&gt;&lt;/hi!&gt;");
        java.util.regex.Pattern pattern13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element1.getElementsMatchingText(pattern13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.appendElement("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element8.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!>\n hi!\n</hi!>");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("", "hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements12 = element10.getElementsByClass("hi!");
        org.jsoup.nodes.Element element14 = element10.html("");
        org.jsoup.nodes.Element element15 = element14.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element14.siblingNodes();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements20 = element18.getElementsByClass("hi!");
        org.jsoup.nodes.Element element22 = element18.html("");
        org.jsoup.nodes.Element element24 = element18.toggleClass("");
        java.lang.String str25 = element24.text();
        java.lang.String str26 = element24.id();
        org.jsoup.nodes.Element element27 = element14.doClone((org.jsoup.nodes.Node) element24);
        element24.doSetBaseUri("hi!");
        org.jsoup.nodes.Element element30 = element1.prependChild((org.jsoup.nodes.Node) element24);
        org.jsoup.nodes.Element element32 = element30.addClass("<hi!></hi!>");
        org.jsoup.select.Elements elements34 = element30.getElementsByAttribute("hi!");
        org.jsoup.nodes.Node node35 = element30.parentNode();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNull(node35);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        java.lang.String str6 = element5.val();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element5.before("<hi! =\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element6 = element5.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.siblingNodes();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsByClass("hi!");
        org.jsoup.nodes.Element element13 = element9.html("");
        org.jsoup.nodes.Element element15 = element9.toggleClass("");
        java.lang.String str16 = element15.text();
        java.lang.String str17 = element15.id();
        org.jsoup.nodes.Element element18 = element5.doClone((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Node node19 = element15.previousSibling();
        java.lang.String str20 = element15.id();
        java.lang.String str21 = element15.cssSelector();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element15.childNodes;
        java.lang.String str23 = element15.toString();
        org.jsoup.nodes.Element element25 = element15.appendElement("hi!");
        java.util.Collection<org.jsoup.nodes.Element> elementCollection27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element28 = element25.insertChildren((int) (byte) 10, elementCollection27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Children collection to be inserted must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str23, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.parents();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element8.nextElementSibling();
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element8);
        int int11 = element8.siblingIndex();
        org.jsoup.nodes.Element element14 = element8.attr("hi!", "<hi!></hi!>");
        java.lang.String str15 = element8.cssSelector();
        boolean boolean17 = element8.hasClass("<hi!></hi!>");
        org.jsoup.nodes.Element element18 = element1.doClone((org.jsoup.nodes.Node) element8);
        org.jsoup.nodes.Document document19 = element1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList20 = document19.ensureChildNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(document19);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.siblingElements();
        org.jsoup.select.Elements elements7 = element1.getAllElements();
        org.jsoup.nodes.Element element9 = element1.prepend("<hi!>\n hi!\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element1.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element6 = element5.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.siblingNodes();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsByClass("hi!");
        org.jsoup.nodes.Element element13 = element9.html("");
        org.jsoup.nodes.Element element15 = element9.toggleClass("");
        java.lang.String str16 = element15.text();
        java.lang.String str17 = element15.id();
        org.jsoup.nodes.Element element18 = element5.doClone((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Node node19 = element15.previousSibling();
        java.lang.String str20 = element15.id();
        java.lang.String str21 = element15.cssSelector();
        org.jsoup.nodes.Element element24 = element15.attr("<hi! =\"hi!\">\n</hi!>", true);
        java.lang.String str25 = element24.baseUri();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element1.prependText("<hi! value=\"hi!\">\n hi!\n</hi!>");
        java.lang.String str10 = element9.baseUri();
        java.lang.String str11 = element9.outerHtml();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi! hi!=\"<hi!></hi!>\">\n &lt;hi! value=\"hi!\"&gt; hi! &lt;/hi!&gt;\n</hi!>" + "'", str11, "<hi! hi!=\"<hi!></hi!>\">\n &lt;hi! value=\"hi!\"&gt; hi! &lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element7.childNodes;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element7.appendElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements13 = element7.getElementsByTag("hi!");
        org.jsoup.nodes.Element element15 = element7.tagName("hi!");
        org.jsoup.nodes.Element element17 = element7.appendElement("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element19 = element17.val("<hi! hi!=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element21 = element19.prependText("<hi!> &lt;hi! class=\"\"&gt;&lt;/hi!&gt; </hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element23 = element21.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.nodes.Node node7 = element1.clearAttributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = element1.dataset();
        org.jsoup.nodes.Element element10 = element1.val("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements11 = element10.siblingElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element10.getElementsByAttributeStarting("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        java.lang.String str9 = element8.outerHtml();
        org.jsoup.nodes.Node node11 = element8.removeAttr("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element14 = element13.nextElementSibling();
        org.jsoup.nodes.Attributes attributes15 = element13.attributes();
        org.jsoup.nodes.Element element17 = element13.text("");
        int int18 = element13.siblingIndex();
        org.jsoup.nodes.Element element20 = element13.text("hi!");
        org.jsoup.select.Elements elements22 = element20.getElementsMatchingText("");
        element20.doSetBaseUri("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element27 = element20.attr("hi!", true);
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements31 = element29.getElementsByClass("hi!");
        org.jsoup.nodes.Element element33 = element29.html("");
        org.jsoup.nodes.Element element34 = element33.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = element33.siblingNodes();
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements39 = element37.getElementsByClass("hi!");
        org.jsoup.nodes.Element element41 = element37.html("");
        org.jsoup.nodes.Element element43 = element37.toggleClass("");
        java.lang.String str44 = element43.text();
        java.lang.String str45 = element43.id();
        org.jsoup.nodes.Element element46 = element33.doClone((org.jsoup.nodes.Node) element43);
        org.jsoup.nodes.Node node47 = element43.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList48 = element43.childNodes();
        boolean boolean49 = element27.equals((java.lang.Object) nodeList48);
        org.jsoup.nodes.Element element50 = element8.appendChild((org.jsoup.nodes.Node) element27);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = element8.is("<hi! value=\"hi!\">\n hi!\n</hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! value=\"hi!\">? hi!?</hi!>': unexpected token at '<hi! value=\"hi!\">? hi!?</hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str9, "<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNull(element34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(element50);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element6 = element5.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element5.siblingNodes();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsByClass("hi!");
        org.jsoup.nodes.Element element13 = element9.html("");
        org.jsoup.nodes.Element element15 = element9.toggleClass("");
        java.lang.String str16 = element15.text();
        java.lang.String str17 = element15.id();
        org.jsoup.nodes.Element element18 = element5.doClone((org.jsoup.nodes.Node) element15);
        element15.doSetBaseUri("hi!");
        org.jsoup.nodes.Element element21 = element15.shallowClone();
        org.jsoup.select.Elements elements23 = element15.getElementsByClass("<hi! value=\"hi!\">\n hi!\n</hi!>");
        org.jsoup.parser.Tag tag24 = element15.tag();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(tag24);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.nodes.Element element4 = element1.empty();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = element1.textNodes();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsByClass("hi!");
        org.jsoup.nodes.Element element12 = element8.html("");
        java.lang.String str13 = element12.val();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element15.childNodes();
        org.jsoup.nodes.Element element17 = element12.appendTo(element15);
        org.jsoup.select.Elements elements19 = element15.getElementsByTag("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element20 = element1.insertChildren((int) (short) -1, (java.util.Collection<org.jsoup.nodes.Element>) elements19);
        boolean boolean22 = element20.hasClass("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.nodes.Element element8 = element1.empty();
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        element12.setBaseUri("hi!");
        org.jsoup.select.Elements elements16 = element12.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element18 = element12.toggleClass("<hi!>\n hi!\n</hi!>");
        element18.setBaseUri("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element21 = element8.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.parser.Tag tag22 = element18.tag();
        java.lang.String str23 = element18.html();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.tagName();
        org.jsoup.select.Elements elements12 = element1.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.nodes.Element element14 = element1.text("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements18 = element16.getElementsByClass("hi!");
        org.jsoup.nodes.Element element20 = element16.html("");
        org.jsoup.nodes.Element element21 = element1.doClone((org.jsoup.nodes.Node) element20);
        int int22 = element21.childNodeSize();
        org.jsoup.nodes.Element element23 = element21.lastElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = element21.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNull(element23);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.tagName();
        org.jsoup.select.Elements elements12 = element1.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.select.Elements elements13 = element1.parents();
        org.jsoup.select.Elements elements14 = element1.parents();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element1.after("<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;\n</<hi!></hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = element1.childNodes();
        org.jsoup.select.Elements elements5 = element1.getElementsByAttributeValue("<hi!></hi!>", "hi!");
        org.jsoup.select.Elements elements6 = element1.getAllElements();
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.appendElement("<hi!></hi!>");
        java.lang.String[] strArray15 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element20 = element18.val("<hi!>\n <hi!></hi!>\n</hi!>");
        java.lang.String str21 = element20.baseUri();
        element20.setBaseUri("hi!");
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        // The following exception was thrown during execution in test generation
        try {
            element20.outerHtmlHead(appendable24, 100, outputSettings26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.appendElement("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = null;
        element8.childNodes = nodeList12;
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        java.lang.String str4 = element1.toString();
        java.lang.String str5 = element1.id();
        org.jsoup.select.Elements elements7 = element1.getElementsByIndexGreaterThan((int) (short) 10);
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.nextElementSibling();
        org.jsoup.nodes.Attributes attributes11 = element9.attributes();
        org.jsoup.nodes.Element element13 = element9.text("");
        int int14 = element9.siblingIndex();
        org.jsoup.nodes.Element element16 = element9.text("hi!");
        boolean boolean17 = element9.hasParent();
        java.lang.String str18 = element9.cssSelector();
        org.jsoup.select.Elements elements21 = element9.getElementsByAttributeValueMatching("<hi! class=\"\"></hi!>", "<hi!></hi!>");
        org.jsoup.select.Elements elements24 = element9.getElementsByAttributeValue("<hi!></hi!>", "<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element25 = element1.appendChild((org.jsoup.nodes.Node) element9);
        java.util.regex.Pattern pattern26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements27 = element25.getElementsMatchingText(pattern26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        java.lang.String str4 = element1.toString();
        java.lang.String str5 = element1.id();
        org.jsoup.select.Elements elements7 = element1.getElementsByIndexGreaterThan((int) (short) 10);
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.nextElementSibling();
        org.jsoup.nodes.Attributes attributes11 = element9.attributes();
        org.jsoup.nodes.Element element13 = element9.text("");
        int int14 = element9.siblingIndex();
        org.jsoup.nodes.Element element16 = element9.text("hi!");
        boolean boolean17 = element9.hasParent();
        org.jsoup.nodes.Node node18 = element9.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element1.prependChild(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.tagName();
        org.jsoup.select.Elements elements12 = element1.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.nodes.Element element14 = element1.text("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements18 = element16.getElementsByClass("hi!");
        org.jsoup.nodes.Element element20 = element16.html("");
        org.jsoup.nodes.Element element21 = element1.doClone((org.jsoup.nodes.Node) element20);
        org.jsoup.nodes.Element element23 = element20.removeClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = element20.selectFirst("<hi!>\n hi!\n</hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!>? hi!?</hi!>': unexpected token at '<hi!>? hi!?</hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        element1.nodelistChanged();
        boolean boolean8 = element1.equals((java.lang.Object) (byte) -1);
        org.jsoup.nodes.Element element10 = element1.prependElement("<hi! value=\"hi!\">\n hi!\n</hi!>");
        org.jsoup.select.Elements elements11 = element1.parents();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("", "hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements12 = element10.getElementsByClass("hi!");
        org.jsoup.nodes.Element element14 = element10.html("");
        org.jsoup.nodes.Element element15 = element14.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element14.siblingNodes();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements20 = element18.getElementsByClass("hi!");
        org.jsoup.nodes.Element element22 = element18.html("");
        org.jsoup.nodes.Element element24 = element18.toggleClass("");
        java.lang.String str25 = element24.text();
        java.lang.String str26 = element24.id();
        org.jsoup.nodes.Element element27 = element14.doClone((org.jsoup.nodes.Node) element24);
        element24.doSetBaseUri("hi!");
        org.jsoup.nodes.Element element30 = element1.prependChild((org.jsoup.nodes.Node) element24);
        org.jsoup.nodes.Element element32 = element30.addClass("<hi!></hi!>");
        org.jsoup.nodes.Element element35 = element32.attr("", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element37 = element35.addClass("<hi! value=\"hi!\">\n hi!\n</hi!>");
        element35.setBaseUri("<hi! hi!=\"<hi!></hi!>\"></hi!>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element8.childNodesCopy();
        org.jsoup.select.Elements elements13 = element8.getElementsByIndexLessThan((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            element8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        java.lang.String str9 = element8.outerHtml();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList10 = element8.dataNodes();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str9, "<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(dataNodeList10);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements13 = element7.getElementsByTag("hi!");
        org.jsoup.select.Evaluator evaluator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = element7.is(evaluator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.appendElement("<hi!></hi!>");
        java.lang.String[] strArray15 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element20 = element18.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element22 = element20.text("");
        org.jsoup.nodes.Element element24 = element20.appendText("<hi!></hi!>");
        boolean boolean25 = element24.hasParent();
        java.util.regex.Pattern pattern27 = null;
        org.jsoup.select.Elements elements28 = element24.getElementsByAttributeValueMatching("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>", pattern27);
        element24.doSetBaseUri("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element32 = element24.prependText("<hi! class=\"\"></hi!>");
        java.lang.String str33 = element24.html();
        org.jsoup.nodes.Node node35 = element24.childNode(0);
        java.lang.Class<?> wildcardClass36 = node35.getClass();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "&lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;" + "'", str33, "&lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element9 = element6.appendText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element6.siblingNodes();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements14 = element12.getElementsByClass("hi!");
        org.jsoup.select.Elements elements15 = element12.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element12.childNodesCopy();
        java.util.Set<java.lang.String> strSet17 = element12.classNames();
        org.jsoup.nodes.Element element18 = element6.classNames(strSet17);
        org.jsoup.nodes.Element element20 = element6.tagName("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element23 = element22.nextElementSibling();
        org.jsoup.nodes.Element element26 = element22.attr("", "");
        java.lang.String str27 = element22.id();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements31 = element29.getElementsByClass("hi!");
        org.jsoup.nodes.Element element33 = element29.html("");
        org.jsoup.nodes.Element element35 = element29.toggleClass("");
        java.lang.String str36 = element35.text();
        org.jsoup.select.Elements elements39 = element35.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements43 = element41.getElementsByClass("hi!");
        org.jsoup.nodes.Element element45 = element41.html("");
        org.jsoup.nodes.Element element47 = element41.toggleClass("");
        java.util.List<org.jsoup.nodes.Node> nodeList48 = element47.childNodes;
        element35.childNodes = nodeList48;
        element22.childNodes = nodeList48;
        java.util.List<org.jsoup.nodes.Node> nodeList51 = element22.childNodes();
        element20.childNodes = nodeList51;
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(element23);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertNotNull(nodeList51);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.lang.String str8 = element7.text();
        org.jsoup.select.Elements elements11 = element7.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Element element12 = element7.clone();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements16 = element14.getElementsByClass("hi!");
        org.jsoup.nodes.Element element18 = element14.html("");
        org.jsoup.nodes.Element element20 = element14.toggleClass("");
        org.jsoup.nodes.Node node21 = element20.previousSibling();
        boolean boolean22 = element12.equals((java.lang.Object) element20);
        int int23 = element12.siblingIndex();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        element8.doSetBaseUri("<hi!>\n <hi!></hi!>\n</hi!>");
        boolean boolean14 = element8.hasClass("hi!");
        org.jsoup.nodes.Element element16 = element8.val("hi!");
        org.jsoup.select.Elements elements18 = element8.getElementsByClass("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;");
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements22 = element20.getElementsByClass("hi!");
        java.lang.String str23 = element20.toString();
        org.jsoup.parser.Tag tag24 = element20.tag();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag24, "<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element27 = element26.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            element8.replaceWith((org.jsoup.nodes.Node) element26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<hi!></hi!>" + "'", str23, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        int int7 = element1.childNodeSize();
        java.lang.String str8 = element1.nodeName();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements12 = element10.getElementsByClass("hi!");
        org.jsoup.select.Elements elements13 = element10.getAllElements();
        boolean boolean14 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element10);
        org.jsoup.nodes.Element element17 = element10.attr("", "hi!");
        java.lang.String str18 = element17.html();
        org.jsoup.nodes.Element element20 = element17.appendElement("<hi!></hi!>");
        java.lang.String[] strArray24 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        org.jsoup.nodes.Element element27 = element20.classNames((java.util.Set<java.lang.String>) strSet25);
        org.jsoup.nodes.Element element29 = element27.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element31 = element29.text("");
        org.jsoup.nodes.Element element33 = element31.append("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element37 = element36.nextElementSibling();
        boolean boolean38 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element36);
        int int39 = element36.siblingIndex();
        org.jsoup.nodes.Element element42 = element36.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements44 = element42.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements46 = element42.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element47 = element33.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements46);
        org.jsoup.nodes.Element element49 = element47.prependText("");
        java.util.List<org.jsoup.nodes.Node> nodeList50 = element47.siblingNodes();
        org.jsoup.nodes.Element element51 = element1.prependChild((org.jsoup.nodes.Node) element47);
        java.lang.Appendable appendable52 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = null;
        // The following exception was thrown during execution in test generation
        try {
            element1.outerHtmlTail(appendable52, (int) (byte) -1, outputSettings54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNull(element37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(element51);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        java.lang.String str6 = element5.val();
        java.lang.String str7 = element5.toString();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsByClass("hi!");
        org.jsoup.select.Elements elements12 = element9.getAllElements();
        boolean boolean13 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element9);
        org.jsoup.nodes.Element element16 = element9.attr("", "hi!");
        java.lang.String str17 = element16.html();
        org.jsoup.nodes.Element element19 = element16.appendElement("<hi!></hi!>");
        java.lang.String[] strArray23 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.jsoup.nodes.Element element26 = element19.classNames((java.util.Set<java.lang.String>) strSet24);
        org.jsoup.nodes.Element element28 = element26.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element30 = element28.text("");
        org.jsoup.nodes.Element element32 = element30.append("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element36 = element35.nextElementSibling();
        boolean boolean37 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element35);
        int int38 = element35.siblingIndex();
        org.jsoup.nodes.Element element41 = element35.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements43 = element41.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements45 = element41.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element46 = element32.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements45);
        boolean boolean47 = element5.equals((java.lang.Object) element32);
        org.jsoup.nodes.Element element49 = element5.html("<hi!> &lt;hi! class=\"\"&gt;&lt;/hi!&gt; </hi!>");
        org.jsoup.select.Elements elements51 = element49.getElementsByTag("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<hi!></hi!>" + "'", str7, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNull(element36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(elements51);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList4 = element1.textNodes();
        org.jsoup.nodes.Element element6 = element1.getElementById("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element1.attr("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>", false);
        org.jsoup.nodes.Element element10 = element1.previousElementSibling();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(textNodeList4);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.nodes.Element element8 = element1.prepend("<hi!>\n hi!\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = element1.is("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!></hi!>': unexpected token at '<hi!></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.siblingElements();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsByClass("hi!");
        org.jsoup.select.Elements elements11 = element8.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element8.childNodesCopy();
        java.util.Set<java.lang.String> strSet13 = element8.classNames();
        org.jsoup.nodes.Element element14 = element1.classNames(strSet13);
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element17 = element16.nextElementSibling();
        org.jsoup.nodes.Attributes attributes18 = element16.attributes();
        org.jsoup.nodes.Element element20 = element16.text("");
        int int21 = element16.siblingIndex();
        org.jsoup.nodes.Element element23 = element16.text("hi!");
        org.jsoup.select.Elements elements25 = element23.getElementsMatchingText("");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = element23.childNodesCopy();
        org.jsoup.nodes.Node node27 = element23.clearAttributes();
        org.jsoup.nodes.Element element28 = element1.doClone(node27);
        org.jsoup.nodes.Element element30 = element1.tagName("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = element1.is("&lt;hi!&gt;&lt;/hi!&gt;");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '&lt;hi!&gt;&lt;/hi!&gt;': unexpected token at '&lt;hi!&gt;&lt;/hi!&gt;'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element8.nextElementSibling();
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element8);
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.parent();
        org.jsoup.nodes.Node node14 = element12.parentNode();
        org.jsoup.select.Elements elements16 = element12.getElementsByIndexLessThan(1);
        boolean boolean17 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element12);
        org.jsoup.select.Elements elements18 = element12.children();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements22 = element20.getElementsByClass("hi!");
        org.jsoup.nodes.Element element24 = element20.html("");
        org.jsoup.nodes.Element element25 = element24.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = element24.siblingNodes();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element29 = element28.parent();
        org.jsoup.nodes.Node node30 = element28.parentNode();
        org.jsoup.select.Elements elements32 = element28.getElementsByIndexLessThan(1);
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element35 = element34.nextElementSibling();
        org.jsoup.nodes.Attributes attributes36 = element34.attributes();
        org.jsoup.nodes.Element element38 = element34.text("");
        int int39 = element34.siblingIndex();
        org.jsoup.nodes.Element element41 = element34.text("hi!");
        boolean boolean42 = element34.hasParent();
        java.lang.String str43 = element34.tagName();
        org.jsoup.nodes.Node[] nodeArray44 = new org.jsoup.nodes.Node[] { element8, element12, element24, element28, element34 };
        org.jsoup.nodes.Element element45 = element1.insertChildren((int) (short) 0, nodeArray44);
        org.jsoup.nodes.Element element46 = element1.shallowClone();
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements50 = element48.getElementsByClass("hi!");
        org.jsoup.select.Elements elements51 = element48.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList52 = element48.childNodesCopy();
        java.lang.String str53 = element48.outerHtml();
        org.jsoup.nodes.Element element54 = element48.shallowClone();
        java.lang.String str55 = element54.val();
        org.jsoup.nodes.Element element57 = element54.append("<hi! =\"\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element58 = element46.before((org.jsoup.nodes.Node) element54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(nodeArray44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "<hi!></hi!>" + "'", str53, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(element57);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.select.Elements elements7 = element1.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element1.getElementsByClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.parser.Tag tag5 = element1.tag();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList6 = element1.textNodes();
        org.jsoup.nodes.Element element8 = element1.getElementById("<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;\n</<hi!></hi!>>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(textNodeList6);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        boolean boolean7 = element6.hasText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element6.selectFirst("<hi! hi!=\"<hi!></hi!>\">\n &lt;hi! value=\"hi!\"&gt; hi! &lt;/hi!&gt;\n</hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! hi!=\"<hi!></hi!>\">? &lt;hi! value=\"hi!\"&gt; hi! &lt;/hi!&gt;?</hi!>': unexpected token at '<hi! hi!=\"<hi!></hi!>\">? &lt;hi! value=\"hi!\"&gt; hi! &lt;/hi!&gt;?</hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.select.Elements elements9 = element1.getElementsByAttributeValueMatching("", "<hi!></hi!>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements13 = element11.getElementsByClass("hi!");
        org.jsoup.nodes.Element element15 = element11.html("");
        org.jsoup.nodes.Element element16 = element15.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = element15.siblingNodes();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements21 = element19.getElementsByClass("hi!");
        org.jsoup.nodes.Element element23 = element19.html("");
        org.jsoup.nodes.Element element25 = element19.toggleClass("");
        java.lang.String str26 = element25.text();
        java.lang.String str27 = element25.id();
        org.jsoup.nodes.Element element28 = element15.doClone((org.jsoup.nodes.Node) element25);
        element25.doSetBaseUri("hi!");
        org.jsoup.nodes.Element element31 = element1.prependChild((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Node node32 = element25.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList33 = node32.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!> &lt;hi! class=\"\"&gt;&lt;/hi!&gt; </hi!>");
        java.lang.String str2 = element1.ownText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements4 = element1.select("<hi! hi!=\"<hi!></hi!>\">\n &lt;hi! value=\"hi!\"&gt; hi! &lt;/hi!&gt;\n</hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! hi!=\"<hi!></hi!>\">? &lt;hi! value=\"hi!\"&gt; hi! &lt;/hi!&gt;?</hi!>': unexpected token at '<hi! hi!=\"<hi!></hi!>\">? &lt;hi! value=\"hi!\"&gt; hi! &lt;/hi!&gt;?</hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element7.childNodes;
        org.jsoup.nodes.Element element10 = element7.prependText("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element7.before("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.appendElement("<hi!></hi!>");
        java.lang.String[] strArray15 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element20 = element18.val("<hi!>\n <hi!></hi!>\n</hi!>");
        java.lang.String str21 = element20.baseUri();
        java.lang.String str22 = element20.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = element20.selectFirst("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '&lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;': unexpected token at '&lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        element1.nodelistChanged();
        boolean boolean8 = element1.equals((java.lang.Object) (byte) -1);
        org.jsoup.select.Elements elements10 = element1.getElementsByIndexEquals((int) (byte) 10);
        org.jsoup.nodes.Document document11 = element1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList12 = document11.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.nodes.Element element9 = element7.html("&lt;hi!&gt;&lt;/hi!&gt;");
        java.util.regex.Pattern pattern10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element7.getElementsMatchingOwnText(pattern10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element1.childNodesCopy();
        org.jsoup.nodes.Element element7 = element1.removeClass("<hi! =\"hi!\">\n</hi!>");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        element10.setBaseUri("hi!");
        org.jsoup.select.Elements elements14 = element10.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element18 = element17.nextElementSibling();
        boolean boolean19 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element22 = element21.parent();
        org.jsoup.nodes.Node node23 = element21.parentNode();
        org.jsoup.select.Elements elements25 = element21.getElementsByIndexLessThan(1);
        boolean boolean26 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element21);
        org.jsoup.select.Elements elements27 = element21.children();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements31 = element29.getElementsByClass("hi!");
        org.jsoup.nodes.Element element33 = element29.html("");
        org.jsoup.nodes.Element element34 = element33.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = element33.siblingNodes();
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element38 = element37.parent();
        org.jsoup.nodes.Node node39 = element37.parentNode();
        org.jsoup.select.Elements elements41 = element37.getElementsByIndexLessThan(1);
        org.jsoup.nodes.Element element43 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element44 = element43.nextElementSibling();
        org.jsoup.nodes.Attributes attributes45 = element43.attributes();
        org.jsoup.nodes.Element element47 = element43.text("");
        int int48 = element43.siblingIndex();
        org.jsoup.nodes.Element element50 = element43.text("hi!");
        boolean boolean51 = element43.hasParent();
        java.lang.String str52 = element43.tagName();
        org.jsoup.nodes.Node[] nodeArray53 = new org.jsoup.nodes.Node[] { element17, element21, element33, element37, element43 };
        org.jsoup.nodes.Element element54 = element10.insertChildren((int) (short) 0, nodeArray53);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element55 = element1.insertChildren(10, nodeArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNull(element34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNull(element38);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNull(element44);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(nodeArray53);
        org.junit.Assert.assertNotNull(element54);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "hi!");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        org.jsoup.select.Elements elements14 = element12.getElementsContainingOwnText("hi!");
        java.lang.String str15 = element12.baseUri();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element18 = element17.nextElementSibling();
        boolean boolean19 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element17);
        int int20 = element17.siblingIndex();
        org.jsoup.nodes.Element element23 = element17.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements25 = element23.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements27 = element23.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements29 = element23.getElementsByTag("hi!");
        org.jsoup.nodes.Element element31 = element23.tagName("hi!");
        org.jsoup.nodes.Node node32 = element31.nextSibling();
        org.jsoup.nodes.Element element33 = element31.empty();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = element31.siblingNodes();
        element12.childNodes = nodeList34;
        java.lang.String str36 = element12.val();
        java.lang.String str37 = element12.html();
        java.lang.String str38 = element12.ownText();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<hi!></hi!>" + "'", str15, "<hi!></hi!>");
        org.junit.Assert.assertNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements13 = element7.getElementsByTag("hi!");
        org.jsoup.nodes.Element element15 = element7.tagName("hi!");
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element18 = element17.parent();
        org.jsoup.nodes.Node node19 = element17.parentNode();
        org.jsoup.select.Elements elements21 = element17.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element17.childNodes;
        org.jsoup.nodes.Element element24 = element17.prepend("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element25 = element15.prependChild((org.jsoup.nodes.Node) element24);
        org.jsoup.nodes.Element element27 = element25.append("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = element25.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(element18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        element1.nodelistChanged();
        boolean boolean8 = element1.equals((java.lang.Object) (byte) -1);
        org.jsoup.nodes.Element element10 = element1.prependElement("<hi! value=\"hi!\">\n hi!\n</hi!>");
        java.lang.String str11 = element1.className();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.appendElement("<hi!></hi!>");
        java.lang.String[] strArray15 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element20 = element18.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element22 = element20.text("");
        org.jsoup.nodes.Element element24 = element22.append("<hi! class=\"\"></hi!>");
        element24.setBaseUri("<hi! value=\"hi!\">\n hi!\n</hi!>");
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = element28.childNodes();
        org.jsoup.nodes.Element element30 = element24.after((org.jsoup.nodes.Node) element28);
        java.lang.Appendable appendable31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        // The following exception was thrown during execution in test generation
        try {
            element30.outerHtmlTail(appendable31, (int) (byte) 1, outputSettings33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(element30);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        java.lang.String str6 = element5.val();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element8.childNodes();
        org.jsoup.nodes.Element element10 = element5.appendTo(element8);
        org.jsoup.nodes.Element element12 = element10.html("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements14 = element10.getElementsContainingText("<hi!></hi!>");
        org.jsoup.nodes.Element element16 = element10.addClass("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements17 = element10.children();
        boolean boolean18 = element10.hasAttributes();
        org.jsoup.select.Elements elements21 = element10.getElementsByAttributeValue("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>", "<hi! hi!=\"<hi!></hi!>\">\n &lt;hi! value=\"hi!\"&gt; hi! &lt;/hi!&gt;\n</hi!>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "hi!");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        org.jsoup.select.Elements elements14 = element12.getElementsContainingOwnText("hi!");
        java.lang.String str15 = element12.baseUri();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element18 = element17.nextElementSibling();
        boolean boolean19 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element17);
        int int20 = element17.siblingIndex();
        org.jsoup.nodes.Element element23 = element17.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements25 = element23.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements27 = element23.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements29 = element23.getElementsByTag("hi!");
        org.jsoup.nodes.Element element31 = element23.tagName("hi!");
        org.jsoup.nodes.Node node32 = element31.nextSibling();
        org.jsoup.nodes.Element element33 = element31.empty();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = element31.siblingNodes();
        element12.childNodes = nodeList34;
        java.lang.String str36 = element12.val();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element39 = element38.nextElementSibling();
        boolean boolean40 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element38);
        element38.doSetBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            element12.replaceWith((org.jsoup.nodes.Node) element38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<hi!></hi!>" + "'", str15, "<hi!></hi!>");
        org.junit.Assert.assertNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(element39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element8.nextElementSibling();
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element8);
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.parent();
        org.jsoup.nodes.Node node14 = element12.parentNode();
        org.jsoup.select.Elements elements16 = element12.getElementsByIndexLessThan(1);
        boolean boolean17 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element12);
        org.jsoup.select.Elements elements18 = element12.children();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements22 = element20.getElementsByClass("hi!");
        org.jsoup.nodes.Element element24 = element20.html("");
        org.jsoup.nodes.Element element25 = element24.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = element24.siblingNodes();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element29 = element28.parent();
        org.jsoup.nodes.Node node30 = element28.parentNode();
        org.jsoup.select.Elements elements32 = element28.getElementsByIndexLessThan(1);
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element35 = element34.nextElementSibling();
        org.jsoup.nodes.Attributes attributes36 = element34.attributes();
        org.jsoup.nodes.Element element38 = element34.text("");
        int int39 = element34.siblingIndex();
        org.jsoup.nodes.Element element41 = element34.text("hi!");
        boolean boolean42 = element34.hasParent();
        java.lang.String str43 = element34.tagName();
        org.jsoup.nodes.Node[] nodeArray44 = new org.jsoup.nodes.Node[] { element8, element12, element24, element28, element34 };
        org.jsoup.nodes.Element element45 = element1.insertChildren((int) (short) 0, nodeArray44);
        org.jsoup.select.Elements elements47 = element1.getElementsByAttributeStarting("<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements50 = element1.getElementsByAttributeValueEnding("<hi!>\n hi!\n</hi!>", "<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        java.lang.String str51 = element1.className();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements55 = element53.getElementsByClass("hi!");
        org.jsoup.nodes.Element element57 = element53.html("");
        org.jsoup.nodes.Element element59 = element53.toggleClass("");
        org.jsoup.nodes.Element element60 = element59.nextElementSibling();
        org.jsoup.nodes.Element element61 = element1.prependChild((org.jsoup.nodes.Node) element59);
        boolean boolean62 = element61.hasParent();
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(nodeArray44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNull(element60);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.nodes.Node node7 = element1.clearAttributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = element1.dataset();
        org.jsoup.nodes.Element element10 = element1.val("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element12 = element10.text("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str15 = element14.nodeName();
        org.jsoup.nodes.Element element16 = element12.appendTo(element14);
        org.jsoup.nodes.Element element18 = element16.removeClass("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.select.Elements elements19 = element18.siblingElements();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements13 = element7.getElementsByTag("hi!");
        org.jsoup.nodes.Element element15 = element7.tagName("hi!");
        org.jsoup.nodes.Node node16 = element15.nextSibling();
        org.jsoup.nodes.Element element17 = element15.empty();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element15.siblingNodes();
        java.util.regex.Pattern pattern19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = element15.getElementsMatchingOwnText(pattern19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element1.childNodes;
        org.jsoup.nodes.Element element8 = element1.previousElementSibling();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        element1.doSetBaseUri("hi!");
        org.jsoup.nodes.Element element6 = element1.shallowClone();
        java.lang.String str7 = element1.nodeName();
        java.lang.String str8 = element1.tagName();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        java.lang.String str8 = element1.cssSelector();
        int int9 = element1.siblingIndex();
        org.jsoup.select.Evaluator evaluator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = element1.is(evaluator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements13 = element11.getElementsByClass("hi!");
        org.jsoup.nodes.Element element15 = element11.html("");
        org.jsoup.nodes.Element element17 = element11.toggleClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList18 = element11.textNodes();
        org.jsoup.nodes.Attributes attributes19 = element11.attributes();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag8, "<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>", attributes19);
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag8, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element25 = element24.nextElementSibling();
        org.jsoup.nodes.Attributes attributes26 = element24.attributes();
        org.jsoup.nodes.Element element28 = element24.text("");
        int int29 = element24.siblingIndex();
        org.jsoup.nodes.Element element31 = element24.text("hi!");
        boolean boolean32 = element24.hasParent();
        java.lang.String str33 = element24.tagName();
        org.jsoup.select.Elements elements35 = element24.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.nodes.Element element37 = element24.text("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements41 = element39.getElementsByClass("hi!");
        org.jsoup.nodes.Element element43 = element39.html("");
        org.jsoup.nodes.Element element44 = element24.doClone((org.jsoup.nodes.Node) element43);
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList45 = element24.dataNodes();
        org.jsoup.nodes.Element element46 = element22.appendTo(element24);
        java.util.regex.Pattern pattern47 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements48 = element46.getElementsMatchingOwnText(pattern47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(textNodeList18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(dataNodeList45);
        org.junit.Assert.assertNotNull(element46);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.nodes.Element element8 = element1.prepend("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements9 = element1.siblingElements();
        org.jsoup.nodes.Element element10 = element1.shallowClone();
        java.util.regex.Pattern pattern11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element10.getElementsMatchingOwnText(pattern11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.appendElement("<hi!></hi!>");
        java.lang.String[] strArray15 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element20 = element18.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element22 = element20.text("");
        org.jsoup.nodes.Element element24 = element22.append("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = element26.childNodes();
        element22.childNodes = nodeList27;
        java.lang.String str29 = element22.id();
        boolean boolean30 = element22.isBlock();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element32 = element22.child((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element7.childNodes;
        org.jsoup.nodes.Element element10 = element7.prependText("<hi!></hi!>");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexLessThan((-1));
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.appendElement("<hi!></hi!>");
        java.lang.String[] strArray15 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element20 = element18.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element22 = element20.text("");
        org.jsoup.nodes.Element element24 = element22.append("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element26 = element24.text("");
        org.jsoup.nodes.Element element28 = element26.html("<hi!></hi!>");
        org.jsoup.nodes.Element element30 = element26.appendText("<hi!> &lt;hi! class=\"\"&gt;&lt;/hi!&gt; </hi!>");
        org.jsoup.select.Elements elements33 = element26.getElementsByAttributeValueStarting("<hi! hi!=\"<hi!></hi!>\"></hi!>", "&lt;hi!&gt;&lt;/hi!&gt;");
        org.jsoup.select.Elements elements36 = element26.getElementsByAttributeValueEnding("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(elements36);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.tagName();
        org.jsoup.select.Elements elements12 = element1.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.select.Elements elements15 = element1.getElementsByAttributeValueStarting("<hi! =\"hi!\">\n</hi!>", "<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element16 = element1.shallowClone();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element19 = element18.nextElementSibling();
        boolean boolean20 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element18);
        int int21 = element18.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            element16.replaceWith((org.jsoup.nodes.Node) element18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        element8.doSetBaseUri("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element14 = element8.toggleClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element17 = element16.parent();
        org.jsoup.nodes.Node node18 = element16.parentNode();
        org.jsoup.select.Elements elements20 = element16.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList21 = element16.childNodes;
        org.jsoup.nodes.Element element23 = element16.removeClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Node node24 = element23.previousSibling();
        org.jsoup.parser.Tag tag25 = element23.tag();
        int int26 = element23.elementSiblingIndex();
        int int27 = element23.childNodeSize();
        boolean boolean29 = element23.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element30 = element8.before((org.jsoup.nodes.Node) element23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.select.Elements elements9 = element6.getElementsByIndexLessThan((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element6.getElementsByAttributeValue("", "<hi! class=\"<hi! class=&quot;&quot;></hi!> <hi! class=&quot;&quot;></hi!>\">\n hi!\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        java.lang.String str7 = element1.val();
        boolean boolean8 = element1.hasAttributes();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.nodes.Element element8 = element1.removeClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Node node9 = element8.previousSibling();
        org.jsoup.parser.Tag tag10 = element8.tag();
        int int11 = element8.elementSiblingIndex();
        int int12 = element8.childNodeSize();
        boolean boolean14 = element8.hasAttr("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList15 = element8.textNodes();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(textNodeList15);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.select.Elements elements7 = element1.getAllElements();
        boolean boolean8 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element10.nextElementSibling();
        org.jsoup.nodes.Attributes attributes12 = element10.attributes();
        org.jsoup.nodes.Element element14 = element10.text("");
        int int15 = element10.siblingIndex();
        org.jsoup.nodes.Element element17 = element10.text("hi!");
        org.jsoup.select.Elements elements19 = element17.getElementsMatchingText("");
        element17.doSetBaseUri("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements25 = element23.getElementsByClass("hi!");
        org.jsoup.nodes.Element element27 = element23.html("");
        org.jsoup.nodes.Element element29 = element23.toggleClass("");
        org.jsoup.parser.Tag tag30 = element29.tag();
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element(tag30, "hi!");
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag30, "<hi!></hi!>");
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements38 = element36.getElementsByClass("hi!");
        org.jsoup.select.Elements elements39 = element36.getAllElements();
        boolean boolean40 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element36);
        org.jsoup.select.Elements elements41 = element36.siblingElements();
        java.util.List<org.jsoup.nodes.Node> nodeList42 = element36.childNodes;
        boolean boolean43 = element34.equals((java.lang.Object) nodeList42);
        org.jsoup.nodes.Element element44 = element17.prependChild((org.jsoup.nodes.Node) element34);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element45 = element1.after((org.jsoup.nodes.Node) element17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(element44);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = element1.textNodes();
        org.jsoup.select.Elements elements3 = element1.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("<hi! =\"\"></hi!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.tagName();
        org.jsoup.nodes.Element element12 = element1.text("<hi!></hi!>");
        org.jsoup.select.Elements elements14 = element1.getElementsByAttributeStarting("<hi!></hi!>");
        org.jsoup.nodes.Element element16 = element1.getElementById("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element17 = element1.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = element17.attr("<hi!></hi!>", "<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;\n</<hi!></hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNull(element17);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("", "hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements12 = element10.getElementsByClass("hi!");
        org.jsoup.nodes.Element element14 = element10.html("");
        org.jsoup.nodes.Element element15 = element14.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element14.siblingNodes();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements20 = element18.getElementsByClass("hi!");
        org.jsoup.nodes.Element element22 = element18.html("");
        org.jsoup.nodes.Element element24 = element18.toggleClass("");
        java.lang.String str25 = element24.text();
        java.lang.String str26 = element24.id();
        org.jsoup.nodes.Element element27 = element14.doClone((org.jsoup.nodes.Node) element24);
        element24.doSetBaseUri("hi!");
        org.jsoup.nodes.Element element30 = element1.prependChild((org.jsoup.nodes.Node) element24);
        org.jsoup.nodes.Element element32 = element30.addClass("<hi!></hi!>");
        org.jsoup.nodes.Element element33 = element32.empty();
        java.util.regex.Pattern pattern35 = null;
        org.jsoup.select.Elements elements36 = element33.getElementsByAttributeValueMatching("", pattern35);
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements41 = element39.getElementsByClass("hi!");
        org.jsoup.nodes.Element element43 = element39.html("");
        org.jsoup.nodes.Element element44 = element43.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = element43.siblingNodes();
        org.jsoup.nodes.Element element47 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements49 = element47.getElementsByClass("hi!");
        org.jsoup.nodes.Element element51 = element47.html("");
        org.jsoup.nodes.Element element53 = element47.toggleClass("");
        java.lang.String str54 = element53.text();
        java.lang.String str55 = element53.id();
        org.jsoup.nodes.Element element56 = element43.doClone((org.jsoup.nodes.Node) element53);
        element53.doSetBaseUri("hi!");
        org.jsoup.nodes.Element element59 = element53.shallowClone();
        org.jsoup.select.Elements elements61 = element53.getElementsByClass("<hi! value=\"hi!\">\n hi!\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element62 = element33.insertChildren((int) (short) 10, (java.util.Collection<org.jsoup.nodes.Element>) elements61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNull(element44);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(elements61);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.parents();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element8.nextElementSibling();
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element8);
        int int11 = element8.siblingIndex();
        org.jsoup.nodes.Element element14 = element8.attr("hi!", "<hi!></hi!>");
        java.lang.String str15 = element8.cssSelector();
        boolean boolean17 = element8.hasClass("<hi!></hi!>");
        org.jsoup.nodes.Element element18 = element1.doClone((org.jsoup.nodes.Node) element8);
        org.jsoup.nodes.Node node19 = element8.root();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = element8.childNodes();
        org.jsoup.select.Elements elements21 = element8.siblingElements();
        org.jsoup.select.Elements elements22 = element8.getAllElements();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element9 = element6.appendText("<hi!></hi!>");
        java.lang.String str10 = element9.className();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element9.doClone((org.jsoup.nodes.Node) element12);
        org.jsoup.nodes.Attributes attributes14 = element12.attributes();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element17 = element16.nextElementSibling();
        org.jsoup.nodes.Attributes attributes18 = element16.attributes();
        org.jsoup.nodes.Element element20 = element16.text("");
        int int21 = element16.siblingIndex();
        org.jsoup.nodes.Element element23 = element16.text("hi!");
        boolean boolean24 = element16.hasParent();
        java.lang.String str25 = element16.data();
        org.jsoup.nodes.Element element26 = element16.shallowClone();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element29 = element28.nextElementSibling();
        org.jsoup.nodes.Attributes attributes30 = element28.attributes();
        java.lang.String str31 = element28.cssSelector();
        org.jsoup.nodes.Element element33 = element28.prependText("hi!");
        org.jsoup.nodes.Element element34 = element33.empty();
        org.jsoup.nodes.Element element36 = element33.appendText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList37 = element33.siblingNodes();
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements41 = element39.getElementsByClass("hi!");
        org.jsoup.select.Elements elements42 = element39.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = element39.childNodesCopy();
        java.util.Set<java.lang.String> strSet44 = element39.classNames();
        org.jsoup.nodes.Element element45 = element33.classNames(strSet44);
        org.jsoup.nodes.Element element46 = element16.classNames(strSet44);
        org.jsoup.nodes.Element element47 = element12.classNames(strSet44);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element49 = element47.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element47);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.nodeName();
        int int3 = element1.siblingIndex();
        org.jsoup.nodes.Element element5 = element1.prepend("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements7 = element1.getElementsByIndexEquals((int) (short) 100);
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str10 = element9.nodeName();
        int int11 = element9.siblingIndex();
        org.jsoup.nodes.Element element13 = element9.prepend("<hi!>\n <hi!></hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element1.before((org.jsoup.nodes.Node) element9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        element1.doSetBaseUri("hi!");
        org.jsoup.nodes.Element element6 = element1.shallowClone();
        java.lang.String str7 = element1.nodeName();
        org.jsoup.nodes.Element element9 = element1.getElementById("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element9.getElementsByTag("<&lt;hi!&gt;&lt;/hi!&gt;></&lt;hi!&gt;&lt;/hi!&gt;>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        org.jsoup.nodes.Element element11 = element8.appendElement("<hi!></hi!>");
        java.lang.String[] strArray15 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element20 = element18.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element22 = element20.text("");
        org.jsoup.nodes.Element element24 = element20.appendText("<hi!></hi!>");
        boolean boolean25 = element24.hasParent();
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        // The following exception was thrown during execution in test generation
        try {
            element24.outerHtmlTail(appendable26, (int) (short) 10, outputSettings28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }
}

