package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element5 = element4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element5.lastElementSibling();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        org.jsoup.select.Elements elements5 = element1.getElementsContainingText("hi!");
        org.jsoup.nodes.Element element8 = element1.attr("hi!", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element8.firstElementSibling();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = element1.lastElementSibling();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element3 = element1.clone();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements6 = element5.children();
        java.lang.String str7 = element5.className();
        org.jsoup.nodes.Element element8 = element3.prependChild((org.jsoup.nodes.Node) element5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element3.lastElementSibling();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        org.jsoup.select.Elements elements5 = element1.getElementsContainingText("hi!");
        org.jsoup.nodes.Element element8 = element1.attr("hi!", true);
        org.jsoup.nodes.Element element11 = element8.attr("", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element11.lastElementSibling();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
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
        org.jsoup.nodes.Element element25 = element23.getElementById("<hi!></hi!>");
        org.jsoup.nodes.Element element27 = element23.removeClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element23.firstElementSibling();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element5 = element4.clone();
        org.jsoup.nodes.Element element7 = element4.prependText("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element4.firstElementSibling();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element3 = element1.clone();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements6 = element5.children();
        java.lang.String str7 = element5.className();
        org.jsoup.nodes.Element element8 = element3.prependChild((org.jsoup.nodes.Node) element5);
        org.jsoup.nodes.Node node9 = element8.clearAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element8.firstElementSibling();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
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
        org.jsoup.nodes.Node node24 = element1.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = element1.wrap("<hi!></hi!>");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element6 = element4.html("");
        org.jsoup.nodes.Element element8 = element4.tagName("hi!");
        org.jsoup.nodes.Node node9 = element8.nextSibling();
        java.lang.String str10 = element8.nodeName();
        org.jsoup.nodes.Element element12 = element8.prepend("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element12.lastElementSibling();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.select.Elements elements7 = element4.getElementsByAttributeValueStarting("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>", "<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.lang.String str9 = element4.attr("<hi!></hi!>");
        org.jsoup.nodes.Element element11 = element4.tagName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element4.firstElementSibling();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element6 = element4.html("");
        org.jsoup.nodes.Element element8 = element4.removeClass("<hi!></hi!>");
        java.lang.String str9 = element8.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element8.lastElementSibling();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = element1.firstElementSibling();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        java.lang.String str3 = element1.tagName();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = element1.dataset();
        org.jsoup.nodes.Node node6 = element1.removeAttr("");
        element1.setBaseUri("");
        boolean boolean9 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element1.lastElementSibling();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = element1.siblingNodes();
        java.lang.String str5 = element1.toString();
        java.lang.String str6 = element1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element1.firstElementSibling();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = element4.firstElementSibling();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        org.jsoup.select.Elements elements5 = element1.getElementsContainingText("hi!");
        org.jsoup.nodes.Element element8 = element1.attr("hi!", true);
        org.jsoup.nodes.Element element11 = element8.attr("", true);
        org.jsoup.nodes.Element element13 = element11.prepend("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element11.lastElementSibling();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element3 = element1.clone();
        org.jsoup.nodes.Element element5 = element1.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element5.firstElementSibling();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        org.jsoup.select.Elements elements5 = element1.getElementsContainingText("hi!");
        java.lang.String str6 = element1.toString();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements9 = element8.children();
        org.jsoup.nodes.Node node10 = element8.root();
        org.jsoup.select.Elements elements12 = element8.getElementsContainingText("hi!");
        org.jsoup.select.Elements elements14 = element8.getElementsByAttributeStarting("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element15 = element1.prependChild((org.jsoup.nodes.Node) element8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element1.lastElementSibling();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        org.jsoup.select.Elements elements5 = element1.getElementsContainingText("hi!");
        boolean boolean6 = element1.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element1.lastElementSibling();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        java.lang.String str5 = element1.toString();
        org.jsoup.nodes.Element element6 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes7 = element1.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element1.lastElementSibling();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = element1.wrap("<hi!> &lt;hi!&gt;&lt;/hi!&gt; </hi!>");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element6 = element4.html("");
        java.lang.String str7 = element4.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element4.lastElementSibling();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.select.Elements elements4 = element1.getElementsByClass("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Node node6 = element1.removeAttr("");
        org.jsoup.nodes.Element element8 = element1.html("");
        org.jsoup.nodes.Node node9 = element8.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element8.wrap("<hi!>\n</hi!>");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.select.Elements elements7 = element4.getElementsByAttributeValueStarting("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>", "<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.lang.String str9 = element4.attr("<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element4.previousElementSibling();
        org.jsoup.nodes.Element element12 = element4.prepend("");
        org.jsoup.select.Elements elements15 = element12.getElementsByAttributeValueEnding("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element12.lastElementSibling();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        org.jsoup.select.Elements elements5 = element1.getElementsContainingText("hi!");
        boolean boolean7 = element1.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element1.wrap("<hi! class=\"\"></hi!>");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element5 = element4.clone();
        org.jsoup.nodes.Element element7 = element4.prependText("");
        org.jsoup.nodes.Element element9 = element7.prepend("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element9.lastElementSibling();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element6 = element4.html("");
        org.jsoup.nodes.Element element8 = element4.tagName("hi!");
        org.jsoup.nodes.Node node9 = element8.nextSibling();
        java.lang.String str10 = element8.nodeName();
        org.jsoup.nodes.Element element12 = element8.val("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element12.lastElementSibling();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element5 = element4.clone();
        org.jsoup.nodes.Element element7 = element4.prependText("");
        org.jsoup.parser.Tag tag8 = element7.tag();
        int int9 = element7.siblingIndex();
        int int10 = element7.elementSiblingIndex();
        org.jsoup.nodes.Element element12 = element7.toggleClass("hi!");
        java.lang.String str13 = element12.nodeName();
        org.jsoup.nodes.Element element14 = element12.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element14.lastElementSibling();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
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
        java.lang.String str13 = element5.id();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements16 = element15.children();
        java.lang.String str17 = element15.className();
        org.jsoup.select.Elements elements19 = element15.getElementsByIndexLessThan((int) '#');
        org.jsoup.select.Elements elements20 = element15.getAllElements();
        boolean boolean21 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements25 = element24.children();
        java.lang.String str26 = element24.className();
        org.jsoup.select.Elements elements28 = element24.getElementsByIndexLessThan((int) '#');
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements31 = element30.children();
        org.jsoup.nodes.Element element33 = element30.append("");
        org.jsoup.nodes.Element element34 = element33.clone();
        org.jsoup.nodes.Element element36 = element33.prependText("");
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements39 = element38.children();
        org.jsoup.nodes.Element element41 = element38.append("");
        org.jsoup.nodes.Element element42 = element41.clone();
        org.jsoup.nodes.Element element44 = element41.prependText("");
        org.jsoup.parser.Tag tag45 = element44.tag();
        org.jsoup.nodes.Node[] nodeArray46 = new org.jsoup.nodes.Node[] { element24, element36, element44 };
        org.jsoup.nodes.Element element47 = element15.insertChildren(0, nodeArray46);
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements50 = element49.children();
        org.jsoup.nodes.Element element51 = element49.clone();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements54 = element53.children();
        java.lang.String str55 = element53.className();
        org.jsoup.nodes.Element element56 = element51.prependChild((org.jsoup.nodes.Node) element53);
        java.util.List<org.jsoup.nodes.Node> nodeList57 = element51.childNodes();
        element15.childNodes = nodeList57;
        org.jsoup.nodes.Element element59 = element5.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Element element61 = element5.toggleClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element63 = element61.prependElement("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements65 = element61.getElementsByIndexLessThan((int) 'a');
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element3 = element1.clone();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements6 = element5.children();
        java.lang.String str7 = element5.className();
        org.jsoup.nodes.Element element8 = element3.prependChild((org.jsoup.nodes.Node) element5);
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element3.childNodes();
        boolean boolean11 = element3.hasClass("hi!");
        java.lang.String str12 = element3.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element3.firstElementSibling();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        java.lang.String str3 = element1.tagName();
        boolean boolean4 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Node node5 = element1.root();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element1.lastElementSibling();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        java.lang.String str3 = element1.className();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan((int) '#');
        org.jsoup.select.Elements elements6 = element1.getAllElements();
        boolean boolean7 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element10.children();
        java.lang.String str12 = element10.className();
        org.jsoup.select.Elements elements14 = element10.getElementsByIndexLessThan((int) '#');
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements17 = element16.children();
        org.jsoup.nodes.Element element19 = element16.append("");
        org.jsoup.nodes.Element element20 = element19.clone();
        org.jsoup.nodes.Element element22 = element19.prependText("");
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements25 = element24.children();
        org.jsoup.nodes.Element element27 = element24.append("");
        org.jsoup.nodes.Element element28 = element27.clone();
        org.jsoup.nodes.Element element30 = element27.prependText("");
        org.jsoup.parser.Tag tag31 = element30.tag();
        org.jsoup.nodes.Node[] nodeArray32 = new org.jsoup.nodes.Node[] { element10, element22, element30 };
        org.jsoup.nodes.Element element33 = element1.insertChildren(0, nodeArray32);
        org.jsoup.nodes.Element element34 = element33.parent();
        org.jsoup.nodes.Element element36 = element33.html("<hi!></hi!>");
        org.jsoup.select.Elements elements38 = element36.getElementsByIndexEquals((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element39 = element36.lastElementSibling();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element1.childNodes;
        boolean boolean6 = element1.hasParent();
        org.jsoup.nodes.Element element8 = element1.appendElement("<hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element1.wrap("hi!");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.select.Elements elements7 = element4.getElementsByAttributeValueStarting("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>", "<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.lang.String str9 = element4.attr("<hi!></hi!>");
        java.lang.String str10 = element4.id();
        java.lang.String str11 = element4.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element4.firstElementSibling();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element6 = element4.html("");
        org.jsoup.nodes.Element element8 = element4.tagName("hi!");
        org.jsoup.nodes.Node node9 = element8.nextSibling();
        java.lang.String str10 = element8.nodeName();
        org.jsoup.nodes.Element element12 = element8.val("hi!");
        org.jsoup.nodes.Element element14 = element12.prependElement("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element12.lastElementSibling();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element5 = element4.clone();
        org.jsoup.nodes.Element element7 = element4.prependText("");
        org.jsoup.nodes.Node[] nodeArray9 = new org.jsoup.nodes.Node[] {};
        org.jsoup.nodes.Element element10 = element7.insertChildren((int) (byte) 1, nodeArray9);
        java.lang.String str11 = element10.data();
        org.jsoup.nodes.Document document12 = element10.ownerDocument();
        org.jsoup.select.Elements elements14 = element10.getElementsByIndexLessThan((int) (short) 10);
        element10.nodelistChanged();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element10.wrap("<<hi!>\n <hi!></hi!>\n</hi!>></<hi!>\n <hi!></hi!>\n</hi!>>");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element3 = element1.clone();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements6 = element5.children();
        org.jsoup.nodes.Element element8 = element5.append("");
        org.jsoup.nodes.Element element9 = element8.clone();
        org.jsoup.nodes.Element element11 = element8.prependText("");
        org.jsoup.nodes.Element element13 = element11.prepend("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element1.doClone((org.jsoup.nodes.Node) element13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element13.firstElementSibling();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element5 = element4.clone();
        org.jsoup.nodes.Element element7 = element4.prependText("");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Node node10 = element7.removeAttr("");
        org.jsoup.nodes.Element element12 = element7.toggleClass("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        boolean boolean13 = element7.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element7.firstElementSibling();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = element1.siblingNodes();
        element1.doSetBaseUri("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        element1.doSetBaseUri("<hi!> &lt;hi!&gt;&lt;/hi!&gt; </hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element1.lastElementSibling();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        java.lang.String str3 = element1.className();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan((int) '#');
        org.jsoup.select.Elements elements6 = element1.getAllElements();
        boolean boolean7 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element10.children();
        java.lang.String str12 = element10.className();
        org.jsoup.select.Elements elements14 = element10.getElementsByIndexLessThan((int) '#');
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements17 = element16.children();
        org.jsoup.nodes.Element element19 = element16.append("");
        org.jsoup.nodes.Element element20 = element19.clone();
        org.jsoup.nodes.Element element22 = element19.prependText("");
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements25 = element24.children();
        org.jsoup.nodes.Element element27 = element24.append("");
        org.jsoup.nodes.Element element28 = element27.clone();
        org.jsoup.nodes.Element element30 = element27.prependText("");
        org.jsoup.parser.Tag tag31 = element30.tag();
        org.jsoup.nodes.Node[] nodeArray32 = new org.jsoup.nodes.Node[] { element10, element22, element30 };
        org.jsoup.nodes.Element element33 = element1.insertChildren(0, nodeArray32);
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements36 = element35.children();
        org.jsoup.nodes.Element element37 = element35.clone();
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements40 = element39.children();
        java.lang.String str41 = element39.className();
        org.jsoup.nodes.Element element42 = element37.prependChild((org.jsoup.nodes.Node) element39);
        java.util.List<org.jsoup.nodes.Node> nodeList43 = element37.childNodes();
        element1.childNodes = nodeList43;
        org.jsoup.select.Elements elements47 = element1.getElementsByAttributeValueMatching("<hi!>\n</hi!>", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element48 = element1.lastElementSibling();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!> </hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = element1.firstElementSibling();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean2 = element1.isBlock();
        int int3 = element1.childNodeSize();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements6 = element5.children();
        org.jsoup.nodes.Element element7 = element5.clone();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements10 = element9.children();
        java.lang.String str11 = element9.className();
        org.jsoup.nodes.Element element12 = element7.prependChild((org.jsoup.nodes.Node) element9);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element7.childNodes();
        boolean boolean15 = element7.hasClass("hi!");
        boolean boolean16 = element7.hasParent();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements19 = element18.children();
        org.jsoup.nodes.Node node20 = element18.root();
        org.jsoup.select.Elements elements22 = element18.getElementsContainingText("hi!");
        java.lang.String str23 = element18.toString();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements26 = element25.children();
        org.jsoup.nodes.Element element27 = element25.clone();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements30 = element29.children();
        java.lang.String str31 = element29.className();
        org.jsoup.nodes.Element element32 = element27.prependChild((org.jsoup.nodes.Node) element29);
        java.util.List<org.jsoup.nodes.Node> nodeList33 = element27.childNodes();
        boolean boolean35 = element27.hasClass("hi!");
        org.jsoup.select.Elements elements36 = element27.parents();
        org.jsoup.select.Elements elements39 = element27.getElementsByAttributeValueMatching("<hi!></hi!>", "");
        org.jsoup.nodes.Element element40 = element18.appendChild((org.jsoup.nodes.Node) element27);
        java.util.Set<java.lang.String> strSet41 = element27.classNames();
        org.jsoup.nodes.Element element42 = element7.classNames(strSet41);
        org.jsoup.nodes.Element element43 = element1.classNames(strSet41);
        int int44 = element43.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element46 = element43.wrap("<hi!>\n</hi!>");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        org.jsoup.select.Elements elements5 = element1.getElementsContainingText("hi!");
        org.jsoup.nodes.Element element8 = element1.attr("hi!", true);
        org.jsoup.nodes.Element element11 = element8.attr("", true);
        org.jsoup.nodes.Element element13 = element11.prepend("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element13.lastElementSibling();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        org.jsoup.select.Elements elements5 = element1.getElementsContainingText("hi!");
        org.jsoup.nodes.Element element8 = element1.attr("hi!", true);
        org.jsoup.nodes.Element element11 = element8.attr("", true);
        org.jsoup.nodes.Element element13 = element11.prepend("");
        org.jsoup.select.Elements elements16 = element11.getElementsByAttributeValue("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element11.wrap("<hi!>\n <hi! class=\"<hi!></hi!>\">\n </hi!>\n</hi!>");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element5.firstElementSibling();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = element1.siblingNodes();
        java.lang.String str5 = element1.toString();
        java.lang.String str6 = element1.toString();
        org.jsoup.nodes.Element element7 = element1.previousElementSibling();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements10 = element9.children();
        org.jsoup.nodes.Element element11 = element9.clone();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements14 = element13.children();
        java.lang.String str15 = element13.className();
        org.jsoup.nodes.Element element16 = element11.prependChild((org.jsoup.nodes.Node) element13);
        org.jsoup.select.Elements elements18 = element13.getElementsMatchingOwnText("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.lang.String str19 = element13.text();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements22 = element21.children();
        org.jsoup.nodes.Element element24 = element21.append("");
        org.jsoup.nodes.Element element25 = element24.clone();
        org.jsoup.nodes.Element element27 = element24.prependText("");
        org.jsoup.parser.Tag tag28 = element27.tag();
        int int29 = element27.siblingIndex();
        org.jsoup.nodes.Element element30 = element13.after((org.jsoup.nodes.Node) element27);
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList31 = element27.dataNodes();
        java.lang.String str32 = element27.text();
        java.lang.String str33 = element27.html();
        org.jsoup.nodes.Element element34 = element1.appendChild((org.jsoup.nodes.Node) element27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element35 = element1.lastElementSibling();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element5 = element4.clone();
        org.jsoup.nodes.Element element7 = element4.prependText("");
        org.jsoup.nodes.Element element9 = element7.prepend("<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes10 = element9.attributes();
        java.lang.String str11 = element9.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element9.firstElementSibling();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        java.lang.String str4 = element1.baseUri();
        java.lang.String str5 = element1.baseUri();
        java.lang.String str7 = element1.attr("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element1.prependText("");
        java.lang.String str10 = element9.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element9.wrap("<hi!>\n &lt;hi!&gt; &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt; &lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        java.lang.String str3 = element1.className();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan((int) '#');
        org.jsoup.select.Elements elements6 = element1.getAllElements();
        boolean boolean7 = element1.hasParent();
        org.jsoup.select.Elements elements9 = element1.getElementsByIndexGreaterThan((int) (byte) 10);
        org.jsoup.nodes.Node node10 = element1.nextSibling();
        org.jsoup.nodes.Node node11 = element1.previousSibling();
        java.lang.String str12 = element1.html();
        org.jsoup.nodes.Element element14 = element1.text("hi!.<hi!>.&lt;hi!&gt;&lt;/hi!&gt;.</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element14.firstElementSibling();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        org.jsoup.select.Elements elements5 = element1.getElementsByClass("<hi!></hi!>");
        org.jsoup.select.Elements elements7 = element1.getElementsByTag("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element1.firstElementSibling();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element3 = element1.clone();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements6 = element5.children();
        java.lang.String str7 = element5.className();
        org.jsoup.nodes.Element element8 = element3.prependChild((org.jsoup.nodes.Node) element5);
        org.jsoup.select.Elements elements10 = element5.getElementsMatchingOwnText("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.lang.String str11 = element5.text();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements14 = element13.children();
        org.jsoup.nodes.Element element15 = element13.clone();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements18 = element17.children();
        org.jsoup.nodes.Element element20 = element17.append("");
        org.jsoup.nodes.Element element21 = element20.clone();
        org.jsoup.nodes.Element element23 = element20.prependText("");
        org.jsoup.nodes.Element element25 = element23.prepend("<hi!></hi!>");
        org.jsoup.nodes.Element element26 = element13.doClone((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Element element27 = element5.after((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element("hi!");
        boolean boolean30 = element29.isBlock();
        org.jsoup.nodes.Element element32 = element29.prependText("");
        java.util.Map<java.lang.String, java.lang.String> strMap33 = element29.dataset();
        org.jsoup.nodes.Node node34 = element29.previousSibling();
        org.jsoup.select.Elements elements35 = element29.getAllElements();
        org.jsoup.nodes.Node node36 = element29.clearAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = node36.childNodesCopy();
        element25.childNodes = nodeList37;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements41 = element25.getElementsByAttributeValueEnding("<hi! hi! ></hi!>\n<hi! class=\"\"></hi!>", "<hi! value=\"<hi!></hi!>\">\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = element1.lastElementSibling();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.select.Elements elements7 = element4.getElementsByAttributeValueStarting("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>", "<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.lang.String str9 = element4.absUrl("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element4.ensureChildNodes();
        element4.setBaseUri("hi!");
        java.lang.String str13 = element4.data();
        org.jsoup.nodes.Node node14 = element4.root();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element4.wrap("<hi!>\n <hi!>\n  <hi!></hi!>\n </hi!>\n</hi!>");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean2 = element1.isBlock();
        org.jsoup.nodes.Element element4 = element1.prependText("");
        java.util.Set<java.lang.String> strSet5 = element1.classNames();
        org.jsoup.nodes.Element element7 = element1.prependText("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements10 = element9.children();
        org.jsoup.nodes.Element element11 = element9.clone();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements14 = element13.children();
        java.lang.String str15 = element13.className();
        org.jsoup.nodes.Element element16 = element11.prependChild((org.jsoup.nodes.Node) element13);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = element11.childNodes();
        element1.childNodes = nodeList17;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element1.wrap("<hi! hi! <hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!> <hi! class=\"\"></hi!>>\n &lt;hi!&gt; &lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean2 = element1.isBlock();
        int int3 = element1.childNodeSize();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements6 = element5.children();
        org.jsoup.nodes.Element element7 = element5.clone();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements10 = element9.children();
        java.lang.String str11 = element9.className();
        org.jsoup.nodes.Element element12 = element7.prependChild((org.jsoup.nodes.Node) element9);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element7.childNodes();
        boolean boolean15 = element7.hasClass("hi!");
        boolean boolean16 = element7.hasParent();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements19 = element18.children();
        org.jsoup.nodes.Node node20 = element18.root();
        org.jsoup.select.Elements elements22 = element18.getElementsContainingText("hi!");
        java.lang.String str23 = element18.toString();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements26 = element25.children();
        org.jsoup.nodes.Element element27 = element25.clone();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements30 = element29.children();
        java.lang.String str31 = element29.className();
        org.jsoup.nodes.Element element32 = element27.prependChild((org.jsoup.nodes.Node) element29);
        java.util.List<org.jsoup.nodes.Node> nodeList33 = element27.childNodes();
        boolean boolean35 = element27.hasClass("hi!");
        org.jsoup.select.Elements elements36 = element27.parents();
        org.jsoup.select.Elements elements39 = element27.getElementsByAttributeValueMatching("<hi!></hi!>", "");
        org.jsoup.nodes.Element element40 = element18.appendChild((org.jsoup.nodes.Node) element27);
        java.util.Set<java.lang.String> strSet41 = element27.classNames();
        org.jsoup.nodes.Element element42 = element7.classNames(strSet41);
        org.jsoup.nodes.Element element43 = element1.classNames(strSet41);
        org.jsoup.nodes.Attributes attributes44 = element43.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element46 = element43.wrap("<hi! class=\"\">\n <hi!>\n   &lt;hi!&gt;&lt;/hi!&gt; \n </hi!>\n</hi!>");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        java.lang.String str3 = element1.tagName();
        java.lang.String str4 = element1.text();
        boolean boolean5 = element1.hasText();
        org.jsoup.nodes.Element element7 = element1.append("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements10 = element1.getElementsByAttributeValueMatching("<hi!> &lt;hi!&gt;&lt;/hi!&gt; </hi!>", "");
        java.lang.String str11 = element1.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element1.firstElementSibling();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
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
        java.lang.String str13 = element5.id();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements16 = element15.children();
        java.lang.String str17 = element15.className();
        org.jsoup.select.Elements elements19 = element15.getElementsByIndexLessThan((int) '#');
        org.jsoup.select.Elements elements20 = element15.getAllElements();
        boolean boolean21 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements25 = element24.children();
        java.lang.String str26 = element24.className();
        org.jsoup.select.Elements elements28 = element24.getElementsByIndexLessThan((int) '#');
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements31 = element30.children();
        org.jsoup.nodes.Element element33 = element30.append("");
        org.jsoup.nodes.Element element34 = element33.clone();
        org.jsoup.nodes.Element element36 = element33.prependText("");
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements39 = element38.children();
        org.jsoup.nodes.Element element41 = element38.append("");
        org.jsoup.nodes.Element element42 = element41.clone();
        org.jsoup.nodes.Element element44 = element41.prependText("");
        org.jsoup.parser.Tag tag45 = element44.tag();
        org.jsoup.nodes.Node[] nodeArray46 = new org.jsoup.nodes.Node[] { element24, element36, element44 };
        org.jsoup.nodes.Element element47 = element15.insertChildren(0, nodeArray46);
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements50 = element49.children();
        org.jsoup.nodes.Element element51 = element49.clone();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements54 = element53.children();
        java.lang.String str55 = element53.className();
        org.jsoup.nodes.Element element56 = element51.prependChild((org.jsoup.nodes.Node) element53);
        java.util.List<org.jsoup.nodes.Node> nodeList57 = element51.childNodes();
        element15.childNodes = nodeList57;
        org.jsoup.nodes.Element element59 = element5.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Element element61 = element5.toggleClass("<hi! class=\"\"></hi!>");
        java.lang.String str62 = element5.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element64 = element5.wrap("<hi!> </hi!>");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element5 = element4.clone();
        org.jsoup.nodes.Element element7 = element4.prependText("");
        org.jsoup.nodes.Element element9 = element7.text("<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements11 = element9.getElementsByIndexGreaterThan((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element9.firstElementSibling();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        java.lang.String str3 = element1.className();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan((int) '#');
        org.jsoup.select.Elements elements6 = element1.getAllElements();
        boolean boolean7 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element10.children();
        java.lang.String str12 = element10.className();
        org.jsoup.select.Elements elements14 = element10.getElementsByIndexLessThan((int) '#');
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements17 = element16.children();
        org.jsoup.nodes.Element element19 = element16.append("");
        org.jsoup.nodes.Element element20 = element19.clone();
        org.jsoup.nodes.Element element22 = element19.prependText("");
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements25 = element24.children();
        org.jsoup.nodes.Element element27 = element24.append("");
        org.jsoup.nodes.Element element28 = element27.clone();
        org.jsoup.nodes.Element element30 = element27.prependText("");
        org.jsoup.parser.Tag tag31 = element30.tag();
        org.jsoup.nodes.Node[] nodeArray32 = new org.jsoup.nodes.Node[] { element10, element22, element30 };
        org.jsoup.nodes.Element element33 = element1.insertChildren(0, nodeArray32);
        java.lang.String str34 = element33.cssSelector();
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements37 = element36.children();
        org.jsoup.select.Elements elements39 = element36.getElementsByClass("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.select.Elements elements41 = element36.getElementsMatchingText("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element42 = element33.prependChild((org.jsoup.nodes.Node) element36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element43 = element42.lastElementSibling();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean2 = element1.isBlock();
        org.jsoup.nodes.Element element4 = element1.prependElement("hi!");
        org.jsoup.select.Elements elements7 = element4.getElementsByAttributeValueContaining("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>", "<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element9 = element4.addClass("<hi!></hi!>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements12 = element11.children();
        org.jsoup.nodes.Node node13 = element11.root();
        org.jsoup.select.Elements elements15 = element11.getElementsContainingText("hi!");
        boolean boolean17 = element11.hasAttr("");
        org.jsoup.nodes.Element element18 = element4.prependChild((org.jsoup.nodes.Node) element11);
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements21 = element20.children();
        org.jsoup.nodes.Element element23 = element20.append("");
        org.jsoup.nodes.Element element25 = element23.html("");
        org.jsoup.nodes.Element element27 = element23.tagName("hi!");
        org.jsoup.nodes.Node node28 = element27.nextSibling();
        java.lang.String str29 = element27.nodeName();
        org.jsoup.nodes.Element element31 = element27.val("hi!");
        org.jsoup.nodes.Element element33 = element31.prependElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList34 = element31.childNodes;
        org.jsoup.nodes.Element element36 = element31.text("<hi!></hi!>");
        org.jsoup.nodes.Element element38 = element36.appendText("<hi!>\n</hi!>");
        org.jsoup.nodes.Element element39 = element18.doClone((org.jsoup.nodes.Node) element38);
        org.jsoup.select.Elements elements41 = element38.getElementsContainingOwnText("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element42 = element38.lastElementSibling();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element5 = element4.clone();
        org.jsoup.select.Elements elements7 = element4.getElementsContainingOwnText("<hi!></hi!>");
        boolean boolean9 = element4.hasClass("<hi!>\n &lt;hi!&gt; &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt; &lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element4.wrap("<hi! value=\"<hi!></hi!>\"></hi!>");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.select.Elements elements7 = element4.getElementsByAttributeValueStarting("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>", "<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.lang.String str9 = element4.attr("<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element4.previousElementSibling();
        org.jsoup.nodes.Element element12 = element4.prepend("");
        org.jsoup.nodes.Element element14 = element12.addClass("<hi! class=\"\">\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element17 = element14.attr("<hi!> &lt;hi!&gt;&lt;/hi!&gt; </hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element14.firstElementSibling();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        org.jsoup.select.Elements elements5 = element1.getElementsContainingText("hi!");
        org.jsoup.nodes.Element element8 = element1.attr("hi!", true);
        org.jsoup.nodes.Element element11 = element8.attr("", true);
        org.jsoup.select.Elements elements13 = element11.getElementsByTag("<hi!></hi!>");
        org.jsoup.nodes.Element element15 = element11.appendText("<hi! class=\"\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element11.lastElementSibling();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element3 = element1.clone();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements6 = element5.children();
        java.lang.String str7 = element5.className();
        org.jsoup.nodes.Element element8 = element3.prependChild((org.jsoup.nodes.Node) element5);
        java.lang.String str9 = element3.ownText();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = element3.dataset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element3.firstElementSibling();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element5 = element1.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element1.firstElementSibling();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        java.lang.String str4 = element1.baseUri();
        java.lang.String str5 = element1.baseUri();
        java.lang.String str7 = element1.attr("<hi!></hi!>");
        boolean boolean8 = element1.hasAttributes();
        org.jsoup.nodes.Element element10 = element1.appendText("");
        org.jsoup.nodes.Element element12 = element10.removeClass("<hi!>\n</hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList13 = element12.dataNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element12.wrap("<hi!> &lt;hi!&gt;&lt;/hi!&gt; </hi!>");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element5 = element4.clone();
        org.jsoup.nodes.Element element7 = element4.prependText("");
        org.jsoup.nodes.Element element9 = element7.prepend("<hi!></hi!>");
        org.jsoup.select.Elements elements10 = element7.getAllElements();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element7.textNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element7.firstElementSibling();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element3 = element1.clone();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements6 = element5.children();
        java.lang.String str7 = element5.className();
        org.jsoup.nodes.Element element8 = element3.prependChild((org.jsoup.nodes.Node) element5);
        org.jsoup.nodes.Node node9 = element8.clearAttributes();
        org.jsoup.select.Elements elements11 = element8.getElementsByAttribute("<hi!></hi!>");
        org.jsoup.select.Elements elements12 = element8.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element8.wrap("<<hi!> <hi!></hi!> </hi!>></<hi!> <hi!></hi!> </hi!>>");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        java.lang.String str5 = element1.toString();
        element1.nodelistChanged();
        org.jsoup.select.Elements elements8 = element1.getElementsByIndexLessThan(10);
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element10.children();
        org.jsoup.nodes.Element element13 = element10.append("");
        org.jsoup.nodes.Element element14 = element13.clone();
        org.jsoup.nodes.Element element16 = element13.prependText("");
        org.jsoup.parser.Tag tag17 = element16.tag();
        int int18 = element16.siblingIndex();
        int int19 = element16.elementSiblingIndex();
        org.jsoup.nodes.Element element21 = element16.toggleClass("hi!");
        org.jsoup.nodes.Element element22 = element1.doClone((org.jsoup.nodes.Node) element21);
        java.util.List<org.jsoup.nodes.Node> nodeList23 = element1.childNodes;
        org.jsoup.nodes.Element element24 = element1.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element1.firstElementSibling();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
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
        org.jsoup.nodes.Element element25 = element23.toggleClass("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = element25.lastElementSibling();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        org.jsoup.select.Elements elements5 = element1.getElementsContainingText("hi!");
        org.jsoup.nodes.Element element8 = element1.attr("hi!", true);
        org.jsoup.nodes.Element element11 = element8.attr("", true);
        boolean boolean12 = element11.hasAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element11.lastElementSibling();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element6 = element4.html("");
        java.lang.String str7 = element4.data();
        org.jsoup.select.Elements elements9 = element4.getElementsContainingText("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element11 = element4.tagName("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element12 = element4.parent();
        org.jsoup.select.Elements elements14 = element4.getElementsByIndexEquals(3);
        org.jsoup.select.Elements elements16 = element4.getElementsByClass("<hi!>\n &lt;hi! hi!&gt;&lt;/hi!&gt;\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element4.firstElementSibling();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.select.Elements elements4 = element1.getElementsMatchingOwnText("<hi!></hi!>");
        org.jsoup.nodes.Element element6 = element1.tagName("<hi! class=\"\">\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element8 = element6.prepend("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element8.lastElementSibling();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element3 = element1.clone();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements6 = element5.children();
        org.jsoup.nodes.Element element8 = element5.append("");
        org.jsoup.nodes.Element element9 = element8.clone();
        org.jsoup.nodes.Element element11 = element8.prependText("");
        org.jsoup.nodes.Element element13 = element11.prepend("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element1.doClone((org.jsoup.nodes.Node) element13);
        org.jsoup.nodes.Node node15 = element1.clearAttributes();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements18 = element17.children();
        org.jsoup.nodes.Node node19 = element17.root();
        org.jsoup.select.Elements elements21 = element17.getElementsContainingText("hi!");
        java.lang.String str22 = element17.toString();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements25 = element24.children();
        org.jsoup.nodes.Element element26 = element24.clone();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements29 = element28.children();
        java.lang.String str30 = element28.className();
        org.jsoup.nodes.Element element31 = element26.prependChild((org.jsoup.nodes.Node) element28);
        java.util.List<org.jsoup.nodes.Node> nodeList32 = element26.childNodes();
        boolean boolean34 = element26.hasClass("hi!");
        org.jsoup.select.Elements elements35 = element26.parents();
        org.jsoup.select.Elements elements38 = element26.getElementsByAttributeValueMatching("<hi!></hi!>", "");
        org.jsoup.nodes.Element element39 = element17.appendChild((org.jsoup.nodes.Node) element26);
        java.util.Set<java.lang.String> strSet40 = element26.classNames();
        java.lang.String str41 = element26.ownText();
        java.lang.String str42 = element26.ownText();
        org.jsoup.nodes.Element element43 = element1.appendChild((org.jsoup.nodes.Node) element26);
        element43.doSetBaseUri("<hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element47 = element43.wrap("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean2 = element1.isBlock();
        int int3 = element1.childNodeSize();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements6 = element5.children();
        org.jsoup.nodes.Element element7 = element5.clone();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements10 = element9.children();
        java.lang.String str11 = element9.className();
        org.jsoup.nodes.Element element12 = element7.prependChild((org.jsoup.nodes.Node) element9);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element7.childNodes();
        boolean boolean15 = element7.hasClass("hi!");
        boolean boolean16 = element7.hasParent();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements19 = element18.children();
        org.jsoup.nodes.Node node20 = element18.root();
        org.jsoup.select.Elements elements22 = element18.getElementsContainingText("hi!");
        java.lang.String str23 = element18.toString();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements26 = element25.children();
        org.jsoup.nodes.Element element27 = element25.clone();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements30 = element29.children();
        java.lang.String str31 = element29.className();
        org.jsoup.nodes.Element element32 = element27.prependChild((org.jsoup.nodes.Node) element29);
        java.util.List<org.jsoup.nodes.Node> nodeList33 = element27.childNodes();
        boolean boolean35 = element27.hasClass("hi!");
        org.jsoup.select.Elements elements36 = element27.parents();
        org.jsoup.select.Elements elements39 = element27.getElementsByAttributeValueMatching("<hi!></hi!>", "");
        org.jsoup.nodes.Element element40 = element18.appendChild((org.jsoup.nodes.Node) element27);
        java.util.Set<java.lang.String> strSet41 = element27.classNames();
        org.jsoup.nodes.Element element42 = element7.classNames(strSet41);
        org.jsoup.nodes.Element element43 = element1.classNames(strSet41);
        java.util.Map<java.lang.String, java.lang.String> strMap44 = element1.dataset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element46 = element1.wrap("<hi! hi! <hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!> <hi! class=\"\"></hi!>>\n &lt;hi!&gt; &lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element5 = element4.clone();
        org.jsoup.nodes.Element element7 = element4.prependText("");
        org.jsoup.nodes.Node node9 = element4.childNode((int) (short) 0);
        int int10 = element4.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element4.firstElementSibling();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        java.lang.String str4 = element1.baseUri();
        java.lang.String str5 = element1.baseUri();
        java.lang.String str7 = element1.attr("<hi!></hi!>");
        boolean boolean8 = element1.hasAttributes();
        org.jsoup.nodes.Element element10 = element1.appendText("");
        org.jsoup.select.Elements elements11 = element1.children();
        org.jsoup.nodes.Element element13 = element1.prepend("hi!");
        org.jsoup.nodes.Attributes attributes14 = element1.attributes();
        org.jsoup.nodes.Element element16 = element1.toggleClass("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element1.firstElementSibling();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element3 = element1.clone();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements6 = element5.children();
        java.lang.String str7 = element5.className();
        org.jsoup.nodes.Element element8 = element3.prependChild((org.jsoup.nodes.Node) element5);
        org.jsoup.select.Elements elements10 = element5.getElementsMatchingOwnText("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.lang.String str11 = element5.text();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements14 = element13.children();
        org.jsoup.nodes.Element element15 = element13.clone();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements18 = element17.children();
        org.jsoup.nodes.Element element20 = element17.append("");
        org.jsoup.nodes.Element element21 = element20.clone();
        org.jsoup.nodes.Element element23 = element20.prependText("");
        org.jsoup.nodes.Element element25 = element23.prepend("<hi!></hi!>");
        org.jsoup.nodes.Element element26 = element13.doClone((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Element element27 = element5.after((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Element element28 = element27.clone();
        org.jsoup.nodes.Element element29 = element28.clone();
        int int30 = element28.siblingIndex();
        org.jsoup.select.Elements elements32 = element28.getElementsByAttributeStarting("<hi! class=\"hi!\">\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element33 = element28.firstElementSibling();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element3 = element1.clone();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements6 = element5.children();
        java.lang.String str7 = element5.className();
        org.jsoup.nodes.Element element8 = element3.prependChild((org.jsoup.nodes.Node) element5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element8.wrap("<hi! class=\"\"></hi!>");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
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
        java.lang.String str25 = element23.html();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements28 = element27.children();
        java.lang.String str29 = element27.tagName();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = element27.dataset();
        org.jsoup.nodes.Node node32 = element27.removeAttr("");
        element27.setBaseUri("");
        java.util.Set<java.lang.String> strSet35 = element27.classNames();
        org.jsoup.nodes.Element element36 = element23.classNames(strSet35);
        org.jsoup.select.Elements elements38 = element23.getElementsByIndexGreaterThan(2);
        org.jsoup.nodes.Element element40 = element23.prependElement("<hi!> &lt;hi!&gt;&lt;/hi!&gt; </hi!>");
        java.lang.String str41 = element23.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element42 = element23.firstElementSibling();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element3 = element1.clone();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements6 = element5.children();
        java.lang.String str7 = element5.className();
        org.jsoup.nodes.Element element8 = element3.prependChild((org.jsoup.nodes.Node) element5);
        org.jsoup.select.Elements elements10 = element5.getElementsMatchingOwnText("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.lang.String str11 = element5.text();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements14 = element13.children();
        org.jsoup.nodes.Element element15 = element13.clone();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements18 = element17.children();
        org.jsoup.nodes.Element element20 = element17.append("");
        org.jsoup.nodes.Element element21 = element20.clone();
        org.jsoup.nodes.Element element23 = element20.prependText("");
        org.jsoup.nodes.Element element25 = element23.prepend("<hi!></hi!>");
        org.jsoup.nodes.Element element26 = element13.doClone((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Element element27 = element5.after((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Element element28 = element27.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = element28.wrap("<hi!> &lt;hi!&gt;&lt;/hi!&gt; </hi!>");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!>\n &lt;hi!&gt; &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt; &lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = element1.wrap("<hi!>\n <hi! class=\"<hi!></hi!>\">\n </hi!>\n</hi!>");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean2 = element1.isBlock();
        int int3 = element1.childNodeSize();
        org.jsoup.nodes.Node node4 = element1.previousSibling();
        org.jsoup.select.Elements elements5 = element1.parents();
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeStarting("hi!");
        java.lang.String str8 = element1.toString();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element10.children();
        org.jsoup.nodes.Node node12 = element10.root();
        java.lang.String str13 = element10.baseUri();
        java.lang.String str14 = element10.baseUri();
        java.lang.String str16 = element10.attr("<hi!></hi!>");
        boolean boolean17 = element10.hasAttributes();
        org.jsoup.nodes.Element element19 = element10.appendText("");
        org.jsoup.select.Elements elements20 = element10.children();
        org.jsoup.nodes.Element element22 = element10.prepend("hi!");
        boolean boolean23 = element1.hasSameValue((java.lang.Object) element22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = element22.lastElementSibling();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element3 = element1.clone();
        org.jsoup.nodes.Element element5 = element1.removeClass("");
        org.jsoup.nodes.Element element7 = element1.tagName("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element9 = element7.addClass("<hi!>\n <hi!>\n  <hi!></hi!>\n </hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element9.wrap("<<hi!>\n</hi!>>\n &lt;hi! value=\"&lt;hi!&gt;&lt;/hi!&gt;\"&gt;&lt;/hi!&gt;\n</<hi!>\n</hi!>>");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element3 = element1.clone();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements6 = element5.children();
        org.jsoup.nodes.Element element8 = element5.append("");
        org.jsoup.nodes.Element element9 = element8.clone();
        org.jsoup.nodes.Element element11 = element8.prependText("");
        org.jsoup.nodes.Element element13 = element11.prepend("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element1.doClone((org.jsoup.nodes.Node) element13);
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements18 = element17.children();
        org.jsoup.nodes.Element element19 = element17.clone();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements22 = element21.children();
        java.lang.String str23 = element21.className();
        org.jsoup.nodes.Element element24 = element19.prependChild((org.jsoup.nodes.Node) element21);
        java.util.List<org.jsoup.nodes.Node> nodeList25 = element19.childNodes();
        org.jsoup.select.Elements elements28 = element19.getElementsByAttributeValueContaining("<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Element element29 = element13.insertChildren(0, (java.util.Collection<org.jsoup.nodes.Element>) elements28);
        org.jsoup.parser.Tag tag30 = element29.tag();
        org.jsoup.nodes.Node node31 = element29.root();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element32 = element29.lastElementSibling();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element6 = element4.html("");
        java.lang.String str7 = element4.text();
        java.lang.String str9 = element4.attr("");
        boolean boolean10 = element4.isBlock();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = element4.dataset();
        java.lang.String str12 = element4.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element4.firstElementSibling();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        java.lang.String str3 = element1.tagName();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = element1.dataset();
        org.jsoup.nodes.Node node6 = element1.removeAttr("");
        element1.setBaseUri("");
        java.util.Set<java.lang.String> strSet9 = element1.classNames();
        org.jsoup.nodes.Element element10 = element1.empty();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements13 = element12.children();
        org.jsoup.nodes.Node node14 = element12.root();
        org.jsoup.select.Elements elements16 = element12.getElementsContainingText("hi!");
        org.jsoup.nodes.Element element19 = element12.attr("hi!", true);
        org.jsoup.nodes.Element element22 = element19.attr("", true);
        org.jsoup.nodes.Element element24 = element22.toggleClass("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element26 = element22.prepend("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element27 = element10.prependChild((org.jsoup.nodes.Node) element22);
        org.jsoup.nodes.Element element29 = element27.html("<hi!></hi!>");
        org.jsoup.select.Elements elements31 = element27.getElementsMatchingText("<hi! value=\"<hi!></hi!>\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element32 = element27.firstElementSibling();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element5 = element4.clone();
        org.jsoup.nodes.Element element7 = element4.prependText("");
        org.jsoup.parser.Tag tag8 = element7.tag();
        int int9 = element7.siblingIndex();
        int int10 = element7.elementSiblingIndex();
        org.jsoup.nodes.Element element12 = element7.toggleClass("hi!");
        java.lang.String str13 = element12.nodeName();
        org.jsoup.nodes.Element element14 = element12.empty();
        org.jsoup.select.Elements elements15 = element12.parents();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element12.lastElementSibling();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        java.lang.String str4 = element1.baseUri();
        java.lang.String str5 = element1.baseUri();
        java.lang.String str7 = element1.attr("<hi!></hi!>");
        boolean boolean8 = element1.hasAttributes();
        org.jsoup.nodes.Element element10 = element1.appendText("");
        org.jsoup.nodes.Element element12 = element10.removeClass("<hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element12.wrap("<hi!>\n <hi! hi!></hi!>\n</hi!>");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.select.Elements elements7 = element4.getElementsByAttributeValueStarting("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>", "<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.lang.String str9 = element4.attr("<hi!></hi!>");
        java.lang.String str10 = element4.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element4.lastElementSibling();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        int int5 = element1.childNodeSize();
        org.jsoup.select.Elements elements7 = element1.getElementsByIndexGreaterThan((int) '#');
        boolean boolean8 = element1.hasParent();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element1.childNodes();
        org.jsoup.nodes.Element element11 = element1.text("<hi!>\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element11.wrap("<hi! class=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n hi!\n</hi!>");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        org.jsoup.select.Elements elements5 = element1.getElementsContainingText("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodesCopy();
        boolean boolean8 = element1.hasAttr("<hi!></hi!>");
        org.jsoup.nodes.Node node10 = element1.removeAttr("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements13 = element12.children();
        org.jsoup.nodes.Element element15 = element12.append("");
        org.jsoup.nodes.Element element16 = element15.clone();
        org.jsoup.nodes.Element element18 = element15.prependText("");
        org.jsoup.parser.Tag tag19 = element18.tag();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag19, "<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag19, "<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element24 = element1.appendChild((org.jsoup.nodes.Node) element23);
        org.jsoup.nodes.Element element26 = element24.prependElement("<hi! class=\"hi!\">\n <hi!></hi!>\n</hi!>");
        java.lang.String str27 = element24.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = element24.wrap("<hi!>\n <hi!>\n  <hi!></hi!>\n </hi!>\n</hi!>");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        java.lang.String str4 = element1.baseUri();
        java.lang.String str5 = element1.baseUri();
        java.lang.String str7 = element1.attr("<hi!></hi!>");
        boolean boolean8 = element1.hasAttributes();
        org.jsoup.nodes.Element element10 = element1.appendText("");
        element10.setBaseUri("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element10.addClass("");
        org.jsoup.nodes.Element element16 = element14.addClass("");
        org.jsoup.nodes.Element element18 = element14.prependElement("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = element14.siblingNodes();
        int int20 = element14.elementSiblingIndex();
        element14.doSetBaseUri("<hi! class=\"<hi!> </hi!>\">\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element14.lastElementSibling();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Node node3 = element1.root();
        org.jsoup.nodes.Element element5 = element1.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.removeClass("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements8 = element5.getAllElements();
        java.util.Set<java.lang.String> strSet9 = element5.classNames();
        org.jsoup.nodes.Element element11 = element5.prepend("<hi!>\n <hi!></hi!>\n <hi!>\n </hi!>\n <hi!>\n </hi!>\n</hi!>");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements14 = element13.children();
        org.jsoup.nodes.Node node15 = element13.root();
        org.jsoup.select.Elements elements17 = element13.getElementsByClass("<hi!></hi!>");
        org.jsoup.nodes.Element element20 = element13.attr("<hi!>\n <hi!>\n </hi!>\n</hi!>", "hi!");
        org.jsoup.nodes.Element element21 = element11.appendChild((org.jsoup.nodes.Node) element20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element11.lastElementSibling();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element6 = element4.html("");
        org.jsoup.nodes.Element element8 = element4.tagName("hi!");
        org.jsoup.nodes.Node node9 = element8.nextSibling();
        java.lang.String str10 = element8.nodeName();
        org.jsoup.nodes.Element element12 = element8.val("hi!");
        org.jsoup.nodes.Element element14 = element12.prependElement("hi!");
        org.jsoup.parser.Tag tag15 = element14.tag();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag15, "");
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        boolean boolean21 = element20.isBlock();
        int int22 = element20.siblingIndex();
        org.jsoup.nodes.Attributes attributes23 = element20.attributes();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element(tag15, "<hi!>\n</hi!>", attributes23);
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements28 = element27.children();
        java.lang.String str29 = element27.tagName();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = element27.dataset();
        org.jsoup.nodes.Node node32 = element27.removeAttr("");
        element27.setBaseUri("");
        java.util.Set<java.lang.String> strSet35 = element27.classNames();
        org.jsoup.parser.Tag tag36 = element27.tag();
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements40 = element39.children();
        org.jsoup.nodes.Element element42 = element39.append("");
        org.jsoup.nodes.Element element43 = element42.clone();
        org.jsoup.parser.Tag tag44 = element43.tag();
        org.jsoup.nodes.Element element47 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements48 = element47.children();
        org.jsoup.nodes.Element element50 = element47.append("");
        org.jsoup.nodes.Element element51 = element50.clone();
        org.jsoup.nodes.Element element53 = element50.prependText("");
        org.jsoup.nodes.Element element55 = element53.prepend("<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes56 = element55.attributes();
        org.jsoup.nodes.Element element57 = new org.jsoup.nodes.Element(tag44, "hi!", attributes56);
        org.jsoup.nodes.Element element58 = new org.jsoup.nodes.Element(tag36, "<hi!>\n &lt;hi! hi!&gt;&lt;/hi!&gt;\n</hi!>", attributes56);
        org.jsoup.nodes.Element element59 = new org.jsoup.nodes.Element(tag15, "<hi!>\n <hi!>\n </hi!>\n</hi!>", attributes56);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element60 = element59.lastElementSibling();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean2 = element1.isBlock();
        int int3 = element1.childNodeSize();
        org.jsoup.nodes.Node node4 = element1.previousSibling();
        org.jsoup.select.Elements elements5 = element1.parents();
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeStarting("hi!");
        java.lang.String str8 = element1.toString();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element10.children();
        org.jsoup.nodes.Node node12 = element10.root();
        java.lang.String str13 = element10.baseUri();
        java.lang.String str14 = element10.baseUri();
        java.lang.String str16 = element10.attr("<hi!></hi!>");
        boolean boolean17 = element10.hasAttributes();
        org.jsoup.nodes.Element element19 = element10.appendText("");
        org.jsoup.select.Elements elements20 = element10.children();
        org.jsoup.nodes.Element element22 = element10.prepend("hi!");
        boolean boolean23 = element1.hasSameValue((java.lang.Object) element22);
        org.jsoup.nodes.Element element26 = element22.attr("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>", "<hi!></hi!>");
        java.lang.String str27 = element26.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element26.lastElementSibling();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
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
        java.lang.String str13 = element5.id();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements16 = element15.children();
        java.lang.String str17 = element15.className();
        org.jsoup.select.Elements elements19 = element15.getElementsByIndexLessThan((int) '#');
        org.jsoup.select.Elements elements20 = element15.getAllElements();
        boolean boolean21 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements25 = element24.children();
        java.lang.String str26 = element24.className();
        org.jsoup.select.Elements elements28 = element24.getElementsByIndexLessThan((int) '#');
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements31 = element30.children();
        org.jsoup.nodes.Element element33 = element30.append("");
        org.jsoup.nodes.Element element34 = element33.clone();
        org.jsoup.nodes.Element element36 = element33.prependText("");
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements39 = element38.children();
        org.jsoup.nodes.Element element41 = element38.append("");
        org.jsoup.nodes.Element element42 = element41.clone();
        org.jsoup.nodes.Element element44 = element41.prependText("");
        org.jsoup.parser.Tag tag45 = element44.tag();
        org.jsoup.nodes.Node[] nodeArray46 = new org.jsoup.nodes.Node[] { element24, element36, element44 };
        org.jsoup.nodes.Element element47 = element15.insertChildren(0, nodeArray46);
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements50 = element49.children();
        org.jsoup.nodes.Element element51 = element49.clone();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements54 = element53.children();
        java.lang.String str55 = element53.className();
        org.jsoup.nodes.Element element56 = element51.prependChild((org.jsoup.nodes.Node) element53);
        java.util.List<org.jsoup.nodes.Node> nodeList57 = element51.childNodes();
        element15.childNodes = nodeList57;
        org.jsoup.nodes.Element element59 = element5.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Element element61 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements62 = element61.children();
        org.jsoup.nodes.Node node63 = element61.root();
        java.lang.String str64 = element61.baseUri();
        java.lang.String str65 = element61.baseUri();
        java.lang.String str67 = element61.attr("<hi!></hi!>");
        boolean boolean68 = element61.hasAttributes();
        org.jsoup.nodes.Element element70 = element61.appendText("");
        element70.setBaseUri("<hi!></hi!>");
        org.jsoup.nodes.Element element74 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements75 = element74.children();
        java.lang.String str76 = element74.className();
        org.jsoup.select.Elements elements78 = element74.getElementsByIndexLessThan((int) '#');
        java.lang.String str79 = element74.className();
        org.jsoup.nodes.Element element80 = element70.appendChild((org.jsoup.nodes.Node) element74);
        boolean boolean81 = element59.equals((java.lang.Object) element70);
        java.util.Map<java.lang.String, java.lang.String> strMap82 = element70.dataset();
        boolean boolean83 = element70.hasText();
        org.jsoup.nodes.Element element85 = element70.prepend("<hi!  value=\"<hi! value=&quot;<hi!></hi!>&quot;>\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element86 = element85.firstElementSibling();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element5 = element4.clone();
        org.jsoup.nodes.Element element7 = element4.prependText("");
        org.jsoup.nodes.Element element9 = element7.prepend("<hi!></hi!>");
        org.jsoup.select.Elements elements11 = element7.getElementsByClass("hi!");
        java.lang.String str12 = element7.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element7.wrap("<hi! value=\"&amp;lt;hi!&amp;gt; &amp;lt;/hi!&amp;gt;\"></hi!>");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
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
        org.jsoup.nodes.Node node35 = element33.root();
        java.lang.String str36 = element33.baseUri();
        java.lang.String str37 = element33.baseUri();
        java.lang.String str39 = element33.attr("<hi!></hi!>");
        boolean boolean40 = element33.hasAttributes();
        org.jsoup.nodes.Element element42 = element33.appendText("");
        element42.setBaseUri("<hi!></hi!>");
        org.jsoup.nodes.Element element46 = element42.addClass("");
        org.jsoup.nodes.Element element48 = element46.addClass("");
        element22.replaceWith((org.jsoup.nodes.Node) element46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element50 = element22.firstElementSibling();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        java.lang.String str3 = element1.className();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan((int) '#');
        org.jsoup.select.Elements elements6 = element1.getAllElements();
        boolean boolean7 = element1.hasParent();
        org.jsoup.select.Elements elements9 = element1.getElementsByIndexGreaterThan((int) (byte) 10);
        org.jsoup.nodes.Node node10 = element1.nextSibling();
        org.jsoup.nodes.Node node11 = element1.previousSibling();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements14 = element13.children();
        org.jsoup.nodes.Element element16 = element13.append("");
        org.jsoup.nodes.Element element18 = element16.html("");
        org.jsoup.nodes.Element element20 = element16.removeClass("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet21 = element20.classNames();
        org.jsoup.nodes.Element element22 = element1.classNames(strSet21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element22.lastElementSibling();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element6 = element4.html("");
        org.jsoup.nodes.Element element8 = element4.tagName("hi!");
        org.jsoup.nodes.Node node9 = element8.nextSibling();
        java.lang.String str10 = element8.nodeName();
        org.jsoup.nodes.Element element12 = element8.prepend("<hi!></hi!>");
        java.lang.String str14 = element12.absUrl("<hi!>\n <hi!>\n  <hi!></hi!>\n </hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element12.lastElementSibling();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        org.jsoup.nodes.Element element6 = element4.html("");
        org.jsoup.nodes.Element element8 = element4.tagName("hi!");
        org.jsoup.nodes.Element element10 = element4.prependText("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        boolean boolean13 = element12.isBlock();
        org.jsoup.nodes.Element element15 = element12.prependElement("hi!");
        org.jsoup.select.Elements elements18 = element15.getElementsByAttributeValueContaining("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>", "<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element20 = element15.addClass("<hi!></hi!>");
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements23 = element22.children();
        org.jsoup.nodes.Node node24 = element22.root();
        org.jsoup.select.Elements elements26 = element22.getElementsContainingText("hi!");
        boolean boolean28 = element22.hasAttr("");
        org.jsoup.nodes.Element element29 = element15.prependChild((org.jsoup.nodes.Node) element22);
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements32 = element31.children();
        org.jsoup.nodes.Node node33 = element31.root();
        org.jsoup.select.Elements elements35 = element31.getElementsContainingText("hi!");
        org.jsoup.nodes.Element element38 = element31.attr("hi!", true);
        org.jsoup.nodes.Element element41 = element38.attr("", true);
        org.jsoup.nodes.Element element43 = element41.toggleClass("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element45 = element41.prepend("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.select.Elements elements47 = element41.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element48 = element29.before((org.jsoup.nodes.Node) element41);
        boolean boolean50 = element48.hasAttr("<hi!> &lt;hi!&gt;&lt;/hi!&gt; </hi!>");
        java.util.Set<java.lang.String> strSet51 = element48.classNames();
        org.jsoup.nodes.Element element52 = element4.classNames(strSet51);
        org.jsoup.nodes.Element element54 = element4.prepend("");
        org.jsoup.nodes.Element element56 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements57 = element56.children();
        org.jsoup.nodes.Node node58 = element56.root();
        java.lang.String str59 = element56.baseUri();
        java.lang.String str60 = element56.baseUri();
        java.lang.String str62 = element56.attr("<hi!></hi!>");
        boolean boolean63 = element56.hasAttributes();
        org.jsoup.nodes.Element element65 = element56.appendText("");
        element65.setBaseUri("<hi!></hi!>");
        org.jsoup.nodes.Element element69 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements70 = element69.children();
        java.lang.String str71 = element69.className();
        org.jsoup.select.Elements elements73 = element69.getElementsByIndexLessThan((int) '#');
        java.lang.String str74 = element69.className();
        org.jsoup.nodes.Element element75 = element65.appendChild((org.jsoup.nodes.Node) element69);
        boolean boolean77 = element75.hasClass("hi!");
        org.jsoup.nodes.Element element79 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements80 = element79.children();
        org.jsoup.nodes.Element element82 = element79.append("");
        org.jsoup.nodes.Element element83 = element82.clone();
        org.jsoup.nodes.Element element85 = element82.prependText("");
        org.jsoup.nodes.Element element87 = element85.prepend("<hi!></hi!>");
        org.jsoup.select.Elements elements88 = element85.getAllElements();
        org.jsoup.nodes.Node node89 = element85.parentNode();
        java.util.Map<java.lang.String, java.lang.String> strMap90 = element85.dataset();
        org.jsoup.nodes.Element element91 = element75.doClone((org.jsoup.nodes.Node) element85);
        java.lang.String str92 = element91.data();
        java.lang.String str94 = element91.absUrl("<hi!></hi!>");
        org.jsoup.nodes.Element element95 = element4.appendChild((org.jsoup.nodes.Node) element91);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str96 = element95.toString();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean2 = element1.isBlock();
        org.jsoup.nodes.Element element4 = element1.prependText("");
        java.util.Set<java.lang.String> strSet5 = element1.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element1.lastElementSibling();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
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
        boolean boolean16 = element15.hasAttributes();
        java.lang.String str17 = element15.ownText();
        org.jsoup.select.Elements elements19 = element15.getElementsByIndexGreaterThan(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element15.lastElementSibling();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = element27.wrap("&lt;hi!&gt; &lt;/hi!&gt;");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        java.lang.String str3 = element1.className();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan((int) '#');
        org.jsoup.select.Elements elements6 = element1.getAllElements();
        boolean boolean7 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element10.children();
        java.lang.String str12 = element10.className();
        org.jsoup.select.Elements elements14 = element10.getElementsByIndexLessThan((int) '#');
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements17 = element16.children();
        org.jsoup.nodes.Element element19 = element16.append("");
        org.jsoup.nodes.Element element20 = element19.clone();
        org.jsoup.nodes.Element element22 = element19.prependText("");
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements25 = element24.children();
        org.jsoup.nodes.Element element27 = element24.append("");
        org.jsoup.nodes.Element element28 = element27.clone();
        org.jsoup.nodes.Element element30 = element27.prependText("");
        org.jsoup.parser.Tag tag31 = element30.tag();
        org.jsoup.nodes.Node[] nodeArray32 = new org.jsoup.nodes.Node[] { element10, element22, element30 };
        org.jsoup.nodes.Element element33 = element1.insertChildren(0, nodeArray32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element34 = element33.lastElementSibling();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element4 = element1.append("");
        int int5 = element1.childNodeSize();
        org.jsoup.select.Elements elements7 = element1.getElementsByIndexGreaterThan((int) '#');
        boolean boolean8 = element1.hasParent();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element1.childNodes();
        org.jsoup.nodes.Element element11 = element1.html("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element11.textNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element11.lastElementSibling();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element3 = element1.clone();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements6 = element5.children();
        java.lang.String str7 = element5.className();
        org.jsoup.nodes.Element element8 = element3.prependChild((org.jsoup.nodes.Node) element5);
        java.lang.String str9 = element3.ownText();
        boolean boolean10 = element3.hasAttributes();
        org.jsoup.nodes.Element element11 = element3.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element3.wrap("<hi! class=\"\">\n</hi!>");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        boolean boolean2 = element1.isBlock();
        org.jsoup.nodes.Element element4 = element1.prependText("");
        java.util.Set<java.lang.String> strSet5 = element1.classNames();
        org.jsoup.nodes.Element element7 = element1.prependText("<hi!></hi!>");
        org.jsoup.nodes.Node node8 = element1.previousSibling();
        org.jsoup.select.Elements elements11 = element1.getElementsByAttributeValueMatching("<hi!>\n</hi!>", "<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.lang.String str12 = element1.text();
        element1.nodelistChanged();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element1.wrap("<hi! value=\"<hi! hi! <hi!>\n &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt;\n</hi!> <hi! class=&quot;&quot;></hi!>>\n &amp;lt;hi!&amp;gt; &amp;lt;/hi!&amp;gt;\n</hi!>\">\n <hi!>\n   &lt;hi!&gt;&lt;/hi!&gt; \n </hi!>\n</hi!>");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        java.lang.String str3 = element1.tagName();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = element1.dataset();
        org.jsoup.nodes.Node node6 = element1.removeAttr("");
        element1.setBaseUri("");
        java.util.Set<java.lang.String> strSet9 = element1.classNames();
        org.jsoup.nodes.Element element10 = element1.empty();
        org.jsoup.select.Elements elements12 = element10.getElementsByTag("<hi! class=\"\">\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element10.firstElementSibling();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        java.lang.String str3 = element1.tagName();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = element1.dataset();
        org.jsoup.nodes.Node node6 = element1.removeAttr("");
        element1.setBaseUri("");
        java.util.Set<java.lang.String> strSet9 = element1.classNames();
        org.jsoup.nodes.Element element10 = element1.empty();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element10.ensureChildNodes();
        java.lang.String str12 = element10.cssSelector();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element10.lastElementSibling();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        org.jsoup.nodes.Element element3 = element1.clone();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements6 = element5.children();
        java.lang.String str7 = element5.className();
        org.jsoup.nodes.Element element8 = element3.prependChild((org.jsoup.nodes.Node) element5);
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element3.childNodes();
        boolean boolean11 = element3.hasClass("hi!");
        org.jsoup.select.Elements elements12 = element3.parents();
        org.jsoup.nodes.Element element13 = element3.previousElementSibling();
        java.lang.String str14 = element3.id();
        org.jsoup.nodes.Node node15 = element3.root();
        org.jsoup.nodes.Element element17 = element3.prepend("<hi! value=\"<hi!></hi!>\">\n <hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element3.wrap("<hi! class=\"\">\n</hi!>");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
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
        java.lang.String str13 = element5.id();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements16 = element15.children();
        java.lang.String str17 = element15.className();
        org.jsoup.select.Elements elements19 = element15.getElementsByIndexLessThan((int) '#');
        org.jsoup.select.Elements elements20 = element15.getAllElements();
        boolean boolean21 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements25 = element24.children();
        java.lang.String str26 = element24.className();
        org.jsoup.select.Elements elements28 = element24.getElementsByIndexLessThan((int) '#');
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements31 = element30.children();
        org.jsoup.nodes.Element element33 = element30.append("");
        org.jsoup.nodes.Element element34 = element33.clone();
        org.jsoup.nodes.Element element36 = element33.prependText("");
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements39 = element38.children();
        org.jsoup.nodes.Element element41 = element38.append("");
        org.jsoup.nodes.Element element42 = element41.clone();
        org.jsoup.nodes.Element element44 = element41.prependText("");
        org.jsoup.parser.Tag tag45 = element44.tag();
        org.jsoup.nodes.Node[] nodeArray46 = new org.jsoup.nodes.Node[] { element24, element36, element44 };
        org.jsoup.nodes.Element element47 = element15.insertChildren(0, nodeArray46);
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements50 = element49.children();
        org.jsoup.nodes.Element element51 = element49.clone();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements54 = element53.children();
        java.lang.String str55 = element53.className();
        org.jsoup.nodes.Element element56 = element51.prependChild((org.jsoup.nodes.Node) element53);
        java.util.List<org.jsoup.nodes.Node> nodeList57 = element51.childNodes();
        element15.childNodes = nodeList57;
        org.jsoup.nodes.Element element59 = element5.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Element element61 = element5.toggleClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element63 = element61.prependElement("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements66 = element61.getElementsByAttributeValueStarting("<<hi! class=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n hi!\n</hi!>></<hi! class=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n hi!\n</hi!>>", "<hi!");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.children();
        java.lang.String str3 = element1.className();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan((int) '#');
        org.jsoup.select.Elements elements6 = element1.getAllElements();
        boolean boolean7 = element1.hasParent();
        org.jsoup.select.Elements elements9 = element1.getElementsByIndexGreaterThan((int) (byte) 10);
        org.jsoup.nodes.Node node10 = element1.nextSibling();
        org.jsoup.nodes.Node node11 = element1.previousSibling();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements14 = element13.children();
        org.jsoup.nodes.Element element16 = element13.append("");
        org.jsoup.nodes.Element element18 = element16.html("");
        org.jsoup.nodes.Element element20 = element16.removeClass("<hi!></hi!>");
        java.util.Set<java.lang.String> strSet21 = element20.classNames();
        org.jsoup.nodes.Element element22 = element1.classNames(strSet21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element22.firstElementSibling();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
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
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements15 = element14.children();
        org.jsoup.nodes.Element element16 = element14.clone();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements19 = element18.children();
        java.lang.String str20 = element18.className();
        org.jsoup.nodes.Element element21 = element16.prependChild((org.jsoup.nodes.Node) element18);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element16.childNodes();
        boolean boolean24 = element16.hasClass("hi!");
        org.jsoup.nodes.Element element26 = element16.appendElement("<hi!></hi!>");
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements29 = element28.children();
        org.jsoup.nodes.Node node30 = element28.root();
        org.jsoup.select.Elements elements32 = element28.getElementsContainingText("hi!");
        java.lang.String str33 = element28.toString();
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements36 = element35.children();
        org.jsoup.nodes.Element element37 = element35.clone();
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements40 = element39.children();
        java.lang.String str41 = element39.className();
        org.jsoup.nodes.Element element42 = element37.prependChild((org.jsoup.nodes.Node) element39);
        java.util.List<org.jsoup.nodes.Node> nodeList43 = element37.childNodes();
        boolean boolean45 = element37.hasClass("hi!");
        org.jsoup.select.Elements elements46 = element37.parents();
        org.jsoup.select.Elements elements49 = element37.getElementsByAttributeValueMatching("<hi!></hi!>", "");
        org.jsoup.nodes.Element element50 = element28.appendChild((org.jsoup.nodes.Node) element37);
        org.jsoup.nodes.Node node51 = element50.previousSibling();
        java.lang.String str52 = element50.html();
        org.jsoup.nodes.Element element54 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements55 = element54.children();
        java.lang.String str56 = element54.tagName();
        java.util.Map<java.lang.String, java.lang.String> strMap57 = element54.dataset();
        org.jsoup.nodes.Node node59 = element54.removeAttr("");
        element54.setBaseUri("");
        java.util.Set<java.lang.String> strSet62 = element54.classNames();
        org.jsoup.nodes.Element element63 = element50.classNames(strSet62);
        org.jsoup.nodes.Element element64 = element26.classNames(strSet62);
        org.jsoup.nodes.Element element65 = element5.classNames(strSet62);
        org.jsoup.nodes.Element element66 = element65.previousElementSibling();
        org.jsoup.select.Elements elements68 = element65.getElementsByIndexEquals(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element69 = element65.firstElementSibling();
    }
}

