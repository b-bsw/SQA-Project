package org.jsoup.parser;

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
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "hi!");
        java.util.Set<java.lang.String> strSet3 = document2.classNames();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element8 = document6.appendText("#root");
        org.jsoup.nodes.Element element10 = document6.prepend("#root");
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str14 = document13.tagName();
        document13.setBaseUri("");
        document13.setBaseUri("");
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str22 = document21.tagName();
        document21.setBaseUri("");
        document21.setBaseUri("");
        org.jsoup.nodes.Element element28 = document21.appendText("#root");
        org.jsoup.nodes.Element element29 = document13.appendChild((org.jsoup.nodes.Node) document21);
        java.lang.String str30 = element29.baseUri();
        org.jsoup.nodes.Element element31 = document6.appendChild((org.jsoup.nodes.Node) element29);
        org.jsoup.nodes.Element element32 = document2.appendChild((org.jsoup.nodes.Node) element31);
        org.jsoup.nodes.Element element34 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element36 = document2.toggleClass("\n<body>\n</body>");
        org.jsoup.nodes.Element element37 = element36.empty();
        org.jsoup.nodes.Attributes attributes38 = element37.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node39 = element37.nextSibling();
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str19 = document18.tagName();
        document18.setBaseUri("");
        document18.setBaseUri("");
        org.jsoup.nodes.Element element25 = document18.appendText("#root");
        org.jsoup.nodes.Element element26 = document10.appendChild((org.jsoup.nodes.Node) document18);
        boolean boolean27 = tag7.equals((java.lang.Object) element26);
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str30 = tag29.getName();
        org.jsoup.parser.Tag tag31 = tag29.getImplicitParent();
        boolean boolean32 = tag7.canContain(tag31);
        java.lang.String str33 = tag7.toString();
        java.lang.String str34 = tag7.getName();
        java.lang.String str35 = tag7.getName();
        org.jsoup.parser.Tag tag36 = tag7.getImplicitParent();
        org.jsoup.nodes.Document document39 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str40 = document39.tagName();
        document39.setBaseUri("");
        org.jsoup.nodes.Element element44 = document39.addClass("");
        org.jsoup.nodes.Element element46 = document39.toggleClass("");
        org.jsoup.nodes.Element element48 = document39.addClass("hi!");
        org.jsoup.parser.Tag tag49 = document39.tag();
        org.jsoup.nodes.Element element51 = document39.addClass("");
        org.jsoup.nodes.Element element53 = document39.prependElement("hi!");
        org.jsoup.parser.Tag tag54 = document39.tag();
        org.jsoup.parser.Tag tag55 = tag54.getImplicitParent();
        org.jsoup.parser.Tag tag56 = tag55.getImplicitParent();
        boolean boolean57 = tag55.isEmpty();
        boolean boolean58 = tag7.canContain(tag55);
        org.jsoup.nodes.Element element60 = new org.jsoup.nodes.Element(tag7, "hi! <#root> hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int61 = element60.siblingIndex();
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        java.util.Set<java.lang.String> strSet17 = element16.classNames();
        org.jsoup.nodes.Element element18 = element16.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList19 = element16.siblingNodes();
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str2 = tag1.getName();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node9 = document7.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document7.childNodes();
        org.jsoup.nodes.Attributes attributes11 = document7.attributes();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag3, "#root", attributes11);
        org.jsoup.select.Elements elements15 = element12.getElementsByAttributeValueStarting("#document", "hi! #document");
        java.lang.String str16 = element12.baseUri();
        org.jsoup.nodes.Element element18 = element12.append("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element12.lastElementSibling();
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        java.lang.Integer int5 = document2.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = document2.attr("hi!", "#document");
        boolean boolean10 = element8.hasClass("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = element8.val("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#roothi!<&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>\n</&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int13 = element12.siblingIndex();
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValue("hi! ", "#root");
        org.jsoup.nodes.Element element16 = element9.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element19 = element9.attr("hi! #document", "#root");
        org.jsoup.select.Elements elements20 = element9.children();
        org.jsoup.nodes.Element element22 = element9.val(" hi! #document");
        org.jsoup.nodes.Element element24 = element9.prependText(" hi! #document");
        org.jsoup.nodes.Element element26 = element9.prependText("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element9.lastElementSibling();
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str10 = document9.tagName();
        document9.setBaseUri("");
        document9.setBaseUri("");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str18 = document17.tagName();
        document17.setBaseUri("");
        document17.setBaseUri("");
        org.jsoup.nodes.Element element24 = document17.appendText("#root");
        org.jsoup.nodes.Element element25 = document9.appendChild((org.jsoup.nodes.Node) document17);
        java.lang.String str26 = element25.baseUri();
        org.jsoup.nodes.Element element27 = document2.appendChild((org.jsoup.nodes.Node) element25);
        org.jsoup.select.Elements elements30 = document2.getElementsByAttributeValueEnding("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element31 = document2.lastElementSibling();
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        java.lang.Integer int5 = document2.elementSiblingIndex();
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element9 = document2.appendText("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        boolean boolean10 = document2.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements11 = document2.siblingElements();
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        boolean boolean18 = document2.isBlock();
        org.jsoup.nodes.Element element20 = document2.addClass("#root");
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str24 = document23.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = document23.childNodes();
        boolean boolean27 = document23.hasAttr("#root");
        org.jsoup.parser.Tag tag28 = document23.tag();
        org.jsoup.nodes.Element element29 = element20.prependChild((org.jsoup.nodes.Node) document23);
        org.jsoup.nodes.Element element31 = element29.child(0);
        org.jsoup.select.Elements elements33 = element29.getElementsByIndexGreaterThan((int) (byte) 1);
        org.jsoup.nodes.Document document36 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str37 = document36.tagName();
        document36.setBaseUri("");
        document36.setBaseUri("");
        org.jsoup.nodes.Document document44 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str45 = document44.tagName();
        document44.setBaseUri("");
        document44.setBaseUri("");
        org.jsoup.nodes.Element element50 = document36.appendChild((org.jsoup.nodes.Node) document44);
        org.jsoup.nodes.Element element51 = document36.empty();
        org.jsoup.nodes.Node node53 = document36.removeAttr("#root");
        java.lang.String str54 = document36.outerHtml();
        org.jsoup.select.Elements elements56 = document36.getElementsByTag("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element57 = element29.appendChild((org.jsoup.nodes.Node) document36);
        java.lang.String str58 = element29.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements59 = element29.siblingElements();
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexLessThan((int) (byte) 100);
        org.jsoup.nodes.Element element6 = document2.appendText("hi!");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str10 = document9.tagName();
        document9.setBaseUri("");
        document9.setBaseUri("");
        java.lang.String str16 = document9.attr("#root");
        org.jsoup.nodes.Element element17 = element6.appendChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Element element19 = element17.removeClass("body");
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node24 = document22.removeAttr("hi!");
        org.jsoup.nodes.Element element26 = document22.addClass("");
        org.jsoup.select.Elements elements28 = document22.getElementsByTag("#root");
        document22.setBaseUri("body");
        org.jsoup.nodes.Element element31 = element17.appendChild((org.jsoup.nodes.Node) document22);
        org.jsoup.select.Elements elements32 = document22.siblingElements();
        org.jsoup.nodes.Element element33 = document22.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element34 = element33.lastElementSibling();
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        java.lang.String str17 = document2.baseUri();
        org.jsoup.parser.Tag tag18 = document2.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = document2.nextElementSibling();
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        document2.setBaseUri("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element element16 = document14.child(0);
        java.util.Set<java.lang.String> strSet17 = element16.classNames();
        org.jsoup.nodes.Element element18 = document2.classNames(strSet17);
        java.lang.String str19 = element18.val();
        java.lang.String str20 = element18.toString();
        org.jsoup.select.Elements elements22 = element18.getElementsByIndexEquals((int) ' ');
        org.jsoup.nodes.Document document25 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element27 = document25.appendText("#root");
        java.lang.String str28 = document25.data();
        org.jsoup.nodes.Element element29 = element18.prependChild((org.jsoup.nodes.Node) document25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node30 = element18.nextSibling();
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        java.lang.String str3 = document2.tagName();
        org.jsoup.nodes.Element element4 = document2.empty();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str8 = document7.tagName();
        document7.setBaseUri("");
        org.jsoup.nodes.Element element12 = document7.addClass("");
        org.jsoup.nodes.Element element14 = document7.toggleClass("");
        org.jsoup.nodes.Element element16 = document7.addClass("hi!");
        org.jsoup.parser.Tag tag17 = document7.tag();
        org.jsoup.nodes.Element element19 = document7.addClass("");
        org.jsoup.nodes.Element element21 = document7.prependElement("hi!");
        org.jsoup.parser.Tag tag22 = document7.tag();
        org.jsoup.select.Elements elements24 = document7.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean26 = document7.equals((java.lang.Object) (short) 1);
        org.jsoup.nodes.Node node28 = document7.removeAttr("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document");
        org.jsoup.select.Elements elements30 = document7.getElementsByIndexGreaterThan((int) '4');
        boolean boolean31 = document2.equals((java.lang.Object) document7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList32 = document2.siblingNodes();
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str2 = tag1.getName();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        java.lang.String str4 = tag1.toString();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#roothi!<&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>\n</&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element6.siblingNodes();
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        boolean boolean18 = document2.isBlock();
        org.jsoup.nodes.Element element20 = document2.addClass("#root");
        org.jsoup.select.Elements elements23 = element20.getElementsByAttributeValueNot("#root", "body");
        org.jsoup.nodes.Element element25 = element20.prependText("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        boolean boolean27 = element20.hasClass("<html>\n<head>\n</head>\n<body>\n &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   #document \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.select.Elements elements30 = element20.getElementsByAttributeValueStarting("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element31 = element20.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int32 = element31.siblingIndex();
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.nodes.Element element9 = document2.text("");
        org.jsoup.nodes.Attributes attributes10 = document2.attributes();
        org.jsoup.nodes.Element element13 = document2.attr("#document", "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.nodes.Element element15 = element13.html("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str16 = element13.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element13.nextElementSibling();
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Element element8 = element6.prependText("body");
        org.jsoup.parser.Tag tag9 = element8.tag();
        org.jsoup.nodes.Element element12 = element8.attr("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#root");
        org.jsoup.nodes.Element element15 = element12.attr("hi! hi!", "\n<hi!>\n</hi!>");
        java.lang.String str16 = element12.nodeName();
        java.lang.String str17 = element12.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element12.previousElementSibling();
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element10 = document2.toggleClass("hi!");
        org.jsoup.nodes.Element element12 = element10.toggleClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element12.lastElementSibling();
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.select.Elements elements8 = element7.parents();
        java.lang.String str10 = element7.absUrl("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element7.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = element7.toggleClass("hi! ");
        java.lang.String str17 = element15.absUrl("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element15.lastElementSibling();
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str10 = document9.tagName();
        document9.setBaseUri("");
        document9.setBaseUri("");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str18 = document17.tagName();
        document17.setBaseUri("");
        document17.setBaseUri("");
        org.jsoup.nodes.Element element24 = document17.appendText("#root");
        org.jsoup.nodes.Element element25 = document9.appendChild((org.jsoup.nodes.Node) document17);
        java.lang.String str26 = element25.baseUri();
        org.jsoup.nodes.Element element27 = document2.appendChild((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str31 = document30.tagName();
        document30.setBaseUri("");
        org.jsoup.nodes.Element element35 = document30.addClass("");
        org.jsoup.nodes.Element element37 = document30.toggleClass("");
        org.jsoup.nodes.Element element39 = element37.html("");
        org.jsoup.select.Elements elements42 = element37.getElementsByAttributeValue("hi! ", "#root");
        boolean boolean43 = document2.equals((java.lang.Object) elements42);
        java.lang.String str44 = document2.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int45 = document2.siblingIndex();
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValue("hi! ", "#root");
        org.jsoup.nodes.Element element16 = element9.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element19 = element9.attr("hi! #document", "#root");
        org.jsoup.select.Elements elements20 = element9.children();
        org.jsoup.nodes.Element element22 = element9.val(" hi! #document");
        org.jsoup.nodes.Element element24 = element9.prependText(" hi! #document");
        org.jsoup.nodes.Element element26 = element9.val("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element9.lastElementSibling();
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("body", "body");
        org.jsoup.nodes.Element element7 = document2.val("#document");
        org.jsoup.nodes.Element element9 = element7.toggleClass("");
        org.jsoup.nodes.Node node11 = element9.removeAttr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.jsoup.select.Elements elements12 = element9.parents();
        java.lang.String str13 = element9.baseUri();
        org.jsoup.nodes.Element element15 = element9.toggleClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = element15.nextSibling();
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValue("hi! ", "#root");
        org.jsoup.nodes.Element element16 = element9.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = element16.childNodes();
        org.jsoup.nodes.Element element19 = element16.appendText("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int20 = element16.siblingIndex();
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str19 = document18.tagName();
        document18.setBaseUri("");
        document18.setBaseUri("");
        org.jsoup.nodes.Element element25 = document18.appendText("#root");
        org.jsoup.nodes.Element element26 = document10.appendChild((org.jsoup.nodes.Node) document18);
        boolean boolean27 = tag7.equals((java.lang.Object) element26);
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str30 = tag29.getName();
        org.jsoup.parser.Tag tag31 = tag29.getImplicitParent();
        boolean boolean32 = tag7.canContain(tag31);
        java.lang.String str33 = tag7.toString();
        java.lang.String str34 = tag7.getName();
        org.jsoup.nodes.Document document37 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str38 = document37.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = document37.childNodes();
        boolean boolean41 = document37.hasAttr("#root");
        org.jsoup.parser.Tag tag42 = document37.tag();
        boolean boolean43 = tag7.isValidParent(tag42);
        org.jsoup.nodes.Element element45 = new org.jsoup.nodes.Element(tag7, "hi! ");
        boolean boolean47 = element45.hasAttr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.parser.Tag tag48 = element45.tag();
        org.jsoup.nodes.Node node50 = element45.removeAttr("body#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>\n</#root>");
        boolean boolean51 = element45.isBlock();
        org.jsoup.select.Elements elements53 = element45.getElementsByIndexEquals((int) (byte) 100);
        org.jsoup.nodes.Element element55 = element45.toggleClass("\n<body>\n</body>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element56 = element55.previousElementSibling();
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        boolean boolean12 = element9.isBlock();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "body", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        org.jsoup.nodes.Element element20 = element9.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str24 = document23.tagName();
        document23.setBaseUri("");
        document23.setBaseUri("");
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str32 = document31.tagName();
        document31.setBaseUri("");
        document31.setBaseUri("");
        org.jsoup.nodes.Element element37 = document23.appendChild((org.jsoup.nodes.Node) document31);
        org.jsoup.nodes.Element element38 = document23.empty();
        org.jsoup.nodes.Node node40 = document23.removeAttr("#root");
        org.jsoup.nodes.Element element42 = document23.addClass("hi!");
        org.jsoup.nodes.Document document45 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node47 = document45.removeAttr("hi!");
        org.jsoup.nodes.Element element49 = document45.addClass("");
        org.jsoup.nodes.Element element50 = document23.prependChild((org.jsoup.nodes.Node) element49);
        java.lang.String str51 = element50.nodeName();
        org.jsoup.nodes.Element element53 = element50.appendText("#document");
        org.jsoup.nodes.Element element54 = element9.prependChild((org.jsoup.nodes.Node) element50);
        java.lang.String str55 = element54.toString();
        org.jsoup.select.Elements elements56 = element54.getAllElements();
        org.jsoup.nodes.Element element58 = element54.html("hi! ");
        java.lang.String str59 = element54.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element60 = element54.nextElementSibling();
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        org.jsoup.nodes.Node node19 = document2.removeAttr("#root");
        org.jsoup.nodes.Element element21 = document2.addClass("hi!");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node26 = document24.removeAttr("hi!");
        org.jsoup.nodes.Element element28 = document24.addClass("");
        org.jsoup.nodes.Element element29 = document2.prependChild((org.jsoup.nodes.Node) element28);
        java.lang.String str30 = element29.nodeName();
        org.jsoup.select.Elements elements32 = element29.select("body");
        java.lang.String str33 = element29.nodeName();
        org.jsoup.nodes.Element element34 = element29.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element35 = element29.previousElementSibling();
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element17 = document10.appendText("#root");
        org.jsoup.nodes.Element element18 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.select.Elements elements19 = element18.parents();
        org.jsoup.nodes.Element element21 = element18.wrap("hi! hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element18.lastElementSibling();
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean4 = document2.hasAttr("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        java.lang.String str5 = document2.outerHtml();
        org.jsoup.select.Elements elements6 = document2.parents();
        org.jsoup.select.Elements elements7 = document2.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = document2.nextSibling();
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str2 = tag1.getName();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node9 = document7.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document7.childNodes();
        org.jsoup.nodes.Attributes attributes11 = document7.attributes();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag3, "#root", attributes11);
        java.lang.String str13 = tag3.getName();
        java.lang.String str14 = tag3.toString();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag3, "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element16.nextElementSibling();
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        java.lang.Integer int5 = document2.elementSiblingIndex();
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element9 = document2.appendText("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element9.prependText("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = element11.previousSibling();
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        org.jsoup.select.Elements elements9 = document2.getElementsByIndexLessThan((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements10 = document2.siblingElements();
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Element element9 = document2.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = document2.previousSibling();
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        boolean boolean12 = element9.isBlock();
        org.jsoup.nodes.Attributes attributes13 = element9.attributes();
        org.jsoup.select.Elements elements16 = element9.getElementsByAttributeValueEnding("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi! ");
        org.jsoup.nodes.Element element18 = element9.prependElement("hi! #document");
        org.jsoup.nodes.Element element20 = element9.addClass("");
        java.lang.String str21 = element20.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int22 = element20.siblingIndex();
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element12 = element9.attr("hi! #document", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String[] strArray15 = new java.lang.String[] { "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element12.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.parser.Tag tag19 = element18.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = element18.previousSibling();
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element12 = document2.empty();
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str17 = document16.tagName();
        document16.setBaseUri("");
        org.jsoup.nodes.Element element21 = document16.addClass("");
        org.jsoup.select.Elements elements22 = element21.parents();
        org.jsoup.select.Elements elements23 = element21.getAllElements();
        org.jsoup.nodes.Element element24 = element12.prependChild((org.jsoup.nodes.Node) element21);
        org.jsoup.select.Elements elements25 = element24.getAllElements();
        org.jsoup.nodes.Element element27 = element24.addClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element24.lastElementSibling();
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.nodes.Element element9 = document2.text("");
        org.jsoup.nodes.Element element11 = element9.prepend("");
        java.lang.String str13 = element11.attr("hi!");
        java.lang.String str14 = element11.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element11.previousElementSibling();
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.select.Elements elements8 = element7.parents();
        org.jsoup.select.Elements elements9 = element7.getAllElements();
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str13 = document12.tagName();
        document12.setBaseUri("");
        org.jsoup.nodes.Element element17 = document12.addClass("");
        org.jsoup.nodes.Element element19 = document12.toggleClass("");
        org.jsoup.nodes.Element element21 = element19.html("");
        boolean boolean22 = element19.isBlock();
        java.lang.String[] strArray27 = new java.lang.String[] { "", "body", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        org.jsoup.nodes.Element element30 = element19.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Element element31 = element7.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Element element33 = element31.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements36 = element31.getElementsByAttributeValueStarting("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean38 = element31.hasAttr("<#root>\n<html>\n <head>\n </head>\n <body>\n  body \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList39 = element31.siblingNodes();
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.nodes.Element element9 = document2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document2.childNodes();
        org.jsoup.select.Elements elements12 = document2.getElementsByTag("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#roothi!<&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>\n</&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document2.previousElementSibling();
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        org.jsoup.nodes.Node node19 = document2.removeAttr("#root");
        java.lang.String str20 = document2.outerHtml();
        org.jsoup.select.Elements elements22 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = document2.wrap("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! #document");
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        org.jsoup.nodes.Node node19 = document2.removeAttr("#root");
        org.jsoup.nodes.Element element21 = document2.addClass("hi!");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node26 = document24.removeAttr("hi!");
        org.jsoup.nodes.Element element28 = document24.addClass("");
        org.jsoup.nodes.Element element29 = document2.prependChild((org.jsoup.nodes.Node) element28);
        java.lang.String str30 = element29.nodeName();
        org.jsoup.select.Elements elements32 = element29.select("body");
        org.jsoup.nodes.Element element34 = element29.child(0);
        org.jsoup.nodes.Element element36 = element29.appendText("\n<hi!>\n</hi!>");
        org.jsoup.nodes.Element element38 = element29.val("<html>\n <head>\n </head>\n <body>\n  body \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node39 = element29.previousSibling();
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str2 = tag1.getName();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        boolean boolean4 = tag1.isEmpty();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node10 = document8.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes11 = node10.attributes();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag1, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>", attributes11);
        org.jsoup.select.Elements elements15 = element12.getElementsByAttributeValueEnding("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = element12.previousSibling();
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "body");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int3 = document2.siblingIndex();
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.nextElementSibling();
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element9 = document2.appendText("hi! ");
        org.jsoup.nodes.Element element11 = element9.removeClass("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.select.Elements elements13 = element9.select("body");
        org.jsoup.nodes.Element element15 = element9.prependText("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int16 = element15.siblingIndex();
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("body", "body");
        org.jsoup.nodes.Element element7 = document2.val("#document");
        org.jsoup.nodes.Element element9 = element7.toggleClass("");
        org.jsoup.nodes.Node node11 = element9.removeAttr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element16 = document14.appendText("#root");
        org.jsoup.nodes.Element element18 = document14.prepend("#root");
        org.jsoup.nodes.Element element20 = element18.prependText("body");
        org.jsoup.parser.Tag tag21 = element20.tag();
        element20.setBaseUri(" hi! #document");
        org.jsoup.nodes.Element element25 = element20.appendElement("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Element element26 = element9.appendChild((org.jsoup.nodes.Node) element20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element26.lastElementSibling();
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str8 = document2.html();
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexLessThan((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document2.previousElementSibling();
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element17 = document10.appendText("#root");
        org.jsoup.nodes.Element element18 = document2.appendChild((org.jsoup.nodes.Node) document10);
        java.lang.String str19 = document10.className();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str23 = document22.tagName();
        document22.setBaseUri("");
        document22.setBaseUri("");
        org.jsoup.nodes.Element element29 = document22.appendText("#root");
        org.jsoup.nodes.Element element31 = document22.wrap("#root");
        document10.replaceWith((org.jsoup.nodes.Node) document22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element33 = document10.firstElementSibling();
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        org.jsoup.select.Elements elements10 = document2.parents();
        boolean boolean12 = document2.hasAttr("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.select.Elements elements14 = document2.select("#document");
        org.jsoup.nodes.Element element16 = document2.prependText(" body hi!");
        java.lang.Integer int17 = element16.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element16.lastElementSibling();
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements3 = document2.siblingElements();
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        java.lang.String str12 = document2.outerHtml();
        org.jsoup.nodes.Element element14 = document2.appendElement("hi!");
        java.lang.String str15 = document2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = document2.nextSibling();
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element17 = document10.appendText("#root");
        org.jsoup.nodes.Element element18 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.select.Elements elements19 = element18.parents();
        org.jsoup.select.Elements elements21 = element18.getElementsByAttribute("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements24 = element18.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n body\n</body>\n</html>#root", "body#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>\n</#root>");
        org.jsoup.select.Elements elements25 = element18.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = element18.nextElementSibling();
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("\n<body>\n</body>", "\n<hi!>\n</hi!>");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str6 = document5.tagName();
        document5.setBaseUri("");
        document5.setBaseUri("");
        org.jsoup.nodes.Element element12 = document5.appendText("#root");
        org.jsoup.select.Elements elements13 = element12.getAllElements();
        org.jsoup.select.Elements elements15 = element12.select("#document");
        boolean boolean16 = document2.equals((java.lang.Object) element12);
        org.jsoup.nodes.Element element17 = element12.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element12.siblingNodes();
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        java.lang.String str8 = document2.data();
        java.lang.Integer int9 = document2.elementSiblingIndex();
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("#root", "hi!");
        java.util.Set<java.lang.String> strSet13 = document12.classNames();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element18 = document16.appendText("#root");
        org.jsoup.nodes.Element element20 = document16.prepend("#root");
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str24 = document23.tagName();
        document23.setBaseUri("");
        document23.setBaseUri("");
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str32 = document31.tagName();
        document31.setBaseUri("");
        document31.setBaseUri("");
        org.jsoup.nodes.Element element38 = document31.appendText("#root");
        org.jsoup.nodes.Element element39 = document23.appendChild((org.jsoup.nodes.Node) document31);
        java.lang.String str40 = element39.baseUri();
        org.jsoup.nodes.Element element41 = document16.appendChild((org.jsoup.nodes.Node) element39);
        org.jsoup.nodes.Element element42 = document12.appendChild((org.jsoup.nodes.Node) element41);
        org.jsoup.nodes.Element element44 = document12.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        boolean boolean45 = document2.equals((java.lang.Object) element44);
        org.jsoup.select.Elements elements48 = element44.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!", "<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    hi!  \n  </body>\n </html>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int49 = element44.siblingIndex();
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str2 = tag1.getName();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node9 = document7.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document7.childNodes();
        org.jsoup.nodes.Attributes attributes11 = document7.attributes();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag3, "#root", attributes11);
        java.lang.String str13 = tag3.getName();
        java.lang.String str14 = tag3.toString();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag3, "");
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str21 = document20.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = document20.childNodes();
        boolean boolean24 = document20.hasAttr("#root");
        document20.setBaseUri("#root");
        org.jsoup.select.Elements elements28 = document20.getElementsByClass("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes29 = document20.attributes();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element(tag3, "<html>\n<head>\n</head>\n<body>\n body\n</body>\n</html>#root", attributes29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node31 = element30.nextSibling();
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        boolean boolean18 = document2.isBlock();
        org.jsoup.nodes.Element element20 = document2.addClass("#root");
        org.jsoup.select.Elements elements23 = element20.getElementsByAttributeValueNot("#root", "body");
        org.jsoup.nodes.Element element25 = element20.removeClass("body");
        org.jsoup.select.Elements elements27 = element25.getElementsByIndexGreaterThan(0);
        java.lang.String str29 = element25.attr("hi! hi! #root\n<html>\n<head>\n</head>\n<body>\n hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = element25.previousElementSibling();
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        org.jsoup.nodes.Node node6 = document2.childNode(0);
        boolean boolean8 = document2.hasClass("#root");
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str12 = document11.tagName();
        document11.setBaseUri("");
        document11.setBaseUri("");
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str20 = document19.tagName();
        document19.setBaseUri("");
        document19.setBaseUri("");
        org.jsoup.nodes.Element element26 = document19.appendText("#root");
        org.jsoup.nodes.Element element27 = document11.appendChild((org.jsoup.nodes.Node) document19);
        org.jsoup.select.Elements elements28 = element27.parents();
        boolean boolean29 = document2.equals((java.lang.Object) element27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = document2.firstElementSibling();
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        boolean boolean12 = element9.isBlock();
        org.jsoup.nodes.Attributes attributes13 = element9.attributes();
        org.jsoup.nodes.Element element15 = element9.append("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.nodes.Element element17 = element15.prepend("#root");
        org.jsoup.nodes.Element element19 = element17.appendElement("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! #document");
        org.jsoup.nodes.Element element21 = element17.text("<html>\n<head>\n</head>\n<body>\n body\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int22 = element17.siblingIndex();
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element9 = element7.appendText("hi! ");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str13 = document12.tagName();
        document12.setBaseUri("");
        org.jsoup.select.Elements elements17 = document12.getElementsByIndexEquals((int) (byte) 1);
        org.jsoup.select.Elements elements19 = document12.getElementsByIndexLessThan(10);
        org.jsoup.nodes.Element element21 = document12.appendElement("<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
        boolean boolean22 = element7.equals((java.lang.Object) element21);
        org.jsoup.nodes.Element element23 = element21.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element23.wrap("<html>\n<head>\n</head>\n<body> \n</body>\n</html><#root value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\" hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str10 = document9.tagName();
        document9.setBaseUri("");
        document9.setBaseUri("");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str18 = document17.tagName();
        document17.setBaseUri("");
        document17.setBaseUri("");
        org.jsoup.nodes.Element element24 = document17.appendText("#root");
        org.jsoup.nodes.Element element25 = document9.appendChild((org.jsoup.nodes.Node) document17);
        java.lang.String str26 = element25.baseUri();
        org.jsoup.nodes.Element element27 = document2.appendChild((org.jsoup.nodes.Node) element25);
        org.jsoup.select.Elements elements30 = element27.getElementsByAttributeValueNot("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document", "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        java.lang.String str31 = element27.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element32 = element27.previousElementSibling();
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.html("hi! ");
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#document");
        boolean boolean15 = element10.hasClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements18 = element10.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n body\n</body>\n</html>", " hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = element10.nextSibling();
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        java.lang.String str9 = document2.attr("#root");
        org.jsoup.nodes.Element element11 = document2.text("");
        java.lang.String str12 = document2.nodeName();
        org.jsoup.select.Elements elements14 = document2.getElementsByIndexEquals((int) (short) 0);
        org.jsoup.select.Elements elements16 = document2.getElementsByIndexEquals(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = document2.previousSibling();
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node3 = document2.previousSibling();
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.select.Elements elements8 = element7.parents();
        org.jsoup.select.Elements elements9 = element7.getAllElements();
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str13 = document12.tagName();
        document12.setBaseUri("");
        org.jsoup.nodes.Element element17 = document12.addClass("");
        org.jsoup.nodes.Element element19 = document12.toggleClass("");
        org.jsoup.nodes.Element element21 = element19.html("");
        boolean boolean22 = element19.isBlock();
        java.lang.String[] strArray27 = new java.lang.String[] { "", "body", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        org.jsoup.nodes.Element element30 = element19.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Element element31 = element7.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Element element33 = element31.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements36 = element31.getElementsByAttributeValueStarting("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean38 = element31.hasAttr("<#root>\n<html>\n <head>\n </head>\n <body>\n  body \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        boolean boolean40 = element31.hasClass("<html> <head> </head> <body> hi! </body> </html>#root<#root> <html> <head> </head> <body> hi! </body> </html> </#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node41 = element31.nextSibling();
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        document2.setBaseUri("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element element16 = document14.child(0);
        java.util.Set<java.lang.String> strSet17 = element16.classNames();
        org.jsoup.nodes.Element element18 = document2.classNames(strSet17);
        org.jsoup.nodes.Element element21 = document2.attr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi!");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element26 = document24.appendText("#root");
        org.jsoup.nodes.Element element28 = document24.prepend("#root");
        org.jsoup.nodes.Element element30 = element28.prependText("body");
        org.jsoup.parser.Tag tag31 = element30.tag();
        element30.setBaseUri(" hi! #document");
        boolean boolean34 = document2.equals((java.lang.Object) element30);
        org.jsoup.nodes.Element element36 = element30.prepend("hi! hi!");
        org.jsoup.nodes.Document document39 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str40 = document39.tagName();
        document39.setBaseUri("");
        org.jsoup.nodes.Element element44 = document39.addClass("");
        org.jsoup.nodes.Element element45 = element36.prependChild((org.jsoup.nodes.Node) element44);
        org.jsoup.nodes.Attributes attributes46 = element45.attributes();
        org.jsoup.nodes.Element element48 = element45.append("<#root class=\" hi!\"> <#root class=\"\"> hi! #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList49 = element45.siblingNodes();
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        java.lang.String str3 = document2.baseUri();
        org.jsoup.nodes.Element element5 = document2.removeClass("body");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document2.lastElementSibling();
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.parser.Tag tag12 = document2.tag();
        org.jsoup.nodes.Element element14 = document2.addClass("");
        org.jsoup.nodes.Element element16 = document2.prependElement("hi!");
        org.jsoup.parser.Tag tag17 = document2.tag();
        java.lang.String str18 = tag17.getName();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node24 = document22.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = document22.childNodes();
        org.jsoup.nodes.Attributes attributes26 = document22.attributes();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag17, "hi!", attributes26);
        org.jsoup.select.Elements elements29 = element27.getElementsByTag("hi!");
        java.lang.String str30 = element27.val();
        java.lang.String str31 = element27.nodeName();
        org.jsoup.select.Elements elements34 = element27.getElementsByAttributeValueContaining("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>body", "html");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int35 = element27.siblingIndex();
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        java.lang.String str9 = document2.attr("#root");
        java.lang.String str10 = document2.text();
        boolean boolean11 = document2.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = document2.siblingNodes();
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str2 = tag1.getName();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node9 = document7.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document7.childNodes();
        org.jsoup.nodes.Attributes attributes11 = document7.attributes();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag3, "#root", attributes11);
        java.lang.String str13 = tag3.getName();
        java.lang.String str14 = tag3.toString();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag3, "");
        java.lang.String str17 = element16.outerHtml();
        org.jsoup.nodes.Element element19 = element16.val("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList20 = element16.siblingNodes();
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element17 = document10.appendText("#root");
        org.jsoup.nodes.Element element18 = document2.appendChild((org.jsoup.nodes.Node) document10);
        document2.setBaseUri("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = document2.firstElementSibling();
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        org.jsoup.nodes.Node node19 = document2.removeAttr("#root");
        org.jsoup.nodes.Element element21 = document2.html("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements22 = element21.siblingElements();
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        java.lang.String str8 = document2.attr("#root");
        java.lang.String str10 = document2.absUrl("hi! ");
        org.jsoup.nodes.Element element12 = document2.val("hi! #document");
        java.lang.String str13 = document2.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = document2.lastElementSibling();
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.html("hi! ");
        org.jsoup.nodes.Element element12 = element10.addClass("#root");
        org.jsoup.select.Elements elements14 = element10.getElementsByTag("#root");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str18 = document17.tagName();
        document17.setBaseUri("");
        document17.setBaseUri("");
        org.jsoup.nodes.Document document25 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str26 = document25.tagName();
        document25.setBaseUri("");
        document25.setBaseUri("");
        org.jsoup.nodes.Element element31 = document17.appendChild((org.jsoup.nodes.Node) document25);
        org.jsoup.select.Elements elements33 = document17.getElementsByIndexGreaterThan((int) ' ');
        org.jsoup.nodes.Document document36 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str37 = document36.tagName();
        document36.setBaseUri("");
        org.jsoup.nodes.Element element41 = document36.addClass("");
        org.jsoup.nodes.Element element43 = document36.toggleClass("");
        org.jsoup.nodes.Element element46 = element43.attr("hi! #document", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String[] strArray49 = new java.lang.String[] { "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        org.jsoup.nodes.Element element52 = element46.classNames((java.util.Set<java.lang.String>) strSet50);
        org.jsoup.nodes.Element element53 = document17.classNames((java.util.Set<java.lang.String>) strSet50);
        org.jsoup.nodes.Element element54 = element10.appendChild((org.jsoup.nodes.Node) element53);
        java.lang.String str56 = element54.absUrl("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    hi!  \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.nodes.Element element58 = element54.val("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int59 = element58.siblingIndex();
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        org.jsoup.select.Elements elements10 = element9.getAllElements();
        org.jsoup.select.Elements elements12 = element9.select("#document");
        org.jsoup.nodes.Element element14 = element9.prepend("hi! <#root> hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements15 = element14.siblingElements();
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str2 = tag1.getName();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node9 = document7.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document7.childNodes();
        org.jsoup.nodes.Attributes attributes11 = document7.attributes();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag3, "#root", attributes11);
        org.jsoup.nodes.Element element14 = element12.prependText("#document");
        org.jsoup.nodes.Element element16 = element12.prependText("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList17 = element12.siblingNodes();
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        boolean boolean18 = document2.isBlock();
        org.jsoup.nodes.Element element20 = document2.addClass("#root");
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str24 = document23.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = document23.childNodes();
        boolean boolean27 = document23.hasAttr("#root");
        org.jsoup.parser.Tag tag28 = document23.tag();
        org.jsoup.nodes.Element element29 = element20.prependChild((org.jsoup.nodes.Node) document23);
        org.jsoup.nodes.Element element31 = element20.html("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element33 = element31.html("");
        element33.setBaseUri("\n<#document>\n</#document>");
        java.lang.String str36 = element33.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element37 = element33.nextElementSibling();
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexLessThan((int) (byte) 100);
        org.jsoup.nodes.Element element6 = document2.appendText("hi!");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str10 = document9.tagName();
        document9.setBaseUri("");
        document9.setBaseUri("");
        java.lang.String str16 = document9.attr("#root");
        org.jsoup.nodes.Element element17 = element6.appendChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Element element19 = element17.removeClass("body");
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node24 = document22.removeAttr("hi!");
        org.jsoup.nodes.Element element26 = document22.addClass("");
        org.jsoup.select.Elements elements28 = document22.getElementsByTag("#root");
        document22.setBaseUri("body");
        org.jsoup.nodes.Element element31 = element17.appendChild((org.jsoup.nodes.Node) document22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element32 = element31.previousElementSibling();
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str19 = document18.tagName();
        document18.setBaseUri("");
        document18.setBaseUri("");
        org.jsoup.nodes.Element element25 = document18.appendText("#root");
        org.jsoup.nodes.Element element26 = document10.appendChild((org.jsoup.nodes.Node) document18);
        boolean boolean27 = tag7.equals((java.lang.Object) element26);
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str30 = tag29.getName();
        org.jsoup.parser.Tag tag31 = tag29.getImplicitParent();
        boolean boolean32 = tag7.canContain(tag31);
        org.jsoup.nodes.Document document35 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str36 = document35.tagName();
        document35.setBaseUri("");
        org.jsoup.nodes.Element element40 = document35.addClass("");
        boolean boolean41 = tag7.equals((java.lang.Object) "");
        java.lang.String str42 = tag7.getName();
        java.lang.String str43 = tag7.getName();
        org.jsoup.nodes.Document document46 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str47 = document46.tagName();
        document46.setBaseUri("");
        document46.setBaseUri("");
        org.jsoup.nodes.Element element53 = document46.appendText("#root");
        document46.setBaseUri("");
        org.jsoup.nodes.Element element56 = document46.empty();
        org.jsoup.nodes.Element element58 = document46.removeClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Node node60 = document46.removeAttr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        boolean boolean61 = tag7.equals((java.lang.Object) node60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node62 = node60.nextSibling();
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        org.jsoup.nodes.Node node6 = document2.childNode(0);
        org.jsoup.nodes.Element element8 = document2.val("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = element8.toggleClass("hi! #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element8.lastElementSibling();
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.nodes.Element element4 = document2.appendText("body#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>\n</#root>");
        org.jsoup.select.Elements elements7 = element4.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;", "hi! #root");
        java.lang.String str8 = element4.data();
        boolean boolean10 = element4.hasAttr("<html>\n<head>\n</head>\n<body>\n body \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = element4.nextSibling();
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        java.lang.String str18 = document2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = document2.previousElementSibling();
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>", "<#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements3 = document2.siblingElements();
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi! #document", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node3 = document2.previousSibling();
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str2 = tag1.getName();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node9 = document7.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document7.childNodes();
        org.jsoup.nodes.Attributes attributes11 = document7.attributes();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag3, "#root", attributes11);
        java.lang.String str13 = tag3.getName();
        org.jsoup.parser.Tag tag14 = tag3.getImplicitParent();
        org.jsoup.parser.Tag tag17 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str18 = tag17.getName();
        org.jsoup.parser.Tag tag19 = tag17.getImplicitParent();
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node25 = document23.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = document23.childNodes();
        org.jsoup.nodes.Attributes attributes27 = document23.attributes();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag19, "#root", attributes27);
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag14, " hi! #document", attributes27);
        boolean boolean31 = element29.hasClass("hi! <#root> hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element32 = element29.firstElementSibling();
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Element element8 = element6.prependText("body");
        org.jsoup.parser.Tag tag9 = element8.tag();
        org.jsoup.nodes.Element element12 = element8.attr("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#root");
        org.jsoup.nodes.Element element15 = element12.attr("hi! hi!", "\n<hi!>\n</hi!>");
        java.lang.String str16 = element12.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element12.lastElementSibling();
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        org.jsoup.select.Elements elements10 = document2.getElementsByAttributeValue("hi!", "#document");
        java.lang.String str11 = document2.outerHtml();
        org.jsoup.nodes.Element element13 = document2.append("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! #document");
        org.jsoup.select.Elements elements16 = element13.getElementsByAttributeValueContaining("<hi! #document>\n</hi! #document>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.jsoup.select.Elements elements18 = element13.getElementsByIndexLessThan((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = element13.previousSibling();
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element9 = document2.appendText("hi! ");
        java.lang.String str10 = element9.html();
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node15 = document13.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = document13.childNodes();
        org.jsoup.nodes.Attributes attributes17 = document13.attributes();
        java.lang.String str19 = document13.attr("#root");
        org.jsoup.select.Elements elements22 = document13.getElementsByAttributeValueEnding("#root", "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.nodes.Element element23 = element9.appendChild((org.jsoup.nodes.Node) document13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = element23.previousSibling();
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<#root>\n<html>\n <head>\n </head>\n <body>\n  body \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root><#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements3 = document2.siblingElements();
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean4 = document2.hasAttr("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str8 = document7.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document7.childNodes();
        boolean boolean11 = document7.hasAttr("#root");
        org.jsoup.parser.Tag tag12 = document7.tag();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag12, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        boolean boolean15 = document2.equals((java.lang.Object) tag12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList16 = document2.siblingNodes();
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Element element8 = element6.prependText("body");
        org.jsoup.select.Elements elements10 = element6.getElementsByIndexGreaterThan((int) (byte) 0);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str14 = document13.tagName();
        document13.setBaseUri("");
        org.jsoup.nodes.Element element18 = document13.addClass("");
        org.jsoup.nodes.Element element20 = document13.toggleClass("");
        org.jsoup.nodes.Element element22 = document13.addClass("hi!");
        org.jsoup.parser.Tag tag23 = document13.tag();
        org.jsoup.nodes.Element element25 = document13.addClass("");
        org.jsoup.nodes.Element element27 = document13.prependElement("hi!");
        org.jsoup.parser.Tag tag28 = document13.tag();
        boolean boolean29 = tag28.canContainBlock();
        boolean boolean30 = tag28.preserveWhitespace();
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element(tag28, "\n<#document>\n</#document>");
        boolean boolean33 = element6.equals((java.lang.Object) element32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element35 = element6.wrap("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>");
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str19 = document18.tagName();
        document18.setBaseUri("");
        document18.setBaseUri("");
        org.jsoup.nodes.Element element25 = document18.appendText("#root");
        org.jsoup.nodes.Element element26 = document10.appendChild((org.jsoup.nodes.Node) document18);
        boolean boolean27 = tag7.equals((java.lang.Object) element26);
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str30 = tag29.getName();
        org.jsoup.parser.Tag tag31 = tag29.getImplicitParent();
        boolean boolean32 = tag7.canContain(tag31);
        org.jsoup.nodes.Document document35 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str36 = document35.tagName();
        document35.setBaseUri("");
        org.jsoup.nodes.Element element40 = document35.addClass("");
        boolean boolean41 = tag7.equals((java.lang.Object) "");
        java.lang.String str42 = tag7.getName();
        org.jsoup.nodes.Document document45 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str46 = document45.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList47 = document45.childNodes();
        boolean boolean49 = document45.hasAttr("#root");
        org.jsoup.parser.Tag tag50 = document45.tag();
        org.jsoup.nodes.Document document53 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str54 = document53.tagName();
        document53.setBaseUri("");
        document53.setBaseUri("");
        org.jsoup.nodes.Document document61 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str62 = document61.tagName();
        document61.setBaseUri("");
        document61.setBaseUri("");
        org.jsoup.nodes.Element element68 = document61.appendText("#root");
        org.jsoup.nodes.Element element69 = document53.appendChild((org.jsoup.nodes.Node) document61);
        boolean boolean70 = tag50.equals((java.lang.Object) element69);
        boolean boolean71 = tag7.isValidParent(tag50);
        boolean boolean72 = tag7.canContainBlock();
        boolean boolean73 = tag7.isBlock();
        org.jsoup.parser.Tag tag74 = tag7.getImplicitParent();
        boolean boolean75 = tag7.preserveWhitespace();
        org.jsoup.nodes.Element element77 = new org.jsoup.nodes.Element(tag7, "hi! <#root> hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element79 = element77.wrap("<html>\n<head>\n</head>\n<body>\n &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   #document \n  </body>\n </html>\n</body>\n</html>");
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        boolean boolean12 = element9.isBlock();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "body", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        org.jsoup.nodes.Element element20 = element9.classNames((java.util.Set<java.lang.String>) strSet18);
        java.lang.String str21 = element9.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int22 = element9.siblingIndex();
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        java.lang.String str17 = document2.baseUri();
        org.jsoup.parser.Tag tag18 = document2.tag();
        boolean boolean19 = tag18.isInline();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag18, "\n<&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>\n</&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element21.firstElementSibling();
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        org.jsoup.nodes.Node node19 = document2.removeAttr("#root");
        java.lang.String str20 = document2.nodeName();
        java.lang.String str21 = document2.outerHtml();
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node26 = document24.removeAttr("hi!");
        boolean boolean28 = document24.hasClass("#document");
        java.util.Set<java.lang.String> strSet29 = document24.classNames();
        org.jsoup.nodes.Element element30 = document2.classNames(strSet29);
        org.jsoup.parser.Tag tag32 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str33 = tag32.getName();
        boolean boolean34 = tag32.isData();
        java.lang.String str35 = tag32.toString();
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element(tag32, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        boolean boolean38 = tag32.isEmpty();
        org.jsoup.parser.Tag tag39 = tag32.getImplicitParent();
        boolean boolean40 = document2.equals((java.lang.Object) tag39);
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element(tag39, "<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
        boolean boolean43 = element42.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element44 = element42.firstElementSibling();
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        document2.setBaseUri("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element element16 = document14.child(0);
        java.util.Set<java.lang.String> strSet17 = element16.classNames();
        org.jsoup.nodes.Element element18 = document2.classNames(strSet17);
        org.jsoup.nodes.Element element21 = document2.attr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi!");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element26 = document24.appendText("#root");
        org.jsoup.nodes.Element element28 = document24.prepend("#root");
        org.jsoup.nodes.Element element30 = element28.prependText("body");
        org.jsoup.parser.Tag tag31 = element30.tag();
        element30.setBaseUri(" hi! #document");
        boolean boolean34 = document2.equals((java.lang.Object) element30);
        org.jsoup.nodes.Element element36 = element30.prepend("hi! hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node37 = element36.previousSibling();
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        java.lang.String str9 = document2.attr("#root");
        org.jsoup.nodes.Element element11 = document2.text("");
        boolean boolean12 = document2.isBlock();
        org.jsoup.nodes.Element element14 = document2.text("hi! ");
        org.jsoup.select.Elements elements17 = element14.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   #document \n  </body>\n </html>\n</body>\n</html>", "#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements18 = element14.siblingElements();
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        boolean boolean12 = element9.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element9.lastElementSibling();
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Element element8 = element6.prependText("body");
        org.jsoup.parser.Tag tag9 = element8.tag();
        org.jsoup.nodes.Element element10 = element8.empty();
        java.lang.Integer int11 = element8.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element8.nextElementSibling();
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element17 = document10.appendText("#root");
        org.jsoup.nodes.Element element18 = document2.appendChild((org.jsoup.nodes.Node) document10);
        java.lang.String str19 = element18.val();
        boolean boolean21 = element18.hasAttr("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str22 = element18.val();
        org.jsoup.nodes.Element element24 = element18.toggleClass("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        org.jsoup.nodes.Element element26 = element24.prepend("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        java.lang.String str27 = element26.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = element26.wrap("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root");
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element12 = element9.attr("hi! #document", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String[] strArray15 = new java.lang.String[] { "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element12.classNames((java.util.Set<java.lang.String>) strSet16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element12.firstElementSibling();
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        java.lang.String str5 = document2.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document2.previousElementSibling();
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag7, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element9.nextElementSibling();
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        org.jsoup.nodes.Node node19 = document2.removeAttr("#root");
        org.jsoup.nodes.Element element21 = document2.addClass("hi!");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node26 = document24.removeAttr("hi!");
        org.jsoup.nodes.Element element28 = document24.addClass("");
        org.jsoup.nodes.Element element29 = document2.prependChild((org.jsoup.nodes.Node) element28);
        org.jsoup.nodes.Element element31 = element29.prependText("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements34 = element31.getElementsByAttributeValueNot("hi!", "#document");
        org.jsoup.nodes.Element element36 = element31.appendText("\n<hi!>\n</hi!>");
        boolean boolean38 = element36.hasAttr("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.nodes.Element element40 = element36.prependElement("\n<body>\n</body>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element41 = element36.firstElementSibling();
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element9 = document2.appendText("hi! ");
        java.lang.String str10 = element9.html();
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node15 = document13.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = document13.childNodes();
        org.jsoup.nodes.Attributes attributes17 = document13.attributes();
        java.lang.String str19 = document13.attr("#root");
        org.jsoup.select.Elements elements22 = document13.getElementsByAttributeValueEnding("#root", "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.nodes.Element element23 = element9.appendChild((org.jsoup.nodes.Node) document13);
        org.jsoup.nodes.Node node25 = element23.removeAttr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str29 = document28.tagName();
        document28.setBaseUri("");
        org.jsoup.nodes.Element element33 = document28.addClass("");
        org.jsoup.nodes.Element element35 = document28.toggleClass("");
        org.jsoup.nodes.Element element37 = document28.addClass("hi!");
        org.jsoup.parser.Tag tag38 = document28.tag();
        org.jsoup.nodes.Element element40 = document28.addClass("");
        org.jsoup.nodes.Element element42 = document28.prependElement("hi!");
        org.jsoup.parser.Tag tag43 = document28.tag();
        org.jsoup.select.Elements elements45 = document28.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean47 = document28.equals((java.lang.Object) (short) 1);
        java.lang.String str48 = document28.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList49 = document28.childNodes();
        boolean boolean50 = element23.equals((java.lang.Object) document28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element51 = element23.nextElementSibling();
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        java.lang.String str8 = document2.html();
        org.jsoup.select.Elements elements11 = document2.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>", "<hi! #document>\n</hi! #document>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements12 = document2.siblingElements();
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element element4 = document2.child(0);
        org.jsoup.nodes.Element element5 = element4.parent();
        org.jsoup.nodes.Element element7 = element5.append("hi! #document");
        org.jsoup.nodes.Element element9 = element5.prepend("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        java.lang.String str10 = element5.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements11 = element5.siblingElements();
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.nodes.Element element8 = document2.prependText("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.removeClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root><#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int14 = element10.siblingIndex();
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        java.lang.String str9 = document2.attr("#root");
        java.lang.String str10 = document2.text();
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements13 = element12.siblingElements();
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        org.jsoup.nodes.Node node19 = document2.removeAttr("#root");
        java.lang.String str20 = document2.outerHtml();
        java.lang.String str21 = document2.toString();
        boolean boolean23 = document2.hasClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi! <#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int24 = document2.siblingIndex();
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        org.jsoup.nodes.Node node19 = document2.removeAttr("#root");
        org.jsoup.nodes.Element element21 = document2.addClass("hi!");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node26 = document24.removeAttr("hi!");
        org.jsoup.nodes.Element element28 = document24.addClass("");
        org.jsoup.nodes.Element element29 = document2.prependChild((org.jsoup.nodes.Node) element28);
        java.lang.String str30 = element29.nodeName();
        org.jsoup.nodes.Element element32 = element29.appendText("#document");
        org.jsoup.nodes.Element element34 = element32.toggleClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str35 = element32.toString();
        org.jsoup.nodes.Element element37 = element32.append("<html>\n<head>\n</head>\n<body>\n &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   #document \n  </body>\n </html>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element38 = element37.nextElementSibling();
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element12 = element9.attr("hi! #document", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str13 = element12.outerHtml();
        org.jsoup.nodes.Element element15 = element12.html(" hi! #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element15.lastElementSibling();
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.prepend("body");
        org.jsoup.nodes.Element element12 = document2.addClass("#document");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexEquals((-1));
        java.lang.String str16 = element12.attr("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        java.lang.String str17 = element12.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element12.lastElementSibling();
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str19 = document18.tagName();
        document18.setBaseUri("");
        document18.setBaseUri("");
        org.jsoup.nodes.Element element25 = document18.appendText("#root");
        org.jsoup.nodes.Element element26 = document10.appendChild((org.jsoup.nodes.Node) document18);
        boolean boolean27 = tag7.equals((java.lang.Object) element26);
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str30 = tag29.getName();
        org.jsoup.parser.Tag tag31 = tag29.getImplicitParent();
        boolean boolean32 = tag7.canContain(tag31);
        boolean boolean33 = tag31.isBlock();
        org.jsoup.nodes.Document document36 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str37 = document36.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList38 = document36.childNodes();
        boolean boolean40 = document36.hasAttr("#root");
        org.jsoup.parser.Tag tag41 = document36.tag();
        java.lang.String str42 = tag41.toString();
        org.jsoup.parser.Tag tag44 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str45 = tag44.getName();
        org.jsoup.parser.Tag tag46 = tag44.getImplicitParent();
        boolean boolean47 = tag44.isEmpty();
        java.lang.String str48 = tag44.toString();
        boolean boolean49 = tag41.isValidParent(tag44);
        boolean boolean50 = tag31.isValidParent(tag41);
        org.jsoup.nodes.Document document54 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str55 = document54.tagName();
        document54.setBaseUri("");
        org.jsoup.nodes.Element element59 = document54.addClass("");
        org.jsoup.nodes.Element element61 = document54.toggleClass("");
        org.jsoup.nodes.Element element63 = element61.html("");
        boolean boolean64 = element61.isBlock();
        org.jsoup.nodes.Attributes attributes65 = element61.attributes();
        org.jsoup.nodes.Element element66 = new org.jsoup.nodes.Element(tag31, "<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", attributes65);
        org.jsoup.select.Elements elements67 = element66.getAllElements();
        org.jsoup.select.Elements elements70 = element66.getElementsByAttributeValueEnding("#root hi! #root hi! hi! #root", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        java.lang.String str71 = element66.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element72 = element66.firstElementSibling();
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.select.Elements elements8 = element7.parents();
        org.jsoup.select.Elements elements9 = element7.getAllElements();
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str13 = document12.tagName();
        document12.setBaseUri("");
        org.jsoup.nodes.Element element17 = document12.addClass("");
        org.jsoup.nodes.Element element19 = document12.toggleClass("");
        org.jsoup.nodes.Element element21 = element19.html("");
        boolean boolean22 = element19.isBlock();
        java.lang.String[] strArray27 = new java.lang.String[] { "", "body", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        org.jsoup.nodes.Element element30 = element19.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Element element31 = element7.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Document document34 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str35 = document34.tagName();
        document34.setBaseUri("");
        document34.setBaseUri("");
        org.jsoup.nodes.Document document42 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str43 = document42.tagName();
        document42.setBaseUri("");
        document42.setBaseUri("");
        org.jsoup.nodes.Element element49 = document42.appendText("#root");
        org.jsoup.nodes.Element element50 = document34.appendChild((org.jsoup.nodes.Node) document42);
        java.lang.String str51 = document42.className();
        org.jsoup.nodes.Document document54 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str55 = document54.tagName();
        document54.setBaseUri("");
        document54.setBaseUri("");
        org.jsoup.nodes.Element element61 = document54.appendText("#root");
        org.jsoup.nodes.Element element63 = document54.wrap("#root");
        document42.replaceWith((org.jsoup.nodes.Node) document54);
        java.util.Set<java.lang.String> strSet65 = document42.classNames();
        org.jsoup.nodes.Element element66 = element7.classNames(strSet65);
        java.lang.Integer int67 = element66.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node68 = element66.previousSibling();
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        org.jsoup.nodes.Node node19 = document2.removeAttr("#root");
        org.jsoup.nodes.Element element21 = document2.addClass("hi!");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node26 = document24.removeAttr("hi!");
        org.jsoup.nodes.Element element28 = document24.addClass("");
        org.jsoup.nodes.Element element29 = document2.prependChild((org.jsoup.nodes.Node) element28);
        java.lang.String str30 = element29.nodeName();
        org.jsoup.nodes.Document document33 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str34 = document33.tagName();
        document33.setBaseUri("");
        document33.setBaseUri("");
        org.jsoup.nodes.Document document41 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str42 = document41.tagName();
        document41.setBaseUri("");
        document41.setBaseUri("");
        org.jsoup.nodes.Element element47 = document33.appendChild((org.jsoup.nodes.Node) document41);
        org.jsoup.nodes.Element element48 = document33.empty();
        boolean boolean49 = document33.isBlock();
        org.jsoup.nodes.Element element51 = document33.addClass("#root");
        org.jsoup.select.Elements elements54 = element51.getElementsByAttributeValueNot("#root", "body");
        org.jsoup.nodes.Element element55 = element29.prependChild((org.jsoup.nodes.Node) element51);
        org.jsoup.nodes.Element element57 = element29.removeClass("\n<#document>\n</#document>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element59 = element57.wrap("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root><#document>\n</#document>");
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        boolean boolean12 = element9.isBlock();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "body", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        org.jsoup.nodes.Element element20 = element9.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.select.Elements elements21 = element20.parents();
        org.jsoup.nodes.Element element23 = element20.addClass("<hi! #document>\n</hi! #document>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element25 = element23.prepend("<html> <head> </head> <body> hi! </body> </html>#root #root #root hi! #root hi! hi! #root<html> <head> </head> <body> hi! </body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = element25.previousElementSibling();
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.html("hi! ");
        org.jsoup.nodes.Element element12 = element10.addClass("#root");
        org.jsoup.select.Elements elements14 = element10.getElementsByTag("#root");
        org.jsoup.nodes.Element element15 = element10.empty();
        element15.setBaseUri("<hi! #document>\n</hi! #document>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element15.firstElementSibling();
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        boolean boolean18 = document2.isBlock();
        org.jsoup.nodes.Element element20 = document2.addClass("#root");
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str24 = document23.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = document23.childNodes();
        boolean boolean27 = document23.hasAttr("#root");
        org.jsoup.parser.Tag tag28 = document23.tag();
        org.jsoup.nodes.Element element29 = element20.prependChild((org.jsoup.nodes.Node) document23);
        org.jsoup.nodes.Element element31 = element20.html("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements33 = element31.getElementsByClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root><#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element34 = element31.nextElementSibling();
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("body", "#document");
        boolean boolean3 = document2.isBlock();
        org.jsoup.nodes.Element element5 = document2.toggleClass("#document");
        org.jsoup.nodes.Element element7 = element5.toggleClass("hi! #document");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node12 = document10.removeAttr("hi!");
        org.jsoup.nodes.Element element14 = document10.addClass("");
        org.jsoup.select.Elements elements16 = document10.getElementsByTag("#root");
        java.lang.String str17 = document10.tagName();
        org.jsoup.nodes.Element element19 = document10.toggleClass("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.jsoup.nodes.Element element21 = document10.addClass("<html>\n<head>\n</head>\n<body>\n body\n</body>\n</html>#root");
        boolean boolean22 = element5.equals((java.lang.Object) document10);
        org.jsoup.nodes.Document document25 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str26 = document25.tagName();
        document25.setBaseUri("");
        org.jsoup.nodes.Element element30 = document25.addClass("");
        org.jsoup.nodes.Element element32 = document25.toggleClass("");
        org.jsoup.nodes.Element element34 = document25.addClass("hi!");
        org.jsoup.parser.Tag tag35 = document25.tag();
        org.jsoup.nodes.Element element37 = document25.addClass("");
        org.jsoup.nodes.Element element39 = document25.prependElement("hi!");
        org.jsoup.parser.Tag tag40 = document25.tag();
        java.lang.String str41 = tag40.getName();
        org.jsoup.parser.Tag tag42 = tag40.getImplicitParent();
        java.lang.String str43 = tag40.toString();
        boolean boolean44 = tag40.isData();
        java.lang.String str45 = tag40.toString();
        boolean boolean46 = document10.equals((java.lang.Object) str45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element48 = document10.wrap("<html> <head> </head> <body> hi! </body> </html>#root<#root> <html> <head> </head> <body> hi! </body> </html> </#root>");
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.parser.Tag tag12 = document2.tag();
        org.jsoup.nodes.Element element14 = document2.addClass("");
        org.jsoup.nodes.Element element16 = document2.prependElement("hi!");
        org.jsoup.parser.Tag tag17 = document2.tag();
        org.jsoup.select.Elements elements19 = document2.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element22 = document2.attr("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "#root");
        org.jsoup.nodes.Element element24 = document2.appendText("hi! ");
        java.lang.String str25 = element24.className();
        boolean boolean27 = element24.hasClass("\n<body>\n</body>");
        org.jsoup.nodes.Element element30 = element24.attr("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "body");
        element30.setBaseUri("\n<#document>\n</#document>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node33 = element30.nextSibling();
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        org.jsoup.nodes.Element element5 = document2.appendText("#document");
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueContaining("hi!", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = element5.removeClass("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Element element12 = element10.prepend("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements14 = element10.getElementsByClass("\n<hi!>\n</hi!>");
        element10.setBaseUri("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi> \n</hi> \n<html> \n<head> \n</head> \n<body>\n  hi!  hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = element10.nextSibling();
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.parser.Tag tag12 = document2.tag();
        org.jsoup.nodes.Element element14 = document2.addClass("");
        org.jsoup.nodes.Element element16 = document2.prependElement("hi!");
        org.jsoup.parser.Tag tag17 = document2.tag();
        org.jsoup.select.Elements elements19 = document2.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element22 = document2.attr("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "#root");
        org.jsoup.nodes.Element element24 = document2.appendText("hi! ");
        element24.setBaseUri("");
        org.jsoup.nodes.Element element27 = element24.empty();
        java.lang.String str29 = element24.attr("<#document>\n</#document>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = element24.nextElementSibling();
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element9 = element7.appendText("hi! ");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str13 = document12.tagName();
        document12.setBaseUri("");
        org.jsoup.select.Elements elements17 = document12.getElementsByIndexEquals((int) (byte) 1);
        org.jsoup.select.Elements elements19 = document12.getElementsByIndexLessThan(10);
        org.jsoup.nodes.Element element21 = document12.appendElement("<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
        boolean boolean22 = element7.equals((java.lang.Object) element21);
        org.jsoup.nodes.Element element23 = element21.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = element23.previousSibling();
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        boolean boolean12 = element9.isBlock();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "body", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        org.jsoup.nodes.Element element20 = element9.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.select.Elements elements21 = element20.parents();
        org.jsoup.nodes.Element element23 = element20.addClass("<hi! #document>\n</hi! #document>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element23.text("hi! <#root> hi!<html> <head> </head> <body> hi! </body> </html>");
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        org.jsoup.nodes.Node node6 = document2.childNode(0);
        org.jsoup.nodes.Element element8 = document2.val("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = element8.toggleClass("hi! #document");
        java.lang.String str11 = element10.className();
        org.jsoup.select.Elements elements14 = element10.getElementsByAttributeValueContaining("hi! #document", "html");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element10.lastElementSibling();
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        boolean boolean12 = element9.isBlock();
        org.jsoup.select.Elements elements15 = element9.getElementsByAttributeValueEnding("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>", "#document");
        org.jsoup.nodes.Element element17 = element9.wrap("#root");
        org.jsoup.select.Elements elements20 = element9.getElementsByAttributeValue("body#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>\n</#root>", "\n<hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int21 = element9.siblingIndex();
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        org.jsoup.nodes.Node node19 = document2.removeAttr("#root");
        java.lang.String str20 = document2.nodeName();
        java.lang.String str21 = document2.outerHtml();
        document2.setBaseUri("");
        boolean boolean25 = document2.hasClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.jsoup.select.Elements elements28 = document2.getElementsByAttributeValueStarting("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList29 = document2.siblingNodes();
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str19 = document18.tagName();
        document18.setBaseUri("");
        document18.setBaseUri("");
        org.jsoup.nodes.Element element25 = document18.appendText("#root");
        org.jsoup.nodes.Element element26 = document10.appendChild((org.jsoup.nodes.Node) document18);
        boolean boolean27 = tag7.equals((java.lang.Object) element26);
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str30 = tag29.getName();
        org.jsoup.parser.Tag tag31 = tag29.getImplicitParent();
        boolean boolean32 = tag7.canContain(tag31);
        boolean boolean33 = tag31.isBlock();
        org.jsoup.nodes.Document document36 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str37 = document36.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList38 = document36.childNodes();
        boolean boolean40 = document36.hasAttr("#root");
        org.jsoup.parser.Tag tag41 = document36.tag();
        java.lang.String str42 = tag41.toString();
        org.jsoup.parser.Tag tag44 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str45 = tag44.getName();
        org.jsoup.parser.Tag tag46 = tag44.getImplicitParent();
        boolean boolean47 = tag44.isEmpty();
        java.lang.String str48 = tag44.toString();
        boolean boolean49 = tag41.isValidParent(tag44);
        boolean boolean50 = tag31.isValidParent(tag41);
        org.jsoup.nodes.Document document54 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str55 = document54.tagName();
        document54.setBaseUri("");
        org.jsoup.nodes.Element element59 = document54.addClass("");
        org.jsoup.nodes.Element element61 = document54.toggleClass("");
        org.jsoup.nodes.Element element63 = element61.html("");
        boolean boolean64 = element61.isBlock();
        org.jsoup.nodes.Attributes attributes65 = element61.attributes();
        org.jsoup.nodes.Element element66 = new org.jsoup.nodes.Element(tag31, "<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", attributes65);
        org.jsoup.nodes.Element element68 = element66.prepend("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! #document");
        boolean boolean69 = element68.isBlock();
        java.lang.Integer int70 = element68.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element71 = element68.previousElementSibling();
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.prepend("body");
        org.jsoup.nodes.Element element12 = document2.addClass("#document");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexEquals((-1));
        org.jsoup.nodes.Element element16 = element12.prependElement("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element12.wrap("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("body", "");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexLessThan(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.siblingNodes();
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element12 = element9.attr("hi! #document", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str13 = element12.outerHtml();
        org.jsoup.nodes.Element element15 = element12.html(" hi! #document");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str19 = document18.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = document18.childNodes();
        boolean boolean22 = document18.hasAttr("#root");
        org.jsoup.parser.Tag tag23 = document18.tag();
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str27 = document26.tagName();
        document26.setBaseUri("");
        document26.setBaseUri("");
        org.jsoup.nodes.Document document34 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str35 = document34.tagName();
        document34.setBaseUri("");
        document34.setBaseUri("");
        org.jsoup.nodes.Element element41 = document34.appendText("#root");
        org.jsoup.nodes.Element element42 = document26.appendChild((org.jsoup.nodes.Node) document34);
        boolean boolean43 = tag23.equals((java.lang.Object) element42);
        org.jsoup.parser.Tag tag45 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str46 = tag45.getName();
        org.jsoup.parser.Tag tag47 = tag45.getImplicitParent();
        boolean boolean48 = tag23.canContain(tag47);
        java.lang.String str49 = tag23.toString();
        java.lang.String str50 = tag23.getName();
        org.jsoup.nodes.Document document53 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str54 = document53.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList55 = document53.childNodes();
        boolean boolean57 = document53.hasAttr("#root");
        org.jsoup.parser.Tag tag58 = document53.tag();
        boolean boolean59 = tag23.isValidParent(tag58);
        org.jsoup.nodes.Element element61 = new org.jsoup.nodes.Element(tag23, "hi! ");
        org.jsoup.nodes.Element element63 = element61.toggleClass("hi! ");
        java.lang.String str64 = element63.baseUri();
        org.jsoup.nodes.Element element65 = element15.prependChild((org.jsoup.nodes.Node) element63);
        org.jsoup.nodes.Element element67 = element15.val("\n<#document class=\" #root\">\n</#document>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int68 = element67.siblingIndex();
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "hi!");
        java.util.Set<java.lang.String> strSet3 = document2.classNames();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element8 = document6.appendText("#root");
        org.jsoup.nodes.Element element10 = document6.prepend("#root");
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str14 = document13.tagName();
        document13.setBaseUri("");
        document13.setBaseUri("");
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str22 = document21.tagName();
        document21.setBaseUri("");
        document21.setBaseUri("");
        org.jsoup.nodes.Element element28 = document21.appendText("#root");
        org.jsoup.nodes.Element element29 = document13.appendChild((org.jsoup.nodes.Node) document21);
        java.lang.String str30 = element29.baseUri();
        org.jsoup.nodes.Element element31 = document6.appendChild((org.jsoup.nodes.Node) element29);
        org.jsoup.nodes.Element element32 = document2.appendChild((org.jsoup.nodes.Node) element31);
        org.jsoup.nodes.Element element34 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element36 = document2.toggleClass("\n<body>\n</body>");
        org.jsoup.nodes.Element element37 = element36.empty();
        org.jsoup.select.Elements elements39 = element36.getElementsByAttribute(" hi! #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements40 = element36.siblingElements();
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element12 = element9.attr("hi! #document", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String[] strArray15 = new java.lang.String[] { "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element12.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element20 = element12.text("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! #document");
        java.lang.String str21 = element20.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element20.previousElementSibling();
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element12 = document2.empty();
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str17 = document16.tagName();
        document16.setBaseUri("");
        org.jsoup.nodes.Element element21 = document16.addClass("");
        org.jsoup.select.Elements elements22 = element21.parents();
        org.jsoup.select.Elements elements23 = element21.getAllElements();
        org.jsoup.nodes.Element element24 = element12.prependChild((org.jsoup.nodes.Node) element21);
        boolean boolean25 = element12.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = element12.firstElementSibling();
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element9 = document2.appendText("hi! ");
        java.lang.String str10 = element9.html();
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node15 = document13.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = document13.childNodes();
        org.jsoup.nodes.Attributes attributes17 = document13.attributes();
        java.lang.String str19 = document13.attr("#root");
        org.jsoup.select.Elements elements22 = document13.getElementsByAttributeValueEnding("#root", "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.nodes.Element element23 = element9.appendChild((org.jsoup.nodes.Node) document13);
        org.jsoup.nodes.Node node25 = element23.removeAttr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements26 = element23.parents();
        java.lang.String str27 = element23.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList28 = element23.siblingNodes();
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.parser.Tag tag12 = document2.tag();
        org.jsoup.nodes.Element element14 = document2.addClass("");
        org.jsoup.nodes.Element element16 = document2.prependElement("hi!");
        org.jsoup.parser.Tag tag17 = document2.tag();
        org.jsoup.select.Elements elements19 = document2.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element22 = document2.attr("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "#root");
        org.jsoup.nodes.Element element24 = document2.appendText("hi! ");
        element24.setBaseUri("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int27 = element24.siblingIndex();
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        org.jsoup.nodes.Node node19 = document2.removeAttr("#root");
        org.jsoup.nodes.Element element21 = document2.addClass("hi!");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node26 = document24.removeAttr("hi!");
        org.jsoup.nodes.Element element28 = document24.addClass("");
        org.jsoup.nodes.Element element29 = document2.prependChild((org.jsoup.nodes.Node) element28);
        org.jsoup.nodes.Element element31 = element28.prependElement("#document");
        org.jsoup.nodes.Element element33 = element28.append("hi! ");
        org.jsoup.nodes.Element element34 = element28.empty();
        org.jsoup.nodes.Document document37 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str38 = document37.tagName();
        document37.setBaseUri("");
        org.jsoup.nodes.Element element42 = document37.addClass("");
        org.jsoup.nodes.Element element44 = document37.toggleClass("");
        org.jsoup.nodes.Element element46 = element44.html("");
        org.jsoup.select.Elements elements49 = element44.getElementsByAttributeValue("hi! ", "#root");
        org.jsoup.nodes.Element element51 = element44.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element53 = element44.text(" hi! #document");
        org.jsoup.nodes.Document document56 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str57 = document56.tagName();
        org.jsoup.nodes.Element element59 = document56.appendText("#document");
        org.jsoup.select.Elements elements62 = element59.getElementsByAttributeValueContaining("hi!", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element64 = element59.removeClass("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        java.lang.String str65 = element64.id();
        java.lang.String str66 = element64.data();
        org.jsoup.nodes.Element element67 = element44.prependChild((org.jsoup.nodes.Node) element64);
        boolean boolean68 = element28.equals((java.lang.Object) element67);
        org.jsoup.select.Elements elements71 = element67.getElementsByAttributeValueContaining("<html> <head> </head> <body> hi! </body> </html>#root<#root> <html> <head> </head> <body> hi! </body> </html> </#root>", "\n<body class=\" body hi!\">\n</body>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int72 = element67.siblingIndex();
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Element element8 = element6.prependText("body");
        org.jsoup.parser.Tag tag9 = element8.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element8.previousElementSibling();
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        java.lang.String str3 = document2.tagName();
        org.jsoup.nodes.Element element4 = document2.empty();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str8 = document7.tagName();
        org.jsoup.select.Elements elements10 = document7.getElementsByClass("body#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>\n</#root>");
        org.jsoup.select.Elements elements12 = document7.getElementsByIndexEquals(100);
        org.jsoup.nodes.Element element14 = document7.val("#document");
        org.jsoup.select.Elements elements16 = element14.getElementsByClass(" hi! <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element17 = document2.appendChild((org.jsoup.nodes.Node) element14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements18 = document2.siblingElements();
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        java.lang.String str11 = element9.attr("");
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#root");
        org.jsoup.nodes.Element element16 = element9.text("body");
        java.lang.String str17 = element16.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element16.wrap("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str19 = document18.tagName();
        document18.setBaseUri("");
        document18.setBaseUri("");
        org.jsoup.nodes.Element element25 = document18.appendText("#root");
        org.jsoup.nodes.Element element26 = document10.appendChild((org.jsoup.nodes.Node) document18);
        boolean boolean27 = tag7.equals((java.lang.Object) element26);
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str30 = tag29.getName();
        org.jsoup.parser.Tag tag31 = tag29.getImplicitParent();
        boolean boolean32 = tag7.canContain(tag31);
        boolean boolean33 = tag31.isBlock();
        org.jsoup.nodes.Document document36 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str37 = document36.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList38 = document36.childNodes();
        boolean boolean40 = document36.hasAttr("#root");
        org.jsoup.parser.Tag tag41 = document36.tag();
        java.lang.String str42 = tag41.toString();
        org.jsoup.parser.Tag tag44 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str45 = tag44.getName();
        org.jsoup.parser.Tag tag46 = tag44.getImplicitParent();
        boolean boolean47 = tag44.isEmpty();
        java.lang.String str48 = tag44.toString();
        boolean boolean49 = tag41.isValidParent(tag44);
        boolean boolean50 = tag31.isValidParent(tag41);
        org.jsoup.nodes.Document document54 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str55 = document54.tagName();
        document54.setBaseUri("");
        org.jsoup.nodes.Element element59 = document54.addClass("");
        org.jsoup.nodes.Element element61 = document54.toggleClass("");
        org.jsoup.nodes.Element element63 = element61.html("");
        boolean boolean64 = element61.isBlock();
        org.jsoup.nodes.Attributes attributes65 = element61.attributes();
        org.jsoup.nodes.Element element66 = new org.jsoup.nodes.Element(tag31, "<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", attributes65);
        org.jsoup.nodes.Element element68 = element66.prepend("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! #document");
        org.jsoup.nodes.Element element70 = element68.val("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root");
        org.jsoup.nodes.Document document73 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str74 = document73.tagName();
        document73.setBaseUri("");
        org.jsoup.nodes.Element element78 = document73.addClass("");
        org.jsoup.nodes.Element element80 = document73.toggleClass("");
        org.jsoup.nodes.Element element82 = document73.addClass("hi!");
        org.jsoup.parser.Tag tag83 = document73.tag();
        org.jsoup.nodes.Element element85 = document73.addClass("");
        org.jsoup.nodes.Element element87 = document73.prependElement("hi!");
        org.jsoup.parser.Tag tag88 = document73.tag();
        org.jsoup.select.Elements elements90 = document73.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element93 = document73.attr("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "#root");
        org.jsoup.nodes.Element element94 = document73.parent();
        org.jsoup.nodes.Element element96 = document73.prepend("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element97 = element68.appendChild((org.jsoup.nodes.Node) document73);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element99 = element68.wrap("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element9 = document2.appendText("hi! ");
        org.jsoup.nodes.Element element11 = element9.removeClass("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.select.Elements elements13 = element9.select("body");
        org.jsoup.nodes.Element element15 = element9.prependText("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        boolean boolean16 = element15.hasText();
        org.jsoup.select.Elements elements17 = element15.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements18 = element15.siblingElements();
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Element element8 = element6.prependText("body");
        org.jsoup.parser.Tag tag9 = element8.tag();
        org.jsoup.nodes.Element element12 = element8.attr("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#root");
        org.jsoup.nodes.Element element14 = element12.appendText("hi! #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element14.nextElementSibling();
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        document2.setBaseUri("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element element16 = document14.child(0);
        java.util.Set<java.lang.String> strSet17 = element16.classNames();
        org.jsoup.nodes.Element element18 = document2.classNames(strSet17);
        org.jsoup.nodes.Element element21 = document2.attr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi!");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node26 = document24.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = document24.childNodes();
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str31 = document30.tagName();
        document30.setBaseUri("");
        document30.setBaseUri("");
        org.jsoup.nodes.Element element37 = document30.appendText("#root");
        document30.setBaseUri("");
        org.jsoup.nodes.Element element40 = document30.empty();
        org.jsoup.nodes.Element element41 = element40.empty();
        org.jsoup.nodes.Element element42 = document24.appendChild((org.jsoup.nodes.Node) element40);
        org.jsoup.select.Elements elements45 = document24.getElementsByAttributeValueStarting("hi! ", "#document");
        java.lang.Integer int46 = document24.elementSiblingIndex();
        org.jsoup.nodes.Element element47 = document2.appendChild((org.jsoup.nodes.Node) document24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element48 = document2.lastElementSibling();
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexLessThan((int) (byte) 100);
        org.jsoup.nodes.Element element6 = document2.appendText("hi!");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str10 = document9.tagName();
        document9.setBaseUri("");
        document9.setBaseUri("");
        java.lang.String str16 = document9.attr("#root");
        org.jsoup.nodes.Element element17 = element6.appendChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Element element19 = element17.removeClass("body");
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node24 = document22.removeAttr("hi!");
        org.jsoup.nodes.Element element26 = document22.addClass("");
        org.jsoup.select.Elements elements28 = document22.getElementsByTag("#root");
        document22.setBaseUri("body");
        org.jsoup.nodes.Element element31 = element17.appendChild((org.jsoup.nodes.Node) document22);
        org.jsoup.select.Elements elements32 = document22.siblingElements();
        org.jsoup.nodes.Element element33 = document22.parent();
        org.jsoup.nodes.Node node35 = element33.removeAttr("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node36 = node35.previousSibling();
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element10 = document2.val("#document");
        org.jsoup.parser.Tag tag11 = document2.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document2.firstElementSibling();
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexLessThan((int) (byte) 100);
        org.jsoup.nodes.Element element6 = document2.appendText("hi!");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str10 = document9.tagName();
        document9.setBaseUri("");
        document9.setBaseUri("");
        java.lang.String str16 = document9.attr("#root");
        org.jsoup.nodes.Element element17 = element6.appendChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Element element19 = element17.removeClass("body");
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element element24 = document22.child(0);
        org.jsoup.nodes.Element element25 = element24.parent();
        org.jsoup.nodes.Element element27 = element25.append("hi! #document");
        org.jsoup.nodes.Element element29 = element25.prepend("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.jsoup.nodes.Element element30 = element17.appendChild((org.jsoup.nodes.Node) element25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element31 = element17.lastElementSibling();
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        java.lang.String str9 = document2.attr("#root");
        org.jsoup.nodes.Element element11 = document2.text("");
        boolean boolean12 = document2.isBlock();
        org.jsoup.nodes.Element element14 = document2.text("hi! ");
        org.jsoup.select.Elements elements17 = element14.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   #document \n  </body>\n </html>\n</body>\n</html>", "#root");
        org.jsoup.nodes.Element element18 = element14.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element14.wrap("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element10 = document2.child((int) (short) 0);
        boolean boolean11 = document2.hasText();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element16 = document14.appendText("#root");
        org.jsoup.nodes.Element element18 = document14.prepend("#root");
        org.jsoup.nodes.Element element19 = element18.empty();
        org.jsoup.select.Elements elements21 = element18.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.nodes.Element element22 = document2.prependChild((org.jsoup.nodes.Node) element18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList23 = document2.siblingNodes();
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element12 = document2.empty();
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str16 = document15.tagName();
        document15.setBaseUri("");
        document15.setBaseUri("");
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str24 = document23.tagName();
        document23.setBaseUri("");
        document23.setBaseUri("");
        org.jsoup.nodes.Element element29 = document15.appendChild((org.jsoup.nodes.Node) document23);
        boolean boolean31 = document23.hasClass("#root");
        org.jsoup.select.Elements elements34 = document23.getElementsByAttributeValueNot("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi! ");
        org.jsoup.nodes.Document document37 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element element39 = document37.child(0);
        java.util.Set<java.lang.String> strSet40 = element39.classNames();
        org.jsoup.nodes.Element element41 = document23.classNames(strSet40);
        org.jsoup.nodes.Element element42 = document2.classNames(strSet40);
        org.jsoup.select.Elements elements43 = element42.children();
        java.lang.String str44 = element42.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element46 = element42.text("<html> <head> </head> <body> </body> </html> hi!");
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.parser.Tag tag12 = document2.tag();
        org.jsoup.nodes.Element element14 = document2.addClass("");
        org.jsoup.nodes.Element element16 = document2.prependElement("hi!");
        org.jsoup.parser.Tag tag17 = document2.tag();
        java.lang.String str18 = tag17.getName();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node24 = document22.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = document22.childNodes();
        org.jsoup.nodes.Attributes attributes26 = document22.attributes();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag17, "hi!", attributes26);
        org.jsoup.select.Elements elements29 = element27.getElementsByTag("hi!");
        boolean boolean30 = element27.isBlock();
        org.jsoup.nodes.Element element32 = element27.html("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.jsoup.nodes.Element element34 = element32.html("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        org.jsoup.select.Elements elements35 = element34.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int36 = element34.siblingIndex();
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexLessThan((int) (byte) 100);
        org.jsoup.nodes.Element element6 = document2.appendText("hi!");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str10 = document9.tagName();
        document9.setBaseUri("");
        document9.setBaseUri("");
        java.lang.String str16 = document9.attr("#root");
        org.jsoup.nodes.Element element17 = element6.appendChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Element element19 = element17.removeClass("body");
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node24 = document22.removeAttr("hi!");
        org.jsoup.nodes.Element element26 = document22.addClass("");
        org.jsoup.select.Elements elements28 = document22.getElementsByTag("#root");
        document22.setBaseUri("body");
        org.jsoup.nodes.Element element31 = element17.appendChild((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Element element33 = element17.html("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        java.lang.String str34 = element33.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int35 = element33.siblingIndex();
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        boolean boolean18 = document2.isBlock();
        org.jsoup.nodes.Element element20 = document2.addClass("#root");
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str24 = document23.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = document23.childNodes();
        boolean boolean27 = document23.hasAttr("#root");
        org.jsoup.parser.Tag tag28 = document23.tag();
        org.jsoup.nodes.Element element29 = element20.prependChild((org.jsoup.nodes.Node) document23);
        org.jsoup.select.Elements elements31 = element20.getElementsByIndexEquals((int) (short) 100);
        org.jsoup.nodes.Document document34 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str35 = document34.tagName();
        document34.setBaseUri("");
        org.jsoup.nodes.Element element39 = document34.addClass("");
        org.jsoup.nodes.Element element41 = document34.toggleClass("");
        org.jsoup.nodes.Element element44 = element41.attr("hi! #document", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String[] strArray47 = new java.lang.String[] { "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        org.jsoup.nodes.Element element50 = element44.classNames((java.util.Set<java.lang.String>) strSet48);
        org.jsoup.nodes.Element element51 = element20.classNames((java.util.Set<java.lang.String>) strSet48);
        org.jsoup.nodes.Element element53 = element51.toggleClass("<html> <head> </head> <body> hi! </body> </html>#root #root #root hi! #root hi! hi! #root<html> <head> </head> <body> hi! </body> </html>");
        org.jsoup.select.Elements elements55 = element51.getElementsByIndexGreaterThan((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node56 = element51.previousSibling();
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element10 = document2.val("#document");
        org.jsoup.nodes.Element element12 = document2.prependText("\n<hi!>\n</hi!>");
        org.jsoup.nodes.Element element14 = element12.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        java.lang.String str15 = element12.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element12.wrap("<html> <head> </head> <body> hi! </body> </html>#root<#root> <html> <head> </head> <body> hi! </body> </html> </#root>");
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.prepend("body");
        org.jsoup.nodes.Element element12 = document2.addClass("#document");
        org.jsoup.nodes.Element element14 = element12.toggleClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.jsoup.nodes.Element element16 = element14.addClass("hi! ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = element16.nextSibling();
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.prepend("body");
        org.jsoup.nodes.Element element12 = document2.addClass("#document");
        org.jsoup.nodes.Element element14 = element12.toggleClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        boolean boolean15 = element14.hasText();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document", "hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int19 = document18.elementSiblingIndex();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root><#document>\n</#document>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root><#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.jsoup.nodes.Element element23 = document18.prependChild((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Element element24 = element14.appendChild((org.jsoup.nodes.Node) element23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element14.firstElementSibling();
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean4 = document2.hasAttr("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str8 = document7.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document7.childNodes();
        boolean boolean11 = document7.hasAttr("#root");
        org.jsoup.parser.Tag tag12 = document7.tag();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag12, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        boolean boolean15 = document2.equals((java.lang.Object) tag12);
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str20 = document19.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = document19.childNodes();
        java.lang.Integer int22 = document19.elementSiblingIndex();
        org.jsoup.nodes.Element element24 = document19.prependElement("hi! #document");
        org.jsoup.nodes.Attributes attributes25 = document19.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag12, "<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>", attributes25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element26.firstElementSibling();
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        boolean boolean12 = element9.isBlock();
        org.jsoup.nodes.Attributes attributes13 = element9.attributes();
        org.jsoup.select.Elements elements16 = element9.getElementsByAttributeValueEnding("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi! ");
        org.jsoup.nodes.Element element18 = element9.prependElement("hi! #document");
        org.jsoup.nodes.Element element20 = element9.addClass("");
        java.lang.String str21 = element20.val();
        org.jsoup.select.Elements elements22 = element20.children();
        java.lang.String str23 = element20.id();
        org.jsoup.nodes.Element element25 = element20.removeClass("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n  <html> \n   <head> \n   </head> \n   <body>\n     hi!   #document \n   </body>\n  </html>\n </body>\n</html>\n</#root>\n<html> \n<head> \n</head> \n<body>  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = element20.lastElementSibling();
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("body", "#document");
        boolean boolean3 = document2.isBlock();
        org.jsoup.nodes.Element element5 = document2.toggleClass("#document");
        org.jsoup.nodes.Element element7 = element5.toggleClass("hi! #document");
        org.jsoup.select.Elements elements8 = element7.parents();
        org.jsoup.select.Elements elements11 = element7.getElementsByAttributeValueEnding("<#root>\n</#root>", "&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi> \n</hi> \n<html> \n <head> \n </head> \n <body>\n   hi!  hi!\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int12 = element7.siblingIndex();
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        org.jsoup.nodes.Element element11 = document2.wrap("#root");
        java.lang.String str12 = document2.baseUri();
        org.jsoup.nodes.Element element14 = document2.val("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi> \n</hi> \n<html> \n<head> \n</head> \n<body>\n  hi!  hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int15 = document2.siblingIndex();
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        org.jsoup.nodes.Node node19 = document2.removeAttr("#root");
        org.jsoup.nodes.Element element21 = document2.addClass("#root");
        java.lang.String str22 = document2.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = document2.nextElementSibling();
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.parser.Tag tag12 = document2.tag();
        org.jsoup.nodes.Element element14 = document2.addClass("");
        org.jsoup.nodes.Element element16 = document2.prependElement("hi!");
        org.jsoup.parser.Tag tag17 = document2.tag();
        org.jsoup.select.Elements elements19 = document2.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element22 = document2.attr("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = document2.lastElementSibling();
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.select.Elements elements8 = element7.parents();
        org.jsoup.select.Elements elements9 = element7.getAllElements();
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str13 = document12.tagName();
        document12.setBaseUri("");
        org.jsoup.nodes.Element element17 = document12.addClass("");
        org.jsoup.nodes.Element element19 = document12.toggleClass("");
        org.jsoup.nodes.Element element21 = element19.html("");
        boolean boolean22 = element19.isBlock();
        java.lang.String[] strArray27 = new java.lang.String[] { "", "body", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        org.jsoup.nodes.Element element30 = element19.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Element element31 = element7.classNames((java.util.Set<java.lang.String>) strSet28);
        java.lang.String str32 = element7.id();
        org.jsoup.nodes.Element element34 = element7.append("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element35 = element34.lastElementSibling();
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>", "\n<hi!>\n</hi!>");
        java.lang.String str3 = document2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements4 = document2.siblingElements();
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str19 = document18.tagName();
        document18.setBaseUri("");
        document18.setBaseUri("");
        org.jsoup.nodes.Element element25 = document18.appendText("#root");
        org.jsoup.nodes.Element element26 = document10.appendChild((org.jsoup.nodes.Node) document18);
        boolean boolean27 = tag7.equals((java.lang.Object) element26);
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str30 = tag29.getName();
        org.jsoup.parser.Tag tag31 = tag29.getImplicitParent();
        boolean boolean32 = tag7.canContain(tag31);
        java.lang.String str33 = tag7.toString();
        java.lang.String str34 = tag7.getName();
        org.jsoup.nodes.Document document37 = org.jsoup.parser.Parser.parse("#root", "hi!");
        java.util.Set<java.lang.String> strSet38 = document37.classNames();
        org.jsoup.nodes.Element element40 = document37.val("#document");
        java.lang.String str41 = element40.data();
        boolean boolean42 = tag7.equals((java.lang.Object) element40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int43 = element40.siblingIndex();
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValue("hi! ", "#root");
        org.jsoup.nodes.Element element16 = element9.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element18 = element9.text(" hi! #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element18.previousElementSibling();
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>", "<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.siblingNodes();
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        org.jsoup.nodes.Element element6 = document2.addClass("");
        document2.setBaseUri("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document2.previousElementSibling();
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str10 = document9.tagName();
        document9.setBaseUri("");
        document9.setBaseUri("");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str18 = document17.tagName();
        document17.setBaseUri("");
        document17.setBaseUri("");
        org.jsoup.nodes.Element element24 = document17.appendText("#root");
        org.jsoup.nodes.Element element25 = document9.appendChild((org.jsoup.nodes.Node) document17);
        java.lang.String str26 = element25.baseUri();
        org.jsoup.nodes.Element element27 = document2.appendChild((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str31 = document30.tagName();
        document30.setBaseUri("");
        org.jsoup.nodes.Element element35 = document30.addClass("");
        org.jsoup.nodes.Element element37 = document30.toggleClass("");
        org.jsoup.nodes.Element element39 = element37.html("");
        org.jsoup.select.Elements elements42 = element37.getElementsByAttributeValue("hi! ", "#root");
        boolean boolean43 = document2.equals((java.lang.Object) elements42);
        java.lang.String str44 = document2.val();
        java.lang.String str45 = document2.toString();
        org.jsoup.nodes.Element element47 = document2.getElementById("hi! hi!hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList48 = document2.childNodes();
        java.lang.String str50 = document2.attr("hi! <#root> hi!<html> <head> </head> <body> hi! </body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element51 = document2.nextElementSibling();
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        boolean boolean18 = document2.isBlock();
        org.jsoup.nodes.Element element20 = document2.addClass("#root");
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str24 = document23.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = document23.childNodes();
        boolean boolean27 = document23.hasAttr("#root");
        org.jsoup.parser.Tag tag28 = document23.tag();
        org.jsoup.nodes.Element element29 = element20.prependChild((org.jsoup.nodes.Node) document23);
        org.jsoup.select.Elements elements31 = element20.getElementsByTag("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element33 = element20.prependText(" hi! #document");
        org.jsoup.nodes.Document document36 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str37 = document36.tagName();
        document36.setBaseUri("");
        document36.setBaseUri("");
        org.jsoup.nodes.Document document44 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str45 = document44.tagName();
        document44.setBaseUri("");
        document44.setBaseUri("");
        org.jsoup.nodes.Element element50 = document36.appendChild((org.jsoup.nodes.Node) document44);
        boolean boolean52 = document44.hasClass("#root");
        org.jsoup.select.Elements elements55 = document44.getElementsByAttributeValueNot("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi! ");
        org.jsoup.nodes.Document document58 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element element60 = document58.child(0);
        java.util.Set<java.lang.String> strSet61 = element60.classNames();
        org.jsoup.nodes.Element element62 = document44.classNames(strSet61);
        org.jsoup.nodes.Element element63 = element20.classNames(strSet61);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node64 = element20.previousSibling();
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        boolean boolean18 = document2.isBlock();
        org.jsoup.nodes.Element element20 = document2.addClass("#root");
        org.jsoup.select.Elements elements23 = element20.getElementsByAttributeValueNot("#root", "body");
        org.jsoup.nodes.Element element25 = element20.prependText("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.select.Elements elements28 = element25.getElementsByAttributeValueStarting("body", "hi! ");
        org.jsoup.nodes.Element element30 = element25.prependText("hi! <#root> hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int31 = element30.siblingIndex();
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        boolean boolean6 = document2.hasClass("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document2.previousElementSibling();
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        org.jsoup.select.Elements elements11 = document2.getElementsByAttribute("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str15 = document14.tagName();
        document14.setBaseUri("");
        org.jsoup.select.Elements elements19 = document14.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.nodes.Element element20 = document2.appendChild((org.jsoup.nodes.Node) document14);
        org.jsoup.nodes.Node node22 = document2.removeAttr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.nodes.Element element24 = document2.text("");
        org.jsoup.parser.Tag tag25 = element24.tag();
        org.jsoup.select.Elements elements27 = element24.select("#root");
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parseBodyFragment("\n<body>\n</body>", "body");
        org.jsoup.nodes.Document document33 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str34 = document33.tagName();
        document33.setBaseUri("");
        org.jsoup.nodes.Element element38 = document33.addClass("");
        org.jsoup.nodes.Element element40 = document33.toggleClass("");
        org.jsoup.nodes.Element element42 = element40.html("");
        org.jsoup.select.Elements elements45 = element40.getElementsByAttributeValue("hi! ", "#root");
        org.jsoup.nodes.Element element47 = element40.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str48 = element47.className();
        org.jsoup.nodes.Element element50 = element47.prependElement("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        org.jsoup.nodes.Element element51 = document30.appendChild((org.jsoup.nodes.Node) element47);
        java.util.Set<java.lang.String> strSet52 = element47.classNames();
        org.jsoup.nodes.Element element53 = element24.classNames(strSet52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node54 = element53.nextSibling();
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        java.lang.String str17 = element16.val();
        org.jsoup.nodes.Attributes attributes18 = element16.attributes();
        org.jsoup.nodes.Element element20 = element16.toggleClass("<html> <head> </head> <body> body </body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element20.wrap(" \n<body>\n</body>");
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.append("hi!");
        org.jsoup.nodes.Element element13 = document2.addClass("\n<body>\n</body>");
        org.jsoup.nodes.Node node15 = document2.removeAttr("hi! <#root> hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = node15.previousSibling();
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str10 = document9.tagName();
        document9.setBaseUri("");
        document9.setBaseUri("");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str18 = document17.tagName();
        document17.setBaseUri("");
        document17.setBaseUri("");
        org.jsoup.nodes.Element element24 = document17.appendText("#root");
        org.jsoup.nodes.Element element25 = document9.appendChild((org.jsoup.nodes.Node) document17);
        java.lang.String str26 = element25.baseUri();
        org.jsoup.nodes.Element element27 = document2.appendChild((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Element element29 = document2.prependText("hi!");
        org.jsoup.nodes.Element element31 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node32 = element31.previousSibling();
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        org.jsoup.select.Elements elements10 = element9.getAllElements();
        org.jsoup.nodes.Node node12 = element9.removeAttr("<html> \n<head> \n</head> \n<body>\n  hi!  hi!&lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = element9.text("hi! hi! #root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element9.previousElementSibling();
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n <head>\n </head>\n <body>\n  #root \n </body>\n</html><#root>\n #root\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root<#root>\n  <html>\n   <head>\n   </head>\n   <body>\n    hi! \n   </body>\n  </html><#root>\n   <html>\n    <head>\n    </head>\n    <body>\n     hi! \n    </body>\n   </html>#root\n  </#root>\n </#root>\n</#root>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;", "<html>\n <head>\n </head>\n <body>\n  #root \n </body>\n</html><#root>\n #root\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root<#root>\n  <html>\n   <head>\n   </head>\n   <body>\n    hi! \n   </body>\n  </html><#root>\n   <html>\n    <head>\n    </head>\n    <body>\n     hi! \n    </body>\n   </html>#root\n  </#root>\n </#root>\n</#root>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.lastElementSibling();
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n  <html> \n   <head> \n   </head> \n   <body>\n     hi!   #document \n   </body>\n  </html>\n </body>\n</html>\n</#root>\n<html> \n<head> \n</head> \n<body>  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements3 = document2.siblingElements();
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        org.jsoup.nodes.Node node6 = document2.childNode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document2.siblingNodes();
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.select.Elements elements9 = element6.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.nodes.Element element11 = element6.val("#root hi! #root hi! hi! #root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int12 = element6.siblingIndex();
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        org.jsoup.nodes.Node node19 = document2.removeAttr("#root");
        org.jsoup.nodes.Element element21 = document2.addClass("hi!");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node26 = document24.removeAttr("hi!");
        org.jsoup.nodes.Element element28 = document24.addClass("");
        org.jsoup.nodes.Element element29 = document2.prependChild((org.jsoup.nodes.Node) element28);
        java.lang.String str30 = element29.nodeName();
        org.jsoup.nodes.Element element32 = element29.appendText("#document");
        java.lang.String str33 = element29.baseUri();
        java.lang.Integer int34 = element29.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element35 = element29.previousElementSibling();
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        document2.setBaseUri("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        java.lang.Integer int5 = document2.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document2.siblingNodes();
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        org.jsoup.select.Elements elements11 = document2.getElementsByAttribute("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str15 = document14.tagName();
        document14.setBaseUri("");
        org.jsoup.select.Elements elements19 = document14.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.nodes.Element element20 = document2.appendChild((org.jsoup.nodes.Node) document14);
        java.lang.String str21 = document2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList22 = document2.siblingNodes();
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str10 = document9.tagName();
        document9.setBaseUri("");
        document9.setBaseUri("");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str18 = document17.tagName();
        document17.setBaseUri("");
        document17.setBaseUri("");
        org.jsoup.nodes.Element element24 = document17.appendText("#root");
        org.jsoup.nodes.Element element25 = document9.appendChild((org.jsoup.nodes.Node) document17);
        java.lang.String str26 = element25.baseUri();
        org.jsoup.nodes.Element element27 = document2.appendChild((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str31 = document30.tagName();
        document30.setBaseUri("");
        org.jsoup.nodes.Element element35 = document30.addClass("");
        org.jsoup.nodes.Element element37 = document30.toggleClass("");
        org.jsoup.nodes.Element element39 = element37.html("");
        org.jsoup.select.Elements elements42 = element37.getElementsByAttributeValue("hi! ", "#root");
        boolean boolean43 = document2.equals((java.lang.Object) elements42);
        java.lang.String str44 = document2.val();
        java.lang.String str45 = document2.toString();
        org.jsoup.nodes.Element element47 = document2.appendElement("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node48 = document2.previousSibling();
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        boolean boolean18 = document2.isBlock();
        org.jsoup.nodes.Element element20 = document2.addClass("#root");
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str24 = document23.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = document23.childNodes();
        boolean boolean27 = document23.hasAttr("#root");
        org.jsoup.parser.Tag tag28 = document23.tag();
        org.jsoup.nodes.Element element29 = element20.prependChild((org.jsoup.nodes.Node) document23);
        org.jsoup.nodes.Element element31 = element29.child(0);
        org.jsoup.select.Elements elements33 = element29.getElementsByIndexGreaterThan((int) (byte) 1);
        org.jsoup.nodes.Document document36 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str37 = document36.tagName();
        document36.setBaseUri("");
        document36.setBaseUri("");
        org.jsoup.nodes.Document document44 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str45 = document44.tagName();
        document44.setBaseUri("");
        document44.setBaseUri("");
        org.jsoup.nodes.Element element50 = document36.appendChild((org.jsoup.nodes.Node) document44);
        org.jsoup.nodes.Element element51 = document36.empty();
        org.jsoup.nodes.Node node53 = document36.removeAttr("#root");
        java.lang.String str54 = document36.outerHtml();
        org.jsoup.select.Elements elements56 = document36.getElementsByTag("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element57 = element29.appendChild((org.jsoup.nodes.Node) document36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element59 = document36.text("");
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.parser.Tag tag12 = document2.tag();
        org.jsoup.nodes.Element element14 = document2.addClass("");
        org.jsoup.select.Elements elements15 = element14.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element14.lastElementSibling();
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        java.lang.String str12 = element9.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element9.text("hi! #root hi!");
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document2.siblingNodes();
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean4 = document2.hasAttr("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        org.jsoup.nodes.Element element6 = document2.appendElement("<html> \n<head> \n</head> \n<body>\n  hi!  hi!&lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.nodes.Element element8 = document2.prepend("<html> <head> </head> <body> </body> </html> hi! hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element8.lastElementSibling();
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element17 = document10.appendText("#root");
        org.jsoup.nodes.Element element18 = document2.appendChild((org.jsoup.nodes.Node) document10);
        java.lang.String str19 = document10.className();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str23 = document22.tagName();
        document22.setBaseUri("");
        document22.setBaseUri("");
        org.jsoup.nodes.Element element29 = document22.appendText("#root");
        org.jsoup.nodes.Element element31 = document22.wrap("#root");
        document10.replaceWith((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Element element34 = document10.removeClass("hi!#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node35 = element34.previousSibling();
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str15 = document14.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = document14.childNodes();
        java.lang.Integer int17 = document14.elementSiblingIndex();
        org.jsoup.nodes.Element element20 = document14.attr("hi!", "#document");
        boolean boolean22 = element20.hasClass("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        element20.setBaseUri("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element26 = element20.toggleClass("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str30 = document29.tagName();
        document29.setBaseUri("");
        org.jsoup.nodes.Element element34 = document29.addClass("");
        org.jsoup.select.Elements elements35 = element34.parents();
        org.jsoup.select.Elements elements36 = element34.getAllElements();
        org.jsoup.nodes.Document document39 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str40 = document39.tagName();
        document39.setBaseUri("");
        org.jsoup.nodes.Element element44 = document39.addClass("");
        org.jsoup.nodes.Element element46 = document39.toggleClass("");
        org.jsoup.nodes.Element element48 = element46.html("");
        boolean boolean49 = element46.isBlock();
        java.lang.String[] strArray54 = new java.lang.String[] { "", "body", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        org.jsoup.nodes.Element element57 = element46.classNames((java.util.Set<java.lang.String>) strSet55);
        org.jsoup.nodes.Element element58 = element34.classNames((java.util.Set<java.lang.String>) strSet55);
        org.jsoup.nodes.Element element59 = element26.classNames((java.util.Set<java.lang.String>) strSet55);
        java.lang.String str60 = element26.outerHtml();
        org.jsoup.nodes.Element element61 = document2.prependChild((org.jsoup.nodes.Node) element26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList62 = element61.siblingNodes();
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("body", "#document");
        boolean boolean3 = document2.isBlock();
        org.jsoup.nodes.Element element5 = document2.toggleClass("#document");
        org.jsoup.nodes.Element element7 = element5.toggleClass("hi! #document");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node12 = document10.removeAttr("hi!");
        org.jsoup.nodes.Element element14 = document10.addClass("");
        org.jsoup.select.Elements elements16 = document10.getElementsByTag("#root");
        java.lang.String str17 = document10.tagName();
        org.jsoup.nodes.Element element19 = document10.toggleClass("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.jsoup.nodes.Element element21 = document10.addClass("<html>\n<head>\n</head>\n<body>\n body\n</body>\n</html>#root");
        boolean boolean22 = element5.equals((java.lang.Object) document10);
        org.jsoup.nodes.Document document25 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str26 = document25.tagName();
        document25.setBaseUri("");
        org.jsoup.nodes.Element element30 = document25.addClass("");
        org.jsoup.nodes.Element element32 = document25.toggleClass("");
        org.jsoup.nodes.Element element34 = document25.addClass("hi!");
        org.jsoup.parser.Tag tag35 = document25.tag();
        org.jsoup.nodes.Element element37 = document25.addClass("");
        org.jsoup.nodes.Element element39 = document25.prependElement("hi!");
        org.jsoup.parser.Tag tag40 = document25.tag();
        java.lang.String str41 = tag40.getName();
        org.jsoup.parser.Tag tag42 = tag40.getImplicitParent();
        java.lang.String str43 = tag40.toString();
        boolean boolean44 = tag40.isData();
        java.lang.String str45 = tag40.toString();
        boolean boolean46 = document10.equals((java.lang.Object) str45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int47 = document10.siblingIndex();
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValue("hi! ", "#root");
        org.jsoup.nodes.Element element16 = element9.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element19 = element9.attr("hi! #document", "#root");
        java.lang.String str20 = element9.baseUri();
        org.jsoup.nodes.Element element22 = element9.val(" hi! #document");
        org.jsoup.nodes.Element element24 = element22.html("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node25 = element24.nextSibling();
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element12 = document2.empty();
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str17 = document16.tagName();
        document16.setBaseUri("");
        org.jsoup.nodes.Element element21 = document16.addClass("");
        org.jsoup.select.Elements elements22 = element21.parents();
        org.jsoup.select.Elements elements23 = element21.getAllElements();
        org.jsoup.nodes.Element element24 = element12.prependChild((org.jsoup.nodes.Node) element21);
        boolean boolean25 = element12.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element12.wrap("\n<hi!>\n</hi!>");
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.parser.Tag tag12 = document2.tag();
        org.jsoup.nodes.Element element14 = document2.addClass("");
        org.jsoup.nodes.Element element16 = document2.prependElement("hi! ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document2.previousElementSibling();
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi! hi! #root", "<hi! #document>\n</hi! #document>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str3 = document2.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document2.lastElementSibling();
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.parser.Tag tag12 = document2.tag();
        org.jsoup.nodes.Element element14 = document2.addClass("");
        org.jsoup.nodes.Element element16 = document2.prependElement("hi!");
        org.jsoup.parser.Tag tag17 = document2.tag();
        org.jsoup.parser.Tag tag18 = tag17.getImplicitParent();
        java.lang.String str19 = tag18.getName();
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str22 = tag21.getName();
        org.jsoup.parser.Tag tag23 = tag21.getImplicitParent();
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node29 = document27.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = document27.childNodes();
        org.jsoup.nodes.Attributes attributes31 = document27.attributes();
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element(tag23, "#root", attributes31);
        java.lang.String str33 = tag23.getName();
        java.lang.String str34 = tag23.toString();
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.parser.Tag tag38 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str39 = tag38.getName();
        boolean boolean40 = tag38.isData();
        java.lang.String str41 = tag38.toString();
        boolean boolean42 = tag23.isValidParent(tag38);
        org.jsoup.parser.Tag tag43 = tag38.getImplicitParent();
        boolean boolean44 = tag18.canContain(tag43);
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag43, "<#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node47 = element46.previousSibling();
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str10 = document9.tagName();
        document9.setBaseUri("");
        document9.setBaseUri("");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str18 = document17.tagName();
        document17.setBaseUri("");
        document17.setBaseUri("");
        org.jsoup.nodes.Element element24 = document17.appendText("#root");
        org.jsoup.nodes.Element element25 = document9.appendChild((org.jsoup.nodes.Node) document17);
        java.lang.String str26 = element25.baseUri();
        org.jsoup.nodes.Element element27 = document2.appendChild((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str31 = document30.tagName();
        document30.setBaseUri("");
        org.jsoup.nodes.Element element35 = document30.addClass("");
        org.jsoup.nodes.Element element37 = document30.toggleClass("");
        org.jsoup.nodes.Element element39 = element37.html("");
        org.jsoup.select.Elements elements42 = element37.getElementsByAttributeValue("hi! ", "#root");
        boolean boolean43 = document2.equals((java.lang.Object) elements42);
        java.lang.String str44 = document2.val();
        java.lang.String str45 = document2.toString();
        org.jsoup.nodes.Element element47 = document2.appendElement("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.nodes.Element element49 = document2.prependText("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        java.lang.String str51 = element49.attr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node52 = element49.nextSibling();
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str19 = document18.tagName();
        document18.setBaseUri("");
        document18.setBaseUri("");
        org.jsoup.nodes.Element element25 = document18.appendText("#root");
        org.jsoup.nodes.Element element26 = document10.appendChild((org.jsoup.nodes.Node) document18);
        boolean boolean27 = tag7.equals((java.lang.Object) element26);
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str30 = tag29.getName();
        org.jsoup.parser.Tag tag31 = tag29.getImplicitParent();
        boolean boolean32 = tag7.canContain(tag31);
        boolean boolean33 = tag31.isBlock();
        org.jsoup.nodes.Document document36 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str37 = document36.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList38 = document36.childNodes();
        boolean boolean40 = document36.hasAttr("#root");
        org.jsoup.parser.Tag tag41 = document36.tag();
        java.lang.String str42 = tag41.toString();
        org.jsoup.parser.Tag tag44 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str45 = tag44.getName();
        org.jsoup.parser.Tag tag46 = tag44.getImplicitParent();
        boolean boolean47 = tag44.isEmpty();
        java.lang.String str48 = tag44.toString();
        boolean boolean49 = tag41.isValidParent(tag44);
        boolean boolean50 = tag31.isValidParent(tag41);
        org.jsoup.nodes.Document document54 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str55 = document54.tagName();
        document54.setBaseUri("");
        org.jsoup.nodes.Element element59 = document54.addClass("");
        org.jsoup.nodes.Element element61 = document54.toggleClass("");
        org.jsoup.nodes.Element element63 = element61.html("");
        boolean boolean64 = element61.isBlock();
        org.jsoup.nodes.Attributes attributes65 = element61.attributes();
        org.jsoup.nodes.Element element66 = new org.jsoup.nodes.Element(tag31, "<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", attributes65);
        org.jsoup.nodes.Element element68 = element66.prepend("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! #document");
        boolean boolean69 = element68.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element70 = element68.firstElementSibling();
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.select.Elements elements8 = element7.parents();
        org.jsoup.select.Elements elements9 = element7.getAllElements();
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str13 = document12.tagName();
        document12.setBaseUri("");
        org.jsoup.nodes.Element element17 = document12.addClass("");
        org.jsoup.nodes.Element element19 = document12.toggleClass("");
        org.jsoup.nodes.Element element21 = element19.html("");
        boolean boolean22 = element19.isBlock();
        java.lang.String[] strArray27 = new java.lang.String[] { "", "body", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        org.jsoup.nodes.Element element30 = element19.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Element element31 = element7.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Element element33 = element31.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element34 = element31.empty();
        java.lang.Integer int35 = element34.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int36 = element34.siblingIndex();
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements8 = document2.parents();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements9 = document2.siblingElements();
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        java.lang.String str9 = document2.attr("#root");
        org.jsoup.nodes.Element element11 = document2.text("");
        boolean boolean12 = document2.isBlock();
        org.jsoup.nodes.Element element14 = document2.text("hi! ");
        org.jsoup.nodes.Element element15 = element14.empty();
        boolean boolean17 = element15.hasClass("<#root>\n<html>\n <head>\n </head>\n <body>\n  body \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = element15.previousSibling();
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element element4 = document2.child(0);
        org.jsoup.nodes.Element element5 = element4.parent();
        org.jsoup.nodes.Element element7 = element5.append("hi! #document");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element7.childNodes();
        org.jsoup.nodes.Element element10 = element7.addClass("hi! hi! #root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = element7.previousSibling();
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.append("hi!");
        java.lang.String str12 = element11.val();
        org.jsoup.nodes.Element element13 = element11.empty();
        org.jsoup.nodes.Element element15 = element13.wrap("hi! #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element13.lastElementSibling();
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        boolean boolean18 = document2.isBlock();
        org.jsoup.nodes.Element element20 = document2.addClass("#root");
        org.jsoup.select.Elements elements23 = element20.getElementsByAttributeValueNot("#root", "body");
        org.jsoup.nodes.Element element25 = element20.prependText("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.select.Elements elements28 = element25.getElementsByAttributeValueStarting("body", "hi! ");
        org.jsoup.nodes.Element element30 = element25.prependText("hi! <#root> hi!");
        org.jsoup.select.Elements elements32 = element30.getElementsByIndexLessThan((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements33 = element30.siblingElements();
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test706");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("body", "body");
        org.jsoup.nodes.Element element7 = document2.val("#document");
        java.lang.String str8 = element7.className();
        org.jsoup.nodes.Element element10 = element7.prependElement("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element7.siblingNodes();
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test707");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        org.jsoup.nodes.Element element5 = document2.appendText("#document");
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueContaining("hi!", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = element5.removeClass("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Element element12 = element10.prepend("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element10.previousElementSibling();
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test708");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        java.lang.String str8 = document2.attr("#root");
        java.lang.String str9 = document2.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = document2.nextSibling();
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test709");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element12 = document2.empty();
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str17 = document16.tagName();
        document16.setBaseUri("");
        org.jsoup.nodes.Element element21 = document16.addClass("");
        org.jsoup.select.Elements elements22 = element21.parents();
        org.jsoup.select.Elements elements23 = element21.getAllElements();
        org.jsoup.nodes.Element element24 = element12.prependChild((org.jsoup.nodes.Node) element21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element24.lastElementSibling();
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test710");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str2 = tag1.getName();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node9 = document7.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document7.childNodes();
        org.jsoup.nodes.Attributes attributes11 = document7.attributes();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag3, "#root", attributes11);
        org.jsoup.select.Elements elements15 = element12.getElementsByAttributeValueStarting("#document", "hi! #document");
        java.lang.String str16 = element12.baseUri();
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str20 = document19.tagName();
        document19.setBaseUri("");
        org.jsoup.nodes.Element element24 = document19.addClass("");
        org.jsoup.nodes.Element element26 = document19.toggleClass("");
        org.jsoup.nodes.Element element28 = element26.html("");
        boolean boolean29 = element26.isBlock();
        java.lang.String[] strArray34 = new java.lang.String[] { "", "body", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        org.jsoup.nodes.Element element37 = element26.classNames((java.util.Set<java.lang.String>) strSet35);
        org.jsoup.nodes.Element element38 = element12.classNames((java.util.Set<java.lang.String>) strSet35);
        org.jsoup.nodes.Element element40 = element12.text("\n<body>\n</body>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int41 = element12.siblingIndex();
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test711");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean4 = document2.hasAttr("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        java.lang.String str5 = document2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = document2.nextSibling();
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test712");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        boolean boolean18 = document2.isBlock();
        org.jsoup.nodes.Element element20 = document2.addClass("#root");
        org.jsoup.select.Elements elements23 = element20.getElementsByAttributeValueNot("#root", "body");
        org.jsoup.nodes.Element element25 = element20.removeClass("body");
        org.jsoup.select.Elements elements27 = element25.getElementsByIndexGreaterThan(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element25.nextElementSibling();
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test713");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element9 = document2.appendText("hi! ");
        java.lang.String str10 = element9.html();
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node15 = document13.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = document13.childNodes();
        org.jsoup.nodes.Attributes attributes17 = document13.attributes();
        java.lang.String str19 = document13.attr("#root");
        org.jsoup.select.Elements elements22 = document13.getElementsByAttributeValueEnding("#root", "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.nodes.Element element23 = element9.appendChild((org.jsoup.nodes.Node) document13);
        org.jsoup.nodes.Node node25 = element23.removeAttr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str29 = document28.tagName();
        document28.setBaseUri("");
        org.jsoup.nodes.Element element33 = document28.addClass("");
        org.jsoup.nodes.Element element35 = document28.toggleClass("");
        org.jsoup.nodes.Element element37 = document28.addClass("hi!");
        org.jsoup.parser.Tag tag38 = document28.tag();
        org.jsoup.nodes.Element element40 = document28.addClass("");
        org.jsoup.nodes.Element element42 = document28.prependElement("hi!");
        org.jsoup.parser.Tag tag43 = document28.tag();
        org.jsoup.select.Elements elements45 = document28.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean47 = document28.equals((java.lang.Object) (short) 1);
        java.lang.String str48 = document28.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList49 = document28.childNodes();
        boolean boolean50 = element23.equals((java.lang.Object) document28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node51 = element23.previousSibling();
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test714");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.html("hi! ");
        org.jsoup.select.Elements elements12 = element10.getElementsByAttribute("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.select.Elements elements13 = element10.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element10.lastElementSibling();
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test715");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        document2.setBaseUri("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        java.lang.Integer int5 = document2.elementSiblingIndex();
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals((int) 'a');
        org.jsoup.select.Elements elements10 = document2.getElementsByAttributeValueContaining("<html> <head> </head> <body> hi! </body> </html>#root #root #root hi! #root hi! hi! #root<html> <head> </head> <body> hi! </body> </html>", "hi! #document\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int11 = document2.siblingIndex();
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test716");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.parser.Tag tag12 = document2.tag();
        org.jsoup.nodes.Element element14 = document2.addClass("");
        org.jsoup.nodes.Element element16 = document2.prependElement("hi!");
        org.jsoup.parser.Tag tag17 = document2.tag();
        org.jsoup.select.Elements elements19 = document2.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean21 = document2.equals((java.lang.Object) (short) 1);
        org.jsoup.select.Elements elements23 = document2.getElementsByClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element25 = document2.prepend("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>hi! hi!body#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = document2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList27 = document2.siblingNodes();
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test717");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.select.Elements elements9 = element6.getElementsByIndexGreaterThan((int) '4');
        boolean boolean11 = element6.hasAttr("hi! #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = element6.previousSibling();
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test718");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        org.jsoup.nodes.Node node6 = document2.childNode(0);
        org.jsoup.nodes.Element element8 = document2.val("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.attr("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
        org.jsoup.nodes.Element element13 = element11.val("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n   <html> \n    <head> \n    </head> \n    <body>\n      hi! #document    \n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element13.wrap("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test719");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        boolean boolean12 = element9.isBlock();
        org.jsoup.nodes.Attributes attributes13 = element9.attributes();
        java.lang.String str14 = element9.baseUri();
        boolean boolean16 = element9.hasAttr("hi! #document");
        org.jsoup.nodes.Element element18 = element9.addClass("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = element9.previousSibling();
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test720");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        org.jsoup.nodes.Node node6 = document2.childNode(0);
        org.jsoup.nodes.Element element8 = document2.val("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.attr("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
        org.jsoup.select.Elements elements14 = element11.getElementsByAttributeValueStarting("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = element11.previousSibling();
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test721");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.parser.Tag tag12 = document2.tag();
        org.jsoup.nodes.Element element14 = document2.addClass("");
        org.jsoup.nodes.Element element16 = document2.prependElement("hi!");
        org.jsoup.parser.Tag tag17 = document2.tag();
        org.jsoup.parser.Tag tag18 = tag17.getImplicitParent();
        java.lang.String str19 = tag18.getName();
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str22 = tag21.getName();
        org.jsoup.parser.Tag tag23 = tag21.getImplicitParent();
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node29 = document27.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = document27.childNodes();
        org.jsoup.nodes.Attributes attributes31 = document27.attributes();
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element(tag23, "#root", attributes31);
        java.lang.String str33 = tag23.getName();
        java.lang.String str34 = tag23.toString();
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.parser.Tag tag38 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str39 = tag38.getName();
        boolean boolean40 = tag38.isData();
        java.lang.String str41 = tag38.toString();
        boolean boolean42 = tag23.isValidParent(tag38);
        org.jsoup.parser.Tag tag43 = tag38.getImplicitParent();
        boolean boolean44 = tag18.canContain(tag43);
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag43, "<#root>\n</#root>");
        org.jsoup.nodes.Element element47 = element46.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node48 = element47.previousSibling();
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test722");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.append("hi!");
        java.lang.String str12 = element11.val();
        org.jsoup.nodes.Element element14 = element11.html("hi! #document");
        org.jsoup.nodes.Element element16 = element11.appendText("hi!#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = element11.nextSibling();
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test723");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.parser.Tag tag12 = document2.tag();
        org.jsoup.nodes.Element element14 = document2.addClass("");
        org.jsoup.nodes.Element element16 = document2.prependElement("hi!");
        org.jsoup.parser.Tag tag17 = document2.tag();
        org.jsoup.select.Elements elements19 = document2.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean21 = document2.equals((java.lang.Object) (short) 1);
        java.lang.String str22 = document2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = document2.childNodes();
        org.jsoup.nodes.Element element25 = document2.prepend("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node26 = element25.previousSibling();
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test724");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element17 = document10.appendText("#root");
        org.jsoup.nodes.Element element18 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.select.Elements elements20 = element18.getElementsByClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element22 = element18.prepend("hi! #document<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element18.firstElementSibling();
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test725");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        boolean boolean18 = document2.hasText();
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str22 = document21.tagName();
        document21.setBaseUri("");
        org.jsoup.nodes.Element element26 = document21.addClass("");
        org.jsoup.select.Elements elements27 = element26.parents();
        org.jsoup.select.Elements elements28 = element26.getAllElements();
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str32 = document31.tagName();
        document31.setBaseUri("");
        org.jsoup.nodes.Element element36 = document31.addClass("");
        org.jsoup.nodes.Element element38 = document31.toggleClass("");
        org.jsoup.nodes.Element element40 = element38.html("");
        boolean boolean41 = element38.isBlock();
        java.lang.String[] strArray46 = new java.lang.String[] { "", "body", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        org.jsoup.nodes.Element element49 = element38.classNames((java.util.Set<java.lang.String>) strSet47);
        org.jsoup.nodes.Element element50 = element26.classNames((java.util.Set<java.lang.String>) strSet47);
        org.jsoup.nodes.Element element51 = document2.classNames((java.util.Set<java.lang.String>) strSet47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element52 = element51.nextElementSibling();
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test726");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList5 = node4.siblingNodes();
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test727");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.parser.Tag tag12 = document2.tag();
        org.jsoup.nodes.Element element14 = document2.addClass("");
        org.jsoup.parser.Tag tag15 = element14.tag();
        org.jsoup.nodes.Element element16 = element14.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element14.firstElementSibling();
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test728");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        org.jsoup.select.Elements elements9 = document2.getElementsByIndexLessThan((int) ' ');
        org.jsoup.parser.Tag tag10 = document2.tag();
        org.jsoup.nodes.Element element12 = document2.val("<#root>\n</#root>");
        org.jsoup.nodes.Node node14 = document2.removeAttr("\n<body class=\" body hi!\">\n</body>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = node14.nextSibling();
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test729");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        java.util.Set<java.lang.String> strSet17 = element16.classNames();
        org.jsoup.nodes.Element element18 = element16.empty();
        java.util.Set<java.lang.String> strSet19 = element18.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element18.wrap("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi! <#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>hi!");
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test730");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.select.Elements elements8 = element7.parents();
        org.jsoup.select.Elements elements9 = element7.getAllElements();
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str13 = document12.tagName();
        document12.setBaseUri("");
        org.jsoup.nodes.Element element17 = document12.addClass("");
        org.jsoup.nodes.Element element19 = document12.toggleClass("");
        org.jsoup.nodes.Element element21 = element19.html("");
        boolean boolean22 = element19.isBlock();
        java.lang.String[] strArray27 = new java.lang.String[] { "", "body", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        org.jsoup.nodes.Element element30 = element19.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Element element31 = element7.classNames((java.util.Set<java.lang.String>) strSet28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element32 = element31.nextElementSibling();
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test731");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        java.lang.String str17 = element16.val();
        org.jsoup.nodes.Attributes attributes18 = element16.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element16.lastElementSibling();
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test732");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan((int) '#');
        java.lang.String str11 = document2.val();
        boolean boolean12 = document2.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.siblingNodes();
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test733");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.removeClass("hi! ");
        org.jsoup.select.Elements elements13 = document2.getElementsByAttributeValueContaining("hi! #document<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "\n<&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>\n</&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int14 = document2.siblingIndex();
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test734");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element10 = document2.val("#document");
        org.jsoup.parser.Tag tag11 = document2.tag();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element16 = document14.appendText("#root");
        org.jsoup.nodes.Element element18 = document14.prepend("#root");
        org.jsoup.nodes.Element element20 = document14.appendText("hi!");
        org.jsoup.select.Elements elements22 = element20.getElementsByAttribute("body");
        boolean boolean23 = tag11.equals((java.lang.Object) element20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = element20.previousElementSibling();
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test735");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        java.lang.String str8 = document2.attr("#root");
        java.lang.String str10 = document2.absUrl("hi! ");
        org.jsoup.nodes.Element element12 = document2.val("hi! #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document2.nextElementSibling();
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test736");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        boolean boolean12 = element9.isBlock();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "body", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        org.jsoup.nodes.Element element20 = element9.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str24 = document23.tagName();
        document23.setBaseUri("");
        document23.setBaseUri("");
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str32 = document31.tagName();
        document31.setBaseUri("");
        document31.setBaseUri("");
        org.jsoup.nodes.Element element37 = document23.appendChild((org.jsoup.nodes.Node) document31);
        org.jsoup.nodes.Element element38 = document23.empty();
        org.jsoup.nodes.Node node40 = document23.removeAttr("#root");
        org.jsoup.nodes.Element element42 = document23.addClass("hi!");
        org.jsoup.nodes.Document document45 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node47 = document45.removeAttr("hi!");
        org.jsoup.nodes.Element element49 = document45.addClass("");
        org.jsoup.nodes.Element element50 = document23.prependChild((org.jsoup.nodes.Node) element49);
        java.lang.String str51 = element50.nodeName();
        org.jsoup.nodes.Element element53 = element50.appendText("#document");
        org.jsoup.nodes.Element element54 = element9.prependChild((org.jsoup.nodes.Node) element50);
        java.lang.String str55 = element54.toString();
        org.jsoup.select.Elements elements56 = element54.getAllElements();
        org.jsoup.nodes.Element element58 = element54.html("hi! ");
        org.jsoup.select.Elements elements61 = element54.getElementsByAttributeValue("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document");
        java.lang.String str62 = element54.toString();
        org.jsoup.nodes.Element element63 = element54.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element64 = element63.lastElementSibling();
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test737");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "body");
        org.jsoup.nodes.Element element4 = document2.text("#roothi!");
        org.jsoup.nodes.Element element6 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root><hi> \n</hi> \n<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = element6.nextSibling();
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test738");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str2 = tag1.getName();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node9 = document7.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document7.childNodes();
        org.jsoup.nodes.Attributes attributes11 = document7.attributes();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag3, "#root", attributes11);
        java.lang.String str13 = tag3.getName();
        java.lang.String str14 = tag3.toString();
        boolean boolean15 = tag3.isInline();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag3, "<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes18 = element17.attributes();
        java.lang.String str19 = element17.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element17.nextElementSibling();
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test739");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        org.jsoup.nodes.Node node19 = document2.removeAttr("#root");
        org.jsoup.nodes.Element element21 = document2.addClass("hi!");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node26 = document24.removeAttr("hi!");
        org.jsoup.nodes.Element element28 = document24.addClass("");
        org.jsoup.nodes.Element element29 = document2.prependChild((org.jsoup.nodes.Node) element28);
        java.lang.String str30 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = document2.childNodes();
        org.jsoup.nodes.Element element33 = document2.getElementById("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.select.Elements elements36 = document2.getElementsByAttributeValueEnding("hi!", "hi! ");
        org.jsoup.nodes.Document document39 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str40 = document39.tagName();
        org.jsoup.nodes.Element element42 = document39.appendText("#document");
        org.jsoup.select.Elements elements45 = element42.getElementsByAttributeValueContaining("hi!", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element47 = element42.removeClass("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Element element49 = element47.prepend("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements51 = element47.getElementsByClass("\n<hi!>\n</hi!>");
        org.jsoup.nodes.Element element52 = document2.appendChild((org.jsoup.nodes.Node) element47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node53 = element52.previousSibling();
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test740");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element10 = document2.child((int) (short) 0);
        boolean boolean11 = document2.hasText();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element16 = document14.appendText("#root");
        org.jsoup.nodes.Element element18 = document14.prepend("#root");
        org.jsoup.nodes.Element element19 = element18.empty();
        org.jsoup.select.Elements elements21 = element18.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.nodes.Element element22 = document2.prependChild((org.jsoup.nodes.Node) element18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = element18.text("<html> \n<head> \n</head> \n<body>\n  &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi! #document    \n  </body>\n </html>\n</body>\n</html><<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>>");
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test741");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        boolean boolean12 = element9.isBlock();
        org.jsoup.nodes.Attributes attributes13 = element9.attributes();
        org.jsoup.select.Elements elements16 = element9.getElementsByAttributeValueEnding("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi! ");
        org.jsoup.nodes.Element element18 = element9.prependElement("hi! #document");
        org.jsoup.nodes.Element element20 = element9.addClass("");
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str24 = document23.tagName();
        document23.setBaseUri("");
        document23.setBaseUri("");
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str32 = document31.tagName();
        document31.setBaseUri("");
        document31.setBaseUri("");
        org.jsoup.nodes.Element element38 = document31.appendText("#root");
        org.jsoup.nodes.Element element39 = document23.appendChild((org.jsoup.nodes.Node) document31);
        java.lang.String str40 = document31.className();
        org.jsoup.nodes.Document document43 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str44 = document43.tagName();
        document43.setBaseUri("");
        document43.setBaseUri("");
        org.jsoup.nodes.Element element50 = document43.appendText("#root");
        org.jsoup.nodes.Element element52 = document43.wrap("#root");
        document31.replaceWith((org.jsoup.nodes.Node) document43);
        java.util.Set<java.lang.String> strSet54 = document31.classNames();
        org.jsoup.nodes.Element element55 = element20.classNames(strSet54);
        org.jsoup.select.Elements elements56 = element55.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element58 = element55.text("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html><#root>\n#root\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>#root<#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html><#root>\n  <html>\n   <head>\n   </head>\n   <body>\n    hi! \n   </body>\n  </html>#root\n </#root>\n</#root>\n</#root>");
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test742");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str2 = tag1.getName();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node9 = document7.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document7.childNodes();
        org.jsoup.nodes.Attributes attributes11 = document7.attributes();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag3, "#root", attributes11);
        org.jsoup.nodes.Element element14 = element12.prependText("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element12.childNodes();
        boolean boolean17 = element12.hasClass("");
        org.jsoup.nodes.Element element19 = element12.prependText("");
        java.lang.Integer int20 = element19.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element19.previousElementSibling();
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test743");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexLessThan((int) (byte) 100);
        org.jsoup.nodes.Element element6 = document2.appendText("hi!");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str10 = document9.tagName();
        document9.setBaseUri("");
        document9.setBaseUri("");
        java.lang.String str16 = document9.attr("#root");
        org.jsoup.nodes.Element element17 = element6.appendChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Element element19 = element17.removeClass("body");
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node24 = document22.removeAttr("hi!");
        org.jsoup.nodes.Element element26 = document22.addClass("");
        org.jsoup.select.Elements elements28 = document22.getElementsByTag("#root");
        document22.setBaseUri("body");
        org.jsoup.nodes.Element element31 = element17.appendChild((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Element element33 = element17.html("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        java.lang.String str34 = element33.html();
        boolean boolean36 = element33.hasClass("hi! <#root> hi!<html> <head> </head> <body> hi! </body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element37 = element33.firstElementSibling();
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test744");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        java.lang.Integer int5 = document2.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = document2.attr("hi!", "#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document2.siblingNodes();
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test745");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsByAttribute("body");
        org.jsoup.nodes.Element element12 = element8.appendElement("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        java.lang.String str13 = element8.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element8.previousElementSibling();
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test746");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str2 = tag1.getName();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node9 = document7.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document7.childNodes();
        org.jsoup.nodes.Attributes attributes11 = document7.attributes();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag3, "#root", attributes11);
        org.jsoup.select.Elements elements15 = element12.getElementsByAttributeValueStarting("#document", "hi! #document");
        java.lang.String str16 = element12.baseUri();
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str20 = document19.tagName();
        document19.setBaseUri("");
        org.jsoup.nodes.Element element24 = document19.addClass("");
        org.jsoup.nodes.Element element26 = document19.toggleClass("");
        org.jsoup.nodes.Element element28 = element26.html("");
        boolean boolean29 = element26.isBlock();
        java.lang.String[] strArray34 = new java.lang.String[] { "", "body", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        org.jsoup.nodes.Element element37 = element26.classNames((java.util.Set<java.lang.String>) strSet35);
        org.jsoup.nodes.Element element38 = element12.classNames((java.util.Set<java.lang.String>) strSet35);
        org.jsoup.nodes.Element element40 = element38.addClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int41 = element38.siblingIndex();
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test747");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element12 = element9.attr("hi! #document", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String[] strArray15 = new java.lang.String[] { "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element12.classNames((java.util.Set<java.lang.String>) strSet16);
        java.lang.String str19 = element12.text();
        java.lang.String str20 = element12.tagName();
        org.jsoup.nodes.Element element21 = element12.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = element21.previousSibling();
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test748");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str19 = document18.tagName();
        document18.setBaseUri("");
        document18.setBaseUri("");
        org.jsoup.nodes.Element element25 = document18.appendText("#root");
        org.jsoup.nodes.Element element26 = document10.appendChild((org.jsoup.nodes.Node) document18);
        boolean boolean27 = tag7.equals((java.lang.Object) element26);
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str30 = tag29.getName();
        org.jsoup.parser.Tag tag31 = tag29.getImplicitParent();
        boolean boolean32 = tag7.canContain(tag31);
        boolean boolean33 = tag31.isBlock();
        org.jsoup.nodes.Document document36 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str37 = document36.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList38 = document36.childNodes();
        boolean boolean40 = document36.hasAttr("#root");
        org.jsoup.parser.Tag tag41 = document36.tag();
        java.lang.String str42 = tag41.toString();
        org.jsoup.parser.Tag tag44 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str45 = tag44.getName();
        org.jsoup.parser.Tag tag46 = tag44.getImplicitParent();
        boolean boolean47 = tag44.isEmpty();
        java.lang.String str48 = tag44.toString();
        boolean boolean49 = tag41.isValidParent(tag44);
        boolean boolean50 = tag31.isValidParent(tag41);
        org.jsoup.nodes.Document document54 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str55 = document54.tagName();
        document54.setBaseUri("");
        org.jsoup.nodes.Element element59 = document54.addClass("");
        org.jsoup.nodes.Element element61 = document54.toggleClass("");
        org.jsoup.nodes.Element element63 = element61.html("");
        boolean boolean64 = element61.isBlock();
        org.jsoup.nodes.Attributes attributes65 = element61.attributes();
        org.jsoup.nodes.Element element66 = new org.jsoup.nodes.Element(tag31, "<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", attributes65);
        org.jsoup.nodes.Element element68 = element66.prepend("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! #document");
        org.jsoup.nodes.Element element70 = element68.val("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root");
        org.jsoup.nodes.Document document73 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str74 = document73.tagName();
        document73.setBaseUri("");
        org.jsoup.nodes.Element element78 = document73.addClass("");
        org.jsoup.nodes.Element element80 = document73.toggleClass("");
        org.jsoup.nodes.Element element82 = document73.addClass("hi!");
        org.jsoup.parser.Tag tag83 = document73.tag();
        org.jsoup.nodes.Element element85 = document73.addClass("");
        org.jsoup.nodes.Element element87 = document73.prependElement("hi!");
        org.jsoup.parser.Tag tag88 = document73.tag();
        org.jsoup.select.Elements elements90 = document73.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element93 = document73.attr("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "#root");
        org.jsoup.nodes.Element element94 = document73.parent();
        org.jsoup.nodes.Element element96 = document73.prepend("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element97 = element68.appendChild((org.jsoup.nodes.Node) document73);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node98 = element97.previousSibling();
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test749");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        boolean boolean18 = document2.isBlock();
        org.jsoup.nodes.Element element20 = document2.addClass("#root");
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str24 = document23.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = document23.childNodes();
        boolean boolean27 = document23.hasAttr("#root");
        org.jsoup.parser.Tag tag28 = document23.tag();
        org.jsoup.nodes.Element element29 = element20.prependChild((org.jsoup.nodes.Node) document23);
        org.jsoup.nodes.Element element31 = element29.child(0);
        org.jsoup.select.Elements elements33 = element29.getElementsByIndexGreaterThan((int) (byte) 1);
        org.jsoup.nodes.Document document36 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str37 = document36.tagName();
        document36.setBaseUri("");
        document36.setBaseUri("");
        org.jsoup.nodes.Document document44 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str45 = document44.tagName();
        document44.setBaseUri("");
        document44.setBaseUri("");
        org.jsoup.nodes.Element element50 = document36.appendChild((org.jsoup.nodes.Node) document44);
        org.jsoup.nodes.Element element51 = document36.empty();
        org.jsoup.nodes.Node node53 = document36.removeAttr("#root");
        java.lang.String str54 = document36.outerHtml();
        org.jsoup.select.Elements elements56 = document36.getElementsByTag("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element57 = element29.appendChild((org.jsoup.nodes.Node) document36);
        java.lang.String str58 = element29.id();
        org.jsoup.nodes.Element element61 = element29.attr("<#root>\n<html>\n <head>\n </head>\n <body>\n  body \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi! <#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList62 = element29.siblingNodes();
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test750");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        org.jsoup.nodes.Node node19 = document2.removeAttr("#root");
        org.jsoup.nodes.Element element21 = document2.addClass("hi!");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node26 = document24.removeAttr("hi!");
        org.jsoup.nodes.Element element28 = document24.addClass("");
        org.jsoup.nodes.Element element29 = document2.prependChild((org.jsoup.nodes.Node) element28);
        org.jsoup.nodes.Element element31 = element29.prependText("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str32 = element29.outerHtml();
        org.jsoup.nodes.Attributes attributes33 = element29.attributes();
        org.jsoup.nodes.Document document36 = org.jsoup.parser.Parser.parseBodyFragment("body", "");
        org.jsoup.select.Elements elements38 = document36.getElementsByIndexLessThan(1);
        boolean boolean39 = element29.equals((java.lang.Object) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element40 = element29.previousElementSibling();
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test751");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.nodes.Element element9 = document2.text("");
        org.jsoup.nodes.Attributes attributes10 = document2.attributes();
        org.jsoup.nodes.Element element13 = document2.attr("#document", "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = element13.nextSibling();
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test752");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.parser.Tag tag12 = document2.tag();
        org.jsoup.nodes.Element element14 = document2.addClass("");
        org.jsoup.nodes.Element element16 = document2.prependElement("hi! ");
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str20 = document19.tagName();
        document19.setBaseUri("");
        org.jsoup.nodes.Element element24 = document19.addClass("");
        org.jsoup.nodes.Element element26 = document19.toggleClass("");
        org.jsoup.nodes.Element element28 = element26.html("");
        org.jsoup.select.Elements elements31 = element26.getElementsByAttributeValue("hi! ", "#root");
        org.jsoup.nodes.Element element33 = element26.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element35 = element26.text(" hi! #document");
        org.jsoup.nodes.Element element37 = element35.append("html");
        org.jsoup.nodes.Document document40 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str41 = document40.tagName();
        document40.setBaseUri("");
        org.jsoup.nodes.Element element45 = document40.addClass("");
        org.jsoup.nodes.Element element47 = document40.toggleClass("");
        org.jsoup.nodes.Element element49 = element47.html("");
        boolean boolean50 = element47.isBlock();
        org.jsoup.nodes.Attributes attributes51 = element47.attributes();
        org.jsoup.select.Elements elements54 = element47.getElementsByAttributeValueEnding("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi! ");
        org.jsoup.nodes.Element element56 = element47.prependElement("hi! #document");
        org.jsoup.nodes.Element element57 = element35.prependChild((org.jsoup.nodes.Node) element47);
        boolean boolean58 = document2.equals((java.lang.Object) element47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element59 = document2.previousElementSibling();
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test753");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("\n<body>\n</body>", "body");
        org.jsoup.nodes.Element element4 = document2.appendElement("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document2.previousElementSibling();
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test754");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.prepend("body");
        org.jsoup.nodes.Element element11 = element10.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int12 = element11.siblingIndex();
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test755");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        java.lang.String str8 = document2.attr("#root");
        java.lang.String str10 = document2.absUrl("hi! ");
        org.jsoup.nodes.Element element12 = document2.val("hi! #document");
        java.lang.String str13 = document2.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int14 = document2.siblingIndex();
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test756");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        java.lang.String str9 = document2.attr("#root");
        document2.setBaseUri("hi! #document");
        org.jsoup.select.Elements elements13 = document2.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.select.Elements elements15 = document2.getElementsByTag("hi! ");
        org.jsoup.nodes.Element element17 = document2.prependText("<html>\n<head>\n</head>\n<body>\n &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   #document \n  </body>\n </html>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int18 = element17.siblingIndex();
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test757");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexLessThan((int) (byte) 100);
        org.jsoup.nodes.Element element6 = document2.appendText("hi!");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str10 = document9.tagName();
        document9.setBaseUri("");
        document9.setBaseUri("");
        java.lang.String str16 = document9.attr("#root");
        org.jsoup.nodes.Element element17 = element6.appendChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Element element19 = element17.removeClass("body");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element19.nextElementSibling();
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test758");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        document2.setBaseUri("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element element16 = document14.child(0);
        java.util.Set<java.lang.String> strSet17 = element16.classNames();
        org.jsoup.nodes.Element element18 = document2.classNames(strSet17);
        org.jsoup.nodes.Element element21 = document2.attr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi!");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node26 = document24.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = document24.childNodes();
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str31 = document30.tagName();
        document30.setBaseUri("");
        document30.setBaseUri("");
        org.jsoup.nodes.Element element37 = document30.appendText("#root");
        document30.setBaseUri("");
        org.jsoup.nodes.Element element40 = document30.empty();
        org.jsoup.nodes.Element element41 = element40.empty();
        org.jsoup.nodes.Element element42 = document24.appendChild((org.jsoup.nodes.Node) element40);
        org.jsoup.select.Elements elements45 = document24.getElementsByAttributeValueStarting("hi! ", "#document");
        java.lang.Integer int46 = document24.elementSiblingIndex();
        org.jsoup.nodes.Element element47 = document2.appendChild((org.jsoup.nodes.Node) document24);
        org.jsoup.nodes.Document document50 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str51 = document50.tagName();
        document50.setBaseUri("");
        document50.setBaseUri("");
        org.jsoup.nodes.Element element57 = document50.appendText("#root");
        document50.setBaseUri("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Document document62 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element element64 = document62.child(0);
        java.util.Set<java.lang.String> strSet65 = element64.classNames();
        org.jsoup.nodes.Element element66 = document50.classNames(strSet65);
        org.jsoup.nodes.Element element67 = element47.classNames(strSet65);
        java.lang.String str69 = element47.absUrl("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element70 = element47.lastElementSibling();
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test759");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        org.jsoup.nodes.Node node6 = document2.childNode(0);
        boolean boolean8 = document2.hasClass("#root");
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str12 = document11.tagName();
        document11.setBaseUri("");
        document11.setBaseUri("");
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str20 = document19.tagName();
        document19.setBaseUri("");
        document19.setBaseUri("");
        org.jsoup.nodes.Element element26 = document19.appendText("#root");
        org.jsoup.nodes.Element element27 = document11.appendChild((org.jsoup.nodes.Node) document19);
        org.jsoup.select.Elements elements28 = element27.parents();
        boolean boolean29 = document2.equals((java.lang.Object) element27);
        boolean boolean31 = element27.hasClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element32 = element27.previousElementSibling();
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test760");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        org.jsoup.nodes.Node node19 = document2.removeAttr("#root");
        org.jsoup.nodes.Element element21 = document2.addClass("hi!");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node26 = document24.removeAttr("hi!");
        org.jsoup.nodes.Element element28 = document24.addClass("");
        org.jsoup.nodes.Element element29 = document2.prependChild((org.jsoup.nodes.Node) element28);
        java.lang.String str30 = element29.nodeName();
        org.jsoup.nodes.Element element32 = element29.appendText("#document");
        java.lang.String str33 = element29.baseUri();
        java.lang.Integer int34 = element29.elementSiblingIndex();
        org.jsoup.nodes.Document document37 = org.jsoup.parser.Parser.parse("#root", "hi!");
        java.util.Set<java.lang.String> strSet38 = document37.classNames();
        org.jsoup.nodes.Element element39 = element29.classNames(strSet38);
        org.jsoup.nodes.Element element42 = element29.attr("hi!", "<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.util.Set<java.lang.String> strSet43 = element42.classNames();
        org.jsoup.select.Elements elements44 = element42.parents();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int45 = element42.siblingIndex();
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test761");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        org.jsoup.nodes.Node node19 = document2.removeAttr("#root");
        java.lang.String str20 = document2.nodeName();
        java.lang.String str21 = document2.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = document2.previousElementSibling();
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test762");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValue("hi! ", "#root");
        org.jsoup.nodes.Element element16 = element9.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements19 = element16.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "#root");
        org.jsoup.nodes.Element element21 = element16.removeClass("\n<hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element16.firstElementSibling();
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test763");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.parser.Tag tag12 = document2.tag();
        org.jsoup.nodes.Element element14 = document2.addClass("");
        org.jsoup.nodes.Element element16 = document2.prependElement("hi!");
        org.jsoup.parser.Tag tag17 = document2.tag();
        org.jsoup.select.Elements elements19 = document2.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element22 = document2.attr("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "#root");
        org.jsoup.nodes.Element element23 = document2.parent();
        org.jsoup.select.Elements elements25 = document2.getElementsByIndexEquals(100);
        java.util.Set<java.lang.String> strSet26 = document2.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = document2.previousElementSibling();
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test764");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        boolean boolean18 = document2.isBlock();
        org.jsoup.nodes.Element element20 = document2.addClass("#root");
        java.lang.String str21 = element20.outerHtml();
        boolean boolean22 = element20.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = element20.nextSibling();
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test765");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element17 = document10.appendText("#root");
        org.jsoup.nodes.Element element18 = document2.appendChild((org.jsoup.nodes.Node) document10);
        java.lang.String str19 = element18.val();
        boolean boolean21 = element18.hasAttr("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str22 = element18.val();
        org.jsoup.nodes.Element element24 = element18.toggleClass("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        org.jsoup.nodes.Element element26 = element18.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements27 = element26.siblingElements();
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test766");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str19 = document18.tagName();
        document18.setBaseUri("");
        document18.setBaseUri("");
        org.jsoup.nodes.Element element25 = document18.appendText("#root");
        org.jsoup.nodes.Element element26 = document10.appendChild((org.jsoup.nodes.Node) document18);
        boolean boolean27 = tag7.equals((java.lang.Object) element26);
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str30 = tag29.getName();
        org.jsoup.parser.Tag tag31 = tag29.getImplicitParent();
        boolean boolean32 = tag7.canContain(tag31);
        boolean boolean33 = tag31.isBlock();
        org.jsoup.nodes.Document document36 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str37 = document36.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList38 = document36.childNodes();
        boolean boolean40 = document36.hasAttr("#root");
        org.jsoup.parser.Tag tag41 = document36.tag();
        java.lang.String str42 = tag41.toString();
        org.jsoup.parser.Tag tag44 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str45 = tag44.getName();
        org.jsoup.parser.Tag tag46 = tag44.getImplicitParent();
        boolean boolean47 = tag44.isEmpty();
        java.lang.String str48 = tag44.toString();
        boolean boolean49 = tag41.isValidParent(tag44);
        boolean boolean50 = tag31.isValidParent(tag41);
        org.jsoup.nodes.Document document54 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str55 = document54.tagName();
        document54.setBaseUri("");
        org.jsoup.nodes.Element element59 = document54.addClass("");
        org.jsoup.nodes.Element element61 = document54.toggleClass("");
        org.jsoup.nodes.Element element63 = element61.html("");
        boolean boolean64 = element61.isBlock();
        org.jsoup.nodes.Attributes attributes65 = element61.attributes();
        org.jsoup.nodes.Element element66 = new org.jsoup.nodes.Element(tag31, "<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", attributes65);
        org.jsoup.nodes.Element element68 = element66.prepend("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! #document");
        org.jsoup.nodes.Element element70 = element66.removeClass(" body hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element71 = element70.previousElementSibling();
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test767");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element9 = document2.appendText("hi! ");
        org.jsoup.nodes.Element element11 = element9.removeClass("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.select.Elements elements13 = element9.select("body");
        org.jsoup.nodes.Element element15 = element9.prependText("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element15.childNodes();
        java.lang.String str17 = element15.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element15.lastElementSibling();
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test768");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("\n<hi!>\n</hi!>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.previousElementSibling();
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test769");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        boolean boolean12 = element9.isBlock();
        org.jsoup.nodes.Attributes attributes13 = element9.attributes();
        org.jsoup.select.Elements elements16 = element9.getElementsByAttributeValueEnding("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi! ");
        org.jsoup.nodes.Element element18 = element9.prependElement("hi! #document");
        org.jsoup.nodes.Element element20 = element9.addClass("");
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str24 = document23.tagName();
        document23.setBaseUri("");
        document23.setBaseUri("");
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str32 = document31.tagName();
        document31.setBaseUri("");
        document31.setBaseUri("");
        org.jsoup.nodes.Element element38 = document31.appendText("#root");
        org.jsoup.nodes.Element element39 = document23.appendChild((org.jsoup.nodes.Node) document31);
        java.lang.String str40 = document31.className();
        org.jsoup.nodes.Document document43 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str44 = document43.tagName();
        document43.setBaseUri("");
        document43.setBaseUri("");
        org.jsoup.nodes.Element element50 = document43.appendText("#root");
        org.jsoup.nodes.Element element52 = document43.wrap("#root");
        document31.replaceWith((org.jsoup.nodes.Node) document43);
        java.util.Set<java.lang.String> strSet54 = document31.classNames();
        org.jsoup.nodes.Element element55 = element20.classNames(strSet54);
        org.jsoup.nodes.Document document58 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str59 = document58.tagName();
        document58.setBaseUri("");
        org.jsoup.nodes.Element element63 = document58.addClass("");
        org.jsoup.nodes.Element element65 = document58.toggleClass("");
        org.jsoup.nodes.Element element67 = document58.addClass("hi!");
        org.jsoup.parser.Tag tag68 = document58.tag();
        org.jsoup.nodes.Element element70 = document58.addClass("");
        org.jsoup.nodes.Element element72 = document58.prependElement("hi!");
        org.jsoup.parser.Tag tag73 = document58.tag();
        org.jsoup.select.Elements elements75 = document58.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element78 = document58.attr("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "#root");
        org.jsoup.nodes.Element element80 = document58.appendText("hi! ");
        boolean boolean81 = element20.equals((java.lang.Object) document58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element83 = element20.text("");
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test770");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Element element8 = element6.prependText("body");
        org.jsoup.parser.Tag tag9 = element8.tag();
        element8.setBaseUri(" hi! #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element8.lastElementSibling();
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test771");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        boolean boolean12 = element9.isBlock();
        org.jsoup.nodes.Attributes attributes13 = element9.attributes();
        java.lang.String str14 = element9.baseUri();
        org.jsoup.nodes.Element element16 = element9.removeClass("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n  <html> \n   <head> \n   </head> \n   <body>\n     hi!   #document \n   </body>\n  </html>\n </body>\n</html>\n</#root>\n<html> \n<head> \n</head> \n<body>  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element9.wrap("<hi! #document>\n</hi! #document>");
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test772");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("body", "body");
        org.jsoup.nodes.Element element7 = document2.val("#document");
        org.jsoup.nodes.Element element9 = element7.toggleClass("");
        org.jsoup.nodes.Node node11 = element9.removeAttr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.jsoup.select.Elements elements12 = element9.parents();
        java.lang.String str13 = element9.baseUri();
        org.jsoup.nodes.Element element15 = element9.append("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.jsoup.select.Elements elements16 = element9.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element9.lastElementSibling();
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test773");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str10 = document9.tagName();
        document9.setBaseUri("");
        document9.setBaseUri("");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str18 = document17.tagName();
        document17.setBaseUri("");
        document17.setBaseUri("");
        org.jsoup.nodes.Element element24 = document17.appendText("#root");
        org.jsoup.nodes.Element element25 = document9.appendChild((org.jsoup.nodes.Node) document17);
        java.lang.String str26 = element25.baseUri();
        org.jsoup.nodes.Element element27 = document2.appendChild((org.jsoup.nodes.Node) element25);
        org.jsoup.select.Elements elements30 = document2.getElementsByAttributeValueEnding("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element31 = document2.nextElementSibling();
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test774");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        document2.setBaseUri("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element element16 = document14.child(0);
        java.util.Set<java.lang.String> strSet17 = element16.classNames();
        org.jsoup.nodes.Element element18 = document2.classNames(strSet17);
        org.jsoup.nodes.Element element21 = document2.attr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi!");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element26 = document24.appendText("#root");
        org.jsoup.nodes.Element element28 = document24.prepend("#root");
        org.jsoup.nodes.Element element30 = element28.prependText("body");
        org.jsoup.parser.Tag tag31 = element30.tag();
        element30.setBaseUri(" hi! #document");
        boolean boolean34 = document2.equals((java.lang.Object) element30);
        org.jsoup.nodes.Element element36 = element30.prepend("hi! hi!");
        org.jsoup.nodes.Document document39 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str40 = document39.tagName();
        document39.setBaseUri("");
        org.jsoup.nodes.Element element44 = document39.addClass("");
        org.jsoup.nodes.Element element45 = element36.prependChild((org.jsoup.nodes.Node) element44);
        java.lang.String str46 = element36.toString();
        org.jsoup.select.Elements elements48 = element36.getElementsByClass("hi! hi!");
        org.jsoup.select.Elements elements51 = element36.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements52 = element36.siblingElements();
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test775");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueStarting("\n<body>\n</body>", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>body");
        org.jsoup.nodes.Element element7 = document2.prependText("\n<hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document2.firstElementSibling();
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test776");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.parser.Tag tag12 = document2.tag();
        org.jsoup.nodes.Element element14 = document2.addClass("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document2.childNodes();
        org.jsoup.nodes.Element element16 = document2.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = element16.nextSibling();
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test777");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        org.jsoup.select.Elements elements11 = document2.getElementsByAttribute("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str15 = document14.tagName();
        document14.setBaseUri("");
        org.jsoup.select.Elements elements19 = document14.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.nodes.Element element20 = document2.appendChild((org.jsoup.nodes.Node) document14);
        org.jsoup.nodes.Node node22 = document2.removeAttr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.nodes.Element element24 = document2.text("");
        org.jsoup.parser.Tag tag25 = element24.tag();
        org.jsoup.select.Elements elements27 = element24.select("#root");
        java.lang.String str28 = element24.tagName();
        org.jsoup.nodes.Element element30 = element24.prepend("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element31 = element24.previousElementSibling();
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test778");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element17 = document10.appendText("#root");
        org.jsoup.nodes.Element element18 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element21 = element18.attr("hi! ", "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element21.firstElementSibling();
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test779");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        org.jsoup.nodes.Node node6 = document2.childNode(0);
        boolean boolean8 = document2.hasClass("#root");
        org.jsoup.nodes.Element element10 = document2.toggleClass("body");
        org.jsoup.nodes.Attributes attributes11 = element10.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element10.lastElementSibling();
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test780");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        org.jsoup.nodes.Node node19 = document2.removeAttr("#root");
        org.jsoup.nodes.Element element21 = document2.addClass("hi!");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node26 = document24.removeAttr("hi!");
        org.jsoup.nodes.Element element28 = document24.addClass("");
        org.jsoup.nodes.Element element29 = document2.prependChild((org.jsoup.nodes.Node) element28);
        java.lang.Integer int30 = element29.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node31 = element29.previousSibling();
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test781");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.html("hi! ");
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#document");
        org.jsoup.nodes.Element element15 = element10.val("hi!");
        element15.setBaseUri("<#root>\n<html>\n <head>\n </head>\n <body>\n  body \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str18 = element15.id();
        java.util.Set<java.lang.String> strSet19 = element15.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements20 = element15.siblingElements();
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test782");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.html("hi! ");
        org.jsoup.nodes.Element element12 = document2.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str13 = element12.val();
        org.jsoup.nodes.Element element15 = element12.removeClass("<#document>\n</#document>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element12.lastElementSibling();
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test783");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        org.jsoup.nodes.Node node6 = document2.childNode(0);
        org.jsoup.nodes.Element element8 = document2.val("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str12 = document11.tagName();
        document11.setBaseUri("");
        document11.setBaseUri("");
        org.jsoup.nodes.Element element18 = document11.appendText("#root");
        document11.setBaseUri("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element element25 = document23.child(0);
        java.util.Set<java.lang.String> strSet26 = element25.classNames();
        org.jsoup.nodes.Element element27 = document11.classNames(strSet26);
        org.jsoup.nodes.Element element28 = element8.classNames(strSet26);
        org.jsoup.nodes.Element element31 = element8.attr("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList32 = element31.siblingNodes();
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test784");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        org.jsoup.nodes.Node node19 = document2.removeAttr("#root");
        org.jsoup.nodes.Element element21 = document2.addClass("hi!");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node26 = document24.removeAttr("hi!");
        org.jsoup.nodes.Element element28 = document24.addClass("");
        org.jsoup.nodes.Element element29 = document2.prependChild((org.jsoup.nodes.Node) element28);
        java.lang.String str30 = element29.nodeName();
        org.jsoup.nodes.Element element32 = element29.appendText("#document");
        java.lang.String str33 = element29.baseUri();
        java.lang.Integer int34 = element29.elementSiblingIndex();
        org.jsoup.nodes.Document document37 = org.jsoup.parser.Parser.parse("#root", "hi!");
        java.util.Set<java.lang.String> strSet38 = document37.classNames();
        org.jsoup.nodes.Element element39 = element29.classNames(strSet38);
        org.jsoup.nodes.Document document42 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str43 = document42.tagName();
        document42.setBaseUri("");
        org.jsoup.select.Elements elements47 = document42.getElementsByIndexEquals((int) (byte) -1);
        boolean boolean48 = element29.equals((java.lang.Object) document42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element49 = document42.firstElementSibling();
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test785");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.Integer int3 = document2.elementSiblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        java.lang.String str5 = document2.val();
        org.jsoup.nodes.Element element7 = document2.toggleClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements8 = document2.siblingElements();
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test786");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        boolean boolean12 = element9.isBlock();
        org.jsoup.select.Elements elements15 = element9.getElementsByAttributeValueEnding("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>", "#document");
        java.lang.String str16 = element9.tagName();
        org.jsoup.nodes.Element element18 = element9.val("hi! #document");
        org.jsoup.nodes.Element element20 = element18.val("hi! hi!hi!");
        java.lang.String str21 = element20.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element20.previousElementSibling();
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test787");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        org.jsoup.nodes.Node node19 = document2.removeAttr("#root");
        org.jsoup.nodes.Element element21 = document2.addClass("hi!");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node26 = document24.removeAttr("hi!");
        org.jsoup.nodes.Element element28 = document24.addClass("");
        org.jsoup.nodes.Element element29 = document2.prependChild((org.jsoup.nodes.Node) element28);
        java.lang.String str30 = element29.nodeName();
        org.jsoup.select.Elements elements32 = element29.select("body");
        org.jsoup.nodes.Document document35 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str36 = document35.tagName();
        document35.setBaseUri("");
        org.jsoup.nodes.Element element40 = document35.addClass("");
        org.jsoup.nodes.Element element42 = document35.toggleClass("");
        org.jsoup.nodes.Element element44 = element42.html("");
        boolean boolean45 = element42.isBlock();
        java.lang.String[] strArray50 = new java.lang.String[] { "", "body", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet51 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
        org.jsoup.nodes.Element element53 = element42.classNames((java.util.Set<java.lang.String>) strSet51);
        org.jsoup.nodes.Element element54 = element29.classNames((java.util.Set<java.lang.String>) strSet51);
        org.jsoup.nodes.Document document57 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str58 = document57.tagName();
        document57.setBaseUri("");
        document57.setBaseUri("");
        org.jsoup.nodes.Element element64 = document57.appendText("#root");
        document57.setBaseUri("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Document document69 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element element71 = document69.child(0);
        java.util.Set<java.lang.String> strSet72 = element71.classNames();
        org.jsoup.nodes.Element element73 = document57.classNames(strSet72);
        org.jsoup.nodes.Element element76 = document57.attr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi!");
        org.jsoup.nodes.Document document79 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element81 = document79.appendText("#root");
        org.jsoup.nodes.Element element83 = document79.prepend("#root");
        org.jsoup.nodes.Element element85 = element83.prependText("body");
        org.jsoup.parser.Tag tag86 = element85.tag();
        element85.setBaseUri(" hi! #document");
        boolean boolean89 = document57.equals((java.lang.Object) element85);
        org.jsoup.nodes.Element element91 = element85.prepend("hi! hi!");
        org.jsoup.nodes.Element element92 = element29.appendChild((org.jsoup.nodes.Node) element91);
        java.util.List<org.jsoup.nodes.Node> nodeList93 = element92.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element94 = element92.previousElementSibling();
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test788");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str10 = document9.tagName();
        document9.setBaseUri("");
        document9.setBaseUri("");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str18 = document17.tagName();
        document17.setBaseUri("");
        document17.setBaseUri("");
        org.jsoup.nodes.Element element24 = document17.appendText("#root");
        org.jsoup.nodes.Element element25 = document9.appendChild((org.jsoup.nodes.Node) document17);
        java.lang.String str26 = element25.baseUri();
        org.jsoup.nodes.Element element27 = document2.appendChild((org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Element element29 = document2.prependText("hi!");
        org.jsoup.nodes.Element element31 = document2.removeClass("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList32 = element31.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element33 = element31.previousElementSibling();
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test789");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.appendText("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str12 = element11.baseUri();
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parse("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>", "<#root>\n</#root>");
        org.jsoup.select.Elements elements18 = document15.getElementsByAttributeValue("hi! hi! #root", "hi! hi! #root");
        org.jsoup.nodes.Element element19 = element11.appendChild((org.jsoup.nodes.Node) document15);
        org.jsoup.parser.Tag tag20 = element11.tag();
        org.jsoup.select.Elements elements23 = element11.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    hi!  \n  </body>\n </html>\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root><hi> \n</hi> \n<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int24 = element11.siblingIndex();
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test790");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.nodes.Element element9 = document2.text("");
        org.jsoup.nodes.Element element11 = element9.prepend("");
        java.lang.String str13 = element11.attr("hi!");
        java.lang.String str14 = element11.nodeName();
        java.lang.String str16 = element11.attr("\n<body>\n</body>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements17 = element11.siblingElements();
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test791");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.parser.Tag tag12 = document2.tag();
        org.jsoup.nodes.Element element14 = document2.addClass("");
        org.jsoup.nodes.Node node16 = document2.removeAttr("\n<hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = document2.previousSibling();
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test792");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        document2.setBaseUri("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        java.lang.Integer int5 = document2.elementSiblingIndex();
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document2.siblingNodes();
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test793");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.select.Elements elements8 = element7.parents();
        boolean boolean10 = element7.hasClass("#root");
        java.lang.String str11 = element7.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element7.firstElementSibling();
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test794");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str9 = document8.tagName();
        document8.setBaseUri("");
        document8.setBaseUri("");
        org.jsoup.nodes.Element element15 = document8.appendText("#root");
        document8.setBaseUri("");
        org.jsoup.nodes.Element element18 = document8.empty();
        org.jsoup.nodes.Element element19 = element18.empty();
        org.jsoup.nodes.Element element20 = document2.appendChild((org.jsoup.nodes.Node) element18);
        org.jsoup.select.Elements elements23 = document2.getElementsByAttributeValueStarting("hi! ", "#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int24 = document2.siblingIndex();
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test795");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        org.jsoup.nodes.Element element11 = document2.wrap("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements12 = document2.siblingElements();
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test796");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        org.jsoup.select.Elements elements10 = document2.parents();
        boolean boolean12 = document2.hasAttr("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = document2.wrap("<html>\n<head>\n</head>\n<body> \n</body>\n</html><#root value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\" hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test797");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.html("hi! ");
        org.jsoup.nodes.Element element12 = element10.addClass("#root");
        java.lang.String str14 = element12.attr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element12.append("body");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = element16.nextSibling();
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test798");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.parser.Tag tag12 = document2.tag();
        org.jsoup.nodes.Element element14 = document2.addClass("");
        org.jsoup.nodes.Element element16 = document2.prependElement("hi! ");
        java.lang.String str17 = document2.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int18 = document2.siblingIndex();
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test799");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        org.jsoup.nodes.Node node19 = document2.removeAttr("#root");
        org.jsoup.nodes.Element element21 = document2.addClass("hi!");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node26 = document24.removeAttr("hi!");
        org.jsoup.nodes.Element element28 = document24.addClass("");
        org.jsoup.nodes.Element element29 = document2.prependChild((org.jsoup.nodes.Node) element28);
        java.lang.String str30 = element29.nodeName();
        org.jsoup.select.Elements elements32 = element29.select("body");
        java.lang.String str33 = element29.nodeName();
        org.jsoup.nodes.Element element34 = element29.empty();
        boolean boolean36 = element34.hasAttr("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        java.lang.String str37 = element34.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element38 = element34.nextElementSibling();
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test800");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n <hi> \n </hi> \n <html> \n  <head> \n  </head> \n  <body>\n    hi!  \n  </body>\n </html>\n</body>\n</html>", "<html> <head> </head> <body> body </body> </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.siblingNodes();
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test801");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        java.util.Set<java.lang.String> strSet3 = document2.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.siblingNodes();
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test802");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.parser.Tag tag12 = document2.tag();
        org.jsoup.nodes.Element element14 = document2.addClass("");
        org.jsoup.parser.Tag tag15 = element14.tag();
        org.jsoup.parser.Tag tag16 = tag15.getImplicitParent();
        java.lang.String str17 = tag16.toString();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag16, "");
        boolean boolean20 = tag16.isBlock();
        org.jsoup.parser.Tag tag22 = org.jsoup.parser.Tag.valueOf("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean23 = tag22.isEmpty();
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str27 = document26.tagName();
        document26.setBaseUri("");
        document26.setBaseUri("");
        org.jsoup.nodes.Document document34 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str35 = document34.tagName();
        document34.setBaseUri("");
        document34.setBaseUri("");
        org.jsoup.nodes.Element element40 = document26.appendChild((org.jsoup.nodes.Node) document34);
        org.jsoup.nodes.Element element41 = document26.empty();
        boolean boolean42 = document26.hasText();
        java.lang.String str43 = document26.id();
        java.lang.String str44 = document26.nodeName();
        org.jsoup.select.Elements elements46 = document26.getElementsByClass("#document");
        org.jsoup.nodes.Element element48 = document26.removeClass("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n   <html> \n    <head> \n    </head> \n    <body>\n      hi! #document    \n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>");
        boolean boolean49 = tag22.equals((java.lang.Object) document26);
        boolean boolean50 = tag16.isValidParent(tag22);
        org.jsoup.nodes.Element element52 = new org.jsoup.nodes.Element(tag22, "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element53 = element52.firstElementSibling();
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test803");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element8 = element7.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element7.previousElementSibling();
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test804");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str19 = document18.tagName();
        document18.setBaseUri("");
        document18.setBaseUri("");
        org.jsoup.nodes.Element element24 = document10.appendChild((org.jsoup.nodes.Node) document18);
        org.jsoup.nodes.Element element25 = document10.empty();
        org.jsoup.nodes.Node node27 = document10.removeAttr("#root");
        java.lang.String str28 = document10.outerHtml();
        java.lang.String str29 = document10.toString();
        org.jsoup.nodes.Element element30 = document10.empty();
        boolean boolean31 = element7.equals((java.lang.Object) document10);
        org.jsoup.nodes.Document document34 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str35 = document34.tagName();
        document34.setBaseUri("");
        document34.setBaseUri("");
        org.jsoup.nodes.Element element41 = document34.appendText("#root");
        org.jsoup.select.Elements elements42 = element41.getAllElements();
        org.jsoup.select.Elements elements44 = element41.select("#document");
        org.jsoup.nodes.Element element45 = document10.prependChild((org.jsoup.nodes.Node) element41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element46 = element45.previousElementSibling();
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test805");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.lastElementSibling();
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test806");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        java.lang.String str9 = document2.attr("#root");
        document2.setBaseUri("hi! #document");
        org.jsoup.nodes.Element element13 = document2.prepend("body#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element13.lastElementSibling();
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test807");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        org.jsoup.nodes.Node node19 = document2.removeAttr("#root");
        org.jsoup.nodes.Element element21 = document2.addClass("hi!");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node26 = document24.removeAttr("hi!");
        org.jsoup.nodes.Element element28 = document24.addClass("");
        org.jsoup.nodes.Element element29 = document2.prependChild((org.jsoup.nodes.Node) element28);
        java.lang.String str30 = element29.nodeName();
        org.jsoup.nodes.Document document33 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str34 = document33.tagName();
        document33.setBaseUri("");
        document33.setBaseUri("");
        org.jsoup.nodes.Document document41 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str42 = document41.tagName();
        document41.setBaseUri("");
        document41.setBaseUri("");
        org.jsoup.nodes.Element element47 = document33.appendChild((org.jsoup.nodes.Node) document41);
        org.jsoup.nodes.Element element48 = document33.empty();
        boolean boolean49 = document33.isBlock();
        org.jsoup.nodes.Element element51 = document33.addClass("#root");
        org.jsoup.select.Elements elements54 = element51.getElementsByAttributeValueNot("#root", "body");
        org.jsoup.nodes.Element element55 = element29.prependChild((org.jsoup.nodes.Node) element51);
        org.jsoup.nodes.Element element57 = element29.prependElement("<#document>\n</#document>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        org.jsoup.nodes.Element element59 = element29.html("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    hi!  \n  </body>\n </html>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList60 = element29.siblingNodes();
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test808");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        document2.setBaseUri("");
        org.jsoup.parser.Tag tag12 = document2.tag();
        org.jsoup.nodes.Element element14 = document2.toggleClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean15 = element14.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int16 = element14.siblingIndex();
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test809");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        boolean boolean12 = element9.isBlock();
        org.jsoup.nodes.Attributes attributes13 = element9.attributes();
        java.lang.String str14 = element9.baseUri();
        boolean boolean16 = element9.hasAttr("hi! #document");
        org.jsoup.nodes.Element element18 = element9.addClass("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements21 = element18.getElementsByAttributeValueEnding("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements24 = element18.getElementsByAttributeValueStarting("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n  <html> \n   <head> \n   </head> \n   <body>\n     hi!   #document \n   </body>\n  </html>\n </body>\n</html>\n</#root>\n<html> \n<head> \n</head> \n<body>  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;", "#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList25 = element18.siblingNodes();
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test810");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element9 = document2.appendText("hi! ");
        org.jsoup.nodes.Element element11 = element9.removeClass("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.select.Elements elements13 = element9.select("body");
        org.jsoup.nodes.Element element15 = element9.prependText("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.select.Elements elements17 = element9.getElementsByIndexLessThan((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element9.nextElementSibling();
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test811");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals((int) (byte) 1);
        org.jsoup.select.Elements elements9 = document2.getElementsByIndexLessThan(10);
        org.jsoup.nodes.Element element11 = document2.appendElement("<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>", "#root");
        java.lang.String str15 = document14.html();
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document14);
        org.jsoup.nodes.Element element19 = document2.attr("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "\n<#document>\n</#document>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element19.wrap("<html> <head> </head> <body> hi! </body> </html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi! <#root> <html> <head> </head> <body> hi! </body> </html> </#root>");
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test812");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element17 = document2.empty();
        org.jsoup.nodes.Node node19 = document2.removeAttr("#root");
        org.jsoup.nodes.Element element21 = document2.addClass("hi!");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node26 = document24.removeAttr("hi!");
        org.jsoup.nodes.Element element28 = document24.addClass("");
        org.jsoup.nodes.Element element29 = document2.prependChild((org.jsoup.nodes.Node) element28);
        org.jsoup.nodes.Element element31 = element29.prependText("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str32 = element29.nodeName();
        org.jsoup.nodes.Element element33 = element29.empty();
        org.jsoup.select.Elements elements35 = element33.getElementsByIndexGreaterThan((int) '#');
        org.jsoup.nodes.Element element38 = element33.attr("hi! <html> <head> </head> <body> hi! </body> </html>hi! hi!", "hi! hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element39 = element33.firstElementSibling();
    }
}

