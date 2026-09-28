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
        org.jsoup.select.Elements elements2 = element1.children();
        java.lang.String str3 = element1.tagName();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements6 = element5.children();
        java.lang.String str7 = element5.className();
        org.jsoup.select.Elements elements9 = element5.getElementsByIndexLessThan((int) '#');
        org.jsoup.select.Elements elements10 = element5.getAllElements();
        boolean boolean11 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element5);
        org.jsoup.nodes.Element element12 = element1.appendTo(element5);
        org.jsoup.nodes.Element element14 = element12.val("<hi!></hi!>");
        org.jsoup.parser.Tag tag15 = element12.tag();
        org.jsoup.select.Elements elements17 = element12.getElementsByIndexLessThan((int) '#');
        org.jsoup.nodes.Element element18 = element12.empty();
        org.jsoup.nodes.Element element21 = element18.attr("<hi! hi! ></hi!>\n<hi! class=\"\"></hi!>", true);
        java.lang.String str22 = element21.ownText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements24 = element21.select("<hi!></hi!>\n<hi!>\n</hi!>\n<hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!></hi!>?<hi!>?</hi!>?<hi!>?</hi!>': unexpected token at '<hi!></hi!>?<hi!>?</hi!>?<hi!>?</hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean2 = element1.isBlock();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.select.Elements elements7 = element4.getElementsByAttributeValueContaining("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>", "<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element4.childNodes();
        org.jsoup.nodes.Node node10 = element4.removeAttr("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element12 = element4.toggleClass("<hi!></hi!>");
        org.jsoup.nodes.Element element15 = element12.attr("<hi! class=\"\">\n <hi!>\n   &lt;hi!&gt;&lt;/hi!&gt; \n </hi!>\n</hi!>", false);
        org.jsoup.select.Elements elements17 = element12.getElementsByIndexEquals(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        org.jsoup.select.Elements elements5 = element1.getElementsContainingText("hi!");
        org.jsoup.nodes.Element element8 = element1.attr("hi!", true);
        org.jsoup.nodes.Element element11 = element8.attr("", true);
        org.jsoup.nodes.Element element13 = element11.toggleClass("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element15 = element11.prepend("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element15.childNodes();
        java.lang.String str17 = element15.tagName();
        java.lang.String str18 = element15.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = element15.childNodes;
        java.lang.String str21 = element15.attr("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.select.Elements elements22 = element15.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements25 = element15.getElementsByAttributeValueNot("", "<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        java.lang.String str3 = element1.className();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan((int) '#');
        org.jsoup.select.Elements elements6 = element1.getAllElements();
        boolean boolean7 = element1.hasParent();
        org.jsoup.select.Elements elements9 = element1.getElementsByIndexGreaterThan((int) (byte) 10);
        org.jsoup.nodes.Node node10 = element1.clearAttributes();
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean2 = element1.isBlock();
        org.jsoup.nodes.Element element4 = element1.prependText("");
        java.util.Set<java.lang.String> strSet5 = element1.classNames();
        org.jsoup.nodes.Element element7 = element1.prependText("<hi!></hi!>");
        java.lang.String str8 = element1.toString();
        org.jsoup.nodes.Element element10 = element1.text("hi!");
        org.jsoup.nodes.Element element12 = element1.prepend("");
        boolean boolean13 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element12);
        org.jsoup.nodes.Element element15 = element12.text("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element17 = element15.val("&lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt;");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>" + "'", str8, "<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        org.jsoup.select.Elements elements5 = element1.getElementsContainingText("hi!");
        java.lang.String str6 = element1.toString();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements9 = element8.children();
        org.jsoup.nodes.Element element10 = element8.clone();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements13 = element12.children();
        java.lang.String str14 = element12.className();
        org.jsoup.nodes.Element element15 = element10.prependChild((org.jsoup.nodes.Node) element12);
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element10.childNodes();
        boolean boolean18 = element10.hasClass("hi!");
        org.jsoup.select.Elements elements19 = element10.parents();
        org.jsoup.select.Elements elements22 = element10.getElementsByAttributeValueMatching("<hi!></hi!>", "");
        org.jsoup.nodes.Element element23 = element1.appendChild((org.jsoup.nodes.Node) element10);
        java.util.Set<java.lang.String> strSet24 = element10.classNames();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements27 = element26.children();
        org.jsoup.nodes.Element element29 = element26.append("");
        org.jsoup.nodes.Element element30 = element29.clone();
        org.jsoup.nodes.Element element32 = element29.prependText("");
        org.jsoup.nodes.Node[] nodeArray34 = new org.jsoup.nodes.Node[] {};
        org.jsoup.nodes.Element element35 = element32.insertChildren((int) (byte) 1, nodeArray34);
        java.lang.String str36 = element35.text();
        boolean boolean38 = element35.hasSameValue((java.lang.Object) (byte) 1);
        org.jsoup.nodes.Element element40 = element35.appendText("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        boolean boolean41 = element40.hasAttributes();
        org.jsoup.nodes.Element element42 = element10.prependChild((org.jsoup.nodes.Node) element40);
        org.jsoup.nodes.Element element44 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements45 = element44.children();
        org.jsoup.nodes.Element element46 = element44.clone();
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements49 = element48.children();
        org.jsoup.nodes.Element element51 = element48.append("");
        org.jsoup.nodes.Element element52 = element51.clone();
        org.jsoup.nodes.Element element54 = element51.prependText("");
        org.jsoup.nodes.Element element56 = element54.prepend("<hi!></hi!>");
        org.jsoup.nodes.Element element57 = element44.doClone((org.jsoup.nodes.Node) element56);
        org.jsoup.nodes.Element element60 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements61 = element60.children();
        org.jsoup.nodes.Element element62 = element60.clone();
        org.jsoup.nodes.Element element64 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements65 = element64.children();
        java.lang.String str66 = element64.className();
        org.jsoup.nodes.Element element67 = element62.prependChild((org.jsoup.nodes.Node) element64);
        java.util.List<org.jsoup.nodes.Node> nodeList68 = element62.childNodes();
        org.jsoup.select.Elements elements71 = element62.getElementsByAttributeValueContaining("<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Element element72 = element56.insertChildren(0, (java.util.Collection<org.jsoup.nodes.Element>) elements71);
        org.jsoup.nodes.Element element74 = element56.removeClass("");
        java.lang.String str75 = element74.ownText();
        org.jsoup.nodes.Element element76 = element42.appendChild((org.jsoup.nodes.Node) element74);
        org.jsoup.select.Elements elements79 = element42.getElementsByAttributeValueContaining("<hi!>\n</hi!>", "<hi!> </hi!>");
        org.jsoup.nodes.Element element80 = element42.empty();
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi!></hi!>" + "'", str6, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(nodeArray34);
        org.junit.Assert.assertArrayEquals(nodeArray34, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(elements65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertNotNull(elements71);
        org.junit.Assert.assertNotNull(element72);
        org.junit.Assert.assertNotNull(element74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(element76);
        org.junit.Assert.assertNotNull(elements79);
        org.junit.Assert.assertNotNull(element80);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        org.jsoup.select.Elements elements5 = element1.getElementsContainingText("hi!");
        java.lang.String str6 = element1.toString();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements9 = element8.children();
        org.jsoup.nodes.Element element10 = element8.clone();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements13 = element12.children();
        java.lang.String str14 = element12.className();
        org.jsoup.nodes.Element element15 = element10.prependChild((org.jsoup.nodes.Node) element12);
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element10.childNodes();
        boolean boolean18 = element10.hasClass("hi!");
        org.jsoup.select.Elements elements19 = element10.parents();
        org.jsoup.select.Elements elements22 = element10.getElementsByAttributeValueMatching("<hi!></hi!>", "");
        org.jsoup.nodes.Element element23 = element1.appendChild((org.jsoup.nodes.Node) element10);
        org.jsoup.nodes.Node node24 = element23.previousSibling();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements27 = element26.children();
        org.jsoup.nodes.Node node28 = element26.root();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = element26.siblingNodes();
        java.util.regex.Pattern pattern31 = null;
        org.jsoup.select.Elements elements32 = element26.getElementsByAttributeValueMatching("", pattern31);
        int int33 = element26.siblingIndex();
        java.lang.String str34 = element26.className();
        org.jsoup.nodes.Element element35 = element23.doClone((org.jsoup.nodes.Node) element26);
        org.jsoup.nodes.Element element37 = element35.addClass("<hi!></hi!>");
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements40 = element39.children();
        org.jsoup.nodes.Node node41 = element39.root();
        org.jsoup.nodes.Node node42 = element39.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = element39.childNodes;
        boolean boolean44 = element39.hasParent();
        org.jsoup.nodes.Element element45 = element37.prependChild((org.jsoup.nodes.Node) element39);
        org.jsoup.nodes.Node node46 = element39.nextSibling();
        org.jsoup.select.Elements elements48 = element39.getElementsContainingOwnText("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        boolean boolean50 = element39.hasClass("");
        java.util.List<org.jsoup.nodes.Node> nodeList51 = element39.siblingNodes();
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi!></hi!>" + "'", str6, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(nodeList51);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!></hi!>");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements4 = element1.siblingElements();
        org.jsoup.select.Elements elements6 = element1.getElementsContainingText("&lt;hi!&gt; &lt;/hi!&gt;");
        java.util.Set<java.lang.String> strSet7 = element1.classNames();
        org.jsoup.nodes.Element element10 = element1.attr("<hi! value=\"&amp;lt;hi!&amp;gt; &amp;lt;/hi!&amp;gt;\"></hi!>", true);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element3 = element1.clone();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements6 = element5.children();
        java.lang.String str7 = element5.className();
        org.jsoup.nodes.Element element8 = element3.prependChild((org.jsoup.nodes.Node) element5);
        org.jsoup.nodes.Node node9 = element8.clearAttributes();
        org.jsoup.nodes.Node node10 = element8.root();
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = element1.siblingNodes();
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("", pattern6);
        int int8 = element1.siblingIndex();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList9 = element1.dataNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element1.childNodesCopy();
        java.lang.String str11 = element1.toString();
        java.lang.String str12 = element1.baseUri();
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dataNodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi!></hi!>" + "'", str11, "<hi!></hi!>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element3 = element1.clone();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements6 = element5.children();
        java.lang.String str7 = element5.className();
        org.jsoup.nodes.Element element8 = element3.prependChild((org.jsoup.nodes.Node) element5);
        org.jsoup.nodes.Node node9 = element8.clearAttributes();
        org.jsoup.select.Elements elements11 = element8.getElementsByAttribute("<hi!></hi!>");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements14 = element13.children();
        org.jsoup.nodes.Node node15 = element13.root();
        java.lang.String str16 = element13.baseUri();
        java.lang.String str17 = element13.baseUri();
        java.lang.String str19 = element13.attr("<hi!></hi!>");
        boolean boolean20 = element13.hasAttributes();
        org.jsoup.nodes.Element element22 = element13.appendText("");
        element22.setBaseUri("<hi!></hi!>");
        org.jsoup.nodes.Element element26 = element22.addClass("");
        org.jsoup.nodes.Element element27 = element8.prependChild((org.jsoup.nodes.Node) element22);
        org.jsoup.select.Elements elements29 = element22.getElementsContainingOwnText("<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements31 = element22.getElementsByAttribute("<hi!> </hi!>");
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements34 = element33.children();
        org.jsoup.nodes.Element element36 = element33.append("");
        org.jsoup.nodes.Element element38 = element36.html("");
        org.jsoup.nodes.Element element40 = element36.tagName("hi!");
        org.jsoup.nodes.Element element42 = element36.prependText("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element44 = new org.jsoup.nodes.Element("hi!");
        boolean boolean45 = element44.isBlock();
        org.jsoup.nodes.Element element47 = element44.prependElement("hi!");
        org.jsoup.select.Elements elements50 = element47.getElementsByAttributeValueContaining("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>", "<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element52 = element47.addClass("<hi!></hi!>");
        org.jsoup.nodes.Element element54 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements55 = element54.children();
        org.jsoup.nodes.Node node56 = element54.root();
        org.jsoup.select.Elements elements58 = element54.getElementsContainingText("hi!");
        boolean boolean60 = element54.hasAttr("");
        org.jsoup.nodes.Element element61 = element47.prependChild((org.jsoup.nodes.Node) element54);
        org.jsoup.nodes.Element element63 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements64 = element63.children();
        org.jsoup.nodes.Node node65 = element63.root();
        org.jsoup.select.Elements elements67 = element63.getElementsContainingText("hi!");
        org.jsoup.nodes.Element element70 = element63.attr("hi!", true);
        org.jsoup.nodes.Element element73 = element70.attr("", true);
        org.jsoup.nodes.Element element75 = element73.toggleClass("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element77 = element73.prepend("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.select.Elements elements79 = element73.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element80 = element61.before((org.jsoup.nodes.Node) element73);
        boolean boolean82 = element80.hasAttr("<hi!> &lt;hi!&gt;&lt;/hi!&gt; </hi!>");
        java.util.Set<java.lang.String> strSet83 = element80.classNames();
        org.jsoup.nodes.Element element84 = element36.classNames(strSet83);
        org.jsoup.nodes.Element element85 = element22.classNames(strSet83);
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(elements58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(elements64);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(elements67);
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertNotNull(element73);
        org.junit.Assert.assertNotNull(element75);
        org.junit.Assert.assertNotNull(element77);
        org.junit.Assert.assertNotNull(elements79);
        org.junit.Assert.assertNotNull(element80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(strSet83);
        org.junit.Assert.assertNotNull(element84);
        org.junit.Assert.assertNotNull(element85);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        java.lang.String str3 = element1.className();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan((int) '#');
        org.jsoup.select.Elements elements6 = element1.getAllElements();
        boolean boolean7 = element1.hasParent();
        org.jsoup.select.Elements elements9 = element1.getElementsByIndexGreaterThan((int) (byte) 10);
        org.jsoup.nodes.Node node10 = element1.nextSibling();
        boolean boolean12 = element1.hasClass("<hi! class=\"<hi!> </hi!>\">\n</hi!>");
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element5 = element4.clone();
        org.jsoup.nodes.Element element7 = element4.prependText("");
        org.jsoup.nodes.Element element9 = element7.prepend("<hi!></hi!>");
        org.jsoup.nodes.Element element11 = element7.removeClass("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element12 = element7.clone();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements15 = element14.children();
        org.jsoup.nodes.Element element16 = element14.clone();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements19 = element18.children();
        java.lang.String str20 = element18.className();
        org.jsoup.nodes.Element element21 = element16.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.select.Elements elements23 = element18.getElementsMatchingOwnText("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.lang.String str24 = element18.text();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements27 = element26.children();
        org.jsoup.nodes.Element element28 = element26.clone();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements31 = element30.children();
        org.jsoup.nodes.Element element33 = element30.append("");
        org.jsoup.nodes.Element element34 = element33.clone();
        org.jsoup.nodes.Element element36 = element33.prependText("");
        org.jsoup.nodes.Element element38 = element36.prepend("<hi!></hi!>");
        org.jsoup.nodes.Element element39 = element26.doClone((org.jsoup.nodes.Node) element38);
        org.jsoup.nodes.Element element40 = element18.after((org.jsoup.nodes.Node) element38);
        org.jsoup.nodes.Element element41 = element40.clone();
        boolean boolean43 = element40.hasAttr("<hi!>\n <hi!></hi!>\n</hi!>");
        int int44 = element40.childNodeSize();
        element40.doSetBaseUri("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element47 = element7.appendChild((org.jsoup.nodes.Node) element40);
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements50 = element49.children();
        java.lang.String str51 = element49.tagName();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements54 = element53.children();
        java.lang.String str55 = element53.className();
        org.jsoup.select.Elements elements57 = element53.getElementsByIndexLessThan((int) '#');
        org.jsoup.select.Elements elements58 = element53.getAllElements();
        boolean boolean59 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element53);
        org.jsoup.nodes.Element element60 = element49.appendTo(element53);
        org.jsoup.nodes.Element element63 = element49.attr("<hi!>\n <hi!></hi!>\n</hi!>", false);
        element40.replaceWith((org.jsoup.nodes.Node) element49);
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(elements57);
        org.junit.Assert.assertNotNull(elements58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(element63);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        java.lang.String str4 = element1.baseUri();
        java.lang.String str5 = element1.baseUri();
        java.lang.String str7 = element1.attr("<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element1.attr("hi!", "<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.lang.String str11 = element10.text();
        org.jsoup.select.Elements elements13 = element10.getElementsByAttribute("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element10.childNodes();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements17 = element16.children();
        org.jsoup.nodes.Element element18 = element16.clone();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements21 = element20.children();
        java.lang.String str22 = element20.className();
        org.jsoup.nodes.Element element23 = element18.prependChild((org.jsoup.nodes.Node) element20);
        org.jsoup.select.Elements elements25 = element20.getElementsMatchingOwnText("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.lang.String str26 = element20.text();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements29 = element28.children();
        org.jsoup.nodes.Element element30 = element28.clone();
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements33 = element32.children();
        org.jsoup.nodes.Element element35 = element32.append("");
        org.jsoup.nodes.Element element36 = element35.clone();
        org.jsoup.nodes.Element element38 = element35.prependText("");
        org.jsoup.nodes.Element element40 = element38.prepend("<hi!></hi!>");
        org.jsoup.nodes.Element element41 = element28.doClone((org.jsoup.nodes.Node) element40);
        org.jsoup.nodes.Element element42 = element20.after((org.jsoup.nodes.Node) element40);
        org.jsoup.nodes.Element element44 = element20.html("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList45 = element20.textNodes();
        boolean boolean46 = element10.hasSameValue((java.lang.Object) element20);
        java.lang.String str47 = element10.cssSelector();
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(textNodeList45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        int int5 = element1.childNodeSize();
        org.jsoup.select.Elements elements7 = element1.getElementsByIndexGreaterThan((int) '#');
        boolean boolean8 = element1.hasParent();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element1.childNodes();
        org.jsoup.nodes.Element element11 = element1.text("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element13 = element11.appendElement("<hi! hi! ></hi!>");
        org.jsoup.select.Elements elements15 = element13.getElementsByAttribute("<<hi!>\n <hi!></hi!>\n</hi!>></<hi!>\n <hi!></hi!>\n</hi!>>");
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element6 = element4.html("");
        org.jsoup.nodes.Element element8 = element4.tagName("hi!");
        org.jsoup.nodes.Node node9 = element8.nextSibling();
        java.lang.String str10 = element8.nodeName();
        org.jsoup.nodes.Element element12 = element8.val("hi!");
        org.jsoup.nodes.Element element14 = element12.prependElement("hi!");
        org.jsoup.nodes.Element element16 = element14.append("<hi!>\n</hi!>");
        java.lang.String str18 = element14.attr("<hi! class=\"\">\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.lang.String str19 = element14.toString();
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<hi!>\n <hi!> \n </hi!>\n</hi!>" + "'", str19, "<hi!>\n <hi!> \n </hi!>\n</hi!>");
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element5 = element4.clone();
        org.jsoup.select.Elements elements7 = element4.getElementsByIndexEquals(0);
        org.jsoup.select.Elements elements9 = element4.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements12 = element11.children();
        org.jsoup.nodes.Node node13 = element11.root();
        org.jsoup.select.Elements elements15 = element11.getElementsContainingText("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element11.childNodesCopy();
        element4.childNodes = nodeList16;
        org.jsoup.select.Elements elements18 = element4.siblingElements();
        java.lang.String str19 = element4.tagName();
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        org.jsoup.select.Elements elements5 = element1.getElementsContainingText("hi!");
        java.lang.String str6 = element1.toString();
        element1.setBaseUri("<hi!></hi!>");
        int int9 = element1.childNodeSize();
        org.jsoup.select.Elements elements11 = element1.getElementsByIndexGreaterThan(2);
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements14 = element13.children();
        org.jsoup.nodes.Element element16 = element13.append("");
        org.jsoup.select.Elements elements19 = element16.getElementsByAttributeValueStarting("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>", "<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.lang.String str21 = element16.absUrl("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element16.ensureChildNodes();
        org.jsoup.select.Elements elements25 = element16.getElementsByAttributeValue("<hi!></hi!>", "<hi!>\n</hi!>");
        org.jsoup.nodes.Element element26 = element1.appendTo(element16);
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements29 = element28.children();
        org.jsoup.nodes.Node node30 = element28.root();
        java.lang.String str31 = element28.baseUri();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList32 = element28.textNodes();
        org.jsoup.nodes.Element element33 = element26.appendChild((org.jsoup.nodes.Node) element28);
        java.util.regex.Pattern pattern34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements35 = element33.getElementsMatchingOwnText(pattern34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi!></hi!>" + "'", str6, "<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(textNodeList32);
        org.junit.Assert.assertNotNull(element33);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        org.jsoup.select.Elements elements5 = element1.getElementsContainingText("hi!");
        java.lang.String str6 = element1.toString();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements9 = element8.children();
        org.jsoup.nodes.Element element10 = element8.clone();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements13 = element12.children();
        java.lang.String str14 = element12.className();
        org.jsoup.nodes.Element element15 = element10.prependChild((org.jsoup.nodes.Node) element12);
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element10.childNodes();
        boolean boolean18 = element10.hasClass("hi!");
        org.jsoup.select.Elements elements19 = element10.parents();
        org.jsoup.select.Elements elements22 = element10.getElementsByAttributeValueMatching("<hi!></hi!>", "");
        org.jsoup.nodes.Element element23 = element1.appendChild((org.jsoup.nodes.Node) element10);
        java.util.Set<java.lang.String> strSet24 = element10.classNames();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements27 = element26.children();
        org.jsoup.nodes.Element element29 = element26.append("");
        org.jsoup.nodes.Element element30 = element29.clone();
        org.jsoup.nodes.Element element32 = element29.prependText("");
        org.jsoup.nodes.Node[] nodeArray34 = new org.jsoup.nodes.Node[] {};
        org.jsoup.nodes.Element element35 = element32.insertChildren((int) (byte) 1, nodeArray34);
        java.lang.String str36 = element35.text();
        boolean boolean38 = element35.hasSameValue((java.lang.Object) (byte) 1);
        org.jsoup.nodes.Element element40 = element35.appendText("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        boolean boolean41 = element40.hasAttributes();
        org.jsoup.nodes.Element element42 = element10.prependChild((org.jsoup.nodes.Node) element40);
        org.jsoup.nodes.Element element44 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements45 = element44.children();
        org.jsoup.nodes.Element element47 = element44.append("");
        org.jsoup.nodes.Element element49 = element47.html("");
        org.jsoup.nodes.Element element51 = element47.removeClass("<hi!></hi!>");
        java.lang.String str52 = element51.html();
        java.lang.String str54 = element51.attr("<hi!>\n <hi!></hi!>\n</hi!>");
        java.lang.String str55 = element51.tagName();
        boolean boolean56 = element51.hasParent();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = element51.childNodes;
        element40.childNodes = nodeList57;
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi!></hi!>" + "'", str6, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(nodeArray34);
        org.junit.Assert.assertArrayEquals(nodeArray34, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(nodeList57);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean2 = element1.isBlock();
        org.jsoup.nodes.Element element4 = element1.prependText("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = element1.dataset();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        boolean boolean8 = element7.isBlock();
        org.jsoup.nodes.Element element10 = element7.prependElement("hi!");
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueContaining("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>", "<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element15 = element10.addClass("<hi!></hi!>");
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements18 = element17.children();
        org.jsoup.nodes.Node node19 = element17.root();
        org.jsoup.select.Elements elements21 = element17.getElementsContainingText("hi!");
        boolean boolean23 = element17.hasAttr("");
        org.jsoup.nodes.Element element24 = element10.prependChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element25 = element1.appendChild((org.jsoup.nodes.Node) element10);
        org.jsoup.nodes.Element element27 = element10.tagName("<hi!></hi!>");
        boolean boolean28 = element10.hasAttributes();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element5 = element4.clone();
        org.jsoup.nodes.Element element7 = element4.prependText("");
        org.jsoup.nodes.Node[] nodeArray9 = new org.jsoup.nodes.Node[] {};
        org.jsoup.nodes.Element element10 = element7.insertChildren((int) (byte) 1, nodeArray9);
        java.lang.String str11 = element10.text();
        boolean boolean13 = element10.hasSameValue((java.lang.Object) (byte) 1);
        org.jsoup.nodes.Element element15 = element10.appendText("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements18 = element17.children();
        org.jsoup.nodes.Element element20 = element17.append("");
        org.jsoup.nodes.Element element22 = element20.html("");
        org.jsoup.nodes.Element element24 = element20.tagName("hi!");
        org.jsoup.nodes.Node node25 = element24.nextSibling();
        java.lang.String str26 = element24.nodeName();
        org.jsoup.nodes.Element element28 = element24.val("hi!");
        org.jsoup.nodes.Element element30 = element28.prependElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = element28.childNodes;
        org.jsoup.nodes.Element element33 = element28.text("<hi!></hi!>");
        org.jsoup.nodes.Element element34 = element10.prependChild((org.jsoup.nodes.Node) element28);
        org.jsoup.nodes.Element element36 = element28.append("");
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements39 = element38.children();
        org.jsoup.nodes.Element element41 = element38.append("");
        org.jsoup.nodes.Element element42 = element41.clone();
        org.jsoup.nodes.Element element44 = element41.prependText("");
        org.jsoup.parser.Tag tag45 = element44.tag();
        org.jsoup.nodes.Element element47 = new org.jsoup.nodes.Element(tag45, "<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Attributes attributes49 = null;
        org.jsoup.nodes.Element element50 = new org.jsoup.nodes.Element(tag45, "hi!", attributes49);
        org.jsoup.nodes.Element element52 = new org.jsoup.nodes.Element(tag45, "");
        org.jsoup.nodes.Element element55 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements56 = element55.children();
        org.jsoup.nodes.Node node57 = element55.root();
        java.lang.String str58 = element55.baseUri();
        org.jsoup.nodes.Attributes attributes59 = element55.attributes();
        org.jsoup.nodes.Element element60 = new org.jsoup.nodes.Element(tag45, "", attributes59);
        org.jsoup.nodes.Element element62 = new org.jsoup.nodes.Element(tag45, "<<hi!></hi!>></<hi!></hi!>>");
        org.jsoup.nodes.Attributes attributes64 = null;
        org.jsoup.nodes.Element element65 = new org.jsoup.nodes.Element(tag45, "<<hi!></hi!>></<hi!></hi!>>", attributes64);
        org.jsoup.nodes.Element element66 = element36.prependChild((org.jsoup.nodes.Node) element65);
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(nodeArray9);
        org.junit.Assert.assertArrayEquals(nodeArray9, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(attributes59);
        org.junit.Assert.assertNotNull(element66);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        java.lang.String str3 = element1.tagName();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements6 = element5.children();
        java.lang.String str7 = element5.className();
        org.jsoup.select.Elements elements9 = element5.getElementsByIndexLessThan((int) '#');
        org.jsoup.select.Elements elements10 = element5.getAllElements();
        boolean boolean11 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element5);
        org.jsoup.nodes.Element element12 = element1.appendTo(element5);
        org.jsoup.nodes.Element element14 = element12.val("<hi!></hi!>");
        org.jsoup.parser.Tag tag15 = element12.tag();
        org.jsoup.select.Elements elements17 = element12.getElementsByIndexLessThan((int) '#');
        org.jsoup.nodes.Attributes attributes18 = element12.attributes();
        org.jsoup.nodes.Element element21 = element12.attr("hi!", "");
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements24 = element23.children();
        org.jsoup.nodes.Node node25 = element23.root();
        org.jsoup.select.Elements elements27 = element23.getElementsContainingText("hi!");
        java.lang.String str28 = element23.toString();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements31 = element30.children();
        org.jsoup.nodes.Element element32 = element30.clone();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements35 = element34.children();
        java.lang.String str36 = element34.className();
        org.jsoup.nodes.Element element37 = element32.prependChild((org.jsoup.nodes.Node) element34);
        java.util.List<org.jsoup.nodes.Node> nodeList38 = element32.childNodes();
        boolean boolean40 = element32.hasClass("hi!");
        org.jsoup.select.Elements elements41 = element32.parents();
        org.jsoup.select.Elements elements44 = element32.getElementsByAttributeValueMatching("<hi!></hi!>", "");
        org.jsoup.nodes.Element element45 = element23.appendChild((org.jsoup.nodes.Node) element32);
        org.jsoup.nodes.Node node46 = element23.nextSibling();
        org.jsoup.nodes.Element element47 = element12.before((org.jsoup.nodes.Node) element23);
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements50 = element49.children();
        org.jsoup.nodes.Element element52 = element49.append("");
        org.jsoup.nodes.Element element53 = element52.clone();
        org.jsoup.nodes.Element element55 = element52.prependText("");
        org.jsoup.nodes.Node[] nodeArray57 = new org.jsoup.nodes.Node[] {};
        org.jsoup.nodes.Element element58 = element55.insertChildren((int) (byte) 1, nodeArray57);
        java.lang.String str59 = element58.text();
        boolean boolean61 = element58.hasSameValue((java.lang.Object) (byte) 1);
        org.jsoup.nodes.Element element63 = element58.appendText("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element65 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements66 = element65.children();
        org.jsoup.nodes.Element element68 = element65.append("");
        org.jsoup.nodes.Element element70 = element68.html("");
        org.jsoup.nodes.Element element72 = element68.tagName("hi!");
        org.jsoup.nodes.Node node73 = element72.nextSibling();
        java.lang.String str74 = element72.nodeName();
        org.jsoup.nodes.Element element76 = element72.val("hi!");
        org.jsoup.nodes.Element element78 = element76.prependElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList79 = element76.childNodes;
        org.jsoup.nodes.Element element81 = element76.text("<hi!></hi!>");
        org.jsoup.nodes.Element element82 = element58.prependChild((org.jsoup.nodes.Node) element76);
        org.jsoup.select.Elements elements84 = element82.getElementsByIndexLessThan((int) (byte) 1);
        org.jsoup.nodes.Element element85 = element23.appendTo(element82);
        element85.nodelistChanged();
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<hi!></hi!>" + "'", str28, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(nodeArray57);
        org.junit.Assert.assertArrayEquals(nodeArray57, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(elements66);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertNotNull(element72);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertNotNull(element76);
        org.junit.Assert.assertNotNull(element78);
        org.junit.Assert.assertNotNull(nodeList79);
        org.junit.Assert.assertNotNull(element81);
        org.junit.Assert.assertNotNull(element82);
        org.junit.Assert.assertNotNull(elements84);
        org.junit.Assert.assertNotNull(element85);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element6 = element4.html("");
        org.jsoup.select.Elements elements7 = element4.children();
        java.lang.String str8 = element4.toString();
        org.jsoup.nodes.Element element11 = element4.attr("<hi!></hi!>", "");
        org.jsoup.select.Elements elements13 = element4.getElementsMatchingOwnText("<hi! value=\"&amp;lt;hi!&amp;gt; &amp;lt;/hi!&amp;gt;\"></hi!>");
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<hi!></hi!>" + "'", str8, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        java.lang.String str3 = element1.tagName();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements6 = element5.children();
        java.lang.String str7 = element5.className();
        org.jsoup.select.Elements elements9 = element5.getElementsByIndexLessThan((int) '#');
        org.jsoup.select.Elements elements10 = element5.getAllElements();
        boolean boolean11 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element5);
        org.jsoup.nodes.Element element12 = element1.appendTo(element5);
        org.jsoup.nodes.Element element14 = element12.val("<hi!></hi!>");
        org.jsoup.parser.Tag tag15 = element12.tag();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements19 = element18.children();
        org.jsoup.nodes.Element element21 = element18.append("");
        org.jsoup.nodes.Element element22 = element21.clone();
        org.jsoup.nodes.Element element24 = element21.prependText("");
        org.jsoup.parser.Tag tag25 = element24.tag();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag25, "<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Attributes attributes29 = null;
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element(tag25, "hi!", attributes29);
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements34 = element33.children();
        org.jsoup.nodes.Node node35 = element33.root();
        java.lang.String str36 = element33.baseUri();
        org.jsoup.nodes.Attributes attributes37 = element33.attributes();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag25, "hi!", attributes37);
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element(tag15, "<hi!></hi!>", attributes37);
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag15, "<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element44 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements45 = element44.children();
        org.jsoup.nodes.Element element47 = element44.append("");
        org.jsoup.nodes.Element element48 = element47.clone();
        org.jsoup.nodes.Element element50 = element47.prependText("");
        org.jsoup.parser.Tag tag51 = element50.tag();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element(tag51, "<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Attributes attributes55 = null;
        org.jsoup.nodes.Element element56 = new org.jsoup.nodes.Element(tag51, "hi!", attributes55);
        org.jsoup.nodes.Element element58 = new org.jsoup.nodes.Element(tag51, "");
        org.jsoup.nodes.Element element61 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements62 = element61.children();
        org.jsoup.nodes.Element element64 = element61.append("");
        java.lang.String str65 = element61.toString();
        org.jsoup.nodes.Element element66 = element61.nextElementSibling();
        org.jsoup.nodes.Attributes attributes67 = element61.attributes();
        org.jsoup.nodes.Element element68 = new org.jsoup.nodes.Element(tag51, "", attributes67);
        org.jsoup.nodes.Element element69 = new org.jsoup.nodes.Element(tag15, "<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>", attributes67);
        org.jsoup.nodes.Element element72 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements73 = element72.children();
        org.jsoup.nodes.Element element75 = element72.append("");
        org.jsoup.nodes.Element element76 = element75.clone();
        org.jsoup.nodes.Element element78 = element75.prependText("");
        org.jsoup.parser.Tag tag79 = element78.tag();
        org.jsoup.nodes.Element element81 = new org.jsoup.nodes.Element(tag79, "<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Attributes attributes83 = null;
        org.jsoup.nodes.Element element84 = new org.jsoup.nodes.Element(tag79, "hi!", attributes83);
        org.jsoup.nodes.Element element87 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements88 = element87.children();
        org.jsoup.nodes.Node node89 = element87.root();
        java.lang.String str90 = element87.baseUri();
        org.jsoup.nodes.Attributes attributes91 = element87.attributes();
        org.jsoup.nodes.Element element92 = new org.jsoup.nodes.Element(tag79, "hi!", attributes91);
        org.jsoup.nodes.Element element93 = new org.jsoup.nodes.Element(tag15, "hi!", attributes91);
        java.lang.String str95 = element93.attr("<hi!> &lt;hi!&gt;&lt;/hi!&gt; </hi!>");
        org.jsoup.nodes.Element element97 = element93.prependElement("<<hi! class=\"\"></hi!>>\n <hi!></hi!>\n</<hi! class=\"\"></hi!>>");
        org.jsoup.select.Elements elements99 = element97.getElementsMatchingText("<hi! value=\"<hi! class=&quot;&quot;>\n &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt;\n</hi!>\"></hi!>");
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(elements62);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "<hi!></hi!>" + "'", str65, "<hi!></hi!>");
        org.junit.Assert.assertNull(element66);
        org.junit.Assert.assertNotNull(attributes67);
        org.junit.Assert.assertNotNull(elements73);
        org.junit.Assert.assertNotNull(element75);
        org.junit.Assert.assertNotNull(element76);
        org.junit.Assert.assertNotNull(element78);
        org.junit.Assert.assertNotNull(tag79);
        org.junit.Assert.assertNotNull(elements88);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertNotNull(attributes91);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
        org.junit.Assert.assertNotNull(element97);
        org.junit.Assert.assertNotNull(elements99);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element6 = element4.html("");
        org.jsoup.nodes.Element element8 = element4.removeClass("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        java.lang.String str10 = element8.baseUri();
        org.jsoup.nodes.Element element12 = element8.append("<hi! hi! ></hi!>");
        element8.setBaseUri("&lt;hi!&gt; &lt;/hi!&gt;");
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean2 = element1.isBlock();
        org.jsoup.nodes.Element element4 = element1.prependText("");
        java.util.Set<java.lang.String> strSet5 = element1.classNames();
        org.jsoup.nodes.Element element7 = element1.prependText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList8 = element1.dataNodes();
        org.jsoup.nodes.Element element10 = element1.addClass("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element12 = element10.tagName("<hi!>\n <hi! class=\"<hi!></hi!>\">\n </hi!>\n</hi!>");
        boolean boolean13 = element12.hasText();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements16 = element15.children();
        org.jsoup.nodes.Element element17 = element15.clone();
        org.jsoup.nodes.Element element19 = element15.text("");
        int int20 = element19.siblingIndex();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements23 = element22.children();
        org.jsoup.nodes.Element element25 = element22.append("");
        java.lang.String str26 = element22.toString();
        element22.nodelistChanged();
        org.jsoup.select.Elements elements29 = element22.getElementsByIndexLessThan(10);
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements32 = element31.children();
        org.jsoup.nodes.Element element34 = element31.append("");
        org.jsoup.nodes.Element element35 = element34.clone();
        org.jsoup.nodes.Element element37 = element34.prependText("");
        org.jsoup.parser.Tag tag38 = element37.tag();
        int int39 = element37.siblingIndex();
        int int40 = element37.elementSiblingIndex();
        org.jsoup.nodes.Element element42 = element37.toggleClass("hi!");
        org.jsoup.nodes.Element element43 = element22.doClone((org.jsoup.nodes.Node) element42);
        java.util.List<org.jsoup.nodes.Node> nodeList44 = element22.childNodes;
        org.jsoup.nodes.Element element45 = element22.clone();
        boolean boolean46 = element19.hasSameValue((java.lang.Object) element45);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList47 = element45.textNodes();
        org.jsoup.nodes.Element element48 = element12.appendTo(element45);
        java.lang.String str49 = element45.cssSelector();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(dataNodeList8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<hi!></hi!>" + "'", str26, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(textNodeList47);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element3 = element1.clone();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements6 = element5.children();
        java.lang.String str7 = element5.className();
        org.jsoup.nodes.Element element8 = element3.prependChild((org.jsoup.nodes.Node) element5);
        org.jsoup.select.Elements elements10 = element5.getElementsMatchingOwnText("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.util.regex.Pattern pattern12 = null;
        org.jsoup.select.Elements elements13 = element5.getElementsByAttributeValueMatching("", pattern12);
        org.jsoup.select.Elements elements16 = element5.getElementsByAttributeValueMatching("hi!", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element18 = element5.addClass("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.util.Set<java.lang.String> strSet19 = element5.classNames();
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element6 = element4.html("");
        org.jsoup.nodes.Element element8 = element4.tagName("hi!");
        org.jsoup.nodes.Node node9 = element8.nextSibling();
        java.lang.String str10 = element8.nodeName();
        org.jsoup.nodes.Element element12 = element8.val("hi!");
        org.jsoup.nodes.Element element14 = element12.prependElement("hi!");
        org.jsoup.nodes.Element element16 = element14.append("<hi!>\n</hi!>");
        boolean boolean17 = element14.isBlock();
        boolean boolean18 = element14.isBlock();
        org.jsoup.nodes.Element element20 = element14.append("<hi! class=\"\">\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        boolean boolean21 = element20.hasAttributes();
        org.jsoup.nodes.Element element23 = element20.val("hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements25 = element20.getElementsByTag("<hi! class=\"\">\n <hi! class=\"<hi!></hi!>\">\n   hi! \n </hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        org.jsoup.select.Elements elements5 = element1.getElementsContainingText("hi!");
        java.lang.String str6 = element1.toString();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements9 = element8.children();
        org.jsoup.nodes.Element element10 = element8.clone();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements13 = element12.children();
        java.lang.String str14 = element12.className();
        org.jsoup.nodes.Element element15 = element10.prependChild((org.jsoup.nodes.Node) element12);
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element10.childNodes();
        boolean boolean18 = element10.hasClass("hi!");
        org.jsoup.select.Elements elements19 = element10.parents();
        org.jsoup.select.Elements elements22 = element10.getElementsByAttributeValueMatching("<hi!></hi!>", "");
        org.jsoup.nodes.Element element23 = element1.appendChild((org.jsoup.nodes.Node) element10);
        org.jsoup.nodes.Node node24 = element23.previousSibling();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements27 = element26.children();
        org.jsoup.nodes.Node node28 = element26.root();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = element26.siblingNodes();
        java.util.regex.Pattern pattern31 = null;
        org.jsoup.select.Elements elements32 = element26.getElementsByAttributeValueMatching("", pattern31);
        int int33 = element26.siblingIndex();
        java.lang.String str34 = element26.className();
        org.jsoup.nodes.Element element35 = element23.doClone((org.jsoup.nodes.Node) element26);
        org.jsoup.nodes.Element element37 = element35.addClass("<hi!></hi!>");
        java.lang.String str39 = element35.absUrl("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements41 = element35.getElementsContainingText("<hi!> &lt;hi!&gt;&lt;/hi!&gt; </hi!>");
        org.jsoup.select.Elements elements43 = element35.getElementsByIndexEquals((int) (byte) 100);
        java.lang.String str44 = element35.outerHtml();
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi!></hi!>" + "'", str6, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<hi! class=\"<hi!></hi!>\">\n <hi!>\n  <hi!></hi!>\n </hi!>\n</hi!>" + "'", str44, "<hi! class=\"<hi!></hi!>\">\n <hi!>\n  <hi!></hi!>\n </hi!>\n</hi!>");
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        java.lang.String str3 = element1.tagName();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = element1.dataset();
        org.jsoup.nodes.Node node6 = element1.removeAttr("");
        java.lang.String str7 = element1.tagName();
        org.jsoup.nodes.Element element8 = element1.nextElementSibling();
        java.lang.String str9 = element1.data();
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        org.jsoup.select.Elements elements5 = element1.getElementsContainingText("hi!");
        org.jsoup.nodes.Element element8 = element1.attr("hi!", true);
        org.jsoup.nodes.Element element11 = element8.attr("", true);
        org.jsoup.nodes.Element element13 = element11.toggleClass("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements15 = element13.getElementsMatchingOwnText("<hi! class=\"<hi!></hi!>\">\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element5 = element4.clone();
        org.jsoup.nodes.Element element7 = element4.prependText("");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements15 = element14.children();
        org.jsoup.nodes.Element element16 = element14.clone();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements19 = element18.children();
        java.lang.String str20 = element18.className();
        org.jsoup.nodes.Element element21 = element16.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.select.Elements elements23 = element18.getElementsMatchingOwnText("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.lang.String str24 = element18.text();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements27 = element26.children();
        org.jsoup.nodes.Element element29 = element26.append("");
        org.jsoup.nodes.Element element30 = element29.clone();
        org.jsoup.nodes.Element element32 = element29.prependText("");
        org.jsoup.parser.Tag tag33 = element32.tag();
        int int34 = element32.siblingIndex();
        org.jsoup.nodes.Element element35 = element18.after((org.jsoup.nodes.Node) element32);
        org.jsoup.nodes.Element element36 = element12.appendTo(element32);
        boolean boolean37 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element32);
        org.jsoup.select.Elements elements40 = element32.getElementsByAttributeValueNot("<<hi!>\n <hi!></hi!>\n</hi!>></<hi!>\n <hi!></hi!>\n</hi!>>", "<hi!>\n <hi!>\n </hi!>\n</hi!>");
        java.lang.String str41 = element32.id();
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element3 = element1.clone();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements6 = element5.children();
        java.lang.String str7 = element5.className();
        org.jsoup.nodes.Element element8 = element3.prependChild((org.jsoup.nodes.Node) element5);
        org.jsoup.select.Elements elements10 = element5.getElementsMatchingOwnText("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.lang.String str11 = element5.text();
        org.jsoup.select.Elements elements14 = element5.getElementsByAttributeValueStarting("<hi!></hi!>", "hi!");
        org.jsoup.select.Elements elements17 = element5.getElementsByAttributeValue("<hi!>\n</hi!>", "<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element5.childNodes;
        org.jsoup.nodes.Element element20 = element5.html("<hi! class=\"\">\n</hi!>");
        java.lang.String str21 = element20.tagName();
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element5 = element4.clone();
        org.jsoup.nodes.Element element7 = element4.prependText("");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Node node10 = element7.removeAttr("");
        org.jsoup.nodes.Element element12 = element7.addClass("<hi!></hi!>");
        org.jsoup.select.Elements elements14 = element7.getElementsByAttributeStarting("hi!");
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements17 = element16.children();
        org.jsoup.nodes.Node node18 = element16.root();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = element16.siblingNodes();
        element7.childNodes = nodeList19;
        org.jsoup.nodes.Element element22 = element7.text("");
        java.lang.String str24 = element22.attr("hi!");
        java.lang.String str25 = element22.tagName();
        org.jsoup.select.Elements elements27 = element22.getElementsByTag("<hi!>\n <hi!>\n  <hi!></hi!>\n </hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        org.jsoup.select.Elements elements5 = element1.getElementsContainingText("hi!");
        java.lang.String str6 = element1.toString();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements9 = element8.children();
        org.jsoup.nodes.Element element10 = element8.clone();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements13 = element12.children();
        java.lang.String str14 = element12.className();
        org.jsoup.nodes.Element element15 = element10.prependChild((org.jsoup.nodes.Node) element12);
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element10.childNodes();
        boolean boolean18 = element10.hasClass("hi!");
        org.jsoup.select.Elements elements19 = element10.parents();
        org.jsoup.select.Elements elements22 = element10.getElementsByAttributeValueMatching("<hi!></hi!>", "");
        org.jsoup.nodes.Element element23 = element1.appendChild((org.jsoup.nodes.Node) element10);
        org.jsoup.nodes.Node node24 = element23.previousSibling();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements27 = element26.children();
        org.jsoup.nodes.Node node28 = element26.root();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = element26.siblingNodes();
        java.util.regex.Pattern pattern31 = null;
        org.jsoup.select.Elements elements32 = element26.getElementsByAttributeValueMatching("", pattern31);
        int int33 = element26.siblingIndex();
        java.lang.String str34 = element26.className();
        org.jsoup.nodes.Element element35 = element23.doClone((org.jsoup.nodes.Node) element26);
        org.jsoup.nodes.Element element37 = element35.addClass("<hi!></hi!>");
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements40 = element39.children();
        org.jsoup.nodes.Node node41 = element39.root();
        org.jsoup.nodes.Node node42 = element39.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = element39.childNodes;
        boolean boolean44 = element39.hasParent();
        org.jsoup.nodes.Element element45 = element37.prependChild((org.jsoup.nodes.Node) element39);
        org.jsoup.nodes.Node node46 = element39.nextSibling();
        org.jsoup.select.Elements elements48 = element39.getElementsContainingOwnText("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Node node49 = element39.unwrap();
        org.jsoup.select.Elements elements52 = element39.getElementsByAttributeValueMatching("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!>\n </hi!>\n</hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList53 = element39.textNodes();
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi!></hi!>" + "'", str6, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(textNodeList53);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element5 = element4.clone();
        org.jsoup.nodes.Element element7 = element4.prependText("");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements10 = element9.children();
        org.jsoup.nodes.Element element12 = element9.append("");
        org.jsoup.nodes.Element element13 = element12.clone();
        org.jsoup.nodes.Element element15 = element12.prependText("");
        org.jsoup.nodes.Node[] nodeArray17 = new org.jsoup.nodes.Node[] {};
        org.jsoup.nodes.Element element18 = element15.insertChildren((int) (byte) 1, nodeArray17);
        java.lang.String str19 = element18.data();
        org.jsoup.nodes.Document document20 = element18.ownerDocument();
        org.jsoup.select.Elements elements22 = element18.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element23 = element4.appendChild((org.jsoup.nodes.Node) element18);
        element4.doSetBaseUri("");
        int int26 = element4.elementSiblingIndex();
        org.jsoup.select.Elements elements28 = element4.getElementsByClass("<hi!> &lt;hi!&gt;&lt;/hi!&gt; </hi!>");
        org.jsoup.select.Elements elements30 = element4.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements33 = element4.getElementsByAttributeValueEnding("<hi!", "<hi!>\n <hi!></hi!>\n</hi!>");
        java.util.regex.Pattern pattern34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements35 = element4.getElementsMatchingText(pattern34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(nodeArray17);
        org.junit.Assert.assertArrayEquals(nodeArray17, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements33);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element5 = element4.clone();
        org.jsoup.nodes.Element element7 = element4.prependText("");
        org.jsoup.nodes.Node[] nodeArray9 = new org.jsoup.nodes.Node[] {};
        org.jsoup.nodes.Element element10 = element7.insertChildren((int) (byte) 1, nodeArray9);
        org.jsoup.nodes.Element element12 = element7.appendElement("<hi! class=\"\">\n <hi!>\n   &lt;hi!&gt;&lt;/hi!&gt; \n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements15 = element14.children();
        org.jsoup.nodes.Node node16 = element14.root();
        java.lang.String str17 = element14.baseUri();
        java.lang.String str18 = element14.baseUri();
        java.lang.String str20 = element14.attr("<hi!></hi!>");
        boolean boolean21 = element14.hasAttributes();
        org.jsoup.nodes.Element element23 = element14.appendText("");
        org.jsoup.select.Elements elements24 = element14.children();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements27 = element26.children();
        org.jsoup.nodes.Node node28 = element26.root();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = element26.siblingNodes();
        java.util.regex.Pattern pattern31 = null;
        org.jsoup.select.Elements elements32 = element26.getElementsByAttributeValueMatching("", pattern31);
        int int33 = element26.siblingIndex();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList34 = element26.dataNodes();
        boolean boolean35 = element14.equals((java.lang.Object) dataNodeList34);
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements38 = element37.children();
        org.jsoup.nodes.Node node39 = element37.root();
        org.jsoup.select.Elements elements41 = element37.getElementsContainingText("hi!");
        org.jsoup.nodes.Element element44 = element37.attr("hi!", true);
        org.jsoup.nodes.Node node45 = element44.nextSibling();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList46 = element44.textNodes();
        org.jsoup.nodes.Element element48 = element44.text("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element51 = element44.attr("<hi!></hi!>", "<hi!> </hi!>");
        java.util.Set<java.lang.String> strSet52 = element44.classNames();
        org.jsoup.nodes.Element element53 = element14.classNames(strSet52);
        org.jsoup.nodes.Element element54 = element12.classNames(strSet52);
        org.jsoup.select.Elements elements57 = element12.getElementsByAttributeValueStarting("<hi! class=\"<hi!></hi!>\">\n</hi!>", "<hi!></hi!>\n<hi!>\n</hi!>\n<hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(nodeArray9);
        org.junit.Assert.assertArrayEquals(nodeArray9, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dataNodeList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(textNodeList46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(elements57);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element5 = element4.clone();
        org.jsoup.select.Elements elements7 = element4.getElementsByIndexEquals(0);
        org.jsoup.select.Elements elements9 = element4.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements12 = element11.children();
        org.jsoup.nodes.Node node13 = element11.root();
        org.jsoup.select.Elements elements15 = element11.getElementsContainingText("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element11.childNodesCopy();
        element4.childNodes = nodeList16;
        org.jsoup.select.Elements elements18 = element4.siblingElements();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList19 = element4.textNodes();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements22 = element21.children();
        java.lang.String str23 = element21.tagName();
        java.lang.String str24 = element21.text();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = element21.dataset();
        element21.setBaseUri("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element28 = element4.doClone((org.jsoup.nodes.Node) element21);
        boolean boolean29 = element21.hasText();
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(textNodeList19);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean2 = element1.isBlock();
        org.jsoup.nodes.Element element4 = element1.prependText("");
        java.util.Set<java.lang.String> strSet5 = element1.classNames();
        org.jsoup.nodes.Element element7 = element1.prependText("<hi!></hi!>");
        element1.setBaseUri("");
        org.jsoup.nodes.Element element11 = element1.toggleClass("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements13 = element11.getElementsByTag("hi!.<hi!>.&lt;hi!&gt;&lt;/hi!&gt;.</hi!>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
    }
}

