package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.select.Elements elements18 = element16.getElementsByIndexEquals((int) '4');
        java.util.Set<java.lang.String> strSet19 = element16.classNames();
        org.jsoup.nodes.Element element20 = element16.empty();
        org.jsoup.select.Elements elements22 = element20.getElementsByIndexGreaterThan(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element20.nextElementSibling();
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        boolean boolean10 = document1.hasAttr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        document1.setBaseUri("<#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements13 = document1.siblingElements();
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document1.childNodes();
        org.jsoup.nodes.Document document9 = document1.normalise();
        org.jsoup.select.Elements elements11 = document1.getElementsByTag("hi!");
        java.lang.String str12 = document1.data();
        org.jsoup.nodes.Element element14 = document1.appendElement("\n<body>\n</body>");
        org.jsoup.nodes.Element element16 = document1.val("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = element16.previousSibling();
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element9 = element7.appendText("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexEquals((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element7.nextElementSibling();
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        document10.title("hi!");
        org.jsoup.nodes.Element element13 = document8.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element15 = element13.html("");
        org.jsoup.nodes.Element element16 = element6.prependChild((org.jsoup.nodes.Node) element13);
        java.lang.String str18 = element6.attr("");
        java.lang.String str19 = element6.val();
        org.jsoup.nodes.Element element21 = element6.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element23 = element21.html("<#root class=\" &lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements24 = element21.siblingElements();
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("\n<hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node2 = document1.previousSibling();
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        document11.title("hi!");
        org.jsoup.nodes.Element element14 = document9.prependChild((org.jsoup.nodes.Node) document11);
        java.lang.String str15 = document9.val();
        java.util.Set<java.lang.String> strSet16 = document9.classNames();
        org.jsoup.nodes.Element element17 = document1.classNames(strSet16);
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        document21.title("hi!");
        org.jsoup.nodes.Element element24 = document19.prependChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Element element26 = element24.html("");
        java.lang.String[] strArray31 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.jsoup.nodes.Element element34 = element24.classNames((java.util.Set<java.lang.String>) strSet32);
        boolean boolean35 = element17.equals((java.lang.Object) element34);
        org.jsoup.select.Elements elements38 = element34.getElementsByAttributeValue("#document", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean39 = element34.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element40 = element34.firstElementSibling();
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Document document4 = document1.normalise();
        boolean boolean5 = document1.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document1.siblingNodes();
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        boolean boolean5 = element3.hasAttr("");
        org.jsoup.nodes.Element element7 = element3.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element3.html("<#root class=\" &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/#root&gt; &lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>#document");
        org.jsoup.nodes.Element element10 = element3.empty();
        org.jsoup.nodes.Element element12 = element3.prepend("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = element12.attr("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>#root", "<head>\n</head>\n<body>\n</body>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element12.siblingNodes();
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document2 = document1.normalise();
        java.lang.String str4 = document2.attr("#root");
        java.lang.String str5 = document2.data();
        org.jsoup.select.Elements elements6 = document2.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = document2.previousSibling();
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Node node11 = document1.removeAttr("hi!");
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element15 = document13.html("hi!");
        org.jsoup.nodes.Element element17 = document13.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str20 = document19.title();
        org.jsoup.nodes.Element element21 = document13.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Element element22 = document1.appendChild((org.jsoup.nodes.Node) document13);
        org.jsoup.nodes.Element element25 = element22.attr("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!", "hi!");
        org.jsoup.nodes.Attributes attributes26 = element25.attributes();
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str29 = document28.title();
        org.jsoup.select.Elements elements32 = document28.getElementsByAttributeValueNot("#root", "#root");
        org.jsoup.nodes.Element element34 = document28.text("");
        boolean boolean35 = element25.equals((java.lang.Object) document28);
        java.lang.String str36 = document28.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList37 = document28.siblingNodes();
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        document10.title("hi!");
        org.jsoup.nodes.Element element13 = document8.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element15 = element13.html("");
        org.jsoup.nodes.Element element16 = element6.prependChild((org.jsoup.nodes.Node) element13);
        java.lang.String str18 = element16.attr("#document");
        java.lang.String str20 = element16.attr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element22 = element16.val("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        java.lang.String str23 = element16.toString();
        org.jsoup.select.Elements elements25 = element16.getElementsByIndexGreaterThan((int) ' ');
        org.jsoup.nodes.Element element27 = element16.appendText("<#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element16.previousElementSibling();
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element11 = element9.addClass("");
        boolean boolean13 = element11.hasClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element11.attr("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>>", "<html> \n <head> \n  <title>#document\n</title>\n </head> \n <body>  \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = element11.nextSibling();
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Element element4 = element2.appendElement("#document");
        org.jsoup.nodes.Element element6 = element4.prepend(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element6.siblingNodes();
        org.jsoup.nodes.Element element10 = element6.attr("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element10.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements12 = element11.siblingElements();
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        document6.title("hi!");
        org.jsoup.nodes.Element element9 = document4.prependChild((org.jsoup.nodes.Node) document6);
        java.lang.String str10 = document4.val();
        java.util.Set<java.lang.String> strSet11 = document4.classNames();
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document4);
        java.lang.Integer int13 = document1.elementSiblingIndex();
        org.jsoup.nodes.Attributes attributes14 = document1.attributes();
        org.jsoup.nodes.Element element16 = document1.append("<#root class=\" &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/#root&gt; &lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>#document");
        java.lang.String str18 = element16.attr("hi! <html> <head> <title>hi!</title> </head> <body> #document </body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element16.previousElementSibling();
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Element element5 = document1.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str8 = document7.title();
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Element element10 = document7.body();
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("");
        document14.title("hi!");
        org.jsoup.nodes.Element element17 = document12.prependChild((org.jsoup.nodes.Node) document14);
        java.lang.String str18 = element17.toString();
        document7.replaceWith((org.jsoup.nodes.Node) element17);
        boolean boolean21 = document7.hasAttr("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element23 = document7.appendElement("<hi!> </hi!>");
        java.lang.String str24 = document7.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = document7.nextElementSibling();
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>&lt;&lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt; class=&quot;&quot;&gt;\n&lt;/&lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;&gt;</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str2 = document1.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node3 = document1.previousSibling();
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element11 = element9.addClass("");
        org.jsoup.nodes.Element element13 = element11.appendText("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.nodes.Element element15 = element11.val("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element15.siblingNodes();
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        document10.title("hi!");
        org.jsoup.nodes.Element element13 = document8.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element15 = element13.html("");
        org.jsoup.nodes.Element element16 = element6.prependChild((org.jsoup.nodes.Node) element13);
        java.lang.String str18 = element16.attr("#document");
        java.lang.String str20 = element16.attr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element22 = element16.val("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.select.Elements elements24 = element22.getElementsByIndexGreaterThan((int) ' ');
        org.jsoup.nodes.Element element26 = element22.val("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element28 = element22.removeClass("<#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.select.Elements elements30 = element28.getElementsByIndexEquals((int) '4');
        org.jsoup.nodes.Element element33 = element28.attr("<html> \n <head> \n  <title>#document\n</title>\n </head> \n <body>  \n </body>\n</html>", "<#root> <#root> hi!\n #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int34 = element28.siblingIndex();
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        document11.title("hi!");
        org.jsoup.nodes.Element element14 = document9.prependChild((org.jsoup.nodes.Node) document11);
        java.lang.String str15 = document9.val();
        java.util.Set<java.lang.String> strSet16 = document9.classNames();
        org.jsoup.nodes.Element element17 = document1.classNames(strSet16);
        org.jsoup.nodes.Element element19 = document1.appendElement("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element21 = document1.html("#root");
        java.util.Set<java.lang.String> strSet22 = element21.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element21.lastElementSibling();
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi! #root");
        org.jsoup.nodes.Element element3 = document1.createElement("&lt;#root&gt; \n<html> \n<head> \n <title>hi!\n </title>\n</head> \n<body>    \n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document1.lastElementSibling();
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        boolean boolean10 = document1.hasAttr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = document1.val("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = element12.append(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements16 = element12.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.nodes.Element element18 = element12.html("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>");
        org.jsoup.select.Elements elements20 = element18.getElementsByTag("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements21 = element18.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int22 = element18.siblingIndex();
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str2 = document1.className();
        org.jsoup.nodes.Element element4 = document1.append("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = element4.toggleClass("");
        org.jsoup.select.Elements elements9 = element4.getElementsByAttributeValueNot("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>", "#root");
        java.util.Set<java.lang.String> strSet10 = element4.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element4.previousElementSibling();
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#document");
        org.jsoup.nodes.Document document2 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.previousElementSibling();
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements3 = document1.getElementsByIndexLessThan((-1));
        java.lang.String str4 = document1.text();
        java.lang.String str5 = document1.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document1.firstElementSibling();
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.select.Elements elements18 = element16.getElementsByIndexEquals((int) '4');
        org.jsoup.select.Elements elements21 = element16.getElementsByAttributeValue("hi!", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document25 = org.jsoup.nodes.Document.createShell("");
        document25.title("hi!");
        org.jsoup.nodes.Element element28 = document23.prependChild((org.jsoup.nodes.Node) document25);
        org.jsoup.nodes.Element element30 = element28.html("");
        java.lang.String str31 = element28.val();
        org.jsoup.nodes.Element element33 = element28.getElementById("hi!");
        org.jsoup.select.Elements elements34 = element28.children();
        org.jsoup.select.Elements elements36 = element28.getElementsByAttribute("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.nodes.Element element37 = element16.prependChild((org.jsoup.nodes.Node) element28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList38 = element16.siblingNodes();
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Element element5 = document1.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.appendElement("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = document1.val("hi!");
        org.jsoup.select.Elements elements11 = element9.select("#document");
        java.lang.String str13 = element9.attr("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.nodes.Node node15 = element9.removeAttr(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str16 = element9.tagName();
        org.jsoup.nodes.Element element18 = element9.prependText(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> <#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element18.lastElementSibling();
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.select.Elements elements4 = document1.getAllElements();
        org.jsoup.nodes.Element element6 = document1.append("#root");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element6.childNodes();
        org.jsoup.nodes.Element element9 = element6.append("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>#root");
        boolean boolean11 = element9.hasAttr("<#root>\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean13 = element9.hasClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = element9.nextSibling();
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Node node11 = document1.removeAttr("hi!");
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexGreaterThan((int) (byte) 1);
        java.lang.String str14 = document1.title();
        org.jsoup.nodes.Element element16 = document1.createElement("#document");
        java.lang.String str17 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = document1.previousSibling();
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        document6.title("hi!");
        org.jsoup.nodes.Element element9 = document4.prependChild((org.jsoup.nodes.Node) document6);
        java.lang.String str10 = document4.val();
        java.util.Set<java.lang.String> strSet11 = document4.classNames();
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document4);
        java.lang.Integer int13 = document1.elementSiblingIndex();
        org.jsoup.nodes.Node node15 = document1.childNode((int) (byte) 0);
        org.jsoup.nodes.Document document16 = document1.normalise();
        org.jsoup.select.Elements elements19 = document1.getElementsByAttributeValue("<html>\n<head>\n <title>#document</title>\n</head>\n<body>\n</body>\n</html>", "hi! <#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>");
        org.jsoup.nodes.Element element21 = document1.append("<#root>\n <html>\n  <head>\n  </head>\n  <body>\n    &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element21.nextElementSibling();
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements3 = document1.getElementsByIndexLessThan((-1));
        document1.title("#document");
        java.lang.String str6 = document1.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.previousElementSibling();
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        document11.title("hi!");
        org.jsoup.nodes.Element element14 = document9.prependChild((org.jsoup.nodes.Node) document11);
        java.lang.String str15 = document9.val();
        java.util.Set<java.lang.String> strSet16 = document9.classNames();
        org.jsoup.nodes.Element element17 = document1.classNames(strSet16);
        java.lang.String str18 = element17.data();
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("");
        document22.title("hi!");
        org.jsoup.nodes.Element element25 = document20.prependChild((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Element element27 = element25.html("");
        java.lang.String[] strArray32 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        org.jsoup.nodes.Element element35 = element25.classNames((java.util.Set<java.lang.String>) strSet33);
        org.jsoup.nodes.Element element36 = element17.classNames((java.util.Set<java.lang.String>) strSet33);
        boolean boolean37 = element17.hasText();
        org.jsoup.nodes.Element element39 = element17.toggleClass("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements41 = element39.getElementsByIndexLessThan((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements42 = element39.siblingElements();
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        document13.title("hi!");
        org.jsoup.nodes.Element element16 = document11.prependChild((org.jsoup.nodes.Node) document13);
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element19 = document11.prependChild((org.jsoup.nodes.Node) document18);
        org.jsoup.nodes.Node node21 = document11.removeAttr("hi!");
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element25 = document23.html("hi!");
        org.jsoup.nodes.Element element27 = document23.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document29 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str30 = document29.title();
        org.jsoup.nodes.Element element31 = document23.prependChild((org.jsoup.nodes.Node) document29);
        org.jsoup.nodes.Element element32 = document11.appendChild((org.jsoup.nodes.Node) document23);
        org.jsoup.nodes.Element element34 = document23.createElement("#root");
        org.jsoup.nodes.Element element36 = document23.createElement("hi!");
        org.jsoup.select.Elements elements37 = document23.getAllElements();
        org.jsoup.nodes.Element element39 = document23.append("");
        java.util.Set<java.lang.String> strSet40 = element39.classNames();
        org.jsoup.nodes.Element element41 = document1.classNames(strSet40);
        java.lang.Integer int42 = element41.elementSiblingIndex();
        boolean boolean43 = element41.hasText();
        boolean boolean45 = element41.hasClass("<html>\n<head>\n <title>#document</title>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements47 = element41.getElementsByAttribute("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>#root");
        java.lang.String str48 = element41.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node49 = element41.nextSibling();
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        document11.title("hi!");
        org.jsoup.nodes.Element element14 = document9.prependChild((org.jsoup.nodes.Node) document11);
        java.lang.String str15 = document9.val();
        java.util.Set<java.lang.String> strSet16 = document9.classNames();
        org.jsoup.nodes.Element element17 = document1.classNames(strSet16);
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        document21.title("hi!");
        org.jsoup.nodes.Element element24 = document19.prependChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Element element26 = element24.html("");
        java.lang.String[] strArray31 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.jsoup.nodes.Element element34 = element24.classNames((java.util.Set<java.lang.String>) strSet32);
        boolean boolean35 = element17.equals((java.lang.Object) element34);
        org.jsoup.nodes.Element element37 = element34.append("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element39 = element37.appendText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element41 = element39.toggleClass("<#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root><#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        java.lang.String str42 = element39.text();
        org.jsoup.nodes.Element element44 = element39.append("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements45 = element39.siblingElements();
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        document10.title("hi!");
        org.jsoup.nodes.Element element13 = document8.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element15 = element13.html("");
        org.jsoup.nodes.Element element16 = element6.prependChild((org.jsoup.nodes.Node) element13);
        java.lang.String str18 = element16.attr("#document");
        java.lang.String str20 = element16.attr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element22 = element16.val("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        java.lang.String str23 = element16.toString();
        org.jsoup.select.Elements elements25 = element16.getElementsByIndexGreaterThan((int) ' ');
        org.jsoup.nodes.Element element27 = element16.appendText("<#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element27.nextElementSibling();
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        document13.title("hi!");
        org.jsoup.nodes.Element element16 = document11.prependChild((org.jsoup.nodes.Node) document13);
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element19 = document11.prependChild((org.jsoup.nodes.Node) document18);
        org.jsoup.nodes.Node node21 = document11.removeAttr("hi!");
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element25 = document23.html("hi!");
        org.jsoup.nodes.Element element27 = document23.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document29 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str30 = document29.title();
        org.jsoup.nodes.Element element31 = document23.prependChild((org.jsoup.nodes.Node) document29);
        org.jsoup.nodes.Element element32 = document11.appendChild((org.jsoup.nodes.Node) document23);
        org.jsoup.nodes.Element element34 = document23.createElement("#root");
        org.jsoup.nodes.Element element36 = document23.createElement("hi!");
        org.jsoup.select.Elements elements37 = document23.getAllElements();
        org.jsoup.nodes.Element element39 = document23.append("");
        java.util.Set<java.lang.String> strSet40 = element39.classNames();
        org.jsoup.nodes.Element element41 = document1.classNames(strSet40);
        org.jsoup.parser.Tag tag42 = document1.tag();
        org.jsoup.select.Elements elements45 = document1.getElementsByAttributeValueStarting("<html>\n<head>\n <title>#document</title>\n</head>\n<body>\n</body>\n</html>", "#root");
        java.lang.String str46 = document1.outerHtml();
        java.lang.String str47 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element48 = document1.previousElementSibling();
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Node node10 = document8.childNode(0);
        org.jsoup.nodes.Node node12 = document8.childNode((int) (short) 0);
        java.lang.String str14 = document8.absUrl("<#root>\n <html>\n  <head>\n  </head>\n  <body>\n    &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element15 = document8.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements16 = element15.siblingElements();
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean3 = document1.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document1.previousElementSibling();
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexLessThan((int) ' ');
        java.lang.String str10 = document1.nodeName();
        org.jsoup.nodes.Element element12 = document1.html("#root");
        org.jsoup.select.Elements elements14 = document1.getElementsByAttribute(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = document1.toggleClass("<#root>\n<#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root><#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>");
        org.jsoup.nodes.Element element18 = element16.removeClass("<<#root>\n<#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root><#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>>\n</<#root>\n<#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root><#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>>\n<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element18.previousElementSibling();
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        java.lang.String str10 = document1.title();
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element14 = document12.html("hi!");
        org.jsoup.nodes.Element element16 = document12.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str19 = document18.title();
        org.jsoup.nodes.Element element20 = document12.prependChild((org.jsoup.nodes.Node) document18);
        boolean boolean21 = document18.hasText();
        document18.remove();
        java.util.Set<java.lang.String> strSet23 = document18.classNames();
        java.util.Set<java.lang.String> strSet24 = document18.classNames();
        org.jsoup.nodes.Element element25 = document1.classNames(strSet24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements26 = element25.siblingElements();
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element9 = element7.appendText("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element7.appendElement("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element7.removeClass("");
        org.jsoup.select.Elements elements14 = element13.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = element13.previousSibling();
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = document1.toggleClass("#root");
        org.jsoup.select.Elements elements10 = element8.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element12 = element8.removeClass("body");
        org.jsoup.nodes.Element element14 = element8.appendElement("&lt;#root&gt; \n <html> \n  <head> \n   <title>hi!\n </title>\n  </head> \n  <body>    \n   <html> \n    <head> \n    </head> \n    <body>  \n    </body>\n   </html>\n  </body>\n </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element8.siblingNodes();
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        java.lang.String str8 = document1.tagName();
        org.jsoup.nodes.Node node10 = document1.removeAttr(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = document1.prependElement("hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!");
        java.lang.String str13 = document1.className();
        org.jsoup.nodes.Document document14 = document1.normalise();
        org.jsoup.nodes.Element element15 = document14.body();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList16 = document14.siblingNodes();
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        document11.title("hi!");
        org.jsoup.nodes.Element element14 = document9.prependChild((org.jsoup.nodes.Node) document11);
        java.lang.String str15 = document9.val();
        java.util.Set<java.lang.String> strSet16 = document9.classNames();
        org.jsoup.nodes.Element element17 = document1.classNames(strSet16);
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        document21.title("hi!");
        org.jsoup.nodes.Element element24 = document19.prependChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Element element26 = element24.html("");
        java.lang.String[] strArray31 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.jsoup.nodes.Element element34 = element24.classNames((java.util.Set<java.lang.String>) strSet32);
        boolean boolean35 = element17.equals((java.lang.Object) element34);
        org.jsoup.select.Elements elements38 = element34.getElementsByAttributeValue("#document", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean39 = element34.isBlock();
        org.jsoup.select.Elements elements41 = element34.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root>\n<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>&lt;#root&gt; \n<html> \n<head> \n</head> \n<body>   &lt;#root&gt; \n <html> \n  <head> \n   <title>hi! </title>\n  </head> \n  <body>    \n   <html> \n    <head> \n    </head> \n    <body>  hi!\n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element43 = element34.wrap("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        document6.title("hi!");
        org.jsoup.nodes.Element element9 = document4.prependChild((org.jsoup.nodes.Node) document6);
        java.lang.String str10 = document4.val();
        java.util.Set<java.lang.String> strSet11 = document4.classNames();
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document4);
        org.jsoup.nodes.Element element14 = document1.html("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = document1.addClass("");
        document1.title("hi!");
        java.lang.String str19 = document1.tagName();
        org.jsoup.nodes.Element element21 = document1.removeClass("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html><#document>\n</#document>");
        document1.title("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>#root");
        org.jsoup.nodes.Element element25 = document1.createElement("<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html> hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = document1.wrap("<#root>\n   <html>\n    <head>\n    </head>\n    <body>\n    </body>\n   </html>\n  </#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document3.siblingNodes();
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        document11.title("hi!");
        org.jsoup.nodes.Element element14 = document9.prependChild((org.jsoup.nodes.Node) document11);
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element17 = document9.prependChild((org.jsoup.nodes.Node) document16);
        org.jsoup.nodes.Node node19 = document9.removeAttr("hi!");
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element23 = document21.html("hi!");
        org.jsoup.nodes.Element element25 = document21.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document27 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str28 = document27.title();
        org.jsoup.nodes.Element element29 = document21.prependChild((org.jsoup.nodes.Node) document27);
        org.jsoup.nodes.Element element30 = document9.appendChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Element element32 = document21.createElement("#root");
        java.lang.String str33 = document21.className();
        org.jsoup.nodes.Element element35 = document21.appendText("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        document3.replaceWith((org.jsoup.nodes.Node) document21);
        org.jsoup.select.Elements elements37 = document21.children();
        org.jsoup.nodes.Element element38 = document21.parent();
        org.jsoup.nodes.Element element40 = element38.html("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element41 = element38.lastElementSibling();
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element11 = element9.addClass("");
        org.jsoup.nodes.Element element13 = element11.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element11.attr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", " <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements17 = element16.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element16.firstElementSibling();
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        document6.title("hi!");
        org.jsoup.nodes.Element element9 = document4.prependChild((org.jsoup.nodes.Node) document6);
        java.lang.String str10 = document4.val();
        java.util.Set<java.lang.String> strSet11 = document4.classNames();
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document4);
        java.lang.String str13 = element12.val();
        org.jsoup.nodes.Element element15 = element12.append("<#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element12.wrap("<html>\n <head>\n  <title>hi! &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!</title>\n </head>\n <body>\n </body>\n</html>");
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        boolean boolean10 = document1.hasAttr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = document1.val("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str13 = element12.val();
        org.jsoup.nodes.Element element15 = element12.html("body");
        org.jsoup.select.Elements elements18 = element15.getElementsByAttributeValue("<#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html> hi!", " &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.nodes.Element element20 = element15.html("head");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList21 = element20.siblingNodes();
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Element element5 = document1.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.appendElement("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = document1.val("hi!");
        java.lang.String str10 = document1.title();
        java.lang.String str11 = document1.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.previousElementSibling();
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.nodes.Attributes attributes8 = document1.attributes();
        org.jsoup.nodes.Document document9 = document1.normalise();
        java.lang.String str10 = document9.outerHtml();
        org.jsoup.nodes.Element element12 = document9.toggleClass("<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element14 = document9.removeClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document9.siblingNodes();
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        document11.title("hi!");
        org.jsoup.nodes.Element element14 = document9.prependChild((org.jsoup.nodes.Node) document11);
        java.lang.String str15 = document9.val();
        java.util.Set<java.lang.String> strSet16 = document9.classNames();
        org.jsoup.nodes.Element element17 = document1.classNames(strSet16);
        org.jsoup.nodes.Element element19 = document1.appendElement("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements21 = document1.getElementsByTag("body");
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        boolean boolean24 = document1.equals((java.lang.Object) document23);
        org.jsoup.nodes.Element element26 = document1.text("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root class=\"\">\n<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList27 = element26.siblingNodes();
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = document1.toggleClass("#root");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document1.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.previousElementSibling();
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.select.Elements elements17 = element6.getAllElements();
        boolean boolean19 = element6.hasClass("");
        org.jsoup.nodes.Node node21 = element6.removeAttr("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str22 = element6.val();
        org.jsoup.nodes.Element element24 = element6.prependElement("#document");
        org.jsoup.select.Elements elements26 = element6.getElementsByIndexLessThan((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node27 = element6.nextSibling();
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueContaining("#root", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str5 = document1.title();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexGreaterThan((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.nextElementSibling();
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document1.childNodes();
        org.jsoup.select.Elements elements10 = document1.getElementsByClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str11 = document1.title();
        org.jsoup.nodes.Element element13 = document1.append("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>");
        org.jsoup.nodes.Element element15 = element13.prependText("#document");
        org.jsoup.nodes.Element element17 = element13.append("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element17.firstElementSibling();
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        document10.title("hi!");
        org.jsoup.nodes.Element element13 = document8.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element15 = element13.html("");
        org.jsoup.nodes.Element element16 = element6.prependChild((org.jsoup.nodes.Node) element13);
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("");
        document20.title("hi!");
        org.jsoup.nodes.Element element23 = document18.prependChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Document document25 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element26 = document18.prependChild((org.jsoup.nodes.Node) document25);
        org.jsoup.nodes.Element element28 = element26.addClass("");
        org.jsoup.nodes.Element element30 = element28.appendText("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.nodes.Element element31 = element6.prependChild((org.jsoup.nodes.Node) element28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int32 = element6.siblingIndex();
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexLessThan((int) ' ');
        org.jsoup.select.Elements elements10 = document1.children();
        org.jsoup.nodes.Attributes attributes11 = document1.attributes();
        java.lang.String str12 = document1.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document1.firstElementSibling();
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        document11.title("hi!");
        org.jsoup.nodes.Element element14 = document9.prependChild((org.jsoup.nodes.Node) document11);
        java.lang.String str15 = document9.val();
        java.util.Set<java.lang.String> strSet16 = document9.classNames();
        org.jsoup.nodes.Element element17 = document1.classNames(strSet16);
        org.jsoup.nodes.Element element19 = document1.appendElement("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element21 = document1.html("#root");
        org.jsoup.select.Elements elements23 = element21.getElementsByTag("hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!");
        java.lang.String str24 = element21.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node25 = element21.nextSibling();
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        document11.title("hi!");
        org.jsoup.nodes.Element element14 = document9.prependChild((org.jsoup.nodes.Node) document11);
        java.lang.String str15 = document9.val();
        java.util.Set<java.lang.String> strSet16 = document9.classNames();
        org.jsoup.nodes.Element element17 = document1.classNames(strSet16);
        java.lang.String str18 = element17.data();
        org.jsoup.nodes.Element element20 = element17.getElementById("#root");
        org.jsoup.nodes.Element element22 = element17.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = element22.wrap(" <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <title>hi!</title> </#root> <#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root><#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Element element5 = document1.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str8 = document7.title();
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Element element10 = document7.body();
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("");
        document14.title("hi!");
        org.jsoup.nodes.Element element17 = document12.prependChild((org.jsoup.nodes.Node) document14);
        java.lang.String str18 = element17.toString();
        document7.replaceWith((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element20 = document7.body();
        java.lang.String str21 = document7.outerHtml();
        boolean boolean23 = document7.hasAttr("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element25 = document7.createElement("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element27 = document7.text("<#root>\n<html>\n <head>\n </head>\n <body> &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; hi!\n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element27.nextElementSibling();
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element10 = document1.append("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element10.siblingNodes();
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList2 = document1.siblingNodes();
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#document");
        org.jsoup.nodes.Document document2 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.lastElementSibling();
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("");
        document20.title("hi!");
        org.jsoup.nodes.Element element23 = document18.prependChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Document document25 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element26 = document18.prependChild((org.jsoup.nodes.Node) document25);
        org.jsoup.nodes.Element element27 = element16.prependChild((org.jsoup.nodes.Node) element26);
        java.lang.String str28 = element16.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements29 = element16.siblingElements();
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        document11.title("hi!");
        org.jsoup.nodes.Element element14 = document9.prependChild((org.jsoup.nodes.Node) document11);
        java.lang.String str15 = document9.val();
        java.util.Set<java.lang.String> strSet16 = document9.classNames();
        org.jsoup.nodes.Element element17 = document1.classNames(strSet16);
        org.jsoup.nodes.Element element19 = document1.appendElement("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element21 = document1.html("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element21.siblingNodes();
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexLessThan((int) ' ');
        java.lang.String str10 = document1.nodeName();
        org.jsoup.nodes.Element element12 = document1.html("#root");
        org.jsoup.select.Elements elements14 = document1.getElementsByAttribute(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = document1.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document1.wrap("<#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        document6.title("hi!");
        org.jsoup.nodes.Element element9 = document4.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element12 = document4.prependChild((org.jsoup.nodes.Node) document11);
        org.jsoup.select.Elements elements14 = document4.getElementsByIndexLessThan((int) (byte) 0);
        org.jsoup.nodes.Element element16 = document4.createElement("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements19 = document4.getElementsByAttributeValue("#root", "hi!");
        org.jsoup.nodes.Element element20 = document1.prependChild((org.jsoup.nodes.Node) document4);
        document4.title("#document");
        org.jsoup.nodes.Element element23 = document4.lastElementSibling();
        element23.remove();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element23.lastElementSibling();
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        boolean boolean10 = document1.hasAttr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = document1.val("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document1.wrap("hi!");
        java.lang.String str15 = document1.outerHtml();
        org.jsoup.select.Elements elements18 = document1.getElementsByAttributeValueContaining("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!", "<head>\n</head>\n<body>\n</body>");
        java.lang.String str19 = document1.tagName();
        document1.title("&lt;#root&gt; \n<html> \n<head> \n <title>hi!\n </title>\n</head> \n<body>    \n <html> \n  <head> \n  </head> \n  <body>  &lt;#root class=&quot; &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&quot;&gt; \n  </body>\n </html>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = document1.firstElementSibling();
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("");
        document20.title("hi!");
        org.jsoup.nodes.Element element23 = document18.prependChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Document document25 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element26 = document18.prependChild((org.jsoup.nodes.Node) document25);
        org.jsoup.nodes.Element element27 = element16.prependChild((org.jsoup.nodes.Node) element26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int28 = element27.siblingIndex();
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        boolean boolean5 = element3.hasAttr("");
        org.jsoup.nodes.Element element7 = element3.toggleClass("hi!");
        java.lang.String str8 = element7.html();
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document10.empty();
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        document15.title("hi!");
        org.jsoup.nodes.Element element18 = document13.prependChild((org.jsoup.nodes.Node) document15);
        java.lang.String str19 = document13.val();
        java.util.Set<java.lang.String> strSet20 = document13.classNames();
        org.jsoup.nodes.Element element21 = element11.classNames(strSet20);
        java.lang.String str23 = element11.attr("#root");
        org.jsoup.nodes.Element element24 = element7.appendChild((org.jsoup.nodes.Node) element11);
        org.jsoup.nodes.Element element26 = element24.appendElement("<#root class=\" &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/#root&gt; &lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>#document");
        org.jsoup.select.Elements elements27 = element24.children();
        java.lang.String str28 = element24.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = element24.wrap("<#root>\n   <html>\n    <head>\n    </head>\n    <body>\n    </body>\n   </html>\n  </#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str6 = document1.id();
        document1.title("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.firstElementSibling();
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        document10.title("hi!");
        org.jsoup.nodes.Element element13 = document8.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element15 = element13.html("");
        org.jsoup.nodes.Element element16 = element6.prependChild((org.jsoup.nodes.Node) element13);
        org.jsoup.nodes.Element element18 = element6.append("#document");
        boolean boolean19 = element6.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int20 = element6.siblingIndex();
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        document11.title("hi!");
        org.jsoup.nodes.Element element14 = document9.prependChild((org.jsoup.nodes.Node) document11);
        java.lang.String str15 = document9.val();
        java.util.Set<java.lang.String> strSet16 = document9.classNames();
        org.jsoup.nodes.Element element17 = document1.classNames(strSet16);
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        document21.title("hi!");
        org.jsoup.nodes.Element element24 = document19.prependChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Element element26 = element24.html("");
        java.lang.String[] strArray31 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.jsoup.nodes.Element element34 = element24.classNames((java.util.Set<java.lang.String>) strSet32);
        boolean boolean35 = element17.equals((java.lang.Object) element34);
        org.jsoup.nodes.Element element37 = element34.append("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node38 = element34.previousSibling();
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.parser.Tag tag6 = document1.tag();
        java.lang.String str7 = document1.toString();
        org.jsoup.select.Elements elements9 = document1.getElementsByTag("\n<html <#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root><#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>=\"&lt;html&gt;\n&lt;head&gt;\n &lt;title&gt;hi!&lt;/title&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;&amp;lt;#root&amp;gt; &amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;title&amp;gt;hi!&amp;lt;/title&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt; &amp;lt;/#root&amp;gt; &amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\">\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.lastElementSibling();
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Element element5 = document1.val("hi!");
        org.jsoup.nodes.Element element6 = document1.parent();
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueNot("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!<<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "<#root>\n<#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root><#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>");
        java.lang.String str10 = document1.nodeName();
        org.jsoup.nodes.Element element12 = document1.appendElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean13 = document1.hasText();
        document1.title("html");
        java.lang.String str16 = document1.outerHtml();
        org.jsoup.select.Elements elements18 = document1.getElementsByIndexLessThan((int) (byte) 10);
        java.lang.String str19 = document1.nodeName();
        org.jsoup.nodes.Element element20 = document1.head();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = document1.wrap("&lt;#root&gt; \n<html> \n<head> \n <title>hi!\n </title>\n</head> \n<body>    \n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        boolean boolean7 = element6.hasText();
        org.jsoup.nodes.Node node9 = element6.removeAttr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element6.nextElementSibling();
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexLessThan((int) ' ');
        java.lang.String str10 = document1.nodeName();
        org.jsoup.nodes.Element element12 = document1.html("#root");
        org.jsoup.select.Elements elements14 = document1.getElementsByAttribute(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = document1.toggleClass("<#root>\n<#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root><#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>");
        org.jsoup.nodes.Element element18 = element16.removeClass("<<#root>\n<#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root><#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>>\n</<#root>\n<#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root><#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>>\n<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean20 = element18.hasAttr("<#root>\n<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = element18.nextSibling();
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str2 = document1.data();
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        document6.title("hi!");
        org.jsoup.nodes.Element element9 = document4.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element12 = document4.prependChild((org.jsoup.nodes.Node) document11);
        org.jsoup.nodes.Node node14 = document4.removeAttr("hi!");
        org.jsoup.select.Elements elements16 = document4.getElementsByIndexGreaterThan((int) (byte) 1);
        java.lang.String str17 = document4.title();
        org.jsoup.nodes.Element element19 = document4.createElement("#document");
        org.jsoup.nodes.Element element21 = document4.html("<html>\n<head>\n <title>#document</title>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element22 = document1.appendChild((org.jsoup.nodes.Node) document4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = element22.previousSibling();
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Node node11 = document1.removeAttr("hi!");
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element15 = document13.html("hi!");
        org.jsoup.nodes.Element element17 = document13.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str20 = document19.title();
        org.jsoup.nodes.Element element21 = document13.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Element element22 = document1.appendChild((org.jsoup.nodes.Node) document13);
        org.jsoup.nodes.Element element24 = document13.createElement("#root");
        org.jsoup.nodes.Element element26 = document13.createElement("hi!");
        org.jsoup.select.Elements elements29 = document13.getElementsByAttributeValueStarting("<html>\n <head>\n </head>\n <body>\n </body>\n</html>", "<#root class=\" &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/#root&gt; &lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>#document");
        org.jsoup.select.Elements elements30 = document13.children();
        org.jsoup.nodes.Element element32 = document13.wrap("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root class=\"\">\n<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>");
        org.jsoup.nodes.Element element34 = document13.createElement("hi! <#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element36 = element34.wrap("\n<head>\n <title>hi!</title>\n</head>");
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        boolean boolean5 = element3.hasAttr("");
        org.jsoup.nodes.Element element7 = element3.toggleClass("hi!");
        org.jsoup.parser.Tag tag8 = element3.tag();
        java.lang.Integer int9 = element3.elementSiblingIndex();
        org.jsoup.select.Elements elements10 = element3.getAllElements();
        java.lang.String str11 = element3.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int12 = element3.siblingIndex();
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Node node11 = document1.removeAttr("hi!");
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element15 = document13.html("hi!");
        org.jsoup.nodes.Element element17 = document13.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str20 = document19.title();
        org.jsoup.nodes.Element element21 = document13.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Element element22 = document1.appendChild((org.jsoup.nodes.Node) document13);
        org.jsoup.nodes.Element element24 = element22.prependText("<html>\n<head>\n <title>#document</title>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element22.previousElementSibling();
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Node node11 = document1.removeAttr("hi!");
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexGreaterThan((int) (byte) 1);
        java.lang.String str14 = document1.title();
        org.jsoup.nodes.Element element16 = document1.createElement("#document");
        org.jsoup.nodes.Element element18 = document1.html("<html>\n<head>\n <title>#document</title>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = element18.nextSibling();
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Node node11 = document1.removeAttr("hi!");
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element15 = document13.html("hi!");
        org.jsoup.nodes.Element element17 = document13.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str20 = document19.title();
        org.jsoup.nodes.Element element21 = document13.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Element element22 = document1.appendChild((org.jsoup.nodes.Node) document13);
        org.jsoup.nodes.Element element25 = element22.attr("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!", "hi!");
        org.jsoup.nodes.Attributes attributes26 = element25.attributes();
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str29 = document28.title();
        org.jsoup.select.Elements elements32 = document28.getElementsByAttributeValueNot("#root", "#root");
        org.jsoup.nodes.Element element34 = document28.text("");
        boolean boolean35 = element25.equals((java.lang.Object) document28);
        java.lang.String str36 = document28.outerHtml();
        org.jsoup.nodes.Element element38 = document28.appendText("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements40 = document28.getElementsByIndexLessThan((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node41 = document28.previousSibling();
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        document10.title("hi!");
        org.jsoup.nodes.Element element13 = document8.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element15 = element13.html("");
        org.jsoup.nodes.Element element16 = element6.prependChild((org.jsoup.nodes.Node) element13);
        java.lang.String str18 = element16.attr("#document");
        java.lang.String str20 = element16.attr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str22 = element16.absUrl("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements23 = element16.siblingElements();
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        document6.title("hi!");
        org.jsoup.nodes.Element element9 = document4.prependChild((org.jsoup.nodes.Node) document6);
        java.lang.String str10 = document4.val();
        java.util.Set<java.lang.String> strSet11 = document4.classNames();
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document4);
        java.lang.Integer int13 = document1.elementSiblingIndex();
        org.jsoup.nodes.Node node15 = document1.childNode((int) (byte) 0);
        org.jsoup.nodes.Document document16 = document1.normalise();
        org.jsoup.select.Elements elements18 = document16.getElementsByTag("<#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element19 = document16.body();
        org.jsoup.nodes.Attributes attributes20 = document16.attributes();
        org.jsoup.nodes.Element element22 = document16.createElement("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root>\n<#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root><#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList23 = element22.siblingNodes();
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        document11.title("hi!");
        org.jsoup.nodes.Element element14 = document9.prependChild((org.jsoup.nodes.Node) document11);
        java.lang.String str15 = document9.val();
        java.util.Set<java.lang.String> strSet16 = document9.classNames();
        org.jsoup.nodes.Element element17 = document1.classNames(strSet16);
        org.jsoup.select.Elements elements18 = document1.getAllElements();
        org.jsoup.nodes.Element element19 = document1.head();
        java.lang.String str20 = document1.id();
        org.jsoup.nodes.Element element22 = document1.text("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n  #root\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element22.nextElementSibling();
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        document6.title("hi!");
        org.jsoup.nodes.Element element9 = document4.prependChild((org.jsoup.nodes.Node) document6);
        java.lang.String str10 = document4.val();
        java.util.Set<java.lang.String> strSet11 = document4.classNames();
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document4);
        java.lang.String str14 = document4.absUrl("hi!");
        org.jsoup.nodes.Element element16 = document4.toggleClass("#document");
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document19 = document18.normalise();
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("");
        document23.title("hi!");
        org.jsoup.nodes.Element element26 = document21.prependChild((org.jsoup.nodes.Node) document23);
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element29 = document21.prependChild((org.jsoup.nodes.Node) document28);
        org.jsoup.select.Elements elements31 = document21.getElementsByIndexLessThan((int) (byte) 0);
        org.jsoup.nodes.Element element33 = document21.createElement("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements36 = document21.getElementsByAttributeValue("#root", "hi!");
        org.jsoup.nodes.Element element37 = document18.prependChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Element element39 = element37.append("");
        boolean boolean40 = element37.hasText();
        element16.replaceWith((org.jsoup.nodes.Node) element37);
        org.jsoup.nodes.Element element43 = element16.val("#root");
        org.jsoup.nodes.Element element46 = element16.attr("hi! <#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root>\n<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root> &lt;#root&gt; \n<html> \n<head> \n</head> \n<body>   &lt;#root&gt; \n <html> \n  <head> \n   <title>hi!\n </title>\n  </head> \n  <body>    \n   <html> \n    <head> \n    </head> \n    <body>  \n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int47 = element46.siblingIndex();
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Attributes attributes10 = element9.attributes();
        boolean boolean11 = element9.hasText();
        org.jsoup.nodes.Element element13 = element9.val("#document");
        org.jsoup.nodes.Element element15 = element13.html("<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>");
        boolean boolean17 = element13.hasClass("body");
        org.jsoup.nodes.Element element19 = element13.addClass("hi! #root hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements20 = element19.siblingElements();
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document1.childNodes();
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("");
        document12.title("hi!");
        org.jsoup.nodes.Element element15 = document10.prependChild((org.jsoup.nodes.Node) document12);
        org.jsoup.parser.Tag tag16 = document10.tag();
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("");
        document20.title("hi!");
        org.jsoup.nodes.Element element23 = document18.prependChild((org.jsoup.nodes.Node) document20);
        java.lang.String str24 = document18.val();
        java.util.Set<java.lang.String> strSet25 = document18.classNames();
        org.jsoup.nodes.Element element26 = document10.classNames(strSet25);
        boolean boolean27 = document1.equals((java.lang.Object) strSet25);
        org.jsoup.select.Elements elements29 = document1.getElementsByClass("<head>\n</head>\n<body>\n</body>");
        org.jsoup.nodes.Element element31 = document1.appendText("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node32 = document1.nextSibling();
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        document6.title("hi!");
        org.jsoup.nodes.Element element9 = document4.prependChild((org.jsoup.nodes.Node) document6);
        java.lang.String str10 = document4.val();
        java.util.Set<java.lang.String> strSet11 = document4.classNames();
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document4);
        org.jsoup.nodes.Element element14 = document1.html("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = document1.addClass("");
        org.jsoup.select.Elements elements18 = document1.getElementsByIndexLessThan((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = document1.firstElementSibling();
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element9 = element7.appendText("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements12 = element7.getElementsByAttributeValue("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!", "&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        java.lang.String str13 = element7.html();
        org.jsoup.select.Elements elements15 = element7.getElementsByClass("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element7.wrap("<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html><#root class=\" &lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>");
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str7 = document1.val();
        java.util.Set<java.lang.String> strSet8 = document1.classNames();
        java.lang.String str10 = document1.attr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = document1.removeClass("<hi!> </hi!>");
        java.lang.String str14 = element12.attr("<html>\n<head>\n <title>#document</title>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements16 = element12.getElementsByTag("\n<hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element12.lastElementSibling();
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("");
        document20.title("hi!");
        org.jsoup.nodes.Element element23 = document18.prependChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Document document25 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element26 = document18.prependChild((org.jsoup.nodes.Node) document25);
        org.jsoup.nodes.Element element27 = element16.prependChild((org.jsoup.nodes.Node) element26);
        org.jsoup.select.Elements elements30 = element16.getElementsByAttributeValueEnding("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document32 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document34 = org.jsoup.nodes.Document.createShell("");
        document34.title("hi!");
        org.jsoup.nodes.Element element37 = document32.prependChild((org.jsoup.nodes.Node) document34);
        org.jsoup.nodes.Document document39 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document41 = org.jsoup.nodes.Document.createShell("");
        document41.title("hi!");
        org.jsoup.nodes.Element element44 = document39.prependChild((org.jsoup.nodes.Node) document41);
        org.jsoup.nodes.Element element46 = element44.html("");
        org.jsoup.nodes.Element element47 = element37.prependChild((org.jsoup.nodes.Node) element44);
        java.lang.String str49 = element47.attr("#document");
        java.lang.String str51 = element47.attr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements53 = element47.getElementsByTag("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>");
        org.jsoup.nodes.Element element54 = element16.prependChild((org.jsoup.nodes.Node) element47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int55 = element54.siblingIndex();
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Element element5 = document1.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.toggleClass("hi!");
        java.lang.String str8 = element7.baseUri();
        element7.setBaseUri("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = element7.prependText("<#root>\n <html>\n  <head>\n  </head>\n  <body>\n    &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = element12.previousSibling();
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("");
        document20.title("hi!");
        org.jsoup.nodes.Element element23 = document18.prependChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Document document25 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element26 = document18.prependChild((org.jsoup.nodes.Node) document25);
        org.jsoup.nodes.Element element27 = element16.prependChild((org.jsoup.nodes.Node) element26);
        java.util.List<org.jsoup.nodes.Node> nodeList28 = element16.childNodes();
        org.jsoup.nodes.Element element30 = element16.html("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList31 = element30.siblingNodes();
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        document6.title("hi!");
        org.jsoup.nodes.Element element9 = document4.prependChild((org.jsoup.nodes.Node) document6);
        java.lang.String str10 = document4.val();
        java.util.Set<java.lang.String> strSet11 = document4.classNames();
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document4);
        org.jsoup.nodes.Element element14 = document1.html("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = document1.addClass("");
        document1.title("hi!");
        java.lang.String str19 = document1.tagName();
        org.jsoup.nodes.Element element21 = document1.removeClass("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html><#document>\n</#document>");
        document1.title("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>#root");
        org.jsoup.nodes.Element element25 = document1.createElement("<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html> hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element25.wrap("&lt;#root&gt; \n <html> \n  <head> \n   <title>hi!\n </title>\n  </head> \n  <body>    \n   <html> \n    <head> \n    </head> \n    <body>  \n    </body>\n   </html>\n  </body>\n </html>");
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        document11.title("hi!");
        org.jsoup.nodes.Element element14 = document9.prependChild((org.jsoup.nodes.Node) document11);
        java.lang.String str15 = document9.val();
        java.util.Set<java.lang.String> strSet16 = document9.classNames();
        org.jsoup.nodes.Element element17 = document1.classNames(strSet16);
        org.jsoup.select.Elements elements18 = document1.getAllElements();
        org.jsoup.select.Elements elements21 = document1.getElementsByAttributeValue(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.select.Elements elements23 = document1.getElementsByIndexGreaterThan((int) '4');
        java.lang.String str24 = document1.title();
        org.jsoup.select.Elements elements25 = document1.children();
        org.jsoup.nodes.Element element27 = document1.wrap("hi! #root");
        java.lang.Integer int28 = document1.elementSiblingIndex();
        boolean boolean30 = document1.hasClass(" #root");
        org.jsoup.nodes.Element element32 = document1.appendElement("hi! <#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>");
        org.jsoup.nodes.Element element34 = document1.val("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n  #root\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element35 = document1.previousElementSibling();
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        document6.title("hi!");
        org.jsoup.nodes.Element element9 = document4.prependChild((org.jsoup.nodes.Node) document6);
        java.lang.String str10 = document4.val();
        java.util.Set<java.lang.String> strSet11 = document4.classNames();
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document4);
        document1.title(" &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements15 = document1.siblingElements();
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        document6.title("hi!");
        org.jsoup.nodes.Element element9 = document4.prependChild((org.jsoup.nodes.Node) document6);
        java.lang.String str10 = document4.val();
        java.util.Set<java.lang.String> strSet11 = document4.classNames();
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document4);
        java.lang.Integer int13 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element15 = document1.wrap("<#root> <#root> hi!");
        org.jsoup.nodes.Document document16 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int17 = document1.siblingIndex();
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Node node11 = document1.removeAttr("hi!");
        boolean boolean12 = document1.hasText();
        org.jsoup.nodes.Element element14 = document1.createElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root>\n<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>");
        org.jsoup.nodes.Element element16 = element14.val("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str17 = element16.val();
        org.jsoup.select.Elements elements18 = element16.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int19 = element16.siblingIndex();
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document2 = document1.normalise();
        java.lang.String str4 = document2.attr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document2.previousElementSibling();
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        document11.title("hi!");
        org.jsoup.nodes.Element element14 = document9.prependChild((org.jsoup.nodes.Node) document11);
        java.lang.String str15 = document9.val();
        java.util.Set<java.lang.String> strSet16 = document9.classNames();
        org.jsoup.nodes.Element element17 = document1.classNames(strSet16);
        java.lang.String str19 = document1.absUrl("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = document1.previousSibling();
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<#root>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = document1.previousElementSibling();
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Element element5 = document1.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str8 = document7.title();
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document7);
        java.lang.String str10 = document1.html();
        org.jsoup.nodes.Document document11 = document1.normalise();
        org.jsoup.nodes.Element element13 = document1.getElementById("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root class=\" &lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>");
        java.lang.String str14 = document1.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document1.siblingNodes();
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi! #root<#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements2 = document1.siblingElements();
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexLessThan((int) (byte) 0);
        org.jsoup.nodes.Element element13 = document1.createElement("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = document1.getElementById("#document");
        org.jsoup.nodes.Element element17 = document1.removeClass("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element17.previousElementSibling();
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        document11.title("hi!");
        org.jsoup.nodes.Element element14 = document9.prependChild((org.jsoup.nodes.Node) document11);
        java.lang.String str15 = document9.val();
        java.util.Set<java.lang.String> strSet16 = document9.classNames();
        org.jsoup.nodes.Element element17 = document1.classNames(strSet16);
        java.lang.String str18 = element17.data();
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("");
        document22.title("hi!");
        org.jsoup.nodes.Element element25 = document20.prependChild((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Element element27 = element25.html("");
        java.lang.String[] strArray32 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        org.jsoup.nodes.Element element35 = element25.classNames((java.util.Set<java.lang.String>) strSet33);
        org.jsoup.nodes.Element element36 = element17.classNames((java.util.Set<java.lang.String>) strSet33);
        boolean boolean37 = element17.hasText();
        org.jsoup.nodes.Element element39 = element17.toggleClass("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element41 = element39.child((int) (byte) 1);
        org.jsoup.nodes.Document document43 = org.jsoup.nodes.Document.createShell("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        java.lang.String str44 = document43.nodeName();
        org.jsoup.nodes.Element element46 = document43.appendText("hi! <#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>");
        element41.replaceWith((org.jsoup.nodes.Node) document43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element48 = element41.lastElementSibling();
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        java.lang.String str9 = element6.val();
        java.lang.String str10 = element6.id();
        org.jsoup.select.Elements elements12 = element6.getElementsByTag("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("");
        document16.title("hi!");
        org.jsoup.nodes.Element element19 = document14.prependChild((org.jsoup.nodes.Node) document16);
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element22 = document14.prependChild((org.jsoup.nodes.Node) document21);
        org.jsoup.select.Elements elements24 = document14.getElementsByIndexLessThan((int) (byte) 0);
        org.jsoup.nodes.Element element26 = document14.createElement("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean28 = element26.hasClass("hi!");
        java.lang.String str29 = element26.className();
        org.jsoup.nodes.Element element31 = element26.html("hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!");
        boolean boolean32 = element6.equals((java.lang.Object) "hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!");
        org.jsoup.nodes.Element element34 = element6.appendElement(" #root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node35 = element6.nextSibling();
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.text("\n  <body>\n  </body>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = element3.nextElementSibling();
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        java.lang.String str8 = document1.tagName();
        org.jsoup.select.Elements elements10 = document1.select("#root");
        org.jsoup.nodes.Element element11 = document1.head();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document1.wrap("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n #document\n</body>\n</html>");
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Node node11 = document1.removeAttr("hi!");
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element15 = document13.html("hi!");
        org.jsoup.nodes.Element element17 = document13.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str20 = document19.title();
        org.jsoup.nodes.Element element21 = document13.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Element element22 = document1.appendChild((org.jsoup.nodes.Node) document13);
        org.jsoup.nodes.Element element24 = document13.createElement("#root");
        org.jsoup.nodes.Element element26 = element24.toggleClass("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean27 = element24.hasText();
        org.jsoup.nodes.Element element29 = element24.removeClass("#document");
        org.jsoup.select.Elements elements31 = element29.select("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node32 = element29.previousSibling();
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        document6.title("hi!");
        org.jsoup.nodes.Element element9 = document4.prependChild((org.jsoup.nodes.Node) document6);
        java.lang.String str10 = document4.val();
        java.util.Set<java.lang.String> strSet11 = document4.classNames();
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document4);
        org.jsoup.nodes.Element element14 = document1.html("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = document1.html("<#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.nodes.Attributes attributes17 = document1.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int18 = document1.siblingIndex();
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Node node11 = document1.removeAttr("hi!");
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element15 = document13.html("hi!");
        org.jsoup.nodes.Element element17 = document13.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str20 = document19.title();
        org.jsoup.nodes.Element element21 = document13.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Element element22 = document1.appendChild((org.jsoup.nodes.Node) document13);
        org.jsoup.nodes.Element element24 = document13.createElement("#root");
        org.jsoup.nodes.Element element26 = element24.toggleClass("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean27 = element24.hasText();
        org.jsoup.nodes.Element element29 = element24.removeClass("#document");
        java.lang.String str31 = element29.absUrl("#root");
        java.lang.String str32 = element29.toString();
        boolean boolean33 = element29.hasText();
        element29.setBaseUri("<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html> hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element36 = element29.firstElementSibling();
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document1.childNodes();
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("");
        document12.title("hi!");
        org.jsoup.nodes.Element element15 = document10.prependChild((org.jsoup.nodes.Node) document12);
        org.jsoup.parser.Tag tag16 = document10.tag();
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("");
        document20.title("hi!");
        org.jsoup.nodes.Element element23 = document18.prependChild((org.jsoup.nodes.Node) document20);
        java.lang.String str24 = document18.val();
        java.util.Set<java.lang.String> strSet25 = document18.classNames();
        org.jsoup.nodes.Element element26 = document10.classNames(strSet25);
        boolean boolean27 = document1.equals((java.lang.Object) strSet25);
        org.jsoup.select.Elements elements29 = document1.getElementsByClass("<head>\n</head>\n<body>\n</body>");
        org.jsoup.select.Elements elements30 = document1.children();
        org.jsoup.nodes.Document document31 = document1.normalise();
        org.jsoup.nodes.Element element33 = document31.prependText("<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node34 = document31.nextSibling();
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        document6.title("hi!");
        org.jsoup.nodes.Element element9 = document4.prependChild((org.jsoup.nodes.Node) document6);
        java.lang.String str10 = document4.val();
        java.util.Set<java.lang.String> strSet11 = document4.classNames();
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document4);
        java.lang.Integer int13 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element15 = document1.wrap("<#root> <#root> hi!");
        org.jsoup.nodes.Document document16 = document1.normalise();
        boolean boolean17 = document1.isBlock();
        java.lang.String str19 = document1.attr("<&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! class=\"\">\n</&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!>");
        org.jsoup.nodes.Element element21 = document1.val("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = document1.wrap("\n  <body>\n   &lt;#root&gt; \n   <html> \n    <head> \n     <title>hi!\n  </title>\n    </head> \n    <body>    \n     <html> \n      <head> \n      </head> \n      <body>  \n      </body>\n     </html>\n    </body>\n   </html>\n  </body>");
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        document11.title("hi!");
        org.jsoup.nodes.Element element14 = document9.prependChild((org.jsoup.nodes.Node) document11);
        java.lang.String str15 = document9.val();
        java.util.Set<java.lang.String> strSet16 = document9.classNames();
        org.jsoup.nodes.Element element17 = document1.classNames(strSet16);
        java.lang.String str18 = element17.data();
        java.lang.String str19 = element17.toString();
        org.jsoup.nodes.Element element21 = element17.prependText("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet22 = element21.classNames();
        java.lang.String str23 = element21.className();
        java.lang.String str24 = element21.text();
        element21.setBaseUri("<html>\n<head>\n <title>#document</title>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element21.previousElementSibling();
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        document11.title("hi!");
        org.jsoup.nodes.Element element14 = document9.prependChild((org.jsoup.nodes.Node) document11);
        java.lang.String str15 = document9.val();
        java.util.Set<java.lang.String> strSet16 = document9.classNames();
        org.jsoup.nodes.Element element17 = document1.classNames(strSet16);
        org.jsoup.nodes.Element element19 = document1.appendElement("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements21 = document1.getElementsByTag("body");
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        boolean boolean24 = document1.equals((java.lang.Object) document23);
        org.jsoup.nodes.Element element26 = document1.text("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root class=\"\">\n<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = document1.previousElementSibling();
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Element element5 = document1.val("hi!");
        org.jsoup.nodes.Element element6 = document1.parent();
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueNot("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!<<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "<#root>\n<#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root><#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>");
        java.lang.String str10 = document1.nodeName();
        org.jsoup.nodes.Element element12 = document1.appendElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean13 = document1.hasText();
        document1.title("html");
        java.lang.String str16 = document1.outerHtml();
        org.jsoup.select.Elements elements18 = document1.getElementsByIndexLessThan((int) (byte) 10);
        org.jsoup.nodes.Document document19 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = document19.lastElementSibling();
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node2 = document1.nextSibling();
    }
}

