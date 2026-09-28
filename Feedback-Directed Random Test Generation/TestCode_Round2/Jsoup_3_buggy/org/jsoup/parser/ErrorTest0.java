package org.jsoup.parser;

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
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.siblingNodes();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements3 = document2.siblingElements();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueEnding("hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements6 = document2.siblingElements();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document2.firstElementSibling();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document2.nextElementSibling();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = document2.nextSibling();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements8 = element7.siblingElements();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document2.firstElementSibling();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document2.firstElementSibling();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document2.firstElementSibling();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements4 = document2.siblingElements();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document2.siblingNodes();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element20.siblingNodes();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int18 = element16.siblingIndex();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        document2.setBaseUri("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document2.siblingNodes();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = document2.previousSibling();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.nextElementSibling();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        java.lang.String str9 = document2.attr("#root");
        org.jsoup.nodes.Element element11 = document2.text("");
        java.lang.String str12 = document2.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = document2.previousSibling();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        org.jsoup.nodes.Element element6 = document2.addClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int7 = document2.siblingIndex();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueEnding("hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document2.previousElementSibling();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int32 = element29.siblingIndex();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        java.lang.Integer int5 = document2.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = document2.attr("hi!", "#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element8.previousElementSibling();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = document2.previousSibling();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList22 = document2.siblingNodes();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        org.jsoup.select.Elements elements10 = document2.parents();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document2.previousElementSibling();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        java.lang.String str9 = document2.attr("#root");
        org.jsoup.nodes.Element element11 = document2.text("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements12 = document2.siblingElements();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element12 = document2.empty();
        java.lang.String str13 = element12.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element12.siblingNodes();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.nodes.Element element9 = document2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int10 = document2.siblingIndex();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.select.Elements elements6 = document2.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document2.previousElementSibling();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = element9.nextSibling();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.nextElementSibling();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element12 = document2.empty();
        org.jsoup.nodes.Element element13 = element12.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element13.firstElementSibling();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList32 = element29.siblingNodes();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = document2.previousSibling();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element11.siblingNodes();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node48 = element45.nextSibling();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        document2.setBaseUri("#root");
        boolean boolean9 = document2.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements10 = document2.siblingElements();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.prepend("body");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = document2.nextSibling();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueEnding("hi!", "hi!");
        java.lang.String str6 = document2.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = document2.previousSibling();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
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
        java.lang.String str21 = element20.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int22 = element20.siblingIndex();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements34 = element31.siblingElements();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int9 = document2.siblingIndex();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document2.lastElementSibling();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements12 = element11.siblingElements();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element12 = document2.empty();
        org.jsoup.nodes.Element element13 = element12.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int14 = element12.siblingIndex();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element6.siblingNodes();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node33 = document2.previousSibling();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
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
        java.lang.Integer int24 = element23.siblingIndex();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        org.jsoup.select.Elements elements10 = document2.parents();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document2.lastElementSibling();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueEnding("hi!", "hi!");
        java.lang.String str6 = document2.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = document2.nextSibling();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        org.jsoup.nodes.Element element6 = document2.addClass("");
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("#root");
        document2.setBaseUri("body");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document2.siblingNodes();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "hi!");
        org.jsoup.nodes.Element element4 = document2.prepend("hi! ");
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Attributes attributes6 = element4.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = element4.previousSibling();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document2.wrap("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
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
        org.jsoup.nodes.Element element19 = document2.previousElementSibling();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.Integer int3 = document2.elementSiblingIndex();
        org.jsoup.nodes.Element element5 = document2.toggleClass("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document2.lastElementSibling();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
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
        org.jsoup.select.Elements elements17 = document2.siblingElements();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node32 = element20.nextSibling();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("body", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements4 = document2.getElementsByClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document2.previousElementSibling();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.nodes.Element element9 = document2.text("");
        org.jsoup.nodes.Element element11 = element9.prepend("");
        java.lang.String str13 = element11.attr("hi!");
        org.jsoup.nodes.Element element14 = element11.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element11.lastElementSibling();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node56 = element55.nextSibling();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element element4 = document2.child(0);
        org.jsoup.nodes.Element element5 = element4.parent();
        org.jsoup.nodes.Element element7 = element5.append("hi! #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element7.previousElementSibling();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements28 = element27.siblingElements();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
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
        org.jsoup.nodes.Node node32 = element31.nextSibling();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Element element9 = document2.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = element9.previousSibling();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        org.jsoup.select.Elements elements5 = document2.getElementsByClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int6 = document2.siblingIndex();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element26.previousElementSibling();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element12 = document2.empty();
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Node node15 = element13.removeAttr("body");
        java.lang.String str16 = element13.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element13.previousElementSibling();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.prepend("body");
        org.jsoup.select.Elements elements12 = document2.getElementsByIndexGreaterThan((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document2.previousElementSibling();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element10 = document2.val("#document");
        org.jsoup.parser.Tag tag11 = document2.tag();
        org.jsoup.select.Elements elements13 = document2.getElementsByAttribute("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = document2.previousSibling();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        org.jsoup.select.Elements elements10 = document2.getElementsByAttributeValue("hi!", "#document");
        java.lang.String str11 = document2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document2.firstElementSibling();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element element4 = document2.child(0);
        org.jsoup.nodes.Element element5 = element4.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int6 = element5.siblingIndex();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        java.lang.String str9 = document2.attr("#root");
        org.jsoup.nodes.Element element11 = document2.text("");
        java.lang.String str12 = document2.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.siblingNodes();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList28 = element27.siblingNodes();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
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
        org.jsoup.select.Elements elements33 = document10.siblingElements();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
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
        element54.setBaseUri("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList57 = element54.siblingNodes();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        org.jsoup.select.Elements elements5 = document2.getElementsByClass("hi!");
        java.util.Set<java.lang.String> strSet6 = document2.classNames();
        org.jsoup.nodes.Element element8 = document2.prependText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = document2.previousSibling();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements17 = element16.siblingElements();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        org.jsoup.nodes.Element element5 = document2.addClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element5.nextElementSibling();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexLessThan((int) (byte) 100);
        org.jsoup.nodes.Element element6 = document2.appendText("hi!");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str10 = document9.tagName();
        document9.setBaseUri("");
        document9.setBaseUri("");
        java.lang.String str16 = document9.attr("#root");
        org.jsoup.nodes.Element element17 = element6.appendChild((org.jsoup.nodes.Node) document9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element6.wrap("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
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
        java.lang.Integer int19 = document2.siblingIndex();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
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
        java.util.List<org.jsoup.nodes.Node> nodeList30 = element29.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node31 = element29.nextSibling();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.firstElementSibling();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        document2.setBaseUri("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document2.firstElementSibling();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
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
        org.jsoup.nodes.Node node35 = element34.previousSibling();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = document2.lastElementSibling();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        org.jsoup.nodes.Element element5 = document2.appendText("#document");
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueContaining("hi!", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = element5.removeClass("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = element5.previousSibling();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        java.lang.String str11 = element9.attr("");
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#root");
        org.jsoup.select.Elements elements17 = element9.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str18 = element9.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = element9.previousSibling();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        org.jsoup.select.Elements elements5 = document2.getElementsByClass("hi!");
        java.util.Set<java.lang.String> strSet6 = document2.classNames();
        org.jsoup.nodes.Element element8 = document2.prependText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements9 = element8.siblingElements();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.select.Elements elements8 = element7.parents();
        java.lang.String str10 = element7.absUrl("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element7.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = element7.toggleClass("hi! ");
        org.jsoup.nodes.Element element17 = element15.addClass("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element15.wrap("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.siblingNodes();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        org.jsoup.select.Elements elements5 = document2.getElementsByClass("hi!");
        java.util.Set<java.lang.String> strSet6 = document2.classNames();
        org.jsoup.nodes.Element element8 = document2.prependText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document2.firstElementSibling();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = element29.lastElementSibling();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.html("hi! ");
        org.jsoup.nodes.Element element12 = element10.addClass("#root");
        org.jsoup.nodes.Element element15 = element10.attr("hi! ", "hi! #document");
        java.lang.String str16 = element15.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element15.previousElementSibling();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements18 = document2.siblingElements();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int31 = element29.siblingIndex();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("body", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements4 = document2.getElementsByClass("hi!");
        java.lang.String str5 = document2.data();
        org.jsoup.nodes.Element element6 = document2.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements7 = document2.siblingElements();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.parser.Tag tag12 = document2.tag();
        org.jsoup.nodes.Element element14 = document2.addClass("");
        org.jsoup.nodes.Element element16 = document2.prependElement("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements17 = document2.siblingElements();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
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
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element18.siblingNodes();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
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
        org.jsoup.nodes.Node node41 = element29.removeAttr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node42 = element29.previousSibling();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("body", "body");
        org.jsoup.nodes.Element element7 = document2.val("#document");
        org.jsoup.select.Elements elements9 = document2.getElementsByIndexEquals((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document2.wrap("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.firstElementSibling();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.Integer int3 = document2.elementSiblingIndex();
        org.jsoup.nodes.Element element5 = document2.toggleClass("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element5.nextElementSibling();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        java.lang.Integer int5 = document2.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = document2.attr("hi!", "#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element8.nextElementSibling();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
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
        java.util.Set<java.lang.String> strSet33 = document10.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element34 = document10.previousElementSibling();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.nodes.Element element9 = document2.text("");
        org.jsoup.nodes.Attributes attributes10 = document2.attributes();
        org.jsoup.nodes.Element element13 = document2.attr("#document", "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.nodes.Element element15 = element13.html("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element15.previousElementSibling();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.nextElementSibling();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        org.jsoup.select.Elements elements5 = document2.getElementsByClass("hi!");
        java.util.Set<java.lang.String> strSet6 = document2.classNames();
        org.jsoup.nodes.Element element8 = document2.prependText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int9 = document2.siblingIndex();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element10 = document2.val("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document2.lastElementSibling();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Element element8 = element6.prependText("body");
        org.jsoup.parser.Tag tag9 = element8.tag();
        org.jsoup.nodes.Element element12 = element8.attr("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#root");
        java.lang.String str13 = element8.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = element8.nextSibling();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        java.lang.Integer int5 = document2.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = document2.attr("hi!", "#document");
        boolean boolean10 = element8.hasClass("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        element8.setBaseUri("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element8.firstElementSibling();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        org.jsoup.nodes.Node node6 = document2.childNode(0);
        org.jsoup.nodes.Element element8 = document2.getElementById("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str12 = document11.tagName();
        document11.setBaseUri("");
        document11.setBaseUri("");
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str20 = document19.tagName();
        document19.setBaseUri("");
        document19.setBaseUri("");
        org.jsoup.nodes.Element element25 = document11.appendChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Element element26 = document11.empty();
        boolean boolean27 = document11.isBlock();
        org.jsoup.nodes.Element element29 = document11.addClass("#root");
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str33 = document32.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = document32.childNodes();
        boolean boolean36 = document32.hasAttr("#root");
        org.jsoup.parser.Tag tag37 = document32.tag();
        org.jsoup.nodes.Element element38 = element29.prependChild((org.jsoup.nodes.Node) document32);
        boolean boolean39 = document2.equals((java.lang.Object) element29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element41 = element29.wrap("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.html("hi! ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element10.nextElementSibling();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements19 = document2.siblingElements();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("body", "#document");
        boolean boolean3 = document2.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document2.nextElementSibling();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element32 = element29.nextElementSibling();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        java.lang.String str9 = document2.attr("#root");
        document2.setBaseUri("hi! #document");
        boolean boolean13 = document2.hasAttr("hi! ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = document2.previousElementSibling();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str10 = document2.absUrl("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document2.siblingNodes();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
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
        java.lang.String str55 = element9.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList56 = element9.siblingNodes();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.nodes.Element element9 = document2.text("");
        org.jsoup.nodes.Element element11 = element9.prepend("");
        org.jsoup.select.Elements elements13 = element9.getElementsByIndexGreaterThan((int) (byte) 10);
        org.jsoup.nodes.Element element15 = element9.appendText("hi! #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element9.lastElementSibling();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        java.lang.Integer int5 = document2.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = document2.attr("hi!", "#document");
        boolean boolean10 = element8.hasClass("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        element8.setBaseUri("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = element8.toggleClass("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = element14.previousSibling();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = document2.nextElementSibling();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        java.lang.String str9 = document2.attr("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document2.lastElementSibling();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = document2.siblingNodes();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
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
        java.lang.String str21 = element20.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element20.siblingNodes();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
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
        java.lang.String str21 = document2.className();
        org.jsoup.parser.Tag tag22 = document2.tag();
        java.lang.String str23 = tag22.getName();
        org.jsoup.parser.Tag tag25 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str26 = tag25.getName();
        org.jsoup.parser.Tag tag27 = tag25.getImplicitParent();
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node33 = document31.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList34 = document31.childNodes();
        org.jsoup.nodes.Attributes attributes35 = document31.attributes();
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element(tag27, "#root", attributes35);
        java.lang.String str37 = tag27.getName();
        java.lang.String str38 = tag27.toString();
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element(tag27, "");
        org.jsoup.parser.Tag tag42 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str43 = tag42.getName();
        boolean boolean44 = tag42.isData();
        java.lang.String str45 = tag42.toString();
        boolean boolean46 = tag27.isValidParent(tag42);
        org.jsoup.nodes.Document document49 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str50 = document49.tagName();
        document49.setBaseUri("");
        org.jsoup.nodes.Element element54 = document49.addClass("");
        org.jsoup.nodes.Element element56 = document49.toggleClass("");
        org.jsoup.nodes.Element element58 = document49.addClass("hi!");
        org.jsoup.parser.Tag tag59 = document49.tag();
        org.jsoup.nodes.Element element61 = document49.addClass("");
        org.jsoup.nodes.Element element63 = document49.prependElement("hi!");
        org.jsoup.parser.Tag tag64 = document49.tag();
        java.lang.String str65 = tag64.getName();
        org.jsoup.parser.Tag tag66 = tag64.getImplicitParent();
        boolean boolean67 = tag66.preserveWhitespace();
        boolean boolean68 = tag27.canContain(tag66);
        boolean boolean69 = tag22.canContain(tag27);
        org.jsoup.nodes.Element element71 = new org.jsoup.nodes.Element(tag22, "<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element72 = element71.firstElementSibling();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        java.lang.String str9 = document2.attr("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document2.nextElementSibling();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
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
        boolean boolean30 = document2.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element31 = document2.nextElementSibling();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = document2.previousElementSibling();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements67 = element66.siblingElements();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
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
        org.jsoup.nodes.Node node28 = element27.previousSibling();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        org.jsoup.select.Elements elements5 = document2.select("#root");
        document2.setBaseUri("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = document2.nextSibling();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = element6.previousSibling();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("body", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node3 = document2.nextSibling();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node32 = element31.previousSibling();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.select.Elements elements8 = element7.parents();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements9 = element7.siblingElements();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
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
        org.jsoup.select.Elements elements34 = document2.getElementsByIndexGreaterThan((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node35 = document2.previousSibling();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.html("hi! ");
        org.jsoup.nodes.Element element12 = element10.addClass("#root");
        org.jsoup.nodes.Element element15 = element10.attr("hi! ", "hi! #document");
        java.lang.String str16 = element15.id();
        org.jsoup.nodes.Element element18 = element15.wrap("hi! #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element15.previousElementSibling();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
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
        org.jsoup.nodes.Element element37 = document2.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node38 = document2.nextSibling();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.parser.Tag tag12 = document2.tag();
        org.jsoup.nodes.Element element14 = document2.addClass("");
        org.jsoup.nodes.Element element16 = document2.prependElement("hi! ");
        org.jsoup.nodes.Element element17 = element16.empty();
        org.jsoup.nodes.Element element18 = element16.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = element18.previousSibling();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList35 = element34.siblingNodes();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        document2.setBaseUri("");
        org.jsoup.select.Elements elements14 = document2.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int15 = document2.siblingIndex();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = element25.text("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("body", "body");
        org.jsoup.nodes.Element element7 = document2.val("#document");
        org.jsoup.nodes.Element element9 = element7.toggleClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = element7.previousSibling();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element18.lastElementSibling();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("\n<body>\n</body>");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str6 = document5.tagName();
        document5.setBaseUri("");
        org.jsoup.nodes.Element element10 = document5.addClass("");
        org.jsoup.nodes.Element element12 = document5.toggleClass("");
        element12.setBaseUri("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes15 = element12.attributes();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag1, "\n<hi!>\n</hi!>", attributes15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = element16.nextSibling();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
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
        org.jsoup.nodes.Element element36 = element34.text("");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
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
        org.jsoup.nodes.Element element34 = document10.appendText("#document");
        boolean boolean35 = document10.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element37 = document10.wrap("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
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
        org.jsoup.parser.Tag tag19 = tag17.getImplicitParent();
        java.lang.String str20 = tag17.toString();
        java.lang.String str21 = tag17.getName();
        org.jsoup.parser.Tag tag22 = tag17.getImplicitParent();
        boolean boolean23 = tag22.isBlock();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag22, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = element25.nextElementSibling();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
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
        org.jsoup.select.Elements elements37 = element34.getElementsByAttributeValueStarting("\n<hi!>\n</hi!>", "hi! ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element39 = element34.wrap("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element element4 = document2.child(0);
        org.jsoup.nodes.Element element5 = element4.parent();
        org.jsoup.nodes.Element element7 = element5.append("hi! #document");
        element7.setBaseUri("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = element7.previousSibling();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        java.lang.String str5 = element4.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element4.nextElementSibling();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Element element8 = element6.prependText("body");
        org.jsoup.parser.Tag tag9 = element8.tag();
        org.jsoup.nodes.Element element12 = element8.attr("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#root");
        java.lang.String str13 = element8.tagName();
        org.jsoup.nodes.Element element15 = element8.appendText("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element15.nextElementSibling();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node32 = element29.nextSibling();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.parser.Tag tag12 = document2.tag();
        org.jsoup.nodes.Element element14 = document2.addClass("");
        org.jsoup.nodes.Element element16 = document2.prependElement("hi! ");
        org.jsoup.nodes.Element element17 = element16.empty();
        org.jsoup.nodes.Element element18 = element16.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element18.firstElementSibling();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
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
        java.lang.String str26 = element23.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element23.wrap("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
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
        org.jsoup.nodes.Element element41 = element29.toggleClass("hi! ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node42 = element29.previousSibling();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        java.lang.String str9 = document2.attr("#root");
        org.jsoup.nodes.Element element11 = document2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element11.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element11.nextElementSibling();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document2.nextElementSibling();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = element18.wrap("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
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
        org.jsoup.nodes.Element element49 = document42.nextElementSibling();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
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
        boolean boolean19 = document2.hasClass("<html>\n<head>\n</head>\n<body>\n &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   #document \n  </body>\n </html>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = document2.nextSibling();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
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
        org.jsoup.nodes.Attributes attributes26 = element24.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element24.lastElementSibling();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node49 = element45.previousSibling();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        java.lang.String str11 = element9.attr("");
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#root");
        org.jsoup.nodes.Element element16 = element9.text("body");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element9.previousElementSibling();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexLessThan((int) (byte) 100);
        org.jsoup.nodes.Element element6 = document2.appendText("hi!");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str10 = document9.tagName();
        document9.setBaseUri("");
        document9.setBaseUri("");
        java.lang.String str16 = document9.attr("#root");
        org.jsoup.nodes.Element element17 = element6.appendChild((org.jsoup.nodes.Node) document9);
        boolean boolean19 = element17.hasAttr("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        java.lang.Integer int20 = element17.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = element17.previousSibling();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node67 = element7.nextSibling();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str10 = document2.absUrl("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        document2.setBaseUri("hi!");
        java.lang.String str13 = document2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = document2.previousSibling();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node32 = element20.previousSibling();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
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
        java.util.Set<java.lang.String> strSet19 = element12.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element12.lastElementSibling();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.html("hi! ");
        org.jsoup.nodes.Element element12 = element10.addClass("#root");
        org.jsoup.select.Elements elements14 = element10.getElementsByTag("#root");
        org.jsoup.nodes.Element element15 = element10.empty();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element10.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element10.previousElementSibling();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "hi! hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.previousElementSibling();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "hi!");
        java.util.Set<java.lang.String> strSet3 = document2.classNames();
        org.jsoup.nodes.Element element5 = document2.val("#document");
        java.lang.String str6 = element5.data();
        java.lang.String str7 = element5.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements8 = element5.siblingElements();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
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
        boolean boolean57 = element54.hasText();
        org.jsoup.parser.Tag tag58 = element54.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element60 = element54.wrap("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        java.lang.String str12 = document2.outerHtml();
        org.jsoup.nodes.Element element14 = document2.child(0);
        org.jsoup.nodes.Element element16 = document2.prependText("hi! hi! #root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList17 = element16.siblingNodes();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        java.lang.String str12 = document2.outerHtml();
        org.jsoup.nodes.Element element14 = document2.child(0);
        org.jsoup.nodes.Element element16 = document2.prependText("hi! hi! #root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = document2.wrap("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root><#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        boolean boolean12 = element9.isBlock();
        org.jsoup.select.Elements elements15 = element9.getElementsByAttributeValueEnding("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>", "#document");
        org.jsoup.nodes.Element element17 = element9.wrap("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element9.text("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
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
        org.jsoup.nodes.Node node34 = element31.previousSibling();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node36 = element32.previousSibling();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
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
        org.jsoup.select.Elements elements21 = document2.getElementsByAttributeValueContaining("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>", "hi! #document");
        java.lang.String str22 = document2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int23 = document2.siblingIndex();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element element4 = document2.child(0);
        org.jsoup.nodes.Element element5 = element4.parent();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Element element8 = element4.prependElement("body");
        org.jsoup.nodes.Element element9 = element4.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements10 = element9.siblingElements();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        java.lang.String str8 = document2.attr("#root");
        org.jsoup.select.Elements elements11 = document2.getElementsByAttributeValueEnding("#root", "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        java.lang.String str12 = document2.data();
        org.jsoup.nodes.Element element14 = document2.html("\n<body>\n</body>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = element14.nextSibling();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueEnding("hi!", "hi!");
        java.lang.String str6 = document2.html();
        org.jsoup.nodes.Element element8 = document2.val("hi! ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element8.wrap("<html>\n<head>\n</head>\n<body>\n &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   #document \n  </body>\n </html>\n</body>\n</html>");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node43 = document2.previousSibling();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.firstElementSibling();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
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
        org.jsoup.nodes.Element element21 = element18.wrap(" hi! <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        java.lang.Integer int5 = document2.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = document2.attr("hi!", "#document");
        boolean boolean10 = element8.hasClass("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        element8.setBaseUri("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = element8.toggleClass("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str18 = document17.tagName();
        document17.setBaseUri("");
        org.jsoup.nodes.Element element22 = document17.addClass("");
        org.jsoup.select.Elements elements23 = element22.parents();
        org.jsoup.select.Elements elements24 = element22.getAllElements();
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str28 = document27.tagName();
        document27.setBaseUri("");
        org.jsoup.nodes.Element element32 = document27.addClass("");
        org.jsoup.nodes.Element element34 = document27.toggleClass("");
        org.jsoup.nodes.Element element36 = element34.html("");
        boolean boolean37 = element34.isBlock();
        java.lang.String[] strArray42 = new java.lang.String[] { "", "body", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        org.jsoup.nodes.Element element45 = element34.classNames((java.util.Set<java.lang.String>) strSet43);
        org.jsoup.nodes.Element element46 = element22.classNames((java.util.Set<java.lang.String>) strSet43);
        org.jsoup.nodes.Element element47 = element14.classNames((java.util.Set<java.lang.String>) strSet43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements48 = element14.siblingElements();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        document2.setBaseUri("");
        org.jsoup.select.Elements elements14 = document2.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element16 = document2.appendText("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element16.lastElementSibling();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.nodes.Element element9 = document2.text("");
        org.jsoup.nodes.Element element11 = element9.prepend("");
        org.jsoup.select.Elements elements13 = element9.getElementsByIndexGreaterThan((int) (byte) 10);
        org.jsoup.nodes.Element element15 = element9.appendText("hi! #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements16 = element15.siblingElements();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi! ", "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.previousElementSibling();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValue("hi! ", "#root");
        org.jsoup.nodes.Element element16 = element9.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element17 = element9.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements18 = element9.siblingElements();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
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
        org.jsoup.nodes.Element element23 = element20.firstElementSibling();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements55 = element54.siblingElements();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "hi!");
        java.lang.String str3 = document2.toString();
        org.jsoup.nodes.Element element5 = document2.text("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document2.wrap("hi! ");
        org.jsoup.nodes.Element element9 = document2.prependText("hi! hi! #root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int10 = document2.siblingIndex();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("body", "body");
        org.jsoup.nodes.Element element7 = document2.val("#document");
        org.jsoup.nodes.Element element9 = element7.toggleClass("");
        org.jsoup.nodes.Element element12 = element9.attr("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "hi! ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element12.siblingNodes();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
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
        java.lang.String str23 = document22.tagName();
        document22.setBaseUri("");
        document22.setBaseUri("");
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str31 = document30.tagName();
        document30.setBaseUri("");
        document30.setBaseUri("");
        org.jsoup.nodes.Element element36 = document22.appendChild((org.jsoup.nodes.Node) document30);
        org.jsoup.nodes.Element element37 = document22.empty();
        org.jsoup.nodes.Node node39 = document22.removeAttr("#root");
        java.lang.String str40 = document22.nodeName();
        java.lang.String str41 = document22.outerHtml();
        document22.setBaseUri("");
        org.jsoup.nodes.Element element44 = element17.prependChild((org.jsoup.nodes.Node) document22);
        org.jsoup.select.Elements elements46 = element44.getElementsByAttribute("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        boolean boolean48 = element44.hasClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element49 = element44.nextElementSibling();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean4 = document2.hasAttr("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        java.lang.String str5 = document2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document2.siblingNodes();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        org.jsoup.nodes.Node node6 = document2.childNode(0);
        boolean boolean8 = document2.hasClass("#root");
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexLessThan((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document2.previousElementSibling();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str10 = document2.absUrl("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        document2.setBaseUri("hi!");
        java.lang.String str13 = document2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = document2.lastElementSibling();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        java.lang.Integer int5 = document2.elementSiblingIndex();
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element9 = document2.html("\n<body>\n</body>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element9.lastElementSibling();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
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
        org.jsoup.select.Elements elements33 = element20.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element34 = element20.nextElementSibling();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
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
        org.jsoup.nodes.Element element34 = document10.html("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element35 = document10.lastElementSibling();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValue("hi! ", "#root");
        org.jsoup.nodes.Element element16 = element9.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str17 = element16.className();
        org.jsoup.nodes.Node node19 = element16.childNode((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int20 = element16.siblingIndex();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        document2.setBaseUri("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        java.lang.String str12 = document2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document2.nextElementSibling();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
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
        org.jsoup.parser.Tag tag19 = tag18.getImplicitParent();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str23 = document22.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = document22.childNodes();
        boolean boolean26 = document22.hasAttr("#root");
        org.jsoup.parser.Tag tag27 = document22.tag();
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str31 = document30.tagName();
        document30.setBaseUri("");
        document30.setBaseUri("");
        org.jsoup.nodes.Document document38 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str39 = document38.tagName();
        document38.setBaseUri("");
        document38.setBaseUri("");
        org.jsoup.nodes.Element element45 = document38.appendText("#root");
        org.jsoup.nodes.Element element46 = document30.appendChild((org.jsoup.nodes.Node) document38);
        boolean boolean47 = tag27.equals((java.lang.Object) element46);
        org.jsoup.parser.Tag tag49 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str50 = tag49.getName();
        org.jsoup.parser.Tag tag51 = tag49.getImplicitParent();
        boolean boolean52 = tag27.canContain(tag51);
        org.jsoup.nodes.Document document55 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str56 = document55.tagName();
        document55.setBaseUri("");
        org.jsoup.nodes.Element element60 = document55.addClass("");
        boolean boolean61 = tag27.equals((java.lang.Object) "");
        boolean boolean62 = tag27.canContainBlock();
        boolean boolean63 = tag19.isValidParent(tag27);
        boolean boolean64 = tag27.isInline();
        org.jsoup.nodes.Document document67 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str68 = document67.tagName();
        document67.setBaseUri("");
        org.jsoup.select.Elements elements72 = document67.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.nodes.Element element74 = document67.text("");
        org.jsoup.nodes.Element element76 = element74.prepend("");
        org.jsoup.select.Elements elements78 = element74.getElementsByIndexGreaterThan((int) (byte) 10);
        org.jsoup.nodes.Element element80 = element74.appendText("hi! #document");
        boolean boolean81 = tag27.equals((java.lang.Object) element80);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element82 = element80.firstElementSibling();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
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
        java.lang.String str48 = element45.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element50 = element45.wrap("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Element element8 = document2.prependText("#root");
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element element13 = document11.child(0);
        java.util.Set<java.lang.String> strSet14 = element13.classNames();
        boolean boolean15 = element8.equals((java.lang.Object) element13);
        org.jsoup.nodes.Element element17 = element8.append("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element17.firstElementSibling();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("\n<body>\n</body>", "\n<hi!>\n</hi!>");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str6 = document5.tagName();
        document5.setBaseUri("");
        document5.setBaseUri("");
        org.jsoup.nodes.Element element12 = document5.appendText("#root");
        org.jsoup.select.Elements elements13 = element12.getAllElements();
        org.jsoup.select.Elements elements15 = element12.select("#document");
        boolean boolean16 = document2.equals((java.lang.Object) element12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element12.firstElementSibling();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
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
        java.lang.String str44 = document2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element45 = document2.firstElementSibling();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
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
        org.jsoup.select.Elements elements58 = element54.getElementsByClass("<html>\n<head>\n</head>\n<body>\n body\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements59 = element54.siblingElements();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
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
        java.lang.String str57 = element54.html();
        boolean boolean58 = element54.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList59 = element54.siblingNodes();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        java.lang.String str9 = document2.attr("#root");
        org.jsoup.parser.Tag tag10 = document2.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document2.previousElementSibling();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        java.lang.String str8 = tag7.toString();
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str13 = document12.tagName();
        document12.setBaseUri("");
        org.jsoup.nodes.Element element17 = document12.addClass("");
        org.jsoup.nodes.Element element19 = document12.toggleClass("");
        element19.setBaseUri("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes22 = element19.attributes();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag7, "hi! #document", attributes22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList24 = element23.siblingNodes();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element9 = document2.appendText("hi! ");
        org.jsoup.nodes.Element element11 = element9.removeClass("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.select.Elements elements13 = element11.getElementsByClass("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.select.Elements elements16 = element11.getElementsByAttributeValueStarting("hi! #document", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element11.wrap("<html>\n<head>\n</head>\n<body>\n &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   #document \n  </body>\n </html>\n</body>\n</html>");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element36 = element32.previousElementSibling();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
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
        org.jsoup.nodes.Element element21 = element18.addClass("#root");
        java.lang.String str22 = element21.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element21.previousElementSibling();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
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
        boolean boolean19 = document10.hasText();
        org.jsoup.nodes.Element element20 = document10.empty();
        document10.remove();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList22 = document10.siblingNodes();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList36 = element32.siblingNodes();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element9 = element7.appendText("hi! ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element9.siblingNodes();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.nodes.Element element4 = document2.appendText("body#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = element4.previousElementSibling();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
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
        org.jsoup.select.Elements elements21 = document2.getElementsByAttributeValueContaining("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>", "hi! #document");
        boolean boolean23 = document2.hasClass("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = document2.previousElementSibling();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        org.jsoup.nodes.Element element6 = document2.addClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document2.nextElementSibling();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        java.lang.Integer int5 = document2.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = document2.attr("hi!", "#document");
        boolean boolean10 = element8.hasClass("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        element8.setBaseUri("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = element8.toggleClass("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str18 = document17.tagName();
        document17.setBaseUri("");
        org.jsoup.nodes.Element element22 = document17.addClass("");
        org.jsoup.select.Elements elements23 = element22.parents();
        org.jsoup.select.Elements elements24 = element22.getAllElements();
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str28 = document27.tagName();
        document27.setBaseUri("");
        org.jsoup.nodes.Element element32 = document27.addClass("");
        org.jsoup.nodes.Element element34 = document27.toggleClass("");
        org.jsoup.nodes.Element element36 = element34.html("");
        boolean boolean37 = element34.isBlock();
        java.lang.String[] strArray42 = new java.lang.String[] { "", "body", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        org.jsoup.nodes.Element element45 = element34.classNames((java.util.Set<java.lang.String>) strSet43);
        org.jsoup.nodes.Element element46 = element22.classNames((java.util.Set<java.lang.String>) strSet43);
        org.jsoup.nodes.Element element47 = element14.classNames((java.util.Set<java.lang.String>) strSet43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements48 = element47.siblingElements();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element element4 = document2.child(0);
        org.jsoup.nodes.Element element5 = element4.parent();
        org.jsoup.nodes.Element element7 = element5.append("hi! #document");
        org.jsoup.nodes.Element element9 = element5.prepend("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int10 = element5.siblingIndex();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
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
        java.lang.String str52 = element45.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element53 = element45.previousElementSibling();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        java.lang.String str8 = document2.data();
        java.lang.String str10 = document2.absUrl(" body hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int11 = document2.siblingIndex();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node3 = document2.previousSibling();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
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
        boolean boolean24 = document2.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = document2.text("#root");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
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
        org.jsoup.select.Elements elements33 = element29.children();
        org.jsoup.nodes.Element element35 = element29.text("body");
        java.lang.String str36 = element35.data();
        org.jsoup.nodes.Element element39 = element35.attr("hi! #document", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements40 = element39.siblingElements();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
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
        java.lang.String str23 = document22.tagName();
        document22.setBaseUri("");
        document22.setBaseUri("");
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str31 = document30.tagName();
        document30.setBaseUri("");
        document30.setBaseUri("");
        org.jsoup.nodes.Element element36 = document22.appendChild((org.jsoup.nodes.Node) document30);
        org.jsoup.nodes.Element element37 = document22.empty();
        org.jsoup.nodes.Node node39 = document22.removeAttr("#root");
        java.lang.String str40 = document22.nodeName();
        java.lang.String str41 = document22.outerHtml();
        document22.setBaseUri("");
        org.jsoup.nodes.Element element44 = element17.prependChild((org.jsoup.nodes.Node) document22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element46 = document22.text("\n<body>\n</body>");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.select.Elements elements9 = document2.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.select.Elements elements11 = document2.getElementsByAttribute("\n<hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int12 = document2.siblingIndex();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.parser.Tag tag12 = document2.tag();
        org.jsoup.nodes.Element element14 = document2.addClass("");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str18 = document17.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document17.childNodes();
        org.jsoup.nodes.Node node21 = document17.childNode(0);
        org.jsoup.nodes.Element element23 = document17.val("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element25 = element23.toggleClass("hi! #document");
        java.lang.String str26 = element25.className();
        org.jsoup.nodes.Element element27 = element14.appendChild((org.jsoup.nodes.Node) element25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements28 = element14.siblingElements();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "hi!");
        org.jsoup.nodes.Element element4 = document2.prepend("hi! ");
        java.lang.String str5 = element4.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element4.previousElementSibling();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n body\n</body>\n</html>", "<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.nextElementSibling();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
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
        org.jsoup.select.Elements elements20 = document2.getElementsByClass("hi!");
        org.jsoup.select.Elements elements23 = document2.getElementsByAttributeValueStarting("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element25 = document2.append("\n<body>\n</body>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node26 = document2.nextSibling();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements4 = document2.getElementsByAttribute("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document");
        java.lang.String str5 = document2.nodeName();
        boolean boolean7 = document2.hasClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements8 = document2.siblingElements();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
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
        org.jsoup.nodes.Document document34 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str35 = document34.tagName();
        document34.setBaseUri("");
        org.jsoup.nodes.Element element39 = document34.addClass("");
        org.jsoup.nodes.Element element41 = document34.toggleClass("");
        org.jsoup.nodes.Element element43 = document34.append("hi!");
        org.jsoup.nodes.Element element44 = element31.appendChild((org.jsoup.nodes.Node) element43);
        org.jsoup.nodes.Element element45 = element43.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element47 = element45.text("hi! <html> <head> </head> <body> hi! </body> </html>hi! hi!");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
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
        java.lang.String str28 = element27.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = element27.wrap("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>\n</#root>");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.select.Elements elements8 = element7.parents();
        java.lang.String str10 = element7.absUrl("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str14 = document13.tagName();
        document13.setBaseUri("");
        org.jsoup.nodes.Element element18 = document13.addClass("");
        org.jsoup.select.Elements elements19 = element18.parents();
        org.jsoup.select.Elements elements20 = element18.getAllElements();
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str24 = document23.tagName();
        document23.setBaseUri("");
        org.jsoup.nodes.Element element28 = document23.addClass("");
        org.jsoup.nodes.Element element30 = document23.toggleClass("");
        org.jsoup.nodes.Element element32 = element30.html("");
        boolean boolean33 = element30.isBlock();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "body", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        org.jsoup.nodes.Element element41 = element30.classNames((java.util.Set<java.lang.String>) strSet39);
        org.jsoup.nodes.Element element42 = element18.classNames((java.util.Set<java.lang.String>) strSet39);
        java.lang.String str43 = element18.id();
        boolean boolean44 = element7.equals((java.lang.Object) element18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element45 = element18.firstElementSibling();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        org.jsoup.nodes.Element element11 = document2.wrap("#root");
        java.lang.String str12 = document2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.siblingNodes();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.html("hi! ");
        org.jsoup.select.Elements elements12 = element10.getElementsByAttribute("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        java.lang.String str13 = element10.data();
        org.jsoup.select.Elements elements14 = element10.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = element10.previousSibling();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        java.lang.String str9 = document2.attr("#root");
        org.jsoup.nodes.Element element11 = document2.text("");
        java.lang.String str12 = document2.nodeName();
        org.jsoup.select.Elements elements14 = document2.getElementsByIndexEquals((int) (short) 0);
        boolean boolean16 = document2.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document2.lastElementSibling();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.nodes.Element element9 = document2.text("");
        org.jsoup.nodes.Element element11 = element9.prepend("");
        org.jsoup.select.Elements elements13 = element9.getElementsByIndexGreaterThan((int) (byte) 10);
        org.jsoup.nodes.Element element15 = element9.appendText("hi! #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = element9.nextSibling();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "hi!");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueStarting("hi! ", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str6 = document2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements7 = document2.siblingElements();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        document2.setBaseUri("");
        java.lang.String str9 = document2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = document2.nextSibling();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
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
        org.jsoup.nodes.Node node41 = element29.removeAttr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList42 = node41.siblingNodes();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element46 = element45.previousElementSibling();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
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
        org.jsoup.nodes.Element element34 = element29.attr("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root><#document>\n</#document>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element35 = element34.previousElementSibling();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
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
        java.util.List<org.jsoup.nodes.Node> nodeList18 = document2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = document2.lastElementSibling();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document2.wrap("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>body");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        java.lang.String str8 = document2.attr("#root");
        org.jsoup.select.Elements elements11 = document2.getElementsByAttributeValueEnding("#root", "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        java.lang.String str12 = document2.data();
        org.jsoup.nodes.Element element14 = document2.html("\n<body>\n</body>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int15 = element14.siblingIndex();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
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
        org.jsoup.select.Elements elements34 = document2.getElementsByIndexGreaterThan((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int35 = document2.siblingIndex();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValue("hi! ", "#root");
        org.jsoup.nodes.Element element16 = element9.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element19 = element9.attr("hi! #document", "#root");
        element9.setBaseUri("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements22 = element9.siblingElements();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element9 = document2.appendText("hi! ");
        org.jsoup.nodes.Element element11 = element9.removeClass("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.select.Elements elements13 = element9.select("body");
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str16 = tag15.getName();
        org.jsoup.parser.Tag tag17 = tag15.getImplicitParent();
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node23 = document21.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = document21.childNodes();
        org.jsoup.nodes.Attributes attributes25 = document21.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag17, "#root", attributes25);
        org.jsoup.select.Elements elements29 = element26.getElementsByAttributeValueStarting("#document", "hi! #document");
        java.lang.String str30 = element26.baseUri();
        org.jsoup.nodes.Element element31 = element9.appendChild((org.jsoup.nodes.Node) element26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements32 = element31.siblingElements();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
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
        org.jsoup.nodes.Element element57 = element54.appendElement("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node58 = element54.previousSibling();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
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
        org.jsoup.nodes.Element element25 = document2.prepend("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = element25.firstElementSibling();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
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
        java.lang.String str25 = element24.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node26 = element24.previousSibling();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
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
        org.jsoup.nodes.Element element31 = element29.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean33 = element31.hasClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element35 = element31.prepend("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element36 = element35.nextElementSibling();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        org.jsoup.select.Elements elements9 = document2.getElementsByIndexLessThan((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = document2.nextSibling();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element10 = document2.val("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = document2.previousSibling();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValue("hi! ", "#root");
        org.jsoup.nodes.Element element16 = element9.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element19 = element9.attr("hi! #document", "#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element9.previousElementSibling();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.previousElementSibling();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.lang.String str5 = document2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document2.siblingNodes();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element56 = element29.firstElementSibling();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
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
        org.jsoup.select.Elements elements30 = element27.getElementsByAttributeValueNot("hi! #root", "\n<body>\n</body>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element31 = element27.previousElementSibling();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.nodes.Element element9 = document2.text("");
        boolean boolean10 = document2.isBlock();
        java.lang.String str11 = document2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document2.wrap("<hi! #document>\n</hi! #document>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
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
        org.jsoup.nodes.Element element29 = document10.addClass("hi!");
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node34 = document32.removeAttr("hi!");
        org.jsoup.nodes.Element element36 = document32.addClass("");
        org.jsoup.nodes.Element element37 = document10.prependChild((org.jsoup.nodes.Node) element36);
        java.lang.String str38 = element37.nodeName();
        org.jsoup.nodes.Element element40 = element37.appendText("#document");
        java.lang.String str41 = element37.baseUri();
        java.lang.Integer int42 = element37.elementSiblingIndex();
        org.jsoup.nodes.Document document45 = org.jsoup.parser.Parser.parse("#root", "hi!");
        java.util.Set<java.lang.String> strSet46 = document45.classNames();
        org.jsoup.nodes.Element element47 = element37.classNames(strSet46);
        org.jsoup.nodes.Element element49 = element37.toggleClass("hi! ");
        boolean boolean50 = element7.equals((java.lang.Object) element37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element51 = element7.firstElementSibling();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValue("hi! ", "#root");
        org.jsoup.nodes.Element element16 = element9.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements19 = element16.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "#root");
        org.jsoup.select.Elements elements22 = element16.getElementsByAttributeValue("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>", "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        java.lang.String str23 = element16.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements24 = element16.siblingElements();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element36 = element31.wrap("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n   <html> \n    <head> \n    </head> \n    <body>\n      hi! #document    \n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.nodes.Element element8 = document2.prependText("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int9 = element8.siblingIndex();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
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
        org.jsoup.nodes.Attributes attributes35 = element34.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element36 = element34.previousElementSibling();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node69 = element66.nextSibling();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
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
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element18.childNodes();
        org.jsoup.nodes.Element element24 = element18.child(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements25 = element18.siblingElements();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        org.jsoup.nodes.Node node6 = document2.childNode(0);
        org.jsoup.nodes.Element element8 = document2.val("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = element8.previousSibling();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
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
        java.lang.Integer int17 = element12.siblingIndex();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element39 = element12.firstElementSibling();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element35 = element33.text("\n<&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>\n</&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
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
        org.jsoup.nodes.Element element34 = document10.html("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element36 = document10.text(" hi! <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
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
        org.jsoup.nodes.Element element38 = document2.toggleClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element39 = element38.firstElementSibling();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
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
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str28 = document27.tagName();
        document27.setBaseUri("");
        document27.setBaseUri("");
        org.jsoup.nodes.Document document35 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str36 = document35.tagName();
        document35.setBaseUri("");
        document35.setBaseUri("");
        org.jsoup.nodes.Element element41 = document27.appendChild((org.jsoup.nodes.Node) document35);
        org.jsoup.nodes.Element element42 = document27.empty();
        org.jsoup.nodes.Node node44 = document27.removeAttr("#root");
        org.jsoup.nodes.Element element46 = document27.addClass("hi!");
        org.jsoup.nodes.Document document49 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node51 = document49.removeAttr("hi!");
        org.jsoup.nodes.Element element53 = document49.addClass("");
        org.jsoup.nodes.Element element54 = document27.prependChild((org.jsoup.nodes.Node) element53);
        org.jsoup.nodes.Element element56 = element53.prependElement("#document");
        boolean boolean57 = element12.equals((java.lang.Object) "#document");
        org.jsoup.nodes.Element element59 = element12.prepend("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element60 = element59.previousElementSibling();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "hi!");
        java.util.Set<java.lang.String> strSet3 = document2.classNames();
        org.jsoup.nodes.Element element5 = document2.val("#document");
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str9 = document8.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document8.childNodes();
        org.jsoup.nodes.Element element11 = document2.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements14 = document2.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n body\n</body>\n</html>", "&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = document2.lastElementSibling();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.parser.Tag tag12 = document2.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = document2.nextSibling();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "hi!");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueStarting("hi! ", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str6 = document2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document2.wrap("<html>\n<head>\n</head>\n<body>\n &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   #document \n  </body>\n </html>\n</body>\n</html>");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element10 = document2.child((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document2.previousElementSibling();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
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
        org.jsoup.select.Elements elements35 = document2.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node36 = document2.previousSibling();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.html("hi! ");
        org.jsoup.nodes.Element element12 = element10.addClass("#root");
        org.jsoup.nodes.Element element15 = element10.attr("hi! ", "hi! #document");
        org.jsoup.select.Elements elements17 = element15.getElementsByIndexEquals(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements18 = element15.siblingElements();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.select.Elements elements8 = element7.parents();
        java.lang.String str10 = element7.absUrl("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element7.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = element7.toggleClass("hi! ");
        org.jsoup.select.Elements elements18 = element15.getElementsByAttributeValue(" hi! <html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<#root>\n</#root>");
        boolean boolean19 = element15.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = element15.previousSibling();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.html("hi! ");
        org.jsoup.select.Elements elements12 = element10.getElementsByAttribute("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        element10.setBaseUri("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element10.text("");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
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
        java.lang.String str20 = element18.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = element18.previousSibling();
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi! #document", "hi! ");
        org.jsoup.nodes.Element element4 = document2.text("<html>\n<head>\n</head>\n<body>\n &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   #document \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttributeValueNot("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n body\n</body>\n</html>#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document2.nextElementSibling();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element39 = element36.nextElementSibling();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        java.lang.String str5 = element4.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element4.previousElementSibling();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.html("hi! ");
        org.jsoup.nodes.Element element12 = element10.addClass("#root");
        org.jsoup.nodes.Element element15 = element10.attr("hi! ", "hi! #document");
        org.jsoup.select.Elements elements17 = element15.getElementsByIndexEquals(1);
        org.jsoup.select.Elements elements18 = element15.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = element15.previousSibling();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
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
        java.util.List<org.jsoup.nodes.Node> nodeList32 = element31.siblingNodes();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi! ", "<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document");
        org.jsoup.nodes.Element element4 = document2.prependText("body");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = element4.previousSibling();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexEquals((int) (short) 0);
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str8 = document7.tagName();
        document7.setBaseUri("");
        org.jsoup.nodes.Element element12 = document7.addClass("");
        org.jsoup.nodes.Element element14 = document7.toggleClass("");
        org.jsoup.nodes.Element element16 = element14.html("");
        boolean boolean17 = element14.isBlock();
        java.lang.String[] strArray22 = new java.lang.String[] { "", "body", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        org.jsoup.nodes.Element element25 = element14.classNames((java.util.Set<java.lang.String>) strSet23);
        org.jsoup.nodes.Element element26 = document2.classNames((java.util.Set<java.lang.String>) strSet23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int27 = document2.siblingIndex();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element10 = document2.toggleClass("hi!");
        org.jsoup.nodes.Element element12 = element10.toggleClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = element12.addClass(" body hi!");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str18 = document17.tagName();
        document17.setBaseUri("");
        document17.setBaseUri("");
        org.jsoup.nodes.Document document25 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str26 = document25.tagName();
        document25.setBaseUri("");
        document25.setBaseUri("");
        org.jsoup.nodes.Element element31 = document17.appendChild((org.jsoup.nodes.Node) document25);
        org.jsoup.nodes.Element element32 = document17.empty();
        boolean boolean33 = document17.hasText();
        org.jsoup.nodes.Document document36 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str37 = document36.tagName();
        document36.setBaseUri("");
        org.jsoup.nodes.Element element41 = document36.addClass("");
        org.jsoup.select.Elements elements42 = element41.parents();
        org.jsoup.select.Elements elements43 = element41.getAllElements();
        org.jsoup.nodes.Document document46 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str47 = document46.tagName();
        document46.setBaseUri("");
        org.jsoup.nodes.Element element51 = document46.addClass("");
        org.jsoup.nodes.Element element53 = document46.toggleClass("");
        org.jsoup.nodes.Element element55 = element53.html("");
        boolean boolean56 = element53.isBlock();
        java.lang.String[] strArray61 = new java.lang.String[] { "", "body", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet62 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet62, strArray61);
        org.jsoup.nodes.Element element64 = element53.classNames((java.util.Set<java.lang.String>) strSet62);
        org.jsoup.nodes.Element element65 = element41.classNames((java.util.Set<java.lang.String>) strSet62);
        org.jsoup.nodes.Element element66 = document17.classNames((java.util.Set<java.lang.String>) strSet62);
        org.jsoup.nodes.Element element67 = element12.classNames((java.util.Set<java.lang.String>) strSet62);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element68 = element67.nextElementSibling();
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "hi!");
        org.jsoup.nodes.Element element4 = document2.prepend("hi! ");
        java.lang.String str5 = document2.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document2.previousElementSibling();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
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
        element31.remove();
        org.jsoup.parser.Tag tag34 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str35 = tag34.getName();
        org.jsoup.parser.Tag tag36 = tag34.getImplicitParent();
        org.jsoup.nodes.Document document40 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node42 = document40.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList43 = document40.childNodes();
        org.jsoup.nodes.Attributes attributes44 = document40.attributes();
        org.jsoup.nodes.Element element45 = new org.jsoup.nodes.Element(tag36, "#root", attributes44);
        org.jsoup.select.Elements elements48 = element45.getElementsByAttributeValueStarting("#document", "hi! #document");
        java.lang.String str49 = element45.baseUri();
        org.jsoup.nodes.Document document52 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str53 = document52.tagName();
        document52.setBaseUri("");
        org.jsoup.nodes.Element element57 = document52.addClass("");
        org.jsoup.nodes.Element element59 = document52.toggleClass("");
        org.jsoup.nodes.Element element61 = element59.html("");
        boolean boolean62 = element59.isBlock();
        java.lang.String[] strArray67 = new java.lang.String[] { "", "body", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet68 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet68, strArray67);
        org.jsoup.nodes.Element element70 = element59.classNames((java.util.Set<java.lang.String>) strSet68);
        org.jsoup.nodes.Element element71 = element45.classNames((java.util.Set<java.lang.String>) strSet68);
        org.jsoup.nodes.Element element72 = element31.classNames((java.util.Set<java.lang.String>) strSet68);
        org.jsoup.select.Elements elements73 = element31.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element74 = element31.firstElementSibling();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
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
        org.jsoup.nodes.Element element33 = element20.prepend("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node34 = element33.previousSibling();
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        java.lang.String str9 = document2.attr("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements10 = document2.siblingElements();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        java.lang.String str17 = document2.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = document2.nextSibling();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
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
        java.lang.String str41 = element39.attr("\n<hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element42 = element39.nextElementSibling();
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
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
        java.lang.String str48 = element45.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node49 = element45.nextSibling();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
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
        org.jsoup.select.Elements elements23 = document2.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList24 = document2.siblingNodes();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
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
        org.jsoup.nodes.Element element35 = element34.nextElementSibling();
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document", "hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element4 = document2.append("hi! #root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = element4.previousSibling();
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element36 = element32.wrap("\n<body>\n</body>");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = element9.wrap("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        java.lang.String str9 = document2.attr("#root");
        org.jsoup.nodes.Element element11 = document2.text("");
        boolean boolean12 = document2.isBlock();
        boolean boolean13 = document2.hasText();
        java.util.Set<java.lang.String> strSet14 = document2.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int15 = document2.siblingIndex();
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
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
        org.jsoup.nodes.Element element29 = document10.addClass("hi!");
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node34 = document32.removeAttr("hi!");
        org.jsoup.nodes.Element element36 = document32.addClass("");
        org.jsoup.nodes.Element element37 = document10.prependChild((org.jsoup.nodes.Node) element36);
        java.lang.String str38 = element37.nodeName();
        org.jsoup.nodes.Element element40 = element37.appendText("#document");
        java.lang.String str41 = element37.baseUri();
        java.lang.Integer int42 = element37.elementSiblingIndex();
        org.jsoup.nodes.Document document45 = org.jsoup.parser.Parser.parse("#root", "hi!");
        java.util.Set<java.lang.String> strSet46 = document45.classNames();
        org.jsoup.nodes.Element element47 = element37.classNames(strSet46);
        org.jsoup.nodes.Element element49 = element37.toggleClass("hi! ");
        boolean boolean50 = element7.equals((java.lang.Object) element37);
        org.jsoup.nodes.Element element51 = element7.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element52 = element7.nextElementSibling();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        document2.setBaseUri("");
        java.lang.String str9 = document2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = document2.previousSibling();
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        java.lang.String str3 = document2.tagName();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = document2.html();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str9 = document8.tagName();
        document8.setBaseUri("");
        document8.setBaseUri("");
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str17 = document16.tagName();
        document16.setBaseUri("");
        document16.setBaseUri("");
        org.jsoup.nodes.Element element22 = document8.appendChild((org.jsoup.nodes.Node) document16);
        org.jsoup.nodes.Element element23 = document8.empty();
        org.jsoup.nodes.Node node25 = document8.removeAttr("#root");
        org.jsoup.nodes.Element element27 = document8.addClass("hi!");
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node32 = document30.removeAttr("hi!");
        org.jsoup.nodes.Element element34 = document30.addClass("");
        org.jsoup.nodes.Element element35 = document8.prependChild((org.jsoup.nodes.Node) element34);
        java.lang.String str36 = element35.nodeName();
        org.jsoup.select.Elements elements38 = element35.select("body");
        org.jsoup.nodes.Element element40 = element35.child(0);
        boolean boolean42 = element40.hasAttr("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document45 = org.jsoup.parser.Parser.parse("#root", "hi!");
        java.util.Set<java.lang.String> strSet46 = document45.classNames();
        org.jsoup.nodes.Element element47 = element40.classNames(strSet46);
        org.jsoup.nodes.Element element48 = document2.classNames(strSet46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element50 = document2.wrap("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n</#root>");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
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
        java.lang.String str17 = element16.baseUri();
        org.jsoup.select.Elements elements20 = element16.getElementsByAttributeValueContaining("#root", "<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element21 = element16.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = element21.previousSibling();
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element18.previousElementSibling();
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
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
        java.lang.String str20 = element19.nodeName();
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
        org.jsoup.nodes.Element element42 = document23.html("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element44 = document23.prepend("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>body");
        org.jsoup.nodes.Element element45 = element19.prependChild((org.jsoup.nodes.Node) element44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element46 = element45.lastElementSibling();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element element4 = document2.child(0);
        org.jsoup.nodes.Element element5 = element4.parent();
        org.jsoup.nodes.Element element7 = element5.append("hi! #document");
        org.jsoup.nodes.Element element9 = element7.appendElement("hi! hi! #root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element7.lastElementSibling();
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element9 = element7.appendText("hi! ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = element7.nextSibling();
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "hi!");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("body", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element9 = document2.prependChild((org.jsoup.nodes.Node) document5);
        java.lang.String str10 = element9.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = element9.nextSibling();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str2 = tag1.getName();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node9 = document7.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document7.childNodes();
        org.jsoup.nodes.Attributes attributes11 = document7.attributes();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag3, "#root", attributes11);
        java.lang.String str13 = tag3.getName();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag3, "");
        boolean boolean16 = tag3.isInline();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag3, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements19 = element18.siblingElements();
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element10 = document2.val("#document");
        org.jsoup.nodes.Element element12 = document2.prependText("\n<hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element12.wrap(" hi! <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        document2.setBaseUri("#root");
        org.jsoup.select.Elements elements10 = document2.getElementsByClass("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document2.nextElementSibling();
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
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
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str33 = document32.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = document32.childNodes();
        boolean boolean36 = document32.hasAttr("#root");
        document32.setBaseUri("");
        org.jsoup.nodes.Element element40 = document32.toggleClass("hi!");
        org.jsoup.nodes.Element element42 = element40.toggleClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element43 = element27.prependChild((org.jsoup.nodes.Node) element42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element44 = element27.lastElementSibling();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        org.jsoup.select.Elements elements5 = document2.select("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document2.previousElementSibling();
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
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
        org.jsoup.nodes.Element element26 = document2.prependText("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str27 = document2.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node28 = document2.previousSibling();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexLessThan((int) (byte) 100);
        org.jsoup.nodes.Element element6 = document2.appendText("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = document2.previousSibling();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.html("hi! ");
        org.jsoup.select.Elements elements12 = element10.getElementsByAttribute("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        java.lang.String str13 = element10.data();
        org.jsoup.select.Elements elements16 = element10.getElementsByAttributeValueEnding("hi!", "<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    hi!  \n  </body>\n </html>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = element10.nextSibling();
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element33 = element32.previousElementSibling();
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.select.Elements elements8 = element7.parents();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = element7.previousSibling();
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
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
        org.jsoup.nodes.Element element57 = element54.appendElement("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element59 = element54.wrap("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
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
        boolean boolean31 = document2.hasAttr("\n<body>\n</body>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element32 = document2.previousElementSibling();
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        java.lang.String str9 = element7.absUrl("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements11 = element7.getElementsByClass("<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element7.firstElementSibling();
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
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
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag7, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element39 = element38.nextElementSibling();
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("\n<body>\n</body>");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str6 = document5.tagName();
        document5.setBaseUri("");
        org.jsoup.nodes.Element element10 = document5.addClass("");
        org.jsoup.nodes.Element element12 = document5.toggleClass("");
        element12.setBaseUri("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes15 = element12.attributes();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag1, "\n<hi!>\n</hi!>", attributes15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList17 = element16.siblingNodes();
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element12 = document2.empty();
        java.lang.String str13 = element12.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element12.firstElementSibling();
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
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
        org.jsoup.select.Elements elements32 = element29.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element33 = element29.firstElementSibling();
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
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
        java.lang.Integer int19 = document2.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = document2.firstElementSibling();
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element12 = document2.empty();
        org.jsoup.nodes.Element element13 = element12.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element13.nextElementSibling();
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        org.jsoup.select.Elements elements10 = element9.getAllElements();
        org.jsoup.nodes.Node node12 = element9.removeAttr("<html> \n<head> \n</head> \n<body>\n  hi!  hi!&lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   \n  </body>\n </html>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element9.siblingNodes();
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValue("hi! ", "#root");
        org.jsoup.nodes.Element element16 = element9.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements19 = element16.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "#root");
        org.jsoup.select.Elements elements21 = element16.getElementsByIndexGreaterThan(100);
        org.jsoup.nodes.Element element23 = element16.html("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = element16.nextElementSibling();
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Element element8 = element6.prependText("body");
        org.jsoup.nodes.Attributes attributes9 = element6.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element6.nextElementSibling();
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList48 = document2.siblingNodes();
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList55 = element29.siblingNodes();
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
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
        java.lang.String str21 = element20.text();
        java.lang.String str22 = element20.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element20.firstElementSibling();
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
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
        boolean boolean22 = element18.hasClass("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element24 = element18.addClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element26 = element18.wrap("hi! hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element18.previousElementSibling();
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        org.jsoup.select.Elements elements10 = document2.parents();
        boolean boolean12 = document2.hasAttr("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.select.Elements elements14 = document2.select("#document");
        org.jsoup.nodes.Element element16 = document2.prependText(" body hi!");
        org.jsoup.select.Elements elements17 = document2.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = document2.firstElementSibling();
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        java.lang.String str8 = document2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = document2.nextSibling();
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
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
        boolean boolean34 = tag7.isEmpty();
        org.jsoup.nodes.Document document37 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str38 = document37.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = document37.childNodes();
        org.jsoup.nodes.Node node41 = document37.childNode(0);
        org.jsoup.nodes.Element element43 = document37.val("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean44 = tag7.equals((java.lang.Object) document37);
        org.jsoup.nodes.Element element45 = document37.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element47 = element45.wrap("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>\n</#root>");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
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
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str25 = document24.tagName();
        document24.setBaseUri("");
        org.jsoup.nodes.Element element29 = document24.addClass("");
        org.jsoup.nodes.Element element31 = document24.toggleClass("");
        org.jsoup.nodes.Element element33 = element31.html("");
        boolean boolean34 = element31.isBlock();
        org.jsoup.nodes.Attributes attributes35 = element31.attributes();
        org.jsoup.select.Elements elements38 = element31.getElementsByAttributeValueEnding("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi! ");
        org.jsoup.nodes.Element element40 = element31.prependElement("hi! #document");
        org.jsoup.nodes.Element element42 = element31.addClass("");
        org.jsoup.nodes.Document document45 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str46 = document45.tagName();
        document45.setBaseUri("");
        document45.setBaseUri("");
        org.jsoup.nodes.Document document53 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str54 = document53.tagName();
        document53.setBaseUri("");
        document53.setBaseUri("");
        org.jsoup.nodes.Element element60 = document53.appendText("#root");
        org.jsoup.nodes.Element element61 = document45.appendChild((org.jsoup.nodes.Node) document53);
        java.lang.String str62 = document53.className();
        org.jsoup.nodes.Document document65 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str66 = document65.tagName();
        document65.setBaseUri("");
        document65.setBaseUri("");
        org.jsoup.nodes.Element element72 = document65.appendText("#root");
        org.jsoup.nodes.Element element74 = document65.wrap("#root");
        document53.replaceWith((org.jsoup.nodes.Node) document65);
        java.util.Set<java.lang.String> strSet76 = document53.classNames();
        org.jsoup.nodes.Element element77 = element42.classNames(strSet76);
        org.jsoup.nodes.Element element78 = element20.classNames(strSet76);
        java.util.Set<java.lang.String> strSet79 = element20.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element80 = element20.lastElementSibling();
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document2.lastElementSibling();
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("body", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document2.wrap("<#root>\n<html>\n <head>\n </head>\n <body>\n  body \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
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
        java.lang.String str23 = document22.tagName();
        document22.setBaseUri("");
        document22.setBaseUri("");
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str31 = document30.tagName();
        document30.setBaseUri("");
        document30.setBaseUri("");
        org.jsoup.nodes.Element element36 = document22.appendChild((org.jsoup.nodes.Node) document30);
        org.jsoup.nodes.Element element37 = document22.empty();
        org.jsoup.nodes.Node node39 = document22.removeAttr("#root");
        java.lang.String str40 = document22.nodeName();
        java.lang.String str41 = document22.outerHtml();
        document22.setBaseUri("");
        org.jsoup.nodes.Element element44 = element17.prependChild((org.jsoup.nodes.Node) document22);
        org.jsoup.select.Elements elements46 = element44.getElementsByAttribute("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        boolean boolean48 = element44.hasClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node49 = element44.nextSibling();
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.jsoup.nodes.Element element4 = document2.getElementById("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    hi!  \n  </body>\n </html>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = document2.nextSibling();
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "hi!");
        org.jsoup.nodes.Element element4 = document2.prepend("hi! ");
        java.lang.String str5 = element4.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int6 = element4.siblingIndex();
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements20 = element18.siblingElements();
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        org.jsoup.select.Elements elements10 = document2.parents();
        boolean boolean12 = document2.hasAttr("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.select.Elements elements14 = document2.select("#document");
        org.jsoup.nodes.Element element16 = document2.prependText(" body hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element16.previousElementSibling();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        org.jsoup.select.Elements elements5 = document2.getElementsByClass("hi!");
        java.util.Set<java.lang.String> strSet6 = document2.classNames();
        org.jsoup.nodes.Element element8 = document2.toggleClass("#root");
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str12 = document11.tagName();
        document11.setBaseUri("");
        org.jsoup.nodes.Element element16 = document11.addClass("");
        org.jsoup.nodes.Element element18 = document11.toggleClass("");
        org.jsoup.nodes.Element element20 = element18.html("");
        boolean boolean21 = element18.isBlock();
        org.jsoup.nodes.Attributes attributes22 = element18.attributes();
        org.jsoup.select.Elements elements25 = element18.getElementsByAttributeValueEnding("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi! ");
        org.jsoup.nodes.Element element27 = element18.prependElement("hi! #document");
        org.jsoup.nodes.Element element28 = document2.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str32 = document31.tagName();
        document31.setBaseUri("");
        org.jsoup.nodes.Element element36 = document31.addClass("");
        org.jsoup.nodes.Element element38 = document31.toggleClass("");
        org.jsoup.nodes.Element element41 = element38.attr("hi! #document", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String[] strArray44 = new java.lang.String[] { "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        org.jsoup.nodes.Element element47 = element41.classNames((java.util.Set<java.lang.String>) strSet45);
        org.jsoup.nodes.Element element48 = element28.classNames((java.util.Set<java.lang.String>) strSet45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList49 = element48.siblingNodes();
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
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
        org.jsoup.nodes.Element element36 = document2.removeClass("hi! hi!");
        java.lang.String str37 = document2.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element38 = document2.firstElementSibling();
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        java.lang.String str9 = document2.attr("#root");
        org.jsoup.nodes.Element element11 = document2.text("");
        boolean boolean12 = document2.isBlock();
        org.jsoup.nodes.Element element14 = document2.text("hi! ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = document2.nextElementSibling();
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
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
        org.jsoup.nodes.Element element29 = element26.text("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root><#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int30 = element26.siblingIndex();
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element12 = document2.empty();
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements15 = element12.parents();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = element12.nextSibling();
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
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
        java.lang.String str93 = element29.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int94 = element29.siblingIndex();
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
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
        org.jsoup.nodes.Element element31 = element29.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean33 = element31.hasClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements35 = element31.getElementsByIndexLessThan((int) (byte) 100);
        org.jsoup.nodes.Element element37 = element31.html("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList38 = element37.siblingNodes();
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element4 = document2.removeClass("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexGreaterThan((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element4.wrap("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.html("hi! ");
        org.jsoup.nodes.Element element12 = element10.addClass("#root");
        org.jsoup.nodes.Element element15 = element10.attr("hi! ", "hi! #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int16 = element15.siblingIndex();
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "#document");
        org.jsoup.nodes.Element element4 = document2.prepend("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = element4.firstElementSibling();
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
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
        org.jsoup.nodes.Node node17 = node16.nextSibling();
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
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
        org.jsoup.nodes.Element element25 = element20.appendText("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>body");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element25.text("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root><hi> \n</hi> \n<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        org.jsoup.select.Elements elements5 = document2.getElementsByClass("hi!");
        java.util.Set<java.lang.String> strSet6 = document2.classNames();
        org.jsoup.nodes.Element element8 = document2.prependText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document2.wrap("hi! hi! #root\n<html>\n<head>\n</head>\n<body>\n hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
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
        org.jsoup.nodes.Element element36 = document2.removeClass("hi! hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int37 = element36.siblingIndex();
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
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
        org.jsoup.select.Elements elements26 = document2.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = document2.firstElementSibling();
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element element4 = document2.child(0);
        org.jsoup.nodes.Element element5 = element4.parent();
        org.jsoup.nodes.Element element7 = element5.append("hi! #document");
        element7.setBaseUri("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
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
        org.jsoup.nodes.Element element45 = element7.appendChild((org.jsoup.nodes.Node) document12);
        org.jsoup.select.Elements elements47 = element45.getElementsByTag("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element48 = element45.nextElementSibling();
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements8 = document2.parents();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document2.lastElementSibling();
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValue("hi! ", "#root");
        org.jsoup.nodes.Element element16 = element9.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element18 = element9.text(" hi! #document");
        org.jsoup.nodes.Element element20 = element18.append("html");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element18.firstElementSibling();
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.select.Elements elements18 = document2.getElementsByIndexGreaterThan((int) ' ');
        org.jsoup.select.Elements elements21 = document2.getElementsByAttributeValueNot("#root", "#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = document2.previousElementSibling();
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValue("hi! ", "#root");
        org.jsoup.nodes.Element element16 = element9.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element19 = element9.attr("hi! #document", "#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = element19.previousSibling();
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        java.lang.String str11 = element9.attr("");
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#root");
        org.jsoup.select.Elements elements16 = element9.getElementsByClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = element9.previousSibling();
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Element element8 = element6.prependText("body");
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
        org.jsoup.select.Elements elements29 = element27.getElementsByClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element30 = element8.appendChild((org.jsoup.nodes.Node) element27);
        org.jsoup.select.Elements elements32 = element30.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element33 = element30.lastElementSibling();
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
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
        java.lang.String str17 = element16.baseUri();
        org.jsoup.select.Elements elements20 = element16.getElementsByAttributeValueContaining("#root", "<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        element16.setBaseUri("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int23 = element16.siblingIndex();
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
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
        org.jsoup.select.Elements elements35 = element31.getElementsByIndexEquals(100);
        org.jsoup.nodes.Element element36 = element31.parent();
        org.jsoup.parser.Tag tag37 = element31.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element38 = element31.nextElementSibling();
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
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
        boolean boolean57 = element54.hasText();
        org.jsoup.parser.Tag tag58 = element54.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element59 = element54.nextElementSibling();
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str2 = tag1.getName();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        java.lang.String str4 = tag1.toString();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#roothi!<&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>\n</&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements7 = element6.siblingElements();
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        org.jsoup.select.Elements elements4 = document2.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int5 = document2.siblingIndex();
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
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
        org.jsoup.nodes.Element element35 = element33.prependText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element36 = element35.previousElementSibling();
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
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
        boolean boolean34 = tag7.isEmpty();
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element(tag7, "hi! #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element37 = element36.nextElementSibling();
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.nodes.Element element4 = document2.appendText("body#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>\n</#root>");
        org.jsoup.select.Elements elements7 = element4.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;", "hi! #root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element4.nextElementSibling();
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
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
        java.lang.String str55 = element54.val();
        org.jsoup.nodes.Element element57 = element54.text("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document");
        org.jsoup.nodes.Document document60 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str61 = document60.tagName();
        document60.setBaseUri("");
        org.jsoup.nodes.Element element65 = document60.addClass("");
        org.jsoup.nodes.Element element67 = document60.toggleClass("");
        org.jsoup.nodes.Element element69 = element67.html("");
        org.jsoup.nodes.Element element71 = element69.prependElement("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n   <html> \n    <head> \n    </head> \n    <body>\n      hi! #document    \n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.nodes.Element element72 = element54.prependChild((org.jsoup.nodes.Node) element69);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element73 = element54.lastElementSibling();
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element44 = element42.firstElementSibling();
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Element element8 = element6.prependText("body");
        org.jsoup.parser.Tag tag9 = element8.tag();
        element8.setBaseUri(" hi! #document");
        org.jsoup.nodes.Element element13 = element8.appendElement("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.select.Elements elements16 = element8.getElementsByAttributeValueStarting("body", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element8.firstElementSibling();
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "hi!");
        java.lang.String str3 = document2.toString();
        java.lang.String str5 = document2.attr("hi! #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements6 = document2.siblingElements();
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
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
        element31.remove();
        org.jsoup.parser.Tag tag34 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str35 = tag34.getName();
        org.jsoup.parser.Tag tag36 = tag34.getImplicitParent();
        org.jsoup.nodes.Document document40 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node42 = document40.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList43 = document40.childNodes();
        org.jsoup.nodes.Attributes attributes44 = document40.attributes();
        org.jsoup.nodes.Element element45 = new org.jsoup.nodes.Element(tag36, "#root", attributes44);
        org.jsoup.select.Elements elements48 = element45.getElementsByAttributeValueStarting("#document", "hi! #document");
        java.lang.String str49 = element45.baseUri();
        org.jsoup.nodes.Document document52 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str53 = document52.tagName();
        document52.setBaseUri("");
        org.jsoup.nodes.Element element57 = document52.addClass("");
        org.jsoup.nodes.Element element59 = document52.toggleClass("");
        org.jsoup.nodes.Element element61 = element59.html("");
        boolean boolean62 = element59.isBlock();
        java.lang.String[] strArray67 = new java.lang.String[] { "", "body", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet68 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet68, strArray67);
        org.jsoup.nodes.Element element70 = element59.classNames((java.util.Set<java.lang.String>) strSet68);
        org.jsoup.nodes.Element element71 = element45.classNames((java.util.Set<java.lang.String>) strSet68);
        org.jsoup.nodes.Element element72 = element31.classNames((java.util.Set<java.lang.String>) strSet68);
        org.jsoup.select.Elements elements73 = element31.getAllElements();
        org.jsoup.select.Elements elements74 = element31.parents();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element75 = element31.nextElementSibling();
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
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
        org.jsoup.nodes.Element element23 = element20.previousElementSibling();
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements4 = document2.getElementsByAttribute("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document");
        java.lang.String str5 = document2.nodeName();
        boolean boolean7 = document2.hasClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.Integer int8 = document2.elementSiblingIndex();
        org.jsoup.nodes.Element element10 = document2.html("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element10.siblingNodes();
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "hi!");
        org.jsoup.nodes.Element element4 = document2.prepend("hi! ");
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = element4.prepend("#root");
        java.lang.String str8 = element4.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element4.nextElementSibling();
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        java.lang.Integer int5 = document2.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = document2.attr("hi!", "#document");
        boolean boolean10 = element8.hasClass("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = element8.val("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#roothi!<&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>\n</&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>");
        org.jsoup.select.Elements elements15 = element8.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n   <html> \n    <head> \n    </head> \n    <body>\n      hi! #document    \n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>", "<#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements16 = element8.siblingElements();
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        java.lang.String str17 = document2.val();
        org.jsoup.nodes.Node node19 = document2.removeAttr("#root");
        org.jsoup.select.Elements elements22 = document2.getElementsByAttributeValueNot("<#root>\n</#root>", "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        java.lang.String str23 = document2.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = document2.wrap("\n<body class=\" body hi!\">\n</body>");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
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
        org.jsoup.select.Elements elements20 = document2.getElementsByClass("hi!");
        org.jsoup.parser.Tag tag21 = document2.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = document2.lastElementSibling();
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
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
        org.jsoup.nodes.Attributes attributes35 = element34.attributes();
        java.lang.String str36 = element34.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element37 = element34.previousElementSibling();
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        java.lang.String str9 = document2.attr("#root");
        java.lang.String str10 = document2.text();
        org.jsoup.nodes.Element element12 = document2.prependElement("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        element12.remove();
        org.jsoup.select.Elements elements15 = element12.getElementsByIndexEquals((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = element12.nextSibling();
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        org.jsoup.nodes.Node node6 = document2.childNode(0);
        org.jsoup.nodes.Element element8 = document2.val("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.val("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = element10.previousSibling();
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
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
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element18.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList23 = element18.siblingNodes();
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
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
        java.lang.String str21 = element20.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element20.nextElementSibling();
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
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
        boolean boolean21 = element17.hasClass("#document");
        java.lang.String str22 = element17.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = element17.previousSibling();
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        java.lang.Integer int5 = document2.elementSiblingIndex();
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexGreaterThan((int) (short) -1);
        document2.setBaseUri("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root><#document>\n</#document>");
        org.jsoup.nodes.Element element11 = document2.prependElement(" hi! <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document2.firstElementSibling();
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node3 = document2.nextSibling();
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element12 = document2.empty();
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Node node15 = element13.removeAttr("body");
        java.lang.String str16 = element13.toString();
        org.jsoup.nodes.Attributes attributes17 = element13.attributes();
        java.lang.Integer int18 = element13.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element13.firstElementSibling();
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
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
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str33 = document32.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = document32.childNodes();
        boolean boolean36 = document32.hasAttr("#root");
        document32.setBaseUri("");
        org.jsoup.nodes.Element element40 = document32.toggleClass("hi!");
        org.jsoup.nodes.Element element42 = element40.toggleClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element43 = element27.prependChild((org.jsoup.nodes.Node) element42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements44 = element43.siblingElements();
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexEquals((int) (short) 0);
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str8 = document7.tagName();
        document7.setBaseUri("");
        org.jsoup.nodes.Element element12 = document7.addClass("");
        org.jsoup.nodes.Element element14 = document7.toggleClass("");
        org.jsoup.nodes.Element element16 = element14.html("");
        boolean boolean17 = element14.isBlock();
        java.lang.String[] strArray22 = new java.lang.String[] { "", "body", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        org.jsoup.nodes.Element element25 = element14.classNames((java.util.Set<java.lang.String>) strSet23);
        org.jsoup.nodes.Element element26 = document2.classNames((java.util.Set<java.lang.String>) strSet23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element26.lastElementSibling();
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element43 = element42.nextElementSibling();
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
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
        org.jsoup.nodes.Element element56 = element10.val("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element57 = element10.firstElementSibling();
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root><#document>\n</#document>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root><hi> \n</hi> \n<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node3 = document2.nextSibling();
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.html("hi! ");
        org.jsoup.nodes.Element element12 = document2.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str13 = element12.val();
        org.jsoup.select.Elements elements16 = element12.getElementsByAttributeValueNot("#document", "#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element12.previousElementSibling();
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
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
        java.lang.String str19 = document2.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int20 = document2.siblingIndex();
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
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
        org.jsoup.select.Elements elements24 = document2.getElementsByIndexLessThan((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node25 = document2.previousSibling();
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "hi!");
        java.util.Set<java.lang.String> strSet3 = document2.classNames();
        org.jsoup.nodes.Element element5 = document2.val("#document");
        java.lang.String str6 = element5.data();
        org.jsoup.nodes.Attributes attributes7 = element5.attributes();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = document10.childNodes();
        boolean boolean14 = document10.hasAttr("#root");
        org.jsoup.parser.Tag tag15 = document10.tag();
        java.lang.String str17 = document10.attr("#root");
        org.jsoup.nodes.Element element19 = document10.text("");
        boolean boolean20 = document10.isBlock();
        java.util.Set<java.lang.String> strSet21 = document10.classNames();
        org.jsoup.nodes.Element element22 = element5.classNames(strSet21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element5.lastElementSibling();
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
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
        org.jsoup.nodes.Element element23 = element21.val("hi! hi! #root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = element23.firstElementSibling();
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! #document", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.nextElementSibling();
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        document2.setBaseUri("");
        document2.setBaseUri(" hi! #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = document2.wrap("\n<html class=\" hi! #document\">\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        java.lang.String str9 = document2.attr("#root");
        java.lang.String str10 = document2.text();
        java.lang.String str11 = document2.toString();
        java.lang.String str12 = document2.className();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = document2.nextSibling();
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        document2.setBaseUri("");
        java.lang.String str9 = document2.text();
        org.jsoup.select.Elements elements11 = document2.getElementsByTag("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document2.previousElementSibling();
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
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
        org.jsoup.select.Elements elements33 = element29.children();
        org.jsoup.nodes.Element element35 = element29.text("body");
        java.lang.String str36 = element35.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList37 = element35.siblingNodes();
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
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
        org.jsoup.nodes.Element element17 = element9.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element17.siblingNodes();
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
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
        org.jsoup.nodes.Element element36 = document2.getElementById("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element37 = document2.firstElementSibling();
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = document2.previousSibling();
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.html("hi! ");
        org.jsoup.nodes.Element element12 = element10.addClass("#root");
        java.lang.String str14 = element12.attr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element12.val(" #root");
        org.jsoup.nodes.Node node18 = element16.removeAttr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root><#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element16.lastElementSibling();
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        boolean boolean5 = element4.isBlock();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements11 = document8.getElementsByAttributeValueContaining("body", "body");
        org.jsoup.nodes.Element element13 = document8.val("#document");
        java.lang.String str14 = document8.className();
        org.jsoup.nodes.Element element15 = element4.prependChild((org.jsoup.nodes.Node) document8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element15.wrap("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
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
        java.util.List<org.jsoup.nodes.Node> nodeList20 = element18.siblingNodes();
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.parser.Tag tag12 = document2.tag();
        org.jsoup.nodes.Element element14 = document2.addClass("");
        java.lang.String str15 = document2.className();
        org.jsoup.nodes.Attributes attributes16 = document2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements17 = document2.siblingElements();
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
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
        org.jsoup.nodes.Element element18 = element12.val("\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = element18.previousSibling();
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
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
        org.jsoup.nodes.Element element18 = element16.text(" hi! #document");
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
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
        org.jsoup.parser.Tag tag19 = tag17.getImplicitParent();
        java.lang.String str20 = tag17.toString();
        java.lang.String str21 = tag17.getName();
        org.jsoup.parser.Tag tag22 = tag17.getImplicitParent();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element(tag17, "<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node25 = element24.previousSibling();
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
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
        org.jsoup.nodes.Element element57 = element54.appendElement("#document");
        java.lang.String str58 = element54.toString();
        java.lang.String str59 = element54.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element61 = element54.wrap("<#root>\n<html>\n <head>\n </head>\n <body>\n  body \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
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
        org.jsoup.select.Elements elements48 = document2.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element49 = document2.nextElementSibling();
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
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
        org.jsoup.select.Elements elements24 = document2.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements25 = document2.siblingElements();
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document", "\n<body>\n</body>");
        java.lang.String str3 = document2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = document2.previousSibling();
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element9 = document2.appendText("hi! ");
        org.jsoup.nodes.Element element11 = element9.removeClass("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.select.Elements elements13 = element9.select("body");
        org.jsoup.nodes.Element element15 = element9.prependText("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str19 = document18.tagName();
        document18.setBaseUri("");
        document18.setBaseUri("");
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str27 = document26.tagName();
        document26.setBaseUri("");
        document26.setBaseUri("");
        org.jsoup.nodes.Element element32 = document18.appendChild((org.jsoup.nodes.Node) document26);
        org.jsoup.nodes.Element element33 = document18.empty();
        boolean boolean34 = document18.isBlock();
        org.jsoup.nodes.Element element36 = document18.addClass("#root");
        org.jsoup.nodes.Element element37 = element9.appendChild((org.jsoup.nodes.Node) document18);
        org.jsoup.nodes.Element element38 = element37.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int39 = element38.siblingIndex();
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Element element5 = document2.html(" #root");
        boolean boolean7 = document2.hasClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document2.wrap("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
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
        document39.setBaseUri("");
        org.jsoup.nodes.Document document47 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str48 = document47.tagName();
        document47.setBaseUri("");
        document47.setBaseUri("");
        org.jsoup.nodes.Element element53 = document39.appendChild((org.jsoup.nodes.Node) document47);
        org.jsoup.nodes.Element element54 = document39.empty();
        boolean boolean55 = document39.isBlock();
        org.jsoup.nodes.Element element57 = document39.addClass("#root");
        java.lang.String str58 = element57.baseUri();
        org.jsoup.nodes.Element element59 = element36.prependChild((org.jsoup.nodes.Node) element57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element60 = element59.previousElementSibling();
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        document2.setBaseUri("");
        document2.setBaseUri(" hi! #document");
        org.jsoup.select.Elements elements16 = document2.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n</#root>", "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int17 = document2.siblingIndex();
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
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
        org.jsoup.nodes.Element element31 = document2.firstElementSibling();
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.text("body#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = element6.nextSibling();
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueEnding("hi!", "hi!");
        java.lang.String str6 = document2.html();
        org.jsoup.nodes.Element element8 = document2.val("hi! ");
        org.jsoup.nodes.Element element9 = document2.empty();
        org.jsoup.nodes.Element element11 = element9.appendElement("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element9.prepend("<html>\n<head>\n</head>\n<body>\n &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   #document \n  </body>\n </html>\n</body>\n</html>");
        boolean boolean15 = element9.hasAttr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element9.nextElementSibling();
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element35 = element31.previousElementSibling();
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node46 = document2.previousSibling();
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexLessThan((int) (byte) 100);
        org.jsoup.nodes.Element element6 = document2.appendText("hi!");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str10 = document9.tagName();
        document9.setBaseUri("");
        document9.setBaseUri("");
        java.lang.String str16 = document9.attr("#root");
        org.jsoup.nodes.Element element17 = element6.appendChild((org.jsoup.nodes.Node) document9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements18 = element6.siblingElements();
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendElement("#root");
        element4.remove();
        org.jsoup.select.Elements elements6 = element4.parents();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element4.lastElementSibling();
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
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
        org.jsoup.nodes.Element element40 = element36.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node41 = element36.nextSibling();
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
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
        org.jsoup.nodes.Element element71 = element70.firstElementSibling();
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
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
        java.lang.String str33 = element31.data();
        org.jsoup.nodes.Element element35 = element31.val(" hi! <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int36 = element35.siblingIndex();
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        java.lang.Integer int5 = document2.elementSiblingIndex();
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexGreaterThan((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document2.firstElementSibling();
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
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
        org.jsoup.select.Elements elements24 = document2.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node25 = document2.previousSibling();
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        java.lang.Integer int5 = document2.elementSiblingIndex();
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element9 = document2.html("\n<body>\n</body>");
        document2.setBaseUri("\n<body class=\" body hi!\">\n</body>");
        org.jsoup.nodes.Element element13 = document2.append("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document2.siblingNodes();
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>\n</#root>", " hi! #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.siblingNodes();
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element20.wrap("<html>\n<head>\n</head>\n<body>\n body\n</body>\n</html>");
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element45 = element42.text("<html>\n<head>\n</head>\n<body> \n <html>\n  <head>\n  </head>\n  <body> \n  </body>\n </html>\n</body>\n</html><#root class=\"\">\n<&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>\n</&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>\n<html> \n <head> \n </head> \n <body>  \n </body>\n</html>\n</#root>");
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element element4 = document2.child(0);
        org.jsoup.nodes.Element element5 = element4.parent();
        org.jsoup.nodes.Element element7 = element5.append("hi! #document");
        element7.setBaseUri("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
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
        org.jsoup.nodes.Element element45 = element7.appendChild((org.jsoup.nodes.Node) document12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element46 = element7.previousElementSibling();
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
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
        org.jsoup.select.Elements elements23 = element20.getElementsByAttributeValue("hi! #root", "\n<body>\n</body>");
        org.jsoup.nodes.Element element25 = element20.html("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element20.wrap("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi> \n</hi> \n<html> \n <head> \n </head> \n <body>\n   hi!  hi!\n </body>\n</html>");
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
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
        org.jsoup.parser.Tag tag19 = tag17.getImplicitParent();
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
        boolean boolean37 = tag23.isEmpty();
        boolean boolean38 = tag19.canContain(tag23);
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element(tag23, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi! <#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node41 = element40.previousSibling();
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "hi! hi!");
        org.jsoup.nodes.Element element4 = document2.removeClass("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    hi!  \n  </body>\n </html>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = element4.nextElementSibling();
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
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
        org.jsoup.nodes.Element element26 = document2.prependText("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element26.firstElementSibling();
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node43 = element42.nextSibling();
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        java.lang.String str8 = document2.attr("#root");
        java.lang.String str10 = document2.absUrl("hi! ");
        org.jsoup.select.Elements elements11 = document2.getAllElements();
        boolean boolean13 = document2.hasAttr("#root hi! #root hi! hi! #root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = document2.previousSibling();
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.html("hi! ");
        org.jsoup.nodes.Element element12 = element10.addClass("#root");
        java.lang.String str14 = element12.attr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element12.val(" #root");
        org.jsoup.nodes.Node node18 = element16.removeAttr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root><#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList19 = node18.siblingNodes();
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        org.jsoup.select.Elements elements11 = document2.getElementsByAttribute("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document2.firstElementSibling();
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.parser.Tag tag12 = document2.tag();
        org.jsoup.nodes.Element element14 = document2.addClass("");
        java.lang.String str15 = document2.className();
        org.jsoup.nodes.Attributes attributes16 = document2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document2.lastElementSibling();
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element34 = element33.previousElementSibling();
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
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
        org.jsoup.select.Elements elements35 = document2.children();
        org.jsoup.nodes.Element element37 = document2.val("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements38 = element37.siblingElements();
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
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
        org.jsoup.select.Elements elements21 = document2.getElementsByAttributeValueContaining("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>", "hi! #document");
        java.lang.String str22 = document2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements23 = document2.siblingElements();
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.html("hi! ");
        org.jsoup.select.Elements elements12 = element10.getElementsByAttribute("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.select.Elements elements13 = element10.children();
        org.jsoup.select.Elements elements15 = element10.getElementsByIndexLessThan((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element10.wrap("<html> \n<head> \n</head> \n<body>\n  hi!  hi!&lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   \n  </body>\n </html>\n</body>\n</html>");
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("body", "");
        org.jsoup.nodes.Element element4 = document2.toggleClass("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        document2.setBaseUri("hi! ");
        org.jsoup.select.Elements elements9 = document2.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &amp;lt;#root class=&amp;quot; hi!&amp;quot;&amp;gt; &amp;lt;#root class=&amp;quot;&amp;quot;&amp;gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! #document &lt;/body&gt; &lt;/html&gt; &lt;/body&gt; &lt;/html&gt; &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = document2.previousSibling();
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
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
        boolean boolean22 = element18.hasClass("\n<body>\n</body>");
        org.jsoup.nodes.Element element24 = element18.removeClass("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n  <html> \n   <head> \n   </head> \n   <body>\n     hi!   #document \n   </body>\n  </html>\n </body>\n</html>\n</#root>\n<html> \n<head> \n</head> \n<body>  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str28 = document27.tagName();
        document27.setBaseUri("");
        document27.setBaseUri("");
        org.jsoup.nodes.Element element34 = document27.appendText("#root");
        document27.setBaseUri("");
        org.jsoup.nodes.Element element37 = document27.empty();
        org.jsoup.nodes.Element element38 = element37.empty();
        org.jsoup.nodes.Document document41 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str42 = document41.tagName();
        document41.setBaseUri("");
        org.jsoup.nodes.Element element46 = document41.addClass("");
        org.jsoup.select.Elements elements47 = element46.parents();
        org.jsoup.select.Elements elements48 = element46.getAllElements();
        org.jsoup.nodes.Element element49 = element37.prependChild((org.jsoup.nodes.Node) element46);
        java.lang.String str50 = element49.text();
        java.lang.Class<?> wildcardClass51 = element49.getClass();
        boolean boolean52 = element18.equals((java.lang.Object) element49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element54 = element49.wrap("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element67 = element66.nextElementSibling();
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "hi!");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("body", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element9 = document2.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element11 = element9.text("<html>\n<head>\n</head>\n<body>\n body\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = element11.nextSibling();
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
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
        org.jsoup.nodes.Element element29 = element26.text("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root><#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.jsoup.nodes.Element element31 = element26.append("hi! ");
        org.jsoup.nodes.Element element33 = element26.append("hi! hi! #root\n<html>\n<head>\n</head>\n<body>\n hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element34 = element33.previousElementSibling();
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi! <#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.siblingNodes();
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element10 = document2.toggleClass("hi!");
        org.jsoup.nodes.Element element12 = element10.toggleClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements13 = element10.siblingElements();
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
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
        org.jsoup.select.Elements elements35 = element31.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element37 = element31.wrap("<html>\n<head>\n</head>\n<body>\n body\n</body>\n</html>#root");
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        java.lang.String str3 = document2.tagName();
        org.jsoup.nodes.Element element4 = document2.empty();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("#document", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements9 = document7.getElementsByAttribute("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document");
        java.lang.String str10 = document7.nodeName();
        boolean boolean12 = document7.hasClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.Integer int13 = document7.elementSiblingIndex();
        org.jsoup.nodes.Element element15 = document7.html("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.jsoup.nodes.Element element17 = document7.removeClass("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>body");
        org.jsoup.nodes.Element element18 = document2.prependChild((org.jsoup.nodes.Node) document7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = document2.previousElementSibling();
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Element element8 = element6.prependText("body");
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
        org.jsoup.select.Elements elements29 = element27.getElementsByClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element30 = element8.appendChild((org.jsoup.nodes.Node) element27);
        org.jsoup.select.Elements elements32 = element30.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! #document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int33 = element30.siblingIndex();
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
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
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str30 = tag29.getName();
        boolean boolean31 = tag29.isData();
        java.lang.String str32 = tag29.toString();
        boolean boolean33 = tag17.canContain(tag29);
        org.jsoup.nodes.Document document37 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str38 = document37.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = document37.childNodes();
        boolean boolean41 = document37.hasAttr("#root");
        org.jsoup.parser.Tag tag42 = document37.tag();
        java.lang.String str43 = tag42.toString();
        org.jsoup.nodes.Document document47 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str48 = document47.tagName();
        document47.setBaseUri("");
        org.jsoup.nodes.Element element52 = document47.addClass("");
        org.jsoup.nodes.Element element54 = document47.toggleClass("");
        element54.setBaseUri("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes57 = element54.attributes();
        org.jsoup.nodes.Element element58 = new org.jsoup.nodes.Element(tag42, "hi! #document", attributes57);
        org.jsoup.nodes.Element element59 = new org.jsoup.nodes.Element(tag29, "<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document", attributes57);
        org.jsoup.select.Elements elements62 = element59.getElementsByAttributeValue("<hi! #document>\n</hi! #document>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList63 = element59.siblingNodes();
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element20.wrap("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexLessThan((int) (byte) 100);
        org.jsoup.nodes.Element element6 = document2.appendText("hi!");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str10 = document9.tagName();
        document9.setBaseUri("");
        document9.setBaseUri("");
        java.lang.String str16 = document9.attr("#root");
        org.jsoup.nodes.Element element17 = element6.appendChild((org.jsoup.nodes.Node) document9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element6.previousElementSibling();
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.html("hi! ");
        java.lang.String str11 = element10.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = element10.nextSibling();
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi! #document", "hi! ");
        org.jsoup.nodes.Element element4 = document2.text("<html>\n<head>\n</head>\n<body>\n &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   #document \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttributeValueStarting(" body hi!", "<#document>\n</#document>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        boolean boolean9 = document2.hasAttr("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n   <html> \n    <head> \n    </head> \n    <body>\n      hi! #document    \n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements10 = document2.siblingElements();
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
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
        org.jsoup.nodes.Element element34 = document10.html("hi!");
        java.lang.String str35 = element34.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList36 = element34.siblingNodes();
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        java.lang.Integer int5 = document2.elementSiblingIndex();
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexGreaterThan((int) (short) -1);
        document2.setBaseUri("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root><#document>\n</#document>");
        java.lang.String str10 = document2.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document2.siblingNodes();
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
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
        org.jsoup.nodes.Element element26 = document2.prepend("\n<html class=\" hi! #document\">\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element26.wrap("<html> \n<head> \n</head> \n<body>\n  hi!  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!\n</body>\n</html>");
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValue("hi! ", "#root");
        org.jsoup.nodes.Element element16 = element9.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = element16.childNodes();
        boolean boolean18 = element16.hasText();
        org.jsoup.select.Elements elements20 = element16.getElementsByIndexGreaterThan(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element16.previousElementSibling();
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        java.lang.String str9 = document2.attr("#root");
        java.lang.String str10 = document2.text();
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document2.previousElementSibling();
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
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
        org.jsoup.select.Elements elements26 = element18.getElementsByIndexLessThan((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node27 = element18.nextSibling();
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        java.lang.String str12 = document2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = document2.wrap("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root");
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str2 = tag1.getName();
        boolean boolean3 = tag1.isData();
        boolean boolean4 = tag1.preserveWhitespace();
        java.lang.String str5 = tag1.getName();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str10 = document9.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document9.childNodes();
        org.jsoup.nodes.Node node13 = document9.childNode(0);
        boolean boolean15 = document9.hasClass("#root");
        org.jsoup.nodes.Element element17 = document9.toggleClass("body");
        org.jsoup.nodes.Attributes attributes18 = element17.attributes();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag1, "<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", attributes18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = element19.nextSibling();
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
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
        boolean boolean34 = tag7.isEmpty();
        org.jsoup.nodes.Document document37 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str38 = document37.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = document37.childNodes();
        org.jsoup.nodes.Node node41 = document37.childNode(0);
        org.jsoup.nodes.Element element43 = document37.val("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean44 = tag7.equals((java.lang.Object) document37);
        boolean boolean46 = document37.hasAttr("html");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element47 = document37.nextElementSibling();
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element9.firstElementSibling();
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
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
        java.lang.Integer int23 = element22.siblingIndex();
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
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
        org.jsoup.nodes.Element element22 = document2.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = element22.nextSibling();
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
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
        org.jsoup.nodes.Element element20 = element19.firstElementSibling();
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        org.jsoup.nodes.Element element6 = document2.addClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element6.previousElementSibling();
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element12 = document2.empty();
        org.jsoup.select.Elements elements14 = document2.getElementsByIndexLessThan((int) (byte) -1);
        document2.setBaseUri("<#root>\n<html> \n<head> \n</head> \n<body>\n  hi!  &lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   \n  </body>\n </html>\n</body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document2.nextElementSibling();
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        org.jsoup.select.Elements elements10 = element9.getAllElements();
        org.jsoup.nodes.Node node12 = element9.removeAttr("<html> \n<head> \n</head> \n<body>\n  hi!  hi!&lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str16 = document15.tagName();
        document15.setBaseUri("");
        org.jsoup.nodes.Element element20 = document15.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element22 = document15.appendText("hi! ");
        org.jsoup.nodes.Element element24 = element22.removeClass("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.select.Elements elements26 = element22.select("body");
        org.jsoup.nodes.Element element28 = element22.prependText("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str32 = document31.tagName();
        document31.setBaseUri("");
        document31.setBaseUri("");
        org.jsoup.nodes.Document document39 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str40 = document39.tagName();
        document39.setBaseUri("");
        document39.setBaseUri("");
        org.jsoup.nodes.Element element45 = document31.appendChild((org.jsoup.nodes.Node) document39);
        org.jsoup.nodes.Element element46 = document31.empty();
        boolean boolean47 = document31.isBlock();
        org.jsoup.nodes.Element element49 = document31.addClass("#root");
        org.jsoup.nodes.Element element50 = element22.appendChild((org.jsoup.nodes.Node) document31);
        org.jsoup.select.Elements elements53 = element50.getElementsByAttributeValueStarting("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root><#document>\n</#document>", "hi! #root");
        org.jsoup.nodes.Element element54 = element9.prependChild((org.jsoup.nodes.Node) element50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element55 = element9.lastElementSibling();
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
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
        org.jsoup.select.Elements elements22 = element9.siblingElements();
    }
}

