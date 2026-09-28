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
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("hi!");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.select.Elements elements7 = document1.select("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document1.lastElementSibling();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = element4.previousSibling();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.util.Set<java.lang.String> strSet5 = element4.classNames();
        java.lang.Integer int6 = element4.siblingIndex();
        boolean boolean8 = element4.hasAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element4.wrap("<html>\n <head></head>\n <body>\n </body>\n</html>");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document1.previousElementSibling();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        org.jsoup.nodes.Document document7 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = document1.previousSibling();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        org.jsoup.nodes.Node node3 = document1.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document1.previousElementSibling();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.select.Elements elements9 = document7.getElementsByIndexEquals((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document7.firstElementSibling();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.util.Set<java.lang.String> strSet5 = element4.classNames();
        java.lang.Integer int6 = element4.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element4.lastElementSibling();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.select.Elements elements7 = document1.select("#root");
        org.jsoup.nodes.Element element8 = document1.empty();
        java.lang.String str9 = document1.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.lastElementSibling();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag5 = document3.tag();
        org.jsoup.nodes.Element element7 = document3.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        document3.setBaseUri("");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document3.outputSettings();
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element13 = document12.body();
        boolean boolean14 = document3.equals((java.lang.Object) document12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = document12.previousSibling();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element2 = document1.body();
        boolean boolean3 = document1.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document1.lastElementSibling();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        boolean boolean6 = element4.hasAttr("hi!");
        boolean boolean8 = element4.hasAttr("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element4.firstElementSibling();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        java.lang.String str4 = element3.html();
        org.jsoup.select.Elements elements7 = element3.getElementsByAttributeValueNot("hi!", "#root");
        org.jsoup.nodes.Element element8 = element3.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements9 = element8.siblingElements();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document1.wrap("<html> <head></head> <body> </body> </html>");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        org.jsoup.nodes.Element element8 = document1.createElement("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document1.siblingNodes();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        boolean boolean6 = element4.hasAttr("hi!");
        org.jsoup.select.Elements elements9 = element4.getElementsByAttributeValueStarting("\n<body></body>", "html");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element4.previousElementSibling();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        java.lang.String str5 = element4.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element4.wrap("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag5 = document3.tag();
        org.jsoup.nodes.Element element7 = document3.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        document3.setBaseUri("");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document3.outputSettings();
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element13 = document12.body();
        boolean boolean14 = document3.equals((java.lang.Object) document12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = document12.nextElementSibling();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasClass("");
        java.util.Set<java.lang.String> strSet4 = document1.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.util.Set<java.lang.String> strSet5 = element4.classNames();
        java.lang.Integer int6 = element4.siblingIndex();
        boolean boolean8 = element4.hasAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element4.wrap("<html> <head></head> <body></body> </html>");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements9 = document3.getAllElements();
        org.jsoup.nodes.Element element11 = document3.html("");
        java.lang.String str12 = document3.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document3.title("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document1.lastElementSibling();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        element9.remove();
        org.jsoup.nodes.Node node12 = element9.removeAttr("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element9.firstElementSibling();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        org.jsoup.select.Elements elements13 = document3.getElementsByIndexGreaterThan(10);
        java.lang.Integer int14 = document3.elementSiblingIndex();
        org.jsoup.select.Elements elements15 = document3.getAllElements();
        document3.remove();
        java.lang.String str17 = document3.nodeName();
        java.lang.String str18 = document3.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = document3.lastElementSibling();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        org.jsoup.select.Elements elements13 = document3.getElementsByIndexGreaterThan(10);
        java.lang.Integer int14 = document3.elementSiblingIndex();
        org.jsoup.select.Elements elements15 = document3.getAllElements();
        org.jsoup.parser.Tag tag16 = document3.tag();
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element21 = document18.prependChild((org.jsoup.nodes.Node) document20);
        java.lang.String str22 = document20.html();
        java.lang.String str23 = document20.html();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = document20.dataset();
        org.jsoup.nodes.Element element26 = document20.appendElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = element26.childNodes();
        org.jsoup.nodes.Element element30 = element26.attr("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements32 = element30.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Element element34 = element30.prependText("#document");
        document3.replaceWith((org.jsoup.nodes.Node) element34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node36 = document3.previousSibling();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.new OutputSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = document1.previousSibling();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements5 = document1.siblingElements();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        java.lang.String str4 = element3.html();
        org.jsoup.select.Elements elements7 = element3.getElementsByAttributeValueNot("hi!", "#root");
        org.jsoup.select.Elements elements8 = element3.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element3.nextElementSibling();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        org.jsoup.nodes.Element element4 = document1.removeClass("hi!");
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.prependText("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = document1.previousSibling();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        java.lang.String str4 = element3.html();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document6.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element13 = document8.val("");
        org.jsoup.nodes.Element element15 = document8.after("#root");
        org.jsoup.nodes.Element element16 = document8.body();
        org.jsoup.select.Elements elements18 = element16.getElementsContainingOwnText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        java.lang.String str20 = element16.absUrl("hi!");
        org.jsoup.nodes.Element element21 = element3.prependChild((org.jsoup.nodes.Node) element16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element21.nextElementSibling();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document1.siblingNodes();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.nodes.Element element9 = document3.getElementById("hi!");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element14 = document11.prependChild((org.jsoup.nodes.Node) document13);
        org.jsoup.select.Elements elements16 = document13.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element18 = document13.val("");
        org.jsoup.nodes.Element element20 = document13.after("#root");
        org.jsoup.nodes.Document document21 = document13.ownerDocument();
        org.jsoup.nodes.Element element24 = document13.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element26 = element24.removeClass("");
        org.jsoup.select.Elements elements28 = element24.getElementsByAttribute("#document");
        org.jsoup.select.Elements elements30 = element24.getElementsByAttributeStarting("<html>\n <head></head>\n <body>\n </body>\n</html>");
        java.lang.String str31 = element24.baseUri();
        org.jsoup.select.Elements elements33 = element24.getElementsContainingOwnText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        document3.replaceWith((org.jsoup.nodes.Node) element24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node35 = document3.previousSibling();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element14 = document3.appendElement("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element19 = document16.prependChild((org.jsoup.nodes.Node) document18);
        java.lang.String str20 = document18.html();
        java.lang.String str21 = document18.html();
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet24 = document23.classNames();
        org.jsoup.nodes.Element element25 = document18.classNames(strSet24);
        org.jsoup.nodes.Element element28 = document18.attr("hi!", "hi!");
        document3.replaceWith((org.jsoup.nodes.Node) element28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = document3.lastElementSibling();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        java.lang.String str11 = element10.className();
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element16 = document13.prependChild((org.jsoup.nodes.Node) document15);
        org.jsoup.nodes.Element element17 = document13.body();
        org.jsoup.select.Elements elements20 = element17.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.select.Elements elements22 = element17.getElementsByAttributeStarting("#root");
        java.util.Set<java.lang.String> strSet23 = element17.classNames();
        org.jsoup.nodes.Element element24 = element10.classNames(strSet23);
        org.jsoup.select.Elements elements26 = element10.getElementsByIndexEquals(10);
        org.jsoup.nodes.Element element27 = element10.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList28 = element27.siblingNodes();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>", " html");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.lastElementSibling();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str3 = document1.absUrl("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element7 = document1.html("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element12 = document9.prependChild((org.jsoup.nodes.Node) document11);
        org.jsoup.nodes.Element element14 = element12.child((int) (short) 0);
        java.util.Set<java.lang.String> strSet15 = element14.classNames();
        org.jsoup.nodes.Element element16 = document1.classNames(strSet15);
        java.lang.String str17 = document1.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements18 = document1.siblingElements();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element4.siblingNodes();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = document1.firstElementSibling();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        org.jsoup.nodes.Element element5 = document1.append("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element6 = document1.empty();
        java.lang.Integer int7 = element6.siblingIndex();
        boolean boolean8 = element6.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = element6.previousSibling();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.select.Elements elements9 = document7.getElementsByIndexEquals((int) (byte) 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "#document", "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        org.jsoup.nodes.Element element15 = document7.classNames((java.util.Set<java.lang.String>) strSet13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element15.lastElementSibling();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.util.Set<java.lang.String> strSet5 = element4.classNames();
        java.lang.Integer int6 = element4.siblingIndex();
        boolean boolean8 = element4.hasAttr("hi!");
        boolean boolean9 = element4.hasText();
        org.jsoup.nodes.Node node11 = element4.childNode((int) (short) 1);
        org.jsoup.select.Elements elements12 = element4.parents();
        element4.setBaseUri(" hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element4.siblingNodes();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Element element11 = document3.nextElementSibling();
        org.jsoup.nodes.Element element13 = document3.append("#root");
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element18 = document15.prependChild((org.jsoup.nodes.Node) document17);
        java.lang.String str19 = document17.html();
        java.lang.String str20 = document17.html();
        document17.title("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements23 = document17.getAllElements();
        org.jsoup.nodes.Element element25 = document17.html("");
        element13.replaceWith((org.jsoup.nodes.Node) element25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList27 = element13.siblingNodes();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        org.jsoup.select.Elements elements13 = document3.getElementsByIndexGreaterThan(10);
        java.lang.Integer int14 = document3.elementSiblingIndex();
        org.jsoup.select.Elements elements15 = document3.getAllElements();
        document3.remove();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = document3.dataset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = document3.previousSibling();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<html> <head> <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;</title> </head> <body></body> </html>");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element14 = document3.appendElement("<html> <head></head> <body> </body> </html>");
        java.lang.String str15 = document3.outerHtml();
        org.jsoup.nodes.Document document16 = document3.normalise();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("<html> <head></head> <body></body> </html>");
        document16.replaceWith((org.jsoup.nodes.Node) document18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = document16.previousSibling();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.addClass("#document");
        java.lang.String str5 = document1.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document1.firstElementSibling();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; \n </body>\n</html><<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = document1.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document1.previousElementSibling();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        org.jsoup.nodes.Element element4 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element6 = document1.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        boolean boolean7 = document1.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements8 = document1.siblingElements();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n <head></head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node2 = document1.previousSibling();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        org.jsoup.select.Elements elements13 = document3.getElementsByIndexGreaterThan(10);
        java.lang.Integer int14 = document3.elementSiblingIndex();
        org.jsoup.select.Elements elements15 = document3.getAllElements();
        org.jsoup.parser.Tag tag16 = document3.tag();
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element21 = document18.prependChild((org.jsoup.nodes.Node) document20);
        java.lang.String str22 = document20.html();
        java.lang.String str23 = document20.html();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = document20.dataset();
        org.jsoup.nodes.Element element26 = document20.appendElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = element26.childNodes();
        org.jsoup.nodes.Element element30 = element26.attr("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements32 = element30.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Element element34 = element30.prependText("#document");
        document3.replaceWith((org.jsoup.nodes.Node) element34);
        org.jsoup.nodes.Element element37 = document3.html("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        boolean boolean39 = document3.hasAttr("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element40 = document3.lastElementSibling();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        org.jsoup.nodes.Element element8 = document1.createElement("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements10 = document1.getElementsContainingOwnText("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; \n </body>\n</html><<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.firstElementSibling();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        org.jsoup.nodes.Element element4 = element3.parent();
        java.lang.Integer int5 = element3.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element3.firstElementSibling();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        java.lang.String str4 = document1.ownText();
        document1.setBaseUri(" html");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.nextElementSibling();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        java.lang.String str13 = document3.outerHtml();
        org.jsoup.nodes.Element element15 = document3.prepend("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element20 = document17.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Element element21 = document17.body();
        org.jsoup.select.Elements elements23 = document17.select("#root");
        org.jsoup.nodes.Element element24 = document17.empty();
        java.lang.String str25 = document17.html();
        org.jsoup.nodes.Element element26 = document3.prependChild((org.jsoup.nodes.Node) document17);
        org.jsoup.nodes.Element element28 = document17.appendText("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str29 = document17.tagName();
        org.jsoup.nodes.Element element30 = document17.body();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element32 = document17.text("\n<body></body>");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str3 = document1.absUrl("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element7 = document1.html("<html>\n <head></head>\n <body>\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document1.siblingNodes();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        java.lang.String str4 = element3.html();
        org.jsoup.select.Elements elements7 = element3.getElementsByAttributeValueNot("hi!", "#root");
        boolean boolean8 = element3.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element3.nextElementSibling();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        org.jsoup.nodes.Element element4 = element3.parent();
        java.lang.Integer int5 = element3.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = element3.previousSibling();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        org.jsoup.nodes.Element element6 = document1.attr("<html>\n <head></head>\n <body>\n </body>\n</html>", "body");
        org.jsoup.nodes.Node node8 = document1.removeAttr("<html>\n <head></head>\n <body></body>\n</html><<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>></<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = node8.previousSibling();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element2 = document1.body();
        org.jsoup.nodes.Element element3 = document1.head();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str6 = document5.tagName();
        org.jsoup.nodes.Element element8 = document5.prependElement("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.select.Elements elements11 = document5.getElementsByAttributeValueEnding("\n<body></body>", " html");
        org.jsoup.nodes.Element element12 = document1.prependChild((org.jsoup.nodes.Node) document5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements13 = element12.siblingElements();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueContaining("#document", "\n<body></body>");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.nodes.Element element7 = document1.toggleClass("");
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexGreaterThan(10);
        java.lang.String str10 = document1.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document1.siblingNodes();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        org.jsoup.nodes.Element element4 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element6 = document1.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements7 = element6.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element6.previousElementSibling();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttributeStarting("hi!");
        java.lang.String str5 = document1.attr("<html> <head></head> <body></body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.text("body");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = document1.lastElementSibling();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.prependElement("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        java.lang.String str5 = document1.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<html> \n <head> \n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title> \n </head> \n <body> \n </body>\n</html><#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html><<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>></<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>>");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        org.jsoup.nodes.Element element5 = document1.append("<html>\n <head></head>\n <body>\n </body>\n</html>");
        java.lang.String str6 = document1.toString();
        org.jsoup.select.Elements elements8 = document1.getElementsByTag("<html> <head></head> <body></body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.previousElementSibling();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document1.text("hi!\n<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.addClass("#document");
        java.lang.String str5 = element4.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element4.nextElementSibling();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element2 = document1.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node3 = document1.previousSibling();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str3 = document1.absUrl("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element7 = document1.html("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element9 = document1.appendElement("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element11 = document1.text("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.firstElementSibling();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements16 = document3.getElementsContainingOwnText("#document");
        org.jsoup.nodes.Element element17 = document3.lastElementSibling();
        element17.remove();
        org.jsoup.nodes.Element element20 = element17.prependText("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = element17.toString();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str3 = document1.absUrl("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element7 = document1.html("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element9 = element7.val("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element9.nextElementSibling();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueContaining("#document", "\n<body></body>");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.nodes.Element element7 = document1.toggleClass("");
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexGreaterThan(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = document1.previousSibling();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element13 = document3.body();
        java.lang.String str15 = element13.absUrl("<html> <head></head> <body></body> </html>");
        element13.remove();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element13.nextElementSibling();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        org.jsoup.nodes.Element element5 = document1.append("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element6 = document1.empty();
        org.jsoup.nodes.Element element8 = element6.append("<html> <head></head> <body></body> </html>");
        org.jsoup.nodes.Element element10 = element8.append("\n<body></body>");
        org.jsoup.nodes.Element element12 = element10.appendElement("<html>\n <head>\n  <title>#document</title>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\n </body>\n</html><hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element10.siblingNodes();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document(" html");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = document1.nextElementSibling();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#document");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("#root");
        boolean boolean4 = document1.equals((java.lang.Object) "#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.lastElementSibling();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        org.jsoup.nodes.Element element4 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element6 = document1.text("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document1.siblingNodes();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.select.Elements elements7 = document1.select("#root");
        org.jsoup.nodes.Element element8 = document1.empty();
        org.jsoup.select.Elements elements10 = element8.getElementsByIndexLessThan((int) (byte) 1);
        org.jsoup.select.Elements elements12 = element8.getElementsContainingOwnText("");
        org.jsoup.nodes.Element element14 = element8.prependText("body");
        org.jsoup.nodes.Element element16 = element14.prepend("<#root value=\"\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element14.previousElementSibling();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html> <head></head> <body></body> </html>");
        org.jsoup.parser.Tag tag2 = document1.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document1.siblingNodes();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        java.lang.String str4 = document1.ownText();
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueStarting("#root", "<html>\n <head></head>\n <body>\n </body>\n</html>");
        java.lang.String str8 = document1.nodeName();
        java.lang.String str9 = document1.nodeName();
        java.lang.String str10 = document1.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = document1.previousSibling();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        org.jsoup.select.Elements elements13 = document3.getElementsByIndexGreaterThan(10);
        java.lang.String str14 = document3.tagName();
        java.lang.String str15 = document3.data();
        org.jsoup.nodes.Node node17 = document3.removeAttr("\n<body></body>");
        org.jsoup.nodes.Element element19 = document3.text("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element20 = document3.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document3.title("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root class=\" html\" value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = document1.nextElementSibling();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>", " html");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements5 = document1.siblingElements();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element8 = document3.head();
        org.jsoup.select.Elements elements10 = document3.getElementsByAttribute("html");
        org.jsoup.nodes.Element element11 = document3.previousElementSibling();
        org.jsoup.nodes.Element element12 = document3.empty();
        java.lang.String str13 = document3.baseUri();
        java.lang.String str14 = document3.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document3.title("");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str3 = document1.absUrl("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element7 = document1.html("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element9 = document1.appendElement("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document1.siblingNodes();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.prependElement("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueEnding("\n<body></body>", " html");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeStarting("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element11 = document1.createElement("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = element11.toString();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element6 = element4.child((int) (short) 0);
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute(" hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements9 = element4.siblingElements();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.prependElement("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        java.lang.String str5 = document1.className();
        org.jsoup.parser.Tag tag6 = document1.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.previousElementSibling();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag5 = document3.tag();
        org.jsoup.nodes.Element element7 = document3.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        document3.setBaseUri("");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document3.outputSettings();
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element13 = document12.body();
        boolean boolean14 = document3.equals((java.lang.Object) document12);
        org.jsoup.nodes.Element element16 = document3.addClass(" html");
        org.jsoup.nodes.Element element17 = document3.empty();
        org.jsoup.nodes.Element element19 = document3.appendElement("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = document3.text("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element8 = document3.head();
        org.jsoup.select.Elements elements10 = document3.getElementsByAttribute("html");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element15 = document12.prependChild((org.jsoup.nodes.Node) document14);
        org.jsoup.select.Elements elements17 = document14.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element19 = document14.val("");
        java.lang.String str20 = document14.outerHtml();
        org.jsoup.select.Elements elements22 = document14.getElementsByClass("#root");
        org.jsoup.select.Elements elements24 = document14.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Element element26 = document14.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element28 = element26.val("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element30 = element26.addClass("");
        org.jsoup.nodes.Element element32 = element30.append("#document");
        boolean boolean33 = element32.isBlock();
        document3.replaceWith((org.jsoup.nodes.Node) element32);
        org.jsoup.select.Elements elements36 = document3.getElementsByIndexEquals((int) (byte) 100);
        boolean boolean37 = document3.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements38 = document3.siblingElements();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        java.lang.String str4 = document1.ownText();
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueStarting("#root", "<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements8 = document1.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.firstElementSibling();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        org.jsoup.select.Elements elements13 = document3.getElementsByIndexGreaterThan(10);
        java.lang.Integer int14 = document3.elementSiblingIndex();
        org.jsoup.select.Elements elements15 = document3.getAllElements();
        document3.remove();
        java.lang.String str17 = document3.nodeName();
        java.lang.String str19 = document3.absUrl("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = document3.nextElementSibling();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.new OutputSettings();
        org.jsoup.nodes.Element element10 = document1.appendText("");
        org.jsoup.select.Elements elements13 = document1.getElementsByAttributeValueEnding("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>", "<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = document1.lastElementSibling();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        org.jsoup.nodes.Element element5 = document1.append("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.text("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.jsoup.select.Elements elements10 = element7.getElementsByAttributeValue("\n<html>\n <head></head>\n <body></body>\n</html>", "<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html><<html>\n <head></head>\n <body>\n </body>\n</html>></<html>\n <head></head>\n <body>\n </body>\n</html>>\n</#root>");
        org.jsoup.nodes.Node node12 = element7.removeAttr("<html>\n <head>\n  <title>#document</title>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\n </body>\n</html><hi!></hi!>");
        org.jsoup.select.Elements elements14 = element7.getElementsMatchingText("<html>\n <head></head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements15 = element7.siblingElements();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasClass("");
        org.jsoup.nodes.Document document4 = document1.normalise();
        org.jsoup.nodes.Element element6 = document4.toggleClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements7 = element6.siblingElements();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.util.Set<java.lang.String> strSet5 = element4.classNames();
        java.lang.Integer int6 = element4.siblingIndex();
        boolean boolean8 = element4.hasAttr("hi!");
        org.jsoup.nodes.Element element10 = element4.prepend("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = element4.previousSibling();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueContaining("<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html><<html>\n <head></head>\n <body>\n </body>\n</html>></<html>\n <head></head>\n <body>\n </body>\n</html>>\n</#root>", "#document <html> <head></head> <body></body> </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        boolean boolean6 = element4.hasAttr("hi!");
        boolean boolean8 = element4.hasAttr("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.select.Elements elements11 = element4.getElementsByAttributeValueContaining("<#root>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>", "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element13 = element4.prependElement("hi!\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element15 = element4.appendText("<html>\n <head>\n  <title>#document</title>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\n </body>\n</html><hi!></hi!>");
        org.jsoup.select.Elements elements18 = element15.getElementsByAttributeValueStarting("<html> \n <head></head> \n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;  \n </body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>", "<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements19 = element15.siblingElements();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Element element11 = document3.nextElementSibling();
        org.jsoup.nodes.Element element13 = document3.val("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element14 = document3.parent();
        org.jsoup.nodes.Document document15 = element14.ownerDocument();
        java.lang.String str17 = document15.absUrl("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = document15.new OutputSettings();
        org.jsoup.select.Elements elements20 = document15.getElementsByAttributeStarting("<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str21 = document15.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = document15.firstElementSibling();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html> <head></head> <body></body> </html>");
        document1.title("html");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = document1.previousSibling();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        boolean boolean13 = document11.hasAttr("#root");
        java.util.Set<java.lang.String> strSet14 = document11.classNames();
        org.jsoup.nodes.Document document15 = document11.normalise();
        org.jsoup.nodes.Element element16 = document11.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element16.firstElementSibling();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str3 = document1.absUrl("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element6 = document1.head();
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document7.createElement("<html> <head> <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;</title> </head> <body></body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements10 = document7.siblingElements();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        org.jsoup.nodes.Element element5 = document1.append("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element6 = document1.empty();
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueStarting("<html> <head></head> <body> </body> </html>", " html");
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueNot("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>", " html");
        org.jsoup.nodes.Element element14 = document1.append("<html>\n <head></head>\n <body></body>\n</html><#root value=\"\">\n <#document></#document>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = document1.lastElementSibling();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.prependElement("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.select.Elements elements6 = document1.getElementsContainingText("<html> <head></head> <body></body> </html>");
        org.jsoup.nodes.Element element8 = document1.val(" hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element8.lastElementSibling();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;html\n<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = document1.previousElementSibling();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element6 = element4.child((int) (short) 0);
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        org.jsoup.nodes.Document document8 = element6.ownerDocument();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document8.new OutputSettings();
        document8.title("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = document8.childNodes();
        org.jsoup.nodes.Element element14 = document8.createElement("<html>\n <head></head>\n <body></body>\n</html>#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element14.lastElementSibling();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        org.jsoup.nodes.Element element5 = document1.append("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.text("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.jsoup.select.Elements elements10 = element7.getElementsByAttributeValue("\n<html>\n <head></head>\n <body></body>\n</html>", "<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html><<html>\n <head></head>\n <body>\n </body>\n</html>></<html>\n <head></head>\n <body>\n </body>\n</html>>\n</#root>");
        org.jsoup.nodes.Node node12 = element7.removeAttr("<html>\n <head>\n  <title>#document</title>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\n </body>\n</html><hi!></hi!>");
        org.jsoup.select.Elements elements14 = element7.getElementsMatchingText("<html>\n <head></head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element7.previousElementSibling();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        java.lang.String str4 = document1.ownText();
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueStarting("#root", "<html>\n <head></head>\n <body>\n </body>\n</html>");
        java.lang.String str8 = document1.nodeName();
        java.lang.String str9 = document1.nodeName();
        java.lang.String str10 = document1.outerHtml();
        org.jsoup.nodes.Element element12 = document1.createElement("<#document></#document>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element14 = document1.createElement("\n<html>\n <head></head>\n <body></body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element14.previousElementSibling();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element16 = element14.removeClass("");
        org.jsoup.nodes.Element element18 = element14.removeClass("#root");
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element23 = document20.prependChild((org.jsoup.nodes.Node) document22);
        org.jsoup.select.Elements elements25 = document22.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element27 = document22.val("");
        java.lang.String str28 = document22.outerHtml();
        org.jsoup.select.Elements elements31 = document22.getElementsByAttributeValueStarting("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element32 = element18.appendChild((org.jsoup.nodes.Node) document22);
        org.jsoup.select.Elements elements34 = document22.getElementsMatchingOwnText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document36 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element37 = document36.body();
        org.jsoup.nodes.Element element38 = document36.head();
        org.jsoup.nodes.Document document40 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str41 = document40.tagName();
        org.jsoup.nodes.Element element43 = document40.prependElement("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.select.Elements elements46 = document40.getElementsByAttributeValueEnding("\n<body></body>", " html");
        org.jsoup.nodes.Element element47 = document36.prependChild((org.jsoup.nodes.Node) document40);
        document22.replaceWith((org.jsoup.nodes.Node) document36);
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = document22.outputSettings();
        org.jsoup.nodes.Element element52 = document22.attr("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements54 = document22.getElementsByIndexLessThan(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element55 = document22.nextElementSibling();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element6 = element4.child((int) (short) 0);
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        org.jsoup.nodes.Document document8 = element6.ownerDocument();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document8.new OutputSettings();
        java.lang.String str10 = document8.title();
        java.lang.String str11 = document8.baseUri();
        document8.remove();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements13 = document8.siblingElements();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n <head></head>\n <body>\n </body>\n</html>");
        boolean boolean2 = document1.isBlock();
        java.util.Set<java.lang.String> strSet3 = document1.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.text(" <html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        java.lang.String str4 = document1.ownText();
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueStarting("#root", "<html>\n <head></head>\n <body>\n </body>\n</html>");
        java.lang.String str8 = document1.nodeName();
        java.lang.String str9 = document1.nodeName();
        boolean boolean11 = document1.hasAttr("<#root class=\" html\" value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element13 = document1.createElement(" <html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements14 = element13.siblingElements();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueContaining("#document", "\n<body></body>");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueEnding("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>", "<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        java.lang.String str9 = document1.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.firstElementSibling();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.util.Set<java.lang.String> strSet5 = element4.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element4.lastElementSibling();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.Integer int7 = element6.siblingIndex();
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element12 = document9.prependChild((org.jsoup.nodes.Node) document11);
        org.jsoup.select.Elements elements14 = document11.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element16 = document11.val("");
        java.lang.String str17 = document11.outerHtml();
        org.jsoup.select.Elements elements19 = document11.getElementsByClass("#root");
        java.lang.String str20 = document11.data();
        org.jsoup.nodes.Element element22 = document11.text("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element23 = document11.body();
        element6.replaceWith((org.jsoup.nodes.Node) document11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element6.firstElementSibling();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttributeStarting("hi!");
        boolean boolean4 = document1.isBlock();
        java.lang.String str5 = document1.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<html>\n <head></head>\n <body></body>\n</html><#root #document=\"&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</#root>");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.prependElement("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.select.Elements elements6 = document1.getElementsContainingText("<html> <head></head> <body></body> </html>");
        org.jsoup.nodes.Element element8 = document1.val(" hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document1.outputSettings();
        java.lang.String str10 = document1.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = document1.new OutputSettings();
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = document13.outputSettings();
        org.jsoup.nodes.Element element16 = document13.text("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.Set<java.lang.String> strSet17 = document13.classNames();
        boolean boolean18 = document1.equals((java.lang.Object) document13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<html>\n <head></head>\n <body>\n </body>\n</html>");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element8 = document3.head();
        org.jsoup.select.Elements elements10 = document3.getElementsByAttribute("html");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element15 = document12.prependChild((org.jsoup.nodes.Node) document14);
        org.jsoup.select.Elements elements17 = document14.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element19 = document14.val("");
        java.lang.String str20 = document14.outerHtml();
        org.jsoup.select.Elements elements22 = document14.getElementsByClass("#root");
        org.jsoup.select.Elements elements24 = document14.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Element element26 = document14.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element28 = element26.val("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element30 = element26.addClass("");
        org.jsoup.nodes.Element element32 = element30.append("#document");
        boolean boolean33 = element32.isBlock();
        document3.replaceWith((org.jsoup.nodes.Node) element32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element35 = document3.previousElementSibling();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<#document></#document>\n<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str2 = document1.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document1.firstElementSibling();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element12 = document3.attr("#document", "<html> <head></head> <body> </body> </html>");
        element12.remove();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element12.nextElementSibling();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Element element11 = document3.nextElementSibling();
        org.jsoup.nodes.Element element13 = document3.val("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element14 = document3.parent();
        org.jsoup.nodes.Document document15 = element14.ownerDocument();
        org.jsoup.select.Elements elements16 = document15.children();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = document15.new OutputSettings();
        org.jsoup.nodes.Element element18 = document15.head();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = document15.lastElementSibling();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("<html> <head></head> <body> </body> </html>");
        document3.title("#document");
        org.jsoup.nodes.Element element15 = document3.text("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.select.Elements elements17 = document3.getElementsMatchingOwnText("");
        org.jsoup.nodes.Element element19 = document3.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element24 = document21.prependChild((org.jsoup.nodes.Node) document23);
        org.jsoup.select.Elements elements26 = document23.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document30 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element31 = document28.prependChild((org.jsoup.nodes.Node) document30);
        org.jsoup.select.Elements elements33 = document30.getElementsByIndexLessThan((int) (short) 10);
        boolean boolean34 = document23.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Node node35 = document23.nextSibling();
        org.jsoup.nodes.Document document37 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document39 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element40 = document37.prependChild((org.jsoup.nodes.Node) document39);
        boolean boolean41 = document23.equals((java.lang.Object) element40);
        java.lang.String str42 = document23.tagName();
        boolean boolean43 = document3.equals((java.lang.Object) document23);
        java.lang.String str45 = document23.absUrl("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements47 = document23.getElementsByAttributeStarting("<html>\n <head></head>\n <body></body>\n</html><#root value=\"\">\n <#document></#document>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Element element48 = document23.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element50 = document23.text("<body></body>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Element element11 = document3.body();
        org.jsoup.select.Elements elements13 = element11.getElementsContainingOwnText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        boolean boolean17 = document15.hasClass("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        element11.replaceWith((org.jsoup.nodes.Node) document15);
        org.jsoup.nodes.Element element20 = element11.prependElement("<#root>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document24 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element25 = document22.prependChild((org.jsoup.nodes.Node) document24);
        org.jsoup.select.Elements elements27 = document24.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element29 = document24.val("");
        org.jsoup.nodes.Element element31 = document24.after("#root");
        org.jsoup.nodes.Document document32 = document24.ownerDocument();
        org.jsoup.nodes.Element element35 = document24.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements36 = element35.siblingElements();
        org.jsoup.nodes.Element element38 = element35.before("");
        boolean boolean39 = element35.isBlock();
        org.jsoup.nodes.Document document40 = element35.ownerDocument();
        java.util.Set<java.lang.String> strSet41 = document40.classNames();
        org.jsoup.nodes.Element element43 = document40.toggleClass("<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element44 = element11.prependChild((org.jsoup.nodes.Node) document40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements45 = element44.siblingElements();
    }
}

