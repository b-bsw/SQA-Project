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
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.parser.Tag tag8 = element2.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexGreaterThan((int) (byte) 0);
        org.jsoup.select.Elements elements14 = element10.getElementsByAttributeStarting("<hi!></hi!>");
        org.jsoup.nodes.Node node15 = element10.root();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element19 = element17.removeClass("");
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements23 = element21.getElementsContainingOwnText("hi!");
        boolean boolean24 = element19.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Node node25 = element19.previousSibling();
        org.jsoup.nodes.Element element27 = element19.appendText("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        org.jsoup.select.Elements elements29 = element27.getElementsContainingOwnText("<hi!></hi!>");
        org.jsoup.nodes.Element element31 = element27.tagName("<hi! class=\"<hi!></hi!>\"></hi!>");
        boolean boolean32 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element31);
        boolean boolean33 = node15.hasSameValue((java.lang.Object) element31);
        org.jsoup.select.Elements elements34 = element31.children();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements36 = element31.getElementsByAttribute("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(elements34);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
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
        boolean boolean29 = element28.isBlock();
        org.jsoup.nodes.Element element31 = element28.removeClass("<hi! class=\"<hi!></hi!>\">\n &lt;&lt;hi!&gt;&lt;/hi!&gt;&gt;&lt;/&lt;hi!&gt;&lt;/hi!&gt;&gt;\n</hi!>");
        java.lang.String str32 = element31.outerHtml();
        org.jsoup.nodes.Element element34 = element31.getElementById("<hi! class=\"hi!\" value=\"hi!\"></hi!>");
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<hi! class=\"\"></hi!>" + "'", str32, "<hi! class=\"\"></hi!>");
        org.junit.Assert.assertNull(element34);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingOwnText("");
        boolean boolean11 = element8.isBlock();
        java.util.regex.Pattern pattern13 = null;
        org.jsoup.select.Elements elements14 = element8.getElementsByAttributeValueMatching("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>", pattern13);
        org.jsoup.nodes.Node node15 = element8.previousSibling();
        java.lang.Integer int16 = element8.elementSiblingIndex();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
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
        java.lang.String str15 = element13.ownText();
        org.jsoup.select.Elements elements16 = element13.getAllElements();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<hi!></hi!>" + "'", str15, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.prependText("<hi!></hi!>");
        org.jsoup.select.Elements elements9 = element1.getElementsByAttributeValueContaining("<hi! class=\"hi!\"></hi!>", "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.jsoup.select.Elements elements12 = element1.getElementsByAttributeValueEnding("<>>", "hi!.<hi!></hi!>");
        org.jsoup.nodes.Node node13 = element1.parentNode();
        boolean boolean15 = element1.hasClass("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element18 = element17.empty();
        org.jsoup.nodes.Element element19 = element18.empty();
        org.jsoup.nodes.Element element21 = element18.prepend("");
        org.jsoup.select.Elements elements22 = element18.siblingElements();
        java.lang.String str23 = element18.text();
        org.jsoup.nodes.Element element24 = element1.appendChild((org.jsoup.nodes.Node) element18);
        org.jsoup.select.Elements elements26 = element1.getElementsContainingText("<hi!></hi!>");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.nodes.Element element7 = element5.val("");
        java.lang.String str8 = element7.className();
        org.jsoup.select.Elements elements11 = element7.getElementsByAttributeValueNot("<hi! class=\"<hi!></hi!>\"></hi!>", "<hi! class=\"hi!\"></hi!>");
        org.jsoup.select.Elements elements12 = element7.siblingElements();
        org.jsoup.select.Elements elements14 = element7.getElementsByAttributeStarting("<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">\n hi!\n</hi!>");
        org.jsoup.nodes.Element element16 = element7.appendText("<hi! value=\"\"></hi!>");
        boolean boolean18 = element16.hasAttr("<hi! class=\"hi!\" <hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">\n hi!\n</hi!>></hi!>");
        org.jsoup.nodes.Element element19 = element16.empty();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
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
        org.jsoup.nodes.Element element21 = element16.appendText("<hi! class=\"\"></hi!>");
        org.jsoup.parser.Tag tag22 = element21.tag();
        org.jsoup.select.Elements elements24 = element21.getElementsMatchingText("<hi! class=\"<hi!></hi!>\">\n &lt;\n <hi! class=\"hi!\"></hi!>&gt;\n <!--<hi! class=\"hi!\"-->&gt;\n <hi!></hi!>\n</hi!>");
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
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = element1.classNames((java.util.Set<java.lang.String>) strSet9);
        org.jsoup.nodes.Element element13 = element1.toggleClass("");
        org.jsoup.nodes.Element element15 = element1.getElementById("<<hi! class=\"\"></hi!>></<hi! class=\"\"></hi!>>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element15);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element8 = element2.appendText("hi!");
        java.lang.String str9 = element8.nodeName();
        org.jsoup.nodes.Element element10 = element8.clone();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Element element14 = element13.empty();
        org.jsoup.nodes.Element element16 = element14.tagName("hi!");
        org.jsoup.nodes.Element element18 = element16.prependElement("hi!");
        org.jsoup.parser.Tag tag19 = element18.tag();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList20 = element18.textNodes();
        java.lang.String str21 = element18.className();
        int int22 = element18.siblingIndex();
        java.lang.String str23 = element18.text();
        java.util.Set<java.lang.String> strSet24 = element18.classNames();
        org.jsoup.nodes.Element element25 = element10.classNames(strSet24);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(textNodeList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.parser.Tag tag4 = element2.tag();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.select.Elements elements9 = element7.parents();
        org.jsoup.nodes.Node node10 = element7.nextSibling();
        org.jsoup.nodes.Element element12 = element7.addClass("<hi!></hi!>");
        org.jsoup.parser.Tag tag13 = element7.tag();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element17 = element16.empty();
        java.lang.String str18 = element16.outerHtml();
        org.jsoup.nodes.Attributes attributes19 = element16.attributes();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag13, "hi!", attributes19);
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag4, "<hi! class=\"\"></hi!>", attributes19);
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag4, "hi!");
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element27 = element26.empty();
        org.jsoup.nodes.Element element28 = element27.empty();
        org.jsoup.nodes.Element element30 = element27.prepend("");
        org.jsoup.select.Elements elements31 = element27.siblingElements();
        org.jsoup.select.Elements elements32 = element27.getAllElements();
        org.jsoup.parser.Tag tag33 = element27.tag();
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element(tag33, "<hi! class=\"<hi!></hi!> hi!\" value=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element39 = element38.empty();
        org.jsoup.nodes.Element element40 = element39.empty();
        org.jsoup.nodes.Element element42 = element39.prepend("");
        org.jsoup.select.Elements elements43 = element39.siblingElements();
        org.jsoup.select.Elements elements44 = element39.getAllElements();
        org.jsoup.parser.Tag tag45 = element39.tag();
        org.jsoup.nodes.Element element47 = new org.jsoup.nodes.Element(tag45, "<hi!></hi!>");
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element(tag45, "<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element51 = new org.jsoup.nodes.Element(tag45, "<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element54 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element55 = element54.empty();
        org.jsoup.nodes.Element element56 = element55.empty();
        org.jsoup.nodes.Attributes attributes57 = element55.attributes();
        org.jsoup.nodes.Element element58 = new org.jsoup.nodes.Element(tag45, "<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">\n hi!\n</hi!>", attributes57);
        org.jsoup.nodes.Element element59 = new org.jsoup.nodes.Element(tag33, "&lt;hi! class=\"\"&gt;&lt;/hi!&gt;", attributes57);
        org.jsoup.nodes.Attributes attributes60 = element59.attributes();
        org.jsoup.nodes.Element element61 = new org.jsoup.nodes.Element(tag4, "<hi! value=\"\"></hi!>", attributes60);
        org.jsoup.nodes.Element element63 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements65 = element63.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element67 = element63.tagName("hi!");
        java.lang.String[] strArray70 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet71 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet71, strArray70);
        org.jsoup.nodes.Element element73 = element63.classNames((java.util.Set<java.lang.String>) strSet71);
        org.jsoup.nodes.Element element75 = element63.removeClass("<hi! class=\"<hi!></hi!>\"></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList76 = element75.textNodes();
        org.jsoup.nodes.Element element79 = element75.attr("<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">\n hi!\n</hi!>", true);
        java.lang.String str80 = element75.cssSelector();
        java.util.Set<java.lang.String> strSet81 = element75.classNames();
        org.jsoup.nodes.Element element82 = element61.classNames(strSet81);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<hi!></hi!>" + "'", str18, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertNotNull(attributes60);
        org.junit.Assert.assertNotNull(elements65);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(element73);
        org.junit.Assert.assertNotNull(element75);
        org.junit.Assert.assertNotNull(textNodeList76);
        org.junit.Assert.assertNotNull(element79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!.hi!" + "'", str80, "hi!.hi!");
        org.junit.Assert.assertNotNull(strSet81);
        org.junit.Assert.assertNotNull(element82);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = element1.classNames((java.util.Set<java.lang.String>) strSet9);
        java.util.Set<java.lang.String> strSet12 = element1.classNames();
        org.jsoup.nodes.Element element14 = element1.getElementById("<hi!></hi!>");
        org.jsoup.nodes.Element element16 = element1.toggleClass("<hi!>\n &lt;&gt;&gt;\n</hi!>");
        org.jsoup.select.Elements elements18 = element16.getElementsByTag("<hi!.<hi!></hi!>></hi!.<hi!></hi!>>");
        org.jsoup.nodes.Element element21 = element16.attr("<hi! class=\"hi!\"></hi!>", false);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
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
        java.lang.String str28 = element8.attr("<hi! value=\"\"></hi!>\n<hi!></hi!>");
        java.lang.String str30 = element8.attr("hi!.<hi!.class=\"hi!\"></hi!>");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements9 = element7.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node10 = element7.root();
        org.jsoup.nodes.Element element11 = element1.appendChild(node10);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element1.textNodes();
        org.jsoup.nodes.Element element14 = element1.prependText("");
        org.jsoup.nodes.Element element16 = element14.addClass("<hi!>\n <hi!>\n  <hi!></hi!>\n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element19 = element14.attr("&lt;hi!&gt;&lt;/hi!&gt;", "hi!.");
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element22 = element21.empty();
        org.jsoup.nodes.Element element23 = element22.empty();
        org.jsoup.nodes.Element element25 = element22.append("<hi!></hi!>");
        org.jsoup.nodes.Element element27 = element25.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element30 = element29.empty();
        org.jsoup.nodes.Element element31 = element30.empty();
        org.jsoup.nodes.Element element33 = element31.tagName("hi!");
        org.jsoup.nodes.Element element35 = element33.val("");
        org.jsoup.nodes.Element element36 = element27.prependChild((org.jsoup.nodes.Node) element35);
        java.util.regex.Pattern pattern38 = null;
        org.jsoup.select.Elements elements39 = element36.getElementsByAttributeValueMatching("<hi!></hi!>", pattern38);
        org.jsoup.nodes.Element element41 = element36.appendText("<hi! class=\"\"></hi!>");
        boolean boolean42 = element19.hasSameValue((java.lang.Object) element41);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
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
        org.jsoup.nodes.Element element15 = element2.html("<hi!></hi!>");
        org.jsoup.nodes.Element element17 = element2.removeClass("<hi! class=\"hi!\"></hi!>");
        org.jsoup.select.Elements elements19 = element17.getElementsByClass("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element22 = element21.empty();
        org.jsoup.nodes.Element element23 = element22.empty();
        org.jsoup.nodes.Element element25 = element23.tagName("hi!");
        org.jsoup.nodes.Element element27 = element25.val("");
        java.lang.String str28 = element27.className();
        java.util.Set<java.lang.String> strSet29 = element27.classNames();
        org.jsoup.nodes.Element element30 = element17.prependChild((org.jsoup.nodes.Node) element27);
        java.lang.Appendable appendable31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        // The following exception was thrown during execution in test generation
        try {
            element30.outerHtmlHead(appendable31, (int) (byte) 1, outputSettings33);
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
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(element30);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
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
        org.jsoup.nodes.Element element26 = element24.appendElement("<hi!></hi!>");
        org.jsoup.select.Elements elements28 = element26.getElementsByAttributeStarting("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element30 = element26.html("hi!.hi!");
        org.jsoup.nodes.Node node31 = element26.previousSibling();
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
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<<hi! class=\"hi!\"></hi!>>\n <hi! class=\"<hi!></hi!>\"></hi!>\n <hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>\n</<hi! class=\"hi!\"></hi!>>");
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element10.tagName("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element14 = element10.text("<hi!></hi!>");
        org.jsoup.select.Elements elements16 = element10.getElementsByAttribute("<hi! class=\"<hi!></hi!> hi!\" value=\"hi!\"></hi!>");
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            element10.outerHtmlHead(appendable17, 1, outputSettings19);
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
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        java.util.regex.Pattern pattern4 = null;
        org.jsoup.select.Elements elements5 = element1.getElementsByAttributeValueMatching("<hi!></hi!>", pattern4);
        java.lang.Integer int6 = element1.elementSiblingIndex();
        java.lang.String str7 = element1.val();
        org.jsoup.select.Elements elements8 = element1.children();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element12 = element11.empty();
        org.jsoup.nodes.Element element14 = element11.prepend("");
        element11.setBaseUri("hi!");
        org.jsoup.nodes.Element element18 = element11.prepend("hi!");
        org.jsoup.select.Elements elements20 = element18.getElementsByIndexGreaterThan((int) 'a');
        java.lang.String str21 = element18.id();
        org.jsoup.nodes.Element element23 = element18.val("<hi! hi!=\"\">\n <<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>\n</hi!>");
        org.jsoup.nodes.Element element24 = element1.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Node node25 = element18.parentNode();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.nodes.Element element11 = element9.prepend("");
        int int12 = element9.siblingIndex();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = element9.dataset();
        java.lang.String str14 = element9.cssSelector();
        int int15 = element9.childNodeSize();
        element9.setBaseUri("<<hi! class=\"\"></hi!>></<hi! class=\"\"></hi!>>");
        org.jsoup.nodes.Element element19 = element9.getElementById("hi!.<hi!></hi!>.hi!");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.<hi!></hi!>" + "'", str14, "hi!.<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(element19);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
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
        org.jsoup.nodes.Element element26 = element19.nextElementSibling();
        org.jsoup.nodes.Element element28 = element19.after("<hi! class=\"hi!\" <hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">\n hi!\n</hi!>></hi!>");
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element31 = element30.empty();
        org.jsoup.nodes.Element element32 = element31.empty();
        org.jsoup.nodes.Element element34 = element31.prepend("");
        org.jsoup.nodes.Node node35 = element34.previousSibling();
        org.jsoup.select.Elements elements37 = element34.getElementsContainingText("<hi!></hi!>");
        org.jsoup.nodes.Element element39 = element34.prepend("hi!");
        org.jsoup.nodes.Element element41 = element39.html("hi!.<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList42 = element41.textNodes();
        org.jsoup.nodes.Element element43 = element28.appendChild((org.jsoup.nodes.Node) element41);
        org.jsoup.select.Elements elements45 = element28.getElementsByAttributeStarting("hi!.<hi!>.hi!.</hi!>");
        java.lang.String str46 = element28.data();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean48 = element28.is("<hi!>\n <hi! class=\"<hi!></hi!> hi!\" value=\"hi!\"></hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!>? <hi! class=\"<hi!></hi!> hi!\" value=\"hi!\"></hi!>?</hi!>': unexpected token at '<hi!>? <hi! class=\"<hi!></hi!> hi!\" value=\"hi!\"></hi!>?</hi!>'");
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
        org.junit.Assert.assertNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(textNodeList42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element8.html("");
        java.lang.String str13 = element8.nodeName();
        java.lang.String str14 = element8.baseUri();
        org.jsoup.select.Elements elements15 = element8.getAllElements();
        org.jsoup.nodes.Element element16 = element8.clone();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        org.jsoup.parser.Tag tag6 = element5.tag();
        org.jsoup.select.Elements elements7 = element5.siblingElements();
        org.jsoup.nodes.Element element9 = element5.tagName("<hi! class=\"hi!\"></hi!>");
        java.lang.String str10 = element5.outerHtml();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.select.Elements elements14 = element12.parents();
        org.jsoup.nodes.Node node15 = element12.nextSibling();
        org.jsoup.nodes.Element element17 = element12.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList18 = element12.dataNodes();
        org.jsoup.nodes.Element element20 = element12.val("hi!");
        java.lang.String str21 = element12.val();
        int int22 = element12.siblingIndex();
        org.jsoup.nodes.Element element23 = element5.prependChild((org.jsoup.nodes.Node) element12);
        org.jsoup.select.Elements elements24 = element23.getAllElements();
        java.lang.String str26 = element23.attr("<hi!></hi!>");
        org.jsoup.nodes.Element element28 = element23.appendText("<<hi! class=\"hi!\"></hi!> class=\"<hi!>\n &amp;lt;\n <hi! class=&quot;hi!&quot;></hi!>&amp;gt;\n <!--<hi! class=&quot;hi!&quot;-->&amp;gt;\n</hi!>\"></<hi! class=\"hi!\"></hi!>>");
        java.lang.String str29 = element28.outerHtml();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>" + "'", str10, "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(dataNodeList18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<<hi! class=\"hi!\"></hi!>>\n <hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>&lt;&lt;hi! class=\"hi!\"&gt;&lt;/hi!&gt; class=\"&lt;hi!&gt; &amp;amp;lt; &lt;hi! class=&amp;quot;hi!&amp;quot;&gt;&lt;/hi!&gt;&amp;amp;gt; &lt;!--&lt;hi! class=&amp;quot;hi!&amp;quot;--&gt;&amp;amp;gt; &lt;/hi!&gt;\"&gt;&lt;/&lt;hi! class=\"hi!\"&gt;&lt;/hi!&gt;&gt;\n</<hi! class=\"hi!\"></hi!>>" + "'", str29, "<<hi! class=\"hi!\"></hi!>>\n <hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>&lt;&lt;hi! class=\"hi!\"&gt;&lt;/hi!&gt; class=\"&lt;hi!&gt; &amp;amp;lt; &lt;hi! class=&amp;quot;hi!&amp;quot;&gt;&lt;/hi!&gt;&amp;amp;gt; &lt;!--&lt;hi! class=&amp;quot;hi!&amp;quot;--&gt;&amp;amp;gt; &lt;/hi!&gt;\"&gt;&lt;/&lt;hi! class=\"hi!\"&gt;&lt;/hi!&gt;&gt;\n</<hi! class=\"hi!\"></hi!>>");
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
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
        java.lang.String str22 = element16.text();
        org.jsoup.parser.Tag tag23 = element16.tag();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag23, "<hi!>\n <hi!>\n  <hi!></hi!>\n </hi!>\n</hi!>");
        org.jsoup.parser.Tag tag26 = element25.tag();
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
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(tag26);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
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
        element8.setBaseUri("hi!.hi!");
        org.jsoup.nodes.Element element19 = element8.tagName("<<hi! class=\"\"></hi!>></<hi! class=\"\"></hi!>>");
        int int20 = element8.siblingIndex();
        org.jsoup.nodes.Element element22 = element8.append("<hi! hi!=\"\">\n hi!.\n <<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>\n</hi!>");
        java.lang.Integer int23 = element8.elementSiblingIndex();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element8.html("");
        java.lang.String str13 = element8.nodeName();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = element8.dataset();
        java.util.regex.Pattern pattern16 = null;
        org.jsoup.select.Elements elements17 = element8.getElementsByAttributeValueMatching("<hi! class=\"<hi!></hi!>\"></hi!>", pattern16);
        java.lang.String str18 = element8.text();
        java.lang.String str19 = element8.className();
        org.jsoup.select.Elements elements21 = element8.getElementsContainingText("<hi! class=\"<hi!></hi!>\">\n &lt;\n <hi! class=\"hi!\"></hi!>&gt;\n <!--<hi! class=\"hi!\"-->&gt;\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
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
        org.jsoup.nodes.Element element33 = element16.prepend("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Node node34 = element33.nextSibling();
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
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNull(node34);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
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
        org.jsoup.nodes.Element element42 = element40.prependText("");
        java.lang.String str43 = element42.className();
        org.jsoup.select.Elements elements45 = element42.getElementsByTag("<hi! class=\"<hi!></hi!>\">\n &lt;&lt;hi!&gt;&lt;/hi!&gt;&gt;&lt;/&lt;hi!&gt;&lt;/hi!&gt;&gt;\n</hi!>");
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
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(elements45);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements42 = element34.select("<hi! <hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! <hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>></hi!>': unexpected token at '<hi! <hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>></hi!>'");
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
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element40);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.nodes.Element element10 = element9.parent();
        org.jsoup.select.Elements elements11 = element9.getAllElements();
        org.jsoup.nodes.Element element13 = element9.appendElement("<>>");
        org.jsoup.nodes.Node node14 = element13.previousSibling();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element13 = element9.toggleClass("hi!");
        org.jsoup.nodes.Element element15 = element13.val("<hi! class=\"hi!\"></hi!>");
        boolean boolean16 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element13);
        org.jsoup.nodes.Element element17 = element13.empty();
        org.jsoup.nodes.Element element19 = element17.toggleClass("hi!.<hi!></hi!>.hi!");
        org.jsoup.nodes.Element element20 = element17.empty();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.nodes.Element element7 = element5.prependElement("hi!");
        org.jsoup.parser.Tag tag8 = element7.tag();
        element7.setBaseUri("<hi! class=\"<hi!></hi!>\">\n &lt;\n <hi! class=\"hi!\"></hi!>&gt;\n <!--<hi! class=\"hi!\"-->&gt;\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Node node7 = element5.root();
        java.lang.String str8 = element5.data();
        org.jsoup.nodes.Element element10 = element5.removeClass("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        org.jsoup.parser.Tag tag11 = element5.tag();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element15 = element14.empty();
        org.jsoup.nodes.Element element16 = element15.empty();
        org.jsoup.nodes.Element element18 = element15.prepend("");
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element21 = element20.empty();
        org.jsoup.nodes.Element element22 = element21.empty();
        org.jsoup.nodes.Element element24 = element22.tagName("hi!");
        org.jsoup.select.Elements elements25 = element24.parents();
        org.jsoup.nodes.Node node26 = element24.nextSibling();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements30 = element28.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element32 = element28.tagName("hi!");
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        org.jsoup.nodes.Element element38 = element28.classNames((java.util.Set<java.lang.String>) strSet36);
        org.jsoup.nodes.Element element39 = element24.classNames((java.util.Set<java.lang.String>) strSet36);
        org.jsoup.nodes.Element element40 = element15.classNames((java.util.Set<java.lang.String>) strSet36);
        org.jsoup.parser.Tag tag41 = element15.tag();
        org.jsoup.nodes.Element element44 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element45 = element44.empty();
        org.jsoup.select.Elements elements46 = element44.parents();
        org.jsoup.nodes.Node node47 = element44.nextSibling();
        org.jsoup.nodes.Element element49 = element44.addClass("<hi!></hi!>");
        org.jsoup.parser.Tag tag50 = element44.tag();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element54 = element53.empty();
        java.lang.String str55 = element53.outerHtml();
        org.jsoup.nodes.Attributes attributes56 = element53.attributes();
        org.jsoup.nodes.Element element57 = new org.jsoup.nodes.Element(tag50, "hi!", attributes56);
        org.jsoup.nodes.Element element58 = new org.jsoup.nodes.Element(tag41, "<hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>", attributes56);
        org.jsoup.nodes.Element element59 = new org.jsoup.nodes.Element(tag11, "<hi!.<hi!></hi!>></hi!.<hi!></hi!>>", attributes56);
        org.jsoup.nodes.Element element61 = new org.jsoup.nodes.Element(tag11, "<hi! class=\"hi!\">\n <hi! class=\"hi!\" value=\"<hi!></hi!>\"></hi!>\n <<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>></<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>>\n</hi!>");
        org.jsoup.nodes.Element element64 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements66 = element64.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element68 = element64.tagName("hi!");
        java.lang.String str69 = element68.data();
        org.jsoup.nodes.Attributes attributes70 = element68.attributes();
        org.jsoup.nodes.Element element71 = new org.jsoup.nodes.Element(tag11, "<hi! <hi! class=\"<hi!></hi!> hi!\" value=\"hi!\"></hi!>></hi!>", attributes70);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "<hi!></hi!>" + "'", str55, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(attributes56);
        org.junit.Assert.assertNotNull(elements66);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(attributes70);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
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
        org.jsoup.nodes.Element element14 = element10.previousElementSibling();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements4 = element1.getElementsByAttributeValueMatching("", "");
        java.lang.String str5 = element1.toString();
        org.jsoup.nodes.Element element7 = element1.toggleClass("<hi! class=\"<hi!></hi!>\"></hi!>");
        java.lang.Class<?> wildcardClass8 = element1.getClass();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element10.tagName("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.select.Elements elements15 = element10.getElementsByAttributeValue("<hi! class=\"\"></hi!>", "<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element17 = element10.tagName("<hi! value=\"\"></hi!>\n<hi!></hi!>");
        org.jsoup.parser.Tag tag18 = element17.tag();
        org.jsoup.nodes.Element element20 = element17.removeClass("<hi! class=\"hi!\">\n <hi! class=\"hi!\" value=\"<hi!></hi!>\"></hi!>\n <<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>></<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>>\n</hi!>");
        org.jsoup.nodes.Attributes attributes21 = element17.attributes();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(attributes21);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        org.jsoup.parser.Tag tag6 = element5.tag();
        org.jsoup.select.Elements elements7 = element5.siblingElements();
        org.jsoup.nodes.Element element9 = element5.tagName("<hi! class=\"hi!\"></hi!>");
        java.lang.String str10 = element5.html();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.select.Elements elements14 = element12.parents();
        java.lang.String str16 = element12.attr("hi!");
        org.jsoup.nodes.Element element18 = element12.prepend("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element20 = element12.html("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.jsoup.nodes.Element element22 = element20.append("hi!");
        org.jsoup.nodes.Element element23 = element5.prependChild((org.jsoup.nodes.Node) element20);
        org.jsoup.select.Elements elements25 = element20.getElementsContainingOwnText("<hi! <hi!>\n hi!\n</hi!>=\"<hi!></hi!>\" class=\"\">\n <hi!></hi!>\n <hi! class=\"hi!\"></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.parser.Tag tag6 = element5.tag();
        org.jsoup.nodes.Element element8 = element5.appendElement("<hi!>\n &lt;\n <hi! class=\"hi!\"></hi!>&gt;\n <!--<hi! class=\"hi!\"-->&gt;\n</hi!>");
        java.lang.String str9 = element8.ownText();
        java.lang.String str10 = element8.ownText();
        java.lang.String str11 = element8.className();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
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
        org.jsoup.nodes.Element element27 = element12.appendElement("<<hi!></hi!>>\n <hi! value=\"\"></hi!>\n <hi!></hi!>\n</<hi!></hi!>>");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = element12.siblingNodes();
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
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(nodeList28);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
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
        java.util.Map<java.lang.String, java.lang.String> strMap36 = element2.dataset();
        org.jsoup.nodes.Element element39 = element2.attr("<hi! class=\"\">\n hi!\n</hi!>", "<hi!></hi!>\n<hi! class=\"\">\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
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
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(element39);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.prependText("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = element6.append("<hi! class=\"\">\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements12 = element10.getElementsContainingOwnText("hi!");
        boolean boolean13 = element10.hasText();
        org.jsoup.nodes.Node node14 = element10.parentNode();
        org.jsoup.select.Elements elements17 = element10.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.select.Elements elements18 = element10.children();
        org.jsoup.nodes.Element element19 = element10.empty();
        org.jsoup.nodes.Element element21 = element19.tagName("<>>");
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements25 = element23.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element27 = element23.tagName("hi!");
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        org.jsoup.nodes.Element element33 = element23.classNames((java.util.Set<java.lang.String>) strSet31);
        java.util.Set<java.lang.String> strSet34 = element23.classNames();
        org.jsoup.nodes.Element element35 = element21.appendChild((org.jsoup.nodes.Node) element23);
        org.jsoup.nodes.Element element36 = element8.appendChild((org.jsoup.nodes.Node) element23);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element39 = element8.attr("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
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
        org.jsoup.nodes.Element element27 = element22.appendElement("<hi! class=\"\">\n <hi!></hi!>\n</hi!>");
        java.lang.String str28 = element22.className();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element31 = element30.empty();
        org.jsoup.nodes.Element element32 = element31.empty();
        org.jsoup.nodes.Element element34 = element31.prepend("");
        org.jsoup.select.Elements elements35 = element31.siblingElements();
        org.jsoup.nodes.Element element37 = element31.appendText("hi!");
        org.jsoup.select.Elements elements40 = element37.getElementsByAttributeValueEnding("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>", "<hi! class=\"hi!\"></hi!>");
        java.lang.String str41 = element37.nodeName();
        org.jsoup.nodes.Element element43 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements45 = element43.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element47 = element43.tagName("hi!");
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet51 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
        org.jsoup.nodes.Element element53 = element43.classNames((java.util.Set<java.lang.String>) strSet51);
        org.jsoup.nodes.Element element55 = element43.removeClass("<hi! class=\"<hi!></hi!>\"></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList56 = element55.childNodes();
        java.lang.String str57 = element55.data();
        org.jsoup.nodes.Element element58 = element37.appendChild((org.jsoup.nodes.Node) element55);
        java.util.Set<java.lang.String> strSet59 = element55.classNames();
        org.jsoup.nodes.Element element60 = element22.classNames(strSet59);
        org.jsoup.nodes.Element element62 = element22.prepend("<hi!.<hi!></hi!>></hi!.<hi!></hi!>>");
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
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(strSet59);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(element62);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element6 = element5.clone();
        java.lang.String str7 = element6.ownText();
        org.jsoup.select.Elements elements9 = element6.getElementsContainingOwnText("<>>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element12 = element11.empty();
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Element element15 = element12.prepend("");
        org.jsoup.select.Elements elements17 = element12.getElementsByIndexGreaterThan(10);
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element12.childNodes();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element21 = element20.empty();
        org.jsoup.nodes.Element element22 = element21.empty();
        org.jsoup.nodes.Element element24 = element21.prepend("");
        org.jsoup.select.Elements elements25 = element21.siblingElements();
        org.jsoup.select.Elements elements26 = element21.getAllElements();
        org.jsoup.select.Elements elements28 = element21.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element31 = element21.attr("hi!", "");
        org.jsoup.nodes.Node node32 = element31.parentNode();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements36 = element34.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element38 = element34.tagName("hi!");
        org.jsoup.parser.Tag tag39 = element38.tag();
        org.jsoup.select.Elements elements40 = element38.siblingElements();
        org.jsoup.nodes.Element element42 = element38.tagName("<hi! class=\"hi!\"></hi!>");
        java.lang.String str43 = element38.outerHtml();
        org.jsoup.nodes.Element element44 = element31.appendChild((org.jsoup.nodes.Node) element38);
        java.lang.String str45 = element31.tagName();
        org.jsoup.nodes.Element element46 = element12.appendChild((org.jsoup.nodes.Node) element31);
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements50 = element48.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element52 = element48.tagName("hi!");
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        org.jsoup.nodes.Element element58 = element48.classNames((java.util.Set<java.lang.String>) strSet56);
        org.jsoup.nodes.Element element60 = element58.val("<hi!></hi!>");
        org.jsoup.nodes.Element element61 = element46.prependChild((org.jsoup.nodes.Node) element58);
        java.lang.String str62 = element58.nodeName();
        org.jsoup.nodes.Element element63 = element6.prependChild((org.jsoup.nodes.Node) element58);
        org.jsoup.nodes.Element element66 = element6.attr("<hi!.<hi!></hi!>></hi!.<hi!></hi!>>", "&lt;\n<hi! class=\"\"></hi!>&gt;\n<!--<hi! class=\"\"-->&gt;");
        org.jsoup.nodes.Node node67 = element66.previousSibling();
        org.jsoup.nodes.Element element68 = element66.empty();
        org.jsoup.nodes.Node node70 = element66.removeAttr("hi!.\n<hi!></hi!>");
        java.lang.String str71 = element66.val();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>" + "'", str43, "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
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
        org.jsoup.nodes.Element element19 = element14.addClass("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.select.Elements elements21 = element19.getElementsMatchingOwnText("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements23 = element19.select("<hi! value=\"\"></hi!>\n<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! value=\"\"></hi!>?<hi!></hi!>': unexpected token at '<hi! value=\"\"></hi!>?<hi!></hi!>'");
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
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
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
        org.jsoup.nodes.Element element27 = element26.empty();
        java.lang.String str28 = element26.outerHtml();
        org.jsoup.nodes.Attributes attributes29 = element26.attributes();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element32 = element31.empty();
        org.jsoup.nodes.Element element33 = element32.empty();
        org.jsoup.nodes.Element element35 = element32.prepend("");
        org.jsoup.select.Elements elements37 = element32.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Element element38 = element26.appendChild((org.jsoup.nodes.Node) element32);
        int int39 = element26.siblingIndex();
        org.jsoup.nodes.Element element40 = element1.appendChild((org.jsoup.nodes.Node) element26);
        org.jsoup.nodes.Element element42 = element1.prependElement("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element43 = element42.parent();
        org.jsoup.nodes.Element element45 = element42.before("<hi! value=\"\"></hi!>\n<hi!></hi!>");
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
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<hi!></hi!>" + "'", str28, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingOwnText("hi!");
        java.lang.String str8 = element5.nodeName();
        org.jsoup.nodes.Element element10 = element5.prepend("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements14 = element12.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element16 = element12.tagName("hi!");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        org.jsoup.nodes.Element element22 = element12.classNames((java.util.Set<java.lang.String>) strSet20);
        org.jsoup.nodes.Element element23 = element10.classNames((java.util.Set<java.lang.String>) strSet20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = element23.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
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
        org.jsoup.select.Elements elements31 = element10.getElementsContainingOwnText("hi!.<hi!></hi!>");
        org.jsoup.nodes.Node node32 = element10.unwrap();
        org.jsoup.select.Elements elements33 = element10.children();
        org.jsoup.parser.Tag tag34 = element10.tag();
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
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(tag34);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.select.Elements elements12 = element8.getElementsMatchingOwnText("hi!");
        org.jsoup.nodes.Element element14 = element8.removeClass("");
        org.jsoup.select.Elements elements17 = element8.getElementsByAttributeValueNot("<hi! class=\"<hi!></hi!>\"></hi!>", "<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">\n hi!\n</hi!>");
        org.jsoup.nodes.Element element20 = element8.attr("<hi! class=\"\"></hi!>", "<hi! class=\"\"></hi!>");
        java.util.regex.Pattern pattern22 = null;
        org.jsoup.select.Elements elements23 = element20.getElementsByAttributeValueMatching("", pattern22);
        int int24 = element20.childNodeSize();
        org.jsoup.select.Elements elements26 = element20.getElementsContainingOwnText("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;");
        java.lang.String str27 = element20.val();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.nodes.Element element10 = element9.parent();
        org.jsoup.select.Elements elements13 = element9.getElementsByAttributeValue("hi!.<hi!></hi!>", "<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">\n hi!\n</hi!>");
        org.jsoup.nodes.Element element15 = element9.appendElement("hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements18 = element15.getElementsByAttributeValueContaining("<<hi!></hi!>>\n <hi! value=\"\"></hi!>\n <hi!></hi!>\n</<hi!></hi!>>", "<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element20 = element15.addClass("<hi! <hi!></hi!>>\n <<hi! class=\"hi!\"></hi!> class=\"<hi!></hi!>\"></<hi! class=\"hi!\"></hi!>>\n</hi!>");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element4 = element1.empty();
        org.jsoup.nodes.Element element6 = element4.prepend("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
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
        org.jsoup.nodes.Node node15 = element13.removeAttr("<>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = element13.before("<hi! value=\"\"></hi!>");
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
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = element1.classNames((java.util.Set<java.lang.String>) strSet9);
        java.lang.String str12 = element1.toString();
        org.jsoup.nodes.Element element15 = element1.attr("<hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>", true);
        java.lang.String str16 = element15.html();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi! class=\"hi!\"></hi!>" + "'", str12, "<hi! class=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element8.html("");
        java.lang.String str13 = element8.nodeName();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = element8.dataset();
        java.util.regex.Pattern pattern16 = null;
        org.jsoup.select.Elements elements17 = element8.getElementsByAttributeValueMatching("<hi! class=\"<hi!></hi!>\"></hi!>", pattern16);
        java.lang.String str18 = element8.text();
        java.lang.String str19 = element8.className();
        org.jsoup.select.Elements elements21 = element8.getElementsByAttribute("<hi!>\n &lt;&gt;&gt;\n</hi!>");
        java.lang.String str22 = element8.data();
        java.lang.String str24 = element8.absUrl("<<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>></<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
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
        java.lang.String str25 = element24.text();
        org.jsoup.nodes.Element element27 = element24.html("hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements29 = element24.getElementsByAttribute("<<hi! class=\"hi!\"></hi!> class=\"<hi!></hi!>\"></<hi! class=\"hi!\"></hi!>>");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements29);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element8.html("");
        org.jsoup.nodes.Element element14 = element12.prepend("<hi! class=\"<hi!></hi!> hi!\" value=\"hi!\"></hi!>");
        org.jsoup.select.Elements elements16 = element14.getElementsByClass("hi!.");
        org.jsoup.nodes.Node node17 = element14.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element14.childNodes();
        org.jsoup.select.Elements elements19 = element14.getAllElements();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
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
        org.jsoup.nodes.Node node16 = element15.nextSibling();
        org.jsoup.select.Elements elements17 = element15.getAllElements();
        java.lang.String str18 = element15.html();
        java.lang.String str19 = element15.ownText();
        org.jsoup.nodes.Element element22 = element15.attr("<>>", false);
        org.jsoup.nodes.Element element24 = element22.text("<hi!>\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<hi!></hi!>" + "'", str14, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<hi!></hi!>" + "'", str18, "<hi!></hi!>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.nodes.Element element6 = element1.previousElementSibling();
        org.jsoup.nodes.Element element7 = element1.parent();
        org.jsoup.select.Elements elements9 = element1.getElementsMatchingOwnText("hi!.<hi!></hi!>.hi!");
        org.jsoup.nodes.Element element11 = element1.toggleClass("<hi!></hi!> hi!");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.nodes.Node node6 = element5.previousSibling();
        org.jsoup.select.Elements elements8 = element5.getElementsMatchingOwnText("<hi!></hi!>");
        java.lang.Integer int9 = element5.elementSiblingIndex();
        org.jsoup.nodes.Element element11 = element5.text("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.jsoup.nodes.Element element13 = element5.tagName("<hi! hi!=\"\">\n <<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>\n</hi!>");
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements17 = element15.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node18 = element15.root();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element21 = element20.empty();
        org.jsoup.nodes.Element element22 = element21.empty();
        org.jsoup.nodes.Element element24 = element22.tagName("hi!");
        org.jsoup.select.Elements elements25 = element24.parents();
        org.jsoup.nodes.Node node26 = element24.nextSibling();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements30 = element28.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element32 = element28.tagName("hi!");
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        org.jsoup.nodes.Element element38 = element28.classNames((java.util.Set<java.lang.String>) strSet36);
        org.jsoup.nodes.Element element39 = element24.classNames((java.util.Set<java.lang.String>) strSet36);
        boolean boolean40 = element15.equals((java.lang.Object) strSet36);
        org.jsoup.nodes.Element element42 = element15.addClass("");
        org.jsoup.select.Elements elements44 = element15.getElementsByIndexGreaterThan((int) ' ');
        boolean boolean45 = element13.equals((java.lang.Object) element15);
        org.jsoup.select.Elements elements47 = element15.getElementsContainingOwnText("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element49 = element15.removeClass("<hi! class=\"\"></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList50 = element49.childNodesCopy();
        org.jsoup.nodes.Element element52 = element49.prependText("<hi! class=\"<hi!></hi!>\"></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList53 = element49.dataNodes();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(dataNodeList53);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
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
        boolean boolean22 = element20.hasAttr("");
        org.jsoup.nodes.Element element24 = element20.append("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        org.jsoup.nodes.Node node25 = element24.root();
        boolean boolean27 = node25.hasAttr("hi!.<hi!></hi!>.hi!");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
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
        org.jsoup.nodes.Node node17 = element2.root();
        java.util.regex.Pattern pattern19 = null;
        org.jsoup.select.Elements elements20 = element2.getElementsByAttributeValueMatching("<hi! <hi!></hi!>>\n <<hi! class=\"hi!\"></hi!> class=\"<hi!></hi!>\"></<hi! class=\"hi!\"></hi!>>\n</hi!>", pattern19);
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
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element10.prepend("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element15 = element12.attr("hi!", true);
        java.lang.String str16 = element12.cssSelector();
        boolean boolean17 = element12.isBlock();
        org.jsoup.nodes.Element element19 = element12.appendElement("<hi! class=\"\"></hi!>");
        boolean boolean21 = element19.hasAttr("<hi!></hi!>.hi!");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element9 = element2.attr("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>", true);
        org.jsoup.parser.Tag tag10 = element9.tag();
        java.lang.String str11 = element9.outerHtml();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements15 = element13.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element17 = element13.tagName("hi!");
        org.jsoup.parser.Tag tag18 = element17.tag();
        org.jsoup.select.Elements elements19 = element17.siblingElements();
        org.jsoup.nodes.Element element21 = element17.tagName("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element23 = element21.addClass("<hi!>\n &lt;\n <hi! class=\"hi!\"></hi!>&gt;\n <!--<hi! class=\"hi!\"-->&gt;\n</hi!>");
        java.util.Set<java.lang.String> strSet24 = element23.classNames();
        org.jsoup.nodes.Element element25 = element9.classNames(strSet24);
        org.jsoup.nodes.Node node27 = element9.removeAttr("hi!.<hi!>.<hi!.class=\"\"></hi!>.</hi!>");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi! <hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>></hi!>" + "'", str11, "<hi! <hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>></hi!>");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        org.jsoup.parser.Tag tag6 = element5.tag();
        org.jsoup.select.Elements elements7 = element5.siblingElements();
        org.jsoup.nodes.Element element9 = element5.tagName("<hi! class=\"hi!\"></hi!>");
        java.lang.String str10 = element5.outerHtml();
        org.jsoup.select.Elements elements12 = element5.getElementsByClass("<<hi! class=\"\"></hi!> class=\"<hi!></hi!>\"></<hi! class=\"\"></hi!>>");
        org.jsoup.nodes.Element element14 = element5.getElementById("<hi! <hi!>\n hi!\n</hi!>=\"<hi!></hi!>\" class=\"<hi!>\n <hi! class=&quot;&quot;></hi!>\n</hi!>\">\n <hi!></hi!>\n <hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>" + "'", str10, "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
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
        org.jsoup.nodes.Element element15 = element1.prepend("<hi! class=\"<hi!></hi!> hi!\" value=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element17 = element1.text("<hi!>\n <hi!>\n  <hi!></hi!>\n </hi!>\n</hi!>");
        java.lang.String str18 = element1.toString();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<hi!></hi!>" + "'", str3, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<hi!>\n &lt;hi!&gt; &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>" + "'", str18, "<hi!>\n &lt;hi!&gt; &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.parser.Tag tag8 = element2.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexGreaterThan((int) (byte) 0);
        org.jsoup.select.Elements elements14 = element10.getElementsByAttributeStarting("<hi!></hi!>");
        boolean boolean15 = element10.hasText();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements19 = element17.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node20 = element17.root();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element23 = element22.empty();
        org.jsoup.nodes.Element element24 = element23.empty();
        org.jsoup.nodes.Element element26 = element24.tagName("hi!");
        org.jsoup.select.Elements elements27 = element26.parents();
        org.jsoup.nodes.Node node28 = element26.nextSibling();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements32 = element30.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element34 = element30.tagName("hi!");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        org.jsoup.nodes.Element element40 = element30.classNames((java.util.Set<java.lang.String>) strSet38);
        org.jsoup.nodes.Element element41 = element26.classNames((java.util.Set<java.lang.String>) strSet38);
        boolean boolean42 = element17.equals((java.lang.Object) strSet38);
        org.jsoup.nodes.Element element43 = element10.classNames((java.util.Set<java.lang.String>) strSet38);
        boolean boolean45 = element43.hasAttr("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.jsoup.nodes.Node node46 = element43.root();
        org.jsoup.select.Elements elements48 = element43.getElementsMatchingText("hi!.<hi!>.hi!.</hi!>");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(elements48);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
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
        boolean boolean23 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element22);
        org.jsoup.nodes.Element element25 = element22.getElementById("<hi! class=\"<hi!></hi!>\"></hi!>");
        java.util.regex.Pattern pattern27 = null;
        org.jsoup.select.Elements elements28 = element22.getElementsByAttributeValueMatching("<hi! class=\"\">\n <<hi! class=\"\"></hi!>></<hi! class=\"\"></hi!>>\n</hi!>", pattern27);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertNotNull(elements28);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node4 = element1.root();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element10 = element7.prepend("");
        org.jsoup.nodes.Node node11 = element10.previousSibling();
        org.jsoup.nodes.Element element12 = element1.appendChild((org.jsoup.nodes.Node) element10);
        org.jsoup.nodes.Element element15 = element12.attr("<hi!>\n hi!\n</hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Element element17 = element15.addClass("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        java.util.regex.Pattern pattern18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = element17.getElementsMatchingOwnText(pattern18);
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
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.select.Elements elements9 = element1.children();
        org.jsoup.nodes.Element element10 = element1.empty();
        org.jsoup.nodes.Element element12 = element1.html("<<hi!></hi!>></<hi!></hi!>>");
        org.jsoup.select.Elements elements13 = element1.children();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
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
        org.jsoup.select.Elements elements30 = element1.getElementsByAttributeValue("<hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>", "<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element33 = element1.attr("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;", "<<hi!></hi!>></<hi!></hi!>>");
        java.lang.String str34 = element1.tagName();
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
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element10.prepend("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element14 = element10.removeClass("<hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>");
        org.jsoup.nodes.Element element15 = element14.clone();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements9 = element7.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node10 = element7.root();
        org.jsoup.nodes.Element element11 = element1.appendChild(node10);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element1.textNodes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element15 = element14.empty();
        org.jsoup.select.Elements elements16 = element14.parents();
        org.jsoup.nodes.Node node17 = element14.nextSibling();
        org.jsoup.select.Elements elements18 = element14.children();
        org.jsoup.nodes.Node node19 = element14.parentNode();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element23 = element21.removeClass("");
        java.lang.String str24 = element21.cssSelector();
        org.jsoup.nodes.Element element26 = element21.prependText("<hi!></hi!>");
        org.jsoup.nodes.Element element27 = element14.prependChild((org.jsoup.nodes.Node) element26);
        org.jsoup.nodes.Element element28 = element1.appendChild((org.jsoup.nodes.Node) element26);
        org.jsoup.nodes.Element element30 = element26.before("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements34 = element32.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element36 = element32.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap37 = element36.dataset();
        org.jsoup.nodes.Element element39 = element36.tagName("hi!");
        org.jsoup.nodes.Element element41 = element39.prepend("hi!");
        org.jsoup.nodes.Element element43 = element39.html("");
        java.lang.String str44 = element39.nodeName();
        java.util.Map<java.lang.String, java.lang.String> strMap45 = element39.dataset();
        org.jsoup.nodes.Element element47 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element48 = element47.empty();
        org.jsoup.nodes.Element element49 = element48.empty();
        org.jsoup.nodes.Element element51 = element48.prepend("");
        element48.setBaseUri("hi!");
        org.jsoup.nodes.Element element55 = element48.prepend("hi!");
        java.util.Set<java.lang.String> strSet56 = element55.classNames();
        org.jsoup.nodes.Element element57 = element39.classNames(strSet56);
        org.jsoup.select.Elements elements60 = element57.getElementsByAttributeValue("hi!.", "<<hi! class=\"\"></hi!>></<hi! class=\"\"></hi!>>");
        org.jsoup.nodes.Element element61 = element30.before((org.jsoup.nodes.Node) element57);
        java.lang.String str62 = element61.html();
        org.jsoup.nodes.Node node63 = element61.previousSibling();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(elements60);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "&lt;hi!&gt;&lt;/hi!&gt;" + "'", str62, "&lt;hi!&gt;&lt;/hi!&gt;");
        org.junit.Assert.assertNotNull(node63);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element10.prepend("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.select.Elements elements15 = element10.getElementsByAttributeValue("<hi! class=\"hi!\"></hi!>", "<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        org.jsoup.select.Elements elements16 = element10.parents();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
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
        java.lang.String str25 = element1.html();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<hi!>\n <hi!></hi!>\n</hi!>" + "'", str25, "<hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element2.appendText("<hi! class=\"<hi!></hi!>\"></hi!>");
        java.util.regex.Pattern pattern9 = null;
        org.jsoup.select.Elements elements10 = element7.getElementsByAttributeValueMatching("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>", pattern9);
        java.util.regex.Pattern pattern12 = null;
        org.jsoup.select.Elements elements13 = element7.getElementsByAttributeValueMatching("<hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>", pattern12);
        java.lang.String str14 = element7.text();
        org.jsoup.select.Elements elements16 = element7.getElementsByIndexLessThan((int) (byte) 10);
        org.jsoup.nodes.Element element18 = element7.toggleClass("hi!.<hi!></hi!>.hi!");
        java.lang.String str19 = element18.id();
        org.jsoup.nodes.Element element20 = element18.empty();
        boolean boolean21 = element18.isBlock();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = element18.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<hi! class=\"<hi!></hi!>\"></hi!>" + "'", str14, "<hi! class=\"<hi!></hi!>\"></hi!>");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = element1.classNames((java.util.Set<java.lang.String>) strSet9);
        java.lang.String str12 = element1.toString();
        java.lang.String str13 = element1.text();
        org.jsoup.nodes.Element element15 = element1.removeClass("<hi!></hi!>.hi!");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi! class=\"hi!\"></hi!>" + "'", str12, "<hi! class=\"hi!\"></hi!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element9 = element5.addClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element11 = element5.appendElement("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Node node12 = element11.nextSibling();
        java.util.regex.Pattern pattern14 = null;
        org.jsoup.select.Elements elements15 = element11.getElementsByAttributeValueMatching("<hi! <hi!>\n <hi!>\n  <hi!></hi!>\n </hi!>\n</hi!>>\n &lt;&lt;hi! class=\"hi!\"&gt;&lt;/hi!&gt;&gt;&lt;/&lt;hi! class=\"hi!\"&gt;&lt;/hi!&gt;&gt;\n <hi! class=\"\"> \n  <hi!></hi!> \n </hi!>\n</hi!>", pattern14);
        org.jsoup.select.Elements elements17 = element11.getElementsByAttributeStarting("<<hi!></hi!>>\n <hi! value=\"\"></hi!>\n <hi!></hi!>\n</<hi!></hi!>>");
        org.jsoup.select.Elements elements20 = element11.getElementsByAttributeValue("<hi!></hi!>\n<hi! class=\"\">\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>", "<hi!>\n <hi!></hi!>\n <<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">\n hi!\n</hi!>></<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">\n hi!\n</hi!>>\n</hi!>");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
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
        org.jsoup.nodes.Element element17 = element14.parent();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNull(element17);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.removeClass("");
        org.jsoup.nodes.Element element5 = element1.appendElement("<>>");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttribute("<>>");
        org.jsoup.nodes.Element element9 = element5.prependText("<hi! hi!=\"\">\n <<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>\n</hi!>");
        org.jsoup.nodes.Element element12 = element5.attr("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>", false);
        org.jsoup.nodes.Element element14 = element5.appendElement("<hi! class=\"<hi!></hi!> hi!\" value=\"<hi! class=&quot;hi!&quot;></hi!>\"></hi!>");
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements18 = element16.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node19 = element16.root();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element22 = element21.empty();
        org.jsoup.nodes.Element element23 = element22.empty();
        org.jsoup.nodes.Element element25 = element22.prepend("");
        org.jsoup.nodes.Node node26 = element25.previousSibling();
        org.jsoup.nodes.Element element27 = element16.appendChild((org.jsoup.nodes.Node) element25);
        java.lang.String str28 = element16.nodeName();
        org.jsoup.nodes.Attributes attributes29 = element16.attributes();
        java.lang.String str30 = element16.nodeName();
        org.jsoup.nodes.Element element32 = element16.removeClass("&lt;\n<hi! class=\"\"></hi!>&gt;\n<!--<hi! class=\"\"-->&gt;");
        element14.replaceWith((org.jsoup.nodes.Node) element32);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(element32);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        java.lang.String str6 = element3.html();
        java.lang.String str7 = element3.nodeName();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
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
        org.jsoup.select.Elements elements20 = element10.getElementsContainingOwnText("<hi! class=\"hi!\" value=\"<hi!></hi!>\"></hi!>");
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
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
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
        org.jsoup.select.Elements elements30 = element1.getElementsByAttributeValue("<hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>", "<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element33 = element1.attr("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;", "<<hi!></hi!>></<hi!></hi!>>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList34 = element1.dataNodes();
        java.lang.String str35 = element1.val();
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
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(dataNodeList34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.select.Elements elements9 = element1.children();
        org.jsoup.nodes.Element element10 = element1.empty();
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueMatching("<hi! value=\"\"></hi!>\n<hi!></hi!>", "<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element15 = element10.val("<hi! hi!=\"\">\n <<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>\n</hi!>");
        org.jsoup.select.Elements elements17 = element15.getElementsMatchingOwnText("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        // The following exception was thrown during execution in test generation
        try {
            element15.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingOwnText("hi!");
        int int8 = element5.childNodeSize();
        org.jsoup.nodes.Element element9 = element5.empty();
        org.jsoup.nodes.Element element11 = element5.getElementById("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        java.lang.Integer int12 = element5.elementSiblingIndex();
        org.jsoup.select.Elements elements14 = element5.getElementsContainingText("<hi! hi!=\"\">\n <<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>\n</hi!>");
        org.jsoup.nodes.Node node15 = element5.parentNode();
        org.jsoup.select.Elements elements17 = element5.getElementsMatchingText("<<hi! class=\"hi!\"></hi!>>\n hi!.\n</<hi! class=\"hi!\"></hi!>>");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.select.Elements elements12 = element8.getElementsMatchingOwnText("hi!");
        org.jsoup.nodes.Element element14 = element8.val("<hi!></hi!>");
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements18 = element16.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node19 = element16.root();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element22 = element21.empty();
        org.jsoup.nodes.Element element23 = element22.empty();
        org.jsoup.nodes.Element element25 = element22.prepend("");
        org.jsoup.nodes.Node node26 = element25.previousSibling();
        org.jsoup.nodes.Element element27 = element16.appendChild((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element30 = element29.empty();
        org.jsoup.nodes.Element element31 = element30.empty();
        org.jsoup.nodes.Element element33 = element30.prepend("");
        org.jsoup.nodes.Node node34 = element33.previousSibling();
        org.jsoup.select.Elements elements36 = element33.getElementsContainingText("<hi!></hi!>");
        org.jsoup.nodes.Element element38 = element33.prepend("hi!");
        org.jsoup.nodes.Element element40 = element33.appendText("");
        org.jsoup.nodes.Element element42 = element40.toggleClass("<>>");
        org.jsoup.select.Elements elements44 = element40.getElementsByIndexEquals((int) (short) 0);
        org.jsoup.nodes.Element element45 = element25.before((org.jsoup.nodes.Node) element40);
        boolean boolean46 = element8.hasSameValue((java.lang.Object) element25);
        org.jsoup.parser.Tag tag47 = element8.tag();
        org.jsoup.nodes.Element element48 = element8.previousElementSibling();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNull(element48);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element4 = element1.clone();
        org.jsoup.select.Elements elements5 = element4.siblingElements();
        org.jsoup.nodes.Element element7 = element4.html("<hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>");
        java.util.Set<java.lang.String> strSet8 = element7.classNames();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.prependText("<hi!></hi!>");
        org.jsoup.nodes.Node node7 = element6.previousSibling();
        org.jsoup.nodes.Element element9 = element6.val("<hi!></hi!>");
        org.jsoup.nodes.Element element11 = element9.appendElement("<hi!></hi!>");
        org.jsoup.nodes.Element element13 = element11.prependElement("<hi! class=\"\"></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element11.childNodesCopy();
        java.lang.String str15 = element11.nodeName();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<hi!></hi!>" + "'", str15, "<hi!></hi!>");
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
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
        boolean boolean32 = element29.hasClass("hi!.<hi!.class=\"<hi!.class=&quot;<hi!></hi!>&quot;.value=&quot;hi!&quot;></hi!>\">.hi!.</hi!>");
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        java.lang.String str6 = element2.tagName();
        java.lang.String str8 = element2.attr("hi!");
        org.jsoup.nodes.Element element10 = element2.removeClass("<hi!></hi!>");
        org.jsoup.select.Elements elements12 = element2.getElementsByTag("<hi! class=\"<hi!></hi!>\"></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList13 = element2.dataNodes();
        org.jsoup.nodes.Element element16 = element2.attr("<hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>", "<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">\n hi!\n</hi!>");
        org.jsoup.select.Elements elements18 = element2.getElementsContainingText("hi!");
        element2.setBaseUri("hi!.");
        org.jsoup.nodes.Element element22 = element2.getElementById("<hi! hi!=\"\">\n <<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>\n</hi!>");
        boolean boolean23 = element2.hasText();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(dataNodeList13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
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
        org.jsoup.nodes.Element element16 = element14.prependElement("hi!.hi!");
        org.jsoup.select.NodeVisitor nodeVisitor17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = element16.traverse(nodeVisitor17);
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
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element10.tagName("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element14 = element10.text("<hi!></hi!>");
        java.lang.String str16 = element10.absUrl("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element18 = element10.html("hi!.<hi!>.hi!.</hi!>");
        org.jsoup.select.Elements elements19 = element10.children();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element22 = element21.empty();
        org.jsoup.nodes.Element element23 = element22.empty();
        org.jsoup.nodes.Element element25 = element22.prepend("");
        org.jsoup.select.Elements elements26 = element22.siblingElements();
        org.jsoup.select.Elements elements27 = element22.getAllElements();
        org.jsoup.select.Elements elements29 = element22.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element32 = element22.attr("hi!", "");
        org.jsoup.nodes.Node node33 = element32.parentNode();
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements37 = element35.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element39 = element35.tagName("hi!");
        org.jsoup.parser.Tag tag40 = element39.tag();
        org.jsoup.select.Elements elements41 = element39.siblingElements();
        org.jsoup.nodes.Element element43 = element39.tagName("<hi! class=\"hi!\"></hi!>");
        java.lang.String str44 = element39.outerHtml();
        org.jsoup.nodes.Element element45 = element32.appendChild((org.jsoup.nodes.Node) element39);
        java.util.List<org.jsoup.nodes.Node> nodeList46 = element32.childNodesCopy();
        java.lang.String str47 = element32.html();
        org.jsoup.nodes.Node node48 = element32.root();
        boolean boolean49 = element10.hasSameValue((java.lang.Object) node48);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>" + "'", str44, "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>" + "'", str47, "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
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
        java.lang.String str23 = element5.attr("<hi! class=\"<hi!></hi!> hi!\" value=\"<hi! class=&quot;hi!&quot;></hi!>\"></hi!>");
        org.jsoup.select.Elements elements25 = element5.getElementsContainingText("&lt;hi!&gt;&lt;/hi!&gt;");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
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
        org.jsoup.nodes.Element element14 = element2.tagName("hi!");
        org.jsoup.select.Elements elements16 = element14.getElementsByIndexGreaterThan((int) (short) 100);
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element19 = element18.empty();
        org.jsoup.select.Elements elements20 = element18.parents();
        org.jsoup.nodes.Node node21 = element18.nextSibling();
        org.jsoup.nodes.Element element23 = element18.addClass("<hi!></hi!>");
        org.jsoup.parser.Tag tag24 = element18.tag();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element28 = element27.empty();
        java.lang.String str29 = element27.outerHtml();
        org.jsoup.nodes.Attributes attributes30 = element27.attributes();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag24, "hi!", attributes30);
        org.jsoup.select.Elements elements32 = element31.siblingElements();
        java.lang.String str33 = element31.tagName();
        org.jsoup.nodes.Element element35 = element31.appendText("hi!");
        org.jsoup.nodes.Element element36 = element14.appendChild((org.jsoup.nodes.Node) element35);
        org.jsoup.nodes.Attributes attributes37 = element14.attributes();
        boolean boolean39 = element14.hasAttr("hi!.<hi!>.hi!.</hi!>");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<hi!></hi!>" + "'", str29, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.removeClass("");
        org.jsoup.nodes.Element element5 = element1.appendElement("<>>");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttribute("<>>");
        org.jsoup.nodes.Element element9 = element5.prependText("<hi! hi!=\"\">\n <<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>\n</hi!>");
        org.jsoup.nodes.Element element11 = element5.addClass("<hi! class=\"<hi!></hi!> hi!\" value=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element14 = element13.empty();
        org.jsoup.nodes.Element element15 = element14.empty();
        org.jsoup.nodes.Element element17 = element15.tagName("hi!");
        org.jsoup.select.Elements elements18 = element17.parents();
        org.jsoup.nodes.Node node19 = element17.nextSibling();
        org.jsoup.nodes.Element element21 = element17.appendText("<hi!></hi!>");
        java.lang.String str22 = element17.cssSelector();
        org.jsoup.select.Elements elements23 = element17.parents();
        java.util.Set<java.lang.String> strSet24 = element17.classNames();
        org.jsoup.nodes.Element element25 = element11.classNames(strSet24);
        int int26 = element25.childNodeSize();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
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
        org.jsoup.nodes.Element element20 = element18.wrap("<hi! value=\"\"></hi!>\n<hi!></hi!>");
        org.jsoup.select.Elements elements22 = element20.getElementsContainingText("<hi!>\n &lt;&gt;&gt;\n</hi!>");
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements28 = element25.getElementsByAttributeValueMatching("", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element29 = element20.insertChildren((int) (short) 100, (java.util.Collection<org.jsoup.nodes.Element>) elements28);
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
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements28);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element12 = element11.empty();
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Element element15 = element12.append("<hi!></hi!>");
        org.jsoup.nodes.Element element17 = element15.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element20 = element19.empty();
        org.jsoup.nodes.Element element21 = element20.empty();
        org.jsoup.nodes.Element element23 = element21.tagName("hi!");
        org.jsoup.nodes.Element element25 = element23.val("");
        org.jsoup.nodes.Element element26 = element17.prependChild((org.jsoup.nodes.Node) element25);
        boolean boolean28 = element17.hasClass("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element30 = element17.prependText("");
        org.jsoup.nodes.Element element32 = element30.prepend("");
        int int33 = element32.siblingIndex();
        org.jsoup.nodes.Element element34 = element1.appendChild((org.jsoup.nodes.Node) element32);
        org.jsoup.select.Elements elements35 = element32.getAllElements();
        java.util.Set<java.lang.String> strSet36 = element32.classNames();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(strSet36);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
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
        org.jsoup.nodes.Element element15 = element2.html("<hi!></hi!>");
        java.lang.String str16 = element2.tagName();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element2.textNodes();
        org.jsoup.nodes.Element element20 = element2.attr("<hi!>\n <hi!></hi!>&lt;hi! class=\"&lt;hi!&gt;&lt;/hi!&gt;\"&gt;&lt;/hi!&gt;\n</hi!>", false);
        java.lang.String str21 = element2.id();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList22 = element2.dataNodes();
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(dataNodeList22);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element8 = element2.appendText("hi!");
        java.lang.String str9 = element8.nodeName();
        java.lang.String str10 = element8.cssSelector();
        org.jsoup.nodes.Element element12 = element8.addClass("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        org.jsoup.select.Elements elements14 = element8.getElementsByIndexEquals((int) (short) 0);
        org.jsoup.nodes.Element element16 = element8.prepend("<hi!></hi!>\n<hi! class=\"\">\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        boolean boolean18 = element16.hasAttr("");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }
}

