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
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = document1.firstElementSibling();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("hi!");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element5.wrap("hi!");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.html("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexEquals((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element4.lastElementSibling();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.text("hi!");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        java.lang.String str6 = document1.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document1.text("#document");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList3 = document1.textNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document1.firstElementSibling();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element7 = document1.appendElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.firstElementSibling();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        java.lang.String str13 = document1.outerHtml();
        org.jsoup.nodes.Document document14 = document1.normalise();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document16.textNodes();
        org.jsoup.nodes.Element element19 = document16.prependElement("hi!");
        org.jsoup.nodes.Element element20 = document14.prependChild((org.jsoup.nodes.Node) element19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = document14.wrap("hi!");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document.QuirksMode quirksMode13 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document14 = document5.quirksMode(quirksMode13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document14.text("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        java.lang.Integer int11 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document12 = document1.clone();
        java.lang.String str13 = document1.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = document1.lastElementSibling();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.text("<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        java.lang.String str6 = element5.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element5.wrap("<#root>");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueStarting("<#root></#root>", "<#root></#root>");
        org.jsoup.nodes.Element element10 = document1.append("<#root></#root>");
        boolean boolean11 = element10.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element10.lastElementSibling();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        java.lang.String str6 = element3.toString();
        java.lang.String str7 = element3.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element3.firstElementSibling();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element13 = document5.head();
        java.lang.String str14 = document5.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document5.title("hi!");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        java.lang.String str5 = element4.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element4.firstElementSibling();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element5 = document1.head();
        int int6 = document1.siblingIndex();
        java.lang.String str7 = document1.text();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot("<hi!></hi!>", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.text("<hi!></hi!>");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.select.Elements elements13 = element12.parents();
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements18 = document15.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        org.jsoup.nodes.Element element23 = document15.classNames((java.util.Set<java.lang.String>) strSet21);
        org.jsoup.nodes.Document document24 = document15.clone();
        java.lang.String str25 = document15.outerHtml();
        java.lang.String str27 = document15.attr("");
        org.jsoup.select.Elements elements28 = document15.getAllElements();
        org.jsoup.nodes.Element element29 = element12.prependChild((org.jsoup.nodes.Node) document15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = element29.firstElementSibling();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        java.lang.Integer int11 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document12 = document1.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        java.lang.String str6 = element3.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element3.firstElementSibling();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        java.lang.String str6 = element5.val();
        java.lang.String str7 = element5.toString();
        org.jsoup.nodes.Element element9 = element5.append("#document");
        java.lang.String str10 = element5.data();
        java.lang.String str11 = element5.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element5.firstElementSibling();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element5.lastElementSibling();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Document document10 = document1.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document10.title("&lt;#root&gt;\n<!--#root-->&lt;#root&gt;\n<!--#root-->");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.nodes.Document document6 = document1.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.lastElementSibling();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        org.jsoup.parser.Tag tag9 = document8.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document8.firstElementSibling();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document1.childNodes();
        org.jsoup.nodes.Element element10 = document1.previousElementSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.text("");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document1.wrap("<#root>");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.nodes.Document document6 = document1.ownerDocument();
        org.jsoup.select.Elements elements7 = document1.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.text("<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        java.lang.String str13 = document1.outerHtml();
        org.jsoup.nodes.Document document14 = document1.normalise();
        org.jsoup.select.Elements elements16 = document1.getElementsByAttribute("<html>\n <head></head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document1.lastElementSibling();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = document1.getElementById("hi!");
        org.jsoup.nodes.Element element14 = document1.attr("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        java.lang.String str15 = document1.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document1.wrap("<#root class=\"hi!\"></#root>\n<#root></#root>");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = document1.firstElementSibling();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element13 = document5.head();
        java.lang.String str14 = document5.title();
        org.jsoup.nodes.Element element16 = document5.html("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document5.title("#root");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element8 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        int int11 = document1.siblingIndex();
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList14 = document13.textNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = document13.outputSettings();
        org.jsoup.nodes.Document document16 = document1.outputSettings(outputSettings15);
        org.jsoup.nodes.Element element18 = document1.createElement("<#root></#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element18.wrap("<#root></#root>");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = document1.dataset();
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueEnding("<hi!></hi!>", "#document");
        org.jsoup.nodes.Document.QuirksMode quirksMode13 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document14 = document1.quirksMode(quirksMode13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<#root></#root>");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList3 = document1.textNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = document1.outputSettings();
        org.jsoup.nodes.Element element6 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.lastElementSibling();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueStarting("<#root></#root>", "<#root></#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("#document");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.lang.String str3 = document1.nodeName();
        boolean boolean5 = document1.hasClass("<#root></#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Document document10 = document1.clone();
        java.lang.String str11 = document1.ownText();
        java.lang.String str12 = document1.title();
        org.jsoup.select.Elements elements14 = document1.getElementsContainingText("<hi!></hi!>");
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = document1.outputSettings();
        org.jsoup.nodes.Document document16 = document1.normalise();
        org.jsoup.nodes.Document document17 = document16.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = document17.wrap("<#root><#root>");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Document document10 = document1.clone();
        org.jsoup.nodes.Document document11 = document10.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document11.firstElementSibling();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        java.lang.String str6 = document1.tagName();
        org.jsoup.nodes.Element element8 = document1.addClass("<#root></#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>></<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>>");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Element element7 = element4.appendElement("<hi!></hi!>");
        java.lang.String str8 = element4.data();
        org.jsoup.select.Elements elements10 = element4.getElementsMatchingText("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element4.wrap(" hi!");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element14 = document1.prependElement("<#root></#root>");
        org.jsoup.select.Elements elements16 = document1.getElementsContainingOwnText("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document1.firstElementSibling();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        java.lang.String str6 = element5.val();
        java.lang.String str7 = element5.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element5.wrap("<#root></#root>\n<hi!></hi!>");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        java.lang.String str5 = document1.val();
        org.jsoup.nodes.Element element8 = document1.attr("<hi!></hi!>", "<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.wrap("<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element8 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        int int11 = document1.siblingIndex();
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList14 = document13.textNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = document13.outputSettings();
        org.jsoup.nodes.Document document16 = document1.outputSettings(outputSettings15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = document16.wrap("<#root></#root>\n<hi!></hi!>");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element8 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        int int11 = document1.siblingIndex();
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList14 = document13.textNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = document13.outputSettings();
        org.jsoup.nodes.Document document16 = document1.outputSettings(outputSettings15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = document16.wrap("<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = document1.getElementById("hi!");
        org.jsoup.nodes.Element element14 = document1.attr("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        java.lang.String str15 = document1.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document1.lastElementSibling();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.select.Elements elements13 = element12.parents();
        java.lang.String str14 = element12.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element12.firstElementSibling();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        org.jsoup.select.Elements elements10 = document1.getElementsByIndexEquals(10);
        boolean boolean11 = document1.hasText();
        org.jsoup.select.Elements elements13 = document1.getElementsByTag("<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = document1.lastElementSibling();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Document document10 = document1.clone();
        java.lang.String str11 = document1.ownText();
        java.lang.String str12 = document1.title();
        org.jsoup.select.Elements elements14 = document1.getElementsContainingText("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = document1.lastElementSibling();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element2 = document1.head();
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList5 = document4.textNodes();
        org.jsoup.nodes.Element element7 = document4.prependElement("hi!");
        java.lang.String str8 = element7.baseUri();
        org.jsoup.nodes.Element element10 = element7.toggleClass("hi!");
        org.jsoup.nodes.Element element12 = element10.prependText("");
        java.lang.Integer int13 = element12.elementSiblingIndex();
        org.jsoup.nodes.Element element14 = document1.prependChild((org.jsoup.nodes.Node) element12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document1.text("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document.QuirksMode quirksMode13 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document14 = document5.quirksMode(quirksMode13);
        org.jsoup.select.Elements elements16 = document5.getElementsByAttributeStarting("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document5.title("");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element7 = document1.appendElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot("&lt;#root&gt;\n<!--#root-->&lt;#root&gt;\n<!--#root-->", "<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element12 = document1.getElementById("<hi!>\n #root\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document1.firstElementSibling();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element7 = document1.appendElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = document8.dataset();
        org.jsoup.select.Elements elements10 = document8.children();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings11.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings11.indentAmount((int) (byte) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.prettyPrint(true);
        org.jsoup.nodes.Document document17 = document8.outputSettings(outputSettings14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = document8.wrap("&lt;#root&gt;\n<!--#root-->");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Element element7 = element4.appendElement("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element4.tagName(" hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element4.wrap("hi!");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element7 = document1.append("");
        org.jsoup.select.Elements elements9 = document1.getElementsByTag("hi!");
        java.lang.String str10 = document1.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.lastElementSibling();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = document1.dataset();
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueEnding("<hi!></hi!>", "#document");
        org.jsoup.nodes.Element element14 = document1.createElement("#document");
        org.jsoup.select.Elements elements16 = element14.getElementsByIndexEquals((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element14.firstElementSibling();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Node node14 = document1.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document1.text("<<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>></<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>>");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document document6 = document5.normalise();
        java.lang.String str7 = document5.data();
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("hi!");
        boolean boolean10 = document5.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Document.QuirksMode quirksMode11 = org.jsoup.nodes.Document.QuirksMode.limitedQuirks;
        org.jsoup.nodes.Document document12 = document5.quirksMode(quirksMode11);
        org.jsoup.nodes.Element element13 = document12.empty();
        boolean boolean15 = document12.hasAttr("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document12.firstElementSibling();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document7.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList9 = document7.dataNodes();
        java.lang.String str11 = document7.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode12 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document13 = document7.quirksMode(quirksMode12);
        org.jsoup.nodes.Document document14 = document5.quirksMode(quirksMode12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = document5.firstElementSibling();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueStarting("<#root></#root>", "<#root></#root>");
        org.jsoup.nodes.Element element10 = document1.append("<#root></#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element10.firstElementSibling();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        org.jsoup.select.Elements elements10 = document1.getElementsByIndexEquals(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.text("<hi!></hi!>\n<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = document1.dataset();
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueEnding("<hi!></hi!>", "#document");
        java.lang.String str13 = document1.title();
        org.jsoup.nodes.Document document14 = document1.clone();
        document1.setBaseUri("<#root><#root>");
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings17.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings19.escapeMode();
        java.nio.charset.Charset charset21 = outputSettings19.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings18.charset(charset21);
        boolean boolean23 = outputSettings22.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings22.indentAmount((int) (byte) 0);
        org.jsoup.nodes.Document document26 = document1.outputSettings(outputSettings22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = document26.text(" hi!");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document4 = document1.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document4.lastElementSibling();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = document1.dataset();
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueEnding("<hi!></hi!>", "#document");
        java.lang.String str13 = document1.title();
        org.jsoup.nodes.Document document14 = document1.clone();
        org.jsoup.nodes.Attributes attributes15 = document14.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document14.text("<hi!></hi!>");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexLessThan(0);
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValue("#root", "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document1.firstElementSibling();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element13 = document5.head();
        java.lang.String str14 = document5.title();
        org.jsoup.nodes.Element element16 = document5.html("#document");
        java.util.Set<java.lang.String> strSet17 = document5.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = document5.text("<<#root></#root>></<#root></#root>>\n<#root></#root>\n<#document></#document>");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Element element7 = element4.appendElement("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element4.tagName(" hi!");
        int int10 = element4.siblingIndex();
        org.jsoup.nodes.Element element12 = element4.html("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element4.addClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element4.firstElementSibling();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        java.lang.String str13 = document1.outerHtml();
        org.jsoup.nodes.Document document14 = document1.normalise();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings15.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings15.indentAmount((int) (byte) 100);
        org.jsoup.nodes.Document document19 = document1.outputSettings(outputSettings18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = document1.lastElementSibling();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.html("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.nodes.Node node7 = element4.previousSibling();
        org.jsoup.select.Elements elements9 = element4.getElementsContainingText("<hi!></hi!>");
        org.jsoup.select.Elements elements11 = element4.getElementsByTag("&lt;#root&gt;\n<!--#root-->&lt;#root&gt;\n<!--#root-->");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element4.firstElementSibling();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        java.lang.String str9 = document1.toString();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings10.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings11.escapeMode();
        org.jsoup.nodes.Document document13 = document1.outputSettings(outputSettings11);
        org.jsoup.nodes.Node node14 = document1.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = document1.lastElementSibling();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Node node7 = document1.removeAttr("hi!");
        org.jsoup.select.Elements elements8 = document1.getAllElements();
        org.jsoup.nodes.Element element9 = document1.previousElementSibling();
        document1.setBaseUri("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document12 = document1.clone();
        java.lang.String str13 = document12.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = document12.text("#document");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document7.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList9 = document7.dataNodes();
        java.lang.String str11 = document7.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode12 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document13 = document7.quirksMode(quirksMode12);
        org.jsoup.nodes.Document document14 = document5.quirksMode(quirksMode12);
        java.util.Set<java.lang.String> strSet15 = document14.classNames();
        org.jsoup.nodes.Element element17 = document14.val("");
        org.jsoup.nodes.Document document18 = element17.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = document18.firstElementSibling();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.nodes.Document document6 = document1.ownerDocument();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings7.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings9.escapeMode();
        int int11 = outputSettings9.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings9.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings8.escapeMode(escapeMode12);
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements18 = document15.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean19 = document15.hasText();
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element22 = document15.prependChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings23.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings24.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings24.clone();
        org.jsoup.nodes.Document document27 = document15.outputSettings(outputSettings26);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings28.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings30.escapeMode();
        int int32 = outputSettings30.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings30.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings29.escapeMode(escapeMode33);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings26.escapeMode(escapeMode33);
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings13.escapeMode(escapeMode33);
        boolean boolean37 = document1.equals((java.lang.Object) outputSettings13);
        org.jsoup.select.Elements elements39 = document1.getElementsMatchingText("<#root class=\"hi!\"></#root>\n<#root></#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element41 = document1.text("<#root>");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.nodes.Document document6 = document1.ownerDocument();
        org.jsoup.nodes.Node node8 = document6.removeAttr("<#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document6.title("");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueStarting("<#root></#root>", "<#root></#root>");
        java.lang.String str9 = document1.data();
        org.jsoup.nodes.Document.QuirksMode quirksMode10 = org.jsoup.nodes.Document.QuirksMode.limitedQuirks;
        org.jsoup.nodes.Document document11 = document1.quirksMode(quirksMode10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document1.text("hi!#document");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document document6 = document5.normalise();
        java.lang.String str7 = document5.data();
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("hi!");
        boolean boolean10 = document5.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Document.QuirksMode quirksMode11 = org.jsoup.nodes.Document.QuirksMode.limitedQuirks;
        org.jsoup.nodes.Document document12 = document5.quirksMode(quirksMode11);
        org.jsoup.nodes.Element element13 = document12.empty();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document12.siblingNodes();
        java.lang.String str15 = document12.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document12.title(" hi!#document");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element2 = document1.parent();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("&lt;#root&gt;\n<!--#root-->");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        java.lang.Integer int11 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document12 = document1.clone();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements17 = document14.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean18 = document14.hasText();
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element21 = document14.prependChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings22.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings23.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.clone();
        org.jsoup.nodes.Document document26 = document14.outputSettings(outputSettings25);
        org.jsoup.select.Elements elements28 = document26.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements33 = document30.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element34 = document30.head();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = document30.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings35.clone();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements41 = document38.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean42 = document38.hasText();
        org.jsoup.nodes.Document document44 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element45 = document38.prependChild((org.jsoup.nodes.Node) document44);
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings46.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = outputSettings47.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings47.clone();
        org.jsoup.nodes.Document document50 = document38.outputSettings(outputSettings49);
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings51.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = outputSettings53.escapeMode();
        int int55 = outputSettings53.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings53.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings52.escapeMode(escapeMode56);
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings49.escapeMode(escapeMode56);
        java.nio.charset.CharsetEncoder charsetEncoder59 = outputSettings49.encoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode60 = outputSettings49.escapeMode();
        java.nio.charset.Charset charset61 = outputSettings49.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings36.charset(charset61);
        org.jsoup.nodes.Document document63 = document26.outputSettings(outputSettings36);
        org.jsoup.nodes.Document document64 = document12.outputSettings(outputSettings36);
        java.util.List<org.jsoup.nodes.Node> nodeList65 = document64.siblingNodes();
        java.lang.String str66 = document64.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element68 = document64.text("<hi!></hi!>\n<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.html("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeStarting("hi!");
        boolean boolean10 = element4.hasAttr("#document");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements13 = document12.parents();
        org.jsoup.nodes.Document document14 = document12.clone();
        org.jsoup.nodes.Element element15 = element4.appendChild((org.jsoup.nodes.Node) document14);
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element15.childNodes();
        org.jsoup.select.Elements elements17 = element15.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element15.firstElementSibling();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean6 = document1.hasClass("");
        org.jsoup.nodes.Element element8 = document1.appendElement("<#root></#root>");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        java.lang.String str10 = document1.className();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings11.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode();
        java.nio.charset.Charset charset15 = outputSettings13.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings12.charset(charset15);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings16.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings18.escapeMode();
        java.nio.charset.Charset charset20 = outputSettings18.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings18.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings22.escapeMode();
        int int24 = outputSettings22.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings22.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings18.escapeMode(escapeMode25);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings17.escapeMode(escapeMode25);
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("");
        boolean boolean30 = document29.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList31 = document29.dataNodes();
        java.lang.String str33 = document29.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode34 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document35 = document29.quirksMode(quirksMode34);
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = document29.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings37.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = outputSettings39.escapeMode();
        java.nio.charset.Charset charset41 = outputSettings39.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings38.charset(charset41);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings36.charset(charset41);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings27.charset(charset41);
        org.jsoup.nodes.Document document45 = document1.outputSettings(outputSettings44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title(" hi!");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document document6 = document5.normalise();
        org.jsoup.nodes.Element element7 = document6.parent();
        org.jsoup.nodes.Node node9 = document6.removeAttr("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document6.lastElementSibling();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = document1.dataset();
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueEnding("<hi!></hi!>", "#document");
        org.jsoup.nodes.Element element14 = document1.createElement("#document");
        org.jsoup.select.Elements elements16 = document1.getElementsContainingText("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = document1.text("<<hi!></hi!>></<hi!></hi!>>");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        java.lang.String str6 = document1.tagName();
        org.jsoup.nodes.Element element8 = document1.addClass("<#root></#root>");
        org.jsoup.nodes.Element element10 = document1.addClass("<#root>");
        org.jsoup.nodes.Document document11 = document1.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document11.lastElementSibling();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        java.lang.String str13 = document1.outerHtml();
        org.jsoup.nodes.Document document14 = document1.normalise();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document16.textNodes();
        org.jsoup.nodes.Element element19 = document16.prependElement("hi!");
        org.jsoup.nodes.Element element20 = document14.prependChild((org.jsoup.nodes.Node) element19);
        boolean boolean21 = document14.hasText();
        org.jsoup.nodes.Element element23 = document14.appendText("<#root></#root>");
        java.util.Set<java.lang.String> strSet24 = document14.classNames();
        org.jsoup.select.Elements elements26 = document14.getElementsByIndexEquals((int) ' ');
        java.lang.String str27 = document14.data();
        java.lang.String str28 = document14.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = document14.lastElementSibling();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document document6 = document5.normalise();
        boolean boolean7 = document5.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document5.firstElementSibling();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttributeStarting("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.select.Elements elements4 = document1.children();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements9 = document6.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean10 = document6.hasText();
        org.jsoup.nodes.Element element12 = document6.append("");
        org.jsoup.select.Elements elements13 = document6.siblingElements();
        org.jsoup.nodes.Document document14 = document6.clone();
        java.lang.String str15 = document14.outerHtml();
        org.jsoup.nodes.Element element16 = document1.appendChild((org.jsoup.nodes.Node) document14);
        java.lang.String str17 = element16.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element16.lastElementSibling();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        java.util.Set<java.lang.String> strSet3 = document1.classNames();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.prependText("#document");
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = document1.outputSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document1.lastElementSibling();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Document document10 = document1.clone();
        org.jsoup.nodes.Document document11 = document10.normalise();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = document11.siblingNodes();
        org.jsoup.nodes.Element element13 = document11.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element13.wrap("<html>\n <head></head>\n <body></body>\n</html>&lt;#root&gt;");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        java.lang.String str5 = element4.baseUri();
        org.jsoup.nodes.Element element7 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element7.prependText("");
        boolean boolean11 = element9.hasAttr("hi!");
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        boolean boolean14 = document13.isBlock();
        org.jsoup.nodes.Element element16 = document13.toggleClass("hi!");
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element19 = document13.appendChild((org.jsoup.nodes.Node) document18);
        int int20 = element19.siblingIndex();
        boolean boolean21 = element19.isBlock();
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements26 = document23.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean27 = document23.hasText();
        org.jsoup.nodes.Document document29 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element30 = document23.prependChild((org.jsoup.nodes.Node) document29);
        org.jsoup.select.Elements elements33 = document29.getElementsByAttributeValueStarting("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root></#root>");
        org.jsoup.nodes.Element element35 = document29.before("#root");
        org.jsoup.nodes.Document document37 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList38 = document37.textNodes();
        org.jsoup.select.Elements elements39 = document37.getAllElements();
        org.jsoup.nodes.Document document41 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements44 = document41.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean45 = document41.hasText();
        org.jsoup.nodes.Element element47 = document41.append("");
        org.jsoup.nodes.Element element48 = document37.appendChild((org.jsoup.nodes.Node) document41);
        org.jsoup.nodes.Node node50 = document37.removeAttr("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = outputSettings51.escapeMode();
        java.nio.charset.Charset charset53 = outputSettings51.charset();
        org.jsoup.nodes.Document document54 = document37.outputSettings(outputSettings51);
        boolean boolean55 = element35.equals((java.lang.Object) outputSettings51);
        org.jsoup.nodes.Element element56 = element35.lastElementSibling();
        org.jsoup.nodes.Element element58 = element35.before("#document");
        org.jsoup.nodes.Element element59 = element19.appendChild((org.jsoup.nodes.Node) element35);
        element9.replaceWith((org.jsoup.nodes.Node) element19);
        org.jsoup.nodes.Element element62 = element9.getElementById("<#root class=\"hi!\"></#root>\n<#root></#root>");
        boolean boolean63 = element9.isBlock();
        org.jsoup.nodes.Element element64 = element9.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element65 = element9.lastElementSibling();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        java.lang.String str6 = element5.val();
        java.lang.String str7 = element5.toString();
        org.jsoup.nodes.Element element9 = element5.append("#document");
        org.jsoup.nodes.Element element11 = element5.tagName("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements13 = element11.getElementsByTag("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element11.wrap("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document document6 = document5.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document5.firstElementSibling();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element8 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements13 = document10.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean14 = document10.hasText();
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element17 = document10.prependChild((org.jsoup.nodes.Node) document16);
        org.jsoup.nodes.Element element18 = document1.appendChild((org.jsoup.nodes.Node) document16);
        org.jsoup.select.Elements elements20 = document1.getElementsContainingOwnText("&lt;#root&gt;\n<!--#root-->&lt;#root&gt;\n<!--#root-->");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = document1.wrap("<<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>></<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>>");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Document document10 = document1.clone();
        java.lang.String str11 = document1.ownText();
        org.jsoup.nodes.Document document12 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = document12.wrap("<hi!></hi!>\n<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>&lt;#root&gt;&lt;/#root&gt;");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        java.lang.Integer int11 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document12 = document1.clone();
        org.jsoup.nodes.Document document13 = document12.ownerDocument();
        org.jsoup.nodes.Element element15 = document13.prepend("");
        org.jsoup.nodes.Element element17 = element15.tagName("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element15.wrap("&lt;#root&gt;     \n<!--#root-->");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.select.Elements elements13 = element12.parents();
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements18 = document15.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        org.jsoup.nodes.Element element23 = document15.classNames((java.util.Set<java.lang.String>) strSet21);
        org.jsoup.nodes.Document document24 = document15.clone();
        java.lang.String str25 = document15.outerHtml();
        java.lang.String str27 = document15.attr("");
        org.jsoup.select.Elements elements28 = document15.getAllElements();
        org.jsoup.nodes.Element element29 = element12.prependChild((org.jsoup.nodes.Node) document15);
        org.jsoup.nodes.Element element31 = element12.toggleClass("<#root></#root>");
        org.jsoup.nodes.Element element33 = element12.prepend("<#root class=\"hi!\"></#root>\n<#root></#root>");
        org.jsoup.nodes.Document document35 = new org.jsoup.nodes.Document("");
        boolean boolean36 = document35.isBlock();
        org.jsoup.nodes.Element element38 = document35.toggleClass("hi!");
        org.jsoup.nodes.Document document40 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element41 = document35.appendChild((org.jsoup.nodes.Node) document40);
        int int42 = element41.siblingIndex();
        org.jsoup.nodes.Element element44 = element41.toggleClass("<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element45 = element12.prependChild((org.jsoup.nodes.Node) element44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element46 = element12.lastElementSibling();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        java.util.Set<java.lang.String> strSet3 = document1.classNames();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings4.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings4.indentAmount((int) (byte) 100);
        org.jsoup.nodes.Document document8 = document1.outputSettings(outputSettings7);
        org.jsoup.nodes.Document document9 = document1.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document9.lastElementSibling();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        java.lang.String str9 = document1.toString();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings10.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings11.escapeMode();
        org.jsoup.nodes.Document document13 = document1.outputSettings(outputSettings11);
        java.lang.String str14 = document1.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document1.text("&lt;#root&gt;\n<!--#root--> \n<hi!></hi!>");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        java.util.Set<java.lang.String> strSet3 = document1.classNames();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.prependText("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = document1.dataset();
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueEnding("<hi!></hi!>", "#document");
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = document1.outputSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<hi!></hi!>");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttributeStarting("<#root></#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.text("#document");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element7 = document1.appendElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings11.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode();
        java.nio.charset.Charset charset15 = outputSettings13.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings12.charset(charset15);
        boolean boolean17 = outputSettings16.prettyPrint();
        org.jsoup.nodes.Document document18 = document1.outputSettings(outputSettings16);
        org.jsoup.nodes.Document document19 = document18.ownerDocument();
        java.lang.String str20 = document19.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = document19.lastElementSibling();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Document document10 = document1.clone();
        org.jsoup.nodes.Document document11 = document10.normalise();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = document11.siblingNodes();
        org.jsoup.nodes.Document document13 = document11.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = document13.firstElementSibling();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        org.jsoup.parser.Tag tag9 = document8.tag();
        java.lang.String str10 = document8.ownText();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = document8.outputSettings();
        org.jsoup.select.Elements elements14 = document8.getElementsByAttributeValueContaining("<hi!></hi!>", "<html>\n <head></head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document8.wrap("<<#root></#root>></<#root></#root>>\n<#root></#root>\n<#document></#document>");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document6);
        int int8 = element7.siblingIndex();
        boolean boolean9 = element7.isBlock();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements14 = document11.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean15 = document11.hasText();
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element18 = document11.prependChild((org.jsoup.nodes.Node) document17);
        org.jsoup.select.Elements elements21 = document17.getElementsByAttributeValueStarting("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root></#root>");
        org.jsoup.nodes.Element element23 = document17.before("#root");
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList26 = document25.textNodes();
        org.jsoup.select.Elements elements27 = document25.getAllElements();
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements32 = document29.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean33 = document29.hasText();
        org.jsoup.nodes.Element element35 = document29.append("");
        org.jsoup.nodes.Element element36 = document25.appendChild((org.jsoup.nodes.Node) document29);
        org.jsoup.nodes.Node node38 = document25.removeAttr("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = outputSettings39.escapeMode();
        java.nio.charset.Charset charset41 = outputSettings39.charset();
        org.jsoup.nodes.Document document42 = document25.outputSettings(outputSettings39);
        boolean boolean43 = element23.equals((java.lang.Object) outputSettings39);
        org.jsoup.nodes.Element element44 = element23.lastElementSibling();
        org.jsoup.nodes.Element element46 = element23.before("#document");
        org.jsoup.nodes.Element element47 = element7.appendChild((org.jsoup.nodes.Node) element23);
        org.jsoup.nodes.Document document49 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements52 = document49.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element53 = document49.head();
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = document49.outputSettings();
        org.jsoup.nodes.Element element55 = element23.before((org.jsoup.nodes.Node) document49);
        java.lang.String str56 = document49.text();
        org.jsoup.nodes.Document document57 = document49.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element59 = document57.text("<<hi!></hi!>></<hi!></hi!>>\n<#root></#root>");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexEquals((int) (short) 10);
        org.jsoup.select.Elements elements11 = document1.getElementsContainingText("hi!#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<hi!></hi!>\n<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>&lt;#root&gt;&lt;/#root&gt;");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        java.lang.Integer int11 = document1.elementSiblingIndex();
        document1.setBaseUri("<hi!></hi!>\n<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>&lt;#root&gt;&lt;/#root&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = document1.wrap("<hi!>\n #root\n</hi!>");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element8 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings9.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings10.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings10.clone();
        org.jsoup.nodes.Document document13 = document1.outputSettings(outputSettings12);
        org.jsoup.select.Elements elements15 = document13.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document16 = document13.ownerDocument();
        java.lang.String str17 = document16.toString();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements22 = document19.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element23 = document19.head();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = document19.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings24.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings24.prettyPrint(false);
        org.jsoup.nodes.Document document28 = document16.outputSettings(outputSettings27);
        java.lang.String str29 = document16.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = document16.lastElementSibling();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        org.jsoup.nodes.Element element7 = element5.val("<#root>");
        int int8 = element5.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element5.lastElementSibling();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element8 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings9.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings10.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings10.clone();
        org.jsoup.nodes.Document document13 = document1.outputSettings(outputSettings12);
        org.jsoup.parser.Tag tag14 = document1.tag();
        org.jsoup.select.Elements elements17 = document1.getElementsByAttributeValue("hi!", "#root");
        org.jsoup.select.Elements elements20 = document1.getElementsByAttributeValueEnding("<#root class=\"hi!\"></#root>\n<#root></#root>", "<hi!></hi!>");
        boolean boolean22 = document1.hasClass("#root");
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        boolean boolean25 = document24.isBlock();
        org.jsoup.nodes.Element element27 = document24.toggleClass("hi!");
        org.jsoup.nodes.Attributes attributes28 = element27.attributes();
        org.jsoup.nodes.Element element30 = element27.appendElement("<hi!></hi!>");
        java.lang.String[] strArray36 = new java.lang.String[] { "", "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root></#root>", "<#root></#root>", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        org.jsoup.nodes.Element element39 = element30.classNames((java.util.Set<java.lang.String>) strSet37);
        org.jsoup.nodes.Element element40 = document1.classNames((java.util.Set<java.lang.String>) strSet37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element42 = element40.wrap("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = document1.dataset();
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueEnding("<hi!></hi!>", "#document");
        java.lang.String str13 = document1.title();
        org.jsoup.nodes.Document document14 = document1.clone();
        org.jsoup.select.Elements elements16 = document14.getElementsContainingText("<html>\n <head></head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document14.lastElementSibling();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element5 = document1.head();
        int int6 = document1.siblingIndex();
        java.lang.String str7 = document1.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Node node6 = document1.nextSibling();
        org.jsoup.select.Elements elements7 = document1.children();
        org.jsoup.nodes.Element element9 = document1.appendText("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document11.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList13 = document11.dataNodes();
        java.lang.String str15 = document11.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode16 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document17 = document11.quirksMode(quirksMode16);
        org.jsoup.nodes.Document document18 = document11.ownerDocument();
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements23 = document20.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        org.jsoup.nodes.Element element28 = document20.classNames((java.util.Set<java.lang.String>) strSet26);
        org.jsoup.nodes.Element element29 = document18.classNames((java.util.Set<java.lang.String>) strSet26);
        org.jsoup.nodes.Element element30 = element9.classNames((java.util.Set<java.lang.String>) strSet26);
        org.jsoup.nodes.Document document32 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements35 = document32.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document36 = document32.clone();
        org.jsoup.nodes.Node node38 = document32.removeAttr("hi!");
        java.lang.String str39 = document32.ownText();
        org.jsoup.nodes.Element element40 = element30.prependChild((org.jsoup.nodes.Node) document32);
        java.lang.String str41 = document32.baseUri();
        org.jsoup.select.Elements elements44 = document32.getElementsByAttributeValueNot("<hi! class=\" hi!\"></hi!>", "<#root></#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element46 = document32.text("<#root>");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document.QuirksMode quirksMode8 = document1.quirksMode();
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueContaining(" hi!", "#root");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = document1.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document1.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = document1.text("<#root>\n <hi!></hi!>\n</#root>\n<<#root></#root>></<#root></#root>>\n<#root></#root>\n<#document></#document>");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        org.jsoup.nodes.Element element6 = element3.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element6.firstElementSibling();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element7 = document1.append("");
        org.jsoup.select.Elements elements8 = document1.siblingElements();
        org.jsoup.nodes.Document document9 = document1.clone();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList10 = document1.textNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.wrap("<<hi!></hi!>></<hi!></hi!>>");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        java.lang.String str6 = element5.val();
        java.lang.String str7 = element5.toString();
        org.jsoup.select.Elements elements9 = element5.getElementsByAttribute("#document");
        java.lang.String str10 = element5.className();
        java.lang.String str11 = element5.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element5.lastElementSibling();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        java.lang.String str6 = document1.tagName();
        java.lang.String str7 = document1.val();
        boolean boolean9 = document1.hasClass("<#root class=\"hi!\"></#root>\n<#root></#root>");
        java.lang.String str10 = document1.ownText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<#root class=\"hi!\"></#root>\n<#root></#root>");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        java.lang.Integer int11 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document12 = document1.clone();
        org.jsoup.nodes.Document document13 = document12.ownerDocument();
        org.jsoup.nodes.Element element14 = document13.head();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document13.text("<hi!>\n #root#root\n</hi!>");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = document1.dataset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("&lt;#root&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        org.jsoup.select.Elements elements10 = document8.getElementsByIndexLessThan((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document8.firstElementSibling();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element7.lastElementSibling();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Document document10 = document1.clone();
        org.jsoup.nodes.Document document11 = document10.normalise();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = document11.siblingNodes();
        org.jsoup.nodes.Element element13 = document11.empty();
        org.jsoup.select.Elements elements14 = document11.parents();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = document11.firstElementSibling();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        org.jsoup.select.Elements elements7 = document1.getElementsByAttribute("hi!#document");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        boolean boolean10 = document9.isBlock();
        org.jsoup.nodes.Element element12 = document9.toggleClass("hi!");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        org.jsoup.nodes.Element element15 = element12.addClass("hi!");
        boolean boolean16 = document1.equals((java.lang.Object) element12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document1.firstElementSibling();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.select.Elements elements6 = document5.getAllElements();
        org.jsoup.nodes.Element element8 = document5.append("<#root></#root>\n<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document5.title("<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element12.siblingNodes();
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        boolean boolean16 = document15.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList17 = document15.dataNodes();
        java.lang.String str19 = document15.attr("");
        java.lang.String str20 = document15.text();
        java.util.Set<java.lang.String> strSet21 = document15.classNames();
        org.jsoup.nodes.Element element22 = element12.classNames(strSet21);
        org.jsoup.select.Elements elements24 = element22.getElementsByAttribute("<<hi!></hi!>></<hi!></hi!>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element22.lastElementSibling();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        java.lang.String str6 = element5.val();
        java.lang.String str7 = element5.toString();
        org.jsoup.select.Elements elements9 = element5.getElementsByAttribute("#document");
        org.jsoup.select.Elements elements11 = element5.getElementsByClass("<#root></#root>\n<hi!></hi!>");
        java.lang.String str12 = element5.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element5.wrap("<hi! class=\" hi!\"></hi!>");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        java.lang.Integer int11 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document12 = document1.clone();
        org.jsoup.nodes.Element element14 = document12.createElement("<#root></#root>");
        org.jsoup.nodes.Document document15 = document12.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document15.text(" hi!#document");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        java.lang.String str5 = document1.val();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = document1.dataset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document1.wrap("<#root class=\"hi!\"></#root>\n<#root></#root>");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.select.Elements elements13 = element12.parents();
        org.jsoup.nodes.Element element14 = element12.previousElementSibling();
        org.jsoup.select.Elements elements16 = element12.getElementsByClass("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.select.Elements elements18 = element12.getElementsByAttributeStarting("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.select.Elements elements21 = element12.getElementsByAttributeValueEnding(" hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element12.firstElementSibling();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList3 = document1.textNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = document1.outputSettings();
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueMatching("<<hi!></hi!>></<hi!></hi!>>", " hi!");
        org.jsoup.nodes.Element element10 = document1.addClass("hi!#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        java.lang.Integer int11 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document12 = document1.clone();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements17 = document14.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean18 = document14.hasText();
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element21 = document14.prependChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings22.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings23.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.clone();
        org.jsoup.nodes.Document document26 = document14.outputSettings(outputSettings25);
        org.jsoup.select.Elements elements28 = document26.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements33 = document30.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element34 = document30.head();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = document30.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings35.clone();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements41 = document38.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean42 = document38.hasText();
        org.jsoup.nodes.Document document44 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element45 = document38.prependChild((org.jsoup.nodes.Node) document44);
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings46.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = outputSettings47.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings47.clone();
        org.jsoup.nodes.Document document50 = document38.outputSettings(outputSettings49);
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings51.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = outputSettings53.escapeMode();
        int int55 = outputSettings53.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings53.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings52.escapeMode(escapeMode56);
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings49.escapeMode(escapeMode56);
        java.nio.charset.CharsetEncoder charsetEncoder59 = outputSettings49.encoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode60 = outputSettings49.escapeMode();
        java.nio.charset.Charset charset61 = outputSettings49.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings36.charset(charset61);
        org.jsoup.nodes.Document document63 = document26.outputSettings(outputSettings36);
        org.jsoup.nodes.Document document64 = document12.outputSettings(outputSettings36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element66 = document64.text("<#root <hi!></hi!>=\"&lt;#root&gt;&lt;/#root&gt;\n&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <hi!></hi!>\n</#root>\n<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        java.lang.String str6 = document1.tagName();
        org.jsoup.nodes.Element element8 = document1.addClass("<#root></#root>");
        org.jsoup.nodes.Element element10 = document1.html("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.text("");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList3 = document1.textNodes();
        org.jsoup.nodes.Document document4 = document1.clone();
        org.jsoup.nodes.Element element6 = document1.removeClass("<hi!></hi!>\n<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document1.wrap("<#root></#root>&lt;#root&gt; \n<!--#root-->&lt;#root&gt; \n<!--#root-->");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Document document10 = document1.clone();
        java.lang.String str11 = document1.outerHtml();
        org.jsoup.nodes.Element element13 = document1.html("#root");
        org.jsoup.nodes.Document document14 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = document1.firstElementSibling();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        org.jsoup.nodes.Node node6 = document1.nextSibling();
        java.lang.String str7 = document1.ownText();
        org.jsoup.nodes.Element element9 = document1.appendText("<#root>");
        org.jsoup.nodes.Node node10 = element9.previousSibling();
        java.lang.String str11 = element9.val();
        org.jsoup.nodes.Node node13 = element9.childNode((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element9.lastElementSibling();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.select.Elements elements12 = document1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element13 = document1.head();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = document1.outputSettings();
        java.lang.String str15 = document1.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title(" hi!");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueStarting("<#root></#root>", "<#root></#root>");
        java.lang.String str9 = document1.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.text("<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element8 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.select.Elements elements11 = document7.getElementsByAttributeValueStarting("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root></#root>");
        org.jsoup.nodes.Node node12 = document7.nextSibling();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements17 = document14.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean18 = document14.hasText();
        org.jsoup.nodes.Element element20 = document14.appendElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.select.Elements elements23 = document14.getElementsByAttributeValueNot("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings24.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings26.escapeMode();
        java.nio.charset.Charset charset28 = outputSettings26.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings25.charset(charset28);
        boolean boolean30 = outputSettings29.prettyPrint();
        org.jsoup.nodes.Document document31 = document14.outputSettings(outputSettings29);
        java.lang.String str32 = document14.text();
        org.jsoup.nodes.Element element34 = document14.child(0);
        org.jsoup.nodes.Element element35 = document7.prependChild((org.jsoup.nodes.Node) document14);
        boolean boolean36 = document14.isBlock();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements41 = document38.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean42 = document38.hasText();
        org.jsoup.nodes.Element element44 = document38.appendElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.select.Elements elements47 = document38.getElementsByAttributeValueNot("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings48.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings50.escapeMode();
        java.nio.charset.Charset charset52 = outputSettings50.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings49.charset(charset52);
        boolean boolean54 = outputSettings53.prettyPrint();
        org.jsoup.nodes.Document document55 = document38.outputSettings(outputSettings53);
        org.jsoup.nodes.Element element56 = document55.head();
        org.jsoup.nodes.Element element57 = document14.appendChild((org.jsoup.nodes.Node) document55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element59 = document14.text("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        java.lang.String str6 = document1.nodeName();
        java.lang.String str7 = document1.id();
        org.jsoup.nodes.Element element9 = document1.prependText("<#root></#root>");
        org.jsoup.nodes.Element element11 = document1.appendText("hi!#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element11.firstElementSibling();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        org.jsoup.nodes.Attributes attributes9 = document1.attributes();
        boolean boolean11 = document1.hasClass(" hi!");
        org.jsoup.nodes.Element element14 = document1.attr("<#root></#root>&lt;#root&gt; \n<!--#root-->&lt;#root&gt; \n<!--#root-->", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document1.wrap("&lt;#root&gt;&lt;/#root&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = document5.dataNodes();
        java.lang.String str9 = document5.attr("");
        org.jsoup.nodes.Element element10 = document1.appendChild((org.jsoup.nodes.Node) document5);
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document5.childNodes();
        java.lang.String str12 = document5.tagName();
        org.jsoup.nodes.Element element14 = document5.getElementById("<hi!#document></hi!#document>\n<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document5.text("<#root <hi!></hi!>=\"&lt;#root&gt;&lt;/#root&gt;\n&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <hi!></hi!>\n</#root>\n<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        boolean boolean7 = element5.hasClass("");
        org.jsoup.nodes.Element element9 = element5.prependElement("<#root></#root>");
        org.jsoup.nodes.Node node10 = element9.previousSibling();
        org.jsoup.select.Elements elements13 = element9.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>", " hi!");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList16 = document15.textNodes();
        java.util.Set<java.lang.String> strSet17 = document15.classNames();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings18.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings18.indentAmount((int) (byte) 100);
        org.jsoup.nodes.Document document22 = document15.outputSettings(outputSettings21);
        org.jsoup.nodes.Document document23 = document15.ownerDocument();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = document15.dataset();
        org.jsoup.select.Elements elements26 = document15.getElementsByIndexLessThan((int) 'a');
        element9.replaceWith((org.jsoup.nodes.Node) document15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element9.lastElementSibling();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        java.lang.String str9 = document1.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.wrap("&lt;#root&gt;\n<!--#root-->&lt;#root&gt;\n<!--#root-->");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        java.lang.String str5 = element4.baseUri();
        org.jsoup.nodes.Element element7 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element7.prependText("");
        boolean boolean11 = element9.hasAttr("hi!");
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        boolean boolean14 = document13.isBlock();
        org.jsoup.nodes.Element element16 = document13.toggleClass("hi!");
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element19 = document13.appendChild((org.jsoup.nodes.Node) document18);
        int int20 = element19.siblingIndex();
        boolean boolean21 = element19.isBlock();
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements26 = document23.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean27 = document23.hasText();
        org.jsoup.nodes.Document document29 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element30 = document23.prependChild((org.jsoup.nodes.Node) document29);
        org.jsoup.select.Elements elements33 = document29.getElementsByAttributeValueStarting("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root></#root>");
        org.jsoup.nodes.Element element35 = document29.before("#root");
        org.jsoup.nodes.Document document37 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList38 = document37.textNodes();
        org.jsoup.select.Elements elements39 = document37.getAllElements();
        org.jsoup.nodes.Document document41 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements44 = document41.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean45 = document41.hasText();
        org.jsoup.nodes.Element element47 = document41.append("");
        org.jsoup.nodes.Element element48 = document37.appendChild((org.jsoup.nodes.Node) document41);
        org.jsoup.nodes.Node node50 = document37.removeAttr("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = outputSettings51.escapeMode();
        java.nio.charset.Charset charset53 = outputSettings51.charset();
        org.jsoup.nodes.Document document54 = document37.outputSettings(outputSettings51);
        boolean boolean55 = element35.equals((java.lang.Object) outputSettings51);
        org.jsoup.nodes.Element element56 = element35.lastElementSibling();
        org.jsoup.nodes.Element element58 = element35.before("#document");
        org.jsoup.nodes.Element element59 = element19.appendChild((org.jsoup.nodes.Node) element35);
        element9.replaceWith((org.jsoup.nodes.Node) element19);
        org.jsoup.nodes.Element element62 = element9.getElementById("<#root class=\"hi!\"></#root>\n<#root></#root>");
        boolean boolean63 = element9.isBlock();
        org.jsoup.nodes.Element element64 = element9.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element66 = element64.wrap("<#root></#root>\n<hi!></hi!>");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Element element4 = document1.nextElementSibling();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.outputSettings();
        java.lang.String str6 = document1.html();
        document1.setBaseUri(" hi!");
        org.jsoup.nodes.Element element10 = document1.addClass("&lt;#root&gt;\n<!--#root-->");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element10.wrap("<#root></#root>&lt;#root&gt; \n<!--#root-->&lt;#root&gt; \n<!--#root-->");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.select.Elements elements12 = document1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element13 = document1.head();
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements18 = document15.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document19 = document15.clone();
        org.jsoup.nodes.Document document20 = document19.normalise();
        java.lang.String str21 = document19.data();
        org.jsoup.select.Elements elements24 = document19.getElementsByAttributeValueMatching("#document", "<#root></#root>");
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList27 = document26.textNodes();
        org.jsoup.nodes.Element element29 = document26.prependElement("hi!");
        org.jsoup.nodes.Element element31 = document26.html("hi!");
        boolean boolean32 = document19.equals((java.lang.Object) element31);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = document19.outputSettings();
        org.jsoup.nodes.Document document34 = document1.outputSettings(outputSettings33);
        org.jsoup.nodes.Element element35 = document34.parent();
        org.jsoup.nodes.Document document37 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements40 = document37.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean42 = document37.hasClass("");
        org.jsoup.nodes.Element element43 = document37.previousElementSibling();
        org.jsoup.nodes.Document document45 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList46 = document45.textNodes();
        org.jsoup.select.Elements elements47 = document45.getAllElements();
        org.jsoup.nodes.Document document49 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements52 = document49.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean53 = document49.hasText();
        org.jsoup.nodes.Element element55 = document49.append("");
        org.jsoup.nodes.Element element56 = document45.appendChild((org.jsoup.nodes.Node) document49);
        org.jsoup.nodes.Node node58 = document45.removeAttr("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode60 = outputSettings59.escapeMode();
        java.nio.charset.Charset charset61 = outputSettings59.charset();
        org.jsoup.nodes.Document document62 = document45.outputSettings(outputSettings59);
        org.jsoup.nodes.Document document64 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element66 = document64.append("");
        org.jsoup.nodes.Element element68 = document64.toggleClass("");
        java.lang.String str69 = document64.nodeName();
        java.lang.String str70 = document64.id();
        org.jsoup.nodes.Document.QuirksMode quirksMode71 = document64.quirksMode();
        org.jsoup.nodes.Document document72 = document62.quirksMode(quirksMode71);
        org.jsoup.nodes.Document document73 = document37.quirksMode(quirksMode71);
        org.jsoup.nodes.Document document74 = document34.quirksMode(quirksMode71);
        org.jsoup.select.Elements elements75 = document74.parents();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element76 = document74.lastElementSibling();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document.QuirksMode quirksMode13 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document14 = document5.quirksMode(quirksMode13);
        org.jsoup.select.Elements elements16 = document5.getElementsByAttributeStarting("hi!");
        org.jsoup.select.Elements elements18 = document5.getElementsMatchingText("");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements23 = document20.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean24 = document20.hasText();
        org.jsoup.nodes.Element element26 = document20.appendElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Document document27 = document20.ownerDocument();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = document27.dataset();
        org.jsoup.select.Elements elements29 = document27.children();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings30.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings30.indentAmount((int) (byte) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings33.prettyPrint(true);
        org.jsoup.nodes.Document document36 = document27.outputSettings(outputSettings33);
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList39 = document38.textNodes();
        java.lang.String str40 = document38.toString();
        org.jsoup.select.Elements elements42 = document38.getElementsByAttribute("<#root></#root>");
        boolean boolean43 = document27.equals((java.lang.Object) "<#root></#root>");
        org.jsoup.nodes.Document document44 = document27.clone();
        document5.replaceWith((org.jsoup.nodes.Node) document27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element47 = document27.text("");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = document1.dataset();
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueEnding("<hi!></hi!>", "#document");
        java.lang.String str13 = document1.title();
        org.jsoup.nodes.Document document14 = document1.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document14.text("<<hi!></hi!>></<hi!></hi!>>\n<#root></#root>");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.parents();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document1.firstElementSibling();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document document6 = document5.normalise();
        java.lang.String str7 = document5.data();
        org.jsoup.select.Elements elements10 = document5.getElementsByAttributeValueMatching("#document", "<#root></#root>");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList13 = document12.textNodes();
        org.jsoup.nodes.Element element15 = document12.prependElement("hi!");
        org.jsoup.nodes.Element element17 = document12.html("hi!");
        boolean boolean18 = document5.equals((java.lang.Object) element17);
        org.jsoup.nodes.Element element19 = document5.head();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = document5.wrap("#root#root");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Document document10 = document1.clone();
        java.lang.String str11 = document1.ownText();
        java.lang.String str12 = document1.title();
        org.jsoup.select.Elements elements14 = document1.getElementsContainingText("<hi!></hi!>");
        org.jsoup.select.Elements elements16 = document1.select("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = document1.text("<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = document1.quirksMode();
        java.lang.String str7 = document1.toString();
        org.jsoup.nodes.Document.QuirksMode quirksMode8 = document1.quirksMode();
        org.jsoup.nodes.Node node10 = document1.removeAttr("&lt;#root&gt;\n<!--#root-->&lt;#root&gt;\n<!--#root-->");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.firstElementSibling();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Document document10 = document1.clone();
        org.jsoup.nodes.Document document11 = document10.normalise();
        org.jsoup.nodes.Node node12 = document11.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document11.lastElementSibling();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        java.lang.String str13 = document1.outerHtml();
        org.jsoup.nodes.Document document14 = document1.normalise();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document16.textNodes();
        org.jsoup.nodes.Element element19 = document16.prependElement("hi!");
        org.jsoup.nodes.Element element20 = document14.prependChild((org.jsoup.nodes.Node) element19);
        boolean boolean21 = document14.hasText();
        org.jsoup.nodes.Element element23 = document14.appendText("<#root></#root>");
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements26 = document25.parents();
        org.jsoup.nodes.Document document27 = document25.clone();
        org.jsoup.nodes.Element element28 = element23.appendChild((org.jsoup.nodes.Node) document27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = element28.firstElementSibling();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        java.lang.String str6 = document1.tagName();
        org.jsoup.select.Elements elements8 = document1.getElementsMatchingText("");
        org.jsoup.select.Elements elements10 = document1.getElementsContainingText("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.lastElementSibling();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element7 = document1.appendElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        org.jsoup.nodes.Element element9 = document1.head();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document1.outputSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<#root></#root>\n<hi!></hi!>");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Node node7 = document1.removeAttr("hi!");
        org.jsoup.select.Elements elements8 = document1.getAllElements();
        org.jsoup.nodes.Element element9 = document1.previousElementSibling();
        document1.setBaseUri("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList12 = document1.dataNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = document1.wrap("<#root>\n hi!\n</#root>hi!");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Node node7 = document1.removeAttr("hi!");
        java.lang.String str8 = document1.ownText();
        org.jsoup.nodes.Element element9 = document1.nextElementSibling();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements14 = document11.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = document11.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Document document20 = document11.clone();
        java.lang.String str21 = document11.outerHtml();
        java.lang.String str22 = document11.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings23.escapeMode();
        java.nio.charset.Charset charset25 = outputSettings23.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings23.clone();
        int int27 = outputSettings23.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings23.indentAmount(0);
        int int30 = outputSettings29.indentAmount();
        org.jsoup.nodes.Document document31 = document11.outputSettings(outputSettings29);
        org.jsoup.nodes.Element element32 = document1.appendChild((org.jsoup.nodes.Node) document31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element33 = document1.lastElementSibling();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList3 = document1.textNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = document1.outputSettings();
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.outputSettings();
        java.lang.Integer int7 = document1.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element8 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings9.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings10.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings10.clone();
        org.jsoup.nodes.Document document13 = document1.outputSettings(outputSettings12);
        java.lang.String str14 = document13.nodeName();
        org.jsoup.select.Elements elements17 = document13.getElementsByAttributeValueStarting("&lt;#root&gt;\n<!--#root-->", "&lt;#root&gt; \n<!--#root-->&lt;#root&gt; \n<!--#root-->");
        org.jsoup.nodes.Element element19 = document13.removeClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element19.lastElementSibling();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueStarting("<#root></#root>", "<#root></#root>");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean11 = document10.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList12 = document10.dataNodes();
        java.lang.String str14 = document10.attr("");
        java.lang.String str15 = document10.text();
        java.util.Set<java.lang.String> strSet16 = document10.classNames();
        org.jsoup.nodes.Element element17 = document1.classNames(strSet16);
        org.jsoup.nodes.Element element19 = document1.appendElement("<#root>");
        java.lang.String str20 = document1.ownText();
        java.lang.String str21 = document1.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("&lt;#root&gt; \n<!--#root-->&lt;#root&gt; \n<!--#root-->");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element8 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements13 = document10.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = document10.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element19 = document1.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.select.Elements elements20 = document1.siblingElements();
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements25 = document22.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean26 = document22.hasText();
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element29 = document22.prependChild((org.jsoup.nodes.Node) document28);
        org.jsoup.select.Elements elements32 = document28.getElementsByAttributeValueStarting("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root></#root>");
        org.jsoup.nodes.Element element34 = document28.before("#root");
        org.jsoup.nodes.Document document36 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList37 = document36.textNodes();
        org.jsoup.select.Elements elements38 = document36.getAllElements();
        org.jsoup.nodes.Document document40 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements43 = document40.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean44 = document40.hasText();
        org.jsoup.nodes.Element element46 = document40.append("");
        org.jsoup.nodes.Element element47 = document36.appendChild((org.jsoup.nodes.Node) document40);
        org.jsoup.nodes.Node node49 = document36.removeAttr("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings50.escapeMode();
        java.nio.charset.Charset charset52 = outputSettings50.charset();
        org.jsoup.nodes.Document document53 = document36.outputSettings(outputSettings50);
        boolean boolean54 = element34.equals((java.lang.Object) outputSettings50);
        org.jsoup.nodes.Element element55 = element34.lastElementSibling();
        org.jsoup.select.Elements elements56 = element34.parents();
        org.jsoup.nodes.Element element57 = document1.appendChild((org.jsoup.nodes.Node) element34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element59 = document1.wrap("<hi!></hi!>\n<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>&lt;#root&gt;&lt;/#root&gt;");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element5 = document1.head();
        int int6 = document1.siblingIndex();
        java.lang.String str7 = document1.title();
        java.lang.String str8 = document1.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.firstElementSibling();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element8 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings9.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings10.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings10.clone();
        org.jsoup.nodes.Document document13 = document1.outputSettings(outputSettings12);
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements16 = document15.parents();
        org.jsoup.nodes.Document document17 = document15.clone();
        org.jsoup.nodes.Element element18 = document17.body();
        org.jsoup.nodes.Document.QuirksMode quirksMode19 = document17.quirksMode();
        org.jsoup.nodes.Document document20 = document1.quirksMode(quirksMode19);
        org.jsoup.nodes.Element element21 = document20.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = document20.text("&lt;#root&gt; \n<!--#root-->\n<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.tagName("<html>\n <head></head>\n <body></body>\n</html>&lt;#root&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document1.text(" hi!");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        java.lang.String str13 = document1.outerHtml();
        org.jsoup.nodes.Document document14 = document1.normalise();
        org.jsoup.select.Elements elements16 = document1.getElementsByAttribute("<html>\n <head></head>\n <body></body>\n</html>");
        boolean boolean17 = document1.hasText();
        org.jsoup.nodes.Element element19 = document1.appendText("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Element element21 = document1.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str22 = document1.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = document1.wrap("&lt;#root&gt; <!--#root-->&lt;#root&gt; <!--#root-->");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element8 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements13 = document10.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = document10.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element19 = document1.classNames((java.util.Set<java.lang.String>) strSet16);
        java.lang.String str20 = document1.html();
        org.jsoup.nodes.Node node21 = document1.previousSibling();
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements26 = document23.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean27 = document23.hasText();
        org.jsoup.select.Elements elements30 = document23.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = document23.dataset();
        org.jsoup.select.Elements elements34 = document23.getElementsByAttributeValueEnding("<hi!></hi!>", "#document");
        org.jsoup.nodes.Document.QuirksMode quirksMode35 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document36 = document23.quirksMode(quirksMode35);
        org.jsoup.nodes.Document document37 = document1.quirksMode(quirksMode35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element38 = document37.firstElementSibling();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        java.lang.String str13 = document1.outerHtml();
        org.jsoup.nodes.Document document14 = document1.clone();
        org.jsoup.nodes.Element element16 = document14.appendElement(" hi!");
        org.jsoup.nodes.Element element18 = document14.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str19 = document14.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = document14.wrap("&lt;#root&gt;     \n<!--#root-->");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.html("hi!");
        java.util.Set<java.lang.String> strSet5 = element4.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element4.wrap("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>&lt;#root&gt;     \n<!--#root-->");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element13 = document1.previousElementSibling();
        org.jsoup.nodes.Element element14 = document1.head();
        org.jsoup.nodes.Element element16 = document1.tagName("#document");
        org.jsoup.select.Elements elements19 = document1.getElementsByAttributeValueNot("<html>\n <head></head>\n <body></body>\n</html>", "<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = document1.text("<#root>\n <hi!></hi!>\n</#root>\n<<#root></#root>></<#root></#root>>\n<#root></#root>\n<#document></#document>");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element7 = document1.appendElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings11.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode();
        java.nio.charset.Charset charset15 = outputSettings13.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings12.charset(charset15);
        boolean boolean17 = outputSettings16.prettyPrint();
        org.jsoup.nodes.Document document18 = document1.outputSettings(outputSettings16);
        java.lang.String str19 = document1.text();
        org.jsoup.nodes.Element element21 = document1.child(0);
        org.jsoup.select.Elements elements24 = document1.getElementsByAttributeValue("<html>\n <head></head>\n <body></body>\n</html>", "<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document25 = document1.ownerDocument();
        boolean boolean27 = document1.hasClass("<hi!></hi!>\n<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>&lt;#root&gt;&lt;/#root&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<#root></#root>\n<hi!></hi!>");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        org.jsoup.parser.Tag tag9 = document8.tag();
        java.lang.String str10 = document8.ownText();
        org.jsoup.nodes.Document document11 = document8.clone();
        org.jsoup.nodes.Document document12 = document11.clone();
        document11.setBaseUri("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element15 = document11.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document11.firstElementSibling();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element8 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements15 = document12.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element16 = document12.head();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = document12.outputSettings();
        boolean boolean18 = document1.equals((java.lang.Object) outputSettings17);
        org.jsoup.nodes.Element element20 = document1.html("");
        org.jsoup.nodes.Element element23 = document1.attr(" hi!", "#document");
        java.lang.String str24 = document1.outerHtml();
        org.jsoup.nodes.Document document25 = document1.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = document25.wrap("<hi! class=\" hi!\"></hi!>");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.createElement("<hi!>\n #root\n</hi!>");
        org.jsoup.select.Elements elements11 = document1.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.lastElementSibling();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<hi!></hi!>\n<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.prependText("<<hi!></hi!>></<hi!></hi!>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document1.lastElementSibling();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element12.siblingNodes();
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        boolean boolean16 = document15.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList17 = document15.dataNodes();
        java.lang.String str19 = document15.attr("");
        java.lang.String str20 = document15.text();
        java.util.Set<java.lang.String> strSet21 = document15.classNames();
        org.jsoup.nodes.Element element22 = element12.classNames(strSet21);
        org.jsoup.nodes.Element element24 = element12.val("");
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element28 = document26.append("");
        org.jsoup.nodes.Element element30 = document26.html("<#root></#root>");
        org.jsoup.select.Elements elements33 = document26.getElementsByAttributeValueStarting("<#root></#root>", "<#root></#root>");
        org.jsoup.nodes.Element element35 = document26.append("<#root></#root>");
        org.jsoup.select.Elements elements37 = document26.getElementsContainingOwnText("<<hi!></hi!>></<hi!></hi!>>\n<#root></#root>");
        org.jsoup.nodes.Element element38 = element24.appendChild((org.jsoup.nodes.Node) document26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document26.title("<hi! class=\" hi!\"></hi!>");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        java.lang.String str9 = document1.toString();
        boolean boolean10 = document1.hasText();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings11.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode();
        java.nio.charset.Charset charset15 = outputSettings13.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings12.charset(charset15);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings12.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.prettyPrint(false);
        org.jsoup.nodes.Document document20 = document1.outputSettings(outputSettings19);
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList23 = document22.textNodes();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = document22.textNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = document22.outputSettings();
        org.jsoup.nodes.Document document26 = document22.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = document22.outputSettings();
        org.jsoup.nodes.Element element28 = document1.prependChild((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Document.QuirksMode quirksMode29 = document1.quirksMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<#root>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>\n</#root>");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element7 = document1.appendElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = document8.dataset();
        org.jsoup.select.Elements elements10 = document8.children();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings11.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings11.indentAmount((int) (byte) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.prettyPrint(true);
        org.jsoup.nodes.Document document17 = document8.outputSettings(outputSettings14);
        org.jsoup.select.Elements elements18 = document17.parents();
        org.jsoup.select.Elements elements20 = document17.getElementsByAttribute(" hi!#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = document17.wrap("<hi! class=\" hi!\">\n</hi!>&lt;#root&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document1.childNodes();
        org.jsoup.nodes.Element element10 = document1.previousElementSibling();
        org.jsoup.nodes.Element element12 = document1.prependElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element14 = document1.appendElement("&lt;#root&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title(" hi!#document");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByIndexGreaterThan((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<#root></#root>\n<hi!></hi!>");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element8 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings9.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings10.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings10.clone();
        org.jsoup.nodes.Document document13 = document1.outputSettings(outputSettings12);
        org.jsoup.select.Elements elements15 = document13.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document16 = document13.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = document13.wrap("<#root <hi!></hi!>=\"&lt;#root&gt;&lt;/#root&gt;\n&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <hi!></hi!>\n</#root>\n<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document document6 = document5.normalise();
        org.jsoup.nodes.Element element7 = document6.parent();
        org.jsoup.nodes.Document document8 = document6.normalise();
        org.jsoup.nodes.Element element10 = document6.addClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document6.lastElementSibling();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root class=\"hi!\"></#root>\n<#root></#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document1.wrap("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>&lt;#root&gt;     \n<!--#root-->");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        java.lang.String str13 = document1.outerHtml();
        org.jsoup.nodes.Document document14 = document1.normalise();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document16.textNodes();
        org.jsoup.nodes.Element element19 = document16.prependElement("hi!");
        org.jsoup.nodes.Element element20 = document14.prependChild((org.jsoup.nodes.Node) element19);
        boolean boolean21 = document14.hasText();
        org.jsoup.nodes.Element element23 = document14.appendText("<#root></#root>");
        java.util.Set<java.lang.String> strSet24 = document14.classNames();
        org.jsoup.select.Elements elements26 = document14.getElementsByIndexEquals((int) ' ');
        java.lang.String str27 = document14.toString();
        org.jsoup.nodes.Element element29 = document14.createElement("&lt;#root&gt;\n<!--#root-->&lt;#root&gt;\n<!--#root-->");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element31 = document14.wrap("<#root>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>\n</#root>");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element7 = document1.appendElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.wrap("<hi! class=\"\">\n #root\n</hi!>");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element7 = document1.appendElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings11.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode();
        java.nio.charset.Charset charset15 = outputSettings13.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings12.charset(charset15);
        boolean boolean17 = outputSettings16.prettyPrint();
        org.jsoup.nodes.Document document18 = document1.outputSettings(outputSettings16);
        org.jsoup.nodes.Document document19 = document18.ownerDocument();
        org.jsoup.select.Elements elements21 = document19.getElementsContainingText("&lt;#root&gt;&lt;/#root&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document19.title("<hi! class=\" hi! &amp;lt;#root&amp;gt;\n&lt;!--#root--&gt;&amp;lt;#root&amp;gt;\n&lt;!--#root--&gt;\">\n</hi!>");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        java.lang.Integer int11 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document12 = document1.clone();
        org.jsoup.nodes.Document document13 = document12.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = document12.firstElementSibling();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = document1.dataset();
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueEnding("<hi!></hi!>", "#document");
        java.lang.String str13 = document1.title();
        org.jsoup.nodes.Document document14 = document1.clone();
        org.jsoup.nodes.Attributes attributes15 = document14.attributes();
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        boolean boolean18 = document17.isBlock();
        org.jsoup.nodes.Element element20 = document17.toggleClass("hi!");
        org.jsoup.nodes.Attributes attributes21 = element20.attributes();
        org.jsoup.nodes.Element element23 = element20.appendElement("<hi!></hi!>");
        java.lang.String[] strArray29 = new java.lang.String[] { "", "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root></#root>", "<#root></#root>", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        org.jsoup.nodes.Element element32 = element23.classNames((java.util.Set<java.lang.String>) strSet30);
        org.jsoup.nodes.Element element34 = element32.prepend("<hi!>\n #root\n</hi!>");
        boolean boolean35 = document14.equals((java.lang.Object) element34);
        org.jsoup.select.Elements elements38 = document14.getElementsByAttributeValueEnding("<#root><#root>", "<hi!>\n #root\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document14.title("<hi!></hi!>\n<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element7 = document1.append("");
        org.jsoup.select.Elements elements8 = document1.siblingElements();
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueEnding("<hi!></hi!>", "<#root></#root>");
        org.jsoup.select.Elements elements14 = document1.getElementsByAttributeValueEnding("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root class=\"hi!\"></#root>\n<#root></#root>");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document16.textNodes();
        org.jsoup.nodes.Element element19 = document16.prependElement("hi!");
        java.lang.String str20 = document16.val();
        org.jsoup.nodes.Element element23 = document16.attr("<hi!></hi!>", "<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        java.util.Set<java.lang.String> strSet24 = element23.classNames();
        org.jsoup.nodes.Element element25 = document1.classNames(strSet24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = document1.lastElementSibling();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Element element7 = element4.appendElement("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element4.tagName(" hi!");
        int int10 = element4.siblingIndex();
        org.jsoup.nodes.Element element12 = element4.html("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element4.prependElement("hi!#document");
        java.lang.String str15 = element4.html();
        org.jsoup.nodes.Document document16 = element4.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document16.lastElementSibling();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element14 = document1.prependElement("<#root></#root>");
        org.jsoup.select.Elements elements16 = document1.getElementsContainingOwnText("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("hi!");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Element element9 = document1.parent();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements14 = document11.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean15 = document11.hasText();
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element18 = document11.prependChild((org.jsoup.nodes.Node) document17);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings19.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings20.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.clone();
        org.jsoup.nodes.Document document23 = document11.outputSettings(outputSettings22);
        org.jsoup.parser.Tag tag24 = document11.tag();
        org.jsoup.select.Elements elements27 = document11.getElementsByAttributeValue("hi!", "#root");
        org.jsoup.select.Elements elements30 = document11.getElementsByAttributeValueEnding("<#root class=\"hi!\"></#root>\n<#root></#root>", "<hi!></hi!>");
        org.jsoup.nodes.Element element31 = document11.previousElementSibling();
        org.jsoup.nodes.Document document33 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList34 = document33.textNodes();
        org.jsoup.select.Elements elements35 = document33.getAllElements();
        org.jsoup.nodes.Document document37 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements40 = document37.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean41 = document37.hasText();
        org.jsoup.nodes.Element element43 = document37.append("");
        org.jsoup.nodes.Element element44 = document33.appendChild((org.jsoup.nodes.Node) document37);
        org.jsoup.nodes.Document.QuirksMode quirksMode45 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document46 = document37.quirksMode(quirksMode45);
        org.jsoup.nodes.Document document47 = document11.quirksMode(quirksMode45);
        org.jsoup.nodes.Document document48 = document1.quirksMode(quirksMode45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element49 = document1.firstElementSibling();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        java.lang.String str13 = document1.outerHtml();
        org.jsoup.nodes.Document document14 = document1.normalise();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings15.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings15.indentAmount((int) (byte) 100);
        org.jsoup.nodes.Document document19 = document1.outputSettings(outputSettings18);
        org.jsoup.nodes.Document document20 = document1.normalise();
        org.jsoup.select.Elements elements22 = document1.getElementsByAttribute("<hi!></hi!>\n<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element24 = document1.append("<hi!></hi!>\n<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>&lt;#root&gt;&lt;/#root&gt;");
        org.jsoup.nodes.Document document25 = element24.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = document25.wrap("&lt;#root&gt; \n<!--#root-->");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        java.util.Set<java.lang.String> strSet3 = document1.classNames();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings4.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings4.indentAmount((int) (byte) 100);
        org.jsoup.nodes.Document document8 = document1.outputSettings(outputSettings7);
        org.jsoup.select.Elements elements9 = document1.siblingElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.text("<&lt;#root&gt;     \n<!--#root-->></&lt;#root&gt;     \n<!--#root-->>");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean6 = document1.hasClass("");
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexGreaterThan((int) (short) 10);
        org.jsoup.nodes.Element element10 = document1.prependElement("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.text("#document");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = document1.dataset();
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueEnding("<hi!></hi!>", "#document");
        org.jsoup.nodes.Element element14 = document1.createElement("#document");
        org.jsoup.select.Elements elements16 = document1.getElementsContainingText("<hi!></hi!>");
        java.lang.String str17 = document1.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = document1.text("<hi! class=\"\">\n #root\n</hi!>");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document6);
        document1.setBaseUri("");
        org.jsoup.nodes.Attributes attributes10 = document1.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("&lt;#root&gt;\n<!--#root-->&lt;#root&gt;\n<!--#root-->");
        org.jsoup.nodes.Element element3 = document1.text("<<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>></<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.wrap("<html>\n <head></head>\n <body></body>\n</html>&lt;&amp;lt;#root&amp;gt; &lt;!--#root--&gt;&gt;&lt;/&amp;lt;#root&amp;gt; &lt;!--#root--&gt;&gt;");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        java.lang.String str6 = document1.tagName();
        org.jsoup.select.Elements elements8 = document1.getElementsMatchingText("");
        org.jsoup.select.Elements elements10 = document1.getElementsByAttribute("hi!#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.text("&lt;#root&gt;\n<!--#root-->&lt;#root&gt;\n<!--#root-->");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueStarting("<#root></#root>", "<#root></#root>");
        org.jsoup.nodes.Element element10 = document1.append("<#root></#root>");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements15 = document12.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean16 = document12.hasText();
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element19 = document12.prependChild((org.jsoup.nodes.Node) document18);
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements24 = document21.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.jsoup.nodes.Element element29 = document21.classNames((java.util.Set<java.lang.String>) strSet27);
        org.jsoup.nodes.Element element30 = document12.classNames((java.util.Set<java.lang.String>) strSet27);
        java.lang.String str31 = document12.html();
        org.jsoup.nodes.Node node32 = document12.previousSibling();
        org.jsoup.nodes.Document document34 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements37 = document34.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean38 = document34.hasText();
        org.jsoup.select.Elements elements41 = document34.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap42 = document34.dataset();
        org.jsoup.select.Elements elements45 = document34.getElementsByAttributeValueEnding("<hi!></hi!>", "#document");
        org.jsoup.nodes.Document.QuirksMode quirksMode46 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document47 = document34.quirksMode(quirksMode46);
        org.jsoup.nodes.Document document48 = document12.quirksMode(quirksMode46);
        org.jsoup.nodes.Document document49 = document1.quirksMode(quirksMode46);
        org.jsoup.select.Elements elements51 = document1.getElementsByAttribute("<hi!></hi!>");
        org.jsoup.nodes.Element element53 = document1.append("&lt;#root&gt;     \n<!--#root-->");
        boolean boolean54 = document1.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element56 = document1.text("<#root>\n &lt;#root&gt;\n <!--#root-->\n</#root>&lt;#root&gt;\n<!--#root-->");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document1.text("&lt;#root&gt;\n<!--#root-->&lt;#root&gt;\n<!--#root-->");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = document1.html("hi!");
        org.jsoup.select.Elements elements7 = document1.siblingElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.text("<hi!></hi!>");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        org.jsoup.parser.Tag tag9 = document8.tag();
        java.lang.String str10 = document8.ownText();
        org.jsoup.nodes.Document document11 = document8.clone();
        org.jsoup.nodes.Document document12 = document11.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document12.firstElementSibling();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean6 = document1.hasClass("");
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexGreaterThan((int) (short) 10);
        java.lang.String str9 = document1.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<#root <hi!></hi!>=\"&lt;#root&gt;&lt;/#root&gt;\n&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <hi!></hi!>\n</#root>\n<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        java.lang.String str13 = document1.outerHtml();
        org.jsoup.nodes.Document document14 = document1.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document1.text("<#root>\n hi!\n</#root>hi!");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element6 = document1.nextElementSibling();
        org.jsoup.nodes.Element element7 = document1.head();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("#document");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element8 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements13 = document10.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = document10.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element19 = document1.classNames((java.util.Set<java.lang.String>) strSet16);
        java.lang.String str20 = document1.html();
        org.jsoup.nodes.Node node21 = document1.previousSibling();
        org.jsoup.select.Elements elements24 = document1.getElementsByAttributeValueStarting("<<#root></#root>></<#root></#root>>\n<#root></#root>\n<#document></#document>", "<hi!></hi!>\n<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = document1.lastElementSibling();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        java.lang.String str6 = element5.val();
        java.lang.String str7 = element5.toString();
        org.jsoup.select.Elements elements9 = element5.getElementsByAttribute("#document");
        org.jsoup.select.Elements elements10 = element5.siblingElements();
        org.jsoup.nodes.Element element12 = element5.appendElement(" hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element5.wrap("&lt;#root&gt;\n<!--#root--> \n<hi!></hi!>");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValue("<hi!></hi!>", "#document");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = document1.textNodes();
        org.jsoup.nodes.Document document10 = document1.normalise();
        org.jsoup.select.Elements elements12 = document1.getElementsMatchingText("<#root></#root>\n<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document1.lastElementSibling();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValue("<hi!></hi!>", "#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.firstElementSibling();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document.QuirksMode quirksMode13 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document14 = document5.quirksMode(quirksMode13);
        java.util.Set<java.lang.String> strSet15 = document5.classNames();
        java.lang.String str16 = document5.id();
        java.lang.String str17 = document5.text();
        boolean boolean18 = document5.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = document5.text("#root#root");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        java.lang.String str13 = document1.outerHtml();
        org.jsoup.nodes.Document document14 = document1.clone();
        org.jsoup.nodes.Element element16 = document14.appendElement(" hi!");
        org.jsoup.nodes.Document document17 = element16.ownerDocument();
        org.jsoup.nodes.Element element19 = document17.createElement("&lt;#root&gt;     \n<!--#root-->");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = document17.firstElementSibling();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        java.lang.String str6 = document1.tagName();
        org.jsoup.select.Elements elements8 = document1.getElementsMatchingText("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.text(" hi!");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.select.Elements elements2 = document1.getAllElements();
        org.jsoup.select.Elements elements5 = document1.getElementsByAttributeValueEnding("<hi!></hi!>\n<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>", "<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document1.lastElementSibling();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueStarting("<#root></#root>", "<#root></#root>");
        org.jsoup.nodes.Element element10 = document1.append("<#root></#root>");
        java.lang.String str11 = document1.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.firstElementSibling();
    }
}

