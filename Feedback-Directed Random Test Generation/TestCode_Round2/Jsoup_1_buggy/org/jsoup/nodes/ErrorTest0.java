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
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        boolean boolean7 = element6.hasText();
        org.jsoup.nodes.Node node9 = element6.removeAttr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = element6.nextSibling();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element8.siblingNodes();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int18 = document1.siblingIndex();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.nextElementSibling();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        boolean boolean7 = element6.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element6.previousElementSibling();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element11 = element9.addClass("");
        java.lang.String str12 = element9.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element9.previousElementSibling();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.previousElementSibling();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element6.previousElementSibling();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str7 = element6.toString();
        java.lang.Integer int8 = element6.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = element6.previousSibling();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        boolean boolean7 = element6.hasText();
        org.jsoup.nodes.Node node9 = element6.removeAttr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element6.previousElementSibling();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        boolean boolean7 = element6.hasText();
        org.jsoup.select.Elements elements8 = element6.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element6.firstElementSibling();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        java.lang.String str8 = document1.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements9 = document1.siblingElements();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.select.Elements elements18 = element16.getElementsByIndexEquals((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements19 = element16.siblingElements();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Attributes attributes10 = element9.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element9.nextElementSibling();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = document1.nextElementSibling();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        java.lang.String str9 = element6.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = element6.nextSibling();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Element element5 = document1.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document1.previousElementSibling();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        boolean boolean7 = element6.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element6.firstElementSibling();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements4 = document1.siblingElements();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element40 = element39.nextElementSibling();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList40 = element37.siblingNodes();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element2 = document1.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = element2.lastElementSibling();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element7.lastElementSibling();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element9.siblingNodes();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexLessThan((int) ' ');
        java.lang.String str10 = document1.nodeName();
        org.jsoup.nodes.Element element12 = document1.html("#root");
        java.lang.String str13 = document1.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements14 = document1.siblingElements();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
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
        java.util.List<org.jsoup.nodes.Node> nodeList36 = element34.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList37 = element34.siblingNodes();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        java.lang.String str10 = element9.html();
        org.jsoup.nodes.Element element12 = element9.wrap("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element9.firstElementSibling();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.text("#root");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Element element5 = document1.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.appendElement("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document1.firstElementSibling();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element11 = element9.addClass("");
        org.jsoup.nodes.Element element13 = element11.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = element11.html("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = element11.nextSibling();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
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
        java.lang.String str19 = element17.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element17.previousElementSibling();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        document6.title("hi!");
        org.jsoup.nodes.Element element9 = document4.prependChild((org.jsoup.nodes.Node) document6);
        java.lang.String str10 = document4.val();
        java.util.Set<java.lang.String> strSet11 = document4.classNames();
        org.jsoup.nodes.Element element12 = element2.classNames(strSet11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element2.nextElementSibling();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements37 = element17.siblingElements();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        boolean boolean7 = element6.hasText();
        org.jsoup.nodes.Attributes attributes8 = element6.attributes();
        java.util.Set<java.lang.String> strSet9 = element6.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element6.firstElementSibling();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        boolean boolean7 = element6.hasText();
        org.jsoup.nodes.Attributes attributes8 = element6.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = element6.nextSibling();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int2 = document1.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document1.previousElementSibling();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = element18.previousSibling();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Element element5 = document1.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document1.lastElementSibling();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        document6.title("hi!");
        org.jsoup.nodes.Element element9 = document4.prependChild((org.jsoup.nodes.Node) document6);
        java.lang.String str10 = document4.val();
        java.util.Set<java.lang.String> strSet11 = document4.classNames();
        org.jsoup.nodes.Element element12 = element2.classNames(strSet11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = element12.nextSibling();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
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
        java.lang.String str19 = document1.outerHtml();
        boolean boolean21 = document1.hasClass("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = document1.previousSibling();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.nodes.Element element18 = element16.toggleClass("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str19 = element16.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = element16.nextSibling();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        document6.title("hi!");
        org.jsoup.nodes.Element element9 = document4.prependChild((org.jsoup.nodes.Node) document6);
        java.lang.String str10 = document4.val();
        java.util.Set<java.lang.String> strSet11 = document4.classNames();
        org.jsoup.nodes.Element element12 = element2.classNames(strSet11);
        java.lang.String str14 = element2.attr("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = element2.previousSibling();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.nodes.Node node18 = element6.removeAttr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Node node20 = element6.removeAttr("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList21 = element6.siblingNodes();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Element element5 = document1.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.toggleClass("#root");
        java.lang.String str8 = element7.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element7.lastElementSibling();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
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
        java.util.List<org.jsoup.nodes.Node> nodeList36 = element34.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int37 = element34.siblingIndex();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Document document4 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements5 = document4.siblingElements();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements17 = element6.siblingElements();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexEquals((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.firstElementSibling();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element9 = element7.appendText("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int10 = element7.siblingIndex();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
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
        org.jsoup.select.Elements elements24 = document1.getElementsByAttributeValueEnding("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = document1.text("\n<hi!>\n</hi!>");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element40 = element17.lastElementSibling();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
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
        java.lang.String str27 = element24.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element24.firstElementSibling();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.select.Elements elements4 = document1.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements5 = document1.siblingElements();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element11 = element9.addClass("");
        org.jsoup.nodes.Element element13 = element11.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = element11.html("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = element15.previousSibling();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str7 = document1.val();
        java.util.Set<java.lang.String> strSet8 = document1.classNames();
        java.lang.String str9 = document1.outerHtml();
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexLessThan((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.previousElementSibling();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
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
        org.jsoup.nodes.Element element25 = element23.html("");
        java.lang.String[] strArray30 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        org.jsoup.nodes.Element element33 = element23.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element35 = element33.toggleClass("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element36 = element6.prependChild((org.jsoup.nodes.Node) element33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element37 = element6.previousElementSibling();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
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
        org.jsoup.select.Elements elements28 = element27.siblingElements();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        java.lang.String str9 = element6.val();
        java.lang.String str10 = element6.id();
        org.jsoup.select.Elements elements12 = element6.getElementsByIndexLessThan((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element6.siblingNodes();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes6 = element5.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element5.nextElementSibling();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = document7.wrap("hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.nodes.Attributes attributes8 = document1.attributes();
        org.jsoup.nodes.Document document9 = document1.normalise();
        org.jsoup.nodes.Element element11 = document1.html(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int12 = document1.siblingIndex();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
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
        org.jsoup.nodes.Node node19 = document1.previousSibling();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("");
        document12.title("hi!");
        org.jsoup.nodes.Element element15 = document10.prependChild((org.jsoup.nodes.Node) document12);
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        document19.title("hi!");
        org.jsoup.nodes.Element element22 = document17.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Element element24 = element22.html("");
        org.jsoup.nodes.Element element25 = element15.prependChild((org.jsoup.nodes.Node) element22);
        boolean boolean26 = element8.equals((java.lang.Object) element22);
        org.jsoup.nodes.Element element28 = element22.val("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element30 = element22.prependText("#document");
        org.jsoup.nodes.Element element31 = element22.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements32 = element31.siblingElements();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element9 = element7.appendText("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str11 = element9.absUrl("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str12 = element9.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element9.nextElementSibling();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
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
        org.jsoup.nodes.Element element42 = element39.nextElementSibling();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
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
        org.jsoup.nodes.Element element21 = element20.empty();
        org.jsoup.nodes.Element element23 = element20.toggleClass("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = element20.nextElementSibling();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element16.nextElementSibling();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
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
        org.jsoup.nodes.Element element25 = element23.html("");
        java.lang.String[] strArray30 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        org.jsoup.nodes.Element element33 = element23.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element35 = element33.toggleClass("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element36 = element6.prependChild((org.jsoup.nodes.Node) element33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node37 = element36.nextSibling();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        org.jsoup.select.Elements elements5 = document1.getElementsByAttributeValueNot("#root", "#root");
        org.jsoup.nodes.Element element7 = document1.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document1.lastElementSibling();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements8 = document1.getElementsByClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueEnding(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.select.Elements elements14 = document1.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root>\n<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>", "<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = document1.lastElementSibling();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
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
        java.util.List<org.jsoup.nodes.Node> nodeList38 = element37.siblingNodes();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.nodes.Element element18 = element16.toggleClass("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str19 = element16.text();
        java.lang.String str21 = element16.attr("");
        boolean boolean23 = element16.hasAttr("hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = element16.firstElementSibling();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Node node11 = document1.removeAttr("hi!");
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexGreaterThan((int) (byte) 1);
        org.jsoup.nodes.Element element15 = document1.text("");
        document1.title("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements18 = document1.siblingElements();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueContaining("#root", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document1.text("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element11 = element9.addClass("");
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        document15.title("hi!");
        org.jsoup.nodes.Element element18 = document13.prependChild((org.jsoup.nodes.Node) document15);
        org.jsoup.nodes.Element element20 = element18.html("");
        java.lang.String[] strArray25 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        org.jsoup.nodes.Element element28 = element18.classNames((java.util.Set<java.lang.String>) strSet26);
        org.jsoup.select.Elements elements30 = element28.getElementsByIndexEquals((int) (byte) 0);
        boolean boolean31 = element9.equals((java.lang.Object) element28);
        org.jsoup.select.Elements elements34 = element28.getElementsByAttributeValueStarting("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<#root class=\" &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/#root&gt; &lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements35 = element28.siblingElements();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
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
        org.jsoup.select.Elements elements20 = element17.getElementsByAttributeValueNot("<html>\n<head>\n <title>#document</title>\n</head>\n<body>\n</body>\n</html>", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean22 = element17.hasAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements23 = element17.siblingElements();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements17 = element16.siblingElements();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str2 = document1.className();
        document1.title("\n<hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document1.wrap("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        boolean boolean7 = element6.hasText();
        org.jsoup.nodes.Node node9 = element6.removeAttr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element6.html("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element11.previousElementSibling();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
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
        boolean boolean20 = element6.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element6.firstElementSibling();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
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
        java.lang.String str22 = document1.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList23 = document1.siblingNodes();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        java.lang.Integer int17 = element6.elementSiblingIndex();
        java.lang.String str18 = element6.html();
        org.jsoup.select.Elements elements21 = element6.getElementsByAttributeValueEnding("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = element6.nextSibling();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValue("#root", "#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element8.siblingNodes();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Element element5 = document1.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.appendElement("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = document1.val("hi!");
        org.jsoup.select.Elements elements11 = element9.select("#document");
        java.lang.String str13 = element9.attr("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element9.firstElementSibling();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.createElement("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = element3.wrap("\n<hi!>\n</hi!>");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        boolean boolean7 = element6.hasText();
        org.jsoup.nodes.Node node9 = element6.removeAttr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements11 = element6.getElementsByIndexEquals((-1));
        org.jsoup.nodes.Element element13 = element6.appendText("#root");
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        document17.title("hi!");
        org.jsoup.nodes.Element element20 = document15.prependChild((org.jsoup.nodes.Node) document17);
        org.jsoup.parser.Tag tag21 = document15.tag();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = document15.childNodes();
        org.jsoup.nodes.Document document24 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("");
        document26.title("hi!");
        org.jsoup.nodes.Element element29 = document24.prependChild((org.jsoup.nodes.Node) document26);
        org.jsoup.nodes.Document document31 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element32 = document24.prependChild((org.jsoup.nodes.Node) document31);
        org.jsoup.nodes.Node node34 = document24.removeAttr("hi!");
        org.jsoup.nodes.Document document36 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element38 = document36.html("hi!");
        org.jsoup.nodes.Element element40 = document36.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document42 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str43 = document42.title();
        org.jsoup.nodes.Element element44 = document36.prependChild((org.jsoup.nodes.Node) document42);
        org.jsoup.nodes.Element element45 = document24.appendChild((org.jsoup.nodes.Node) document36);
        org.jsoup.nodes.Element element47 = document36.createElement("#root");
        org.jsoup.nodes.Element element49 = element47.toggleClass("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean50 = element47.hasText();
        org.jsoup.nodes.Element element51 = document15.appendChild((org.jsoup.nodes.Node) element47);
        org.jsoup.nodes.Element element52 = element6.appendChild((org.jsoup.nodes.Node) document15);
        element52.setBaseUri("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element55 = element52.previousElementSibling();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
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
        org.jsoup.select.Elements elements24 = element21.getElementsByAttributeValue("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!<<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList25 = element21.siblingNodes();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Element element4 = element2.appendElement("#document");
        org.jsoup.nodes.Element element6 = element4.prepend(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element6.siblingNodes();
        org.jsoup.nodes.Element element10 = element6.attr("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element10.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element11.previousElementSibling();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        boolean boolean7 = element6.hasText();
        org.jsoup.select.Elements elements8 = element6.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element6.siblingNodes();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element11 = element9.addClass("");
        java.lang.String str12 = element9.val();
        java.lang.Integer int13 = element9.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int14 = element9.siblingIndex();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Element element5 = document1.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element5.previousElementSibling();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        java.lang.String str10 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.lastElementSibling();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
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
        org.jsoup.nodes.Element element39 = element37.appendElement("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element40 = element37.firstElementSibling();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        java.lang.String str2 = document1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element9 = element7.appendText("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element7.appendElement("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet12 = element7.classNames();
        org.jsoup.nodes.Element element14 = element7.appendText("<#root> <#root> hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element14.wrap("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!<<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element11 = element9.addClass("");
        org.jsoup.nodes.Element element13 = element11.appendText("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        java.lang.String str14 = element13.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element13.previousElementSibling();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int2 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = document1.append("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str5 = element4.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element4.lastElementSibling();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str7 = element6.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element6.siblingNodes();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#document");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element4 = document3.empty();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        document8.title("hi!");
        org.jsoup.nodes.Element element11 = document6.prependChild((org.jsoup.nodes.Node) document8);
        java.lang.String str12 = document6.val();
        java.util.Set<java.lang.String> strSet13 = document6.classNames();
        org.jsoup.nodes.Element element14 = element4.classNames(strSet13);
        org.jsoup.nodes.Element element15 = document1.classNames(strSet13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element15.previousElementSibling();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements3 = document1.getElementsByIndexLessThan((-1));
        document1.title("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = document1.previousSibling();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
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
        org.jsoup.select.Elements elements24 = document1.getElementsByAttributeValueEnding("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = document1.lastElementSibling();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.nodes.Element element18 = element16.toggleClass("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str19 = element16.text();
        java.lang.String str21 = element16.attr("");
        boolean boolean23 = element16.hasAttr("hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!");
        org.jsoup.select.Elements elements25 = element16.getElementsByIndexEquals((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList26 = element16.siblingNodes();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements8 = document1.getElementsByClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.previousElementSibling();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexLessThan((int) (byte) 0);
        org.jsoup.nodes.Element element13 = document1.createElement("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements16 = document1.getElementsByAttributeValue("#root", "hi!");
        org.jsoup.nodes.Element element18 = document1.createElement("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = element18.toggleClass("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = element18.previousSibling();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Node node11 = document1.removeAttr("hi!");
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexGreaterThan((int) (byte) 1);
        org.jsoup.nodes.Element element14 = document1.head();
        org.jsoup.nodes.Element element15 = document1.head();
        org.jsoup.nodes.Element element17 = document1.text("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element17.lastElementSibling();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
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
        java.lang.String str17 = document1.outerHtml();
        org.jsoup.nodes.Element element19 = document1.createElement("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = document1.nextSibling();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
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
        org.jsoup.nodes.Element element25 = element23.html("");
        java.lang.String[] strArray30 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        org.jsoup.nodes.Element element33 = element23.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element35 = element33.toggleClass("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element36 = element6.prependChild((org.jsoup.nodes.Node) element33);
        org.jsoup.nodes.Element element38 = element6.appendText("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element39 = element6.nextElementSibling();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Node node11 = document1.removeAttr("hi!");
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexGreaterThan((int) (byte) 1);
        org.jsoup.nodes.Element element14 = document1.head();
        org.jsoup.nodes.Element element15 = document1.head();
        org.jsoup.select.Elements elements18 = document1.getElementsByAttributeValue("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!<<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = document1.nextSibling();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Element element5 = document1.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str8 = document7.title();
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Element element10 = element9.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = element10.nextSibling();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
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
        org.jsoup.select.Elements elements23 = element20.getElementsByAttributeValueContaining("<#root> <#root> hi!", "&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList24 = element20.siblingNodes();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
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
        boolean boolean24 = element21.hasClass("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList25 = element21.siblingNodes();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element9 = element7.appendText("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str10 = element9.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int11 = element9.siblingIndex();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.createElement("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = element3.wrap("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n #document\n</body>\n</html>");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str7 = document1.val();
        java.util.Set<java.lang.String> strSet8 = document1.classNames();
        java.lang.String str9 = document1.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.lastElementSibling();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexLessThan((int) (byte) 0);
        org.jsoup.nodes.Element element13 = document1.createElement("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = document1.nextSibling();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Element element5 = document1.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.appendElement("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element5.nextElementSibling();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
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
        java.lang.String str27 = element26.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element26.lastElementSibling();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element4 = document1.attr("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>", "#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = element4.firstElementSibling();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        java.lang.String str8 = document1.tagName();
        org.jsoup.nodes.Node node10 = document1.removeAttr(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document1.body();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = document1.siblingNodes();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Element element5 = document1.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.appendElement("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = document1.val("hi!");
        org.jsoup.select.Elements elements11 = element9.select("#document");
        java.lang.String str13 = element9.attr("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        java.lang.String str14 = element9.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = element9.previousSibling();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = document1.lastElementSibling();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("\n<hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node2 = document1.nextSibling();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element17.nextElementSibling();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element6.firstElementSibling();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Node node11 = document1.removeAttr("hi!");
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexGreaterThan((int) (byte) 1);
        org.jsoup.nodes.Element element15 = document1.text("");
        org.jsoup.nodes.Element element17 = element15.removeClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element17.wrap("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Element element5 = document1.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.appendElement("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = document1.val("hi!");
        org.jsoup.select.Elements elements11 = element9.select("#document");
        java.lang.String str13 = element9.attr("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        boolean boolean14 = element9.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element9.previousElementSibling();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str2 = document1.className();
        org.jsoup.nodes.Element element4 = document1.append("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements5 = document1.siblingElements();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        boolean boolean5 = element3.hasAttr("");
        org.jsoup.select.Elements elements6 = element3.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = element3.previousSibling();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        boolean boolean10 = document1.hasAttr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str11 = document1.toString();
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        document15.title("hi!");
        org.jsoup.nodes.Element element18 = document13.prependChild((org.jsoup.nodes.Node) document15);
        org.jsoup.parser.Tag tag19 = document13.tag();
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("");
        document23.title("hi!");
        org.jsoup.nodes.Element element26 = document21.prependChild((org.jsoup.nodes.Node) document23);
        java.lang.String str27 = document21.val();
        java.util.Set<java.lang.String> strSet28 = document21.classNames();
        org.jsoup.nodes.Element element29 = document13.classNames(strSet28);
        org.jsoup.nodes.Element element31 = document13.appendElement("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element33 = document13.html("#root");
        java.util.Set<java.lang.String> strSet34 = element33.classNames();
        org.jsoup.nodes.Element element35 = document1.classNames(strSet34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int36 = element35.siblingIndex();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
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
        boolean boolean22 = document7.equals((java.lang.Object) "<#root> <#root> hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = document7.previousSibling();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Element element5 = document1.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str8 = document7.title();
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Element element10 = element9.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element10.firstElementSibling();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList20 = element6.siblingNodes();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Node node11 = document1.removeAttr("hi!");
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexGreaterThan((int) (byte) 1);
        org.jsoup.nodes.Element element15 = document1.text("");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element19 = document17.html("hi!");
        org.jsoup.nodes.Element element21 = document17.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean22 = element15.equals((java.lang.Object) element21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element15.firstElementSibling();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexLessThan((int) (byte) 0);
        org.jsoup.nodes.Element element13 = document1.createElement("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = document1.val("\n<hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element15.wrap("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document2 = document1.normalise();
        boolean boolean4 = document1.hasClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements6 = document1.getElementsByClass("#root");
        org.jsoup.nodes.Node node8 = document1.removeAttr("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements9 = document1.siblingElements();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element9 = element7.appendText("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element9.firstElementSibling();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
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
        org.jsoup.select.Elements elements16 = element14.getElementsByTag("#root");
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str19 = document18.className();
        org.jsoup.nodes.Element element21 = document18.append("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element23 = element21.toggleClass("");
        org.jsoup.select.Elements elements26 = element21.getElementsByAttributeValueNot("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>", "#root");
        java.util.Set<java.lang.String> strSet27 = element21.classNames();
        org.jsoup.nodes.Element element28 = element14.prependChild((org.jsoup.nodes.Node) element21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node29 = element14.previousSibling();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
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
        org.jsoup.nodes.Element element23 = element16.html("hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = element23.firstElementSibling();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element9 = element7.appendText("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element13 = element7.val("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements15 = element7.getElementsByIndexGreaterThan((int) (short) 0);
        boolean boolean16 = element7.isBlock();
        org.jsoup.nodes.Attributes attributes17 = element7.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element7.siblingNodes();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.nodes.Element element18 = element16.toggleClass("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str19 = element18.val();
        org.jsoup.select.Elements elements22 = element18.getElementsByAttributeValueNot("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!", "hi! #root hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element18.firstElementSibling();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexLessThan((int) ' ');
        org.jsoup.select.Elements elements10 = document1.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int11 = document1.siblingIndex();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.text("#document");
        org.jsoup.nodes.Element element8 = document1.body();
        boolean boolean10 = document1.equals((java.lang.Object) "<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element11 = document1.head();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.nextElementSibling();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexLessThan((int) ' ');
        java.lang.String str10 = document1.nodeName();
        java.lang.String str11 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = document1.previousSibling();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element11 = element9.addClass("");
        org.jsoup.select.Elements elements12 = element9.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements13 = element9.siblingElements();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element8 = document1.body();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.firstElementSibling();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
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
        org.jsoup.select.Elements elements23 = element21.getElementsByIndexLessThan(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = element21.nextSibling();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements8 = document1.getElementsByClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet9 = document1.classNames();
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexLessThan((int) (byte) 0);
        java.lang.String str12 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document1.firstElementSibling();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements8 = document1.getElementsByClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.lastElementSibling();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Element element5 = document1.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.appendElement("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = document1.val("hi!");
        org.jsoup.select.Elements elements11 = element9.select("#document");
        java.lang.String str13 = element9.attr("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.nodes.Node node15 = element9.removeAttr(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str16 = element9.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element9.lastElementSibling();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> <#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document1.text(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> <#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str6 = document1.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.nextElementSibling();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element9 = element7.appendText("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element7.appendElement("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet12 = element7.classNames();
        org.jsoup.nodes.Element element14 = element7.appendText("<#root> <#root> hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element14.siblingNodes();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element11 = element9.addClass("");
        org.jsoup.nodes.Element element13 = element11.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = element11.html("#document");
        java.lang.String str17 = element11.absUrl("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element11.firstElementSibling();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements3 = document1.getElementsByIndexLessThan((-1));
        document1.title("#document");
        org.jsoup.nodes.Element element7 = document1.removeClass("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = document1.nextSibling();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexLessThan((int) (byte) 0);
        org.jsoup.nodes.Element element13 = document1.createElement("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean15 = element13.hasClass("hi!");
        java.lang.String str16 = element13.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList17 = element13.siblingNodes();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
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
        org.jsoup.nodes.Element element24 = element16.val("hi! #root hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element24.firstElementSibling();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
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
        org.jsoup.nodes.Element element24 = element16.val("hi! #root hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = element16.wrap("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Document document4 = document1.normalise();
        org.jsoup.nodes.Element element5 = document4.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document4.title("hi! #root");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document1.siblingNodes();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str7 = document1.val();
        java.util.Set<java.lang.String> strSet8 = document1.classNames();
        java.lang.String str9 = document1.outerHtml();
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        document13.title("hi!");
        org.jsoup.nodes.Element element16 = document11.prependChild((org.jsoup.nodes.Node) document13);
        org.jsoup.parser.Tag tag17 = document11.tag();
        org.jsoup.nodes.Attributes attributes18 = document11.attributes();
        boolean boolean19 = document1.equals((java.lang.Object) attributes18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int20 = document1.siblingIndex();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueEnding("html", "#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.firstElementSibling();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean3 = document1.hasAttr("");
        java.lang.String str5 = document1.attr(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document1.lastElementSibling();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
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
        java.lang.String str20 = element17.val();
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("");
        document22.title("hi!");
        org.jsoup.nodes.Element element26 = document22.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str27 = document22.id();
        element17.replaceWith((org.jsoup.nodes.Node) document22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements29 = element17.siblingElements();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        java.lang.String str8 = element7.id();
        org.jsoup.nodes.Element element10 = element7.appendText("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n #document\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = element7.previousSibling();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Element element5 = document1.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.toggleClass("hi!");
        java.lang.String str8 = element7.baseUri();
        org.jsoup.nodes.Element element10 = element7.appendElement("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!<<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements11 = element7.siblingElements();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.select.Elements elements4 = document1.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.firstElementSibling();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node2 = document1.nextSibling();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element9 = element7.appendText("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element13 = element7.val("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements15 = element7.getElementsByIndexGreaterThan((int) (short) 0);
        boolean boolean16 = element7.isBlock();
        org.jsoup.nodes.Attributes attributes17 = element7.attributes();
        org.jsoup.nodes.Element element19 = element7.toggleClass("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements20 = element19.siblingElements();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Element element5 = document1.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str8 = document7.title();
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document7);
        java.lang.String str10 = document1.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.nextElementSibling();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
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
        java.lang.Integer int18 = document1.elementSiblingIndex();
        org.jsoup.select.Elements elements20 = document1.getElementsByClass("<head>\n</head>\n<body>\n</body>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = document1.previousSibling();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValue("#root", "#document");
        org.jsoup.select.Elements elements12 = element8.getAllElements();
        org.jsoup.nodes.Element element15 = element8.attr("<#root>\n <html>\n  <head>\n  </head>\n  <body>\n    &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int16 = element15.siblingIndex();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str6 = document1.id();
        org.jsoup.nodes.Element element8 = document1.append("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = element8.nextSibling();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        boolean boolean10 = document1.hasAttr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document1.siblingNodes();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("\n<hi!>\n</hi!>");
        org.jsoup.nodes.Document document2 = document1.normalise();
        java.lang.String str3 = document1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = document1.previousSibling();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValue("#root", "#document");
        org.jsoup.select.Elements elements12 = element8.getAllElements();
        org.jsoup.nodes.Element element15 = element8.attr("<#root>\n <html>\n  <head>\n  </head>\n  <body>\n    &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element8.wrap("\n<hi!>\n</hi!>");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        boolean boolean5 = element3.hasAttr("");
        org.jsoup.nodes.Element element7 = element3.toggleClass("hi!");
        org.jsoup.parser.Tag tag8 = element3.tag();
        org.jsoup.nodes.Element element10 = element3.getElementById(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements11 = element3.siblingElements();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
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
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element18 = document10.prependChild((org.jsoup.nodes.Node) document17);
        org.jsoup.nodes.Node node20 = document10.removeAttr("hi!");
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element24 = document22.html("hi!");
        org.jsoup.nodes.Element element26 = document22.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str29 = document28.title();
        org.jsoup.nodes.Element element30 = document22.prependChild((org.jsoup.nodes.Node) document28);
        org.jsoup.nodes.Element element31 = document10.appendChild((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Element element33 = document22.createElement("#root");
        org.jsoup.nodes.Element element35 = element33.toggleClass("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean36 = element33.hasText();
        org.jsoup.nodes.Element element37 = document1.appendChild((org.jsoup.nodes.Node) element33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element39 = document1.wrap("<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Element element5 = document1.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.text("<#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str2 = document1.className();
        document1.title("\n<hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int5 = document1.siblingIndex();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Node node11 = document1.removeAttr("hi!");
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexGreaterThan((int) (byte) 1);
        org.jsoup.nodes.Element element15 = document1.text("");
        org.jsoup.nodes.Element element17 = element15.prependText("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        document21.title("hi!");
        org.jsoup.nodes.Element element24 = document19.prependChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element27 = document19.prependChild((org.jsoup.nodes.Node) document26);
        org.jsoup.nodes.Node node29 = document19.removeAttr("hi!");
        org.jsoup.select.Elements elements31 = document19.getElementsByIndexGreaterThan((int) (byte) 1);
        org.jsoup.nodes.Element element32 = document19.head();
        org.jsoup.nodes.Element element33 = document19.head();
        org.jsoup.select.Elements elements36 = document19.getElementsByAttributeValue("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!<<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        java.lang.String str37 = document19.title();
        boolean boolean38 = document19.hasText();
        org.jsoup.nodes.Element element40 = document19.getElementById("#root");
        org.jsoup.nodes.Element element41 = element15.appendChild((org.jsoup.nodes.Node) document19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int42 = element15.siblingIndex();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Element element4 = element2.appendElement("#document");
        org.jsoup.select.Elements elements7 = element2.getElementsByAttributeValueEnding("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements8 = element2.siblingElements();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements28 = document1.siblingElements();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
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
        org.jsoup.nodes.Element element26 = element22.toggleClass("<#root>\n <html>\n  <head>\n  </head>\n  <body>\n    &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList27 = element26.siblingNodes();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        boolean boolean7 = element6.hasText();
        org.jsoup.nodes.Node node9 = element6.removeAttr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements11 = element6.getElementsByIndexEquals((-1));
        org.jsoup.nodes.Element element13 = element6.appendText("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element6.siblingNodes();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.text("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Document document5 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        document7.title("hi!");
        org.jsoup.nodes.Element element10 = document5.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element13 = document5.prependChild((org.jsoup.nodes.Node) document12);
        org.jsoup.nodes.Node node15 = document5.removeAttr("hi!");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element19 = document17.html("hi!");
        org.jsoup.nodes.Element element21 = document17.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str24 = document23.title();
        org.jsoup.nodes.Element element25 = document17.prependChild((org.jsoup.nodes.Node) document23);
        org.jsoup.nodes.Element element26 = document5.appendChild((org.jsoup.nodes.Node) document17);
        org.jsoup.nodes.Element element28 = document17.createElement("#root");
        java.lang.String str29 = document17.className();
        org.jsoup.nodes.Element element31 = document17.appendText("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element33 = document17.text(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document35 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element36 = document35.empty();
        org.jsoup.nodes.Document document38 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document40 = org.jsoup.nodes.Document.createShell("");
        document40.title("hi!");
        org.jsoup.nodes.Element element43 = document38.prependChild((org.jsoup.nodes.Node) document40);
        java.lang.String str44 = document38.val();
        java.util.Set<java.lang.String> strSet45 = document38.classNames();
        org.jsoup.nodes.Element element46 = element36.classNames(strSet45);
        org.jsoup.nodes.Element element47 = document17.classNames(strSet45);
        org.jsoup.nodes.Element element48 = element3.classNames(strSet45);
        boolean boolean50 = element3.equals((java.lang.Object) "<#root>\n<#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root><#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node51 = element3.nextSibling();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        boolean boolean10 = document1.hasAttr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = document1.val("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements15 = element12.getElementsByAttributeValue("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;", "\n<hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element12.siblingNodes();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document8.previousElementSibling();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        boolean boolean3 = document1.hasText();
        java.lang.String str4 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.previousElementSibling();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int2 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = document1.append("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str5 = element4.id();
        org.jsoup.nodes.Element element7 = element4.appendElement("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!<<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.select.Elements elements9 = element4.getElementsByTag("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element4.previousElementSibling();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.lastElementSibling();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        boolean boolean7 = element6.hasText();
        org.jsoup.select.Elements elements8 = element6.children();
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("");
        document12.title("hi!");
        org.jsoup.nodes.Element element15 = document10.prependChild((org.jsoup.nodes.Node) document12);
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element18 = document10.prependChild((org.jsoup.nodes.Node) document17);
        org.jsoup.select.Elements elements20 = document10.getElementsByIndexLessThan((int) (byte) 0);
        org.jsoup.nodes.Element element22 = document10.createElement("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements25 = document10.getElementsByAttributeValue("#root", "hi!");
        org.jsoup.nodes.Element element27 = document10.createElement("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String[] strArray29 = new java.lang.String[] { " <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        org.jsoup.nodes.Element element32 = document10.classNames((java.util.Set<java.lang.String>) strSet30);
        org.jsoup.nodes.Element element33 = element6.classNames((java.util.Set<java.lang.String>) strSet30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element34 = element33.previousElementSibling();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element4 = document1.attr("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>", "#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element9 = element7.appendText("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element7.appendElement("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element7.removeClass("");
        org.jsoup.select.Elements elements16 = element13.getElementsByAttributeValueEnding("<#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!", "&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = element13.nextSibling();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.select.Elements elements4 = document1.getAllElements();
        org.jsoup.nodes.Element element6 = document1.append("#root");
        org.jsoup.parser.Tag tag7 = document1.tag();
        java.lang.String str8 = document1.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document1.siblingNodes();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document1.childNodes();
        java.lang.String str9 = document1.outerHtml();
        document1.title("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int12 = document1.siblingIndex();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element9 = element7.appendText("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element7.appendElement("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element7.removeClass("");
        java.lang.String str15 = element13.attr("<head>\n</head>\n<body>\n</body>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element13.previousElementSibling();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = document1.nextSibling();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.select.Elements elements4 = document1.getAllElements();
        org.jsoup.nodes.Element element6 = document1.append("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document1.wrap("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root class=\"\">\n<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
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
        org.jsoup.select.Elements elements27 = document13.getAllElements();
        org.jsoup.nodes.Element element29 = document13.append("");
        org.jsoup.select.Elements elements31 = element29.getElementsByTag("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document33 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root class=\" &lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>");
        org.jsoup.nodes.Element element35 = document33.appendText("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        element29.replaceWith((org.jsoup.nodes.Node) document33);
        org.jsoup.select.Elements elements37 = element29.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element38 = element29.nextElementSibling();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        java.lang.Integer int17 = element6.elementSiblingIndex();
        java.lang.String str18 = element6.html();
        org.jsoup.select.Elements elements21 = element6.getElementsByAttributeValueEnding("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str24 = document23.title();
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("");
        document28.title("hi!");
        org.jsoup.nodes.Element element31 = document26.prependChild((org.jsoup.nodes.Node) document28);
        java.lang.String str32 = document26.val();
        java.util.Set<java.lang.String> strSet33 = document26.classNames();
        org.jsoup.nodes.Element element34 = document23.appendChild((org.jsoup.nodes.Node) document26);
        java.lang.String str36 = document26.absUrl("hi!");
        org.jsoup.nodes.Element element38 = document26.toggleClass("#document");
        boolean boolean39 = element6.equals((java.lang.Object) document26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList40 = element6.siblingNodes();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.nodes.Element element18 = element16.toggleClass("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str19 = element16.text();
        org.jsoup.select.Elements elements20 = element16.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = element16.previousSibling();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node2 = document1.previousSibling();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.text("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element5 = document1.prepend("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements6 = document1.siblingElements();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        boolean boolean5 = element3.hasAttr("");
        org.jsoup.nodes.Element element7 = element3.toggleClass("hi!");
        org.jsoup.parser.Tag tag8 = element3.tag();
        java.lang.Integer int9 = element3.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element3.firstElementSibling();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str2 = document1.className();
        org.jsoup.nodes.Element element4 = document1.append("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = element4.toggleClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int7 = element4.siblingIndex();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
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
        org.jsoup.nodes.Element element16 = document1.append("<#root> <#root> hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element16.nextElementSibling();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Node node11 = document1.removeAttr("hi!");
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexGreaterThan((int) (byte) 1);
        org.jsoup.nodes.Element element15 = document1.text("");
        org.jsoup.nodes.Element element17 = element15.prependText("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str18 = element17.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList19 = element17.siblingNodes();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element11 = element9.addClass("");
        org.jsoup.nodes.Element element13 = element11.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element11.attr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", " <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str17 = element11.val();
        java.lang.String str18 = element11.id();
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("");
        document22.title("hi!");
        org.jsoup.nodes.Element element25 = document20.prependChild((org.jsoup.nodes.Node) document22);
        org.jsoup.parser.Tag tag26 = document20.tag();
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document30 = org.jsoup.nodes.Document.createShell("");
        document30.title("hi!");
        org.jsoup.nodes.Element element33 = document28.prependChild((org.jsoup.nodes.Node) document30);
        java.lang.String str34 = document28.val();
        java.util.Set<java.lang.String> strSet35 = document28.classNames();
        org.jsoup.nodes.Element element36 = document20.classNames(strSet35);
        org.jsoup.select.Elements elements37 = document20.getAllElements();
        org.jsoup.nodes.Element element38 = element11.appendChild((org.jsoup.nodes.Node) document20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element39 = element38.firstElementSibling();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
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
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str19 = document18.title();
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("");
        document23.title("hi!");
        org.jsoup.nodes.Element element26 = document21.prependChild((org.jsoup.nodes.Node) document23);
        java.lang.String str27 = document21.val();
        java.util.Set<java.lang.String> strSet28 = document21.classNames();
        org.jsoup.nodes.Element element29 = document18.appendChild((org.jsoup.nodes.Node) document21);
        java.lang.Integer int30 = document18.elementSiblingIndex();
        org.jsoup.nodes.Node node32 = document18.childNode((int) (byte) 0);
        org.jsoup.nodes.Document document33 = document18.normalise();
        java.lang.String str34 = document18.outerHtml();
        java.lang.String str36 = document18.absUrl("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element37 = document1.appendChild((org.jsoup.nodes.Node) document18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element38 = document1.nextElementSibling();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element18.previousElementSibling();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        boolean boolean9 = element6.hasClass("hi!");
        org.jsoup.nodes.Element element11 = element6.appendElement("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root class=\" &lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements12 = element6.siblingElements();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str7 = document1.val();
        org.jsoup.select.Elements elements8 = document1.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int9 = document1.siblingIndex();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
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
        java.lang.Integer int18 = document1.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = document1.nextSibling();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
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
        org.jsoup.select.Elements elements32 = element29.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node33 = element29.previousSibling();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        boolean boolean10 = document1.hasAttr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = document1.val("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        element12.setBaseUri("<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root>\n<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>");
        org.jsoup.select.Elements elements16 = element12.getElementsByAttribute("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root class=\" &lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>");
        org.jsoup.nodes.Node node18 = element12.removeAttr("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = node18.previousSibling();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        java.lang.String str10 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = document1.nextSibling();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int2 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = document1.append("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str5 = element4.id();
        java.lang.String str7 = element4.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root>\n<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>");
        java.lang.String str9 = element4.attr("hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element4.lastElementSibling();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        java.lang.String str10 = element9.html();
        org.jsoup.nodes.Element element12 = element9.wrap("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element9.previousElementSibling();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element11 = element9.addClass("");
        org.jsoup.nodes.Element element13 = element11.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element11.attr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", " <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str17 = element11.val();
        java.lang.String str18 = element11.id();
        org.jsoup.nodes.Element element20 = element11.prepend("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element20.lastElementSibling();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
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
        java.lang.String str40 = element34.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node41 = element34.previousSibling();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element11 = element9.addClass("");
        org.jsoup.nodes.Element element13 = element11.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = element11.html("#document");
        org.jsoup.nodes.Element element17 = element11.prependElement("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        document21.title("hi!");
        org.jsoup.nodes.Element element24 = document19.prependChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Element element26 = element24.html("");
        java.lang.String[] strArray31 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.jsoup.nodes.Element element34 = element24.classNames((java.util.Set<java.lang.String>) strSet32);
        org.jsoup.nodes.Document document36 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document38 = org.jsoup.nodes.Document.createShell("");
        document38.title("hi!");
        org.jsoup.nodes.Element element41 = document36.prependChild((org.jsoup.nodes.Node) document38);
        org.jsoup.nodes.Element element43 = element41.html("");
        java.lang.String[] strArray48 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet49 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet49, strArray48);
        org.jsoup.nodes.Element element51 = element41.classNames((java.util.Set<java.lang.String>) strSet49);
        org.jsoup.nodes.Element element53 = element51.toggleClass("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element54 = element24.prependChild((org.jsoup.nodes.Node) element51);
        element17.replaceWith((org.jsoup.nodes.Node) element24);
        element24.remove();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element57 = element24.previousElementSibling();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element12.firstElementSibling();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        boolean boolean10 = document1.hasAttr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = document1.val("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        element12.setBaseUri("<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root>\n<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>");
        org.jsoup.select.Elements elements16 = element12.getElementsByAttribute("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root class=\" &lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>");
        org.jsoup.nodes.Node node18 = element12.removeAttr("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element12.previousElementSibling();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Node node11 = document1.removeAttr("hi!");
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexGreaterThan((int) (byte) 1);
        org.jsoup.nodes.Element element14 = document1.head();
        document1.title("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!<<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element18 = document1.getElementById("hi! #root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = document1.previousSibling();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexLessThan((int) ' ');
        java.lang.String str10 = document1.nodeName();
        org.jsoup.nodes.Element element12 = document1.html("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element12.siblingNodes();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = element16.previousSibling();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        boolean boolean7 = element6.hasText();
        org.jsoup.nodes.Node node9 = element6.removeAttr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element6.html("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str12 = element6.data();
        java.lang.String str13 = element6.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element6.siblingNodes();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        java.lang.String str4 = element3.tagName();
        org.jsoup.parser.Tag tag5 = element3.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element3.lastElementSibling();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements8 = document1.getElementsByClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet9 = document1.classNames();
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexLessThan((int) (byte) 0);
        org.jsoup.select.Elements elements13 = document1.getElementsByClass("<#root>\n <html>\n  <head>\n  </head>\n  <body>\n    &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document1.siblingNodes();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element9 = element7.appendText("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element13 = element7.val("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements15 = element7.getElementsByIndexGreaterThan((int) (short) 0);
        org.jsoup.nodes.Element element17 = element7.prepend("hi! #root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements18 = element17.siblingElements();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
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
        org.jsoup.nodes.Element element37 = document21.lastElementSibling();
        org.jsoup.nodes.Element element39 = document21.getElementById(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element41 = document21.appendText("hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!");
        java.lang.String str42 = document21.text();
        org.jsoup.nodes.Element element44 = document21.createElement("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements45 = element44.siblingElements();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
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
        org.jsoup.nodes.Element element21 = element6.appendElement("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int22 = element6.siblingIndex();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("");
        document12.title("hi!");
        org.jsoup.nodes.Element element15 = document10.prependChild((org.jsoup.nodes.Node) document12);
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        document19.title("hi!");
        org.jsoup.nodes.Element element22 = document17.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Element element24 = element22.html("");
        org.jsoup.nodes.Element element25 = element15.prependChild((org.jsoup.nodes.Node) element22);
        boolean boolean26 = element8.equals((java.lang.Object) element22);
        org.jsoup.nodes.Element element28 = element22.val("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element30 = element22.prependText("#document");
        org.jsoup.nodes.Element element31 = element22.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element32 = element31.firstElementSibling();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueContaining("#root", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str5 = document1.title();
        org.jsoup.select.Elements elements7 = document1.getElementsByIndexGreaterThan((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.text("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str2 = document1.className();
        org.jsoup.nodes.Element element4 = document1.append("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = element4.toggleClass("");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = element4.previousSibling();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.nodes.Attributes attributes8 = document1.attributes();
        org.jsoup.nodes.Document document9 = document1.normalise();
        java.lang.String str10 = document9.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = document9.nextSibling();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        document6.title("hi!");
        org.jsoup.nodes.Element element9 = document4.prependChild((org.jsoup.nodes.Node) document6);
        java.lang.String str10 = document4.val();
        java.util.Set<java.lang.String> strSet11 = document4.classNames();
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element12.wrap("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
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
        org.jsoup.nodes.Element element38 = document21.prependText("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList39 = document21.childNodes();
        org.jsoup.select.Elements elements41 = document21.getElementsByClass("<head>\n</head>\n<body>\n</body>");
        org.jsoup.nodes.Element element42 = document21.firstElementSibling();
        org.jsoup.nodes.Element element44 = document21.createElement("\n<hi!>\n</hi!>");
        org.jsoup.nodes.Document document46 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element48 = document46.html("hi!");
        org.jsoup.nodes.Element element50 = document46.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element52 = document46.toggleClass("#root");
        java.util.Set<java.lang.String> strSet53 = element52.classNames();
        org.jsoup.nodes.Element element54 = element44.classNames(strSet53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList55 = element54.siblingNodes();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.select.Elements elements17 = element16.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element16.siblingNodes();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        boolean boolean4 = document1.hasAttr("");
        java.lang.String str5 = document1.title();
        org.jsoup.nodes.Element element7 = document1.child((int) (byte) 0);
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        document11.title("hi!");
        org.jsoup.nodes.Element element14 = document9.prependChild((org.jsoup.nodes.Node) document11);
        org.jsoup.nodes.Element element16 = element14.html("");
        java.lang.String[] strArray21 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.jsoup.nodes.Element element24 = element14.classNames((java.util.Set<java.lang.String>) strSet22);
        org.jsoup.select.Elements elements26 = element24.getElementsByIndexEquals((int) (byte) 0);
        java.util.List<org.jsoup.nodes.Node> nodeList27 = element24.childNodes();
        boolean boolean29 = element24.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = element24.childNodes();
        boolean boolean31 = document1.equals((java.lang.Object) nodeList30);
        java.lang.String str32 = document1.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int33 = document1.siblingIndex();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
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
        boolean boolean43 = document1.isBlock();
        java.lang.String str44 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element45 = document1.previousElementSibling();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
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
        java.lang.Integer int18 = document1.elementSiblingIndex();
        org.jsoup.select.Elements elements20 = document1.getElementsByClass("<head>\n</head>\n<body>\n</body>");
        java.lang.String str21 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = document1.nextSibling();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document1.childNodes();
        java.lang.String str9 = document1.tagName();
        org.jsoup.nodes.Element element11 = document1.text("");
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexLessThan((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = document1.nextSibling();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
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
        org.jsoup.select.Elements elements18 = document16.getElementsByIndexEquals((int) (byte) 1);
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("");
        document22.title("hi!");
        org.jsoup.nodes.Element element25 = document20.prependChild((org.jsoup.nodes.Node) document22);
        org.jsoup.parser.Tag tag26 = document20.tag();
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document30 = org.jsoup.nodes.Document.createShell("");
        document30.title("hi!");
        org.jsoup.nodes.Element element33 = document28.prependChild((org.jsoup.nodes.Node) document30);
        java.lang.String str34 = document28.val();
        java.util.Set<java.lang.String> strSet35 = document28.classNames();
        org.jsoup.nodes.Element element36 = document20.classNames(strSet35);
        org.jsoup.select.Elements elements37 = document20.getAllElements();
        org.jsoup.select.Elements elements40 = document20.getElementsByAttributeValue(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.select.Elements elements42 = document20.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.nodes.Element element44 = document20.toggleClass("body");
        org.jsoup.nodes.Element element45 = document16.appendChild((org.jsoup.nodes.Node) document20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element46 = element45.previousElementSibling();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
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
        java.lang.String str16 = document1.title();
        org.jsoup.nodes.Document document17 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = document17.previousSibling();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        boolean boolean10 = document1.hasAttr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = document1.val("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document15 = document14.normalise();
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        document19.title("hi!");
        org.jsoup.nodes.Element element22 = document17.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Document document24 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element25 = document17.prependChild((org.jsoup.nodes.Node) document24);
        org.jsoup.select.Elements elements27 = document17.getElementsByIndexLessThan((int) (byte) 0);
        org.jsoup.nodes.Element element29 = document17.createElement("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements32 = document17.getElementsByAttributeValue("#root", "hi!");
        org.jsoup.nodes.Element element33 = document14.prependChild((org.jsoup.nodes.Node) document17);
        document17.title("#document");
        org.jsoup.nodes.Element element36 = document17.lastElementSibling();
        element36.remove();
        org.jsoup.nodes.Element element38 = document1.prependChild((org.jsoup.nodes.Node) element36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element39 = document1.nextElementSibling();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element11 = element9.addClass("");
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        document15.title("hi!");
        org.jsoup.nodes.Element element18 = document13.prependChild((org.jsoup.nodes.Node) document15);
        org.jsoup.nodes.Element element20 = element18.html("");
        java.lang.String[] strArray25 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        org.jsoup.nodes.Element element28 = element18.classNames((java.util.Set<java.lang.String>) strSet26);
        org.jsoup.select.Elements elements30 = element28.getElementsByIndexEquals((int) (byte) 0);
        boolean boolean31 = element9.equals((java.lang.Object) element28);
        org.jsoup.nodes.Element element33 = element28.append("#root");
        java.lang.String str35 = element33.attr("<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element36 = element33.nextElementSibling();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document1.childNodes();
        java.lang.String str9 = document1.outerHtml();
        document1.title("#root");
        org.jsoup.nodes.Element element13 = document1.append("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = element13.previousSibling();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.select.Elements elements4 = document1.getAllElements();
        org.jsoup.nodes.Element element6 = document1.append("#root");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element6.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements8 = element6.siblingElements();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Element element5 = document1.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.appendElement("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = document1.val("hi!");
        org.jsoup.nodes.Element element10 = document1.body();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.text("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document1.childNodes();
        org.jsoup.select.Elements elements10 = document1.getElementsByClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str11 = document1.title();
        org.jsoup.nodes.Element element13 = document1.createElement("<html>\n<head>\n <title>#document</title>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean14 = document1.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int15 = document1.siblingIndex();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element9 = element7.appendText("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element13 = element7.val("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str14 = element13.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements15 = element13.siblingElements();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        boolean boolean9 = element6.hasClass("hi!");
        org.jsoup.nodes.Element element11 = element6.appendElement("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root class=\" &lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>");
        org.jsoup.nodes.Element element13 = element6.addClass("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root class=\" &lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>");
        org.jsoup.select.Elements elements15 = element6.getElementsByClass("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>");
        org.jsoup.nodes.Element element17 = element6.removeClass(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> <#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element6.lastElementSibling();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        boolean boolean9 = element6.hasClass("hi!");
        org.jsoup.nodes.Element element11 = element6.appendElement("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root class=\" &lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = element6.nextSibling();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = document1.wrap("<<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\"\">\n</<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element11 = element9.addClass("");
        org.jsoup.nodes.Element element13 = element11.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = element11.html("#document");
        java.lang.String str17 = element11.absUrl("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean19 = element11.hasAttr("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = element11.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = element11.nextSibling();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document1.childNodes();
        java.lang.String str9 = document1.outerHtml();
        java.util.Set<java.lang.String> strSet10 = document1.classNames();
        org.jsoup.nodes.Element element12 = document1.createElement("<#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("");
        document16.title("hi!");
        org.jsoup.nodes.Element element19 = document14.prependChild((org.jsoup.nodes.Node) document16);
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("");
        document23.title("hi!");
        org.jsoup.nodes.Element element26 = document21.prependChild((org.jsoup.nodes.Node) document23);
        org.jsoup.nodes.Element element28 = element26.html("");
        org.jsoup.nodes.Element element29 = element19.prependChild((org.jsoup.nodes.Node) element26);
        java.lang.String str31 = element29.attr("#document");
        java.lang.String str33 = element29.attr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element34 = document1.appendChild((org.jsoup.nodes.Node) element29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements35 = document1.siblingElements();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element11 = element9.addClass("");
        boolean boolean13 = element11.hasClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements16 = element11.getElementsByAttributeValueEnding("html", "hi! #root hi!");
        java.lang.String str17 = element11.tagName();
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        document21.title("hi!");
        org.jsoup.nodes.Element element24 = document19.prependChild((org.jsoup.nodes.Node) document21);
        org.jsoup.select.Elements elements26 = document19.getElementsByClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet27 = document19.classNames();
        org.jsoup.select.Elements elements29 = document19.getElementsByIndexLessThan((int) (byte) 0);
        org.jsoup.select.Elements elements31 = document19.getElementsByClass("<#root>\n <html>\n  <head>\n  </head>\n  <body>\n    &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element32 = element11.prependChild((org.jsoup.nodes.Node) document19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element33 = element11.previousElementSibling();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
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
        boolean boolean33 = element29.hasClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node34 = element29.previousSibling();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        boolean boolean10 = document1.hasAttr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = document1.val("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document1.prependElement("<#root>\n<#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root><#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>");
        org.jsoup.nodes.Element element15 = document1.head();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document1.lastElementSibling();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node2 = document1.previousSibling();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.select.Elements elements4 = document1.getAllElements();
        org.jsoup.nodes.Element element6 = document1.append("#root");
        org.jsoup.nodes.Element element8 = document1.append(" #root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element8.firstElementSibling();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str6 = document1.className();
        org.jsoup.nodes.Element element7 = document1.head();
        org.jsoup.nodes.Element element9 = document1.addClass("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element12 = element9.attr("<#root>\n<#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root><#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>", "#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element12.firstElementSibling();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        boolean boolean5 = element3.hasAttr("");
        org.jsoup.nodes.Element element7 = element3.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element3.html("<#root class=\" &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/#root&gt; &lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>#document");
        org.jsoup.nodes.Element element10 = element3.empty();
        org.jsoup.nodes.Element element12 = element10.prepend("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element12.lastElementSibling();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        document6.title("hi!");
        org.jsoup.nodes.Element element9 = document4.prependChild((org.jsoup.nodes.Node) document6);
        java.lang.String str10 = document4.val();
        java.util.Set<java.lang.String> strSet11 = document4.classNames();
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document4);
        java.lang.String str13 = document1.baseUri();
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        document17.title("hi!");
        org.jsoup.nodes.Element element20 = document15.prependChild((org.jsoup.nodes.Node) document17);
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element23 = document15.prependChild((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Element element25 = element23.addClass("");
        org.jsoup.nodes.Element element27 = element25.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element28 = document1.appendChild((org.jsoup.nodes.Node) element27);
        boolean boolean29 = element28.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList30 = element28.siblingNodes();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = document1.text("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document1.siblingNodes();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document2 = document1.normalise();
        boolean boolean4 = document1.hasClass("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        document8.title("hi!");
        org.jsoup.nodes.Element element11 = document6.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element13 = element11.html("");
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        document17.title("hi!");
        org.jsoup.nodes.Element element20 = document15.prependChild((org.jsoup.nodes.Node) document17);
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document24 = org.jsoup.nodes.Document.createShell("");
        document24.title("hi!");
        org.jsoup.nodes.Element element27 = document22.prependChild((org.jsoup.nodes.Node) document24);
        org.jsoup.nodes.Element element29 = element27.html("");
        org.jsoup.nodes.Element element30 = element20.prependChild((org.jsoup.nodes.Node) element27);
        boolean boolean31 = element13.equals((java.lang.Object) element27);
        org.jsoup.nodes.Element element33 = element27.val("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element35 = element27.prependText("#document");
        org.jsoup.nodes.Element element36 = element35.parent();
        java.util.Set<java.lang.String> strSet37 = element36.classNames();
        org.jsoup.nodes.Element element38 = document1.classNames(strSet37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int39 = document1.siblingIndex();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
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
        boolean boolean43 = document1.isBlock();
        java.lang.String str44 = document1.title();
        java.lang.String str45 = document1.className();
        java.lang.String str47 = document1.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str48 = document1.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element49 = document1.nextElementSibling();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
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
        java.lang.String str17 = document16.html();
        org.jsoup.nodes.Element element19 = document16.createElement("<#root class=\" &lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element19.firstElementSibling();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
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
        org.jsoup.select.Elements elements32 = element29.children();
        org.jsoup.nodes.Document document34 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document36 = org.jsoup.nodes.Document.createShell("");
        document36.title("hi!");
        org.jsoup.nodes.Element element39 = document34.prependChild((org.jsoup.nodes.Node) document36);
        org.jsoup.nodes.Document document41 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element42 = document34.prependChild((org.jsoup.nodes.Node) document41);
        org.jsoup.nodes.Element element44 = element42.addClass("");
        java.lang.String str45 = element42.val();
        org.jsoup.select.Elements elements47 = element42.getElementsByTag("#document");
        boolean boolean48 = element29.equals((java.lang.Object) element42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element49 = element42.lastElementSibling();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        boolean boolean10 = document1.hasAttr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements13 = document1.getElementsByAttributeValueEnding("hi! <#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>", "hi! #root");
        org.jsoup.nodes.Element element15 = document1.append("<#root> <#root> hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document1.wrap("&lt;#root&gt; \n<html> \n<head> \n</head> \n<body>   &lt;#root&gt; \n <html> \n  <head> \n   <title>hi!\n </title>\n  </head> \n  <body>    \n   <html> \n    <head> \n    </head> \n    <body>  \n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element11 = element9.addClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element9.lastElementSibling();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Element element5 = element3.prependText("");
        org.jsoup.nodes.Element element7 = element3.removeClass("");
        org.jsoup.select.Elements elements9 = element3.getElementsByIndexGreaterThan((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element3.nextElementSibling();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
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
        org.jsoup.nodes.Element element38 = document21.prependText("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.nodes.Element element40 = document21.createElement(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.parser.Tag tag41 = element40.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element43 = element40.wrap("<#root>\n<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Element element5 = document1.val("hi!");
        org.jsoup.nodes.Element element6 = document1.parent();
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueNot("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!<<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "<#root>\n<#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root><#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>");
        java.lang.String str10 = document1.nodeName();
        java.lang.String str11 = document1.nodeName();
        org.jsoup.nodes.Element element13 = document1.prepend("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>");
        org.jsoup.nodes.Element element16 = document1.attr("<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html> hi!", "\n<head>\n <title>hi!</title>\n</head>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements17 = element16.siblingElements();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
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
        org.jsoup.nodes.Element element22 = element20.append("");
        element22.setBaseUri("<#root>\n<#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root><#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element22.previousElementSibling();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Element element5 = document1.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.toggleClass("#root");
        java.lang.String str8 = element7.id();
        org.jsoup.parser.Tag tag9 = element7.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element7.siblingNodes();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = element22.lastElementSibling();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("body");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList2 = document1.siblingNodes();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        boolean boolean3 = document1.hasText();
        java.lang.String str5 = document1.attr("<#root> <#root> hi!");
        org.jsoup.nodes.Element element7 = document1.wrap("head");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = document1.previousSibling();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element15.siblingNodes();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document2 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node3 = document1.previousSibling();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        boolean boolean7 = element6.hasText();
        org.jsoup.nodes.Node node9 = element6.removeAttr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element6.html("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = element11.attr("#root", "");
        org.jsoup.select.Elements elements17 = element14.getElementsByAttributeValue("<#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!", "\n<hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element14.lastElementSibling();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
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
        java.lang.Integer int18 = document1.siblingIndex();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
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
        org.jsoup.nodes.Element element16 = document4.text("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element18 = document4.createElement("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements19 = element18.siblingElements();
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int26 = element25.siblingIndex();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node2 = document1.nextSibling();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
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
        org.jsoup.select.Elements elements30 = element26.getElementsByAttributeValueEnding("#document", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element32 = element26.html("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        element32.remove();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int34 = element32.siblingIndex();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        boolean boolean5 = element3.hasAttr("");
        java.lang.String str6 = element3.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element3.siblingNodes();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
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
        org.jsoup.nodes.Element element39 = element34.toggleClass("hi! <#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements40 = element34.siblingElements();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element18.lastElementSibling();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexLessThan((int) (byte) 0);
        org.jsoup.nodes.Element element13 = document1.createElement("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean15 = element13.hasClass("hi!");
        java.lang.String str16 = element13.className();
        org.jsoup.nodes.Element element18 = element13.html("hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = element18.previousSibling();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.val();
        org.jsoup.nodes.Element element4 = document1.append("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean6 = element4.hasClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements7 = element4.siblingElements();
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("head");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements4 = document1.siblingElements();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        document6.title("hi!");
        org.jsoup.nodes.Element element9 = document4.prependChild((org.jsoup.nodes.Node) document6);
        java.lang.String str10 = document4.val();
        java.util.Set<java.lang.String> strSet11 = document4.classNames();
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document4);
        org.jsoup.nodes.Element element14 = document1.prependElement("\n<body>\n</body>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document1.siblingNodes();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element20.nextElementSibling();
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        org.jsoup.select.Elements elements5 = document1.getElementsByAttributeValueNot("#root", "#root");
        org.jsoup.nodes.Element element7 = document1.text("");
        org.jsoup.nodes.Document document8 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = document1.nextSibling();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
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
        org.jsoup.select.Elements elements16 = element14.getElementsByTag("#root");
        org.jsoup.parser.Tag tag17 = element14.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements18 = element14.siblingElements();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        boolean boolean5 = element3.hasAttr("");
        org.jsoup.nodes.Element element7 = element3.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element3.html("<#root class=\" &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/#root&gt; &lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>#document");
        org.jsoup.nodes.Element element10 = element3.empty();
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueEnding("<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>", "#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = element10.nextSibling();
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Node node11 = document1.removeAttr("hi!");
        boolean boolean12 = document1.hasText();
        org.jsoup.select.Elements elements14 = document1.getElementsByClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.select.Elements elements16 = document1.getElementsByIndexEquals((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document1.firstElementSibling();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = element22.nextElementSibling();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        boolean boolean10 = document1.hasAttr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = document1.val("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str13 = element12.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element12.wrap("<html>\n<head>\n</head>\n<body>\n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
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
        boolean boolean43 = document1.isBlock();
        java.lang.String str44 = document1.title();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = document1.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node46 = document1.previousSibling();
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.nodes.Element element18 = element16.toggleClass("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str19 = element16.text();
        java.lang.String str21 = element16.attr("");
        boolean boolean23 = element16.hasAttr("hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!");
        org.jsoup.select.Elements elements25 = element16.getElementsByIndexEquals((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = element16.previousElementSibling();
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        document6.title("hi!");
        org.jsoup.nodes.Element element9 = document4.prependChild((org.jsoup.nodes.Node) document6);
        java.lang.String str10 = document4.val();
        java.util.Set<java.lang.String> strSet11 = document4.classNames();
        org.jsoup.nodes.Element element12 = element2.classNames(strSet11);
        java.lang.String str14 = element2.attr("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element2.siblingNodes();
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
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
        org.jsoup.select.Elements elements41 = element39.getElementsByIndexEquals((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element42 = element39.lastElementSibling();
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
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
        java.lang.Integer int18 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element20 = document1.prependText("#document");
        org.jsoup.nodes.Element element21 = document1.empty();
        document1.setBaseUri("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements24 = document1.siblingElements();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
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
        org.jsoup.nodes.Element element24 = element6.appendText("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node25 = element6.nextSibling();
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element11 = element9.addClass("");
        org.jsoup.nodes.Element element13 = element11.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = element11.html("#document");
        org.jsoup.nodes.Element element17 = element11.prependElement("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element11.previousElementSibling();
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        document6.title("hi!");
        org.jsoup.nodes.Element element9 = document4.prependChild((org.jsoup.nodes.Node) document6);
        java.lang.String str10 = document4.val();
        java.util.Set<java.lang.String> strSet11 = document4.classNames();
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document4);
        java.lang.String str13 = document1.baseUri();
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        document17.title("hi!");
        org.jsoup.nodes.Element element20 = document15.prependChild((org.jsoup.nodes.Node) document17);
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element23 = document15.prependChild((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Element element25 = element23.addClass("");
        org.jsoup.nodes.Element element27 = element25.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element28 = document1.appendChild((org.jsoup.nodes.Node) element27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = element28.firstElementSibling();
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element9 = element7.appendText("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements10 = element7.siblingElements();
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Element element4 = element2.appendElement("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements5 = element2.siblingElements();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
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
        org.jsoup.nodes.Element element38 = document3.text("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList39 = element38.siblingNodes();
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
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
        org.jsoup.nodes.Element element21 = element6.appendElement("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element6.previousElementSibling();
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements24 = document1.siblingElements();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
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
        org.jsoup.nodes.Element element19 = element17.toggleClass("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = element19.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = element19.nextSibling();
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Attributes attributes10 = element9.attributes();
        boolean boolean11 = element9.hasText();
        java.util.Set<java.lang.String> strSet12 = element9.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element9.previousElementSibling();
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
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
        java.lang.Integer int17 = element16.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = element16.nextSibling();
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
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
        org.jsoup.nodes.Element element18 = document16.append(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements19 = document16.siblingElements();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Element element4 = element2.appendElement("#document");
        org.jsoup.select.Elements elements7 = element2.getElementsByAttributeValueEnding("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element2.wrap("\n<head>\n <title>hi!</title>\n</head>");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.select.Elements elements4 = document1.getAllElements();
        org.jsoup.nodes.Element element6 = document1.append("#root");
        org.jsoup.parser.Tag tag7 = document1.tag();
        java.lang.String str8 = document1.outerHtml();
        org.jsoup.nodes.Element element10 = document1.prependElement("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = document1.previousSibling();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        java.lang.String str4 = element3.tagName();
        org.jsoup.parser.Tag tag5 = element3.tag();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("");
        document9.title("hi!");
        org.jsoup.nodes.Element element12 = document7.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.parser.Tag tag13 = document7.tag();
        org.jsoup.select.Elements elements15 = document7.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        document19.title("hi!");
        org.jsoup.nodes.Element element22 = document17.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Document document24 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element25 = document17.prependChild((org.jsoup.nodes.Node) document24);
        org.jsoup.nodes.Node node27 = document17.removeAttr("hi!");
        org.jsoup.nodes.Document document29 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element31 = document29.html("hi!");
        org.jsoup.nodes.Element element33 = document29.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document35 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str36 = document35.title();
        org.jsoup.nodes.Element element37 = document29.prependChild((org.jsoup.nodes.Node) document35);
        org.jsoup.nodes.Element element38 = document17.appendChild((org.jsoup.nodes.Node) document29);
        org.jsoup.nodes.Element element40 = document29.createElement("#root");
        org.jsoup.nodes.Element element42 = document29.createElement("hi!");
        org.jsoup.select.Elements elements43 = document29.getAllElements();
        org.jsoup.nodes.Element element45 = document29.append("");
        java.util.Set<java.lang.String> strSet46 = element45.classNames();
        org.jsoup.nodes.Element element47 = document7.classNames(strSet46);
        java.lang.Integer int48 = element47.elementSiblingIndex();
        org.jsoup.nodes.Element element49 = element3.prependChild((org.jsoup.nodes.Node) element47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node50 = element3.nextSibling();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
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
        java.lang.String str28 = document1.title();
        org.jsoup.nodes.Element element30 = document1.appendText("head");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node31 = document1.nextSibling();
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Node node11 = document1.removeAttr("hi!");
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexGreaterThan((int) (byte) 1);
        org.jsoup.nodes.Element element14 = document1.head();
        org.jsoup.nodes.Element element15 = document1.head();
        org.jsoup.nodes.Element element17 = document1.prependText("hi! #root hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements18 = document1.siblingElements();
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = document1.firstElementSibling();
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document2 = document1.normalise();
        boolean boolean4 = document1.hasClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements6 = document1.getElementsByClass("#root");
        org.jsoup.nodes.Node node8 = document1.removeAttr("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        java.lang.String str9 = document1.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements10 = document1.siblingElements();
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        boolean boolean10 = document1.hasAttr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = document1.val("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element12.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element12.nextElementSibling();
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements2 = document1.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document1.text("<#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element11 = element9.addClass("");
        org.jsoup.nodes.Element element13 = element11.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = element11.html("#document");
        org.jsoup.nodes.Element element17 = element11.prependElement("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        document21.title("hi!");
        org.jsoup.nodes.Element element24 = document19.prependChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Element element26 = element24.html("");
        java.lang.String[] strArray31 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.jsoup.nodes.Element element34 = element24.classNames((java.util.Set<java.lang.String>) strSet32);
        org.jsoup.nodes.Document document36 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document38 = org.jsoup.nodes.Document.createShell("");
        document38.title("hi!");
        org.jsoup.nodes.Element element41 = document36.prependChild((org.jsoup.nodes.Node) document38);
        org.jsoup.nodes.Element element43 = element41.html("");
        java.lang.String[] strArray48 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet49 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet49, strArray48);
        org.jsoup.nodes.Element element51 = element41.classNames((java.util.Set<java.lang.String>) strSet49);
        org.jsoup.nodes.Element element53 = element51.toggleClass("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element54 = element24.prependChild((org.jsoup.nodes.Node) element51);
        element17.replaceWith((org.jsoup.nodes.Node) element24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements56 = element17.siblingElements();
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.nodes.Attributes attributes8 = document1.attributes();
        org.jsoup.nodes.Document document9 = document1.normalise();
        java.lang.String str10 = document9.outerHtml();
        org.jsoup.nodes.Element element12 = document9.toggleClass("<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document9.siblingNodes();
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
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
        org.jsoup.nodes.Element element18 = element16.toggleClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element18.firstElementSibling();
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements3 = document1.getElementsByIndexLessThan((-1));
        java.lang.String str4 = document1.text();
        org.jsoup.nodes.Element element7 = document1.attr("#document", "<#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!");
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        document11.title("hi!");
        org.jsoup.nodes.Element element14 = document9.prependChild((org.jsoup.nodes.Node) document11);
        org.jsoup.nodes.Element element16 = element14.html("");
        java.lang.String[] strArray21 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.jsoup.nodes.Element element24 = element14.classNames((java.util.Set<java.lang.String>) strSet22);
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("");
        document28.title("hi!");
        org.jsoup.nodes.Element element31 = document26.prependChild((org.jsoup.nodes.Node) document28);
        org.jsoup.nodes.Document document33 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element34 = document26.prependChild((org.jsoup.nodes.Node) document33);
        org.jsoup.nodes.Element element35 = element24.prependChild((org.jsoup.nodes.Node) element34);
        java.lang.String str36 = element34.data();
        org.jsoup.nodes.Element element38 = element34.appendText("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root class=\" &lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>");
        org.jsoup.nodes.Element element40 = element38.getElementById("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document42 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str43 = document42.title();
        org.jsoup.nodes.Document document45 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document47 = org.jsoup.nodes.Document.createShell("");
        document47.title("hi!");
        org.jsoup.nodes.Element element50 = document45.prependChild((org.jsoup.nodes.Node) document47);
        java.lang.String str51 = document45.val();
        java.util.Set<java.lang.String> strSet52 = document45.classNames();
        org.jsoup.nodes.Element element53 = document42.appendChild((org.jsoup.nodes.Node) document45);
        java.lang.String str55 = document45.absUrl("hi!");
        org.jsoup.nodes.Element element57 = document45.toggleClass("#document");
        org.jsoup.select.Elements elements60 = document45.getElementsByAttributeValue("#root", "<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Document document62 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document64 = org.jsoup.nodes.Document.createShell("");
        document64.title("hi!");
        org.jsoup.nodes.Element element67 = document62.prependChild((org.jsoup.nodes.Node) document64);
        org.jsoup.parser.Tag tag68 = document62.tag();
        org.jsoup.nodes.Document document70 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document72 = org.jsoup.nodes.Document.createShell("");
        document72.title("hi!");
        org.jsoup.nodes.Element element75 = document70.prependChild((org.jsoup.nodes.Node) document72);
        java.lang.String str76 = document70.val();
        java.util.Set<java.lang.String> strSet77 = document70.classNames();
        org.jsoup.nodes.Element element78 = document62.classNames(strSet77);
        java.lang.String str79 = element78.data();
        java.lang.String str80 = element78.toString();
        org.jsoup.nodes.Element element82 = element78.prependText("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet83 = element82.classNames();
        org.jsoup.nodes.Element element84 = document45.classNames(strSet83);
        org.jsoup.nodes.Element element85 = element38.classNames(strSet83);
        org.jsoup.nodes.Element element86 = element7.classNames(strSet83);
        org.jsoup.select.Elements elements87 = element86.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element88 = element86.lastElementSibling();
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Node node11 = document1.removeAttr("hi!");
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexGreaterThan((int) (byte) 1);
        org.jsoup.nodes.Element element15 = document1.text("");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element19 = document17.html("hi!");
        org.jsoup.nodes.Element element21 = document17.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean22 = element15.equals((java.lang.Object) element21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element15.previousElementSibling();
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.nodes.Attributes attributes8 = document1.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.wrap("<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root>\n<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root> &lt;#root&gt; \n<html> \n<head> \n</head> \n<body>   &lt;#root&gt; \n <html> \n  <head> \n   <title>hi!\n </title>\n  </head> \n  <body>    \n   <html> \n    <head> \n    </head> \n    <body>  \n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int2 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element4 = document1.append("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str5 = element4.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element4.firstElementSibling();
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        boolean boolean7 = element6.hasText();
        org.jsoup.nodes.Node node9 = element6.removeAttr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element6.html("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str12 = element6.data();
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("");
        document16.title("hi!");
        org.jsoup.nodes.Element element19 = document14.prependChild((org.jsoup.nodes.Node) document16);
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element22 = document14.prependChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Element element24 = element22.addClass("");
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("");
        document28.title("hi!");
        org.jsoup.nodes.Element element31 = document26.prependChild((org.jsoup.nodes.Node) document28);
        org.jsoup.select.Elements elements33 = document26.getElementsByClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet34 = document26.classNames();
        org.jsoup.nodes.Element element35 = element22.classNames(strSet34);
        org.jsoup.nodes.Element element36 = element6.classNames(strSet34);
        java.lang.String str38 = element36.attr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList39 = element36.siblingNodes();
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
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
        org.jsoup.nodes.Attributes attributes28 = document1.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = document1.wrap("<#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root><#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = document1.nextSibling();
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Node node11 = document1.removeAttr("hi!");
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexGreaterThan((int) (byte) 1);
        org.jsoup.nodes.Element element14 = document1.head();
        org.jsoup.nodes.Element element15 = document1.head();
        org.jsoup.nodes.Element element17 = document1.text("#root");
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexLessThan(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element17.wrap("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexLessThan((int) ' ');
        org.jsoup.select.Elements elements10 = document1.children();
        org.jsoup.nodes.Attributes attributes11 = document1.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.firstElementSibling();
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Attributes attributes10 = element9.attributes();
        boolean boolean11 = element9.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element9.firstElementSibling();
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
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
        java.lang.String str36 = element34.html();
        org.jsoup.nodes.Element element38 = element34.prependText("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element39 = element34.lastElementSibling();
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements2 = document1.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document1.text("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        java.lang.String str10 = document1.title();
        org.jsoup.nodes.Document document11 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document11.firstElementSibling();
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element11 = element9.appendElement("#document");
        java.lang.String str12 = element9.baseUri();
        java.lang.Integer int13 = element9.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element9.lastElementSibling();
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
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
        org.jsoup.nodes.Document document41 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document43 = org.jsoup.nodes.Document.createShell("");
        document43.title("hi!");
        org.jsoup.nodes.Element element46 = document41.prependChild((org.jsoup.nodes.Node) document43);
        org.jsoup.parser.Tag tag47 = document41.tag();
        org.jsoup.nodes.Document document49 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document51 = org.jsoup.nodes.Document.createShell("");
        document51.title("hi!");
        org.jsoup.nodes.Element element54 = document49.prependChild((org.jsoup.nodes.Node) document51);
        java.lang.String str55 = document49.val();
        java.util.Set<java.lang.String> strSet56 = document49.classNames();
        org.jsoup.nodes.Element element57 = document41.classNames(strSet56);
        java.lang.String str58 = element57.data();
        org.jsoup.nodes.Document document60 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document62 = org.jsoup.nodes.Document.createShell("");
        document62.title("hi!");
        org.jsoup.nodes.Element element65 = document60.prependChild((org.jsoup.nodes.Node) document62);
        org.jsoup.nodes.Element element67 = element65.html("");
        java.lang.String[] strArray72 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet73 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet73, strArray72);
        org.jsoup.nodes.Element element75 = element65.classNames((java.util.Set<java.lang.String>) strSet73);
        org.jsoup.nodes.Element element76 = element57.classNames((java.util.Set<java.lang.String>) strSet73);
        boolean boolean77 = element57.hasText();
        org.jsoup.nodes.Element element78 = element39.appendChild((org.jsoup.nodes.Node) element57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element79 = element39.nextElementSibling();
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        boolean boolean3 = document1.hasText();
        java.lang.String str4 = document1.title();
        document1.title("hi!");
        org.jsoup.nodes.Element element8 = document1.createElement("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        java.lang.String str10 = element8.absUrl(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = element8.removeClass("#root");
        org.jsoup.nodes.Element element13 = element8.empty();
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        document17.title("hi!");
        org.jsoup.nodes.Element element20 = document15.prependChild((org.jsoup.nodes.Node) document17);
        org.jsoup.parser.Tag tag21 = document15.tag();
        org.jsoup.select.Elements elements23 = document15.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Document document25 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document27 = org.jsoup.nodes.Document.createShell("");
        document27.title("hi!");
        org.jsoup.nodes.Element element30 = document25.prependChild((org.jsoup.nodes.Node) document27);
        org.jsoup.nodes.Document document32 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element33 = document25.prependChild((org.jsoup.nodes.Node) document32);
        org.jsoup.nodes.Node node35 = document25.removeAttr("hi!");
        org.jsoup.nodes.Document document37 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element39 = document37.html("hi!");
        org.jsoup.nodes.Element element41 = document37.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document43 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str44 = document43.title();
        org.jsoup.nodes.Element element45 = document37.prependChild((org.jsoup.nodes.Node) document43);
        org.jsoup.nodes.Element element46 = document25.appendChild((org.jsoup.nodes.Node) document37);
        org.jsoup.nodes.Element element48 = document37.createElement("#root");
        org.jsoup.nodes.Element element50 = document37.createElement("hi!");
        org.jsoup.select.Elements elements51 = document37.getAllElements();
        org.jsoup.nodes.Element element53 = document37.append("");
        java.util.Set<java.lang.String> strSet54 = element53.classNames();
        org.jsoup.nodes.Element element55 = document15.classNames(strSet54);
        org.jsoup.nodes.Element element56 = element13.classNames(strSet54);
        org.jsoup.nodes.Element element57 = element13.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element58 = element13.lastElementSibling();
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("\n<hi!>\n</hi!>");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str4 = document3.title();
        org.jsoup.select.Elements elements7 = document3.getElementsByAttributeValueNot("#root", "#root");
        org.jsoup.nodes.Element element9 = document3.text("#document");
        org.jsoup.select.Elements elements11 = element9.getElementsByIndexEquals((int) (short) -1);
        java.lang.String str13 = element9.attr("");
        boolean boolean14 = document1.equals((java.lang.Object) str13);
        org.jsoup.nodes.Element element16 = document1.addClass("head");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document1.lastElementSibling();
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
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
        org.jsoup.select.Elements elements21 = element16.getElementsByClass(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document25 = org.jsoup.nodes.Document.createShell("");
        document25.title("hi!");
        org.jsoup.nodes.Element element28 = document23.prependChild((org.jsoup.nodes.Node) document25);
        org.jsoup.parser.Tag tag29 = document23.tag();
        org.jsoup.select.Elements elements31 = document23.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Document document33 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document35 = org.jsoup.nodes.Document.createShell("");
        document35.title("hi!");
        org.jsoup.nodes.Element element38 = document33.prependChild((org.jsoup.nodes.Node) document35);
        org.jsoup.nodes.Document document40 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element41 = document33.prependChild((org.jsoup.nodes.Node) document40);
        org.jsoup.nodes.Node node43 = document33.removeAttr("hi!");
        org.jsoup.nodes.Document document45 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element47 = document45.html("hi!");
        org.jsoup.nodes.Element element49 = document45.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document51 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str52 = document51.title();
        org.jsoup.nodes.Element element53 = document45.prependChild((org.jsoup.nodes.Node) document51);
        org.jsoup.nodes.Element element54 = document33.appendChild((org.jsoup.nodes.Node) document45);
        org.jsoup.nodes.Element element56 = document45.createElement("#root");
        org.jsoup.nodes.Element element58 = document45.createElement("hi!");
        org.jsoup.select.Elements elements59 = document45.getAllElements();
        org.jsoup.nodes.Element element61 = document45.append("");
        java.util.Set<java.lang.String> strSet62 = element61.classNames();
        org.jsoup.nodes.Element element63 = document23.classNames(strSet62);
        org.jsoup.nodes.Element element64 = element16.classNames(strSet62);
        element64.setBaseUri("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element67 = element64.firstElementSibling();
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
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
        java.lang.String str19 = document1.outerHtml();
        boolean boolean21 = document1.hasClass("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.parser.Tag tag22 = document1.tag();
        org.jsoup.nodes.Element element24 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element26 = document1.prependElement("\n<head>\n <title>hi!</title>\n</head>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList27 = document1.siblingNodes();
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document5 = org.jsoup.nodes.Document.createShell("");
        document5.title("hi!");
        org.jsoup.nodes.Element element8 = document3.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.parser.Tag tag9 = document3.tag();
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        document13.title("hi!");
        org.jsoup.nodes.Element element16 = document11.prependChild((org.jsoup.nodes.Node) document13);
        java.lang.String str17 = document11.val();
        java.util.Set<java.lang.String> strSet18 = document11.classNames();
        org.jsoup.nodes.Element element19 = document3.classNames(strSet18);
        org.jsoup.nodes.Element element20 = document1.classNames(strSet18);
        org.jsoup.select.Elements elements23 = element20.getElementsByAttributeValue("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>>", "&lt;#root&gt; \n<html> \n<head> \n</head> \n<body>   &lt;#root&gt; \n <html> \n  <head> \n   <title>hi!\n </title>\n  </head> \n  <body>    \n   <html> \n    <head> \n    </head> \n    <body>  \n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = element20.lastElementSibling();
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements8 = element6.getElementsByAttribute("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element6.lastElementSibling();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element11 = element9.addClass("");
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        document15.title("hi!");
        org.jsoup.nodes.Element element18 = document13.prependChild((org.jsoup.nodes.Node) document15);
        org.jsoup.nodes.Element element20 = element18.html("");
        java.lang.String[] strArray25 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        org.jsoup.nodes.Element element28 = element18.classNames((java.util.Set<java.lang.String>) strSet26);
        org.jsoup.select.Elements elements30 = element28.getElementsByIndexEquals((int) (byte) 0);
        boolean boolean31 = element9.equals((java.lang.Object) element28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element32 = element28.lastElementSibling();
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element45 = element41.wrap("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        boolean boolean5 = element3.hasAttr("");
        org.jsoup.select.Elements elements6 = element3.children();
        org.jsoup.nodes.Node node8 = element3.childNode((int) (byte) 0);
        org.jsoup.nodes.Element element10 = element3.val("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n  #root\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = element3.previousSibling();
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
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
        java.lang.String str37 = document21.title();
        org.jsoup.nodes.Element element39 = document21.getElementById(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> <#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element42 = document21.attr("<#root>\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi! #root hi!");
        java.lang.String str43 = element42.toString();
        org.jsoup.nodes.Document document45 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str46 = document45.title();
        org.jsoup.nodes.Document document48 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document50 = org.jsoup.nodes.Document.createShell("");
        document50.title("hi!");
        org.jsoup.nodes.Element element53 = document48.prependChild((org.jsoup.nodes.Node) document50);
        java.lang.String str54 = document48.val();
        java.util.Set<java.lang.String> strSet55 = document48.classNames();
        org.jsoup.nodes.Element element56 = document45.appendChild((org.jsoup.nodes.Node) document48);
        java.lang.Integer int57 = document45.elementSiblingIndex();
        org.jsoup.nodes.Element element59 = document45.wrap("<#root> <#root> hi!");
        document45.title("<#root class=\" &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/#root&gt; &lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>#document");
        org.jsoup.nodes.Element element63 = document45.text("<#root> <#root> hi!");
        element42.replaceWith((org.jsoup.nodes.Node) document45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element66 = element42.wrap("<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html><#root class=\" &lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        boolean boolean7 = element6.hasText();
        org.jsoup.nodes.Node node9 = element6.removeAttr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element6.html("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str12 = element6.data();
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("");
        document16.title("hi!");
        org.jsoup.nodes.Element element19 = document14.prependChild((org.jsoup.nodes.Node) document16);
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element22 = document14.prependChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Element element24 = element22.addClass("");
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("");
        document28.title("hi!");
        org.jsoup.nodes.Element element31 = document26.prependChild((org.jsoup.nodes.Node) document28);
        org.jsoup.select.Elements elements33 = document26.getElementsByClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet34 = document26.classNames();
        org.jsoup.nodes.Element element35 = element22.classNames(strSet34);
        org.jsoup.nodes.Element element36 = element6.classNames(strSet34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int37 = element6.siblingIndex();
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        boolean boolean3 = document1.hasText();
        java.lang.String str4 = document1.title();
        document1.title("hi!");
        org.jsoup.nodes.Element element8 = document1.createElement("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        java.lang.String str10 = element8.absUrl(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = element8.removeClass("#root");
        org.jsoup.nodes.Element element13 = element8.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = element13.previousSibling();
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
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
        java.util.List<org.jsoup.nodes.Node> nodeList20 = element6.childNodes();
        org.jsoup.select.Elements elements22 = element6.getElementsByClass("<<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> class=\"\">\n</<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = element6.previousSibling();
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexLessThan((int) ' ');
        java.lang.String str10 = document1.nodeName();
        org.jsoup.nodes.Element element12 = document1.html("#root");
        org.jsoup.nodes.Document document13 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int14 = document13.siblingIndex();
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
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
        org.jsoup.nodes.Element element28 = document1.head();
        org.jsoup.select.Elements elements30 = document1.getElementsByIndexLessThan((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int31 = document1.siblingIndex();
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        boolean boolean3 = document1.hasText();
        java.lang.String str4 = document1.title();
        java.lang.String str5 = document1.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document1.nextElementSibling();
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        java.lang.String str8 = document1.tagName();
        org.jsoup.nodes.Node node10 = document1.removeAttr(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int11 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        document15.title("hi!");
        org.jsoup.nodes.Element element18 = document13.prependChild((org.jsoup.nodes.Node) document15);
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document15.siblingNodes();
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("");
        document23.title("hi!");
        org.jsoup.nodes.Element element26 = document21.prependChild((org.jsoup.nodes.Node) document23);
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element29 = document21.prependChild((org.jsoup.nodes.Node) document28);
        org.jsoup.nodes.Node node31 = document21.removeAttr("hi!");
        org.jsoup.nodes.Document document33 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element35 = document33.html("hi!");
        org.jsoup.nodes.Element element37 = document33.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document39 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str40 = document39.title();
        org.jsoup.nodes.Element element41 = document33.prependChild((org.jsoup.nodes.Node) document39);
        org.jsoup.nodes.Element element42 = document21.appendChild((org.jsoup.nodes.Node) document33);
        org.jsoup.nodes.Element element44 = document33.createElement("#root");
        java.lang.String str45 = document33.className();
        org.jsoup.nodes.Element element47 = document33.appendText("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        document15.replaceWith((org.jsoup.nodes.Node) document33);
        org.jsoup.nodes.Element element50 = document33.prependText("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        boolean boolean51 = document1.equals((java.lang.Object) element50);
        org.jsoup.nodes.Element element53 = document1.toggleClass("hi! #root hi!");
        java.lang.String str54 = document1.nodeName();
        document1.title("<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root>\n<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>&lt;#root&gt; \n<html> \n<head> \n</head> \n<body>   &lt;#root&gt; \n <html> \n  <head> \n   <title>hi! </title>\n  </head> \n  <body>    \n   <html> \n    <head> \n    </head> \n    <body>  hi!\n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int57 = document1.siblingIndex();
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        boolean boolean7 = element6.hasText();
        org.jsoup.nodes.Node node9 = element6.removeAttr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements11 = element6.getElementsByIndexEquals((-1));
        org.jsoup.nodes.Element element13 = element6.appendText("#root");
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        document17.title("hi!");
        org.jsoup.nodes.Element element20 = document15.prependChild((org.jsoup.nodes.Node) document17);
        org.jsoup.parser.Tag tag21 = document15.tag();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = document15.childNodes();
        org.jsoup.nodes.Document document24 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("");
        document26.title("hi!");
        org.jsoup.nodes.Element element29 = document24.prependChild((org.jsoup.nodes.Node) document26);
        org.jsoup.nodes.Document document31 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element32 = document24.prependChild((org.jsoup.nodes.Node) document31);
        org.jsoup.nodes.Node node34 = document24.removeAttr("hi!");
        org.jsoup.nodes.Document document36 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element38 = document36.html("hi!");
        org.jsoup.nodes.Element element40 = document36.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document42 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str43 = document42.title();
        org.jsoup.nodes.Element element44 = document36.prependChild((org.jsoup.nodes.Node) document42);
        org.jsoup.nodes.Element element45 = document24.appendChild((org.jsoup.nodes.Node) document36);
        org.jsoup.nodes.Element element47 = document36.createElement("#root");
        org.jsoup.nodes.Element element49 = element47.toggleClass("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean50 = element47.hasText();
        org.jsoup.nodes.Element element51 = document15.appendChild((org.jsoup.nodes.Node) element47);
        org.jsoup.nodes.Element element52 = element6.appendChild((org.jsoup.nodes.Node) document15);
        java.lang.String str53 = element6.text();
        org.jsoup.nodes.Element element55 = element6.prepend("<#root>\n <html>\n  <head>\n  </head>\n  <body>\n    &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element56 = element6.previousElementSibling();
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements8 = document1.getElementsByClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueEnding(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.select.Elements elements14 = document1.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root>\n<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>", "<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.select.Elements elements17 = document1.getElementsByAttributeValueContaining("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = document1.wrap("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>#root");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Node node11 = document1.removeAttr("hi!");
        boolean boolean12 = document1.hasText();
        org.jsoup.nodes.Element element14 = document1.createElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root>\n<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int15 = document1.siblingIndex();
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Node node11 = document1.removeAttr("hi!");
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexGreaterThan((int) (byte) 1);
        org.jsoup.nodes.Element element14 = document1.head();
        document1.title("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!<<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        java.lang.String str17 = document1.tagName();
        org.jsoup.select.Elements elements19 = document1.getElementsByTag("<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html> hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = document1.previousSibling();
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
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
        org.jsoup.nodes.Element element27 = document1.wrap("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html><#document>\n</#document>");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element11 = element9.addClass("");
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        document15.title("hi!");
        org.jsoup.nodes.Element element18 = document13.prependChild((org.jsoup.nodes.Node) document15);
        org.jsoup.nodes.Element element20 = element18.html("");
        java.lang.String[] strArray25 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        org.jsoup.nodes.Element element28 = element18.classNames((java.util.Set<java.lang.String>) strSet26);
        org.jsoup.select.Elements elements30 = element28.getElementsByIndexEquals((int) (byte) 0);
        boolean boolean31 = element9.equals((java.lang.Object) element28);
        org.jsoup.nodes.Element element33 = element28.append("#root");
        element33.setBaseUri("&lt;#root&gt; \n<html> \n<head> \n <title>hi!\n </title>\n</head> \n<body>    \n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.nodes.Element element37 = element33.html("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList38 = element33.siblingNodes();
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements3 = document1.getElementsByIndexLessThan((-1));
        org.jsoup.nodes.Document document4 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.nextElementSibling();
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.appendText("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = document1.previousSibling();
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.select.Elements elements4 = document1.getAllElements();
        org.jsoup.nodes.Element element6 = document1.append("#root");
        org.jsoup.parser.Tag tag7 = document1.tag();
        java.lang.String str8 = document1.outerHtml();
        org.jsoup.nodes.Element element10 = document1.prependElement("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements11 = document1.siblingElements();
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
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
        org.jsoup.nodes.Element element17 = document16.body();
        org.jsoup.nodes.Document document18 = document16.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.siblingNodes();
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
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
        org.jsoup.select.Elements elements16 = element14.getElementsByTag("#root");
        org.jsoup.nodes.Element element18 = element14.toggleClass("<#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html> hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList19 = element14.siblingNodes();
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        boolean boolean10 = document1.hasAttr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str11 = document1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements12 = document1.siblingElements();
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> <#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList2 = document1.siblingNodes();
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        boolean boolean10 = document1.hasAttr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = document1.val("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document1.prependElement("<#root>\n<#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root><#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document1.siblingNodes();
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
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
        java.lang.String str22 = document1.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = document1.text(" #root");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str2 = document1.data();
        boolean boolean4 = document1.hasAttr("<html>\n<head>\n <title>html</title>\n</head>\n<body>\n</body>\n</html><<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.nextElementSibling();
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
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
        org.jsoup.nodes.Element element23 = element16.html("hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!");
        org.jsoup.nodes.Element element25 = element23.html("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element25.wrap("hi! <#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
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
        org.jsoup.select.Elements elements19 = document16.getElementsByAttributeValueEnding("<#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = document16.wrap("<html>\n <head>\n </head>\n <body>\n </body>\n</html><#root>\n <#root>\n </#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>");
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
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
        org.jsoup.nodes.Document document41 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document43 = org.jsoup.nodes.Document.createShell("");
        document43.title("hi!");
        org.jsoup.nodes.Element element46 = document41.prependChild((org.jsoup.nodes.Node) document43);
        org.jsoup.parser.Tag tag47 = document41.tag();
        org.jsoup.nodes.Document document49 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document51 = org.jsoup.nodes.Document.createShell("");
        document51.title("hi!");
        org.jsoup.nodes.Element element54 = document49.prependChild((org.jsoup.nodes.Node) document51);
        java.lang.String str55 = document49.val();
        java.util.Set<java.lang.String> strSet56 = document49.classNames();
        org.jsoup.nodes.Element element57 = document41.classNames(strSet56);
        java.lang.String str58 = element57.data();
        org.jsoup.nodes.Document document60 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document62 = org.jsoup.nodes.Document.createShell("");
        document62.title("hi!");
        org.jsoup.nodes.Element element65 = document60.prependChild((org.jsoup.nodes.Node) document62);
        org.jsoup.nodes.Element element67 = element65.html("");
        java.lang.String[] strArray72 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet73 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet73, strArray72);
        org.jsoup.nodes.Element element75 = element65.classNames((java.util.Set<java.lang.String>) strSet73);
        org.jsoup.nodes.Element element76 = element57.classNames((java.util.Set<java.lang.String>) strSet73);
        boolean boolean77 = element57.hasText();
        org.jsoup.nodes.Element element78 = element39.appendChild((org.jsoup.nodes.Node) element57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node79 = element39.nextSibling();
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        document6.title("hi!");
        org.jsoup.nodes.Element element9 = document4.prependChild((org.jsoup.nodes.Node) document6);
        java.lang.String str10 = document4.val();
        java.util.Set<java.lang.String> strSet11 = document4.classNames();
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document4);
        java.lang.Integer int13 = element12.elementSiblingIndex();
        org.jsoup.select.Elements elements16 = element12.getElementsByAttributeValueContaining("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;", "<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element12.lastElementSibling();
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element10 = document1.append("");
        org.jsoup.select.Elements elements13 = document1.getElementsByAttributeValueStarting("hi! #root hi!", "<hi!>\n<#root>\n&lt;#root&gt; \n<html> \n <head> \n  <title>hi!\n </title>\n </head> \n <body>    \n  <html> \n   <head> \n   </head> \n   <body>  \n   </body>\n  </html>\n </body>\n</html>\n</#root>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = document1.nextSibling();
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
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
        org.jsoup.nodes.Element element19 = document1.body();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = document1.previousSibling();
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
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
        java.lang.String str19 = element18.tagName();
        org.jsoup.parser.Tag tag20 = element18.tag();
        org.jsoup.nodes.Element element23 = element18.attr("hi! <#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>", "<#root> <#root> hi!");
        org.jsoup.select.Elements elements24 = element23.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node25 = element23.nextSibling();
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexLessThan((int) (byte) 0);
        org.jsoup.nodes.Element element13 = document1.createElement("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements16 = document1.getElementsByAttributeValue("#root", "hi!");
        org.jsoup.nodes.Element element18 = document1.createElement("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String[] strArray20 = new java.lang.String[] { " <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        org.jsoup.nodes.Element element23 = document1.classNames((java.util.Set<java.lang.String>) strSet21);
        java.lang.String str24 = document1.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int25 = document1.siblingIndex();
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str6 = document1.id();
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueContaining("<html>\n <head>\n </head>\n <body>\n </body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        document1.title("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>");
        boolean boolean13 = document1.hasClass("<#root>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document1.siblingNodes();
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        java.lang.String str10 = document1.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int11 = document1.siblingIndex();
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        boolean boolean5 = element3.hasAttr("");
        org.jsoup.nodes.Element element7 = element3.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element3.html("<#root class=\" &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/#root&gt; &lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>#document");
        org.jsoup.nodes.Element element10 = element3.empty();
        org.jsoup.nodes.Element element12 = element10.prepend("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int13 = element12.siblingIndex();
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
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
        org.jsoup.nodes.Element element38 = document21.prependText("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.nodes.Document document39 = document21.normalise();
        org.jsoup.nodes.Element element41 = document21.createElement("head");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node42 = element41.nextSibling();
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
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
        org.jsoup.nodes.Element element22 = element6.empty();
        org.jsoup.nodes.Element element25 = element22.attr("<#root>\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root class=\"\">\n<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = element25.nextElementSibling();
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
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
        org.jsoup.nodes.Element element25 = document1.toggleClass("body");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList26 = element25.siblingNodes();
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList27 = element24.siblingNodes();
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        boolean boolean7 = element6.hasText();
        org.jsoup.nodes.Node node9 = element6.removeAttr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node9.previousSibling();
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Document document4 = document1.normalise();
        java.lang.String str6 = document4.absUrl("#root");
        org.jsoup.nodes.Element element8 = document4.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document4.previousElementSibling();
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Attributes attributes4 = element3.attributes();
        org.jsoup.select.Elements elements5 = element3.children();
        org.jsoup.parser.Tag tag6 = element3.tag();
        org.jsoup.nodes.Element element8 = element3.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int9 = element8.siblingIndex();
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
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
        org.jsoup.select.Elements elements23 = element20.getElementsByAttributeValueContaining("<#root> <#root> hi!", "&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.nodes.Element element26 = element20.attr(" #root", "<html>\n<head>\n <title>html</title>\n</head>\n<body>\n</body>\n</html><<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element20.nextElementSibling();
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("\n<hi!>\n</hi!>");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueStarting("hi! #root", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean5 = document1.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.wrap("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
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
        document1.title("<#root class=\" &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/#root&gt; &lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>#document");
        java.lang.String str18 = document1.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document1.siblingNodes();
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
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
        org.jsoup.nodes.Element element49 = element41.lastElementSibling();
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.nodes.Element element18 = element16.toggleClass("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int19 = element16.siblingIndex();
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements8 = document1.getElementsByClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueEnding(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.nodes.Element element12 = document1.head();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = document1.wrap("<<#root>\n<#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root><#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>>\n</<#root>\n<#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root><#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>>\n<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
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
        org.jsoup.select.Elements elements20 = element6.siblingElements();
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element11 = element9.addClass("");
        org.jsoup.nodes.Element element13 = element11.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = element11.html("#document");
        java.lang.String str17 = element11.absUrl("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str18 = element11.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = element11.nextSibling();
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexLessThan((int) ' ');
        java.lang.String str10 = document1.nodeName();
        org.jsoup.nodes.Element element12 = document1.html("#root");
        org.jsoup.nodes.Element element14 = document1.wrap("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("hi!");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexLessThan((int) ' ');
        java.lang.String str10 = document1.nodeName();
        org.jsoup.nodes.Element element11 = document1.head();
        java.lang.String str12 = document1.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document1.lastElementSibling();
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element9 = element7.appendText("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element13 = element7.val("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements15 = element7.getElementsByIndexGreaterThan((int) (short) 0);
        boolean boolean16 = element7.isBlock();
        org.jsoup.nodes.Element element18 = element7.removeClass("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!<<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int19 = element18.siblingIndex();
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
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
        org.jsoup.nodes.Element element16 = document4.text("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element18 = document4.createElement("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList19 = element18.siblingNodes();
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
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
        document1.title("<html>\n<head>\n <title>#document</title>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element48 = document1.firstElementSibling();
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
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
        java.lang.String str27 = document13.baseUri();
        org.jsoup.nodes.Element element29 = document13.createElement("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str30 = element29.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node31 = element29.previousSibling();
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValue("#root", "#document");
        org.jsoup.select.Elements elements12 = element8.getAllElements();
        org.jsoup.nodes.Element element14 = element8.prependElement("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        element14.remove();
        java.lang.String str16 = element14.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element14.previousElementSibling();
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
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
        java.lang.Integer int21 = element16.elementSiblingIndex();
        org.jsoup.nodes.Element element23 = element16.append("<#root class=\" &lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = element23.nextSibling();
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Element element5 = document1.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str8 = document7.title();
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element9.empty();
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str14 = document13.title();
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        document18.title("hi!");
        org.jsoup.nodes.Element element21 = document16.prependChild((org.jsoup.nodes.Node) document18);
        java.lang.String str22 = document16.val();
        java.util.Set<java.lang.String> strSet23 = document16.classNames();
        org.jsoup.nodes.Element element24 = document13.appendChild((org.jsoup.nodes.Node) document16);
        java.lang.Integer int25 = document13.elementSiblingIndex();
        org.jsoup.nodes.Node node27 = document13.childNode((int) (byte) 0);
        org.jsoup.nodes.Document document28 = document13.normalise();
        org.jsoup.select.Elements elements31 = document13.getElementsByAttributeValue("<html>\n<head>\n <title>#document</title>\n</head>\n<body>\n</body>\n</html>", "hi! <#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>");
        boolean boolean32 = element11.equals((java.lang.Object) document13);
        java.lang.String str33 = document13.outerHtml();
        org.jsoup.select.Elements elements36 = document13.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root>\n<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>&lt;#root&gt; \n<html> \n<head> \n</head> \n<body>   &lt;#root&gt; \n <html> \n  <head> \n   <title>hi! </title>\n  </head> \n  <body>    \n   <html> \n    <head> \n    </head> \n    <body>  hi!\n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>", "<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements37 = document13.siblingElements();
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
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
        org.jsoup.nodes.Element element28 = document13.removeClass("#root");
        org.jsoup.nodes.Element element30 = document13.prependElement("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>");
        java.lang.String str31 = document13.id();
        org.jsoup.nodes.Element element33 = document13.createElement("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element34 = element33.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element35 = element34.lastElementSibling();
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements21 = element18.siblingElements();
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        boolean boolean10 = document1.hasAttr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = document1.val("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements14 = document1.getElementsByAttribute("hi! #root");
        boolean boolean15 = document1.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document1.wrap("hi! <#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>");
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexLessThan((int) (byte) 0);
        org.jsoup.nodes.Element element13 = document1.createElement("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements16 = document1.getElementsByAttributeValue("#root", "hi!");
        org.jsoup.nodes.Element element18 = document1.createElement("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String[] strArray20 = new java.lang.String[] { " <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        org.jsoup.nodes.Element element23 = document1.classNames((java.util.Set<java.lang.String>) strSet21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int24 = element23.siblingIndex();
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Attributes attributes4 = element3.attributes();
        org.jsoup.select.Elements elements5 = element3.children();
        org.jsoup.parser.Tag tag6 = element3.tag();
        org.jsoup.nodes.Element element8 = element3.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element12 = document10.html("hi!");
        org.jsoup.nodes.Element element14 = document10.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str17 = document16.title();
        org.jsoup.nodes.Element element18 = document10.prependChild((org.jsoup.nodes.Node) document16);
        org.jsoup.nodes.Element element19 = document16.body();
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("");
        document23.title("hi!");
        org.jsoup.nodes.Element element26 = document21.prependChild((org.jsoup.nodes.Node) document23);
        java.lang.String str27 = element26.toString();
        document16.replaceWith((org.jsoup.nodes.Node) element26);
        org.jsoup.nodes.Element element29 = document16.body();
        boolean boolean30 = element8.equals((java.lang.Object) document16);
        boolean boolean32 = element8.hasAttr("<#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element33 = element8.nextElementSibling();
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.select.Elements elements18 = element16.getElementsByIndexEquals((int) (byte) 0);
        java.util.List<org.jsoup.nodes.Node> nodeList19 = element16.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element16.previousElementSibling();
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document2 = document1.normalise();
        boolean boolean4 = document1.hasClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements6 = document1.getElementsByClass("#root");
        org.jsoup.nodes.Node node8 = document1.removeAttr("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        java.lang.String str9 = document1.html();
        org.jsoup.nodes.Element element11 = document1.html("\n<hi!>\n</hi!>");
        org.jsoup.nodes.Node node13 = document1.removeAttr("\n  <body>\n  </body>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = document1.nextSibling();
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("\n<hi!>\n</hi!>");
        org.jsoup.nodes.Element element2 = document1.body();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document1.nextElementSibling();
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
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
        org.jsoup.nodes.Node node49 = element41.removeAttr("html");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList50 = element41.siblingNodes();
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str2 = document1.className();
        org.jsoup.nodes.Element element4 = document1.append("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = element4.toggleClass("");
        org.jsoup.select.Elements elements9 = element4.getElementsByAttributeValueNot("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>", "#root");
        java.util.Set<java.lang.String> strSet10 = element4.classNames();
        java.util.Set<java.lang.String> strSet11 = element4.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element4.wrap(" <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <title>hi!</title> </#root> <#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root><#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element9 = element7.appendText("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements12 = element7.getElementsByAttributeValue("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!", "&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        java.lang.String str13 = element7.html();
        org.jsoup.nodes.Element element14 = element7.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element7.firstElementSibling();
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
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
        org.jsoup.select.Elements elements22 = element16.getElementsByTag("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>");
        org.jsoup.select.Elements elements24 = element16.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.select.Elements elements27 = element16.getElementsByAttributeValueEnding("<#root> <#root> hi!", "hi! <#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element16.previousElementSibling();
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = document1.text("#root");
        java.lang.Integer int9 = element8.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements10 = element8.siblingElements();
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
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
        org.jsoup.nodes.Element element34 = document1.createElement("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>&lt;&lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt; class=&quot;&quot;&gt;\n&lt;/&lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;&gt;</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element35 = document1.lastElementSibling();
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("");
        document12.title("hi!");
        org.jsoup.nodes.Element element15 = document10.prependChild((org.jsoup.nodes.Node) document12);
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        document19.title("hi!");
        org.jsoup.nodes.Element element22 = document17.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Element element24 = element22.html("");
        org.jsoup.nodes.Element element25 = element15.prependChild((org.jsoup.nodes.Node) element22);
        boolean boolean26 = element8.equals((java.lang.Object) element22);
        org.jsoup.nodes.Element element28 = element22.val("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element30 = element22.prependText("#document");
        org.jsoup.nodes.Element element31 = element30.parent();
        java.util.Set<java.lang.String> strSet32 = element31.classNames();
        java.lang.String str33 = element31.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element34 = element31.previousElementSibling();
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int2 = document1.elementSiblingIndex();
        org.jsoup.select.Elements elements3 = document1.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document1.firstElementSibling();
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
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
        org.jsoup.select.Elements elements30 = element26.getElementsByAttributeValueEnding("#document", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element32 = element26.html("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        element32.remove();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element34 = element32.nextElementSibling();
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Attributes attributes10 = element9.attributes();
        boolean boolean11 = element9.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element9.siblingNodes();
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root><#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = document1.previousElementSibling();
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = document1.toggleClass("#root");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document1.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = document1.previousSibling();
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Node node11 = document1.removeAttr("hi!");
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexGreaterThan((int) (byte) 1);
        org.jsoup.nodes.Element element14 = document1.head();
        document1.title("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!<<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element18 = document1.getElementById("hi! #root");
        org.jsoup.nodes.Document document19 = document1.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList20 = document19.siblingNodes();
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.title();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Element element5 = document1.val("hi!");
        org.jsoup.nodes.Element element6 = document1.parent();
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueNot("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!<<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "<#root>\n<#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root><#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>");
        java.lang.String str10 = document1.nodeName();
        org.jsoup.nodes.Element element12 = document1.appendElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean13 = document1.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int14 = document1.siblingIndex();
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element11 = element9.addClass("");
        org.jsoup.nodes.Element element13 = element11.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element11.attr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", " <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str17 = element11.val();
        org.jsoup.select.Elements elements20 = element11.getElementsByAttributeValueNot("hi! #root", "&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>");
        boolean boolean22 = element11.hasAttr(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> <#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element24 = element11.toggleClass("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element11.previousElementSibling();
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
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
        org.jsoup.select.Elements elements27 = document13.getAllElements();
        org.jsoup.nodes.Element element29 = document13.append("");
        org.jsoup.select.Elements elements31 = element29.getElementsByTag("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document33 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root class=\" &lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>");
        org.jsoup.nodes.Element element35 = document33.appendText("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        element29.replaceWith((org.jsoup.nodes.Node) document33);
        java.lang.String str37 = element29.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements38 = element29.siblingElements();
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements20 = element16.siblingElements();
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Element element5 = document1.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element5.toggleClass("hi!");
        java.lang.String str8 = element7.baseUri();
        org.jsoup.nodes.Element element10 = element7.appendElement("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!<<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element7.wrap("<html>\n<head>\n <title>html</title>\n</head>\n<body>\n</body>\n</html><<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        boolean boolean7 = element6.hasText();
        org.jsoup.nodes.Node node9 = element6.removeAttr("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements11 = element6.getElementsByIndexEquals((-1));
        org.jsoup.nodes.Element element13 = element6.appendText("#root");
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        document17.title("hi!");
        org.jsoup.nodes.Element element20 = document15.prependChild((org.jsoup.nodes.Node) document17);
        org.jsoup.parser.Tag tag21 = document15.tag();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = document15.childNodes();
        org.jsoup.nodes.Document document24 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("");
        document26.title("hi!");
        org.jsoup.nodes.Element element29 = document24.prependChild((org.jsoup.nodes.Node) document26);
        org.jsoup.nodes.Document document31 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element32 = document24.prependChild((org.jsoup.nodes.Node) document31);
        org.jsoup.nodes.Node node34 = document24.removeAttr("hi!");
        org.jsoup.nodes.Document document36 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element38 = document36.html("hi!");
        org.jsoup.nodes.Element element40 = document36.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document42 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str43 = document42.title();
        org.jsoup.nodes.Element element44 = document36.prependChild((org.jsoup.nodes.Node) document42);
        org.jsoup.nodes.Element element45 = document24.appendChild((org.jsoup.nodes.Node) document36);
        org.jsoup.nodes.Element element47 = document36.createElement("#root");
        org.jsoup.nodes.Element element49 = element47.toggleClass("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean50 = element47.hasText();
        org.jsoup.nodes.Element element51 = document15.appendChild((org.jsoup.nodes.Node) element47);
        org.jsoup.nodes.Element element52 = element6.appendChild((org.jsoup.nodes.Node) document15);
        element52.setBaseUri("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node55 = element52.previousSibling();
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
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
        org.jsoup.nodes.Element element33 = element29.addClass("<#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root><#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node34 = element33.previousSibling();
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>#root</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.text("<#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!");
        org.jsoup.select.Elements elements6 = element3.getElementsByAttributeValueEnding("<#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element3.lastElementSibling();
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        java.lang.String str8 = document1.tagName();
        org.jsoup.nodes.Node node10 = document1.removeAttr(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int11 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        document15.title("hi!");
        org.jsoup.nodes.Element element18 = document13.prependChild((org.jsoup.nodes.Node) document15);
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document15.siblingNodes();
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("");
        document23.title("hi!");
        org.jsoup.nodes.Element element26 = document21.prependChild((org.jsoup.nodes.Node) document23);
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element29 = document21.prependChild((org.jsoup.nodes.Node) document28);
        org.jsoup.nodes.Node node31 = document21.removeAttr("hi!");
        org.jsoup.nodes.Document document33 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element35 = document33.html("hi!");
        org.jsoup.nodes.Element element37 = document33.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document39 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str40 = document39.title();
        org.jsoup.nodes.Element element41 = document33.prependChild((org.jsoup.nodes.Node) document39);
        org.jsoup.nodes.Element element42 = document21.appendChild((org.jsoup.nodes.Node) document33);
        org.jsoup.nodes.Element element44 = document33.createElement("#root");
        java.lang.String str45 = document33.className();
        org.jsoup.nodes.Element element47 = document33.appendText("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        document15.replaceWith((org.jsoup.nodes.Node) document33);
        org.jsoup.nodes.Element element50 = document33.prependText("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        boolean boolean51 = document1.equals((java.lang.Object) element50);
        org.jsoup.nodes.Element element53 = document1.appendElement("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element54 = document1.previousElementSibling();
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
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
        org.jsoup.select.Elements elements17 = element13.siblingElements();
        org.jsoup.nodes.Element element19 = element13.html("<#root>\n <html>\n  <head>\n  </head>\n  <body>\n    &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("");
        document23.title("hi!");
        org.jsoup.nodes.Element element26 = document21.prependChild((org.jsoup.nodes.Node) document23);
        org.jsoup.parser.Tag tag27 = document21.tag();
        org.jsoup.nodes.Document document29 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document31 = org.jsoup.nodes.Document.createShell("");
        document31.title("hi!");
        org.jsoup.nodes.Element element34 = document29.prependChild((org.jsoup.nodes.Node) document31);
        java.lang.String str35 = document29.val();
        java.util.Set<java.lang.String> strSet36 = document29.classNames();
        org.jsoup.nodes.Element element37 = document21.classNames(strSet36);
        java.util.Set<java.lang.String> strSet38 = document21.classNames();
        org.jsoup.nodes.Element element39 = element19.classNames(strSet38);
        org.jsoup.nodes.Document document41 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int42 = document41.elementSiblingIndex();
        org.jsoup.nodes.Element element44 = document41.append("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>");
        element19.replaceWith((org.jsoup.nodes.Node) document41);
        boolean boolean46 = element19.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element47 = element19.firstElementSibling();
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
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
        org.jsoup.nodes.Element element26 = document1.nextElementSibling();
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexLessThan((int) (byte) 0);
        org.jsoup.nodes.Element element13 = document1.createElement("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean15 = element13.hasClass("hi!");
        java.lang.String str16 = element13.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = element13.nextSibling();
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element10 = document1.empty();
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexLessThan(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element10.lastElementSibling();
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
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
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document27 = document26.normalise();
        boolean boolean29 = document26.hasClass("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        java.lang.String str30 = document26.val();
        java.lang.String str32 = document26.attr("<#root class=\" &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/#root&gt; &lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>#document");
        boolean boolean33 = element24.equals((java.lang.Object) document26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element34 = document26.firstElementSibling();
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Document document4 = document1.normalise();
        java.lang.String str6 = document4.absUrl("#root");
        org.jsoup.nodes.Element element8 = document4.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str9 = element8.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element8.firstElementSibling();
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
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
        boolean boolean23 = element21.hasAttr("");
        org.jsoup.select.Elements elements26 = element21.getElementsByAttributeValueStarting("hi! <#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>", "<head>\n</head>\n<body>\n</body>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element21.firstElementSibling();
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes6 = element5.attributes();
        org.jsoup.select.Elements elements8 = element5.getElementsByIndexEquals((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element5.nextElementSibling();
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = element6.html("");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element6.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.select.Elements elements17 = element16.children();
        boolean boolean19 = element16.hasClass("<#root> <#root> hi!");
        java.lang.String str20 = element16.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = element16.nextSibling();
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<#root class=\" &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/#root&gt; &lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = document1.lastElementSibling();
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Node node11 = document1.removeAttr("hi!");
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexGreaterThan((int) (byte) 1);
        org.jsoup.nodes.Element element14 = document1.head();
        org.jsoup.nodes.Element element15 = document1.head();
        org.jsoup.select.Elements elements18 = document1.getElementsByAttributeValue("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!<<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        java.lang.String str19 = document1.title();
        boolean boolean20 = document1.hasText();
        org.jsoup.nodes.Element element22 = document1.getElementById("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = document1.firstElementSibling();
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
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
        org.jsoup.nodes.Element element22 = element20.append("");
        org.jsoup.nodes.Element element24 = element22.html("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int25 = element22.siblingIndex();
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
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
        org.jsoup.nodes.Element element20 = document1.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root>\n<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element20.previousElementSibling();
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
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
        org.jsoup.nodes.Element element17 = element11.firstElementSibling();
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
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
        org.jsoup.select.Elements elements25 = document13.getAllElements();
        org.jsoup.nodes.Element element26 = document13.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element26.firstElementSibling();
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Document document4 = document1.normalise();
        org.jsoup.nodes.Element element5 = document4.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document4.previousElementSibling();
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.text("#document");
        java.lang.String str8 = document1.outerHtml();
        org.jsoup.nodes.Element element9 = document1.head();
        java.lang.String str10 = document1.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = document1.previousSibling();
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
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
        org.jsoup.nodes.Node node16 = document1.removeAttr(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = document1.nextSibling();
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes6 = element5.attributes();
        org.jsoup.select.Elements elements8 = element5.getElementsByIndexEquals((int) (byte) 0);
        org.jsoup.select.Elements elements9 = element5.getAllElements();
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueEnding("<#root>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<html>\n <head>\n  <title>hi! &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!</title>\n </head>\n <body>\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element5.previousElementSibling();
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Node node11 = document1.removeAttr("hi!");
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexGreaterThan((int) (byte) 1);
        org.jsoup.nodes.Element element14 = document1.head();
        org.jsoup.select.Elements elements17 = document1.getElementsByAttributeValueNot("#document", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int18 = document1.elementSiblingIndex();
        document1.title("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements21 = document1.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = document1.nextElementSibling();
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
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
        org.jsoup.nodes.Element element16 = document4.text("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str17 = document4.title();
        org.jsoup.select.Elements elements20 = document4.getElementsByAttributeValueNot("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document24 = org.jsoup.nodes.Document.createShell("");
        document24.title("hi!");
        org.jsoup.nodes.Element element27 = document22.prependChild((org.jsoup.nodes.Node) document24);
        org.jsoup.parser.Tag tag28 = document22.tag();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = document22.childNodes();
        org.jsoup.nodes.Document document30 = document22.normalise();
        org.jsoup.nodes.Node node32 = document22.childNode(0);
        boolean boolean33 = document4.equals((java.lang.Object) document22);
        org.jsoup.nodes.Document document35 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document37 = org.jsoup.nodes.Document.createShell("");
        document37.title("hi!");
        org.jsoup.nodes.Element element40 = document35.prependChild((org.jsoup.nodes.Node) document37);
        org.jsoup.nodes.Document document42 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element43 = document35.prependChild((org.jsoup.nodes.Node) document42);
        org.jsoup.select.Elements elements45 = document35.getElementsByIndexLessThan((int) (byte) 0);
        org.jsoup.nodes.Element element47 = document35.createElement("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements50 = document35.getElementsByAttributeValue("#root", "hi!");
        org.jsoup.nodes.Element element52 = document35.createElement("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String[] strArray54 = new java.lang.String[] { " <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        org.jsoup.nodes.Element element57 = document35.classNames((java.util.Set<java.lang.String>) strSet55);
        org.jsoup.nodes.Element element58 = document22.classNames((java.util.Set<java.lang.String>) strSet55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node59 = document22.previousSibling();
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Document document4 = document1.normalise();
        org.jsoup.nodes.Element element5 = document4.empty();
        org.jsoup.select.Elements elements7 = document4.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element9 = document4.createElement("\n<body>\n</body>");
        java.lang.String str10 = document4.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements11 = document4.siblingElements();
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
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
        java.lang.String str27 = document13.baseUri();
        org.jsoup.nodes.Element element29 = document13.createElement("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList30 = element29.siblingNodes();
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element8 = document1.text("#root");
        java.lang.Integer int9 = element8.elementSiblingIndex();
        org.jsoup.nodes.Node node11 = element8.removeAttr("<#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements12 = element8.siblingElements();
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
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
        org.jsoup.select.Elements elements23 = element17.getElementsByIndexGreaterThan((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element17.wrap("<#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!");
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        java.lang.String str8 = document1.tagName();
        org.jsoup.nodes.Node node10 = document1.removeAttr(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int11 = document1.elementSiblingIndex();
        java.lang.String str12 = document1.outerHtml();
        org.jsoup.nodes.Element element14 = document1.child((int) (byte) 1);
        org.jsoup.select.Elements elements16 = document1.getElementsByClass(" <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <title>hi!</title> </#root> <#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root><#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document1.firstElementSibling();
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
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
        java.util.List<org.jsoup.nodes.Node> nodeList23 = element17.siblingNodes();
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements3 = document1.getElementsByIndexLessThan((-1));
        java.lang.String str4 = document1.text();
        java.lang.String str5 = document1.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = document1.nextSibling();
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.val();
        org.jsoup.nodes.Element element4 = document1.append("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element8 = document6.html("hi!");
        org.jsoup.nodes.Element element10 = document6.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = document6.toggleClass("#root");
        java.util.Set<java.lang.String> strSet13 = element12.classNames();
        org.jsoup.nodes.Element element14 = element4.classNames(strSet13);
        boolean boolean16 = element14.hasAttr("hi! #root");
        java.lang.String str17 = element14.className();
        org.jsoup.nodes.Element element20 = element14.attr("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!<<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html><#root class=\" &lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList21 = element14.siblingNodes();
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document1.childNodes();
        org.jsoup.select.Elements elements10 = document1.getElementsByClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str11 = document1.title();
        org.jsoup.nodes.Element element13 = document1.append("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = document1.previousSibling();
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
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
        document1.setBaseUri("\n<hi!>\n</hi!>");
        java.util.Set<java.lang.String> strSet21 = document1.classNames();
        org.jsoup.nodes.Element element23 = document1.createElement("hi! <#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = element23.nextSibling();
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element11 = element9.appendElement("#document");
        org.jsoup.nodes.Element element13 = element9.prependText(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        document17.title("hi!");
        org.jsoup.nodes.Element element20 = document15.prependChild((org.jsoup.nodes.Node) document17);
        org.jsoup.parser.Tag tag21 = document15.tag();
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document25 = org.jsoup.nodes.Document.createShell("");
        document25.title("hi!");
        org.jsoup.nodes.Element element28 = document23.prependChild((org.jsoup.nodes.Node) document25);
        java.lang.String str29 = document23.val();
        java.util.Set<java.lang.String> strSet30 = document23.classNames();
        org.jsoup.nodes.Element element31 = document15.classNames(strSet30);
        org.jsoup.nodes.Document document33 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document35 = org.jsoup.nodes.Document.createShell("");
        document35.title("hi!");
        org.jsoup.nodes.Element element38 = document33.prependChild((org.jsoup.nodes.Node) document35);
        org.jsoup.nodes.Element element40 = element38.html("");
        java.lang.String[] strArray45 = new java.lang.String[] { "", "<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        org.jsoup.nodes.Element element48 = element38.classNames((java.util.Set<java.lang.String>) strSet46);
        boolean boolean49 = element31.equals((java.lang.Object) element48);
        org.jsoup.select.Elements elements51 = element48.getElementsByAttribute("<#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!");
        org.jsoup.nodes.Element element52 = element13.appendChild((org.jsoup.nodes.Node) element48);
        org.jsoup.nodes.Element element54 = element52.appendElement("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element55 = element52.previousElementSibling();
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexEquals((int) (byte) 100);
        org.jsoup.nodes.Document document9 = document1.normalise();
        org.jsoup.nodes.Attributes attributes10 = document1.attributes();
        org.jsoup.nodes.Element element12 = document1.append("<#root> <#root> hi!\n #document");
        org.jsoup.nodes.Element element14 = document1.prepend("<#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document1.wrap("&lt;#root&gt; \n<html> \n<head> \n</head> \n<body>   &lt;#root&gt; \n <html> \n  <head> \n   <title>hi!\n </title>\n  </head> \n  <body>    \n   <html> \n    <head> \n    </head> \n    <body>  \n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>");
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Element element5 = document1.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.appendElement("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = document1.val("hi!");
        java.lang.String str10 = document1.title();
        java.lang.String str11 = document1.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document1.text(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html> <#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
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
        java.lang.String str36 = document28.title();
        org.jsoup.nodes.Document document38 = org.jsoup.nodes.Document.createShell("");
        document38.title("hi!");
        org.jsoup.nodes.Element element42 = document38.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element44 = document38.removeClass("hi!");
        org.jsoup.nodes.Element element46 = element44.appendText("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element48 = element44.appendElement("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet49 = element44.classNames();
        org.jsoup.nodes.Element element50 = document28.classNames(strSet49);
        org.jsoup.nodes.Element element52 = document28.append("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root class=\"\">\n<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>");
        java.util.Set<java.lang.String> strSet53 = element52.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList54 = element52.siblingNodes();
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        boolean boolean5 = element3.hasAttr("");
        org.jsoup.nodes.Element element7 = element3.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element3.html("<#root class=\" &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/#root&gt; &lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>#document");
        org.jsoup.nodes.Element element10 = element3.empty();
        org.jsoup.nodes.Element element12 = element3.prepend("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = element12.attr("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>#root", "<head>\n</head>\n<body>\n</body>");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element12.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements17 = element12.siblingElements();
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag7 = document1.tag();
        java.lang.String str8 = document1.tagName();
        java.lang.String str9 = document1.val();
        org.jsoup.nodes.Element element11 = document1.text("<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n   &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        java.lang.Integer int12 = element11.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element11.nextElementSibling();
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Element element5 = document1.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str8 = document7.title();
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document7);
        java.lang.String str10 = document1.html();
        org.jsoup.nodes.Document document11 = document1.normalise();
        org.jsoup.nodes.Attributes attributes12 = document11.attributes();
        org.jsoup.nodes.Element element14 = document11.prependElement(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = document11.lastElementSibling();
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
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
        org.jsoup.nodes.Element element20 = element16.appendElement("<#root>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList21 = element16.siblingNodes();
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
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
        org.jsoup.nodes.Element element31 = document1.empty();
        java.lang.String str32 = document1.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element33 = document1.lastElementSibling();
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Element element5 = document1.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str8 = document7.title();
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Node node12 = element10.removeAttr("hi! #root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element10.wrap("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>#root");
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.html("hi!");
        org.jsoup.nodes.Element element5 = document1.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.appendElement("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = document1.val("hi!");
        org.jsoup.select.Elements elements11 = element9.select("#document");
        java.lang.String str13 = element9.attr("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.nodes.Node node15 = element9.removeAttr(" <#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str16 = element9.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element9.previousElementSibling();
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str7 = document1.val();
        document1.title("<#root class=\" &lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/#root&gt; &lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>#document");
        org.jsoup.nodes.Element element10 = document1.body();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.previousElementSibling();
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueContaining("#root", "<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str5 = document1.title();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.select.Elements elements7 = document1.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = document1.previousSibling();
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
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
        org.jsoup.nodes.Document document17 = document16.normalise();
        java.lang.String str19 = document16.attr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements20 = document16.siblingElements();
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
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
        org.jsoup.nodes.Element element38 = document21.prependText("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.nodes.Element element40 = document21.text("<#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root class=\" &lt;#root&gt;\n&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;hi!&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n&lt;/#root&gt;\n&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>");
        org.jsoup.nodes.Element element42 = document21.getElementById("\n<hi!>\n</hi!>");
        org.jsoup.nodes.Element element44 = document21.text("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! <#root> <html> <head> </head> <body> </body> </html> </#root><#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>hi!<#root> <html> <head> <title>hi!</title> </head> <body> </body> </html> </#root> <html> <head> </head> <body> </body> </html>");
        org.jsoup.nodes.Document document46 = org.jsoup.nodes.Document.createShell("");
        document46.title("hi!");
        org.jsoup.nodes.Element element50 = document46.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element52 = document46.removeClass("hi!");
        java.lang.String str53 = element52.id();
        document21.replaceWith((org.jsoup.nodes.Node) element52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node55 = document21.nextSibling();
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.title("hi!");
        org.jsoup.nodes.Element element5 = document1.toggleClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.parser.Tag tag6 = document1.tag();
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueEnding("&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;hi!&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root>\n<#root>\n <html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>\n</#root><#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>", "&lt;#root&gt; \n <html> \n  <head> \n   <title>hi!\n </title>\n  </head> \n  <body>    \n   <html> \n    <head> \n    </head> \n    <body>  \n    </body>\n   </html>\n  </body>\n </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document1.siblingNodes();
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
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
        boolean boolean21 = document1.hasClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root>\n<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>&lt;#root&gt; \n<html> \n<head> \n</head> \n<body>   &lt;#root&gt; \n <html> \n  <head> \n   <title>hi! </title>\n  </head> \n  <body>    \n   <html> \n    <head> \n    </head> \n    <body>  hi!\n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int22 = document1.siblingIndex();
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
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
        org.jsoup.nodes.Element element25 = document13.previousElementSibling();
        org.jsoup.nodes.Element element26 = element25.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element26.nextElementSibling();
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element11 = element9.addClass("");
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        document15.title("hi!");
        org.jsoup.nodes.Element element18 = document13.prependChild((org.jsoup.nodes.Node) document15);
        org.jsoup.select.Elements elements20 = document13.getElementsByClass("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet21 = document13.classNames();
        org.jsoup.nodes.Element element22 = element9.classNames(strSet21);
        org.jsoup.nodes.Document document24 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str25 = document24.title();
        org.jsoup.select.Elements elements28 = document24.getElementsByAttributeValueNot("#root", "#root");
        org.jsoup.nodes.Element element30 = document24.text("#document");
        org.jsoup.select.Elements elements32 = element30.getElementsByIndexEquals((int) (short) -1);
        boolean boolean33 = element22.equals((java.lang.Object) element30);
        org.jsoup.nodes.Element element35 = element30.getElementById("hi! #root hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node36 = element30.previousSibling();
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
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
        java.lang.String str23 = element17.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element17.wrap("&lt;#root&gt; \n<html> \n<head> \n <title>hi!\n </title>\n</head> \n<body>    \n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        document3.title("hi!");
        org.jsoup.nodes.Element element6 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document1.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements11 = document1.getElementsByIndexLessThan((int) (byte) 0);
        org.jsoup.nodes.Element element13 = document1.createElement("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root><#root>\n<html>\n <head>\n  <title>hi!</title>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = document1.val("\n<hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int16 = document1.siblingIndex();
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.nodes.Element element4 = document1.removeClass("<html>\n<head>\n <title>hi!</title>\n</head>\n<body>\n</body>\n</html>#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<html>\n<head>\n</head>\n<body>\n</body>\n</html><#root>\n<#root>\n <html>\n  <head>\n   <title>hi!</title>\n  </head>\n  <body>\n  </body>\n </html>\n</#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>");
    }
}

