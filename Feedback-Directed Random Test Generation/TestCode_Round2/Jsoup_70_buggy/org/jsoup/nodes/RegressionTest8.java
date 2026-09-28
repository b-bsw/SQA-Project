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
        org.jsoup.nodes.Element element28 = element24.clone();
        org.jsoup.select.Elements elements30 = element28.getElementsByIndexEquals(1);
        element28.doSetBaseUri("< class=\" \" value=\" \"> <hi! class=\"\"></hi!><hi!></hi!> >");
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
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements30);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.nodes.Element element8 = element7.nextElementSibling();
        org.jsoup.nodes.Element element10 = element7.removeClass("<&lt;hi!&gt;&lt;/hi!&gt;></&lt;hi!&gt;&lt;/hi!&gt;>");
        org.jsoup.nodes.Element element12 = element10.appendElement("<hi! hi!=\"<hi!></hi!>\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element12.child((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
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
        org.jsoup.nodes.Attributes attributes26 = element24.attributes();
        org.jsoup.nodes.Element element28 = element24.text("");
        int int29 = element24.siblingIndex();
        org.jsoup.nodes.Element element31 = element24.text("hi!");
        org.jsoup.nodes.Element element32 = element15.prependChild((org.jsoup.nodes.Node) element31);
        java.lang.String str33 = element31.outerHtml();
        org.jsoup.nodes.Element element35 = element31.appendText("<hi! =\"hi!\">\n hi!\n</hi!>");
        org.jsoup.nodes.Element element37 = element35.prependElement("hi!");
        org.jsoup.select.Elements elements39 = element35.getElementsByAttributeStarting("<hi!></hi!><hi!> <hi!></hi!> </hi!>");
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
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str33, "<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements39);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.nodes.Element element8 = element1.prepend("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element11 = element8.attr("<hi!></hi!>", false);
        org.jsoup.nodes.Element element12 = element11.clone();
        org.jsoup.select.Elements elements14 = element11.getElementsContainingText("<hi! value=\"<hi!>\n <hi!></hi!>hi!\n</hi!>\"></hi!>");
        org.jsoup.nodes.Element element16 = element11.prependElement("<hi! hi!=\"<hi!></hi!>\">\n &lt;hi! value=\"hi!\"&gt; hi! &lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        element18.setBaseUri("hi!");
        org.jsoup.nodes.Element element21 = element18.empty();
        org.jsoup.select.Elements elements24 = element18.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element26 = element18.tagName("<hi! =\"hi!\">\n hi!\n</hi!>");
        org.jsoup.nodes.Element element27 = element11.appendTo(element18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = element27.cssSelector();
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!': unexpected token at '!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.select.Elements elements3 = element1.children();
        org.jsoup.nodes.Element element6 = element1.attr("<hi!> &lt;hi! class=\"\"&gt;&lt;/hi!&gt; </hi!>", true);
        org.jsoup.nodes.Node node7 = element1.parentNode();
        java.lang.String str8 = element1.data();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            element1.outerHtmlHead(appendable9, 100, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.nodes.Element element8 = element1.prepend("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element10 = element1.appendText("<hi!>\n hi!\n</hi!>");
        java.lang.String str11 = element10.cssSelector();
        org.jsoup.nodes.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element10.appendChild(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
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
        org.jsoup.select.Elements elements54 = element51.getElementsByAttributeValue("<<hi!>\n &lt;&lt;hi!&gt;&lt;/hi!&gt;&gt;\n <!--&lt;hi!&gt;&lt;/hi!&gt;-->\n</hi!>></<hi!>\n &lt;&lt;hi!&gt;&lt;/hi!&gt;&gt;\n <!--&lt;hi!&gt;&lt;/hi!&gt;-->\n</hi!>>", "<hi!></hi!>.<hi!></hi!>");
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
        org.junit.Assert.assertNotNull(elements54);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
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
        java.lang.String str29 = element28.nodeName();
        org.jsoup.nodes.Element element31 = element28.toggleClass("<hi! =\"hi!\">\n <<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n </<hi!></hi!>>\n <hi!> \n  <hi!></hi!>hi! \n </hi!>\n <hi!>\n   &lt;hi!&gt;&lt;/hi!&gt; \n  <hi!>\n    hi! \n  </hi!> \n </hi!>\n</hi!>");
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(element31);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
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
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element18 = element17.nextElementSibling();
        org.jsoup.nodes.Attributes attributes19 = element17.attributes();
        org.jsoup.nodes.Element element21 = element17.text("");
        int int22 = element17.siblingIndex();
        org.jsoup.nodes.Element element24 = element17.text("hi!");
        java.lang.String str25 = element24.outerHtml();
        org.jsoup.nodes.Element element27 = element24.appendText("");
        org.jsoup.nodes.Node node29 = element24.removeAttr("");
        org.jsoup.parser.Tag tag30 = element24.tag();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element34 = element33.nextElementSibling();
        org.jsoup.nodes.Attributes attributes35 = element33.attributes();
        org.jsoup.nodes.Element element37 = element33.text("");
        int int38 = element33.siblingIndex();
        org.jsoup.nodes.Element element40 = element33.text("hi!");
        org.jsoup.select.Elements elements42 = element40.getElementsMatchingText("");
        java.util.List<org.jsoup.nodes.Node> nodeList43 = element40.childNodesCopy();
        org.jsoup.select.Elements elements44 = element40.parents();
        org.jsoup.parser.Tag tag45 = element40.tag();
        org.jsoup.nodes.Element element47 = new org.jsoup.nodes.Element(tag45, "<hi!></hi!>");
        org.jsoup.nodes.Element element50 = new org.jsoup.nodes.Element("hi!");
        element50.setBaseUri("hi!");
        org.jsoup.select.Elements elements54 = element50.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Attributes attributes55 = element50.attributes();
        org.jsoup.nodes.Element element56 = new org.jsoup.nodes.Element(tag45, "<hi!>\n hi!\n</hi!>", attributes55);
        org.jsoup.nodes.Element element57 = new org.jsoup.nodes.Element(tag30, "<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>", attributes55);
        int int58 = element57.siblingIndex();
        org.jsoup.nodes.Element element59 = element1.doClone((org.jsoup.nodes.Node) element57);
        org.jsoup.nodes.Element element60 = element59.firstElementSibling();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNull(element18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str25, "<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNull(element34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertNotNull(attributes55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNull(element60);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        java.lang.String str6 = element5.val();
        org.jsoup.nodes.Element element8 = element5.prependElement("<hi! hi!=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements12 = element10.getElementsByClass("hi!");
        org.jsoup.select.Elements elements13 = element10.getAllElements();
        boolean boolean14 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element10);
        org.jsoup.select.Elements elements15 = element10.siblingElements();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements19 = element17.getElementsByClass("hi!");
        org.jsoup.select.Elements elements20 = element17.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = element17.childNodesCopy();
        java.util.Set<java.lang.String> strSet22 = element17.classNames();
        org.jsoup.nodes.Element element23 = element10.classNames(strSet22);
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element26 = element25.nextElementSibling();
        org.jsoup.nodes.Attributes attributes27 = element25.attributes();
        org.jsoup.nodes.Element element29 = element25.text("");
        int int30 = element25.siblingIndex();
        org.jsoup.nodes.Element element32 = element25.text("hi!");
        org.jsoup.select.Elements elements34 = element32.getElementsMatchingText("");
        java.util.List<org.jsoup.nodes.Node> nodeList35 = element32.childNodesCopy();
        org.jsoup.nodes.Node node36 = element32.clearAttributes();
        org.jsoup.nodes.Element element37 = element10.doClone(node36);
        org.jsoup.nodes.Element element39 = element10.tagName("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element40 = element5.appendChild((org.jsoup.nodes.Node) element10);
        int int41 = element40.siblingIndex();
        org.jsoup.nodes.Element element43 = element40.removeClass("<hi!>\n  &lt;hi!&gt;&lt;/hi!&gt; \n <hi!>\n   hi! \n </hi!> \n</hi!>");
        org.jsoup.nodes.Node node44 = element40.root();
        org.jsoup.nodes.Node node45 = node44.parentNode();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNull(element26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(node45);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        org.jsoup.nodes.Element element10 = element1.appendText("");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexLessThan((int) (short) 1);
        java.lang.String str13 = element10.toString();
        org.jsoup.select.Evaluator evaluator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = element10.is(evaluator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<hi! =\"hi!\">\n</hi!>" + "'", str13, "<hi! =\"hi!\">\n</hi!>");
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
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
        org.jsoup.select.Elements elements38 = element33.getElementsByAttributeStarting("<hi!> &lt;hi! class=\"\"&gt;&lt;/hi!&gt; </hi!>");
        org.jsoup.nodes.Element element41 = element33.attr("<hi! =\"hi!\">\n hi!\n</hi!>", true);
        org.jsoup.nodes.Element element44 = element33.attr("<&lt;hi!&gt;&lt;/hi!&gt;></&lt;hi!&gt;&lt;/hi!&gt;>", "&lt;hi!&gt; &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt; &lt;/hi!&gt;");
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
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element44);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.nodes.Node node7 = element1.clearAttributes();
        org.jsoup.nodes.Element element9 = element1.addClass("");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueContaining("<hi!></hi!>", "<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element15 = element9.attr("", false);
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element15.ensureChildNodes();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements20 = element18.getElementsByClass("hi!");
        org.jsoup.select.Elements elements23 = element18.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.nodes.Node node24 = element18.clearAttributes();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = element18.dataset();
        org.jsoup.nodes.Element element27 = element18.val("<hi!>\n hi!\n</hi!>");
        java.util.Set<java.lang.String> strSet28 = element27.classNames();
        org.jsoup.nodes.Element element29 = element15.classNames(strSet28);
        boolean boolean30 = element15.hasParent();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
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
        java.util.List<org.jsoup.nodes.Node> nodeList47 = element46.childNodes();
        org.jsoup.nodes.Element element49 = element46.html("<hi! class=\"\">\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element51 = element46.removeClass("<hi!> hi! </hi!> < class=\" \" value=\"\"> <hi! class=\"\"></hi!><hi!></hi!> >");
        java.lang.String str52 = element51.nodeName();
        org.jsoup.nodes.Element element54 = element51.val("<hi! class=\"\"></hi!>");
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
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(element54);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
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
        boolean boolean30 = element20.isBlock();
        java.util.regex.Pattern pattern32 = null;
        org.jsoup.select.Elements elements33 = element20.getElementsByAttributeValueMatching("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;", pattern32);
        org.jsoup.nodes.Node node34 = element20.parentNode();
        org.jsoup.select.Elements elements36 = element20.getElementsContainingOwnText("<hi!>\n  hi! \n</hi!>\n<hi!></hi!>");
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(elements36);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = element1.textNodes();
        org.jsoup.nodes.Attributes attributes9 = element1.attributes();
        org.jsoup.select.Elements elements11 = element1.getElementsContainingText("hi!");
        org.jsoup.select.Elements elements14 = element1.getElementsByAttributeValueNot("<hi! class=\"\"></hi!>", "<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element16 = element1.prepend("<hi! class=\"\"></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = element1.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element1.selectFirst("<hi! class=\"<hi!>\n hi!\n</hi!>\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"<hi!>? hi!?</hi!>\"></hi!>': unexpected token at '<hi! class=\"<hi!>? hi!?</hi!>\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(textNodeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
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
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag14, "<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;\n</<hi!></hi!>>");
        org.jsoup.nodes.Element element18 = element16.prependElement("<hi!>\n  &lt;hi! class=\"\"&gt;&lt;/hi!&gt; \n</hi!>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str9, "<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
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
        org.jsoup.nodes.Element element21 = element6.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements23 = element6.select("<hi! class=\"\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"\"></hi!>': unexpected token at '<hi! class=\"\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
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
        org.junit.Assert.assertNull(element21);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = element1.childNodes();
        org.jsoup.select.Elements elements5 = element1.getElementsByAttributeValue("<hi!></hi!>", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element8.nextElementSibling();
        org.jsoup.nodes.Attributes attributes10 = element8.attributes();
        java.lang.String str11 = element8.cssSelector();
        org.jsoup.nodes.Element element13 = element8.prependText("hi!");
        org.jsoup.nodes.Element element14 = element13.empty();
        java.lang.String str15 = element13.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element13.childNodesCopy();
        element1.childNodes = nodeList16;
        org.jsoup.select.Elements elements20 = element1.getElementsByAttributeValueEnding("<hi! =\"hi!\">\n</hi!>", "<hi!> &lt;hi! class=\"\"&gt;&lt;/hi!&gt; </hi!>");
        org.jsoup.nodes.Element element21 = element1.shallowClone();
        org.jsoup.select.Elements elements24 = element1.getElementsByAttributeValueEnding("<hi!>\n  &lt;hi! class=\"\"&gt;&lt;/hi!&gt; \n</hi!>", "<hi! =\"\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements26 = element1.getElementsByTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
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
        boolean boolean28 = element25.isBlock();
        org.jsoup.select.Elements elements30 = element25.getElementsContainingOwnText("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;");
        org.jsoup.select.Elements elements33 = element25.getElementsByAttributeValue("<hi!>\n <hi!></hi!>\n</hi!>", "<hi! =\"hi!\">\n</hi!>");
        org.jsoup.select.Elements elements35 = element25.getElementsByIndexGreaterThan(100);
        org.jsoup.nodes.Element element37 = element25.val("<hi! =\"\"></hi!>");
        org.jsoup.nodes.Element element39 = element25.prepend("<hi!>\n hi!\n</hi!>");
        int int40 = element25.childNodeSize();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
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
        java.lang.String str21 = element18.text();
        org.jsoup.select.Elements elements23 = element18.getElementsByAttribute("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.select.Elements elements25 = element18.getElementsByIndexEquals(100);
        org.jsoup.select.Elements elements27 = element18.getElementsMatchingText("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList28 = element18.dataNodes();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(dataNodeList28);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.select.Elements elements8 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element10.nextElementSibling();
        org.jsoup.nodes.Attributes attributes12 = element10.attributes();
        java.lang.String str13 = element10.cssSelector();
        org.jsoup.nodes.Element element15 = element10.prependText("hi!");
        org.jsoup.nodes.Element element16 = element15.empty();
        java.lang.String str17 = element15.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element15.childNodesCopy();
        element1.childNodes = nodeList18;
        org.jsoup.nodes.Element element21 = element1.append("<hi!>\n <hi!>\n  <hi!>\n    hi! \n  </hi!>\n </hi!>\n</hi!>");
        org.jsoup.select.Elements elements22 = element1.getAllElements();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.siblingElements();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element1.childNodes;
        java.lang.String str8 = element1.id();
        org.jsoup.nodes.Element element10 = element1.val("hi! hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = element10.dataset();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = element10.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
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
        java.util.Set<java.lang.String> strSet26 = element15.classNames();
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
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        java.lang.String str6 = element5.val();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element8.childNodes();
        org.jsoup.nodes.Element element10 = element5.appendTo(element8);
        org.jsoup.nodes.Element element12 = element10.html("<hi!>\n hi!\n</hi!>");
        java.lang.String str13 = element12.val();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = element21.is("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!></hi!>': unexpected token at '<hi!></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
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
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.select.Elements elements9 = element6.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Node node10 = element6.parentNode();
        org.jsoup.select.Elements elements11 = element6.children();
        org.jsoup.select.Elements elements12 = element6.parents();
        org.jsoup.select.Elements elements13 = element6.siblingElements();
        int int14 = element6.childNodeSize();
        int int15 = element6.childNodeSize();
        org.jsoup.nodes.Node node16 = element6.parentNode();
        java.util.regex.Pattern pattern17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements18 = element6.getElementsMatchingText(pattern17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
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
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag14, "");
        boolean boolean17 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element16);
        int int18 = element16.siblingIndex();
        org.jsoup.nodes.Element element19 = element16.parent();
        boolean boolean21 = element16.hasAttr("");
        org.jsoup.select.Elements elements23 = element16.getElementsByAttribute("<hi!>\n <<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n  <hi! class=\"\"></hi!>\n </<hi!></hi!>>\n</hi!>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str9, "<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        org.jsoup.nodes.Element element10 = element1.appendText("");
        element10.nodelistChanged();
        org.jsoup.select.Elements elements13 = element10.getElementsByAttribute("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;");
        org.jsoup.nodes.Element element15 = element10.removeClass("<hi!>\n <hi!>\n  <hi!>\n    hi! \n  </hi!>\n </hi!>\n</hi!>");
        java.lang.String str16 = element15.baseUri();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
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
        java.lang.String str26 = element15.text();
        java.lang.String str27 = element15.val();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element("<hi! =\"\"></hi!>");
        org.jsoup.nodes.Element element30 = element15.doClone((org.jsoup.nodes.Node) element29);
        boolean boolean32 = element29.hasClass("<hi!>\n <hi!>\n  <hi!>\n    hi! \n  </hi!>\n </hi!>\n</hi!>");
        org.jsoup.select.Elements elements34 = element29.getElementsByClass("<hi!> \n <hi!></hi!> \n</hi!>");
        org.jsoup.select.Elements elements35 = element29.getAllElements();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elements35);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "hi!");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        java.lang.String str13 = element12.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element12.childNodes;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element12.after("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<hi!></hi!>" + "'", str13, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element7 = element1.toggleClass("<hi!>\n hi!\n</hi!>");
        element7.setBaseUri("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Document document10 = element7.ownerDocument();
        org.jsoup.nodes.Element element11 = element7.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element7.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element7.childNodes;
        java.util.regex.Pattern pattern15 = null;
        org.jsoup.select.Elements elements16 = element7.getElementsByAttributeValueMatching("<hi!> &lt;hi! class=\"\"&gt;&lt;/hi!&gt; </hi!>", pattern15);
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element19 = element18.nextElementSibling();
        org.jsoup.nodes.Attributes attributes20 = element18.attributes();
        org.jsoup.nodes.Element element22 = element18.text("");
        int int23 = element18.siblingIndex();
        org.jsoup.nodes.Element element25 = element18.text("hi!");
        boolean boolean26 = element18.hasParent();
        java.lang.String str27 = element18.tagName();
        org.jsoup.select.Elements elements29 = element18.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.nodes.Element element31 = element18.text("<hi! class=\"\"></hi!>");
        java.lang.String str32 = element18.data();
        java.util.regex.Pattern pattern34 = null;
        org.jsoup.select.Elements elements35 = element18.getElementsByAttributeValueMatching("<hi! class=\"\"></hi!>", pattern34);
        element18.setBaseUri("");
        org.jsoup.nodes.Element element39 = element18.removeClass("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element40 = element39.previousElementSibling();
        org.jsoup.nodes.Element element41 = element7.doClone((org.jsoup.nodes.Node) element39);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNull(element40);
        org.junit.Assert.assertNotNull(element41);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
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
        org.jsoup.select.Elements elements33 = element25.getElementsMatchingOwnText("<hi!>\n <hi!></hi!>\n</hi!>");
        boolean boolean35 = element25.hasClass("<hi! class=\"<hi!>\n hi!\n</hi!>\"></hi!>");
        element25.nodelistChanged();
        java.util.regex.Pattern pattern38 = null;
        org.jsoup.select.Elements elements39 = element25.getElementsByAttributeValueMatching("<hi! =\"hi!\">\n <<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n </<hi!></hi!>>\n <hi!> \n  <hi!></hi!>hi! \n </hi!>\n <hi!>\n   &lt;hi!&gt;&lt;/hi!&gt; \n  <hi!>\n    hi! \n  </hi!> \n </hi!>\n</hi!>", pattern38);
        org.jsoup.nodes.Element element40 = element25.shallowClone();
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
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element40);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.siblingElements();
        org.jsoup.select.Elements elements7 = element1.getAllElements();
        org.jsoup.select.Elements elements9 = element1.getElementsMatchingOwnText("");
        boolean boolean11 = element1.hasAttr("");
        java.lang.String str12 = element1.data();
        java.lang.String str14 = element1.absUrl("<hi!>\n hi!\n</hi!>");
        java.lang.String str15 = element1.className();
        boolean boolean16 = element1.hasText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element1.before("<<hi!></hi!> class=\"<hi!></hi!>\" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n</<hi!></hi!>>");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList4 = element1.textNodes();
        org.jsoup.nodes.Element element6 = element1.getElementById("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element1.attr("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>", false);
        org.jsoup.select.Elements elements11 = element1.getElementsContainingText("<hi! class=\"<hi! hi!=&quot;<hi!></hi!>&quot;></hi!>\">\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(textNodeList4);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        java.lang.String str8 = element6.nodeName();
        org.jsoup.nodes.Node node9 = element6.root();
        org.jsoup.nodes.Document document10 = element6.ownerDocument();
        org.jsoup.select.Elements elements12 = element6.getElementsMatchingText("<hi!> \n <hi!></hi!> \n</hi!>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
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
        org.jsoup.nodes.Element element34 = element30.appendElement("<hi!></hi!>");
        org.jsoup.nodes.Element element36 = element34.val("<hi! class=\"<hi! class=&quot;&quot;></hi!> <hi! class=&quot;&quot;></hi!>\">\n hi!\n</hi!>");
        org.jsoup.nodes.Element element37 = element36.lastElementSibling();
        java.lang.String str39 = element36.attr("<hi! value=\"<hi!>\n <hi!></hi!>hi!\n</hi!>\"></hi!>");
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
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
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
        org.jsoup.select.Elements elements18 = element8.getElementsByIndexEquals(1);
        org.jsoup.select.Elements elements21 = element8.getElementsByAttributeValueContaining("<hi!>\n <hi!></hi!>\n</hi!>", "<hi! value=\"hi!\">\n hi!\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = element8.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
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
        java.lang.String str23 = element15.absUrl("<hi!>\n</hi!>");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.siblingElements();
        org.jsoup.select.Elements elements7 = element1.getAllElements();
        org.jsoup.nodes.Element element9 = element1.prepend("<hi!>\n hi!\n</hi!>");
        java.lang.String str10 = element9.baseUri();
        org.jsoup.select.Elements elements11 = element9.parents();
        element9.nodelistChanged();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element9.childNodes();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element17 = element16.parent();
        org.jsoup.nodes.Node node18 = element16.parentNode();
        org.jsoup.select.Elements elements20 = element16.getElementsByIndexLessThan(1);
        element16.nodelistChanged();
        boolean boolean22 = element14.hasSameValue((java.lang.Object) element16);
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        java.lang.String str25 = element24.text();
        org.jsoup.nodes.Element element26 = element24.shallowClone();
        org.jsoup.nodes.Element element28 = element26.prependElement("<hi! class=\"\">\n <hi!>\n  hi!\n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element29 = element14.doClone((org.jsoup.nodes.Node) element26);
        org.jsoup.nodes.Element element31 = element26.prependText("<hi! hi!=\"<hi!></hi!>\" value=\"<hi!></hi!>.<hi!></hi!>\">\n <hi!>\n  <hi!>\n    hi! \n  </hi!>\n </hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.tagName();
        org.jsoup.nodes.Element element12 = element1.text("<hi!></hi!>");
        java.lang.String str13 = element1.html();
        org.jsoup.nodes.Node node14 = null;
        org.jsoup.nodes.Element element15 = element1.doClone(node14);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "&lt;hi!&gt;&lt;/hi!&gt;" + "'", str13, "&lt;hi!&gt;&lt;/hi!&gt;");
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.lang.String str8 = element7.text();
        org.jsoup.select.Elements elements11 = element7.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi!></hi!>");
        java.lang.String str12 = element7.toString();
        java.lang.String str14 = element7.attr("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements16 = element7.getElementsByIndexEquals((int) 'a');
        org.jsoup.parser.Tag tag17 = element7.tag();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element21 = element20.parent();
        org.jsoup.nodes.Node node22 = element20.parentNode();
        org.jsoup.select.Elements elements24 = element20.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList25 = element20.childNodes;
        org.jsoup.nodes.Element element27 = element20.prepend("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements28 = element20.siblingElements();
        org.jsoup.nodes.Attributes attributes29 = element20.attributes();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element(tag17, "<hi! hi!=\"<hi!></hi!>\">\n &lt;hi! value=\"hi!\"&gt; hi! &lt;/hi!&gt;\n</hi!>", attributes29);
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element(tag17, "");
        org.jsoup.select.Elements elements34 = element32.getElementsByAttributeStarting("<hi! =\"\"></hi!>");
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements38 = element36.getElementsByClass("hi!");
        org.jsoup.select.Elements elements39 = element36.getAllElements();
        boolean boolean40 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element36);
        org.jsoup.select.Elements elements41 = element36.siblingElements();
        org.jsoup.select.Elements elements42 = element36.getAllElements();
        org.jsoup.select.Elements elements44 = element36.getElementsMatchingOwnText("");
        org.jsoup.nodes.Element element46 = element36.val("");
        java.lang.String str48 = element36.absUrl("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element49 = element32.appendTo(element36);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList50 = element49.textNodes();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str12, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(textNodeList50);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
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
        org.jsoup.nodes.Element element15 = element14.nextElementSibling();
        boolean boolean16 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element14);
        int int17 = element14.siblingIndex();
        org.jsoup.nodes.Element element20 = element14.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements22 = element20.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements24 = element20.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements26 = element20.getElementsByTag("hi!");
        org.jsoup.nodes.Element element28 = element20.tagName("hi!");
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element31 = element30.parent();
        org.jsoup.nodes.Node node32 = element30.parentNode();
        org.jsoup.select.Elements elements34 = element30.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList35 = element30.childNodes;
        org.jsoup.nodes.Element element37 = element30.prepend("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element38 = element28.prependChild((org.jsoup.nodes.Node) element37);
        java.lang.String str39 = element28.text();
        java.util.List<org.jsoup.nodes.Node> nodeList40 = element28.childNodes();
        element1.childNodes = nodeList40;
        org.jsoup.select.Elements elements44 = element1.getElementsByAttributeValue("<&lt;hi!&gt;&lt;/hi!&gt;></&lt;hi!&gt;&lt;/hi!&gt;>", "hi!");
        org.jsoup.nodes.Element element46 = element1.val("<hi! =\"\"></hi!>");
        boolean boolean48 = element46.hasClass("<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n <<hi!>\n hi!\n</hi!>></<hi!>\n hi!\n</hi!>>\n <hi! class=\"\"></hi!>\n</<hi!></hi!>>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNull(element31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
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
        org.jsoup.nodes.Element element28 = element24.clone();
        boolean boolean29 = element28.hasParent();
        org.jsoup.nodes.Element element31 = element28.prependText("<hi! =\"\"></hi!>");
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
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(element31);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
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
        org.jsoup.nodes.Element element48 = element46.toggleClass("<hi! class=\"<hi! class=&quot;&quot;></hi!> <hi! class=&quot;&quot;></hi!>\">\n hi!\n</hi!>");
        java.lang.String str49 = element46.toString();
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
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "<hi! class=\"<hi! class=&quot;<hi! class=&amp;quot;&amp;quot;></hi!> <hi! class=&amp;quot;&amp;quot;></hi!>&quot;>\n hi!\n</hi!>\"></hi!>" + "'", str49, "<hi! class=\"<hi! class=&quot;<hi! class=&amp;quot;&amp;quot;></hi!> <hi! class=&amp;quot;&amp;quot;></hi!>&quot;>\n hi!\n</hi!>\"></hi!>");
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
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
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element17 = element16.parent();
        org.jsoup.nodes.Node node18 = element16.parentNode();
        org.jsoup.select.Elements elements20 = element16.getElementsByIndexLessThan(1);
        boolean boolean21 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element16);
        org.jsoup.select.Elements elements23 = element16.getElementsContainingOwnText("<hi!>\n <hi!></hi!>\n</hi!>");
        boolean boolean24 = element16.hasParent();
        org.jsoup.nodes.Node node26 = element16.removeAttr("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Attributes attributes27 = element16.attributes();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag13, "<&lt;hi!&gt;&lt;/hi!&gt;></&lt;hi!&gt;&lt;/hi!&gt;>", attributes27);
        java.lang.String str29 = element28.ownText();
        org.jsoup.nodes.Element element31 = element28.appendText("<hi!>\n  &lt;hi! class=\"\"&gt;&lt;/hi!&gt; \n</hi!>");
        org.jsoup.select.Elements elements33 = element28.getElementsMatchingOwnText("<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;\n</<hi!></hi!>>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(elements33);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.lang.String str8 = element1.html();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList9 = element1.dataNodes();
        java.lang.String str11 = element1.absUrl("hi!");
        org.jsoup.select.Elements elements13 = element1.getElementsByIndexGreaterThan((int) (byte) -1);
        boolean boolean14 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(dataNodeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
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
        org.jsoup.nodes.Element element23 = element22.parent();
        org.jsoup.nodes.Element element24 = element23.nextElementSibling();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element27 = element26.nextElementSibling();
        org.jsoup.nodes.Attributes attributes28 = element26.attributes();
        org.jsoup.nodes.Element element30 = element26.text("");
        int int31 = element26.siblingIndex();
        org.jsoup.nodes.Element element33 = element26.text("hi!");
        boolean boolean34 = element26.hasParent();
        java.lang.String str35 = element26.tagName();
        org.jsoup.select.Elements elements37 = element26.getElementsByIndexGreaterThan((int) (byte) 100);
        element26.setBaseUri("<hi! hi!=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element41 = element26.addClass("<hi! value=\"hi!\">\n hi!\n</hi!>");
        org.jsoup.nodes.Node node43 = element26.removeAttr("<hi!> &lt;hi! class=\"\"&gt;&lt;/hi!&gt; </hi!>");
        org.jsoup.nodes.Element element44 = element23.prependChild(node43);
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element47 = element46.nextElementSibling();
        org.jsoup.nodes.Attributes attributes48 = element46.attributes();
        org.jsoup.nodes.Element element50 = element46.text("");
        int int51 = element46.siblingIndex();
        org.jsoup.nodes.Element element53 = element46.text("hi!");
        boolean boolean54 = element46.hasParent();
        java.lang.String str55 = element46.tagName();
        java.lang.String str56 = element46.text();
        org.jsoup.nodes.Element element58 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element59 = element58.nextElementSibling();
        org.jsoup.nodes.Attributes attributes60 = element58.attributes();
        org.jsoup.nodes.Element element61 = element46.prependChild((org.jsoup.nodes.Node) element58);
        org.jsoup.select.Elements elements64 = element58.getElementsByAttributeValue("hi! hi!", "<hi!>\n <hi!></hi!>hi!\n</hi!>");
        org.jsoup.nodes.Element element65 = element44.appendChild((org.jsoup.nodes.Node) element58);
        org.jsoup.nodes.Element element67 = element58.prependElement("<hi!> &lt;hi! class=\"\"&gt;&lt;/hi!&gt; </hi!>");
        java.lang.String str68 = element67.baseUri();
        org.jsoup.nodes.Element element70 = element67.appendText("<hi! =\"hi!\">\n</hi!>");
        java.lang.String str71 = element70.className();
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
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNull(element24);
        org.junit.Assert.assertNull(element27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNull(element47);
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNull(element59);
        org.junit.Assert.assertNotNull(attributes60);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(elements64);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        int int7 = element1.childNodeSize();
        java.lang.String str8 = element1.nodeName();
        org.jsoup.nodes.Element element10 = element1.addClass("<hi! =\"\"></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element1.textNodes();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = element1.dataset();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.lang.String str8 = element7.text();
        org.jsoup.select.Elements elements11 = element7.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi!></hi!>");
        java.lang.String str12 = element7.toString();
        java.lang.String str14 = element7.attr("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element16 = element7.removeClass("hi!");
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements20 = element18.getElementsByClass("hi!");
        java.lang.String str21 = element18.toString();
        org.jsoup.parser.Tag tag22 = element18.tag();
        boolean boolean24 = element18.hasClass("<hi! <hi!></hi!>=\"<hi!>\n hi!\n</hi!>\"></hi!>");
        org.jsoup.nodes.Element element25 = element7.appendTo(element18);
        java.lang.String str26 = element18.nodeName();
        boolean boolean28 = element18.hasAttr("<<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>></<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str12, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<hi!></hi!>" + "'", str21, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
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
            org.jsoup.nodes.Element element13 = element1.before("<hi! hi!=\"<hi!></hi!>\" value=\"<hi!></hi!>.<hi!></hi!>\">\n <hi!>\n  <hi!>\n    hi! \n  </hi!>\n </hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Element element5 = element1.attr("", "");
        org.jsoup.nodes.Node node6 = element5.root();
        org.jsoup.nodes.Element element9 = element5.attr("<hi! value=\"<hi!>\n hi!\n</hi!>\"></hi!>", false);
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueEnding("<hi!>\n &lt;&lt;hi!&gt;&lt;/hi!&gt;&gt;\n <!--&lt;hi!&gt;&lt;/hi!&gt;-->\n</hi!>", "<hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!>\n  hi!\n </hi!>\n</hi!>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
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
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements22 = element20.getElementsByClass("hi!");
        org.jsoup.nodes.Element element24 = element20.html("");
        org.jsoup.nodes.Element element25 = element24.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = element24.siblingNodes();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements30 = element28.getElementsByClass("hi!");
        org.jsoup.nodes.Element element32 = element28.html("");
        org.jsoup.nodes.Element element34 = element28.toggleClass("");
        java.lang.String str35 = element34.text();
        java.lang.String str36 = element34.id();
        org.jsoup.nodes.Element element37 = element24.doClone((org.jsoup.nodes.Node) element34);
        org.jsoup.nodes.Node node38 = element34.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = element34.childNodes();
        element18.childNodes = nodeList39;
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element43 = element42.nextElementSibling();
        org.jsoup.nodes.Attributes attributes44 = element42.attributes();
        org.jsoup.nodes.Element element46 = element42.text("");
        int int47 = element42.siblingIndex();
        org.jsoup.nodes.Element element49 = element42.text("hi!");
        org.jsoup.select.Elements elements51 = element49.getElementsMatchingText("");
        element49.doSetBaseUri("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element56 = element49.attr("hi!", true);
        java.util.List<org.jsoup.nodes.Node> nodeList57 = element49.ensureChildNodes();
        element18.childNodes = nodeList57;
        java.lang.String str59 = element18.toString();
        java.lang.String str60 = element18.val();
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
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNull(element43);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "<hi! hi!=\"<hi!></hi!>\">\n hi!\n</hi!>" + "'", str59, "<hi! hi!=\"<hi!></hi!>\">\n hi!\n</hi!>");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi! <hi!></hi!>=\"<hi!>\n hi!\n</hi!>\"></hi!>");
        org.jsoup.nodes.Element element3 = element1.toggleClass("<hi! =\"hi!\">\n</hi!>");
        org.jsoup.select.Elements elements6 = element3.getElementsByAttributeValue("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n <hi!>\n   hi! \n </hi!>\n</hi!>", "<hi! value=\"&amp;lt;hi! class=&quot;&quot;&amp;gt;&amp;lt;/hi!&amp;gt;&amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt;\">\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!>\n  hi!\n </hi!>\n</hi!>");
        boolean boolean7 = element3.hasText();
        org.jsoup.nodes.Element element9 = element3.addClass("<hi! class=\"\">\n <hi!>\n  hi!\n </hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.nodes.Element element8 = element1.prepend("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements9 = element1.siblingElements();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        element11.setBaseUri("hi!");
        org.jsoup.nodes.Element element14 = element11.empty();
        org.jsoup.select.Elements elements17 = element11.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Node node18 = element11.parentNode();
        org.jsoup.nodes.Element element19 = element1.appendTo(element11);
        org.jsoup.nodes.Element element22 = element1.attr("<hi!>\n hi!\n</hi!>", "<hi! <hi!></hi!>=\"<hi!>\n hi!\n</hi!>\"></hi!>");
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements26 = element24.getElementsByClass("hi!");
        java.lang.String str27 = element24.toString();
        org.jsoup.parser.Tag tag28 = element24.tag();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element(tag28, "");
        java.lang.String str32 = element30.absUrl("<hi! <hi!></hi!>=\"<hi!>\n hi!\n</hi!>\"></hi!>");
        org.jsoup.nodes.Element element33 = element1.before((org.jsoup.nodes.Node) element30);
        org.jsoup.select.Elements elements35 = element1.getElementsContainingText("&lt;hi! =\"\"&gt;&lt;/hi!&gt;");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<hi!></hi!>" + "'", str27, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements35);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements10 = element7.getElementsByAttributeValueMatching("<hi!>\n <hi!></hi!>\n</hi!>", "");
        org.jsoup.select.Elements elements13 = element7.getElementsByAttributeValueMatching("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements15 = element7.getElementsContainingOwnText("<hi!></hi!>");
        org.jsoup.select.Evaluator evaluator16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = element7.is(evaluator16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
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
        org.jsoup.nodes.Node node31 = element28.removeAttr("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.NodeVisitor nodeVisitor32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = element28.traverse(nodeVisitor32);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.select.Elements elements8 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element10.nextElementSibling();
        org.jsoup.nodes.Attributes attributes12 = element10.attributes();
        java.lang.String str13 = element10.cssSelector();
        org.jsoup.nodes.Element element15 = element10.prependText("hi!");
        org.jsoup.nodes.Element element16 = element15.empty();
        java.lang.String str17 = element15.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element15.childNodesCopy();
        element1.childNodes = nodeList18;
        org.jsoup.nodes.Element element22 = element1.attr("<hi!>\n <hi!>\n   hi! \n </hi!>\n <hi!>\n  <hi!></hi!>\n </hi!>\n</hi!>", false);
        org.jsoup.nodes.Node node24 = element1.removeAttr("<hi! class=\"<hi! class=&quot;&quot;></hi!> <hi! class=&quot;&quot;></hi!>\">\n hi!\n</hi!>");
        java.util.regex.Pattern pattern25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements26 = element1.getElementsMatchingOwnText(pattern25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Node node4 = element1.parentNode();
        org.jsoup.select.Elements elements6 = element1.getElementsContainingOwnText("");
        org.jsoup.nodes.Element element7 = element1.clone();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = element7.dataset();
        boolean boolean9 = element7.hasAttributes();
        org.jsoup.nodes.Element element11 = element7.val("<hi! value=\"hi!\">\n hi!\n</hi!>");
        org.jsoup.nodes.Element element13 = element11.prependText("");
        org.jsoup.nodes.Document document14 = element11.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = element11.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
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
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element50 = element49.nextElementSibling();
        org.jsoup.nodes.Attributes attributes51 = element49.attributes();
        org.jsoup.nodes.Element element53 = element49.text("");
        int int54 = element49.siblingIndex();
        org.jsoup.nodes.Element element56 = element49.text("hi!");
        org.jsoup.select.Elements elements58 = element56.getElementsMatchingText("");
        java.util.List<org.jsoup.nodes.Node> nodeList59 = element56.childNodesCopy();
        org.jsoup.nodes.Node node60 = element56.clearAttributes();
        boolean boolean61 = element1.hasSameValue((java.lang.Object) node60);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList62 = element1.textNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList63 = element1.childNodes();
        java.lang.String str64 = element1.cssSelector();
        org.jsoup.nodes.Element element66 = new org.jsoup.nodes.Element("<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;\n</<hi!></hi!>>");
        org.jsoup.nodes.Element element68 = element66.appendElement("<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt;\n</hi!>\">\n &lt;hi!&gt; &amp;lt;hi! class=\"\"&amp;gt;&amp;lt;/hi!&amp;gt; &lt;/hi!&gt;\n <hi!></hi!>\n</<hi!></hi!>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element69 = element1.before((org.jsoup.nodes.Node) element68);
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
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNull(element50);
        org.junit.Assert.assertNotNull(attributes51);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(elements58);
        org.junit.Assert.assertNotNull(nodeList59);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(textNodeList62);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNotNull(element68);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
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
        org.jsoup.nodes.Element element22 = element10.text("<hi! hi!=\"<hi!></hi!>\"></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = element10.childNodes();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(nodeList23);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
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
        java.lang.String str23 = element22.className();
        org.jsoup.nodes.Element element25 = element22.append("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = element25.childNodesCopy();
        org.jsoup.nodes.Element element29 = element25.attr("<hi! class=\"<hi!>\n hi!\n</hi!>\"></hi!>", "<hi!>\n <hi!>\n  <hi!>\n    hi! \n  </hi!>\n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element31 = element25.addClass("<hi!>\n  &lt;hi!&gt;&lt;/hi!&gt; \n <hi!>\n   hi! \n </hi!> \n</hi!>");
        java.lang.String str32 = element25.id();
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
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;\n</<hi!></hi!>>");
        java.lang.String str2 = element1.cssSelector();
        org.jsoup.nodes.Element element4 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByClass("hi!");
        org.jsoup.nodes.Element element8 = element4.html("");
        org.jsoup.nodes.Element element9 = element8.parent();
        element8.setBaseUri("");
        org.jsoup.nodes.Element element14 = element8.attr("&lt;hi!&gt;&lt;/hi!&gt;", true);
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements19 = element17.getElementsByClass("hi!");
        org.jsoup.select.Elements elements20 = element17.getAllElements();
        boolean boolean21 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements26 = element24.getElementsByClass("hi!");
        org.jsoup.select.Elements elements29 = element24.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.select.Elements elements32 = element24.getElementsByAttributeValueMatching("", "<hi!></hi!>");
        org.jsoup.nodes.Node[] nodeArray33 = new org.jsoup.nodes.Node[] { element24 };
        org.jsoup.nodes.Element element34 = element17.insertChildren((-1), nodeArray33);
        org.jsoup.nodes.Element element35 = element8.insertChildren((int) (short) 0, nodeArray33);
        boolean boolean36 = element1.hasSameValue((java.lang.Object) element35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;\n</<hi!></hi!>>" + "'", str2, "<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;\n</<hi!></hi!>>");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(nodeArray33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi! value=\"&amp;lt;hi! class=&quot;&quot;&amp;gt;&amp;lt;/hi!&amp;gt;&amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt;\">\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!>\n  hi!\n </hi!>\n</hi!>");
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
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
        org.jsoup.nodes.Element element19 = element17.removeClass("<hi! hi!=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element21 = element19.appendElement("<hi!>\n &lt;&lt;hi!&gt;&lt;/hi!&gt;&gt;\n <!--&lt;hi!&gt;&lt;/hi!&gt;-->\n</hi!>");
        boolean boolean23 = element19.hasClass("&lt;hi! =\"\"&gt;&lt;/hi!&gt;");
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
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
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
            org.jsoup.nodes.Element element18 = element16.getElementById("<hi!>\n  &lt;hi!&gt;&lt;/hi!&gt; \n <hi!>\n   hi! \n </hi!> \n</hi!>");
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
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;");
        int int2 = element1.childNodeSize();
        org.jsoup.nodes.Element element3 = element1.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
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
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element("hi!");
        element40.setBaseUri("hi!");
        org.jsoup.select.Elements elements44 = element40.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element47 = element40.attr("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>", false);
        org.jsoup.nodes.Element element49 = element40.appendElement("<hi! =\"hi!\">\n</hi!>");
        org.jsoup.nodes.Element element51 = element40.prependText("<hi!>\n <hi!>\n   hi! \n </hi!>\n <hi!>\n  <hi!></hi!>\n </hi!>\n</hi!>");
        java.lang.String str52 = element40.toString();
        boolean boolean53 = element24.equals((java.lang.Object) element40);
        boolean boolean54 = element24.hasText();
        org.jsoup.nodes.Element element56 = element24.after("hi!.<<hi!></hi!>.class=\"<hi!></hi!>.\".value=\"<hi!>.<hi!></hi!>.</hi!>\"></<hi!></hi!>>");
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
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<hi!>\n &lt;hi!&gt; &lt;hi!&gt; hi! &lt;/hi!&gt; &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt;\n <<hi! =\"hi!\">\n</hi!>></<hi! =\"hi!\">\n</hi!>>\n</hi!>" + "'", str52, "<hi!>\n &lt;hi!&gt; &lt;hi!&gt; hi! &lt;/hi!&gt; &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt;\n <<hi! =\"hi!\">\n</hi!>></<hi! =\"hi!\">\n</hi!>>\n</hi!>");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(element56);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        java.lang.String str6 = element5.val();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element8.childNodes();
        org.jsoup.nodes.Element element10 = element5.appendTo(element8);
        org.jsoup.nodes.Element element12 = element10.html("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements14 = element10.getElementsContainingText("<hi!></hi!>");
        org.jsoup.nodes.Node node15 = element10.previousSibling();
        org.jsoup.nodes.Element element17 = element10.prependElement("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element20 = element19.nextElementSibling();
        org.jsoup.nodes.Attributes attributes21 = element19.attributes();
        org.jsoup.nodes.Element element23 = element19.text("");
        int int24 = element19.siblingIndex();
        org.jsoup.nodes.Element element26 = element19.text("hi!");
        org.jsoup.select.Elements elements28 = element26.getElementsMatchingText("");
        element26.doSetBaseUri("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element32 = element26.html("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element33 = element17.doClone((org.jsoup.nodes.Node) element32);
        boolean boolean35 = element32.hasClass("<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n</<hi!></hi!>>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        java.lang.String str6 = element5.val();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element8.childNodes();
        org.jsoup.nodes.Element element10 = element5.appendTo(element8);
        org.jsoup.nodes.Element element12 = element10.html("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements14 = element10.getElementsContainingText("<hi!></hi!>");
        org.jsoup.nodes.Node node15 = element10.previousSibling();
        org.jsoup.nodes.Element element17 = element10.prependElement("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element20 = element19.nextElementSibling();
        org.jsoup.nodes.Attributes attributes21 = element19.attributes();
        org.jsoup.nodes.Element element23 = element19.text("");
        int int24 = element19.siblingIndex();
        org.jsoup.nodes.Element element26 = element19.text("hi!");
        org.jsoup.select.Elements elements28 = element26.getElementsMatchingText("");
        element26.doSetBaseUri("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element32 = element26.html("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element33 = element17.doClone((org.jsoup.nodes.Node) element32);
        org.jsoup.select.Elements elements36 = element33.getElementsByAttributeValueEnding("<hi! =\"hi!\">\n hi!\n</hi!>", "<hi! value=\"&amp;lt;hi! class=&quot;&quot;&amp;gt;&amp;lt;/hi!&amp;gt;&amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt;\">\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!>\n  hi!\n </hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element38 = element33.child((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements36);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("&lt;hi!&gt; &amp;lt;hi! class=\"\"&amp;gt;&amp;lt;/hi!&amp;gt; &lt;/hi!&gt;\n<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = element1.ensureChildNodes();
        org.junit.Assert.assertNotNull(nodeList2);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = element7.textNodes();
        org.jsoup.nodes.Element element11 = element7.attr("<hi!></hi!>", "<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n <hi!>\n   hi! \n </hi!>\n</hi!>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(textNodeList8);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Element element5 = element1.attr("", "");
        java.lang.String str6 = element5.text();
        org.jsoup.nodes.Element element8 = element5.toggleClass("<hi!>\n hi!\n</hi!>");
        boolean boolean9 = element8.hasParent();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element7 = element1.toggleClass("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element8 = element7.parent();
        org.jsoup.select.Elements elements9 = element7.getAllElements();
        org.jsoup.nodes.Element element12 = element7.attr("<hi! class=\"\">\n <hi!>\n  hi!\n </hi!>\n</hi!>", "<hi!> &lt;hi! class=\"\"&gt;&lt;/hi!&gt; </hi!>");
        org.jsoup.select.Elements elements14 = element7.getElementsByAttributeStarting("<hi!></hi!><hi!> <hi!></hi!> </hi!>");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.select.Elements elements8 = element1.getElementsMatchingOwnText("");
        org.jsoup.nodes.Element element10 = element1.html("");
        java.lang.String str11 = element10.ownText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element10.before("<<hi!></hi!>></<hi!></hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
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
        element42.nodelistChanged();
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
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
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
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList22 = element1.dataNodes();
        org.jsoup.nodes.Element element24 = element1.val("<hi!></hi!>");
        boolean boolean25 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element24);
        java.lang.String str26 = element24.nodeName();
        org.jsoup.select.Elements elements27 = element24.parents();
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
        org.junit.Assert.assertNotNull(dataNodeList22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element1.childNodesCopy();
        java.lang.String str6 = element1.outerHtml();
        org.jsoup.nodes.Element element7 = element1.shallowClone();
        org.jsoup.nodes.Element element8 = element7.nextElementSibling();
        int int9 = element7.elementSiblingIndex();
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexLessThan((int) (byte) 10);
        java.lang.String str12 = element7.val();
        org.jsoup.select.Elements elements15 = element7.getElementsByAttributeValueNot("<hi!> &lt;hi!&gt;&lt;/hi!&gt; </hi!>", "<hi! hi!=\"<hi!></hi!>\"></hi!>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi!></hi!>" + "'", str6, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.nodes.Node node7 = element1.clearAttributes();
        org.jsoup.nodes.Element element9 = element1.addClass("");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueContaining("<hi!></hi!>", "<hi!>\n hi!\n</hi!>");
        java.lang.String str13 = element9.ownText();
        org.jsoup.select.Elements elements16 = element9.getElementsByAttributeValue("<hi! class=\"<hi! class=&quot;<hi! class=&amp;quot;&amp;quot;></hi!> <hi! class=&amp;quot;&amp;quot;></hi!>&quot;>\n hi!\n</hi!>\"></hi!>", "<hi! class=\"\">\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.lang.String str8 = element7.text();
        org.jsoup.select.Elements elements11 = element7.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi!></hi!>");
        element7.doSetBaseUri("hi!");
        java.lang.String str14 = element7.html();
        org.jsoup.nodes.Element element16 = element7.prepend("<hi! hi!=\"<hi!></hi!>\"></hi!>");
        org.jsoup.parser.Tag tag17 = element7.tag();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(tag17);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsByClass("hi!");
        org.jsoup.select.Elements elements12 = element9.getAllElements();
        boolean boolean13 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element9);
        org.jsoup.select.Elements elements14 = element9.siblingElements();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements18 = element16.getElementsByClass("hi!");
        org.jsoup.select.Elements elements19 = element16.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = element16.childNodesCopy();
        java.util.Set<java.lang.String> strSet21 = element16.classNames();
        org.jsoup.nodes.Element element22 = element9.classNames(strSet21);
        org.jsoup.nodes.Element element23 = element7.classNames(strSet21);
        org.jsoup.nodes.Element element24 = element23.clone();
        org.jsoup.nodes.Element element26 = element23.prependText("<hi!>\n <hi!>\n   hi! \n </hi!>\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = element26.childNodes();
        org.jsoup.nodes.Element element28 = element26.parent();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNull(element28);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
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
        java.lang.String str31 = element26.data();
        org.jsoup.nodes.Element element32 = element26.empty();
        org.jsoup.nodes.Element element34 = element32.val("<hi! value=\"<hi!>\n <hi!></hi!>hi!\n</hi!>\"></hi!>");
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
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
        org.jsoup.nodes.Node node31 = element28.removeAttr("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements32 = element28.children();
        org.jsoup.nodes.Element element34 = element28.prependText("");
        org.jsoup.select.Elements elements36 = element34.getElementsByTag("<hi! value=\"<hi!>\n hi!\n</hi!>\"></hi!>");
        org.jsoup.select.Elements elements37 = element34.children();
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
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(elements37);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!>\n hi!\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!>\n  hi!\n </hi!>\n</hi!>");
        org.jsoup.select.Elements elements2 = element1.children();
        org.junit.Assert.assertNotNull(elements2);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
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
        org.jsoup.nodes.Element element23 = element1.append("<hi! class=\"\"></hi!>");
        java.lang.String str25 = element1.attr("<hi!>\n  hi! \n</hi!>\n<hi!></hi!>");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
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
        java.lang.String str23 = element21.html();
        element21.doSetBaseUri("<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\"></<hi!></hi!>>");
        org.jsoup.nodes.Element element26 = element21.lastElementSibling();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "&lt;hi! class=\"\"&gt;&lt;/hi!&gt;" + "'", str23, "&lt;hi! class=\"\"&gt;&lt;/hi!&gt;");
        org.junit.Assert.assertNull(element26);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        java.lang.String str6 = element5.val();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element8.childNodes();
        org.jsoup.nodes.Element element10 = element5.appendTo(element8);
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.nextElementSibling();
        boolean boolean14 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element12);
        int int15 = element12.siblingIndex();
        org.jsoup.nodes.Element element18 = element12.attr("hi!", "<hi!></hi!>");
        java.lang.String str19 = element12.cssSelector();
        boolean boolean21 = element12.hasClass("<hi!></hi!>");
        org.jsoup.nodes.Element element23 = element12.removeClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = element23.childNodes;
        boolean boolean25 = element8.equals((java.lang.Object) element23);
        org.jsoup.nodes.Element element27 = element23.html("<hi!>\n &lt;hi!&gt; &lt;hi!&gt; hi! &lt;/hi!&gt; &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt;\n <<hi! =\"hi!\">\n</hi!>></<hi! =\"hi!\">\n</hi!>>\n</hi!>");
        java.lang.String str28 = element27.html();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<hi!>\n  &lt;hi!&gt; &lt;hi!&gt; hi! &lt;/hi!&gt; &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt; &lt;\n <hi! =\"hi!\"> \n </hi!>&gt;\n <!--<hi! =\"hi!\"--> \n</hi!>&gt;" + "'", str28, "<hi!>\n  &lt;hi!&gt; &lt;hi!&gt; hi! &lt;/hi!&gt; &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt; &lt;\n <hi! =\"hi!\"> \n </hi!>&gt;\n <!--<hi! =\"hi!\"--> \n</hi!>&gt;");
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.nodes.Element element8 = element1.prepend("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element11 = element8.attr("<hi!></hi!>", false);
        boolean boolean12 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element11);
        java.lang.String str13 = element11.val();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
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
        element18.doSetBaseUri("");
        java.lang.String str21 = element18.ownText();
        org.jsoup.select.Elements elements23 = element18.getElementsByIndexLessThan((int) ' ');
        java.lang.String str24 = element18.toString();
        org.jsoup.nodes.Element element25 = element18.empty();
        java.lang.String str26 = element25.data();
        org.jsoup.select.Elements elements27 = element25.parents();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<hi!></hi!>" + "'", str24, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Element element5 = element1.attr("", "");
        org.jsoup.nodes.Element element6 = element1.empty();
        org.jsoup.select.Elements elements8 = element1.getElementsByIndexLessThan(10);
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element12 = element11.nextElementSibling();
        org.jsoup.nodes.Attributes attributes13 = element11.attributes();
        org.jsoup.nodes.Element element15 = element11.text("");
        int int16 = element11.siblingIndex();
        org.jsoup.nodes.Element element18 = element11.text("hi!");
        java.lang.String str19 = element18.outerHtml();
        org.jsoup.nodes.Node node21 = element18.removeAttr("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element24 = element23.nextElementSibling();
        org.jsoup.nodes.Attributes attributes25 = element23.attributes();
        org.jsoup.nodes.Element element27 = element23.text("");
        int int28 = element23.siblingIndex();
        org.jsoup.nodes.Element element30 = element23.text("hi!");
        org.jsoup.select.Elements elements32 = element30.getElementsMatchingText("");
        element30.doSetBaseUri("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element37 = element30.attr("hi!", true);
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
        org.jsoup.nodes.Node node57 = element53.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList58 = element53.childNodes();
        boolean boolean59 = element37.equals((java.lang.Object) nodeList58);
        org.jsoup.nodes.Element element60 = element18.appendChild((org.jsoup.nodes.Node) element37);
        org.jsoup.select.Elements elements63 = element18.getElementsByAttributeValueNot("<hi!> &lt;hi! class=\"\"&gt;&lt;/hi!&gt; </hi!>", "<hi! =\"\"></hi!>");
        org.jsoup.nodes.Element element64 = element1.insertChildren((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements63);
        java.lang.String str65 = element1.cssSelector();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str19, "<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(element24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element37);
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
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(elements63);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        boolean boolean11 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element8);
        org.jsoup.nodes.Element element13 = element8.prependText("<hi! <hi!></hi!>=\"<hi!>\n hi!\n</hi!>\"></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element13.childNodes;
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.select.Elements elements7 = element1.getAllElements();
        org.jsoup.nodes.Node node9 = element1.removeAttr("<hi!>\n  &lt;hi!&gt; &lt;hi!&gt; hi! &lt;/hi!&gt; &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt; &lt;\n <hi! =\"hi!\"> \n </hi!>&gt;\n <!--<hi! =\"hi!\"--> \n</hi!>&gt;");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.data();
        org.jsoup.nodes.Element element11 = element1.shallowClone();
        boolean boolean12 = element11.hasParent();
        java.lang.String str13 = element11.text();
        boolean boolean14 = element11.hasAttributes();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.select.Elements elements8 = element1.getElementsMatchingOwnText("");
        org.jsoup.nodes.Element element10 = element1.html("");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.parent();
        org.jsoup.nodes.Node node14 = element12.parentNode();
        org.jsoup.select.Elements elements16 = element12.getElementsByIndexLessThan(1);
        element12.nodelistChanged();
        org.jsoup.select.Elements elements18 = element12.parents();
        org.jsoup.nodes.Element element20 = element12.removeClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Node node21 = element12.root();
        org.jsoup.select.Elements elements23 = element12.getElementsContainingOwnText("&lt;hi!&gt;&lt;/hi!&gt;");
        org.jsoup.nodes.Element element25 = element12.appendText("&lt;hi!&gt;&lt;/hi!&gt;");
        org.jsoup.nodes.Element element26 = element1.appendChild((org.jsoup.nodes.Node) element12);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsByClass("hi!");
        org.jsoup.select.Elements elements12 = element9.getAllElements();
        boolean boolean13 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element9);
        org.jsoup.select.Elements elements14 = element9.siblingElements();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements18 = element16.getElementsByClass("hi!");
        org.jsoup.select.Elements elements19 = element16.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = element16.childNodesCopy();
        java.util.Set<java.lang.String> strSet21 = element16.classNames();
        org.jsoup.nodes.Element element22 = element9.classNames(strSet21);
        org.jsoup.nodes.Element element23 = element7.classNames(strSet21);
        org.jsoup.select.Elements elements25 = element23.getElementsByTag("&lt;hi!&gt;&lt;/hi!&gt;");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "hi!");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        org.jsoup.select.Elements elements14 = element12.getElementsContainingOwnText("hi!");
        java.lang.String str15 = element12.tagName();
        org.jsoup.nodes.Element element17 = element12.prependElement("<hi! hi!=\"<hi!></hi!>\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = element12.select("<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n <<hi!>\n hi!\n</hi!>></<hi!>\n hi!\n</hi!>>\n <hi! class=\"\"></hi!>\n</<hi!></hi!>>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>? <hi!></hi!>?</hi!>\">? <<hi!>? hi!?</hi!>></<hi!>? hi!?</hi!>>? <hi! class=\"\"></hi!>?</<hi!></hi!>>': unexpected token at '<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>? <hi!></hi!>?</hi!>\">? <<hi!>? hi!?</hi!>></<hi!>? hi!?</hi!>>? <hi! class=\"\"></hi!>?</<hi!></hi!>>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.nodes.Element element8 = element1.prepend("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element11 = element8.attr("<hi!></hi!>", false);
        org.jsoup.select.Elements elements13 = element11.getElementsByAttribute("&lt;hi!&gt;&lt;/hi!&gt;");
        org.jsoup.nodes.Element element15 = element11.text("<hi!>\n &lt;hi!&gt; &lt;hi!&gt; hi! &lt;/hi!&gt; &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt;\n <<hi! =\"hi!\">\n</hi!>></<hi! =\"hi!\">\n</hi!>>\n</hi!>");
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements19 = element17.getElementsByClass("hi!");
        org.jsoup.nodes.Element element21 = element17.html("");
        org.jsoup.nodes.Element element23 = element17.toggleClass("");
        org.jsoup.parser.Tag tag24 = element23.tag();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag24, "<hi!></hi!>");
        org.jsoup.nodes.Element element28 = element26.toggleClass("<&lt;hi!&gt;&lt;/hi!&gt;></&lt;hi!&gt;&lt;/hi!&gt;>");
        org.jsoup.nodes.Node node29 = element28.nextSibling();
        org.jsoup.nodes.Element element30 = element15.appendTo(element28);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(element30);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
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
        java.lang.String str46 = element1.className();
        org.jsoup.nodes.Element element47 = element1.clone();
        org.jsoup.nodes.Element element48 = element1.clone();
        org.jsoup.nodes.Element element50 = element48.removeClass("");
        org.jsoup.nodes.Attributes attributes51 = element48.attributes();
        org.jsoup.select.Elements elements52 = element48.getAllElements();
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(attributes51);
        org.junit.Assert.assertNotNull(elements52);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        boolean boolean7 = element6.hasText();
        org.jsoup.select.Elements elements9 = element6.getElementsByIndexLessThan((int) '4');
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
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
        element30.nodelistChanged();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements35 = element33.getElementsByClass("hi!");
        org.jsoup.select.Elements elements36 = element33.getAllElements();
        boolean boolean37 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element33);
        org.jsoup.nodes.Element element40 = element33.attr("", "hi!");
        java.lang.String str41 = element40.html();
        org.jsoup.nodes.Element element43 = element40.appendElement("<hi!></hi!>");
        java.lang.String[] strArray47 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        org.jsoup.nodes.Element element50 = element43.classNames((java.util.Set<java.lang.String>) strSet48);
        org.jsoup.nodes.Element element52 = element50.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element54 = element52.text("");
        org.jsoup.nodes.Element element56 = element54.append("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element58 = element56.text("");
        org.jsoup.nodes.Node node59 = element58.parentNode();
        org.jsoup.nodes.Element element61 = element58.after("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n <hi!>\n   hi! \n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element63 = element58.after("<hi!>\n <hi!></hi!>hi!\n</hi!>");
        org.jsoup.nodes.Element element64 = element30.after((org.jsoup.nodes.Node) element58);
        org.jsoup.nodes.Element element66 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList67 = element66.childNodes();
        org.jsoup.select.Elements elements70 = element66.getElementsByAttributeValue("<hi!></hi!>", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList71 = element66.childNodes;
        org.jsoup.nodes.Element element73 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element74 = element73.nextElementSibling();
        org.jsoup.nodes.Attributes attributes75 = element73.attributes();
        java.lang.String str76 = element73.cssSelector();
        org.jsoup.nodes.Element element78 = element73.prependText("hi!");
        org.jsoup.nodes.Element element79 = element78.empty();
        java.lang.String str80 = element78.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList81 = element78.childNodesCopy();
        element66.childNodes = nodeList81;
        org.jsoup.nodes.Element element84 = element66.text("<hi!>\n <<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n  <hi! class=\"\"></hi!>\n </<hi!></hi!>>\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList85 = element84.childNodes();
        boolean boolean86 = element30.hasSameValue((java.lang.Object) nodeList85);
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
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(nodeList67);
        org.junit.Assert.assertNotNull(elements70);
        org.junit.Assert.assertNotNull(nodeList71);
        org.junit.Assert.assertNull(element74);
        org.junit.Assert.assertNotNull(attributes75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertNotNull(element78);
        org.junit.Assert.assertNotNull(element79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNotNull(nodeList81);
        org.junit.Assert.assertNotNull(element84);
        org.junit.Assert.assertNotNull(nodeList85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
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
        org.jsoup.select.Elements elements27 = element24.getElementsByAttributeValueMatching("<<hi!></hi!>></<hi!></hi!>>", "<hi!>\n <hi!></hi!>\n</hi!>");
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
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
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
        boolean boolean34 = element25.hasClass("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element37 = element36.nextElementSibling();
        org.jsoup.nodes.Attributes attributes38 = element36.attributes();
        org.jsoup.nodes.Element element40 = element36.text("");
        int int41 = element36.siblingIndex();
        org.jsoup.select.Elements elements42 = element36.getAllElements();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList43 = element36.textNodes();
        org.jsoup.nodes.Element element45 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements47 = element45.getElementsByClass("hi!");
        org.jsoup.nodes.Element element49 = element45.html("");
        java.lang.String str50 = element49.val();
        org.jsoup.nodes.Element element52 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList53 = element52.childNodes();
        org.jsoup.nodes.Element element54 = element49.appendTo(element52);
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList55 = element52.dataNodes();
        org.jsoup.nodes.Element element56 = element36.appendTo(element52);
        boolean boolean57 = element25.equals((java.lang.Object) element52);
        org.jsoup.nodes.Element element59 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements61 = element59.getElementsByClass("hi!");
        org.jsoup.select.Elements elements62 = element59.getAllElements();
        boolean boolean63 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element59);
        org.jsoup.nodes.Element element66 = element59.attr("", "hi!");
        java.lang.String str67 = element66.html();
        org.jsoup.nodes.Element element69 = element66.appendElement("<hi!></hi!>");
        java.lang.String[] strArray73 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet74 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet74, strArray73);
        org.jsoup.nodes.Element element76 = element69.classNames((java.util.Set<java.lang.String>) strSet74);
        org.jsoup.nodes.Element element78 = element76.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element80 = element78.text("");
        org.jsoup.nodes.Element element82 = element80.append("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element84 = element80.tagName("<hi!></hi!>");
        org.jsoup.nodes.Node node85 = element84.previousSibling();
        boolean boolean86 = element84.isBlock();
        org.jsoup.nodes.Node node88 = element84.removeAttr("<hi!> &lt;hi! class=\"\"&gt;&lt;/hi!&gt; </hi!>");
        org.jsoup.nodes.Element element89 = element25.prependChild(node88);
        java.lang.String str90 = element89.className();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(element37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(textNodeList43);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(dataNodeList55);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertNotNull(elements62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(element76);
        org.junit.Assert.assertNotNull(element78);
        org.junit.Assert.assertNotNull(element80);
        org.junit.Assert.assertNotNull(element82);
        org.junit.Assert.assertNotNull(element84);
        org.junit.Assert.assertNull(node85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNotNull(element89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
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
        org.jsoup.nodes.Element element17 = element15.val("");
        org.jsoup.select.Elements elements19 = element15.getElementsByAttributeStarting("<hi!>\n <<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n  <hi! class=\"\"></hi!>\n </<hi!></hi!>>\n</hi!>");
        org.jsoup.nodes.Element element21 = element15.prependElement("<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt;\n</hi!>\">\n &lt;hi!&gt; &amp;lt;hi! class=\"\"&amp;gt;&amp;lt;/hi!&amp;gt; &lt;/hi!&gt;\n <hi!></hi!>\n</<hi!></hi!>>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        element1.doSetBaseUri("hi!");
        org.jsoup.nodes.Element element6 = element1.shallowClone();
        java.lang.String str7 = element1.nodeName();
        java.util.regex.Pattern pattern9 = null;
        org.jsoup.select.Elements elements10 = element1.getElementsByAttributeValueMatching("&lt;hi!&gt;&lt;/hi!&gt;", pattern9);
        org.jsoup.nodes.Element element12 = element1.prepend("<hi!> \n <hi!></hi!> \n</hi!>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
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
        org.jsoup.nodes.Element element29 = element24.append("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements31 = element24.getElementsByIndexLessThan(10);
        org.jsoup.select.Elements elements32 = element24.siblingElements();
        java.lang.String str33 = element24.ownText();
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
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
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
        org.jsoup.select.Elements elements17 = element8.getAllElements();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements22 = element20.getElementsByClass("hi!");
        org.jsoup.select.Elements elements23 = element20.getAllElements();
        boolean boolean24 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element20);
        org.jsoup.select.Elements elements25 = element20.siblingElements();
        org.jsoup.select.Elements elements26 = element20.getAllElements();
        org.jsoup.nodes.Element element27 = element8.insertChildren((int) (byte) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements26);
        java.lang.String str28 = element27.text();
        org.jsoup.select.Elements elements31 = element27.getElementsByAttributeValueContaining("<hi! class=\"<hi! class=&quot;&quot;></hi!> <hi! class=&quot;&quot;></hi!>\">\n hi!\n</hi!>", "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(elements31);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element1.childNodesCopy();
        boolean boolean7 = element1.hasClass("");
        org.jsoup.nodes.Document document8 = element1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = document8.elementSiblingIndex();
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
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        element1.nodelistChanged();
        boolean boolean8 = element1.equals((java.lang.Object) (byte) -1);
        boolean boolean10 = element1.hasClass("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element12 = element1.appendElement("&lt;hi!&gt;&lt;/hi!&gt;");
        java.lang.String str13 = element1.val();
        org.jsoup.nodes.Node node15 = element1.removeAttr("<hi!>\n hi!\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element1.siblingNodes();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
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
        org.jsoup.select.Elements elements22 = element20.getElementsByTag("<hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!>\n  hi!\n </hi!>\n</hi!>");
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
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
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
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList38 = element37.dataNodes();
        org.jsoup.select.Elements elements40 = element37.getElementsMatchingOwnText("hi! hi!");
        java.util.Set<java.lang.String> strSet41 = element37.classNames();
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
        org.junit.Assert.assertNotNull(dataNodeList38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(strSet41);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        java.lang.String str8 = element1.cssSelector();
        boolean boolean10 = element1.hasClass("<hi!></hi!>");
        org.jsoup.nodes.Element element12 = element1.val("");
        org.jsoup.nodes.Element element13 = element1.empty();
        org.jsoup.nodes.Element element14 = element13.nextElementSibling();
        org.jsoup.nodes.Element element16 = element13.appendElement("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Node node17 = element16.root();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.lang.String str8 = element1.html();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList9 = element1.dataNodes();
        java.lang.String str11 = element1.absUrl("hi!");
        org.jsoup.select.Elements elements13 = element1.getElementsByIndexGreaterThan((int) (byte) -1);
        org.jsoup.select.Elements elements16 = element1.getElementsByAttributeValueContaining("<hi! class=\"<hi!>\n hi!\n</hi!>\"></hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element19 = element1.attr("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n <hi!>\n   hi! \n </hi!>\n</hi!>", false);
        element1.doSetBaseUri("<hi!>\n <hi!>\n  <hi!>\n    hi! \n  </hi!>\n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element23 = element1.getElementById("<hi!>\n hi!\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!>\n  hi!\n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements27 = element25.getElementsByClass("hi!");
        org.jsoup.select.Elements elements28 = element25.getAllElements();
        boolean boolean29 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Element element32 = element25.attr("", "hi!");
        java.lang.String str33 = element32.html();
        org.jsoup.nodes.Element element35 = element32.appendElement("<hi!></hi!>");
        java.lang.String[] strArray39 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.jsoup.nodes.Element element42 = element35.classNames((java.util.Set<java.lang.String>) strSet40);
        org.jsoup.nodes.Element element44 = element42.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element46 = element44.text("");
        org.jsoup.nodes.Element element48 = element46.append("<hi! class=\"\"></hi!>");
        element48.setBaseUri("<hi! value=\"hi!\">\n hi!\n</hi!>");
        org.jsoup.nodes.Element element51 = element1.appendChild((org.jsoup.nodes.Node) element48);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(dataNodeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNull(element23);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element51);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements10 = element7.getElementsByAttributeValueMatching("<hi!>\n <hi!></hi!>\n</hi!>", "");
        org.jsoup.select.Elements elements12 = element7.getElementsMatchingText("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element14 = element7.html("<hi!>\n hi!\n</hi!>");
        java.lang.String str15 = element7.data();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
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
        org.jsoup.select.Elements elements48 = element1.getElementsContainingOwnText("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        java.lang.String str49 = element1.data();
        org.jsoup.select.Elements elements52 = element1.getElementsByAttributeValueMatching("<hi!>\n  hi! \n</hi!>\n<hi!></hi!>", "<hi!> &lt;hi!&gt;&lt;/hi!&gt; </hi!>");
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
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(elements52);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        java.lang.String str6 = element5.val();
        org.jsoup.nodes.Element element8 = element5.prependElement("<hi! hi!=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements12 = element10.getElementsByClass("hi!");
        org.jsoup.select.Elements elements13 = element10.getAllElements();
        boolean boolean14 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element10);
        org.jsoup.select.Elements elements15 = element10.siblingElements();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements19 = element17.getElementsByClass("hi!");
        org.jsoup.select.Elements elements20 = element17.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = element17.childNodesCopy();
        java.util.Set<java.lang.String> strSet22 = element17.classNames();
        org.jsoup.nodes.Element element23 = element10.classNames(strSet22);
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element26 = element25.nextElementSibling();
        org.jsoup.nodes.Attributes attributes27 = element25.attributes();
        org.jsoup.nodes.Element element29 = element25.text("");
        int int30 = element25.siblingIndex();
        org.jsoup.nodes.Element element32 = element25.text("hi!");
        org.jsoup.select.Elements elements34 = element32.getElementsMatchingText("");
        java.util.List<org.jsoup.nodes.Node> nodeList35 = element32.childNodesCopy();
        org.jsoup.nodes.Node node36 = element32.clearAttributes();
        org.jsoup.nodes.Element element37 = element10.doClone(node36);
        org.jsoup.nodes.Element element39 = element10.tagName("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element40 = element5.appendChild((org.jsoup.nodes.Node) element10);
        int int41 = element40.siblingIndex();
        java.lang.String str42 = element40.val();
        org.jsoup.nodes.Node node44 = element40.childNode((int) (short) 0);
        org.jsoup.select.Elements elements46 = element40.getElementsByAttribute("<hi! hi!=\"<hi!></hi!>\">\n &lt;hi! value=\"hi!\"&gt; hi! &lt;/hi!&gt;\n</hi!>");
        int int47 = element40.siblingIndex();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNull(element26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.nodes.Element element8 = element1.removeClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Node node9 = element8.previousSibling();
        org.jsoup.parser.Tag tag10 = element8.tag();
        int int11 = element8.elementSiblingIndex();
        org.jsoup.nodes.Element element13 = element8.tagName("<hi! <hi!></hi!>=\"<hi!>\n hi!\n</hi!>\"></hi!>");
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            element13.outerHtmlHead(appendable14, (-1), outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
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
        org.jsoup.select.Elements elements52 = element51.siblingElements();
        org.jsoup.nodes.Document document53 = element51.ownerDocument();
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
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNull(document53);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        java.lang.String str7 = element1.toString();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = element1.textNodes();
        org.jsoup.nodes.Element element10 = element1.removeClass("");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<hi!></hi!>" + "'", str7, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(textNodeList8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
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
        org.jsoup.nodes.Element element23 = element12.prependElement("<hi!>\n  &lt;hi!&gt;&lt;/hi!&gt; \n <hi!>\n   hi! \n </hi!> \n</hi!>");
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
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        org.jsoup.nodes.Element element10 = element1.appendText("");
        org.jsoup.nodes.Element element12 = element10.append("<hi!>\n <hi!>\n   hi! \n </hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element8 = element1.attr("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>", false);
        org.jsoup.nodes.Element element10 = element1.appendElement("<hi! =\"hi!\">\n</hi!>");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.nextElementSibling();
        org.jsoup.nodes.Attributes attributes14 = element12.attributes();
        org.jsoup.nodes.Element element16 = element12.text("");
        int int17 = element12.siblingIndex();
        org.jsoup.nodes.Element element19 = element12.text("hi!");
        boolean boolean20 = element12.hasParent();
        java.lang.String str21 = element12.data();
        org.jsoup.nodes.Element element22 = element12.shallowClone();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element25 = element24.nextElementSibling();
        org.jsoup.nodes.Attributes attributes26 = element24.attributes();
        java.lang.String str27 = element24.cssSelector();
        org.jsoup.nodes.Element element29 = element24.prependText("hi!");
        org.jsoup.nodes.Element element30 = element29.empty();
        org.jsoup.nodes.Element element32 = element29.appendText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = element29.siblingNodes();
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements37 = element35.getElementsByClass("hi!");
        org.jsoup.select.Elements elements38 = element35.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = element35.childNodesCopy();
        java.util.Set<java.lang.String> strSet40 = element35.classNames();
        org.jsoup.nodes.Element element41 = element29.classNames(strSet40);
        org.jsoup.nodes.Element element42 = element12.classNames(strSet40);
        org.jsoup.nodes.Element element43 = element1.classNames(strSet40);
        org.jsoup.select.Elements elements45 = element1.getElementsByIndexLessThan(4);
        java.lang.String str46 = element1.tagName();
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.nextElementSibling();
        boolean boolean11 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element9);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element9.textNodes();
        org.jsoup.nodes.Element element13 = element1.appendTo(element9);
        org.jsoup.nodes.Element element15 = element13.append("<hi! hi!=\"<hi!></hi!>\"></hi!>");
        java.lang.String str16 = element15.html();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!\n<hi! hi!=\"<hi!></hi!>\"></hi!>" + "'", str16, "hi!\n<hi! hi!=\"<hi!></hi!>\"></hi!>");
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
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
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements30 = element28.getElementsByClass("hi!");
        org.jsoup.select.Elements elements31 = element28.getAllElements();
        boolean boolean32 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element28);
        org.jsoup.nodes.Element element35 = element28.attr("", "hi!");
        org.jsoup.nodes.Element element36 = element28.empty();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = element36.siblingNodes();
        boolean boolean38 = element24.hasSameValue((java.lang.Object) element36);
        java.lang.String str39 = element36.baseUri();
        org.jsoup.nodes.Element element41 = element36.val("<hi! class=\"\"></hi!>\n<hi!></hi!>\n<hi!></hi!>\n<hi!></hi!>\n<hi!></hi!>\n<hi!>\n hi!\n</hi!>");
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
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(element41);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element1.prependText("<hi! value=\"hi!\">\n hi!\n</hi!>");
        java.lang.String str10 = element9.baseUri();
        org.jsoup.nodes.Element element11 = element9.nextElementSibling();
        org.jsoup.nodes.Element element13 = element9.prependText("<hi!></hi!>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag8, "<hi! value=\"hi!\">\n hi!\n</hi!>");
        org.jsoup.nodes.Element element16 = element14.appendElement("<hi! hi!=\"<hi!></hi!>\"></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = element16.childNodes();
        java.lang.String str19 = element16.absUrl("<hi! hi!=\"<hi!></hi!>\"></hi!>");
        java.lang.String str20 = element16.val();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.nodes.Node node7 = element1.clearAttributes();
        org.jsoup.nodes.Element element9 = element1.addClass("");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueContaining("<hi!></hi!>", "<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element15 = element9.attr("", false);
        int int16 = element15.siblingIndex();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
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
        org.jsoup.nodes.Element element33 = element25.parent();
        org.jsoup.nodes.Element element35 = element25.val("hi! hi!");
        java.util.regex.Pattern pattern37 = null;
        org.jsoup.select.Elements elements38 = element25.getElementsByAttributeValueMatching("hi! hi!", pattern37);
        org.jsoup.nodes.Element element40 = element25.text("<hi! hi!=\"<hi!></hi!>\"></hi!>");
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
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element40);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
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
        org.jsoup.nodes.Node node24 = element20.clearAttributes();
        java.lang.String str25 = element20.baseUri();
        org.jsoup.nodes.Element element26 = element20.shallowClone();
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
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
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
        java.lang.String str21 = element18.text();
        element18.setBaseUri("<hi! hi!=\"<hi!></hi!>\">\n &lt;hi! value=\"hi!\"&gt; hi! &lt;/hi!&gt;\n</hi!>");
        int int24 = element18.childNodeSize();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Element element5 = element1.attr("", "");
        boolean boolean7 = element5.hasClass("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = element5.textNodes();
        org.jsoup.select.Elements elements11 = element5.getElementsByAttributeValue("<hi! value=\"<hi!>\n hi!\n</hi!>\"></hi!>", "<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n <<hi!>\n hi!\n</hi!>></<hi!>\n hi!\n</hi!>>\n <hi! class=\"\"></hi!>\n</<hi!></hi!>>");
        java.util.regex.Pattern pattern13 = null;
        org.jsoup.select.Elements elements14 = element5.getElementsByAttributeValueMatching("<hi! =\"hi!\">\n <<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n </<hi!></hi!>>\n <hi!> \n  <hi!></hi!>hi! \n </hi!>\n <hi!>\n   &lt;hi!&gt;&lt;/hi!&gt; \n  <hi!>\n    hi! \n  </hi!> \n </hi!>\n</hi!>", pattern13);
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element17 = element16.nextElementSibling();
        org.jsoup.nodes.Attributes attributes18 = element16.attributes();
        java.lang.String str19 = element16.cssSelector();
        org.jsoup.nodes.Element element21 = element16.prependText("hi!");
        org.jsoup.nodes.Element element22 = element21.empty();
        org.jsoup.nodes.Element element24 = element21.appendText("<hi!></hi!>");
        java.lang.String str25 = element24.className();
        org.jsoup.nodes.Element element26 = element24.empty();
        org.jsoup.nodes.Element element28 = element24.html("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        java.lang.String str29 = element24.cssSelector();
        org.jsoup.nodes.Element element30 = element5.prependChild((org.jsoup.nodes.Node) element24);
        java.util.Set<java.lang.String> strSet31 = element5.classNames();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(textNodeList8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(strSet31);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements7 = element5.getElementsByClass("hi!");
        org.jsoup.select.Elements elements8 = element5.getAllElements();
        boolean boolean9 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element5);
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueMatching("", "hi!");
        boolean boolean13 = element1.equals((java.lang.Object) element5);
        org.jsoup.nodes.Element element15 = element5.text("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n <hi!>\n   hi! \n </hi!>\n</hi!>");
        java.lang.String str16 = element5.ownText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element5.selectFirst("&lt;hi! =\"\"&gt;&lt;/hi!&gt;");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '&lt;hi! =\"\"&gt;&lt;/hi!&gt;': unexpected token at '&lt;hi! =\"\"&gt;&lt;/hi!&gt;'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<hi!> &lt;hi!&gt;&lt;/hi!&gt; <hi!> hi! </hi!> </hi!>" + "'", str16, "<hi!> &lt;hi!&gt;&lt;/hi!&gt; <hi!> hi! </hi!> </hi!>");
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
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
        org.jsoup.nodes.Element element19 = element16.attr("<hi! =\"\"></hi!>", false);
        org.jsoup.nodes.Element element21 = element16.tagName("<hi!></hi!>");
        boolean boolean22 = element16.hasParent();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
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
        java.util.List<org.jsoup.nodes.Node> nodeList26 = element9.ensureChildNodes();
        org.jsoup.nodes.Element element27 = element9.empty();
        org.jsoup.select.Elements elements29 = element9.getElementsContainingText("<hi! hi!=\"<hi!></hi!>\">\n &lt;hi! value=\"hi!\"&gt; hi! &lt;/hi!&gt;\n</hi!>");
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
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements29);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
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
        org.jsoup.nodes.Node node16 = element8.root();
        org.jsoup.nodes.Element element18 = element8.appendText("");
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements22 = element20.getElementsByClass("hi!");
        org.jsoup.select.Elements elements23 = element20.getAllElements();
        boolean boolean24 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element20);
        org.jsoup.nodes.Element element27 = element20.attr("", "hi!");
        java.lang.String str28 = element27.html();
        org.jsoup.nodes.Element element30 = element27.appendElement("<hi!></hi!>");
        java.lang.String[] strArray34 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        org.jsoup.nodes.Element element37 = element30.classNames((java.util.Set<java.lang.String>) strSet35);
        org.jsoup.select.Elements elements39 = element37.getElementsByAttribute("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element41 = element37.prependElement("&lt;hi!&gt;&lt;/hi!&gt;");
        org.jsoup.select.Elements elements43 = element37.getElementsContainingOwnText("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element44 = element18.appendTo(element37);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements46 = element44.select("<hi! class=\"\">\n <hi!>\n  hi!\n </hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"\">? <hi!>?  hi!? </hi!>?</hi!>': unexpected token at '<hi! class=\"\">? <hi!>?  hi!? </hi!>?</hi!>'");
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
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(element44);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        java.lang.String str8 = element6.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element6.childNodesCopy();
        org.jsoup.nodes.Element element10 = element6.clone();
        org.jsoup.select.Elements elements11 = element6.siblingElements();
        org.jsoup.select.Elements elements12 = element6.children();
        org.jsoup.select.Elements elements13 = element6.children();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.select.Elements elements7 = element1.getAllElements();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = element1.textNodes();
        org.jsoup.nodes.Element element9 = element1.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element1.after("<hi!> hi! </hi!> < class=\" \" value=\"\"> <hi! class=\"\"></hi!><hi!></hi!> >");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(textNodeList8);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        org.jsoup.nodes.Element element10 = element1.prepend("hi!");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;\n</<hi!></hi!>>");
        java.lang.String str13 = element12.cssSelector();
        org.jsoup.select.Elements elements15 = element12.getElementsContainingText("<hi!>\n <hi!></hi!>hi!\n</hi!>");
        org.jsoup.nodes.Element element16 = element10.doClone((org.jsoup.nodes.Node) element12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = element12.getElementsByAttributeValueEnding("", "<hi!></hi!>\n<hi!></hi!>\n<hi!></hi!>\n<hi!></hi!>\n<hi!>\n hi!\n</hi!>\n<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;\n</<hi!></hi!>>" + "'", str13, "<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;\n</<hi!></hi!>>");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.data();
        org.jsoup.nodes.Element element11 = element1.shallowClone();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element14 = element13.nextElementSibling();
        org.jsoup.nodes.Attributes attributes15 = element13.attributes();
        java.lang.String str16 = element13.cssSelector();
        org.jsoup.nodes.Element element18 = element13.prependText("hi!");
        org.jsoup.nodes.Element element19 = element18.empty();
        org.jsoup.nodes.Element element21 = element18.appendText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element18.siblingNodes();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements26 = element24.getElementsByClass("hi!");
        org.jsoup.select.Elements elements27 = element24.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = element24.childNodesCopy();
        java.util.Set<java.lang.String> strSet29 = element24.classNames();
        org.jsoup.nodes.Element element30 = element18.classNames(strSet29);
        org.jsoup.nodes.Element element31 = element1.classNames(strSet29);
        org.jsoup.nodes.Element element32 = element1.clone();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element32);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element1.childNodesCopy();
        java.util.Set<java.lang.String> strSet6 = element1.classNames();
        java.util.Set<java.lang.String> strSet7 = element1.classNames();
        org.jsoup.select.Elements elements8 = element1.getAllElements();
        org.jsoup.select.Elements elements9 = element1.children();
        org.jsoup.select.Elements elements10 = element1.parents();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements14 = element12.getElementsByClass("hi!");
        org.jsoup.select.Elements elements15 = element12.getAllElements();
        boolean boolean16 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element12);
        org.jsoup.nodes.Element element19 = element12.attr("", "hi!");
        java.lang.String str20 = element19.html();
        org.jsoup.nodes.Element element22 = element19.appendElement("<hi!></hi!>");
        java.lang.String[] strArray26 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.jsoup.nodes.Element element29 = element22.classNames((java.util.Set<java.lang.String>) strSet27);
        org.jsoup.select.Elements elements31 = element29.getElementsByAttribute("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element33 = element29.prependElement("&lt;hi!&gt;&lt;/hi!&gt;");
        org.jsoup.nodes.Node node34 = element33.unwrap();
        org.jsoup.nodes.Element element36 = element33.val("<hi! class=\"\">\n <hi!>\n  hi!\n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element37 = element1.appendChild((org.jsoup.nodes.Node) element36);
        java.lang.String str38 = element37.cssSelector();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element1.childNodesCopy();
        org.jsoup.nodes.Element element7 = element1.removeClass("<hi! =\"hi!\">\n</hi!>");
        org.jsoup.nodes.Element element9 = element1.addClass("<hi! value=\"<hi!>\n hi!\n</hi!>\"></hi!>");
        org.jsoup.nodes.Node node11 = element9.removeAttr("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.select.Elements elements13 = element9.getElementsByAttribute("<hi!>\n <hi!>\n  <hi!>\n    hi! \n  </hi!>\n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element15 = element9.tagName("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n <hi!>\n   hi! \n </hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.cssSelector();
        java.lang.String str12 = element1.attr("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element14 = element1.val("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.select.Elements elements16 = element1.getElementsByIndexGreaterThan((int) (short) 0);
        org.jsoup.select.Elements elements18 = element1.getElementsByTag("&lt;hi!&gt;&lt;/hi!&gt;");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements10 = element7.getElementsByAttributeValueMatching("<hi!>\n <hi!></hi!>\n</hi!>", "");
        org.jsoup.select.Elements elements13 = element7.getElementsByAttributeValueMatching("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element15 = element7.append("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;");
        org.jsoup.nodes.Node node16 = element7.clearAttributes();
        node16.setBaseUri("< class=\" \" value=\"\"> <hi! class=\"\"></hi!><hi!></hi!> >");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
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
        org.jsoup.nodes.Element element33 = element25.shallowClone();
        boolean boolean34 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element25);
        org.jsoup.select.Elements elements37 = element25.getElementsByAttributeValueNot("<hi! class=\"<hi! class=&quot;&quot;></hi!> <hi! class=&quot;&quot;></hi!>\">\n hi!\n</hi!>", "<hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!>\n  hi!\n </hi!>\n</hi!>");
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
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(elements37);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.select.Elements elements9 = element6.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element12 = element11.parent();
        org.jsoup.nodes.Node node13 = element11.parentNode();
        org.jsoup.select.Elements elements15 = element11.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element11.childNodes;
        element6.childNodes = nodeList16;
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
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
        org.jsoup.select.Elements elements27 = element24.getElementsByAttributeValueNot("< class=\" \" value=\"\"> <hi! class=\"\"></hi!><hi!></hi!> >", "<hi!>\n <hi!></hi!>hi!\n</hi!>");
        org.jsoup.select.Elements elements30 = element24.getElementsByAttributeValueStarting("<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt;\n</hi!>\">\n &lt;hi!&gt; &amp;lt;hi! class=\"\"&amp;gt;&amp;lt;/hi!&amp;gt; &lt;/hi!&gt;\n <hi!></hi!>\n</<hi!></hi!>>", "<hi! =\"hi!\">\n hi!\n</hi!>");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = element24.dataset();
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
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(strMap31);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        java.lang.String str8 = element1.cssSelector();
        boolean boolean10 = element1.hasClass("<hi!></hi!>");
        org.jsoup.nodes.Element element12 = element1.val("");
        org.jsoup.nodes.Element element13 = element1.empty();
        org.jsoup.nodes.Element element16 = element1.attr("<hi! =\"\"></hi!>", false);
        int int17 = element16.childNodeSize();
        org.jsoup.nodes.Element element19 = element16.addClass("<hi! value=\"<hi!>\n <hi!></hi!>hi!\n</hi!>\"></hi!>");
        org.jsoup.select.Elements elements21 = element16.getElementsContainingText("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = element1.textNodes();
        org.jsoup.nodes.Attributes attributes9 = element1.attributes();
        org.jsoup.select.Elements elements11 = element1.getElementsContainingText("hi!");
        org.jsoup.select.Elements elements14 = element1.getElementsByAttributeValueNot("<hi! class=\"\"></hi!>", "<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element16 = element1.prepend("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        element19.setBaseUri("hi!");
        org.jsoup.select.Elements elements23 = element19.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element27 = element26.nextElementSibling();
        boolean boolean28 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element26);
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element31 = element30.parent();
        org.jsoup.nodes.Node node32 = element30.parentNode();
        org.jsoup.select.Elements elements34 = element30.getElementsByIndexLessThan(1);
        boolean boolean35 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element30);
        org.jsoup.select.Elements elements36 = element30.children();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements40 = element38.getElementsByClass("hi!");
        org.jsoup.nodes.Element element42 = element38.html("");
        org.jsoup.nodes.Element element43 = element42.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList44 = element42.siblingNodes();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element47 = element46.parent();
        org.jsoup.nodes.Node node48 = element46.parentNode();
        org.jsoup.select.Elements elements50 = element46.getElementsByIndexLessThan(1);
        org.jsoup.nodes.Element element52 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element53 = element52.nextElementSibling();
        org.jsoup.nodes.Attributes attributes54 = element52.attributes();
        org.jsoup.nodes.Element element56 = element52.text("");
        int int57 = element52.siblingIndex();
        org.jsoup.nodes.Element element59 = element52.text("hi!");
        boolean boolean60 = element52.hasParent();
        java.lang.String str61 = element52.tagName();
        org.jsoup.nodes.Node[] nodeArray62 = new org.jsoup.nodes.Node[] { element26, element30, element42, element46, element52 };
        org.jsoup.nodes.Element element63 = element19.insertChildren((int) (short) 0, nodeArray62);
        org.jsoup.nodes.Element element64 = element16.insertChildren((int) (short) 1, nodeArray62);
        java.lang.String str65 = element16.text();
        java.lang.String str66 = element16.id();
        org.jsoup.select.Elements elements68 = element16.getElementsByTag("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;");
        org.jsoup.nodes.Element element70 = element16.tagName("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n <hi!>\n   hi! \n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element72 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements74 = element72.getElementsByClass("hi!");
        org.jsoup.select.Elements elements75 = element72.getAllElements();
        boolean boolean76 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element72);
        org.jsoup.select.Elements elements77 = element72.parents();
        org.jsoup.nodes.Element element79 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element80 = element79.nextElementSibling();
        boolean boolean81 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element79);
        int int82 = element79.siblingIndex();
        org.jsoup.nodes.Element element85 = element79.attr("hi!", "<hi!></hi!>");
        java.lang.String str86 = element79.cssSelector();
        boolean boolean88 = element79.hasClass("<hi!></hi!>");
        org.jsoup.nodes.Element element89 = element72.doClone((org.jsoup.nodes.Node) element79);
        org.jsoup.nodes.Node node90 = element79.root();
        java.util.List<org.jsoup.nodes.Node> nodeList91 = element79.childNodes();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList92 = element79.dataNodes();
        org.jsoup.nodes.Element element94 = element79.appendText("<hi! value=\"hi!\">\n hi!\n</hi!>");
        java.util.Set<java.lang.String> strSet95 = element94.classNames();
        org.jsoup.nodes.Element element96 = element70.classNames(strSet95);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(textNodeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNull(element27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(element31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNull(element43);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNull(element47);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNull(element53);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(nodeArray62);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(elements68);
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertNotNull(elements74);
        org.junit.Assert.assertNotNull(elements75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(elements77);
        org.junit.Assert.assertNull(element80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(element85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(element89);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertNotNull(nodeList91);
        org.junit.Assert.assertNotNull(dataNodeList92);
        org.junit.Assert.assertNotNull(element94);
        org.junit.Assert.assertNotNull(strSet95);
        org.junit.Assert.assertNotNull(element96);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.nodeName();
        int int3 = element1.siblingIndex();
        org.jsoup.nodes.Element element5 = element1.prepend("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Document document6 = element1.ownerDocument();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
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
        org.jsoup.nodes.Element element23 = element22.parent();
        org.jsoup.nodes.Element element24 = element23.nextElementSibling();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element27 = element26.nextElementSibling();
        org.jsoup.nodes.Attributes attributes28 = element26.attributes();
        org.jsoup.nodes.Element element30 = element26.text("");
        int int31 = element26.siblingIndex();
        org.jsoup.nodes.Element element33 = element26.text("hi!");
        boolean boolean34 = element26.hasParent();
        java.lang.String str35 = element26.tagName();
        org.jsoup.select.Elements elements37 = element26.getElementsByIndexGreaterThan((int) (byte) 100);
        element26.setBaseUri("<hi! hi!=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element41 = element26.addClass("<hi! value=\"hi!\">\n hi!\n</hi!>");
        org.jsoup.nodes.Node node43 = element26.removeAttr("<hi!> &lt;hi! class=\"\"&gt;&lt;/hi!&gt; </hi!>");
        org.jsoup.nodes.Element element44 = element23.prependChild(node43);
        boolean boolean45 = element44.hasParent();
        org.jsoup.nodes.Element element47 = element44.prependText("< class=\" \" value=\"\"> <hi! class=\"\"></hi!><hi!></hi!> >");
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
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNull(element24);
        org.junit.Assert.assertNull(element27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(element47);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
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
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element18 = element17.nextElementSibling();
        org.jsoup.nodes.Attributes attributes19 = element17.attributes();
        org.jsoup.nodes.Element element21 = element17.text("");
        int int22 = element17.siblingIndex();
        org.jsoup.nodes.Element element24 = element17.text("hi!");
        java.lang.String str25 = element24.outerHtml();
        org.jsoup.nodes.Element element27 = element24.appendText("");
        org.jsoup.nodes.Node node29 = element24.removeAttr("");
        org.jsoup.parser.Tag tag30 = element24.tag();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element34 = element33.nextElementSibling();
        org.jsoup.nodes.Attributes attributes35 = element33.attributes();
        org.jsoup.nodes.Element element37 = element33.text("");
        int int38 = element33.siblingIndex();
        org.jsoup.nodes.Element element40 = element33.text("hi!");
        org.jsoup.select.Elements elements42 = element40.getElementsMatchingText("");
        java.util.List<org.jsoup.nodes.Node> nodeList43 = element40.childNodesCopy();
        org.jsoup.select.Elements elements44 = element40.parents();
        org.jsoup.parser.Tag tag45 = element40.tag();
        org.jsoup.nodes.Element element47 = new org.jsoup.nodes.Element(tag45, "<hi!></hi!>");
        org.jsoup.nodes.Element element50 = new org.jsoup.nodes.Element("hi!");
        element50.setBaseUri("hi!");
        org.jsoup.select.Elements elements54 = element50.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Attributes attributes55 = element50.attributes();
        org.jsoup.nodes.Element element56 = new org.jsoup.nodes.Element(tag45, "<hi!>\n hi!\n</hi!>", attributes55);
        org.jsoup.nodes.Element element57 = new org.jsoup.nodes.Element(tag30, "<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>", attributes55);
        int int58 = element57.siblingIndex();
        org.jsoup.nodes.Element element59 = element1.doClone((org.jsoup.nodes.Node) element57);
        org.jsoup.nodes.Node node60 = element57.nextSibling();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNull(element18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str25, "<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNull(element34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertNotNull(attributes55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNull(node60);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
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
        org.jsoup.select.Elements elements32 = element28.getElementsByAttribute("<hi! hi!=\"<hi!></hi!>\">\n &lt;hi! value=\"hi!\"&gt; hi! &lt;/hi!&gt;\n</hi!>");
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
        org.junit.Assert.assertNotNull(elements32);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.select.Elements elements7 = element1.getAllElements();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = element1.textNodes();
        org.jsoup.select.Elements elements9 = element1.children();
        org.jsoup.nodes.Node node10 = element1.root();
        org.jsoup.nodes.Element element12 = element1.appendElement("<hi! hi!=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Node node14 = element1.removeAttr("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;");
        java.lang.String str15 = element1.val();
        boolean boolean16 = element1.hasParent();
        org.jsoup.select.Elements elements17 = element1.getAllElements();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(textNodeList8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.parser.Tag tag5 = element1.tag();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList6 = element1.textNodes();
        java.lang.String str7 = element1.data();
        java.lang.String str8 = element1.nodeName();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(textNodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
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
        org.jsoup.nodes.Element element19 = element17.removeClass("<hi! hi!=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element21 = element19.appendElement("<hi!>\n &lt;&lt;hi!&gt;&lt;/hi!&gt;&gt;\n <!--&lt;hi!&gt;&lt;/hi!&gt;-->\n</hi!>");
        org.jsoup.nodes.Element element24 = element19.attr("<hi! =\"hi!\">\n hi!\n</hi!>", false);
        org.jsoup.select.NodeFilter nodeFilter25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = element24.filter(nodeFilter25);
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
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
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
        boolean boolean28 = element24.hasAttr("<hi!>\n <hi!></hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = element24.is("<<hi!></hi!> class=\"<hi!></hi!>\" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n</<hi!></hi!>>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<<hi!></hi!> class=\"<hi!></hi!>\" value=\"<hi!>? <hi!></hi!>?</hi!>\">?</<hi!></hi!>>': unexpected token at '<<hi!></hi!> class=\"<hi!></hi!>\" value=\"<hi!>? <hi!></hi!>?</hi!>\">?</<hi!></hi!>>'");
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.siblingElements();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element1.childNodes;
        java.lang.String str8 = element1.id();
        org.jsoup.nodes.Element element10 = element1.appendText("<hi! <hi!></hi!>=\"<hi!>\n hi!\n</hi!>\"></hi!>");
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueContaining("<hi! =\"hi!\">\n hi!\n</hi!>", "<hi!> \n <hi!></hi!> \n</hi!>");
        org.jsoup.nodes.Element element15 = element10.val("<hi!>\n <hi!></hi!>hi!\n</hi!>");
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements19 = element17.getElementsByClass("hi!");
        org.jsoup.select.Elements elements20 = element17.getAllElements();
        boolean boolean21 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element24 = element17.attr("", "hi!");
        java.lang.String str25 = element24.html();
        org.jsoup.nodes.Element element27 = element24.appendElement("<hi!></hi!>");
        java.lang.String[] strArray31 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.jsoup.nodes.Element element34 = element27.classNames((java.util.Set<java.lang.String>) strSet32);
        org.jsoup.nodes.Element element36 = element34.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element38 = element36.text("");
        org.jsoup.nodes.Element element40 = element38.append("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element42 = element40.text("");
        org.jsoup.nodes.Element element44 = element42.html("<hi!></hi!>");
        org.jsoup.nodes.Element element46 = element42.prependElement("<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;\n</<hi!></hi!>>");
        org.jsoup.nodes.Element element47 = element10.doClone((org.jsoup.nodes.Node) element46);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element47);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
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
        org.jsoup.nodes.Element element46 = element24.append("<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements48 = element46.getElementsByIndexEquals((int) (byte) 1);
        org.jsoup.nodes.Element element50 = element46.getElementById("<hi!>\n <hi!></hi!>hi!\n</hi!>");
        org.jsoup.nodes.Element element52 = element46.prependElement("<hi!>\n &lt;hi!&gt; &lt;hi!&gt; hi! &lt;/hi!&gt; &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt;\n <<hi! =\"hi!\">\n</hi!>></<hi! =\"hi!\">\n</hi!>>\n</hi!>");
        java.util.Set<java.lang.String> strSet53 = element52.classNames();
        org.jsoup.nodes.Element element54 = element22.classNames(strSet53);
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
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNull(element50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNotNull(element54);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
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
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag14, "");
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag14, "<hi!></hi!>", attributes18);
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag14, "<hi! value=\"hi!\">\n hi!\n</hi!>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str9, "<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
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
        org.jsoup.select.Elements elements49 = element1.getElementsByAttributeValueEnding("<&lt;hi!&gt;&lt;/hi!&gt;></&lt;hi!&gt;&lt;/hi!&gt;>", "<hi!>\n hi!\n</hi!>");
        element1.setBaseUri("<hi! value=\"hi!\">\n hi!\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList52 = element1.childNodesCopy();
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
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(nodeList52);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element8 = element1.attr("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>", false);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = element8.dataset();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList10 = element8.textNodes();
        org.jsoup.nodes.Element element12 = element8.prependElement("<hi!> &lt;hi!&gt;&lt;/hi!&gt; </hi!>");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(textNodeList10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        java.lang.String str6 = element5.val();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element8.childNodes();
        org.jsoup.nodes.Element element10 = element5.appendTo(element8);
        org.jsoup.nodes.Element element12 = element10.html("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements14 = element10.getElementsContainingText("<hi!></hi!>");
        org.jsoup.nodes.Node node15 = element10.previousSibling();
        org.jsoup.nodes.Element element17 = element10.prependText("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element19 = element10.appendElement("<hi!>\n  &lt;hi! class=\"\"&gt;&lt;/hi!&gt; \n</hi!>");
        org.jsoup.parser.Tag tag20 = element10.tag();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag20, "");
        boolean boolean24 = element22.hasClass("<hi!>\n  &lt;hi! class=\"\"&gt;&lt;/hi!&gt; \n</hi!>");
        element22.nodelistChanged();
        java.lang.String str26 = element22.cssSelector();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
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
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element19 = element18.nextElementSibling();
        org.jsoup.nodes.Attributes attributes20 = element18.attributes();
        org.jsoup.nodes.Element element22 = element18.text("");
        int int23 = element18.siblingIndex();
        org.jsoup.nodes.Element element25 = element18.text("hi!");
        org.jsoup.select.Elements elements27 = element25.getElementsMatchingText("");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = element25.childNodesCopy();
        org.jsoup.select.Elements elements29 = element25.parents();
        boolean boolean30 = element15.hasSameValue((java.lang.Object) elements29);
        org.jsoup.nodes.Element element32 = element15.wrap("<hi!>\n <hi!></hi!>\n</hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList33 = element32.textNodes();
        boolean boolean34 = element32.hasText();
        org.jsoup.nodes.Node node35 = element32.previousSibling();
        org.jsoup.nodes.Element element36 = element32.shallowClone();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(textNodeList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(element36);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = element1.textNodes();
        org.jsoup.nodes.Attributes attributes9 = element1.attributes();
        org.jsoup.select.Elements elements11 = element1.getElementsContainingText("hi!");
        org.jsoup.select.Elements elements14 = element1.getElementsByAttributeValueNot("<hi! class=\"\"></hi!>", "<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Node node15 = element1.nextSibling();
        org.jsoup.select.Elements elements17 = element1.getElementsMatchingText("");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(textNodeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
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
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements31 = element29.getElementsByClass("hi!");
        org.jsoup.nodes.Element element33 = element29.html("");
        java.lang.String str34 = element33.val();
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList37 = element36.childNodes();
        org.jsoup.nodes.Element element38 = element33.appendTo(element36);
        org.jsoup.select.Elements elements40 = element36.getElementsByTag("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element41 = element24.insertChildren((int) (byte) 1, (java.util.Collection<org.jsoup.nodes.Element>) elements40);
        org.jsoup.nodes.Element element43 = element41.appendText("");
        org.jsoup.nodes.Element element45 = element41.after("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList46 = element41.siblingNodes();
        org.jsoup.nodes.Node node47 = element41.root();
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
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(node47);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
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
        org.jsoup.nodes.Element element15 = element1.append("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements17 = element15.getElementsByTag("&lt;hi! =\"\"&gt;&lt;/hi!&gt;");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
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
        org.jsoup.nodes.Element element29 = element28.shallowClone();
        org.jsoup.nodes.Element element30 = element29.nextElementSibling();
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
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNull(element30);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
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
        org.jsoup.nodes.Element element33 = element31.val("<hi! =\"hi!\">\n hi!\n</hi!>");
        java.lang.Object obj34 = null;
        boolean boolean35 = element33.equals(obj34);
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
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
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
        java.lang.String str31 = element26.data();
        org.jsoup.nodes.Element element32 = element26.empty();
        org.jsoup.select.Elements elements34 = element26.getElementsByAttribute("hi!<hi!></hi!>");
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements34);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = element1.textNodes();
        org.jsoup.nodes.Element element10 = element1.addClass("");
        element10.nodelistChanged();
        java.lang.String str12 = element10.id();
        org.jsoup.select.Elements elements14 = element10.getElementsContainingOwnText("<hi!>\n <<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n  <hi! class=\"\"></hi!>\n </<hi!></hi!>>\n</hi!>");
        java.lang.String str15 = element10.ownText();
        java.lang.String str16 = element10.html();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(textNodeList8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.select.Elements elements6 = element1.getElementsContainingText("<hi!>\n <hi!></hi!>\n</hi!>");
        element1.setBaseUri("");
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
        org.jsoup.nodes.Element element30 = element24.shallowClone();
        boolean boolean31 = element24.hasParent();
        boolean boolean32 = element24.isBlock();
        org.jsoup.nodes.Node node33 = element24.clearAttributes();
        org.jsoup.nodes.Element element34 = element1.doClone((org.jsoup.nodes.Node) element24);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements6);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(element34);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
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
        boolean boolean28 = element24.hasAttr("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements31 = element24.getElementsByAttributeValueStarting("<hi!>\n <hi!></hi!>hi!\n</hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Element element32 = element24.parent();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element32);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
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
        org.jsoup.nodes.Element element31 = element1.toggleClass("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n <hi!>\n   hi! \n </hi!>\n</hi!>");
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
        org.junit.Assert.assertNotNull(element31);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.data();
        org.jsoup.nodes.Element element11 = element1.shallowClone();
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
        java.lang.String str44 = element13.ownText();
        org.jsoup.nodes.Element element45 = element1.appendTo(element13);
        org.jsoup.select.Elements elements47 = element45.getElementsContainingOwnText("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n <hi!>\n   hi! \n </hi!>\n</hi!>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(elements47);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("<hi!>\n <hi!>\n  <hi!>\n    hi! \n  </hi!>\n </hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(elements3);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
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
        java.lang.String str38 = element35.text();
        org.jsoup.select.Elements elements40 = element35.getElementsContainingText("<hi! value=\"&amp;lt;hi! class=&quot;&quot;&amp;gt;&amp;lt;/hi!&amp;gt;&amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt;\">\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!>\n  hi!\n </hi!>\n</hi!>");
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(elements40);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
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
        java.util.regex.Pattern pattern28 = null;
        org.jsoup.select.Elements elements29 = element26.getElementsByAttributeValueMatching("<hi! hi!=\"<hi!></hi!>\"></hi!>", pattern28);
        org.jsoup.select.Elements elements32 = element26.getElementsByAttributeValue("<hi!> \n <hi!></hi!> \n</hi!>", "<hi!> &lt;hi! class=\"\"&gt;&lt;/hi!&gt; </hi!>");
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements36 = element34.getElementsByClass("hi!");
        org.jsoup.select.Elements elements37 = element34.getAllElements();
        boolean boolean38 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element34);
        org.jsoup.select.Elements elements39 = element34.siblingElements();
        java.util.List<org.jsoup.nodes.Node> nodeList40 = element34.childNodes;
        java.lang.String str41 = element34.id();
        org.jsoup.nodes.Element element43 = element34.appendText("<hi! <hi!></hi!>=\"<hi!>\n hi!\n</hi!>\"></hi!>");
        org.jsoup.nodes.Element element45 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements47 = element45.getElementsByClass("hi!");
        org.jsoup.nodes.Element element49 = element45.html("");
        org.jsoup.nodes.Element element51 = element45.toggleClass("");
        org.jsoup.parser.Tag tag52 = element51.tag();
        org.jsoup.nodes.Element element54 = new org.jsoup.nodes.Element(tag52, "<hi!></hi!>");
        org.jsoup.nodes.Element element56 = new org.jsoup.nodes.Element(tag52, "<hi!></hi!>");
        org.jsoup.nodes.Element element58 = new org.jsoup.nodes.Element(tag52, "<hi!></hi!>");
        org.jsoup.nodes.Element element60 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element61 = element60.nextElementSibling();
        org.jsoup.nodes.Attributes attributes62 = element60.attributes();
        org.jsoup.nodes.Element element64 = element60.text("");
        int int65 = element60.siblingIndex();
        org.jsoup.nodes.Element element67 = element60.text("hi!");
        boolean boolean68 = element60.hasParent();
        java.lang.String str69 = element60.tagName();
        org.jsoup.nodes.Element element71 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element72 = element71.nextElementSibling();
        org.jsoup.nodes.Attributes attributes73 = element71.attributes();
        org.jsoup.nodes.Element element75 = element71.text("");
        int int76 = element71.siblingIndex();
        org.jsoup.select.Elements elements77 = element71.getAllElements();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList78 = element71.textNodes();
        org.jsoup.select.Elements elements79 = element71.children();
        java.util.Set<java.lang.String> strSet80 = element71.classNames();
        org.jsoup.nodes.Element element81 = element60.classNames(strSet80);
        boolean boolean82 = element58.equals((java.lang.Object) strSet80);
        org.jsoup.nodes.Element element83 = element43.classNames(strSet80);
        org.jsoup.nodes.Element element84 = element26.classNames(strSet80);
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
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertNull(element61);
        org.junit.Assert.assertNotNull(attributes62);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNull(element72);
        org.junit.Assert.assertNotNull(attributes73);
        org.junit.Assert.assertNotNull(element75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(elements77);
        org.junit.Assert.assertNotNull(textNodeList78);
        org.junit.Assert.assertNotNull(elements79);
        org.junit.Assert.assertNotNull(strSet80);
        org.junit.Assert.assertNotNull(element81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(element83);
        org.junit.Assert.assertNotNull(element84);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
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
        java.lang.String[] strArray36 = new java.lang.String[] { "<hi!>\n <hi!></hi!>\n</hi!>", "<hi! hi!=\"<hi!></hi!>\"></hi!>", "<hi! value=\"hi!\">\n hi!\n</hi!>", "<hi! value=\"hi!\">\n hi!\n</hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        org.jsoup.nodes.Element element39 = element31.classNames((java.util.Set<java.lang.String>) strSet37);
        org.jsoup.nodes.Element element41 = element31.append("");
        boolean boolean42 = element41.hasParent();
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
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "<hi!>\n <hi!></hi!>\n</hi!>", "<hi! hi!=\"<hi!></hi!>\"></hi!>", "<hi! value=\"hi!\">\n hi!\n</hi!>", "<hi! value=\"hi!\">\n hi!\n</hi!>" });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.parser.Tag tag5 = element1.tag();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag5, "<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag5, "<hi!>\n  &lt;hi! class=\"\"&gt;&lt;/hi!&gt; \n</hi!>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag5);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
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
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag14, "");
        org.jsoup.nodes.Element element17 = element16.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element16.childNodes;
        java.lang.String str19 = element16.html();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>\n hi!\n</hi!>" + "'", str9, "<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "hi!");
        org.jsoup.nodes.Node node11 = element10.root();
        int int12 = element10.siblingIndex();
        org.jsoup.nodes.Element element13 = element10.shallowClone();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements17 = element15.getElementsByClass("hi!");
        org.jsoup.select.Elements elements18 = element15.getAllElements();
        boolean boolean19 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Element element22 = element15.attr("", "hi!");
        java.lang.String str23 = element22.html();
        org.jsoup.nodes.Element element25 = element22.appendElement("<hi!></hi!>");
        java.lang.String[] strArray29 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        org.jsoup.nodes.Element element32 = element25.classNames((java.util.Set<java.lang.String>) strSet30);
        org.jsoup.nodes.Element element34 = element32.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element36 = element34.text("");
        org.jsoup.nodes.Element element38 = element36.append("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element42 = element41.nextElementSibling();
        boolean boolean43 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element41);
        int int44 = element41.siblingIndex();
        org.jsoup.nodes.Element element47 = element41.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements49 = element47.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements51 = element47.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element52 = element38.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements51);
        org.jsoup.nodes.Element element54 = element52.prependText("");
        org.jsoup.nodes.Element element56 = element52.prependText("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element58 = element56.tagName("<hi! class=\"<hi!>\n hi!\n</hi!>\"></hi!>");
        java.lang.String str60 = element58.absUrl("<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;\n</<hi!></hi!>>");
        org.jsoup.nodes.Element element61 = element10.doClone((org.jsoup.nodes.Node) element58);
        java.lang.String str62 = element61.nodeName();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNull(element42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.data();
        org.jsoup.nodes.Element element11 = element1.shallowClone();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element14 = element13.nextElementSibling();
        org.jsoup.nodes.Attributes attributes15 = element13.attributes();
        java.lang.String str16 = element13.cssSelector();
        org.jsoup.nodes.Element element18 = element13.prependText("hi!");
        org.jsoup.nodes.Element element19 = element18.empty();
        org.jsoup.nodes.Element element21 = element18.appendText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element18.siblingNodes();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements26 = element24.getElementsByClass("hi!");
        org.jsoup.select.Elements elements27 = element24.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = element24.childNodesCopy();
        java.util.Set<java.lang.String> strSet29 = element24.classNames();
        org.jsoup.nodes.Element element30 = element18.classNames(strSet29);
        org.jsoup.nodes.Element element31 = element1.classNames(strSet29);
        element1.doSetBaseUri("<hi! =\"hi!\">\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = element1.unwrap();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
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
        org.jsoup.nodes.Element element21 = element18.clone();
        org.jsoup.nodes.Element element23 = element21.val("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.select.Elements elements25 = element21.getElementsContainingText("<hi! class=\"\"></hi!>\n<hi!></hi!>\n<hi!></hi!>\n<hi!></hi!>\n<hi!></hi!>\n<hi!>\n hi!\n</hi!>");
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
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        java.lang.String str4 = element1.toString();
        java.lang.String str5 = element1.id();
        org.jsoup.nodes.Element element7 = element1.prepend("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        boolean boolean8 = element7.hasParent();
        org.jsoup.nodes.Element element10 = element7.tagName("<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\"></<hi!></hi!>>");
        java.lang.String str11 = element7.cssSelector();
        java.lang.String str12 = element7.cssSelector();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\"></<hi!></hi!>>" + "'", str11, "<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\"></<hi!></hi!>>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\"></<hi!></hi!>>" + "'", str12, "<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\"></<hi!></hi!>>");
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Element element5 = element1.attr("", "");
        boolean boolean7 = element5.hasClass("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element5.ensureChildNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element5.childNodesCopy();
        int int10 = element5.elementSiblingIndex();
        int int11 = element5.siblingIndex();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements7 = element5.getElementsByClass("hi!");
        org.jsoup.select.Elements elements8 = element5.getAllElements();
        boolean boolean9 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element5);
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueMatching("", "hi!");
        boolean boolean13 = element1.equals((java.lang.Object) element5);
        org.jsoup.nodes.Element element15 = element5.text("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n <hi!>\n   hi! \n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element17 = element5.appendText("<&lt;hi!&gt;&lt;/hi!&gt;></&lt;hi!&gt;&lt;/hi!&gt;>");
        org.jsoup.select.Elements elements19 = element17.getElementsByClass("<hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!>\n  hi!\n </hi!>\n</hi!>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.data();
        org.jsoup.nodes.Element element11 = element1.shallowClone();
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
        java.lang.String str44 = element13.ownText();
        org.jsoup.nodes.Element element45 = element1.appendTo(element13);
        org.jsoup.nodes.Element element47 = element13.prependText("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.select.Elements elements49 = element13.getElementsMatchingText("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element51 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements53 = element51.getElementsByClass("hi!");
        org.jsoup.nodes.Element element55 = element51.html("");
        org.jsoup.nodes.Element element56 = element55.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = element55.siblingNodes();
        org.jsoup.nodes.Element element59 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements61 = element59.getElementsByClass("hi!");
        org.jsoup.nodes.Element element63 = element59.html("");
        org.jsoup.nodes.Element element65 = element59.toggleClass("");
        java.lang.String str66 = element65.text();
        java.lang.String str67 = element65.id();
        org.jsoup.nodes.Element element68 = element55.doClone((org.jsoup.nodes.Node) element65);
        org.jsoup.nodes.Node node69 = element65.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList70 = element65.childNodes();
        org.jsoup.nodes.Element element72 = element65.prepend("");
        org.jsoup.nodes.Node node73 = element72.nextSibling();
        org.jsoup.nodes.Element element75 = element72.tagName("hi!");
        org.jsoup.nodes.Element element76 = element13.appendTo(element75);
        java.lang.String str77 = element76.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList78 = element76.childNodes;
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNull(element56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertNotNull(nodeList70);
        org.junit.Assert.assertNotNull(element72);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertNotNull(element75);
        org.junit.Assert.assertNotNull(element76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertNotNull(nodeList78);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
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
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element32 = element31.nextElementSibling();
        org.jsoup.nodes.Attributes attributes33 = element31.attributes();
        org.jsoup.nodes.Element element35 = element31.text("");
        int int36 = element31.siblingIndex();
        org.jsoup.nodes.Element element38 = element31.text("hi!");
        org.jsoup.select.Elements elements40 = element38.getElementsMatchingText("");
        element38.doSetBaseUri("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element44 = element38.toggleClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element47 = new org.jsoup.nodes.Element("hi!");
        element47.setBaseUri("hi!");
        org.jsoup.nodes.Element element50 = element47.empty();
        org.jsoup.select.Elements elements53 = element47.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element54 = element44.insertChildren((int) (byte) -1, (java.util.Collection<org.jsoup.nodes.Element>) elements53);
        org.jsoup.nodes.Element element56 = element44.text("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        int int57 = element44.childNodeSize();
        boolean boolean58 = element28.hasSameValue((java.lang.Object) int57);
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
        org.junit.Assert.assertNull(element32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
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
        java.lang.String str14 = element12.val();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element17 = element16.nextElementSibling();
        org.jsoup.nodes.Attributes attributes18 = element16.attributes();
        org.jsoup.nodes.Element element20 = element16.text("");
        int int21 = element16.siblingIndex();
        org.jsoup.select.Elements elements22 = element16.getAllElements();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList23 = element16.textNodes();
        org.jsoup.select.Elements elements24 = element16.children();
        java.util.Set<java.lang.String> strSet25 = element16.classNames();
        org.jsoup.nodes.Element element26 = element12.classNames(strSet25);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList27 = element26.textNodes();
        org.jsoup.select.Elements elements29 = element26.getElementsByIndexGreaterThan((-1));
        org.jsoup.nodes.Element element31 = element26.tagName("< class=\" \" value=\"\"> <hi! class=\"\"></hi!><hi!></hi!> >");
        org.jsoup.nodes.Element element33 = element26.prependElement("<hi! value=\"hi!\">\n hi!\n</hi!>");
        org.jsoup.nodes.Node node34 = element33.parentNode();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(textNodeList23);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(textNodeList27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
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
        org.jsoup.nodes.Element element20 = element18.toggleClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element21 = element18.previousElementSibling();
        org.jsoup.nodes.Element element23 = element18.tagName("<hi!>\n hi!\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!>\n  hi!\n </hi!>\n</hi!>");
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
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = element1.textNodes();
        org.jsoup.nodes.Node node9 = element1.clearAttributes();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element12 = element11.nextElementSibling();
        org.jsoup.nodes.Attributes attributes13 = element11.attributes();
        org.jsoup.nodes.Element element15 = element11.text("");
        int int16 = element11.siblingIndex();
        org.jsoup.nodes.Element element18 = element11.text("hi!");
        boolean boolean19 = element1.hasSameValue((java.lang.Object) element11);
        org.jsoup.select.Elements elements21 = element1.getElementsByIndexEquals((int) (short) 0);
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element24 = element23.nextElementSibling();
        org.jsoup.nodes.Attributes attributes25 = element23.attributes();
        org.jsoup.nodes.Element element27 = element23.text("");
        int int28 = element23.siblingIndex();
        org.jsoup.select.Elements elements29 = element23.getAllElements();
        org.jsoup.nodes.Element element30 = element1.prependChild((org.jsoup.nodes.Node) element23);
        org.jsoup.nodes.Element element32 = element1.val("<hi! value=\"<hi!>\n hi!\n</hi!>\"></hi!>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(textNodeList8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNull(element24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
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
        org.jsoup.select.NodeFilter nodeFilter24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = element15.filter(nodeFilter24);
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
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
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
        org.jsoup.nodes.Element element33 = element25.parent();
        org.jsoup.nodes.Element element35 = element25.val("hi! hi!");
        org.jsoup.select.Elements elements37 = element35.getElementsByIndexLessThan((int) (short) 0);
        java.lang.Class<?> wildcardClass38 = elements37.getClass();
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
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
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
        java.lang.String str14 = element12.val();
        java.lang.String str15 = element12.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = element12.select("<<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>></<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<<hi!>? &lt;hi!&gt;&lt;/hi!&gt;?</hi!>></<hi!>? &lt;hi!&gt;&lt;/hi!&gt;?</hi!>>': unexpected token at '<<hi!>? &lt;hi!&gt;&lt;/hi!&gt;?</hi!>></<hi!>? &lt;hi!&gt;&lt;/hi!&gt;?</hi!>>'");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<hi!></hi!>" + "'", str15, "<hi!></hi!>");
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element1.childNodesCopy();
        java.lang.String str6 = element1.outerHtml();
        org.jsoup.nodes.Element element7 = element1.shallowClone();
        org.jsoup.nodes.Element element8 = element7.nextElementSibling();
        boolean boolean9 = element7.isBlock();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element12 = element11.nextElementSibling();
        org.jsoup.nodes.Attributes attributes13 = element11.attributes();
        org.jsoup.nodes.Element element15 = element11.text("");
        int int16 = element11.siblingIndex();
        org.jsoup.nodes.Element element18 = element11.text("hi!");
        org.jsoup.select.Elements elements20 = element18.getElementsMatchingText("");
        element18.doSetBaseUri("<hi!>\n <hi!></hi!>\n</hi!>");
        boolean boolean24 = element18.hasClass("hi!");
        org.jsoup.nodes.Element element26 = element18.val("hi!");
        int int27 = element26.childNodeSize();
        java.lang.String str28 = element26.toString();
        java.lang.String str29 = element26.text();
        org.jsoup.nodes.Element element32 = element26.attr("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n <hi!>\n   hi! \n </hi!>\n</hi!>", "<hi! =\"hi!\">\n</hi!>");
        org.jsoup.nodes.Element element34 = element26.html("<hi! hi!=\"<hi!></hi!>\">\n <hi!> \n  <hi!> \n   <hi!>\n     hi! \n   </hi!> \n  </hi!> \n </hi!>\n</hi!>");
        element26.nodelistChanged();
        org.jsoup.nodes.Element element36 = element7.appendTo(element26);
        int int37 = element36.childNodeSize();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi!></hi!>" + "'", str6, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<hi! value=\"hi!\">\n hi!\n</hi!>" + "'", str28, "<hi! value=\"hi!\">\n hi!\n</hi!>");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
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
        org.jsoup.select.Elements elements28 = element24.getElementsByAttributeStarting("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.select.Elements elements31 = element24.getElementsByAttributeValueEnding("<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n <<hi!>\n hi!\n</hi!>></<hi!>\n hi!\n</hi!>>\n <hi! class=\"\"></hi!>\n</<hi!></hi!>>", "<hi!>\n <hi!>\n  <hi!>\n    hi! \n  </hi!>\n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element33 = element24.prepend("<hi!>\n <hi!>\n   hi! \n </hi!>\n</hi!>");
        org.jsoup.select.NodeFilter nodeFilter34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = element33.filter(nodeFilter34);
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
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element33);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "hi!");
        org.jsoup.nodes.Node node11 = element10.root();
        int int12 = element10.siblingIndex();
        org.jsoup.nodes.Element element14 = element10.prependElement("<hi! =\"hi!\">\n</hi!>");
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        element16.setBaseUri("hi!");
        org.jsoup.select.Elements elements20 = element16.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element24 = element23.nextElementSibling();
        boolean boolean25 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element23);
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element28 = element27.parent();
        org.jsoup.nodes.Node node29 = element27.parentNode();
        org.jsoup.select.Elements elements31 = element27.getElementsByIndexLessThan(1);
        boolean boolean32 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element27);
        org.jsoup.select.Elements elements33 = element27.children();
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements37 = element35.getElementsByClass("hi!");
        org.jsoup.nodes.Element element39 = element35.html("");
        org.jsoup.nodes.Element element40 = element39.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = element39.siblingNodes();
        org.jsoup.nodes.Element element43 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element44 = element43.parent();
        org.jsoup.nodes.Node node45 = element43.parentNode();
        org.jsoup.select.Elements elements47 = element43.getElementsByIndexLessThan(1);
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element50 = element49.nextElementSibling();
        org.jsoup.nodes.Attributes attributes51 = element49.attributes();
        org.jsoup.nodes.Element element53 = element49.text("");
        int int54 = element49.siblingIndex();
        org.jsoup.nodes.Element element56 = element49.text("hi!");
        boolean boolean57 = element49.hasParent();
        java.lang.String str58 = element49.tagName();
        org.jsoup.nodes.Node[] nodeArray59 = new org.jsoup.nodes.Node[] { element23, element27, element39, element43, element49 };
        org.jsoup.nodes.Element element60 = element16.insertChildren((int) (short) 0, nodeArray59);
        org.jsoup.nodes.Element element61 = element16.shallowClone();
        org.jsoup.nodes.Document document62 = element61.ownerDocument();
        int int63 = element61.childNodeSize();
        org.jsoup.nodes.Element element64 = element61.shallowClone();
        org.jsoup.select.Elements elements66 = element61.getElementsMatchingOwnText("<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;\n</<hi!></hi!>>");
        org.jsoup.nodes.Element element67 = element10.appendChild((org.jsoup.nodes.Node) element61);
        java.lang.String str68 = element67.ownText();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNull(element24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(element28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNull(element40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNull(element44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNull(element50);
        org.junit.Assert.assertNotNull(attributes51);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNotNull(nodeArray59);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNull(document62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(elements66);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
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
        org.jsoup.select.Elements elements34 = element25.getElementsContainingText("hi!");
        org.jsoup.nodes.Element element36 = element25.tagName("<hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!>\n  hi!\n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements40 = element38.getElementsByClass("hi!");
        org.jsoup.nodes.Element element42 = element38.html("");
        org.jsoup.nodes.Element element43 = element42.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList44 = element42.siblingNodes();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements48 = element46.getElementsByClass("hi!");
        org.jsoup.nodes.Element element50 = element46.html("");
        org.jsoup.nodes.Element element52 = element46.toggleClass("");
        java.lang.String str53 = element52.text();
        java.lang.String str54 = element52.id();
        org.jsoup.nodes.Element element55 = element42.doClone((org.jsoup.nodes.Node) element52);
        org.jsoup.nodes.Node node56 = element52.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = element52.childNodes();
        org.jsoup.nodes.Element element59 = element52.prepend("");
        org.jsoup.nodes.Element element61 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element62 = element61.nextElementSibling();
        org.jsoup.nodes.Attributes attributes63 = element61.attributes();
        org.jsoup.nodes.Element element65 = element61.text("");
        int int66 = element61.siblingIndex();
        org.jsoup.nodes.Element element68 = element61.text("hi!");
        org.jsoup.nodes.Element element69 = element52.prependChild((org.jsoup.nodes.Node) element68);
        org.jsoup.nodes.Element element70 = element69.shallowClone();
        org.jsoup.parser.Tag tag71 = element70.tag();
        org.jsoup.nodes.Element element73 = element70.tagName("<hi!> &lt;hi! class=\"\"&gt;&lt;/hi!&gt; </hi!>");
        org.jsoup.nodes.Element element74 = element36.appendTo(element70);
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
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNull(element43);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNull(element62);
        org.junit.Assert.assertNotNull(attributes63);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertNotNull(tag71);
        org.junit.Assert.assertNotNull(element73);
        org.junit.Assert.assertNotNull(element74);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
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
        org.jsoup.nodes.Element element36 = element35.clone();
        org.jsoup.nodes.Element element38 = element35.prependText("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;");
        org.jsoup.nodes.Element element41 = element38.attr("<hi!>\n <hi!></hi!>hi!\n</hi!>", "");
        java.lang.String str42 = element41.tagName();
        org.jsoup.select.Elements elements43 = element41.getAllElements();
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
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(elements43);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element1.childNodesCopy();
        boolean boolean6 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.prependText("");
        int int9 = element8.elementSiblingIndex();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
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
        java.lang.String str23 = element22.className();
        org.jsoup.nodes.Element element25 = element22.append("hi!");
        org.jsoup.nodes.Element element28 = element25.attr("<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\"></<hi!></hi!>>", "&lt;hi!&gt;&lt;/hi!&gt;");
        org.jsoup.nodes.Element element29 = element25.firstElementSibling();
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
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNull(element29);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element9 = element6.appendText("<hi!></hi!>");
        java.lang.String str10 = element9.html();
        element9.doSetBaseUri("<hi! value=\"hi!\">\n hi!\n</hi!>");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "&lt;hi!&gt;&lt;/hi!&gt;" + "'", str10, "&lt;hi!&gt;&lt;/hi!&gt;");
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.lang.String str8 = element1.html();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList9 = element1.dataNodes();
        org.jsoup.nodes.Document document10 = element1.ownerDocument();
        element1.doSetBaseUri("hi!");
        org.jsoup.nodes.Element element13 = element1.shallowClone();
        java.lang.String str14 = element1.id();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element1.ensureChildNodes();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(dataNodeList9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.lang.String str8 = element7.text();
        org.jsoup.select.Elements elements11 = element7.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Element element12 = element7.clone();
        org.jsoup.select.Elements elements13 = element7.children();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
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
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements29 = element27.getElementsByClass("hi!");
        org.jsoup.select.Elements elements30 = element27.getAllElements();
        boolean boolean31 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element27);
        org.jsoup.nodes.Element element34 = element27.attr("", "hi!");
        java.lang.String str35 = element34.html();
        org.jsoup.nodes.Element element37 = element34.appendElement("<hi!></hi!>");
        java.lang.String[] strArray41 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        org.jsoup.nodes.Element element44 = element37.classNames((java.util.Set<java.lang.String>) strSet42);
        org.jsoup.nodes.Element element46 = element44.val("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element48 = element46.text("");
        org.jsoup.nodes.Element element50 = element48.append("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element52 = element50.text("");
        org.jsoup.nodes.Element element54 = element52.html("<hi!></hi!>");
        org.jsoup.nodes.Element element56 = element52.appendText("<hi!> &lt;hi! class=\"\"&gt;&lt;/hi!&gt; </hi!>");
        org.jsoup.nodes.Element element57 = element24.before((org.jsoup.nodes.Node) element52);
        java.util.List<org.jsoup.nodes.Node> nodeList58 = element24.childNodesCopy();
        org.jsoup.nodes.Element element60 = element24.after("<hi! class=\"\">\n <hi! class=\"\"></hi!>\n</hi!>");
        java.lang.String str61 = element24.id();
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
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
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
        org.jsoup.nodes.Element element29 = element24.append("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element31 = element29.prependElement("<hi! =\"\"></hi!>");
        java.lang.String str32 = element29.data();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element35 = element34.nextElementSibling();
        boolean boolean36 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element34);
        int int37 = element34.siblingIndex();
        org.jsoup.nodes.Element element40 = element34.attr("hi!", "<hi!></hi!>");
        java.lang.String str41 = element34.cssSelector();
        boolean boolean43 = element34.hasClass("<hi!></hi!>");
        org.jsoup.nodes.Element element45 = element34.val("");
        org.jsoup.nodes.Element element46 = element29.doClone((org.jsoup.nodes.Node) element34);
        boolean boolean47 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element29);
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
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
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
        org.jsoup.nodes.Node node25 = element21.previousSibling();
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
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        java.lang.String str6 = element5.val();
        org.jsoup.nodes.Element element8 = element5.prependElement("<hi! hi!=\"<hi!></hi!>\"></hi!>");
        org.jsoup.select.Elements elements10 = element5.getElementsMatchingOwnText("&lt;hi!&gt;&lt;/hi!&gt;");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.nextElementSibling();
        boolean boolean14 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element12);
        int int15 = element12.siblingIndex();
        org.jsoup.nodes.Element element18 = element12.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements20 = element18.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements22 = element18.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements24 = element18.getElementsByTag("hi!");
        org.jsoup.nodes.Element element26 = element18.tagName("hi!");
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        element28.setBaseUri("hi!");
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element33 = element32.nextElementSibling();
        org.jsoup.nodes.Attributes attributes34 = element32.attributes();
        org.jsoup.nodes.Element element36 = element32.text("");
        int int37 = element32.siblingIndex();
        org.jsoup.nodes.Element element39 = element32.text("hi!");
        boolean boolean40 = element32.hasParent();
        java.lang.String str41 = element32.tagName();
        org.jsoup.nodes.Element element43 = element32.text("<hi!></hi!>");
        java.lang.String str44 = element32.data();
        org.jsoup.nodes.Element element45 = element28.appendChild((org.jsoup.nodes.Node) element32);
        org.jsoup.select.Elements elements46 = element32.children();
        org.jsoup.nodes.Element element48 = element32.html("<&lt;hi!&gt;&lt;/hi!&gt;></&lt;hi!&gt;&lt;/hi!&gt;>");
        org.jsoup.select.Elements elements51 = element48.getElementsByAttributeValueContaining("<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt;\n</hi!>\">\n &lt;hi!&gt; &amp;lt;hi! class=\"\"&amp;gt;&amp;lt;/hi!&amp;gt; &lt;/hi!&gt;\n <hi!></hi!>\n</<hi!></hi!>>", "<hi! class=\"\"></hi!>");
        boolean boolean52 = element18.equals((java.lang.Object) "<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt;\n</hi!>\">\n &lt;hi!&gt; &amp;lt;hi! class=\"\"&amp;gt;&amp;lt;/hi!&amp;gt; &lt;/hi!&gt;\n <hi!></hi!>\n</<hi!></hi!>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element53 = element5.before((org.jsoup.nodes.Node) element18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNull(element33);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        java.lang.String str6 = element5.data();
        org.jsoup.nodes.Element element8 = element5.appendText("&lt;hi!&gt;&lt;/hi!&gt;");
        java.lang.String str10 = element5.attr("<hi! hi!=\"<hi!></hi!>\" value=\"<hi! =&quot;&quot;></hi!>\">\n <hi!>\n   hi! \n </hi!>\n <hi!>\n  <hi!>\n    hi! \n  </hi!>\n </hi!>\n <hi! value=\"hi!\">\n   hi! \n </hi!>\n</hi!>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = element1.childNodes();
        org.jsoup.select.Elements elements5 = element1.getElementsByAttributeValue("<hi!></hi!>", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element1.siblingNodes();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.nextElementSibling();
        org.jsoup.nodes.Element element13 = element9.attr("", "");
        java.lang.String str14 = element9.id();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements18 = element16.getElementsByClass("hi!");
        org.jsoup.nodes.Element element20 = element16.html("");
        org.jsoup.nodes.Element element22 = element16.toggleClass("");
        java.lang.String str23 = element22.text();
        org.jsoup.select.Elements elements26 = element22.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements30 = element28.getElementsByClass("hi!");
        org.jsoup.nodes.Element element32 = element28.html("");
        org.jsoup.nodes.Element element34 = element28.toggleClass("");
        java.util.List<org.jsoup.nodes.Node> nodeList35 = element34.childNodes;
        element22.childNodes = nodeList35;
        element9.childNodes = nodeList35;
        java.util.List<org.jsoup.nodes.Node> nodeList38 = element9.childNodes();
        org.jsoup.nodes.Element element39 = element1.doClone((org.jsoup.nodes.Node) element9);
        org.jsoup.nodes.Element element41 = element9.getElementById("<hi!>\n  &lt;hi!&gt; &lt;hi!&gt; hi! &lt;/hi!&gt; &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt; &lt;\n <hi! =\"hi!\"> \n </hi!>&gt;\n <!--<hi! =\"hi!\"--> \n</hi!>&gt;");
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNull(element41);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
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
        org.jsoup.nodes.Element element18 = element16.before("<hi! hi!=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element20 = element16.appendElement("<hi!></hi!>\n<hi!></hi!>\n<hi!></hi!>\n<hi!></hi!>\n<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
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
        java.lang.String str23 = element15.text();
        java.lang.String str24 = element15.val();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.lang.String str8 = element7.text();
        org.jsoup.select.Elements elements11 = element7.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi!></hi!>");
        java.lang.String str12 = element7.toString();
        java.lang.String str14 = element7.attr("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements16 = element7.getElementsByIndexEquals((int) 'a');
        org.jsoup.parser.Tag tag17 = element7.tag();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element21 = element20.parent();
        org.jsoup.nodes.Node node22 = element20.parentNode();
        org.jsoup.select.Elements elements24 = element20.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList25 = element20.childNodes;
        org.jsoup.nodes.Element element27 = element20.prepend("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements28 = element20.siblingElements();
        org.jsoup.nodes.Attributes attributes29 = element20.attributes();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element(tag17, "<hi! hi!=\"<hi!></hi!>\">\n &lt;hi! value=\"hi!\"&gt; hi! &lt;/hi!&gt;\n</hi!>", attributes29);
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element(tag17, "");
        org.jsoup.nodes.Element element34 = element32.prepend("<hi! class=\"\">\n <hi! class=\"\"></hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!>\n  hi!\n </hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str12, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(element34);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        element8.doSetBaseUri("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element14 = element8.toggleClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        element17.setBaseUri("hi!");
        org.jsoup.nodes.Element element20 = element17.empty();
        org.jsoup.select.Elements elements23 = element17.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element24 = element14.insertChildren((int) (byte) -1, (java.util.Collection<org.jsoup.nodes.Element>) elements23);
        org.jsoup.nodes.Element element25 = element14.clone();
        org.jsoup.select.Elements elements28 = element25.getElementsByAttributeValueStarting("<hi! =\"hi!\">\n <<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n </<hi!></hi!>>\n <hi!> \n  <hi!></hi!>hi! \n </hi!>\n <hi!>\n   &lt;hi!&gt;&lt;/hi!&gt; \n  <hi!>\n    hi! \n  </hi!> \n </hi!>\n</hi!>", "<<hi!>\n &lt;&lt;hi!&gt;&lt;/hi!&gt;&gt;\n <!--&lt;hi!&gt;&lt;/hi!&gt;-->\n</hi!>></<hi!>\n &lt;&lt;hi!&gt;&lt;/hi!&gt;&gt;\n <!--&lt;hi!&gt;&lt;/hi!&gt;-->\n</hi!>>");
        java.lang.String str29 = element25.val();
        org.jsoup.nodes.Element element31 = element25.getElementById("&lt;hi!&gt;&lt;/hi!&gt;");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(element31);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        java.lang.String str8 = element6.attr("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;");
        org.jsoup.nodes.Node node9 = element6.previousSibling();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
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
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element14.childNodesCopy();
        org.jsoup.select.Elements elements17 = element14.getElementsContainingOwnText("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element19 = element14.append("<hi! =\"hi!\">\n</hi!>");
        org.jsoup.select.Elements elements20 = element14.parents();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
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
        boolean boolean31 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element24);
        java.util.List<org.jsoup.nodes.Node> nodeList32 = element24.siblingNodes();
        org.jsoup.nodes.Element element34 = element24.val("<hi! value=\"hi!\">\n hi!\n</hi!>");
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element("hi!");
        element36.setBaseUri("hi!");
        org.jsoup.select.Elements elements40 = element36.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element43 = element36.attr("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>", false);
        org.jsoup.nodes.Element element45 = element36.appendElement("<hi! =\"hi!\">\n</hi!>");
        org.jsoup.nodes.Element element47 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element48 = element47.nextElementSibling();
        org.jsoup.nodes.Attributes attributes49 = element47.attributes();
        org.jsoup.nodes.Element element51 = element47.text("");
        int int52 = element47.siblingIndex();
        org.jsoup.nodes.Element element54 = element47.text("hi!");
        boolean boolean55 = element47.hasParent();
        java.lang.String str56 = element47.data();
        org.jsoup.nodes.Element element57 = element47.shallowClone();
        org.jsoup.nodes.Element element59 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element60 = element59.nextElementSibling();
        org.jsoup.nodes.Attributes attributes61 = element59.attributes();
        java.lang.String str62 = element59.cssSelector();
        org.jsoup.nodes.Element element64 = element59.prependText("hi!");
        org.jsoup.nodes.Element element65 = element64.empty();
        org.jsoup.nodes.Element element67 = element64.appendText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList68 = element64.siblingNodes();
        org.jsoup.nodes.Element element70 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements72 = element70.getElementsByClass("hi!");
        org.jsoup.select.Elements elements73 = element70.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList74 = element70.childNodesCopy();
        java.util.Set<java.lang.String> strSet75 = element70.classNames();
        org.jsoup.nodes.Element element76 = element64.classNames(strSet75);
        org.jsoup.nodes.Element element77 = element47.classNames(strSet75);
        org.jsoup.nodes.Element element78 = element36.classNames(strSet75);
        java.lang.String str79 = element36.baseUri();
        org.jsoup.nodes.Element element80 = element24.before((org.jsoup.nodes.Node) element36);
        org.jsoup.nodes.Element element82 = element80.text("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;");
        org.jsoup.nodes.Element element84 = element82.appendText("");
        org.jsoup.nodes.Element element86 = element84.prepend("<hi!></hi!>.<hi!></hi!>");
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNull(element48);
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNull(element60);
        org.junit.Assert.assertNotNull(attributes61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertNotNull(elements72);
        org.junit.Assert.assertNotNull(elements73);
        org.junit.Assert.assertNotNull(nodeList74);
        org.junit.Assert.assertNotNull(strSet75);
        org.junit.Assert.assertNotNull(element76);
        org.junit.Assert.assertNotNull(element77);
        org.junit.Assert.assertNotNull(element78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertNotNull(element80);
        org.junit.Assert.assertNotNull(element82);
        org.junit.Assert.assertNotNull(element84);
        org.junit.Assert.assertNotNull(element86);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = element1.textNodes();
        org.jsoup.select.Elements elements10 = element1.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements12 = element1.getElementsContainingOwnText("<hi!>\n <hi!></hi!>\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element1.childNodesCopy();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(textNodeList8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
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
        org.jsoup.select.Elements elements17 = element1.getElementsByAttributeValue("<hi! class=\"\"></hi!>", "<hi! value=\"hi!\">\n hi!\n</hi!>");
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element20 = element19.nextElementSibling();
        org.jsoup.nodes.Attributes attributes21 = element19.attributes();
        org.jsoup.nodes.Element element23 = element19.text("");
        int int24 = element19.siblingIndex();
        org.jsoup.nodes.Element element26 = element19.text("hi!");
        org.jsoup.select.Elements elements28 = element26.getElementsMatchingText("");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = element26.childNodesCopy();
        org.jsoup.select.Elements elements30 = element26.parents();
        org.jsoup.parser.Tag tag31 = element26.tag();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag31, "<hi!></hi!>");
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element("hi!");
        element36.setBaseUri("hi!");
        org.jsoup.select.Elements elements40 = element36.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Attributes attributes41 = element36.attributes();
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element(tag31, "<hi!>\n hi!\n</hi!>", attributes41);
        boolean boolean43 = element42.hasAttributes();
        java.lang.String str44 = element42.tagName();
        org.jsoup.nodes.Element element46 = element42.html("");
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements50 = element48.getElementsByClass("hi!");
        org.jsoup.select.Elements elements51 = element48.getAllElements();
        boolean boolean52 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element48);
        org.jsoup.nodes.Element element55 = element48.attr("", "hi!");
        org.jsoup.nodes.Element element57 = element48.appendText("");
        org.jsoup.nodes.Element element58 = element46.doClone((org.jsoup.nodes.Node) element48);
        org.jsoup.nodes.Element element59 = element1.appendChild((org.jsoup.nodes.Node) element58);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(element59);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
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
        java.lang.String str29 = element24.absUrl("<hi! class=\"<hi! class=&quot;&quot;></hi!> <hi! class=&quot;&quot;></hi!>\">\n hi!\n</hi!>");
        org.jsoup.select.NodeVisitor nodeVisitor30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = element24.traverse(nodeVisitor30);
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
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element9 = element6.appendText("<hi!></hi!>");
        java.lang.String str10 = element9.className();
        org.jsoup.nodes.Element element11 = element9.empty();
        org.jsoup.nodes.Element element13 = element9.html("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        java.lang.String str14 = element9.cssSelector();
        boolean boolean15 = element9.hasText();
        org.jsoup.nodes.Element element17 = element9.removeClass("<hi! value=\"hi!\">\n hi!\n</hi!>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
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
        org.jsoup.nodes.Element element18 = element1.nextElementSibling();
        org.jsoup.select.Elements elements20 = element1.getElementsContainingOwnText("<hi!>\n <<hi! hi!=\"<hi!></hi!>\"></hi!>></<hi! hi!=\"<hi!></hi!>\"></hi!>>\n <<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>></<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>>\n</hi!>");
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element24 = element23.nextElementSibling();
        boolean boolean25 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element23);
        element23.doSetBaseUri("hi!");
        boolean boolean28 = element23.hasText();
        org.jsoup.nodes.Node node29 = element23.nextSibling();
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element33 = element32.nextElementSibling();
        org.jsoup.nodes.Attributes attributes34 = element32.attributes();
        org.jsoup.nodes.Element element36 = element32.text("");
        int int37 = element32.siblingIndex();
        org.jsoup.nodes.Element element39 = element32.text("hi!");
        org.jsoup.select.Elements elements41 = element39.getElementsMatchingText("");
        java.util.List<org.jsoup.nodes.Node> nodeList42 = element39.childNodesCopy();
        org.jsoup.select.Elements elements44 = element39.getElementsByIndexLessThan((int) (byte) 1);
        java.lang.String str45 = element39.id();
        boolean boolean46 = element39.isBlock();
        org.jsoup.select.Elements elements47 = element39.siblingElements();
        org.jsoup.nodes.Element element50 = new org.jsoup.nodes.Element("hi!");
        element50.setBaseUri("hi!");
        org.jsoup.select.Elements elements54 = element50.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element57 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element58 = element57.nextElementSibling();
        boolean boolean59 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element57);
        org.jsoup.nodes.Element element61 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element62 = element61.parent();
        org.jsoup.nodes.Node node63 = element61.parentNode();
        org.jsoup.select.Elements elements65 = element61.getElementsByIndexLessThan(1);
        boolean boolean66 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element61);
        org.jsoup.select.Elements elements67 = element61.children();
        org.jsoup.nodes.Element element69 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements71 = element69.getElementsByClass("hi!");
        org.jsoup.nodes.Element element73 = element69.html("");
        org.jsoup.nodes.Element element74 = element73.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList75 = element73.siblingNodes();
        org.jsoup.nodes.Element element77 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element78 = element77.parent();
        org.jsoup.nodes.Node node79 = element77.parentNode();
        org.jsoup.select.Elements elements81 = element77.getElementsByIndexLessThan(1);
        org.jsoup.nodes.Element element83 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element84 = element83.nextElementSibling();
        org.jsoup.nodes.Attributes attributes85 = element83.attributes();
        org.jsoup.nodes.Element element87 = element83.text("");
        int int88 = element83.siblingIndex();
        org.jsoup.nodes.Element element90 = element83.text("hi!");
        boolean boolean91 = element83.hasParent();
        java.lang.String str92 = element83.tagName();
        org.jsoup.nodes.Node[] nodeArray93 = new org.jsoup.nodes.Node[] { element57, element61, element73, element77, element83 };
        org.jsoup.nodes.Element element94 = element50.insertChildren((int) (short) 0, nodeArray93);
        org.jsoup.nodes.Element element95 = element39.insertChildren((-1), nodeArray93);
        org.jsoup.nodes.Element element96 = element23.insertChildren((-1), nodeArray93);
        org.jsoup.nodes.Element element97 = element1.insertChildren((int) (byte) -1, nodeArray93);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!></hi!>" + "'", str9, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNull(element18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNull(element24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(element33);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertNull(element58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(element62);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNotNull(elements65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(elements67);
        org.junit.Assert.assertNotNull(elements71);
        org.junit.Assert.assertNotNull(element73);
        org.junit.Assert.assertNull(element74);
        org.junit.Assert.assertNotNull(nodeList75);
        org.junit.Assert.assertNull(element78);
        org.junit.Assert.assertNull(node79);
        org.junit.Assert.assertNotNull(elements81);
        org.junit.Assert.assertNull(element84);
        org.junit.Assert.assertNotNull(attributes85);
        org.junit.Assert.assertNotNull(element87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(element90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "hi!" + "'", str92, "hi!");
        org.junit.Assert.assertNotNull(nodeArray93);
        org.junit.Assert.assertNotNull(element94);
        org.junit.Assert.assertNotNull(element95);
        org.junit.Assert.assertNotNull(element96);
        org.junit.Assert.assertNotNull(element97);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
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
        org.jsoup.nodes.Element element24 = element18.before("&lt;hi!&gt; &amp;lt;hi! class=\"\"&amp;gt;&amp;lt;/hi!&amp;gt; &lt;/hi!&gt;\n<hi!></hi!>");
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
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Element element5 = element1.attr("", "");
        org.jsoup.nodes.Node node6 = element1.previousSibling();
        org.jsoup.nodes.Element element9 = element1.attr("<hi!>\n <hi!></hi!>hi!\n</hi!>", false);
        org.jsoup.nodes.Element element11 = element9.addClass("");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements10 = element7.getElementsByAttributeValueMatching("<hi!>\n <hi!></hi!>\n</hi!>", "");
        org.jsoup.select.Elements elements13 = element7.getElementsByAttributeValueMatching("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element15 = element7.append("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;");
        org.jsoup.nodes.Element element18 = element15.attr("hi! hi!", true);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "hi!");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        org.jsoup.select.Elements elements14 = element12.getElementsContainingOwnText("hi!");
        java.lang.String str15 = element12.baseUri();
        org.jsoup.select.Elements elements17 = element12.getElementsByIndexGreaterThan((int) (byte) 10);
        org.jsoup.nodes.Attributes attributes18 = element12.attributes();
        element12.doSetBaseUri("<<hi!>\n &lt;&lt;hi!&gt;&lt;/hi!&gt;&gt;\n <!--&lt;hi!&gt;&lt;/hi!&gt;-->\n</hi!>></<hi!>\n &lt;&lt;hi!&gt;&lt;/hi!&gt;&gt;\n <!--&lt;hi!&gt;&lt;/hi!&gt;-->\n</hi!>>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<hi!></hi!>" + "'", str15, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements13 = element11.getElementsByClass("hi!");
        org.jsoup.nodes.Element element15 = element11.html("");
        org.jsoup.nodes.Element element17 = element11.toggleClass("");
        org.jsoup.parser.Tag tag18 = element17.tag();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements23 = element21.getElementsByClass("hi!");
        org.jsoup.nodes.Element element25 = element21.html("");
        org.jsoup.nodes.Element element27 = element21.toggleClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList28 = element21.textNodes();
        org.jsoup.nodes.Attributes attributes29 = element21.attributes();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element(tag18, "<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>", attributes29);
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag8, "<&lt;hi!&gt;&lt;/hi!&gt;></&lt;hi!&gt;&lt;/hi!&gt;>", attributes29);
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements36 = element34.getElementsByClass("hi!");
        org.jsoup.select.Elements elements37 = element34.getAllElements();
        boolean boolean38 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element34);
        org.jsoup.select.Elements elements39 = element34.parents();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element42 = element41.nextElementSibling();
        boolean boolean43 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element41);
        int int44 = element41.siblingIndex();
        org.jsoup.nodes.Element element47 = element41.attr("hi!", "<hi!></hi!>");
        java.lang.String str48 = element41.cssSelector();
        boolean boolean50 = element41.hasClass("<hi!></hi!>");
        org.jsoup.nodes.Element element51 = element34.doClone((org.jsoup.nodes.Node) element41);
        org.jsoup.nodes.Node node52 = element41.root();
        java.util.List<org.jsoup.nodes.Node> nodeList53 = element41.childNodes();
        java.lang.String str54 = element41.toString();
        org.jsoup.nodes.Attributes attributes55 = element41.attributes();
        org.jsoup.nodes.Element element56 = new org.jsoup.nodes.Element(tag8, "<hi! class=\"<hi!>\n hi!\n</hi!>\"></hi!>", attributes55);
        org.jsoup.nodes.Element element58 = element56.appendElement("<hi! =\"\"></hi!>");
        org.jsoup.nodes.Element element59 = element58.shallowClone();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(textNodeList28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNull(element42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "<hi! hi!=\"<hi!></hi!>\"></hi!>" + "'", str54, "<hi! hi!=\"<hi!></hi!>\"></hi!>");
        org.junit.Assert.assertNotNull(attributes55);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(element59);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
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
        org.jsoup.select.Elements elements24 = element12.getElementsByTag("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.lang.String str25 = element12.className();
        org.jsoup.nodes.Element element27 = element12.addClass("<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n <<hi!>\n hi!\n</hi!>></<hi!>\n hi!\n</hi!>>\n <hi! class=\"\"></hi!>\n</<hi!></hi!>>");
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element31 = element30.nextElementSibling();
        org.jsoup.nodes.Attributes attributes32 = element30.attributes();
        org.jsoup.nodes.Element element34 = element30.text("");
        int int35 = element30.siblingIndex();
        org.jsoup.nodes.Element element37 = element30.text("hi!");
        org.jsoup.select.Elements elements39 = element37.getElementsMatchingText("");
        java.util.List<org.jsoup.nodes.Node> nodeList40 = element37.childNodesCopy();
        org.jsoup.select.Elements elements42 = element37.getElementsByIndexLessThan((int) (byte) 1);
        java.lang.String str43 = element37.id();
        boolean boolean44 = element37.isBlock();
        org.jsoup.select.Elements elements45 = element37.siblingElements();
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element("hi!");
        element48.setBaseUri("hi!");
        org.jsoup.select.Elements elements52 = element48.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element55 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element56 = element55.nextElementSibling();
        boolean boolean57 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element55);
        org.jsoup.nodes.Element element59 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element60 = element59.parent();
        org.jsoup.nodes.Node node61 = element59.parentNode();
        org.jsoup.select.Elements elements63 = element59.getElementsByIndexLessThan(1);
        boolean boolean64 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element59);
        org.jsoup.select.Elements elements65 = element59.children();
        org.jsoup.nodes.Element element67 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements69 = element67.getElementsByClass("hi!");
        org.jsoup.nodes.Element element71 = element67.html("");
        org.jsoup.nodes.Element element72 = element71.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList73 = element71.siblingNodes();
        org.jsoup.nodes.Element element75 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element76 = element75.parent();
        org.jsoup.nodes.Node node77 = element75.parentNode();
        org.jsoup.select.Elements elements79 = element75.getElementsByIndexLessThan(1);
        org.jsoup.nodes.Element element81 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element82 = element81.nextElementSibling();
        org.jsoup.nodes.Attributes attributes83 = element81.attributes();
        org.jsoup.nodes.Element element85 = element81.text("");
        int int86 = element81.siblingIndex();
        org.jsoup.nodes.Element element88 = element81.text("hi!");
        boolean boolean89 = element81.hasParent();
        java.lang.String str90 = element81.tagName();
        org.jsoup.nodes.Node[] nodeArray91 = new org.jsoup.nodes.Node[] { element55, element59, element71, element75, element81 };
        org.jsoup.nodes.Element element92 = element48.insertChildren((int) (short) 0, nodeArray91);
        org.jsoup.nodes.Element element93 = element37.insertChildren((-1), nodeArray91);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element94 = element12.insertChildren((int) (short) 1, nodeArray91);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNull(element31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNull(element56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(element60);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNotNull(elements63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(elements65);
        org.junit.Assert.assertNotNull(elements69);
        org.junit.Assert.assertNotNull(element71);
        org.junit.Assert.assertNull(element72);
        org.junit.Assert.assertNotNull(nodeList73);
        org.junit.Assert.assertNull(element76);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNotNull(elements79);
        org.junit.Assert.assertNull(element82);
        org.junit.Assert.assertNotNull(attributes83);
        org.junit.Assert.assertNotNull(element85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(element88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!" + "'", str90, "hi!");
        org.junit.Assert.assertNotNull(nodeArray91);
        org.junit.Assert.assertNotNull(element92);
        org.junit.Assert.assertNotNull(element93);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.lang.String str8 = element7.text();
        org.jsoup.select.Elements elements11 = element7.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.select.Elements elements13 = element7.getElementsByIndexEquals((-1));
        org.jsoup.nodes.Node node14 = element7.clearAttributes();
        org.jsoup.select.Elements elements17 = element7.getElementsByAttributeValueContaining("<hi! hi!=\"<hi!></hi!>\">\n <<hi! hi!=\"<hi!></hi!>\"></hi!>></<hi! hi!=\"<hi!></hi!>\"></hi!>>\n</hi!>", "<<hi!></hi!>></<hi!></hi!>>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.parser.Tag tag5 = element1.tag();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList6 = element1.textNodes();
        java.lang.String str7 = element1.data();
        org.jsoup.select.Elements elements10 = element1.getElementsByAttributeValueEnding("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;", "<hi!></hi!>.<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!></hi!>" + "'", str4, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(textNodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements10);
    }
}

