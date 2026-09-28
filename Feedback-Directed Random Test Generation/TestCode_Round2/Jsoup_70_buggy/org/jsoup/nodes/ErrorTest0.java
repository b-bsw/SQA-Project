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
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.nodes.Element element8 = element1.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element1.wrap("<hi! class=\"\"></hi!>");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element1.firstElementSibling();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element31 = element30.firstElementSibling();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.parents();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element1.lastElementSibling();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element8.lastElementSibling();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element8.firstElementSibling();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Attributes attributes6 = element1.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element1.wrap("<hi!>\n hi!\n</hi!>");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element32 = element31.firstElementSibling();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.cssSelector();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element1.firstElementSibling();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.lang.String str8 = element1.html();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList9 = element1.dataNodes();
        java.lang.String str11 = element1.absUrl("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element1.firstElementSibling();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element16.firstElementSibling();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = element28.firstElementSibling();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        java.lang.String str8 = element1.cssSelector();
        boolean boolean10 = element1.hasClass("<hi!></hi!>");
        org.jsoup.nodes.Element element12 = element1.val("");
        org.jsoup.nodes.Element element13 = element1.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element1.firstElementSibling();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = element1.textNodes();
        org.jsoup.select.Elements elements10 = element1.getElementsContainingOwnText("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element1.wrap("<hi! class=\"\"></hi!>");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element37 = element35.wrap("&lt;hi!&gt;&lt;/hi!&gt;");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element13.wrap("hi!");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.select.Elements elements9 = element6.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Node node10 = element6.parentNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element6.firstElementSibling();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = element20.wrap("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.nodes.Element element8 = element1.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element1.wrap("hi!");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element7.lastElementSibling();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element1.lastElementSibling();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueMatching("", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element1.lastElementSibling();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.siblingElements();
        org.jsoup.select.Elements elements7 = element1.getAllElements();
        org.jsoup.select.Elements elements9 = element1.getElementsMatchingOwnText("");
        boolean boolean11 = element1.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element1.lastElementSibling();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        org.jsoup.nodes.Element element10 = element1.prepend("hi!");
        java.lang.String str11 = element10.className();
        org.jsoup.nodes.Element element13 = element10.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element13.lastElementSibling();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        java.lang.String str8 = element1.cssSelector();
        boolean boolean10 = element1.hasClass("<hi!></hi!>");
        java.lang.String str11 = element1.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element1.wrap("<hi!>\n hi!\n</hi!>");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element52 = element1.lastElementSibling();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.nodes.Element element8 = element1.removeClass("<hi! class=\"\"></hi!>");
        int int9 = element8.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element8.wrap("<hi! hi!=\"<hi!></hi!>\">\n &lt;hi! value=\"hi!\"&gt; hi! &lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        element8.doSetBaseUri("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element15 = element8.attr("hi!", true);
        boolean boolean16 = element8.isBlock();
        boolean boolean18 = element8.hasAttr("<hi! class=\"\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element8.wrap("<hi!> &lt;hi! class=\"\"&gt;&lt;/hi!&gt; </hi!>");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element9 = element6.appendText("<hi!></hi!>");
        java.lang.String str10 = element9.className();
        org.jsoup.nodes.Element element11 = element9.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element11.lastElementSibling();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.nodes.Node node7 = element1.clearAttributes();
        org.jsoup.nodes.Element element9 = element1.addClass("");
        org.jsoup.nodes.Element element11 = element1.html("<hi!>\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element1.lastElementSibling();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element25.wrap("<hi! value=\"hi!\">\n hi!\n</hi!>");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        element1.setBaseUri("");
        org.jsoup.select.Elements elements9 = element1.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element1.firstElementSibling();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Element element5 = element1.attr("", "");
        boolean boolean7 = element5.hasClass("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = element5.textNodes();
        java.lang.String str9 = element5.ownText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element5.lastElementSibling();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element5.firstElementSibling();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        java.lang.String str8 = element6.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element6.childNodesCopy();
        org.jsoup.nodes.Element element10 = element6.clone();
        org.jsoup.nodes.Element element12 = element6.prependText("&lt;hi!&gt;&lt;/hi!&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element12.wrap("< class=\" \" value=\"\"> <hi! class=\"\"></hi!><hi!></hi!> >");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        boolean boolean7 = element1.hasAttr("");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.nextElementSibling();
        boolean boolean11 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element9);
        int int12 = element9.siblingIndex();
        org.jsoup.nodes.Element element15 = element9.attr("hi!", "<hi!></hi!>");
        java.lang.String str16 = element9.cssSelector();
        boolean boolean18 = element9.hasClass("<hi!></hi!>");
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        element20.setBaseUri("hi!");
        org.jsoup.nodes.Element element23 = element20.empty();
        org.jsoup.nodes.Element element24 = element9.appendChild((org.jsoup.nodes.Node) element23);
        boolean boolean25 = element1.hasSameValue((java.lang.Object) element9);
        org.jsoup.nodes.Element element26 = element1.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element26.lastElementSibling();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        org.jsoup.nodes.Element element10 = element1.prepend("hi!");
        org.jsoup.nodes.Element element11 = element10.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element11.lastElementSibling();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.nodes.Element element8 = element1.removeClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Node node9 = element8.previousSibling();
        org.jsoup.parser.Tag tag10 = element8.tag();
        boolean boolean12 = element8.hasAttr("<hi!>\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element8.lastElementSibling();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
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
        boolean boolean62 = element60.hasAttr("<hi! class=\"\"></hi!>");
        java.lang.String str63 = element60.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element65 = element60.wrap("<hi! value=\"<hi!>\n hi!\n</hi!>\"></hi!>");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.nodes.Element element8 = element1.empty();
        element1.setBaseUri("<hi! hi!=\"<hi!></hi!>\">\n &lt;hi! value=\"hi!\"&gt; hi! &lt;/hi!&gt;\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element1.wrap("<hi! class=\"<hi! class=&quot;&quot;></hi!> <hi! class=&quot;&quot;></hi!>\">\n hi!\n</hi!>");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        java.lang.String str4 = element1.toString();
        java.lang.String str5 = element1.id();
        org.jsoup.nodes.Element element7 = element1.prepend("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.select.Elements elements9 = element7.getElementsMatchingText("&lt;hi!&gt;&lt;/hi!&gt;");
        org.jsoup.select.Elements elements11 = element7.getElementsByAttributeStarting("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element7.firstElementSibling();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element12.wrap("<hi! hi!=\"<hi!></hi!>\">\n &lt;hi! value=\"hi!\"&gt; hi! &lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag8, "<hi! class=\"\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element14.firstElementSibling();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        org.jsoup.nodes.Element element9 = element1.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element9.firstElementSibling();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element41 = element18.lastElementSibling();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        element8.doSetBaseUri("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element14 = element8.html("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element8.lastElementSibling();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        java.lang.String str4 = element1.toString();
        java.lang.String str5 = element1.id();
        org.jsoup.select.Elements elements7 = element1.getElementsByIndexGreaterThan((int) (short) 10);
        java.lang.String str8 = element1.toString();
        org.jsoup.select.Elements elements10 = element1.getElementsContainingOwnText("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element1.firstElementSibling();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
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
        org.jsoup.nodes.Element element26 = element12.toggleClass("<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;\n</<hi!></hi!>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element12.lastElementSibling();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.parser.Tag tag5 = element1.tag();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag5, "");
        org.jsoup.select.Elements elements9 = element7.getElementsByAttribute("<hi!>\n <hi!></hi!>\n</hi!>");
        java.lang.String str10 = element7.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element7.lastElementSibling();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element14.lastElementSibling();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element8.firstElementSibling();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        java.lang.String str2 = element1.text();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        org.jsoup.nodes.Element element4 = element3.previousElementSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element3.wrap("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n <hi!>\n   hi! \n </hi!>\n</hi!>");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<&lt;hi!&gt;&lt;/hi!&gt;></&lt;hi!&gt;&lt;/hi!&gt;>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = element1.wrap("<hi!>\n <hi!></hi!>hi!\n</hi!>");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.lang.String str8 = element7.text();
        org.jsoup.select.Elements elements11 = element7.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi!></hi!>");
        java.lang.String str12 = element7.toString();
        java.lang.String str13 = element7.nodeName();
        org.jsoup.select.Elements elements14 = element7.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element7.lastElementSibling();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element7.firstElementSibling();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element9 = element6.appendText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element6.siblingNodes();
        org.jsoup.nodes.Element element12 = element6.tagName("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element6.wrap("<hi! <hi!></hi!>=\"<hi!>\n hi!\n</hi!>\"></hi!>");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = element1.firstElementSibling();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element6 = element5.parent();
        org.jsoup.nodes.Element element8 = element5.html("<hi! class=\"\"></hi!>");
        boolean boolean9 = element8.hasParent();
        org.jsoup.parser.Tag tag10 = element8.tag();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element14 = element13.nextElementSibling();
        org.jsoup.nodes.Attributes attributes15 = element13.attributes();
        org.jsoup.nodes.Element element17 = element13.text("");
        int int18 = element13.siblingIndex();
        org.jsoup.nodes.Element element20 = element13.text("hi!");
        boolean boolean21 = element13.hasParent();
        java.lang.String str22 = element13.tagName();
        java.lang.String str23 = element13.text();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element26 = element25.nextElementSibling();
        org.jsoup.nodes.Attributes attributes27 = element25.attributes();
        org.jsoup.nodes.Element element28 = element13.prependChild((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Attributes attributes29 = element25.attributes();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element(tag10, "<hi! =\"\"></hi!>", attributes29);
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element34 = element33.parent();
        org.jsoup.nodes.Node node35 = element33.parentNode();
        org.jsoup.select.Elements elements37 = element33.getElementsByIndexLessThan(1);
        element33.nodelistChanged();
        boolean boolean40 = element33.equals((java.lang.Object) (byte) -1);
        org.jsoup.nodes.Element element42 = element33.prependElement("<hi! value=\"hi!\">\n hi!\n</hi!>");
        org.jsoup.nodes.Node node43 = element42.nextSibling();
        org.jsoup.nodes.Element element45 = element42.append("<hi! hi!=\"<hi!></hi!>\"></hi!>");
        element45.doSetBaseUri("<hi! value=\"hi!\">\n hi!\n</hi!>");
        org.jsoup.nodes.Attributes attributes48 = element45.attributes();
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element(tag10, "< class=\" \" value=\"\"> <hi! class=\"\"></hi!><hi!></hi!> >", attributes48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element50 = element49.firstElementSibling();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.parser.Tag tag5 = element1.tag();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag5, "");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag5, "<hi!></hi!>");
        java.lang.String str10 = element9.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element9.firstElementSibling();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
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
        java.lang.String str21 = element8.toString();
        org.jsoup.nodes.Attributes attributes22 = element8.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element8.firstElementSibling();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element8.wrap("<hi! value=\"<hi!>\n hi!\n</hi!>\"></hi!>");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element17.firstElementSibling();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
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
        element37.remove();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element46 = element37.lastElementSibling();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element27.firstElementSibling();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        boolean boolean6 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements8 = element1.getElementsContainingOwnText("<hi!>\n <hi!></hi!>\n</hi!>");
        boolean boolean9 = element1.hasParent();
        org.jsoup.nodes.Node node11 = element1.removeAttr("<hi!>\n hi!\n</hi!>");
        int int12 = element1.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element1.lastElementSibling();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        boolean boolean6 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements8 = element1.getElementsContainingOwnText("<hi!>\n <hi!></hi!>\n</hi!>");
        boolean boolean9 = element1.hasParent();
        org.jsoup.nodes.Node node11 = element1.removeAttr("<hi!>\n hi!\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element1.wrap("hi! hi!");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element1.childNodes;
        org.jsoup.select.Elements elements9 = element1.getElementsByClass("<hi! value=\"hi!\">\n hi!\n</hi!>");
        org.jsoup.select.Elements elements10 = element1.getAllElements();
        boolean boolean11 = element1.hasAttributes();
        org.jsoup.nodes.Element element13 = element1.addClass("<hi! value=\"<hi!>\n hi!\n</hi!>\"></hi!>");
        java.lang.String str14 = element13.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element13.lastElementSibling();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element7.wrap("<hi!>\n &lt;hi!&gt; &lt;hi!&gt; hi! &lt;/hi!&gt; &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt;\n <<hi! =\"hi!\">\n</hi!>></<hi! =\"hi!\">\n</hi!>>\n</hi!>");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = element1.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList3 = element1.ensureChildNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = element1.lastElementSibling();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        boolean boolean9 = element1.hasParent();
        java.lang.String str10 = element1.data();
        org.jsoup.nodes.Element element11 = element1.shallowClone();
        org.jsoup.nodes.Element element12 = element1.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element1.firstElementSibling();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element1.childNodes;
        org.jsoup.select.Elements elements9 = element1.getElementsByClass("<hi! value=\"hi!\">\n hi!\n</hi!>");
        org.jsoup.select.Elements elements10 = element1.getAllElements();
        boolean boolean11 = element1.hasAttributes();
        org.jsoup.nodes.Element element13 = element1.addClass("<hi! value=\"<hi!>\n hi!\n</hi!>\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element13.lastElementSibling();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element9.firstElementSibling();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element9 = element6.appendText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element6.siblingNodes();
        org.jsoup.nodes.Element element12 = element6.tagName("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element12.lastElementSibling();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element1.childNodesCopy();
        java.lang.String str6 = element1.outerHtml();
        org.jsoup.nodes.Element element7 = element1.shallowClone();
        org.jsoup.nodes.Element element8 = element7.nextElementSibling();
        boolean boolean9 = element7.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element7.firstElementSibling();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = element1.childNodes();
        org.jsoup.select.Elements elements5 = element1.getElementsByAttributeValue("<hi!></hi!>", "hi!");
        java.lang.String str6 = element1.cssSelector();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element1.firstElementSibling();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        element8.doSetBaseUri("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element14 = element8.html("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element16 = element8.appendElement("<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;\n</<hi!></hi!>>");
        org.jsoup.select.Elements elements19 = element8.getElementsByAttributeValue("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>", "<hi!>\n <<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n  <hi! class=\"\"></hi!>\n </<hi!></hi!>>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element8.firstElementSibling();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
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
        org.jsoup.select.Elements elements17 = element1.getElementsByAttributeValueEnding("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Node node19 = element1.removeAttr("<hi! hi!=\"<hi!></hi!>\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element1.lastElementSibling();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        org.jsoup.nodes.Element element9 = element1.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element1.firstElementSibling();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element5 = element1.nextElementSibling();
        org.jsoup.select.Elements elements7 = element1.getElementsByTag("<hi! hi!=\"<hi!></hi!>\">\n &lt;hi! value=\"hi!\"&gt; hi! &lt;/hi!&gt;\n</hi!>");
        org.jsoup.select.Elements elements9 = element1.getElementsMatchingOwnText("<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n <<hi!>\n hi!\n</hi!>></<hi!>\n hi!\n</hi!>>\n <hi! class=\"\"></hi!>\n</<hi!></hi!>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element1.lastElementSibling();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
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
        org.jsoup.nodes.Attributes attributes51 = element8.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element53 = element8.wrap("<hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
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
        java.lang.String str28 = element15.nodeName();
        org.jsoup.nodes.Document document29 = element15.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element31 = element15.wrap("<hi!>\n <<hi! hi!=\"<hi!></hi!>\"></hi!>></<hi! hi!=\"<hi!></hi!>\"></hi!>>\n <<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>></<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>>\n</hi!>");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element24.firstElementSibling();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.nodes.Element element8 = element1.removeClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Node node9 = element8.previousSibling();
        org.jsoup.parser.Tag tag10 = element8.tag();
        int int11 = element8.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element8.firstElementSibling();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
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
        org.jsoup.select.Elements elements49 = element10.getElementsByAttributeValueNot("<hi!></hi!>", "<hi! hi!=\"<hi!></hi!>\"></hi!>");
        org.jsoup.select.Elements elements51 = element10.getElementsByAttributeStarting("<hi! =\"hi!\">\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element52 = element10.firstElementSibling();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element8 = element1.attr("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>", false);
        org.jsoup.select.Elements elements10 = element1.getElementsByIndexLessThan((int) (byte) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element1.ensureChildNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element1.firstElementSibling();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element77 = element75.firstElementSibling();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        java.lang.String str6 = element5.val();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element8.childNodes();
        org.jsoup.nodes.Element element10 = element5.appendTo(element8);
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList11 = element8.dataNodes();
        org.jsoup.nodes.Element element12 = element8.empty();
        org.jsoup.nodes.Element element14 = element8.tagName("<hi! =\"\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element8.wrap("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n <hi!>\n   hi! \n </hi!>\n</hi!>");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Element element5 = element1.attr("", "");
        org.jsoup.nodes.Element element6 = element1.empty();
        org.jsoup.select.Elements elements8 = element1.getElementsByIndexLessThan(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element1.lastElementSibling();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        element1.nodelistChanged();
        boolean boolean8 = element1.equals((java.lang.Object) (byte) -1);
        boolean boolean10 = element1.hasClass("<hi!>\n hi!\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element1.lastElementSibling();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("");
        element8.doSetBaseUri("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element14 = element8.html("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Attributes attributes15 = element14.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element14.firstElementSibling();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
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
        int int17 = element16.childNodeSize();
        java.lang.String str18 = element16.toString();
        java.lang.String str19 = element16.text();
        org.jsoup.nodes.Element element21 = element16.toggleClass("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n <hi!>\n   hi! \n </hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element21.wrap("<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\"></<hi!></hi!>>");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.siblingElements();
        org.jsoup.select.Elements elements7 = element1.getAllElements();
        org.jsoup.select.Elements elements9 = element1.getElementsMatchingOwnText("");
        boolean boolean11 = element1.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element1.firstElementSibling();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexLessThan((int) 'a');
        element7.doSetBaseUri("<hi!>\n hi!\n</hi!>");
        boolean boolean12 = element7.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element7.firstElementSibling();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        org.jsoup.nodes.Element element10 = element1.prepend("hi!");
        org.jsoup.nodes.Element element11 = element10.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element10.wrap("<hi! <hi!></hi!>=\"<hi!>\n hi!\n</hi!>\"></hi!>");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
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
        org.jsoup.nodes.Element element13 = element12.nextElementSibling();
        org.jsoup.nodes.Attributes attributes14 = element12.attributes();
        org.jsoup.nodes.Element element16 = element12.text("");
        int int17 = element12.siblingIndex();
        org.jsoup.nodes.Element element19 = element12.text("hi!");
        org.jsoup.select.Elements elements21 = element19.getElementsMatchingText("");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element19.childNodesCopy();
        org.jsoup.select.Elements elements24 = element19.getElementsByIndexLessThan((int) (byte) 1);
        java.lang.String str25 = element19.id();
        boolean boolean26 = element19.isBlock();
        org.jsoup.select.Elements elements27 = element19.siblingElements();
        org.jsoup.nodes.Element element29 = element19.appendText("<hi! class=\"\"></hi!>");
        boolean boolean30 = element1.hasSameValue((java.lang.Object) element29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element31 = element1.firstElementSibling();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
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
        org.jsoup.nodes.Element element34 = element30.addClass("<hi! value=\"hi!\">\n hi!\n</hi!>");
        org.jsoup.nodes.Element element36 = element34.text("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element38 = element34.wrap("<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n <<hi!>\n hi!\n</hi!>></<hi!>\n hi!\n</hi!>>\n <hi! class=\"\"></hi!>\n</<hi!></hi!>>");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element31 = element25.lastElementSibling();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        java.lang.String str4 = element1.toString();
        org.jsoup.parser.Tag tag5 = element1.tag();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsByClass("hi!");
        java.lang.String str11 = element8.toString();
        org.jsoup.parser.Tag tag12 = element8.tag();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element16 = element15.parent();
        org.jsoup.nodes.Node node17 = element15.parentNode();
        org.jsoup.select.Elements elements19 = element15.getElementsByIndexLessThan(1);
        element15.nodelistChanged();
        org.jsoup.select.Elements elements21 = element15.parents();
        org.jsoup.nodes.Element element23 = element15.removeClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Attributes attributes24 = element15.attributes();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag12, "", attributes24);
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element29 = element28.nextElementSibling();
        org.jsoup.nodes.Attributes attributes30 = element28.attributes();
        org.jsoup.nodes.Element element32 = element28.text("");
        int int33 = element28.siblingIndex();
        org.jsoup.nodes.Element element35 = element28.text("hi!");
        java.lang.String str36 = element35.outerHtml();
        org.jsoup.nodes.Element element38 = element35.appendText("");
        org.jsoup.nodes.Node node40 = element35.removeAttr("");
        org.jsoup.parser.Tag tag41 = element35.tag();
        org.jsoup.nodes.Element element44 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element45 = element44.nextElementSibling();
        org.jsoup.nodes.Attributes attributes46 = element44.attributes();
        org.jsoup.nodes.Element element48 = element44.text("");
        int int49 = element44.siblingIndex();
        org.jsoup.nodes.Element element51 = element44.text("hi!");
        org.jsoup.select.Elements elements53 = element51.getElementsMatchingText("");
        java.util.List<org.jsoup.nodes.Node> nodeList54 = element51.childNodesCopy();
        org.jsoup.select.Elements elements55 = element51.parents();
        org.jsoup.parser.Tag tag56 = element51.tag();
        org.jsoup.nodes.Element element58 = new org.jsoup.nodes.Element(tag56, "<hi!></hi!>");
        org.jsoup.nodes.Element element61 = new org.jsoup.nodes.Element("hi!");
        element61.setBaseUri("hi!");
        org.jsoup.select.Elements elements65 = element61.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Attributes attributes66 = element61.attributes();
        org.jsoup.nodes.Element element67 = new org.jsoup.nodes.Element(tag56, "<hi!>\n hi!\n</hi!>", attributes66);
        org.jsoup.nodes.Element element68 = new org.jsoup.nodes.Element(tag41, "<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>", attributes66);
        org.jsoup.nodes.Element element69 = new org.jsoup.nodes.Element(tag12, "", attributes66);
        org.jsoup.nodes.Element element70 = new org.jsoup.nodes.Element(tag5, "hi! hi!", attributes66);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element71 = element70.lastElementSibling();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        java.lang.String str9 = element8.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element8.firstElementSibling();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
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
        java.lang.String str24 = element1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element1.lastElementSibling();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.nodes.Node node7 = element1.clearAttributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = element1.dataset();
        java.lang.String str9 = element1.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element1.firstElementSibling();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Element element8 = element1.attr("", "hi!");
        org.jsoup.nodes.Element element10 = element1.prepend("hi!");
        org.jsoup.nodes.Element element11 = element10.clone();
        org.jsoup.nodes.Element element13 = element10.removeClass("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element13.firstElementSibling();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        int int4 = element1.siblingIndex();
        org.jsoup.nodes.Element element7 = element1.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexLessThan((int) 'a');
        element7.doSetBaseUri("<hi!>\n hi!\n</hi!>");
        boolean boolean12 = element7.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element7.lastElementSibling();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
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
        org.jsoup.nodes.Element element20 = element17.attr("< class=\" \" value=\"\"> <hi! class=\"\"></hi!><hi!></hi!> >", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element17.wrap("<hi! class=\"\">\n <hi!>\n  hi!\n </hi!>\n</hi!>");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
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
        org.jsoup.nodes.Element element58 = new org.jsoup.nodes.Element(tag8, "hi! hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element60 = element58.wrap("<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n <<hi!>\n hi!\n</hi!>></<hi!>\n hi!\n</hi!>>\n <hi! class=\"\"></hi!>\n</<hi!></hi!>>");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        java.lang.String str6 = element5.val();
        org.jsoup.select.Elements elements9 = element5.getElementsByAttributeValueEnding("<hi! hi!=\"<hi!></hi!>\"></hi!>", "<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element5.lastElementSibling();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.nodes.Node node7 = element1.clearAttributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = element1.dataset();
        org.jsoup.nodes.Element element10 = element1.val("<hi!>\n hi!\n</hi!>");
        int int11 = element1.elementSiblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element1.ensureChildNodes();
        org.jsoup.select.Elements elements14 = element1.getElementsByIndexEquals((int) (short) -1);
        java.lang.String str15 = element1.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element1.firstElementSibling();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element46 = element1.wrap("< class=\" \" value=\"\"> <hi! class=\"\"></hi!><hi!></hi!> >");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
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
        java.lang.String str14 = element12.data();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element12.ensureChildNodes();
        org.jsoup.nodes.Element element16 = element12.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element16.firstElementSibling();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Element element5 = element1.attr("<hi!></hi!>", true);
        org.jsoup.parser.Tag tag6 = element1.tag();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag6, "<hi! hi!=\"<hi!></hi!>\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element8.firstElementSibling();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        boolean boolean3 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        element1.doSetBaseUri("hi!");
        org.jsoup.nodes.Element element6 = element1.shallowClone();
        org.jsoup.nodes.Node node7 = element1.previousSibling();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsByClass("hi!");
        org.jsoup.nodes.Element element13 = element9.html("");
        java.lang.String str14 = element13.val();
        java.lang.String str15 = element13.toString();
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
        org.jsoup.nodes.Element element43 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element44 = element43.nextElementSibling();
        boolean boolean45 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element43);
        int int46 = element43.siblingIndex();
        org.jsoup.nodes.Element element49 = element43.attr("hi!", "<hi!></hi!>");
        org.jsoup.select.Elements elements51 = element49.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements53 = element49.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element54 = element40.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements53);
        boolean boolean55 = element13.equals((java.lang.Object) element40);
        org.jsoup.nodes.Element element57 = element13.html("<hi!> &lt;hi! class=\"\"&gt;&lt;/hi!&gt; </hi!>");
        org.jsoup.select.Elements elements58 = element57.parents();
        org.jsoup.nodes.Element element59 = element1.prependChild((org.jsoup.nodes.Node) element57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element60 = element1.lastElementSibling();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        java.lang.String str9 = element8.outerHtml();
        org.jsoup.nodes.Element element11 = element8.appendText("");
        org.jsoup.select.Elements elements14 = element8.getElementsByAttributeValueContaining("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>", "<hi!></hi!>");
        java.lang.String str15 = element8.cssSelector();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements19 = element17.getElementsByClass("hi!");
        org.jsoup.select.Elements elements22 = element17.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.nodes.Node node23 = element17.clearAttributes();
        org.jsoup.nodes.Element element25 = element17.addClass("");
        org.jsoup.select.Elements elements28 = element25.getElementsByAttributeValueContaining("<hi!></hi!>", "<hi!>\n hi!\n</hi!>");
        boolean boolean29 = element8.hasSameValue((java.lang.Object) "<hi!></hi!>");
        org.jsoup.select.Elements elements30 = element8.children();
        org.jsoup.select.Elements elements32 = element8.getElementsByTag("<hi!>\n <hi!></hi!>hi!\n</hi!>");
        org.jsoup.nodes.Element element35 = element8.attr("<hi! value=\"&amp;lt;hi! class=&quot;&quot;&amp;gt;&amp;lt;/hi!&amp;gt;&amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt;\">\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!>\n  hi!\n </hi!>\n</hi!>", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element37 = element35.wrap("<hi! class=\"<hi!>\n hi!\n</hi!>\"></hi!>");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.lang.String str8 = element1.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element1.lastElementSibling();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.nextElementSibling();
        org.jsoup.nodes.Attributes attributes3 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.text("");
        int int6 = element1.siblingIndex();
        org.jsoup.nodes.Element element8 = element1.text("hi!");
        java.lang.String str9 = element8.outerHtml();
        org.jsoup.nodes.Element element11 = element8.appendText("");
        org.jsoup.nodes.Node node13 = element8.removeAttr("");
        org.jsoup.nodes.Document document14 = element8.ownerDocument();
        org.jsoup.nodes.Element element15 = element8.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element15.lastElementSibling();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        java.lang.String str3 = element1.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = element1.lastElementSibling();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.nodes.Element element8 = element1.removeClass("<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueStarting("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element13 = element8.val("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
        java.lang.String str14 = element13.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element13.lastElementSibling();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
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
        org.jsoup.nodes.Element element45 = element1.clone();
        org.jsoup.nodes.Element element46 = element45.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element48 = element45.wrap("<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n <<hi!>\n hi!\n</hi!>></<hi!>\n hi!\n</hi!>>\n <hi! class=\"\"></hi!>\n</<hi!></hi!>>");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.nodes.Element element4 = element1.empty();
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueEnding("<hi!></hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element9 = element1.getElementById("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element1.lastElementSibling();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element7 = element1.toggleClass("<hi!>\n hi!\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element7.ensureChildNodes();
        org.jsoup.nodes.Element element9 = element7.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element7.lastElementSibling();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
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
        java.util.List<org.jsoup.nodes.TextNode> textNodeList19 = element15.textNodes();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        element21.setBaseUri("hi!");
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element26 = element25.nextElementSibling();
        org.jsoup.nodes.Attributes attributes27 = element25.attributes();
        org.jsoup.nodes.Element element29 = element25.text("");
        int int30 = element25.siblingIndex();
        org.jsoup.nodes.Element element32 = element25.text("hi!");
        boolean boolean33 = element25.hasParent();
        java.lang.String str34 = element25.tagName();
        org.jsoup.nodes.Element element36 = element25.text("<hi!></hi!>");
        java.lang.String str37 = element25.data();
        org.jsoup.nodes.Element element38 = element21.appendChild((org.jsoup.nodes.Node) element25);
        java.util.Set<java.lang.String> strSet39 = element25.classNames();
        org.jsoup.nodes.Element element40 = element15.classNames(strSet39);
        org.jsoup.select.Elements elements42 = element40.getElementsMatchingText("<hi! class=\"<hi!>\n hi!\n</hi!>\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element44 = element40.wrap("<hi! value=\"hi!\">\n hi!\n</hi!>");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.lang.String str2 = element1.nodeName();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList3 = element1.textNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = element1.wrap("<hi! hi!=\"<hi!></hi!>\">\n &lt;hi! value=\"hi!\"&gt; hi! &lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element1.childNodes;
        org.jsoup.nodes.Element element8 = element1.removeClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Node node9 = element8.previousSibling();
        org.jsoup.parser.Tag tag10 = element8.tag();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements15 = element13.getElementsByClass("hi!");
        org.jsoup.nodes.Element element17 = element13.html("");
        org.jsoup.nodes.Element element19 = element13.toggleClass("");
        org.jsoup.parser.Tag tag20 = element19.tag();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements25 = element23.getElementsByClass("hi!");
        org.jsoup.nodes.Element element27 = element23.html("");
        org.jsoup.nodes.Element element29 = element23.toggleClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList30 = element23.textNodes();
        org.jsoup.nodes.Attributes attributes31 = element23.attributes();
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element(tag20, "<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>", attributes31);
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag20, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element37 = element36.nextElementSibling();
        org.jsoup.nodes.Attributes attributes38 = element36.attributes();
        org.jsoup.nodes.Element element40 = element36.text("");
        int int41 = element36.siblingIndex();
        org.jsoup.nodes.Element element43 = element36.text("hi!");
        boolean boolean44 = element36.hasParent();
        java.lang.String str45 = element36.tagName();
        org.jsoup.select.Elements elements47 = element36.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.nodes.Element element49 = element36.text("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element51 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements53 = element51.getElementsByClass("hi!");
        org.jsoup.nodes.Element element55 = element51.html("");
        org.jsoup.nodes.Element element56 = element36.doClone((org.jsoup.nodes.Node) element55);
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList57 = element36.dataNodes();
        org.jsoup.nodes.Element element58 = element34.appendTo(element36);
        org.jsoup.nodes.Element element60 = element58.wrap("<hi!></hi!>");
        org.jsoup.nodes.Element element63 = element60.attr("<hi!>\n &lt;hi!&gt; &lt;hi!&gt; hi! &lt;/hi!&gt; &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; &lt;/hi!&gt;\n <<hi! =\"hi!\">\n</hi!>></<hi! =\"hi!\">\n</hi!>>\n</hi!>", true);
        org.jsoup.nodes.Attributes attributes64 = element60.attributes();
        org.jsoup.nodes.Element element65 = new org.jsoup.nodes.Element(tag10, "<hi!>\n</hi!>", attributes64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element66 = element65.lastElementSibling();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements5 = element3.getElementsByClass("hi!");
        org.jsoup.nodes.Element element7 = element3.html("");
        org.jsoup.nodes.Element element9 = element3.toggleClass("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList10 = element3.textNodes();
        org.jsoup.nodes.Attributes attributes11 = element3.attributes();
        org.jsoup.select.Elements elements13 = element3.getElementsContainingText("hi!");
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element16 = element15.nextElementSibling();
        org.jsoup.nodes.Attributes attributes17 = element15.attributes();
        org.jsoup.nodes.Element element19 = element15.text("");
        int int20 = element15.siblingIndex();
        org.jsoup.select.Elements elements21 = element15.getAllElements();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList22 = element15.textNodes();
        org.jsoup.select.Elements elements23 = element15.children();
        java.util.Set<java.lang.String> strSet24 = element15.classNames();
        org.jsoup.nodes.Element element25 = element3.classNames(strSet24);
        org.jsoup.nodes.Element element26 = element1.classNames(strSet24);
        int int27 = element26.siblingIndex();
        org.jsoup.select.Elements elements29 = element26.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements33 = element31.getElementsByClass("hi!");
        org.jsoup.select.Elements elements34 = element31.getAllElements();
        boolean boolean35 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element31);
        org.jsoup.nodes.Element element38 = element31.attr("", "hi!");
        java.lang.String str39 = element38.html();
        org.jsoup.nodes.Element element41 = element38.appendElement("<hi!></hi!>");
        org.jsoup.nodes.Element element43 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements45 = element43.getElementsByClass("hi!");
        org.jsoup.select.Elements elements46 = element43.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList47 = element43.childNodesCopy();
        java.util.Set<java.lang.String> strSet48 = element43.classNames();
        org.jsoup.nodes.Element element49 = element38.classNames(strSet48);
        org.jsoup.nodes.Element element50 = element26.classNames(strSet48);
        org.jsoup.select.Elements elements52 = element50.getElementsByAttribute("<<hi!></hi!> class=\"<hi!></hi!> \" value=\"<hi!>\n <hi!></hi!>\n</hi!>\">\n <<hi!>\n hi!\n</hi!>></<hi!>\n hi!\n</hi!>>\n <hi! class=\"\"></hi!>\n</<hi!></hi!>>");
        element50.setBaseUri("hi! hi!");
        org.jsoup.select.Elements elements55 = element50.children();
        org.jsoup.nodes.Node node56 = element50.clearAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element57 = element50.lastElementSibling();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        boolean boolean5 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements6 = element1.parents();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element1.firstElementSibling();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element6 = element5.nextElementSibling();
        org.jsoup.nodes.Attributes attributes7 = element5.attributes();
        org.jsoup.nodes.Element element9 = element5.text("");
        int int10 = element5.siblingIndex();
        org.jsoup.nodes.Element element12 = element5.text("hi!");
        boolean boolean13 = element5.hasParent();
        java.lang.String str14 = element5.tagName();
        org.jsoup.nodes.Element element16 = element5.text("<hi!></hi!>");
        java.lang.String str17 = element5.data();
        org.jsoup.nodes.Element element18 = element1.appendChild((org.jsoup.nodes.Node) element5);
        java.util.List<org.jsoup.nodes.Node> nodeList19 = element18.ensureChildNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element18.lastElementSibling();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element1.childNodesCopy();
        java.lang.String str6 = element1.outerHtml();
        org.jsoup.nodes.Element element7 = element1.shallowClone();
        org.jsoup.nodes.Element element10 = element1.attr("<hi!></hi!>", "<hi!>\n hi!\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element1.lastElementSibling();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
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
        org.jsoup.select.Elements elements26 = element1.getElementsByAttributeValueStarting("<hi! class=\"<hi! class=&quot;&quot;></hi!> <hi! class=&quot;&quot;></hi!>\">\n hi!\n</hi!>", "<hi!>\n hi!\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element1.lastElementSibling();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements4 = element1.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element1.childNodesCopy();
        org.jsoup.nodes.Element element7 = element1.removeClass("<hi! =\"hi!\">\n</hi!>");
        org.jsoup.nodes.Element element9 = element1.addClass("<hi! value=\"<hi!>\n hi!\n</hi!>\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element9.firstElementSibling();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        java.lang.String str8 = element1.html();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList9 = element1.dataNodes();
        java.lang.String str11 = element1.absUrl("hi!");
        org.jsoup.select.Elements elements13 = element1.getElementsByIndexGreaterThan((int) (byte) -1);
        org.jsoup.nodes.Node node14 = element1.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element1.wrap("<hi! class=\"<hi! class=&quot;&quot;></hi!> <hi! class=&quot;&quot;></hi!>\">\n hi!\n</hi!>");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.nodes.Element element7 = element1.toggleClass("");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element16 = element15.parent();
        org.jsoup.nodes.Node node17 = element15.parentNode();
        org.jsoup.select.Elements elements19 = element15.getElementsByIndexLessThan(1);
        element15.nodelistChanged();
        org.jsoup.select.Elements elements21 = element15.parents();
        org.jsoup.nodes.Element element23 = element15.removeClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Attributes attributes24 = element15.attributes();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag8, "", attributes24);
        java.lang.String str26 = element25.data();
        int int27 = element25.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element25.firstElementSibling();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element46 = element1.lastElementSibling();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
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
        org.jsoup.select.Elements elements49 = element10.getElementsMatchingOwnText("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;");
        org.jsoup.select.Elements elements50 = element10.siblingElements();
        org.jsoup.nodes.Element element51 = element10.shallowClone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element52 = element51.firstElementSibling();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi! value=\"<hi!>\n hi!\n</hi!>\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = element1.wrap("<&lt;hi!&gt;&lt;/hi!&gt;></&lt;hi!&gt;&lt;/hi!&gt;>");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.select.Elements elements9 = element1.getElementsByAttributeValueMatching("", "<hi!></hi!>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        element11.setBaseUri("hi!");
        org.jsoup.nodes.Element element14 = element11.empty();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements18 = element16.getElementsByClass("hi!");
        org.jsoup.select.Elements elements19 = element16.getAllElements();
        boolean boolean20 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element16);
        org.jsoup.nodes.Element element23 = element16.attr("", "hi!");
        java.lang.String str24 = element23.html();
        org.jsoup.nodes.Element element26 = element23.appendElement("<hi!></hi!>");
        java.lang.String[] strArray30 = new java.lang.String[] { "<hi!></hi!>", "", "<hi!></hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        org.jsoup.nodes.Element element33 = element26.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element34 = element14.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element35 = element1.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element37 = element1.prependElement("<hi! class=\"<hi! class=&quot;&quot;></hi!> <hi! class=&quot;&quot;></hi!>\">\n hi!\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element38 = element1.firstElementSibling();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
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
        boolean boolean44 = element43.isBlock();
        java.lang.String str45 = element43.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element46 = element43.lastElementSibling();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
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
        org.jsoup.nodes.Element element16 = element1.addClass("<hi! value=\"hi!\">\n hi!\n</hi!>");
        java.lang.String str17 = element1.nodeName();
        org.jsoup.select.Elements elements19 = element1.getElementsMatchingOwnText("<&lt;hi!&gt;&lt;/hi!&gt;></&lt;hi!&gt;&lt;/hi!&gt;>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element1.wrap("<hi!>\n &lt;hi! class=\"\"&gt;&lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
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
        org.jsoup.nodes.Element element52 = element50.prepend("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element53 = element50.previousElementSibling();
        boolean boolean54 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element55 = element50.firstElementSibling();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Node node3 = element1.parentNode();
        org.jsoup.select.Elements elements5 = element1.getElementsByIndexLessThan(1);
        boolean boolean6 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.nodes.Document document7 = element1.ownerDocument();
        org.jsoup.nodes.Node node8 = element1.parentNode();
        org.jsoup.nodes.Attributes attributes9 = element1.attributes();
        org.jsoup.nodes.Element element11 = element1.tagName("<hi! class=\"\">\n <hi! class=\"\"></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element1.firstElementSibling();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element1.childNodes;
        org.jsoup.select.Elements elements9 = element1.getElementsByClass("<hi! value=\"hi!\">\n hi!\n</hi!>");
        org.jsoup.select.Elements elements10 = element1.getAllElements();
        boolean boolean11 = element1.hasAttributes();
        org.jsoup.nodes.Element element13 = element1.addClass("<hi! value=\"<hi!>\n hi!\n</hi!>\"></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element13.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element13.wrap("<hi! value=\"<hi!>\n <hi!></hi!>hi!\n</hi!>\"></hi!>");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        org.jsoup.select.Elements elements6 = element1.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element1.wrap("<hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!>\n  hi!\n </hi!>\n</hi!>");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
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
        org.jsoup.nodes.Element element25 = element7.attr("", true);
        org.jsoup.select.Elements elements26 = element7.parents();
        java.lang.String str27 = element7.ownText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element7.firstElementSibling();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.setBaseUri("hi!");
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element6 = element5.nextElementSibling();
        org.jsoup.nodes.Attributes attributes7 = element5.attributes();
        org.jsoup.nodes.Element element9 = element5.text("");
        int int10 = element5.siblingIndex();
        org.jsoup.nodes.Element element12 = element5.text("hi!");
        boolean boolean13 = element5.hasParent();
        java.lang.String str14 = element5.tagName();
        org.jsoup.nodes.Element element16 = element5.text("<hi!></hi!>");
        java.lang.String str17 = element5.data();
        org.jsoup.nodes.Element element18 = element1.appendChild((org.jsoup.nodes.Node) element5);
        org.jsoup.nodes.Element element21 = element1.attr("<&lt;hi!&gt;&lt;/hi!&gt;></&lt;hi!&gt;&lt;/hi!&gt;>", true);
        java.lang.String str23 = element21.attr("<hi! hi!=\"<hi!></hi!>\">\n &lt;hi! value=\"hi!\"&gt; hi! &lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element25 = element21.appendText("<hi! value=\"<hi!>\n hi!\n</hi!>\"></hi!>");
        org.jsoup.nodes.Element element27 = element25.prependText("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element25.lastElementSibling();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element5 = element1.html("");
        java.lang.String str6 = element5.val();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element8.childNodes();
        org.jsoup.nodes.Element element10 = element5.appendTo(element8);
        boolean boolean11 = element8.hasParent();
        org.jsoup.nodes.Element element12 = element8.clone();
        org.jsoup.nodes.Element element14 = element12.addClass("<hi! hi!=\"<hi!></hi!>\"></hi!>");
        java.lang.String str15 = element12.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element12.firstElementSibling();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
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
        org.jsoup.nodes.Element element26 = element24.text("");
        org.jsoup.select.Elements elements28 = element26.getElementsContainingOwnText("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;&lt;hi!&gt;&lt;/hi!&gt;");
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element("hi!");
        element30.setBaseUri("hi!");
        org.jsoup.select.Elements elements34 = element30.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element38 = element37.nextElementSibling();
        boolean boolean39 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element37);
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element42 = element41.parent();
        org.jsoup.nodes.Node node43 = element41.parentNode();
        org.jsoup.select.Elements elements45 = element41.getElementsByIndexLessThan(1);
        boolean boolean46 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element41);
        org.jsoup.select.Elements elements47 = element41.children();
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements51 = element49.getElementsByClass("hi!");
        org.jsoup.nodes.Element element53 = element49.html("");
        org.jsoup.nodes.Element element54 = element53.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList55 = element53.siblingNodes();
        org.jsoup.nodes.Element element57 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element58 = element57.parent();
        org.jsoup.nodes.Node node59 = element57.parentNode();
        org.jsoup.select.Elements elements61 = element57.getElementsByIndexLessThan(1);
        org.jsoup.nodes.Element element63 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element64 = element63.nextElementSibling();
        org.jsoup.nodes.Attributes attributes65 = element63.attributes();
        org.jsoup.nodes.Element element67 = element63.text("");
        int int68 = element63.siblingIndex();
        org.jsoup.nodes.Element element70 = element63.text("hi!");
        boolean boolean71 = element63.hasParent();
        java.lang.String str72 = element63.tagName();
        org.jsoup.nodes.Node[] nodeArray73 = new org.jsoup.nodes.Node[] { element37, element41, element53, element57, element63 };
        org.jsoup.nodes.Element element74 = element30.insertChildren((int) (short) 0, nodeArray73);
        int int75 = element30.siblingIndex();
        org.jsoup.select.Elements elements76 = element30.getAllElements();
        org.jsoup.nodes.Element element77 = element26.appendChild((org.jsoup.nodes.Node) element30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element78 = element26.firstElementSibling();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element50 = element1.wrap("<hi! hi!=\"<hi!></hi!>\">\n hi!\n</hi!>");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element22.firstElementSibling();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.parent();
        org.jsoup.nodes.Element element5 = element1.attr("<hi!></hi!>", true);
        org.jsoup.parser.Tag tag6 = element1.tag();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.nextElementSibling();
        org.jsoup.nodes.Attributes attributes11 = element9.attributes();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag6, "<hi! hi!=\"<hi!></hi!>\">\n &lt;hi! value=\"hi!\"&gt; hi! &lt;/hi!&gt;\n</hi!>", attributes11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element12.wrap("<hi! value=\"<hi!>\n hi!\n</hi!>\"></hi!>");
    }
}

