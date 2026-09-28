package org.jsoup.parser;

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
        org.jsoup.nodes.Element element46 = element44.prependElement("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.nodes.Node node47 = element46.nextSibling();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#root" + "'", str23, "#root");
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#root" + "'", str31, "#root");
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "#document" + "'", str40, "#document");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(node47);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
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
        java.lang.String str36 = element31.baseUri();
        java.util.Set<java.lang.String> strSet37 = element31.classNames();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element39 = element31.child(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(strSet37);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
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
        org.jsoup.nodes.Element element32 = element26.lastElementSibling();
        org.jsoup.nodes.Document document35 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str36 = document35.tagName();
        document35.setBaseUri("");
        org.jsoup.nodes.Element element40 = document35.addClass("");
        org.jsoup.nodes.Element element42 = document35.toggleClass("");
        org.jsoup.nodes.Element element44 = element42.html("");
        org.jsoup.select.Elements elements47 = element42.getElementsByAttributeValue("hi! ", "#root");
        org.jsoup.nodes.Element element49 = element42.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element52 = element42.attr("hi! #document", "#root");
        org.jsoup.select.Elements elements53 = element42.children();
        org.jsoup.nodes.Element element55 = element42.val(" hi! #document");
        org.jsoup.nodes.Element element57 = element42.prependText(" hi! #document");
        org.jsoup.nodes.Element element58 = element26.appendChild((org.jsoup.nodes.Node) element57);
        org.jsoup.select.Elements elements60 = element58.getElementsByIndexLessThan((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element62 = element58.child((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#root" + "'", str36, "#root");
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(elements60);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("body", "#document");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element7 = document2.val("hi! ");
        java.lang.Class<?> wildcardClass8 = document2.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        java.lang.String str12 = element9.className();
        org.jsoup.select.Elements elements14 = element9.getElementsByTag("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
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
        java.lang.String str69 = element66.val();
        java.lang.String str70 = element66.id();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#root" + "'", str37, "#root");
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#root" + "'", str42, "#root");
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "#root" + "'", str45, "#root");
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "#root" + "'", str48, "#root");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "#root" + "'", str55, "#root");
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(attributes65);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
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
        java.lang.String str43 = document2.outerHtml();
        java.lang.String str45 = document2.absUrl(" body hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        boolean boolean18 = document10.hasClass("#root");
        org.jsoup.select.Elements elements21 = document10.getElementsByAttributeValueNot("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi! ");
        java.lang.String str22 = document10.baseUri();
        org.jsoup.select.Elements elements24 = document10.getElementsByTag("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str25 = document10.className();
        java.lang.String str26 = document10.text();
        org.jsoup.select.Elements elements28 = document10.getElementsByAttribute("#roothi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(elements28);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>", "\n<hi!>\n</hi!>");
        org.jsoup.select.Elements elements3 = document2.getAllElements();
        org.jsoup.select.Elements elements4 = document2.children();
        org.jsoup.select.Elements elements7 = document2.getElementsByAttributeValueNot("<#root class=\"\">\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</#root>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n</#root>");
        org.jsoup.nodes.Element element8 = document2.empty();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
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
        org.jsoup.nodes.Element element34 = element33.empty();
        org.jsoup.nodes.Node node36 = element33.removeAttr("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(node36);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
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
        java.lang.String str32 = element31.html();
        org.jsoup.nodes.Element element33 = element31.nextElementSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = element31.childNodes();
        java.lang.String str35 = element31.text();
        org.jsoup.nodes.Element element37 = element31.appendText("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(element37);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.select.Elements elements8 = element7.parents();
        org.jsoup.nodes.Element element10 = element7.toggleClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
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
        org.jsoup.select.Elements elements30 = document21.parents();
        document21.setBaseUri("\n<#document class=\" #root\">\n</#document>");
        java.lang.String str33 = document21.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            element10.replaceWith((org.jsoup.nodes.Node) document21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\n<#document class=\" #root\">\n</#document>" + "'", str33, "\n<#document class=\" #root\">\n</#document>");
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
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
        org.jsoup.nodes.Element element22 = document2.removeClass("#root");
        java.lang.String str23 = document2.className();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#document" + "'", str20, "#document");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   #document \n  </body>\n </html>\n</body>\n</html>", "<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html> <head> </head> <body> hi! </body> </html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi! <#root> <html> <head> </head> <body> hi! </body> </html> </#root>", "\n<#document class=\" #root\">\n</#document>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        java.lang.String str9 = document2.attr("#root");
        java.lang.String str10 = document2.text();
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.nodes.Element element14 = element12.appendElement("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes15 = element12.attributes();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element20 = document18.appendText("#root");
        org.jsoup.nodes.Element element22 = document18.prepend("#root");
        org.jsoup.nodes.Element element24 = element22.prependText("body");
        org.jsoup.parser.Tag tag25 = element24.tag();
        element24.setBaseUri(" hi! #document");
        org.jsoup.nodes.Element element29 = element24.appendElement("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str33 = document32.tagName();
        document32.setBaseUri("");
        org.jsoup.nodes.Element element37 = document32.addClass("");
        org.jsoup.nodes.Element element39 = document32.toggleClass("");
        org.jsoup.nodes.Element element41 = document32.addClass("hi!");
        org.jsoup.parser.Tag tag42 = document32.tag();
        org.jsoup.nodes.Element element44 = document32.addClass("");
        org.jsoup.nodes.Node node46 = document32.removeAttr("\n<hi!>\n</hi!>");
        org.jsoup.nodes.Element element47 = element29.prependChild(node46);
        org.jsoup.parser.Tag tag48 = element47.tag();
        java.lang.Integer int49 = element47.siblingIndex();
        org.jsoup.nodes.Element element51 = element47.prependText("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>body");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element52 = element12.prependChild((org.jsoup.nodes.Node) element51);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#root" + "'", str33, "#root");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 4 + "'", int49 == 4);
        org.junit.Assert.assertNotNull(element51);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
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
        org.jsoup.nodes.Element element35 = element32.appendElement("hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
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
        java.lang.String str16 = element12.baseUri();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("<#root>\n</#root>");
        org.junit.Assert.assertNotNull(tag1);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
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
        java.lang.String str20 = document2.nodeName();
        org.jsoup.select.Elements elements22 = document2.getElementsByClass("#document");
        java.lang.String str23 = document2.toString();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#document" + "'", str20, "#document");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
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
        org.jsoup.nodes.Element element22 = element18.val("body");
        org.jsoup.select.Elements elements24 = element18.getElementsByClass("\n<body class=\" body hi!\">\n</body>");
        org.jsoup.parser.Tag tag25 = element18.tag();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root" + "'", str20, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(tag25);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
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
        org.jsoup.nodes.Element element24 = document2.toggleClass("hi! hi!hi!");
        java.lang.String str25 = element24.className();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>" + "'", str22, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + " hi! hi!hi!" + "'", str25, " hi! hi!hi!");
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n<head>\n</head>\n<body> &lt;#document&gt; \n</body>\n</html><#root hi!=\"#document\" class=\" body hi!\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "hi! #root");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
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
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str23 = document22.tagName();
        document22.setBaseUri("");
        org.jsoup.nodes.Element element27 = document22.addClass("");
        org.jsoup.nodes.Element element29 = document22.toggleClass("");
        org.jsoup.nodes.Element element31 = document22.addClass("hi!");
        org.jsoup.parser.Tag tag32 = document22.tag();
        org.jsoup.nodes.Element element34 = document22.addClass("");
        org.jsoup.nodes.Element element36 = document22.prependElement("hi!");
        org.jsoup.parser.Tag tag37 = document22.tag();
        java.lang.String str38 = tag37.getName();
        org.jsoup.nodes.Document document41 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str42 = document41.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = document41.childNodes();
        boolean boolean45 = document41.hasAttr("#root");
        org.jsoup.parser.Tag tag46 = document41.tag();
        org.jsoup.nodes.Document document49 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str50 = document49.tagName();
        document49.setBaseUri("");
        document49.setBaseUri("");
        org.jsoup.nodes.Document document57 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str58 = document57.tagName();
        document57.setBaseUri("");
        document57.setBaseUri("");
        org.jsoup.nodes.Element element64 = document57.appendText("#root");
        org.jsoup.nodes.Element element65 = document49.appendChild((org.jsoup.nodes.Node) document57);
        boolean boolean66 = tag46.equals((java.lang.Object) element65);
        org.jsoup.parser.Tag tag68 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str69 = tag68.getName();
        org.jsoup.parser.Tag tag70 = tag68.getImplicitParent();
        boolean boolean71 = tag46.canContain(tag70);
        boolean boolean72 = tag37.canContain(tag46);
        boolean boolean73 = tag46.isBlock();
        boolean boolean74 = tag19.canContain(tag46);
        org.jsoup.parser.Tag tag75 = tag46.getImplicitParent();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#root" + "'", str23, "#root");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#root" + "'", str38, "#root");
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#root" + "'", str42, "#root");
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "#root" + "'", str50, "#root");
        org.junit.Assert.assertNotNull(document57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "#root" + "'", str58, "#root");
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(tag68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "#root" + "'", str69, "#root");
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(tag75);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi! #document\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>#root", "body#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.select.Elements elements6 = document2.getAllElements();
        java.lang.String str7 = document2.html();
        org.jsoup.nodes.Element element8 = document2.empty();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
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
        org.jsoup.select.Elements elements22 = element9.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Element element24 = element9.child(0);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
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
        org.jsoup.nodes.Element element49 = element45.text("<html>\n<head>\n</head>\n<body>\n body\n</body>\n</html>#root");
        org.jsoup.select.Elements elements50 = element45.children();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#root" + "'", str32, "#root");
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(elements50);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi! hi!", "body#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>\n</#root>");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        java.util.Set<java.lang.String> strSet4 = document2.classNames();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = document2.select("<html> <head> </head> <body> body </body> </html> #root hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html> <head> </head> <body> body </body> </html> #root hi!");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.parser.Tag tag12 = document2.tag();
        org.jsoup.nodes.Element element14 = document2.addClass("");
        org.jsoup.nodes.Element element16 = element14.prependElement("hi!");
        java.lang.Integer int17 = element16.siblingIndex();
        java.lang.String str18 = element16.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = element16.select("<html>\n<head>\n</head>\n<body>\n &lt;#root class=&quot;&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   #document\n  </body>\n </html>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html>?<head>?</head>?<body>? &lt;#root class=&quot;&quot;&gt; ? <html> ?  <head> ?  </head> ?  <body>?    hi!   #document?  </body>? </html>?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n<hi!>\n</hi!>" + "'", str18, "\n<hi!>\n</hi!>");
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
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
        java.lang.String str35 = tag7.toString();
        org.jsoup.parser.Tag tag36 = tag7.getImplicitParent();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#root" + "'", str33, "#root");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#root" + "'", str34, "#root");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#root" + "'", str35, "#root");
        org.junit.Assert.assertNotNull(tag36);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
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
        org.jsoup.select.Elements elements19 = element15.getElementsByIndexGreaterThan((int) (byte) 1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
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
        org.jsoup.nodes.Element element34 = document22.toggleClass("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.nodes.Element element36 = element34.prependText("hi! #document");
        java.util.List<org.jsoup.nodes.Node> nodeList37 = element34.childNodes();
        org.jsoup.nodes.Element element39 = element34.child(0);
        org.jsoup.nodes.Element element41 = element34.addClass("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n   <html> \n    <head> \n    </head> \n    <body>\n      hi! #document    \n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#root" + "'", str23, "#root");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNull(element31);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        org.jsoup.nodes.Element element6 = document2.addClass("");
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("#root");
        document2.setBaseUri("body");
        java.lang.String str11 = document2.baseUri();
        org.jsoup.select.Elements elements13 = document2.getElementsByTag("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root><#document>\n</#document>");
        java.lang.String str14 = document2.outerHtml();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "body" + "'", str11, "body");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>" + "'", str14, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document", "hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int3 = document2.elementSiblingIndex();
        java.lang.String str4 = document2.outerHtml();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n &lt;#root class=&quot;&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   #document\n  </body>\n </html>\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n &lt;#root class=&quot;&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   #document\n  </body>\n </html>\n</body>\n</html>");
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals((int) (byte) 1);
        org.jsoup.select.Elements elements9 = document2.getElementsByIndexLessThan(10);
        org.jsoup.nodes.Element element11 = document2.appendElement("<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element16 = document14.appendElement("#root");
        org.jsoup.nodes.Element element18 = element16.text("#document");
        org.jsoup.nodes.Element element19 = element16.previousElementSibling();
        org.jsoup.parser.Tag tag20 = element16.tag();
        org.jsoup.parser.Tag tag21 = tag20.getImplicitParent();
        boolean boolean22 = element11.equals((java.lang.Object) tag21);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
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
        java.lang.String str34 = element33.data();
        org.jsoup.nodes.Node node36 = element33.removeAttr("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(node36);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
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
        org.jsoup.nodes.Element element20 = element12.parent();
        org.jsoup.select.Elements elements23 = element12.getElementsByAttributeValue("<html> \n<head> \n</head> \n<body>\n  hi!  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!\n</body>\n</html>", " hi!");
        java.lang.String str24 = element12.toString();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>" + "'", str24, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document");
        org.jsoup.nodes.Element element4 = document2.addClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.nodes.Element element6 = element4.prependElement("body\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element8 = element4.appendText("hi! #document\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>#root");
        java.lang.String str9 = element8.data();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.html("hi! ");
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#document");
        java.lang.String str14 = element10.toString();
        org.jsoup.select.Elements elements17 = element10.getElementsByAttributeValueStarting("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root><#document>\n</#document>", "<hi! #document>\n</hi! #document>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str18 = element10.outerHtml();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
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
        org.jsoup.select.Elements elements32 = document23.getElementsByAttributeValueNot("#root", "hi!");
        org.jsoup.nodes.Element element33 = document23.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = element33.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNull(element33);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
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
        java.lang.String str30 = element29.className();
        org.jsoup.select.Elements elements32 = element29.getElementsByAttribute("body#document");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(elements32);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
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
        java.lang.String str28 = element25.nodeName();
        boolean boolean30 = element25.hasClass("<html>\n<head>\n</head>\n<body> &lt;#document&gt; \n</body>\n</html><#root hi!=\"#document\" class=\" body hi!\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#document" + "'", str28, "#document");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
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
        org.jsoup.nodes.Element element21 = element18.firstElementSibling();
        org.jsoup.nodes.Element element23 = element18.prependText("\n<body class=\"\">\n</body>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        org.jsoup.select.Elements elements11 = document2.getElementsByAttribute("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = document2.childNodes();
        org.jsoup.parser.Tag tag13 = document2.tag();
        org.jsoup.select.Elements elements15 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.jsoup.select.Elements elements18 = document2.getElementsByAttributeValueEnding("\n<hi!>\n<html> \n <head> \n </head> \n <body>\n   hi!  \n </body>\n</html>\n</hi!>", " \n<body>\n</body>");
        org.jsoup.nodes.Element element20 = document2.appendElement("<#root class=\" hi!\"> <#root class=\"\"> hi! #document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements22 = element20.select("<#root class=\" #root\">\n</#root><#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <#root class=\" #root\">?</#root><#root class=\"\">?<html>? <head>? </head>? <body>? </body>?</html>?</#root>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
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
        java.lang.String str21 = element9.toString();
        java.lang.String str22 = element9.outerHtml();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<html> \n<head> \n</head> \n<body>  \n</body>\n</html>" + "'", str21, "<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<html> \n<head> \n</head> \n<body>  \n</body>\n</html>" + "'", str22, "<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
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
        org.jsoup.parser.Tag tag56 = element54.tag();
        org.jsoup.parser.Tag tag57 = tag56.getImplicitParent();
        org.jsoup.parser.Tag tag59 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str60 = tag59.getName();
        org.jsoup.parser.Tag tag61 = tag59.getImplicitParent();
        boolean boolean62 = tag59.isEmpty();
        org.jsoup.nodes.Document document66 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node68 = document66.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes69 = node68.attributes();
        org.jsoup.nodes.Element element70 = new org.jsoup.nodes.Element(tag59, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>", attributes69);
        org.jsoup.parser.Tag tag73 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str74 = tag73.getName();
        org.jsoup.parser.Tag tag75 = tag73.getImplicitParent();
        boolean boolean76 = tag73.isEmpty();
        org.jsoup.nodes.Document document80 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node82 = document80.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes83 = node82.attributes();
        org.jsoup.nodes.Element element84 = new org.jsoup.nodes.Element(tag73, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>", attributes83);
        org.jsoup.nodes.Element element85 = new org.jsoup.nodes.Element(tag59, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", attributes83);
        boolean boolean86 = tag57.canContain(tag59);
        org.jsoup.nodes.Element element88 = new org.jsoup.nodes.Element(tag59, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi! <#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "body", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#root" + "'", str32, "#root");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "#document" + "'", str51, "#document");
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>" + "'", str55, "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "#root" + "'", str60, "#root");
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(document66);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(attributes69);
        org.junit.Assert.assertNotNull(tag73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "#root" + "'", str74, "#root");
        org.junit.Assert.assertNotNull(tag75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(document80);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(attributes83);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf(" hi!");
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str5 = document4.tagName();
        document4.setBaseUri("");
        org.jsoup.nodes.Element element9 = document4.addClass("");
        org.jsoup.nodes.Element element11 = document4.toggleClass("");
        org.jsoup.nodes.Element element13 = document4.addClass("hi!");
        org.jsoup.parser.Tag tag14 = document4.tag();
        org.jsoup.nodes.Element element16 = document4.addClass("");
        org.jsoup.nodes.Element element18 = document4.prependElement("hi!");
        org.jsoup.parser.Tag tag19 = document4.tag();
        org.jsoup.parser.Tag tag20 = tag19.getImplicitParent();
        org.jsoup.parser.Tag tag21 = tag20.getImplicitParent();
        java.lang.String str22 = tag20.toString();
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
        boolean boolean43 = tag40.isBlock();
        boolean boolean44 = tag20.canContain(tag40);
        org.jsoup.parser.Tag tag45 = tag40.getImplicitParent();
        org.jsoup.parser.Tag tag46 = tag40.getImplicitParent();
        java.lang.String str47 = tag46.toString();
        java.lang.String str48 = tag46.toString();
        boolean boolean49 = tag46.isBlock();
        boolean boolean50 = tag1.isValidParent(tag46);
        org.jsoup.nodes.Element element52 = new org.jsoup.nodes.Element(tag46, "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><<body>\n</body>>\n</<body>\n</body>>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "body" + "'", str22, "body");
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#root" + "'", str26, "#root");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#root" + "'", str41, "#root");
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "body" + "'", str47, "body");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "body" + "'", str48, "body");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
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
        boolean boolean36 = element34.hasAttr("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element38 = element34.appendElement("\n<body>\n</body>");
        org.jsoup.select.Elements elements39 = element34.children();
        org.jsoup.select.Elements elements41 = element34.getElementsByIndexGreaterThan(0);
        org.jsoup.nodes.Node node43 = element34.removeAttr("hi! hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#document" + "'", str30, "#document");
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(node43);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        boolean boolean2 = tag1.canContainBlock();
        boolean boolean3 = tag1.isData();
        boolean boolean4 = tag1.isData();
        boolean boolean5 = tag1.isEmpty();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
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
        org.jsoup.nodes.Document document51 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str52 = document51.tagName();
        document51.setBaseUri("");
        org.jsoup.nodes.Element element56 = document51.addClass("");
        boolean boolean57 = tag23.equals((java.lang.Object) "");
        java.lang.String str58 = tag23.getName();
        boolean boolean59 = tag3.isValidParent(tag23);
        boolean boolean60 = tag23.isBlock();
        org.jsoup.parser.Tag tag61 = tag23.getImplicitParent();
        org.jsoup.nodes.Document document64 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!", "<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document");
        java.lang.String str65 = document64.className();
        org.jsoup.nodes.Element element67 = document64.toggleClass("\n<hi!>\n</hi!>");
        boolean boolean68 = tag23.equals((java.lang.Object) "\n<hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "body" + "'", str13, "body");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "body" + "'", str14, "body");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#root" + "'", str27, "#root");
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#root" + "'", str35, "#root");
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "#root" + "'", str46, "#root");
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "#root" + "'", str52, "#root");
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "#root" + "'", str58, "#root");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element18 = document10.appendText("body");
        org.jsoup.nodes.Element element19 = document10.parent();
        boolean boolean20 = document10.hasText();
        org.jsoup.nodes.Element element22 = document10.wrap("<html> <head> </head> <body> hi! </body> </html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi! <#root> <html> <head> </head> <body> hi! </body> </html> </#root>");
        org.jsoup.nodes.Document document25 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str26 = document25.tagName();
        document25.setBaseUri("");
        document25.setBaseUri("");
        org.jsoup.nodes.Document document33 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str34 = document33.tagName();
        document33.setBaseUri("");
        document33.setBaseUri("");
        org.jsoup.nodes.Element element39 = document25.appendChild((org.jsoup.nodes.Node) document33);
        org.jsoup.nodes.Element element40 = document25.empty();
        boolean boolean41 = document25.isBlock();
        org.jsoup.nodes.Element element43 = document25.addClass("#root");
        org.jsoup.select.Elements elements46 = element43.getElementsByAttributeValueNot("#root", "body");
        org.jsoup.nodes.Element element48 = element43.prependText("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        document10.replaceWith((org.jsoup.nodes.Node) element43);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#root" + "'", str26, "#root");
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#root" + "'", str34, "#root");
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(element48);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str2 = tag1.getName();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node9 = document7.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document7.childNodes();
        org.jsoup.nodes.Attributes attributes11 = document7.attributes();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag3, "#root", attributes11);
        java.lang.String str13 = tag3.getName();
        boolean boolean14 = tag3.isInline();
        boolean boolean15 = tag3.preserveWhitespace();
        org.jsoup.parser.Tag tag17 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str18 = tag17.getName();
        org.jsoup.parser.Tag tag19 = tag17.getImplicitParent();
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node25 = document23.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = document23.childNodes();
        org.jsoup.nodes.Attributes attributes27 = document23.attributes();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag19, "#root", attributes27);
        org.jsoup.nodes.Element element30 = element28.prependText("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = element28.childNodes();
        boolean boolean32 = tag3.equals((java.lang.Object) element28);
        org.jsoup.select.Elements elements35 = element28.getElementsByAttributeValueEnding("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "hi! hi! #root\n<html>\n<head>\n</head>\n<body>\n hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "body" + "'", str13, "body");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(elements35);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexLessThan((int) (byte) 100);
        org.jsoup.nodes.Element element6 = document2.appendText("hi!");
        org.jsoup.select.Elements elements8 = document2.getElementsByAttribute(" hi! #document");
        org.jsoup.select.Elements elements9 = document2.parents();
        org.jsoup.nodes.Element element10 = document2.empty();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("\n<body class=\"\">\n</body>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root><#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        java.lang.String str3 = document2.id();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean4 = document2.hasAttr("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        org.jsoup.nodes.Element element6 = document2.appendElement("<html> \n<head> \n</head> \n<body>\n  hi!  hi!&lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.nodes.Element element8 = document2.removeClass("");
        org.jsoup.nodes.Attributes attributes9 = element8.attributes();
        org.jsoup.select.Elements elements12 = element8.getElementsByAttributeValueStarting(" \n<body>\n</body>", "<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.nodes.Element element7 = document2.text("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        org.jsoup.select.Elements elements9 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root><hi> \n</hi> \n<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.select.Elements elements14 = document2.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "\n<hi!>\n</hi!>");
        org.jsoup.select.Elements elements17 = document2.getElementsByAttributeValueEnding("hi! #document", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
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
        java.lang.Integer int24 = document2.elementSiblingIndex();
        org.jsoup.nodes.Attributes attributes25 = document2.attributes();
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node30 = document28.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = document28.childNodes();
        org.jsoup.nodes.Attributes attributes32 = document28.attributes();
        org.jsoup.nodes.Element element34 = document28.prependText("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element36 = element34.child((int) (byte) 0);
        boolean boolean37 = document2.equals((java.lang.Object) (byte) 0);
        java.lang.Integer int38 = document2.elementSiblingIndex();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
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
        boolean boolean21 = tag17.isData();
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str25 = document24.tagName();
        document24.setBaseUri("");
        org.jsoup.nodes.Element element29 = document24.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element31 = document24.appendText("hi! ");
        java.lang.String str32 = element31.html();
        org.jsoup.nodes.Document document35 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node37 = document35.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = document35.childNodes();
        org.jsoup.nodes.Attributes attributes39 = document35.attributes();
        java.lang.String str41 = document35.attr("#root");
        org.jsoup.select.Elements elements44 = document35.getElementsByAttributeValueEnding("#root", "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.nodes.Element element45 = element31.appendChild((org.jsoup.nodes.Node) document35);
        boolean boolean46 = tag17.equals((java.lang.Object) element45);
        boolean boolean47 = tag17.isEmpty();
        org.jsoup.parser.Tag tag49 = org.jsoup.parser.Tag.valueOf("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        boolean boolean50 = tag17.isValidParent(tag49);
        boolean boolean51 = tag49.canContainBlock();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#root" + "'", str25, "#root");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!" + "'", str32, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
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
        org.jsoup.select.Elements elements30 = document2.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.nodes.Element element32 = document2.child((int) (short) 0);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element32);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element18 = document10.appendText("body");
        org.jsoup.nodes.Element element20 = document10.prependText("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes21 = element20.attributes();
        boolean boolean23 = element20.hasClass("hi! hi!");
        org.jsoup.nodes.Element element24 = element20.previousElementSibling();
        org.jsoup.parser.Tag tag26 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str27 = tag26.getName();
        org.jsoup.parser.Tag tag28 = tag26.getImplicitParent();
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node34 = document32.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList35 = document32.childNodes();
        org.jsoup.nodes.Attributes attributes36 = document32.attributes();
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element(tag28, "#root", attributes36);
        org.jsoup.select.Elements elements40 = element37.getElementsByAttributeValueStarting("#document", "hi! #document");
        java.lang.String str41 = element37.baseUri();
        org.jsoup.nodes.Document document44 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str45 = document44.tagName();
        document44.setBaseUri("");
        org.jsoup.nodes.Element element49 = document44.addClass("");
        org.jsoup.nodes.Element element51 = document44.toggleClass("");
        org.jsoup.nodes.Element element53 = element51.html("");
        boolean boolean54 = element51.isBlock();
        java.lang.String[] strArray59 = new java.lang.String[] { "", "body", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet60 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet60, strArray59);
        org.jsoup.nodes.Element element62 = element51.classNames((java.util.Set<java.lang.String>) strSet60);
        org.jsoup.nodes.Element element63 = element37.classNames((java.util.Set<java.lang.String>) strSet60);
        org.jsoup.nodes.Element element64 = element20.classNames((java.util.Set<java.lang.String>) strSet60);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#root" + "'", str27, "#root");
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#root" + "'", str41, "#root");
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "#root" + "'", str45, "#root");
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "body", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(element64);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &amp;lt;#root class=&amp;quot; hi!&amp;quot;&amp;gt; &amp;lt;#root class=&amp;quot;&amp;quot;&amp;gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! #document &lt;/body&gt; &lt;/html&gt; &lt;/body&gt; &lt;/html&gt;", "<html> <head> </head> <body> </body> </html> hi! hi!");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
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
        boolean boolean33 = tag7.isInline();
        java.lang.String str34 = tag7.getName();
        org.jsoup.parser.Tag tag35 = tag7.getImplicitParent();
        boolean boolean36 = tag7.isBlock();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#root" + "'", str34, "#root");
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        java.lang.Integer int5 = document2.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = document2.attr("hi!", "#document");
        java.lang.String str9 = document2.id();
        org.jsoup.nodes.Element element11 = document2.prependText("<html>\n <head>\n </head>\n <body>\n  &lt;#root&gt; &lt;/#root&gt;\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>hi!");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
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
        org.jsoup.nodes.Element element33 = element9.child((int) (byte) 0);
        org.jsoup.nodes.Element element35 = element33.append("<html> \n<head> \n</head> \n<body>\n  hi!  hi!&lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   \n  </body>\n </html>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
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
        org.jsoup.nodes.Node node27 = document2.removeAttr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root><#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.nodes.Element element9 = document2.text("");
        org.jsoup.nodes.Attributes attributes10 = document2.attributes();
        org.jsoup.nodes.Element element12 = document2.prependElement("<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
        java.lang.Class<?> wildcardClass13 = element12.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element element4 = document2.child(0);
        org.jsoup.nodes.Element element5 = element4.parent();
        org.jsoup.nodes.Element element7 = element5.getElementById("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n   <html> \n    <head> \n    </head> \n    <body>\n      hi! #document    \n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n   <html> \n    <head> \n    </head> \n    <body>\n      hi! #document    \n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
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
        org.jsoup.parser.Tag tag18 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str19 = tag18.getName();
        boolean boolean20 = tag18.isData();
        java.lang.String str21 = tag18.toString();
        boolean boolean22 = tag3.isValidParent(tag18);
        org.jsoup.parser.Tag tag23 = tag18.getImplicitParent();
        java.lang.String str24 = tag18.getName();
        boolean boolean25 = tag18.isInline();
        boolean boolean26 = tag18.isBlock();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag18, "hi! <html> <head> </head> <body> hi! </body> </html>hi! hi!");
        org.jsoup.select.Elements elements30 = element28.getElementsByClass("<html>\n<head>\n</head>\n<body> \n <html>\n  <head>\n  </head>\n  <body> \n  </body>\n </html>\n</body>\n</html><#root class=\"\">\n<&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>\n</&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>\n<html> \n <head> \n </head> \n <body>  \n </body>\n</html>\n</#root>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "body" + "'", str13, "body");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "body" + "'", str14, "body");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#root" + "'", str21, "#root");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(elements30);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        org.jsoup.nodes.Node node6 = document2.childNode(0);
        org.jsoup.select.Elements elements8 = document2.getElementsByIndexEquals((-1));
        java.lang.String str10 = document2.attr("\n<hi!>\n&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&lt;hi&gt; &lt;/hi&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! hi! &lt;/body&gt; &lt;/html&gt;\n</hi!>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
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
        org.jsoup.select.Elements elements59 = document54.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.nodes.Element element61 = document54.text("");
        org.jsoup.nodes.Attributes attributes62 = document54.attributes();
        org.jsoup.nodes.Element element63 = new org.jsoup.nodes.Element(tag31, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!", attributes62);
        boolean boolean64 = tag31.isData();
        java.lang.Object obj65 = null;
        boolean boolean66 = tag31.equals(obj65);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#root" + "'", str37, "#root");
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#root" + "'", str42, "#root");
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "#root" + "'", str45, "#root");
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "#root" + "'", str48, "#root");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "#root" + "'", str55, "#root");
        org.junit.Assert.assertNotNull(elements59);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(attributes62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
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
        document20.setBaseUri("");
        org.jsoup.nodes.Element element25 = document20.addClass("");
        org.jsoup.select.Elements elements26 = element25.parents();
        org.jsoup.select.Elements elements27 = element25.getAllElements();
        org.jsoup.nodes.Attributes attributes28 = element25.attributes();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag3, "hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", attributes28);
        org.jsoup.nodes.Document document33 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str34 = document33.tagName();
        document33.setBaseUri("");
        org.jsoup.nodes.Element element38 = document33.addClass("");
        org.jsoup.select.Elements elements39 = element38.parents();
        org.jsoup.select.Elements elements40 = element38.getAllElements();
        org.jsoup.nodes.Document document43 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str44 = document43.tagName();
        document43.setBaseUri("");
        org.jsoup.nodes.Element element48 = document43.addClass("");
        org.jsoup.nodes.Element element50 = document43.toggleClass("");
        org.jsoup.nodes.Element element52 = element50.html("");
        boolean boolean53 = element50.isBlock();
        java.lang.String[] strArray58 = new java.lang.String[] { "", "body", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet59 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet59, strArray58);
        org.jsoup.nodes.Element element61 = element50.classNames((java.util.Set<java.lang.String>) strSet59);
        org.jsoup.nodes.Element element62 = element38.classNames((java.util.Set<java.lang.String>) strSet59);
        org.jsoup.nodes.Element element64 = element62.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element65 = element62.empty();
        org.jsoup.nodes.Attributes attributes66 = element65.attributes();
        org.jsoup.nodes.Element element67 = new org.jsoup.nodes.Element(tag3, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", attributes66);
        boolean boolean68 = tag3.isData();
        org.jsoup.nodes.Document document72 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str73 = document72.tagName();
        document72.setBaseUri("");
        org.jsoup.nodes.Element element77 = document72.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str78 = document72.html();
        org.jsoup.nodes.Attributes attributes79 = document72.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList80 = document72.childNodes();
        org.jsoup.nodes.Element element82 = document72.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element84 = element82.text("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes85 = element82.attributes();
        org.jsoup.nodes.Element element86 = new org.jsoup.nodes.Element(tag3, "&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &amp;lt;#root class=&amp;quot; hi!&amp;quot;&amp;gt; &amp;lt;#root class=&amp;quot;&amp;quot;&amp;gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! #document &lt;/body&gt; &lt;/html&gt; &lt;/body&gt; &lt;/html&gt;\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", attributes85);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "body" + "'", str13, "body");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "body" + "'", str14, "body");
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#root" + "'", str21, "#root");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#root" + "'", str34, "#root");
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "#root" + "'", str44, "#root");
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "body", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(attributes66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(document72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "#root" + "'", str73, "#root");
        org.junit.Assert.assertNotNull(element77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;" + "'", str78, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(attributes79);
        org.junit.Assert.assertNotNull(nodeList80);
        org.junit.Assert.assertNotNull(element82);
        org.junit.Assert.assertNotNull(element84);
        org.junit.Assert.assertNotNull(attributes85);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
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
        java.lang.String str34 = element17.outerHtml();
        java.lang.String str35 = element17.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi> \n</hi> \n<html> \n<head> \n</head> \n<body>\n  hi!  hi!\n</body>\n</html>" + "'", str34, "&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi> \n</hi> \n<html> \n<head> \n</head> \n<body>\n  hi!  hi!\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#document" + "'", str35, "#document");
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
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
        org.jsoup.nodes.Element element23 = element20.removeClass("");
        org.jsoup.select.Elements elements26 = element23.getElementsByAttributeValueEnding("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>#root\n</#root>", "#root \n<html> \n <head> \n </head> \n <body>\n   hi!  #roothi!&lt;&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi> \n  </hi> \n  <html> \n   <head> \n   </head> \n   <body>\n     hi!  hi!&gt;   \n    <html> \n     <head> \n     </head> \n     <body>\n       hi!  hi!&gt;\n     </body>\n    </html>\n   </body>\n  </html>\n </body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; hi! &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
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
        org.jsoup.nodes.Element element60 = element54.prependElement("#root hi! #root hi! hi! #root");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#root" + "'", str26, "#root");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#root" + "'", str37, "#root");
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!" });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(element60);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
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
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str21 = tag20.getName();
        boolean boolean22 = tag20.isData();
        boolean boolean23 = tag17.equals((java.lang.Object) tag20);
        boolean boolean24 = tag17.isEmpty();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#root" + "'", str21, "#root");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
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
        boolean boolean75 = tag74.isBlock();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#root" + "'", str36, "#root");
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#root" + "'", str42, "#root");
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "#root" + "'", str46, "#root");
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "#root" + "'", str54, "#root");
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "#root" + "'", str62, "#root");
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(tag74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
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
        boolean boolean36 = element34.hasAttr("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document39 = org.jsoup.parser.Parser.parse("#root", "hi!");
        java.util.Set<java.lang.String> strSet40 = document39.classNames();
        org.jsoup.nodes.Element element41 = element34.classNames(strSet40);
        java.lang.String str42 = element34.data();
        org.jsoup.nodes.Element element44 = element34.text("<#root>\n</#root>");
        boolean boolean45 = element44.isBlock();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#document" + "'", str30, "#document");
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str2 = tag1.getName();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node9 = document7.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document7.childNodes();
        org.jsoup.nodes.Attributes attributes11 = document7.attributes();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag3, "#root", attributes11);
        java.lang.String str13 = tag3.getName();
        boolean boolean14 = tag3.isInline();
        boolean boolean15 = tag3.preserveWhitespace();
        org.jsoup.parser.Tag tag17 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str18 = tag17.getName();
        org.jsoup.parser.Tag tag19 = tag17.getImplicitParent();
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node25 = document23.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = document23.childNodes();
        org.jsoup.nodes.Attributes attributes27 = document23.attributes();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag19, "#root", attributes27);
        org.jsoup.nodes.Element element30 = element28.prependText("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = element28.childNodes();
        boolean boolean32 = tag3.equals((java.lang.Object) element28);
        org.jsoup.parser.Tag tag33 = tag3.getImplicitParent();
        org.jsoup.nodes.Document document36 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element38 = document36.appendText("#root");
        org.jsoup.nodes.Element element40 = document36.prepend("#root");
        org.jsoup.nodes.Element element41 = element40.empty();
        org.jsoup.select.Elements elements43 = element40.getElementsByIndexGreaterThan((int) '4');
        boolean boolean45 = element40.hasAttr("hi! #document");
        org.jsoup.select.Elements elements46 = element40.getAllElements();
        boolean boolean47 = tag3.equals((java.lang.Object) element40);
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element(tag3, "<html>\n<head>\n</head>\n<body>\n #root \n <html> \n  <head> \n  </head> \n  <body>\n    hi!  #root&lt;#root&gt; \n   <html> \n    <head> \n    </head> \n    <body>\n      hi!  &lt;#root&gt; \n     <html> \n      <head> \n      </head> \n      <body>\n        hi!  #root  \n      </body>\n     </html>\n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "body" + "'", str13, "body");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse(" hi! #document", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>#document");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>", "\n<hi!>\n</hi!>");
        org.jsoup.select.Elements elements3 = document2.getAllElements();
        org.jsoup.select.Elements elements4 = document2.children();
        org.jsoup.select.Elements elements7 = document2.getElementsByAttributeValueContaining("hi! #document hi!", "hi! <#root> hi!<html> <head> </head> <body> hi! </body> </html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
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
        java.util.Set<java.lang.String> strSet40 = element39.classNames();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#document" + "'", str30, "#document");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(strSet40);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element18 = document10.appendText("<html>\n<head>\n</head>\n<body>\n body\n</body>\n</html>");
        java.lang.String str20 = document10.attr("<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str24 = document23.tagName();
        document23.setBaseUri("");
        document23.setBaseUri("");
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str32 = document31.tagName();
        document31.setBaseUri("");
        document31.setBaseUri("");
        org.jsoup.nodes.Element element37 = document23.appendChild((org.jsoup.nodes.Node) document31);
        java.lang.String str38 = document23.baseUri();
        org.jsoup.parser.Tag tag39 = document23.tag();
        org.jsoup.select.Elements elements42 = document23.getElementsByAttributeValueContaining("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>", "hi! #document");
        boolean boolean44 = document23.hasClass("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        org.jsoup.nodes.Element element45 = document10.appendChild((org.jsoup.nodes.Node) document23);
        java.lang.String str46 = document23.id();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#root" + "'", str32, "#root");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
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
        java.lang.String str28 = element27.val();
        java.lang.String str29 = element27.text();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#root" + "'", str17, "#root");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str2 = tag1.getName();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        boolean boolean4 = tag1.isEmpty();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node10 = document8.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes11 = node10.attributes();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag1, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>", attributes11);
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str16 = tag15.getName();
        org.jsoup.parser.Tag tag17 = tag15.getImplicitParent();
        boolean boolean18 = tag15.isEmpty();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node24 = document22.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes25 = node24.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag15, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>", attributes25);
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag1, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", attributes25);
        java.lang.String str28 = tag1.getName();
        boolean boolean29 = tag1.isData();
        boolean boolean30 = tag1.preserveWhitespace();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#root" + "'", str28, "#root");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
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
        org.jsoup.nodes.Element element28 = document2.prependElement("<#root>\n<html>\n <head>\n </head>\n <body>\n  body \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.Integer int29 = element28.siblingIndex();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>" + "'", str22, "<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
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
        org.jsoup.nodes.Element element28 = element20.removeClass("<#roothi!>\n</#roothi!>");
        element20.remove();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
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
        org.jsoup.nodes.Element element24 = document2.wrap("hi!");
        java.lang.String str25 = document2.tagName();
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parse("", "hi!");
        org.jsoup.nodes.Element element30 = document28.prepend("hi! ");
        java.lang.String str31 = element30.outerHtml();
        org.jsoup.nodes.Element element33 = element30.prepend("#root");
        boolean boolean35 = element33.hasAttr("\n<<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! #document>\n</<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! #document>");
        boolean boolean36 = document2.equals((java.lang.Object) "\n<<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! #document>\n</<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! #document>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#root" + "'", str25, "#root");
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str31, "hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValue("hi! ", "#root");
        org.jsoup.nodes.Element element16 = element9.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element19 = element9.attr("hi! #document", "#root");
        java.lang.String str20 = element19.tagName();
        org.jsoup.nodes.Element element22 = element19.text("#root hi! #root hi! hi! #root");
        org.jsoup.nodes.Attributes attributes23 = element22.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements26 = element22.getElementsByAttributeValueEnding("", "\n<hi!>\n&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&lt;hi&gt; &lt;/hi&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! hi! &lt;/body&gt; &lt;/html&gt;\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(attributes23);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
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
        boolean boolean20 = tag18.isEmpty();
        java.lang.String str21 = tag18.getName();
        java.lang.String str22 = tag18.toString();
        org.jsoup.parser.Tag tag24 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str25 = tag24.getName();
        java.lang.String str26 = tag24.getName();
        boolean boolean27 = tag18.isValidParent(tag24);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "body" + "'", str21, "body");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "body" + "'", str22, "body");
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#root" + "'", str25, "#root");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#root" + "'", str26, "#root");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        document2.setBaseUri("");
        org.jsoup.parser.Tag tag12 = document2.tag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = document2.childNode(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
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
        boolean boolean36 = tag7.isEmpty();
        java.lang.String str37 = tag7.getName();
        boolean boolean38 = tag7.isData();
        org.jsoup.parser.Tag tag40 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str41 = tag40.getName();
        org.jsoup.parser.Tag tag42 = tag40.getImplicitParent();
        java.lang.String str43 = tag40.toString();
        boolean boolean44 = tag40.preserveWhitespace();
        boolean boolean45 = tag40.preserveWhitespace();
        java.lang.String str46 = tag40.toString();
        boolean boolean47 = tag40.isInline();
        org.jsoup.parser.Tag tag48 = tag40.getImplicitParent();
        boolean boolean49 = tag7.isValidParent(tag40);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#root" + "'", str33, "#root");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#root" + "'", str34, "#root");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#root" + "'", str35, "#root");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#root" + "'", str37, "#root");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#root" + "'", str41, "#root");
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "#root" + "'", str43, "#root");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "#root" + "'", str46, "#root");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element4 = document2.html("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root><#document>\n</#document>");
        org.jsoup.nodes.Element element7 = element4.attr("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>body", "&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements23 = element21.select("hi! <#root class=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n hi! \n&lt;/body&gt;\n&lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; hi! &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;hi!\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>\n</#root><<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document>\n</<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi! <#root class=\"&lt;html&gt;?&lt;head&gt;?&lt;/head&gt;?&lt;body&gt;? hi! ?&lt;/body&gt;?&lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; hi! &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;hi!\">?<html>? <head>? </head>? <body>?  hi! ? </body>?</html><#root>? <html>?  <head>?  </head>?  <body>?   hi! ?  </body>? </html>?</#root>?</#root><<#root class=\"\">?<html>? <head>? </head>? <body>?  hi! ? </body>?</html>?</#root>#document>?</<#root class=\"\">?<html>? <head>? </head>? <body>?  hi! ? </body>?</html>?</#root>#document>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
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
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "body" + "'", str17, "body");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#root" + "'", str27, "#root");
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#root" + "'", str35, "#root");
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "#document" + "'", str44, "#document");
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("body", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttribute("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document");
        org.jsoup.nodes.Element element9 = document2.prependElement("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        org.jsoup.nodes.Element element10 = element9.parent();
        org.jsoup.nodes.Node node12 = element9.removeAttr("\n<&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>\n</&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>");
        element9.setBaseUri("<html> \n<head> \n</head> \n<body>\n  hi!  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        boolean boolean12 = element9.isBlock();
        org.jsoup.select.Elements elements15 = element9.getElementsByAttributeValueEnding("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>", "#document");
        java.lang.String str16 = element9.tagName();
        java.lang.String str18 = element9.absUrl("<html>\n<head>\n</head>\n<body>\n &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   #document \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.select.Elements elements21 = element9.getElementsByAttributeValueEnding("<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        boolean boolean12 = element9.isBlock();
        org.jsoup.nodes.Attributes attributes13 = element9.attributes();
        java.lang.String str14 = element9.baseUri();
        org.jsoup.nodes.Element element16 = element9.prependText("<html>\n<head>\n</head>\n<body>\n &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   #document \n  </body>\n </html>\n</body>\n</html>");
        java.util.Set<java.lang.String> strSet17 = element16.classNames();
        org.jsoup.nodes.Attributes attributes18 = element16.attributes();
        org.jsoup.nodes.Attributes attributes19 = element16.attributes();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
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
        java.lang.String str21 = element18.toString();
        org.jsoup.select.Elements elements22 = element18.getAllElements();
        org.jsoup.nodes.Node node23 = element18.previousSibling();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str8 = document2.html();
        org.jsoup.nodes.Attributes attributes9 = document2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document2.childNodes();
        org.jsoup.nodes.Element element12 = document2.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = element12.text("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element12.prependText("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><<body>\n</body>>\n</<body>\n</body>>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;" + "'", str8, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
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
        java.lang.String str19 = element9.text();
        java.util.Set<java.lang.String> strSet20 = element9.classNames();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        java.lang.Class<?> wildcardClass3 = document2.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        java.lang.String str12 = document2.outerHtml();
        org.jsoup.nodes.Element element14 = document2.child(0);
        org.jsoup.nodes.Element element16 = element14.text("");
        org.jsoup.nodes.Element element17 = element16.parent();
        java.lang.String str18 = element16.data();
        org.jsoup.nodes.Element element20 = element16.getElementById(" hi! <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str21 = element16.data();
        org.jsoup.nodes.Element element23 = element16.append("body\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements25 = element23.getElementsByClass("<html> \n<head> \n</head> \n<body>\n  hi!  hi!&lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   \n  </body>\n </html>\n</body>\n</html>");
        element23.setBaseUri("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    hi!  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!\n  </body>\n </html>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>" + "'", str12, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Element element8 = element6.prependText("body");
        org.jsoup.parser.Tag tag9 = element8.tag();
        org.jsoup.nodes.Element element12 = element8.attr("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#root");
        org.jsoup.nodes.Element element15 = element12.attr("hi! hi!", "\n<hi!>\n</hi!>");
        java.lang.String str16 = element12.html();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "body#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root" + "'", str16, "body#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root");
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Element element9 = document2.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str10 = document2.toString();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root" + "'", str10, "#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root");
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        java.lang.String str3 = document2.baseUri();
        org.jsoup.nodes.Element element5 = document2.appendText("\n<hi!>\n<html> \n <head> \n </head> \n <body>\n   hi!  \n </body>\n</html>\n</hi!>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!" + "'", str3, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf(" hi!");
        org.jsoup.parser.Tag tag2 = tag1.getImplicitParent();
        org.jsoup.parser.Tag tag3 = tag2.getImplicitParent();
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str6 = tag5.getName();
        boolean boolean7 = tag5.isData();
        boolean boolean8 = tag5.isBlock();
        boolean boolean9 = tag3.canContain(tag5);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
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
        java.lang.String[] strArray36 = new java.lang.String[] { "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi! ", "#root", "body" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        org.jsoup.nodes.Element element39 = element31.classNames((java.util.Set<java.lang.String>) strSet37);
        element31.setBaseUri("hi! #document");
        org.jsoup.nodes.Element element42 = element31.empty();
        org.jsoup.nodes.Attributes attributes43 = element42.attributes();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi! ", "#root", "body" });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(attributes43);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element12 = document2.empty();
        org.jsoup.nodes.Element element14 = document2.val("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document2.childNodes();
        org.jsoup.nodes.Element element17 = document2.getElementById("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element17.toggleClass(" #root");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(element17);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
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
        org.jsoup.select.Elements elements20 = document7.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n hi! hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
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
        org.jsoup.parser.Tag tag56 = element54.tag();
        java.lang.String str57 = tag56.getName();
        org.jsoup.parser.Tag tag59 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str60 = tag59.getName();
        org.jsoup.parser.Tag tag61 = tag59.getImplicitParent();
        boolean boolean62 = tag59.isEmpty();
        boolean boolean63 = tag59.isBlock();
        boolean boolean64 = tag56.isValidParent(tag59);
        boolean boolean65 = tag56.isBlock();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "body", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#root" + "'", str32, "#root");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "#document" + "'", str51, "#document");
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>" + "'", str55, "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "#root" + "'", str57, "#root");
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "#root" + "'", str60, "#root");
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str2 = tag1.getName();
        boolean boolean3 = tag1.isData();
        java.lang.String str4 = tag1.getName();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str8 = document7.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document7.childNodes();
        boolean boolean11 = document7.hasAttr("#root");
        org.jsoup.parser.Tag tag12 = document7.tag();
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str16 = document15.tagName();
        document15.setBaseUri("");
        document15.setBaseUri("");
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str24 = document23.tagName();
        document23.setBaseUri("");
        document23.setBaseUri("");
        org.jsoup.nodes.Element element30 = document23.appendText("#root");
        org.jsoup.nodes.Element element31 = document15.appendChild((org.jsoup.nodes.Node) document23);
        boolean boolean32 = tag12.equals((java.lang.Object) element31);
        org.jsoup.parser.Tag tag34 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str35 = tag34.getName();
        org.jsoup.parser.Tag tag36 = tag34.getImplicitParent();
        boolean boolean37 = tag12.canContain(tag36);
        java.lang.String str38 = tag12.toString();
        java.lang.String str39 = tag12.getName();
        org.jsoup.nodes.Document document42 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str43 = document42.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList44 = document42.childNodes();
        boolean boolean46 = document42.hasAttr("#root");
        org.jsoup.parser.Tag tag47 = document42.tag();
        org.jsoup.nodes.Document document50 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str51 = document50.tagName();
        document50.setBaseUri("");
        document50.setBaseUri("");
        org.jsoup.nodes.Document document58 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str59 = document58.tagName();
        document58.setBaseUri("");
        document58.setBaseUri("");
        org.jsoup.nodes.Element element65 = document58.appendText("#root");
        org.jsoup.nodes.Element element66 = document50.appendChild((org.jsoup.nodes.Node) document58);
        boolean boolean67 = tag47.equals((java.lang.Object) element66);
        org.jsoup.parser.Tag tag69 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str70 = tag69.getName();
        org.jsoup.parser.Tag tag71 = tag69.getImplicitParent();
        boolean boolean72 = tag47.canContain(tag71);
        org.jsoup.nodes.Document document75 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str76 = document75.tagName();
        document75.setBaseUri("");
        org.jsoup.nodes.Element element80 = document75.addClass("");
        boolean boolean81 = tag47.equals((java.lang.Object) "");
        boolean boolean82 = tag47.canContainBlock();
        boolean boolean83 = tag12.canContain(tag47);
        boolean boolean84 = tag1.isValidParent(tag12);
        org.jsoup.parser.Tag tag85 = tag12.getImplicitParent();
        boolean boolean86 = tag12.isInline();
        boolean boolean87 = tag12.isData();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#root" + "'", str35, "#root");
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#root" + "'", str38, "#root");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "#root" + "'", str39, "#root");
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "#root" + "'", str43, "#root");
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "#root" + "'", str51, "#root");
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "#root" + "'", str59, "#root");
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(tag69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "#root" + "'", str70, "#root");
        org.junit.Assert.assertNotNull(tag71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(document75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "#root" + "'", str76, "#root");
        org.junit.Assert.assertNotNull(element80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(tag85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        org.jsoup.select.Elements elements9 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element10 = document2.parent();
        boolean boolean12 = document2.hasAttr(" body hi!");
        java.lang.String str13 = document2.text();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("body", "#document");
        boolean boolean3 = document2.isBlock();
        org.jsoup.nodes.Element element5 = document2.toggleClass("#document");
        org.jsoup.select.Elements elements7 = document2.getElementsByClass("\n<<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! #document>\n</<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! #document>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        java.lang.String str9 = document2.attr("#root");
        org.jsoup.nodes.Element element11 = document2.text("");
        boolean boolean13 = element11.hasAttr("#document");
        java.lang.String str14 = element11.html();
        java.lang.String str15 = element11.val();
        org.jsoup.nodes.Element element17 = element11.val("<html>\n<head>\n</head>\n<body>\n &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   #document \n  </body>\n </html>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str14, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n <head>\n </head>\n <body>\n  &lt;#root&gt; &lt;/#root&gt;\n </body>\n</html>", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html><#root>\n#root\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>#root<#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html><#root>\n  <html>\n   <head>\n   </head>\n   <body>\n    hi! \n   </body>\n  </html>#root\n </#root>\n</#root>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
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
        org.jsoup.nodes.Node node72 = element68.removeAttr("<#roothi!>\n</#roothi!>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#root" + "'", str37, "#root");
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#root" + "'", str42, "#root");
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "#root" + "'", str45, "#root");
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "#root" + "'", str48, "#root");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "#root" + "'", str55, "#root");
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(attributes65);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(node72);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
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
        boolean boolean24 = tag7.isEmpty();
        org.jsoup.parser.Tag tag25 = tag7.getImplicitParent();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(tag25);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
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
        java.util.Set<java.lang.String> strSet38 = element37.classNames();
        org.jsoup.nodes.Element element40 = element37.prepend("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(element40);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
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
        java.lang.String[] strArray36 = new java.lang.String[] { "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi! ", "#root", "body" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        org.jsoup.nodes.Element element39 = element31.classNames((java.util.Set<java.lang.String>) strSet37);
        element31.setBaseUri("hi! #document");
        org.jsoup.nodes.Element element42 = element31.empty();
        org.jsoup.nodes.Element element44 = element42.appendElement("<html>\n <head>\n </head>\n <body>\n  #root \n </body>\n</html><#root>\n #root\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root<#root>\n  <html>\n   <head>\n   </head>\n   <body>\n    hi! \n   </body>\n  </html><#root>\n   <html>\n    <head>\n    </head>\n    <body>\n     hi! \n    </body>\n   </html>#root\n  </#root>\n </#root>\n</#root>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element45 = element42.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = element45.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi! ", "#root", "body" });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNull(element45);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
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
        java.lang.String str28 = element25.nodeName();
        org.jsoup.nodes.Element element30 = element25.html("hi! #root");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#document" + "'", str28, "#document");
        org.junit.Assert.assertNotNull(element30);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
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
        org.jsoup.select.Elements elements20 = document2.getElementsByAttributeValueNot("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element22 = document2.toggleClass("hi! <html> <head> </head> <body> hi! </body> </html>hi! hi!");
        org.jsoup.nodes.Element element24 = document2.appendElement("<#document>\n</#document>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
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
        boolean boolean15 = tag14.isInline();
        boolean boolean16 = tag14.isInline();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag14, "<html> \n<head> \n</head> \n<body>  \n</body>\n</html>body#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>\n</#root>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "body" + "'", str13, "body");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
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
        org.jsoup.nodes.Attributes attributes46 = element45.attributes();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#root" + "'", str32, "#root");
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(attributes46);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
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
        org.jsoup.nodes.Element element22 = element9.toggleClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.nodes.Element element24 = element22.prepend("hi! hi!hi!");
        org.jsoup.select.Elements elements26 = element22.getElementsByAttribute("<html> <head> </head> <body> body </body> </html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValue("hi! ", "#root");
        org.jsoup.nodes.Element element16 = element9.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements19 = element16.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "#root");
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
        org.jsoup.nodes.Element element41 = document22.addClass("hi!");
        org.jsoup.nodes.Document document44 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node46 = document44.removeAttr("hi!");
        org.jsoup.nodes.Element element48 = document44.addClass("");
        org.jsoup.nodes.Element element49 = document22.prependChild((org.jsoup.nodes.Node) element48);
        java.lang.String str50 = element49.nodeName();
        org.jsoup.nodes.Element element52 = element49.appendText("#document");
        java.lang.String str53 = element49.baseUri();
        java.lang.Integer int54 = element49.elementSiblingIndex();
        org.jsoup.nodes.Element element55 = element16.prependChild((org.jsoup.nodes.Node) element49);
        org.jsoup.nodes.Element element57 = element55.addClass("hi!");
        org.jsoup.select.Elements elements59 = element57.getElementsByIndexEquals((int) (short) 0);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#root" + "'", str23, "#root");
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#root" + "'", str31, "#root");
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "#document" + "'", str50, "#document");
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(elements59);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
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
        org.jsoup.select.Elements elements30 = element27.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int31 = element27.elementSiblingIndex();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
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
        org.jsoup.select.Elements elements37 = element31.getElementsByAttributeValue("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#roothi!<&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>\n</&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>", "<html>\n<head>\n</head>\n<body>\n <hi> \n </hi> \n <html> \n  <head> \n  </head> \n  <body>\n    hi!  \n  </body>\n </html>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elements37);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        java.lang.String str9 = document2.attr("#root");
        org.jsoup.nodes.Element element11 = document2.text("");
        java.lang.String str12 = document2.nodeName();
        org.jsoup.select.Elements elements14 = document2.getElementsByIndexEquals((int) (short) 0);
        org.jsoup.nodes.Element element16 = document2.getElementById("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element18 = document2.toggleClass("body");
        java.lang.Class<?> wildcardClass19 = document2.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
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
        java.lang.String str26 = element21.absUrl("\n<#document class=\" #root\">\n</#document>");
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str30 = document29.tagName();
        document29.setBaseUri("");
        org.jsoup.nodes.Element element34 = document29.addClass("");
        org.jsoup.nodes.Element element36 = document29.toggleClass("");
        org.jsoup.nodes.Element element38 = element36.html("");
        org.jsoup.select.Elements elements41 = element36.getElementsByAttributeValue("hi! ", "#root");
        org.jsoup.nodes.Element element43 = element36.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element46 = element36.attr("hi! #document", "#root");
        java.lang.String str47 = element36.baseUri();
        org.jsoup.nodes.Element element49 = element36.toggleClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.select.Elements elements51 = element36.getElementsByTag("hi! hi! #root");
        boolean boolean52 = element36.hasText();
        org.jsoup.nodes.Element element53 = element21.prependChild((org.jsoup.nodes.Node) element36);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#root" + "'", str17, "#root");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(element53);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element10 = document2.val("#document");
        org.jsoup.nodes.Element element12 = document2.prependText("\n<hi!>\n</hi!>");
        org.jsoup.nodes.Element element14 = element12.getElementById("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root><#document>\n</#document>");
        org.jsoup.nodes.Element element16 = element12.appendElement("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.nodes.Element element18 = element16.toggleClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root");
        org.jsoup.nodes.Element element19 = element16.previousElementSibling();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.html("hi! ");
        org.jsoup.nodes.Element element12 = document2.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str13 = element12.val();
        org.jsoup.select.Elements elements16 = element12.getElementsByAttributeValueNot("#document", "#document");
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("#root", "hi!");
        java.util.Set<java.lang.String> strSet20 = document19.classNames();
        org.jsoup.nodes.Element element21 = element12.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Element element23 = element12.addClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.select.Elements elements25 = element23.getElementsByIndexGreaterThan(100);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        org.jsoup.select.Elements elements9 = document2.getElementsByIndexLessThan((int) ' ');
        org.jsoup.parser.Tag tag10 = document2.tag();
        java.lang.String str11 = document2.baseUri();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("body", "body");
        org.jsoup.select.Elements elements8 = document2.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#document");
        org.jsoup.nodes.Element element10 = document2.appendText("hi! #document");
        java.lang.String str11 = document2.data();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Element element7 = element6.empty();
        boolean boolean9 = element7.hasAttr("\n<html>\n &lt;html value=&quot;hi! &quot;&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</html>");
        org.jsoup.nodes.Element element11 = element7.appendElement("<#root class=\" hi!\"> <#root class=\"\"> hi! #document");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.nodes.Element element4 = document2.prepend("hi! #document");
        java.lang.String str5 = element4.baseUri();
        org.jsoup.parser.Tag tag7 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str8 = tag7.getName();
        org.jsoup.parser.Tag tag9 = tag7.getImplicitParent();
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node15 = document13.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = document13.childNodes();
        org.jsoup.nodes.Attributes attributes17 = document13.attributes();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag9, "#root", attributes17);
        java.lang.String str19 = tag9.getName();
        java.lang.String str20 = tag9.toString();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag24 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str25 = tag24.getName();
        boolean boolean26 = tag24.isData();
        java.lang.String str27 = tag24.toString();
        boolean boolean28 = tag9.isValidParent(tag24);
        org.jsoup.parser.Tag tag29 = tag24.getImplicitParent();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag29, "");
        org.jsoup.select.Elements elements34 = element31.getElementsByAttributeValue("hi!", "#document");
        org.jsoup.nodes.Element element36 = element31.appendElement("#roothi!");
        // The following exception was thrown during execution in test generation
        try {
            element4.replaceWith((org.jsoup.nodes.Node) element31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>" + "'", str5, "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "body" + "'", str19, "body");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "body" + "'", str20, "body");
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#root" + "'", str25, "#root");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#root" + "'", str27, "#root");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(element36);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        java.lang.String str11 = element9.attr("");
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#root");
        boolean boolean16 = element9.hasClass("\n<body>\n</body>");
        org.jsoup.nodes.Element element17 = element9.parent();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(element17);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        boolean boolean18 = document10.hasClass("#root");
        org.jsoup.select.Elements elements21 = document10.getElementsByAttributeValueNot("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi! ");
        boolean boolean23 = document10.hasAttr("");
        java.lang.String str24 = document10.data();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
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
        java.lang.String str42 = element41.outerHtml();
        org.jsoup.nodes.Element element44 = element41.val("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#roothi!<&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>\n</&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#document" + "'", str30, "#document");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document" + "'", str42, "<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document");
        org.junit.Assert.assertNotNull(element44);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element18 = document10.appendText("body");
        org.jsoup.nodes.Element element19 = document10.parent();
        document10.setBaseUri("<#root>\n</#root>");
        org.jsoup.nodes.Element element24 = document10.attr("<html>\n<head>\n</head>\n<body>\n body \n</body>\n</html>", "hi! #document<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        boolean boolean26 = document10.hasAttr("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element9 = document2.appendText("hi! ");
        org.jsoup.nodes.Element element11 = element9.removeClass("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.select.Elements elements13 = element9.select("body");
        java.util.Set<java.lang.String> strSet14 = element9.classNames();
        org.jsoup.select.Elements elements15 = element9.parents();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
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
        boolean boolean36 = element34.hasAttr("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements38 = element34.getElementsByTag("<html>\n<head>\n</head>\n<body>\n body\n</body>\n</html>#root");
        java.lang.String str39 = element34.outerHtml();
        org.jsoup.nodes.Document document42 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str43 = document42.tagName();
        document42.setBaseUri("");
        org.jsoup.select.Elements elements47 = document42.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.nodes.Element element49 = document42.text("");
        org.jsoup.nodes.Attributes attributes50 = document42.attributes();
        org.jsoup.nodes.Element element53 = document42.attr("#document", "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.nodes.Element element55 = element53.html("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Document document58 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element60 = document58.appendText("#root");
        org.jsoup.nodes.Element element62 = document58.prepend("#root");
        org.jsoup.nodes.Element element64 = element62.prependText("body");
        org.jsoup.parser.Tag tag65 = element64.tag();
        org.jsoup.nodes.Element element68 = element64.attr("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#root");
        boolean boolean69 = element68.hasText();
        org.jsoup.nodes.Element element70 = element55.appendChild((org.jsoup.nodes.Node) element68);
        java.lang.String str71 = element55.className();
        org.jsoup.nodes.Element element72 = element34.appendChild((org.jsoup.nodes.Node) element55);
        org.jsoup.nodes.Attributes attributes73 = element55.attributes();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#document" + "'", str30, "#document");
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>" + "'", str39, "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "#root" + "'", str43, "#root");
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(tag65);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(element72);
        org.junit.Assert.assertNotNull(attributes73);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element9 = element7.appendText("hi! ");
        org.jsoup.nodes.Element element11 = element7.addClass("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root><#document>\n</#document>");
        org.jsoup.select.Elements elements14 = element7.getElementsByAttributeValueContaining("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>#document\n</#root>\n<html> \n<head> \n</head> \n<body>\n  hi! #document\n</body>\n</html>", "hi! #document hi!");
        org.jsoup.select.Elements elements16 = element7.getElementsByTag("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>body");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>hi! hi!body#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
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
        org.jsoup.nodes.Document document33 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str34 = document33.tagName();
        document33.setBaseUri("");
        document33.setBaseUri("");
        org.jsoup.nodes.Document document41 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str42 = document41.tagName();
        document41.setBaseUri("");
        document41.setBaseUri("");
        org.jsoup.nodes.Element element47 = document33.appendChild((org.jsoup.nodes.Node) document41);
        java.lang.String str48 = document33.val();
        org.jsoup.nodes.Element element49 = element30.appendChild((org.jsoup.nodes.Node) document33);
        org.jsoup.select.Elements elements51 = element30.getElementsByIndexGreaterThan((int) (short) 10);
        org.jsoup.nodes.Element element53 = element30.append("<html>\n<head>\n</head>\n<body> &lt;#document&gt; \n</body>\n</html><#root hi!=\"#document\" class=\" body hi!\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#root" + "'", str34, "#root");
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#root" + "'", str42, "#root");
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNotNull(element53);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "hi!");
        org.jsoup.nodes.Element element4 = document2.appendElement("body#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>\n</#root>");
        org.jsoup.select.Elements elements5 = element4.children();
        org.jsoup.nodes.Element element7 = element4.addClass("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>hi!");
        org.jsoup.nodes.Element element9 = element4.prependElement("\n<body class=\"\">\n</body>");
        org.jsoup.select.Elements elements10 = element4.children();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
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
        java.lang.String str19 = element18.baseUri();
        org.jsoup.nodes.Element element21 = element18.getElementById("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(element21);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        org.jsoup.nodes.Element element5 = document2.appendText("#document");
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueContaining("hi!", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str10 = element5.absUrl("\n<hi!>\n</hi!>");
        org.jsoup.select.Elements elements12 = element5.getElementsByAttribute("hi! #root");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        org.jsoup.nodes.Element element11 = document2.wrap("#root");
        org.jsoup.nodes.Element element13 = document2.removeClass("<html>\n<head>\n</head>\n<body>\n <hi> \n </hi> \n <html> \n  <head> \n  </head> \n  <body>\n    hi!  \n  </body>\n </html>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
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
        org.jsoup.parser.Tag tag43 = tag7.getImplicitParent();
        org.jsoup.nodes.Document document46 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node48 = document46.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList49 = document46.childNodes();
        org.jsoup.nodes.Attributes attributes50 = document46.attributes();
        org.jsoup.select.Elements elements52 = document46.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element54 = document46.removeClass("hi! ");
        org.jsoup.select.Elements elements57 = document46.getElementsByAttributeValueContaining("hi! #document<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "\n<&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>\n</&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>");
        org.jsoup.parser.Tag tag58 = document46.tag();
        boolean boolean59 = tag43.isValidParent(tag58);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#root" + "'", str36, "#root");
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#root" + "'", str42, "#root");
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(elements57);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi! hi!hi!", "<hi! #document>\n</hi! #document>");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueNot("<#root>\n</#root>", "hi! hi!");
        java.lang.String str6 = document2.className();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
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
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str31 = document30.tagName();
        document30.setBaseUri("");
        org.jsoup.nodes.Element element35 = document30.addClass("");
        org.jsoup.nodes.Element element37 = document30.toggleClass("");
        org.jsoup.nodes.Element element39 = document30.addClass("hi!");
        org.jsoup.parser.Tag tag40 = document30.tag();
        org.jsoup.nodes.Element element42 = document30.addClass("");
        org.jsoup.nodes.Element element44 = document30.prependElement("hi!");
        org.jsoup.parser.Tag tag45 = document30.tag();
        org.jsoup.parser.Tag tag46 = tag45.getImplicitParent();
        boolean boolean47 = tag7.canContain(tag45);
        org.jsoup.nodes.Document document50 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str51 = document50.tagName();
        document50.setBaseUri("");
        document50.setBaseUri("");
        java.lang.String str57 = document50.attr("#root");
        document50.setBaseUri("hi! #document");
        org.jsoup.nodes.Attributes attributes60 = document50.attributes();
        boolean boolean61 = tag45.equals((java.lang.Object) document50);
        org.jsoup.parser.Tag tag62 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean63 = tag45.isValidParent(tag62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#root" + "'", str31, "#root");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "#root" + "'", str51, "#root");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(attributes60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element element4 = document2.child(0);
        org.jsoup.nodes.Element element5 = element4.parent();
        org.jsoup.nodes.Element element7 = element5.append("hi! #document");
        org.jsoup.nodes.Element element9 = element5.prepend("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.jsoup.select.Elements elements10 = element9.parents();
        java.lang.Class<?> wildcardClass11 = elements10.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.parser.Tag tag12 = document2.tag();
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str16 = tag15.getName();
        org.jsoup.parser.Tag tag17 = tag15.getImplicitParent();
        boolean boolean18 = tag15.isEmpty();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node24 = document22.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes25 = node24.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag15, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>", attributes25);
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag12, "", attributes25);
        org.jsoup.parser.Tag tag28 = tag12.getImplicitParent();
        org.jsoup.parser.Tag tag29 = tag12.getImplicitParent();
        org.jsoup.nodes.Document document33 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str34 = document33.tagName();
        document33.setBaseUri("");
        org.jsoup.nodes.Element element38 = document33.addClass("");
        org.jsoup.nodes.Element element40 = document33.toggleClass("");
        org.jsoup.nodes.Element element42 = element40.html("");
        boolean boolean43 = element40.isBlock();
        org.jsoup.nodes.Attributes attributes44 = element40.attributes();
        org.jsoup.nodes.Element element45 = new org.jsoup.nodes.Element(tag12, "<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>", attributes44);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#root" + "'", str34, "#root");
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(attributes44);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
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
        document20.setBaseUri("");
        org.jsoup.nodes.Element element25 = document20.addClass("");
        org.jsoup.select.Elements elements26 = element25.parents();
        org.jsoup.select.Elements elements27 = element25.getAllElements();
        org.jsoup.nodes.Attributes attributes28 = element25.attributes();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag3, "hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", attributes28);
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parse("", "");
        java.lang.String str33 = document32.tagName();
        org.jsoup.nodes.Element element34 = document32.empty();
        org.jsoup.nodes.Element element35 = element29.appendChild((org.jsoup.nodes.Node) document32);
        org.jsoup.select.Elements elements37 = document32.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element39 = document32.toggleClass("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>#document");
        org.jsoup.nodes.Document document42 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str43 = document42.tagName();
        document42.setBaseUri("");
        org.jsoup.nodes.Element element47 = document42.addClass("");
        org.jsoup.nodes.Element element49 = document42.toggleClass("");
        org.jsoup.nodes.Element element51 = document42.append("hi!");
        java.lang.String str52 = element51.val();
        org.jsoup.nodes.Element element53 = element51.empty();
        org.jsoup.nodes.Element element55 = element53.prependText("body#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>\n</#root>");
        boolean boolean56 = document32.equals((java.lang.Object) element53);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "body" + "'", str13, "body");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "body" + "'", str14, "body");
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#root" + "'", str21, "#root");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#root" + "'", str33, "#root");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "#root" + "'", str43, "#root");
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str2 = tag1.getName();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str7 = document6.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document6.childNodes();
        boolean boolean10 = document6.hasAttr("#root");
        org.jsoup.parser.Tag tag11 = document6.tag();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str15 = document14.tagName();
        document14.setBaseUri("");
        document14.setBaseUri("");
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str23 = document22.tagName();
        document22.setBaseUri("");
        document22.setBaseUri("");
        org.jsoup.nodes.Element element29 = document22.appendText("#root");
        org.jsoup.nodes.Element element30 = document14.appendChild((org.jsoup.nodes.Node) document22);
        boolean boolean31 = tag11.equals((java.lang.Object) element30);
        boolean boolean32 = tag3.isValidParent(tag11);
        boolean boolean33 = tag3.isData();
        org.jsoup.parser.Tag tag35 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str36 = tag35.getName();
        org.jsoup.parser.Tag tag37 = tag35.getImplicitParent();
        org.jsoup.nodes.Document document41 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node43 = document41.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList44 = document41.childNodes();
        org.jsoup.nodes.Attributes attributes45 = document41.attributes();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag37, "#root", attributes45);
        java.lang.String str47 = tag37.getName();
        java.lang.String str48 = tag37.toString();
        org.jsoup.nodes.Element element50 = new org.jsoup.nodes.Element(tag37, "");
        java.lang.String str51 = element50.baseUri();
        org.jsoup.select.Elements elements54 = element50.getElementsByAttributeValueContaining("#root", "<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        boolean boolean55 = tag3.equals((java.lang.Object) elements54);
        java.lang.String str56 = tag3.getName();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#root" + "'", str23, "#root");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#root" + "'", str36, "#root");
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "body" + "'", str47, "body");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "body" + "'", str48, "body");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "body" + "'", str56, "body");
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root><hi> \n</hi> \n<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>", "&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi> \n</hi> \n<html> \n <head> \n </head> \n <body>\n   hi!  hi!\n </body>\n</html>");
        org.jsoup.nodes.Element element4 = document2.append(" hi! hi!hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
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
        org.jsoup.parser.Tag tag18 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str19 = tag18.getName();
        boolean boolean20 = tag18.isData();
        java.lang.String str21 = tag18.toString();
        boolean boolean22 = tag3.isValidParent(tag18);
        org.jsoup.parser.Tag tag23 = tag18.getImplicitParent();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag23, "");
        boolean boolean26 = element25.isBlock();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "body" + "'", str13, "body");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "body" + "'", str14, "body");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#root" + "'", str21, "#root");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
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
        boolean boolean21 = tag17.isData();
        java.lang.String str22 = tag17.toString();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element(tag17, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.jsoup.select.Elements elements25 = element24.children();
        org.jsoup.select.Elements elements27 = element24.getElementsByIndexGreaterThan(0);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("\n<html class=\" hi! #document\">\n<head>\n</head>\n<body>\n</body>\n</html>", "#root \n<html> \n <head> \n </head> \n <body>\n   hi!  #roothi!&lt;&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi> \n  </hi> \n  <html> \n   <head> \n   </head> \n   <body>\n     hi!  hi!&gt;   \n    <html> \n     <head> \n     </head> \n     <body>\n       hi!  hi!&gt;\n     </body>\n    </html>\n   </body>\n  </html>\n </body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; hi! &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;hi!");
        org.jsoup.nodes.Element element5 = document2.attr("<html>\n<head>\n</head>\n<body>\n &lt;#root class=&quot;&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   #document\n  </body>\n </html>\n</body>\n</html>", "");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("body", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttribute("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document");
        org.jsoup.nodes.Element element9 = document2.prependElement("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        boolean boolean10 = element9.isBlock();
        java.lang.String str12 = element9.absUrl("<#root class=\" hi!\"> <#root class=\"\"> hi! #document");
        java.lang.Class<?> wildcardClass13 = element9.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
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
        java.lang.Object obj46 = null;
        boolean boolean47 = tag7.equals(obj46);
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element(tag7, "html");
        boolean boolean50 = tag7.isEmpty();
        boolean boolean51 = tag7.canContainBlock();
        org.jsoup.parser.Tag tag54 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str55 = tag54.getName();
        boolean boolean56 = tag54.isData();
        java.lang.String str57 = tag54.toString();
        org.jsoup.nodes.Element element59 = new org.jsoup.nodes.Element(tag54, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.parser.Tag tag60 = tag54.getImplicitParent();
        org.jsoup.parser.Tag tag63 = org.jsoup.parser.Tag.valueOf("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document67 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str68 = document67.tagName();
        document67.setBaseUri("");
        document67.setBaseUri("");
        org.jsoup.nodes.Document document75 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str76 = document75.tagName();
        document75.setBaseUri("");
        document75.setBaseUri("");
        org.jsoup.nodes.Element element82 = document75.appendText("#root");
        org.jsoup.nodes.Element element83 = document67.appendChild((org.jsoup.nodes.Node) document75);
        org.jsoup.select.Elements elements85 = element83.getElementsByClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean87 = element83.hasClass("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes88 = element83.attributes();
        org.jsoup.nodes.Element element89 = new org.jsoup.nodes.Element(tag63, "<html>\n <head>\n </head>\n <body>\n  #root \n </body>\n</html><#root>\n #root\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root<#root>\n  <html>\n   <head>\n   </head>\n   <body>\n    hi! \n   </body>\n  </html><#root>\n   <html>\n    <head>\n    </head>\n    <body>\n     hi! \n    </body>\n   </html>#root\n  </#root>\n </#root>\n</#root>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;", attributes88);
        org.jsoup.nodes.Element element90 = new org.jsoup.nodes.Element(tag60, "<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>", attributes88);
        org.jsoup.nodes.Element element91 = new org.jsoup.nodes.Element(tag7, "<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>#document\n</#root>\n<html> \n<head> \n</head> \n<body>\n  hi! #document\n</body>\n</html>", attributes88);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#root" + "'", str33, "#root");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#root" + "'", str34, "#root");
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#root" + "'", str38, "#root");
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(tag54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "#root" + "'", str55, "#root");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "#root" + "'", str57, "#root");
        org.junit.Assert.assertNotNull(tag60);
        org.junit.Assert.assertNotNull(tag63);
        org.junit.Assert.assertNotNull(document67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "#root" + "'", str68, "#root");
        org.junit.Assert.assertNotNull(document75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "#root" + "'", str76, "#root");
        org.junit.Assert.assertNotNull(element82);
        org.junit.Assert.assertNotNull(element83);
        org.junit.Assert.assertNotNull(elements85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(attributes88);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
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
        java.lang.String str45 = document22.data();
        org.jsoup.nodes.Element element48 = document22.attr(" #root", "<#root>\n<html>\n <head>\n </head>\n <body>\n  body \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.nodes.Element element49 = document22.firstElementSibling();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#root" + "'", str23, "#root");
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#root" + "'", str31, "#root");
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "#document" + "'", str40, "#document");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element49);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
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
        org.jsoup.nodes.Element element43 = element29.html("");
        java.lang.String str44 = element43.tagName();
        java.util.Set<java.lang.String> strSet45 = element43.classNames();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#document" + "'", str30, "#document");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "#root" + "'", str44, "#root");
        org.junit.Assert.assertNotNull(strSet45);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.select.Elements elements8 = element7.parents();
        org.jsoup.nodes.Element element10 = element7.toggleClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.jsoup.nodes.Element element12 = element10.prepend("body#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>\n</#root>");
        java.lang.String str13 = element12.baseUri();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.parser.Tag tag12 = document2.tag();
        org.jsoup.nodes.Element element14 = document2.addClass("");
        org.jsoup.nodes.Element element16 = element14.prependElement("hi!");
        java.lang.Integer int17 = element16.siblingIndex();
        java.lang.String str18 = element16.outerHtml();
        boolean boolean20 = element16.hasAttr("<html> \n<head> \n</head> \n<body>\n  hi!  hi!&lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.nodes.Node node21 = element16.nextSibling();
        org.jsoup.select.Elements elements22 = element16.getAllElements();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n<hi!>\n</hi!>" + "'", str18, "\n<hi!>\n</hi!>");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str2 = tag1.getName();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        boolean boolean4 = tag1.isEmpty();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node10 = document8.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes11 = node10.attributes();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag1, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>", attributes11);
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str16 = tag15.getName();
        org.jsoup.parser.Tag tag17 = tag15.getImplicitParent();
        boolean boolean18 = tag15.isEmpty();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node24 = document22.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes25 = node24.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag15, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>", attributes25);
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag1, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", attributes25);
        java.lang.String str28 = tag1.getName();
        boolean boolean29 = tag1.isData();
        boolean boolean30 = tag1.isBlock();
        org.jsoup.nodes.Document document33 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str34 = document33.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = document33.childNodes();
        boolean boolean37 = document33.hasAttr("#root");
        org.jsoup.parser.Tag tag38 = document33.tag();
        java.lang.String str39 = tag38.toString();
        org.jsoup.nodes.Document document43 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str44 = document43.tagName();
        document43.setBaseUri("");
        org.jsoup.nodes.Element element48 = document43.addClass("");
        org.jsoup.nodes.Element element50 = document43.toggleClass("");
        element50.setBaseUri("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes53 = element50.attributes();
        org.jsoup.nodes.Element element54 = new org.jsoup.nodes.Element(tag38, "hi! #document", attributes53);
        boolean boolean55 = tag38.isInline();
        boolean boolean56 = tag1.canContain(tag38);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#root" + "'", str28, "#root");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#root" + "'", str34, "#root");
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "#root" + "'", str39, "#root");
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "#root" + "'", str44, "#root");
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(attributes53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
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
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str25 = document24.tagName();
        document24.setBaseUri("");
        document24.setBaseUri("");
        java.lang.String str31 = document24.attr("#root");
        org.jsoup.nodes.Element element32 = element17.prependChild((org.jsoup.nodes.Node) document24);
        org.jsoup.nodes.Document document35 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str36 = document35.tagName();
        document35.setBaseUri("");
        org.jsoup.select.Elements elements40 = document35.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.select.Elements elements42 = document35.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.select.Elements elements43 = document35.children();
        org.jsoup.nodes.Element element44 = document24.appendChild((org.jsoup.nodes.Node) document35);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#root" + "'", str25, "#root");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#root" + "'", str36, "#root");
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(element44);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("\n<<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! #document>\n</<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! #document>", "\n<#document class=\" #root\">\n</#document>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
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
        org.jsoup.nodes.Element element43 = element29.html("");
        org.jsoup.nodes.Node node45 = element43.removeAttr("#root");
        org.jsoup.nodes.Element element47 = element43.val("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#document" + "'", str30, "#document");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(element47);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root");
        java.lang.String str3 = document2.id();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
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
        org.jsoup.parser.Tag tag23 = element20.tag();
        org.jsoup.nodes.Element element25 = element20.html("\n<<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! #document>\n</<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! #document>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("\n<html>\n &lt;html value=&quot;hi! &quot;&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</html>", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html><#root>\n#root\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>#root<#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html><#root>\n  <html>\n   <head>\n   </head>\n   <body>\n    hi! \n   </body>\n  </html>#root\n </#root>\n</#root>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", " hi! <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.parser.Tag tag3 = document2.tag();
        boolean boolean4 = tag3.isInline();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
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
        java.util.Set<java.lang.String> strSet17 = element9.classNames();
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements22 = document20.getElementsByIndexLessThan((int) (byte) 100);
        org.jsoup.nodes.Element element24 = document20.appendText("hi!");
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str28 = document27.tagName();
        document27.setBaseUri("");
        document27.setBaseUri("");
        java.lang.String str34 = document27.attr("#root");
        org.jsoup.nodes.Element element35 = element24.appendChild((org.jsoup.nodes.Node) document27);
        org.jsoup.nodes.Element element37 = element35.removeClass("body");
        org.jsoup.nodes.Document document40 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node42 = document40.removeAttr("hi!");
        org.jsoup.nodes.Element element44 = document40.addClass("");
        org.jsoup.select.Elements elements46 = document40.getElementsByTag("#root");
        document40.setBaseUri("body");
        org.jsoup.nodes.Element element49 = element35.appendChild((org.jsoup.nodes.Node) document40);
        org.jsoup.nodes.Element element51 = element35.html("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        java.util.Set<java.lang.String> strSet52 = element51.classNames();
        org.jsoup.nodes.Element element53 = element9.classNames(strSet52);
        java.lang.String str54 = element53.toString();
        org.jsoup.nodes.Element element57 = element53.attr("hi! <html> <head> </head> <body> hi! </body> </html>hi! hi! hi! <html> <head> </head> <body> &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; <html> <head> </head> <body> hi! #document </body> </html> </body> </html>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#root" + "'", str28, "#root");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(element57);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        org.jsoup.parser.Tag tag12 = document2.tag();
        org.jsoup.nodes.Element element14 = document2.addClass("");
        org.jsoup.nodes.Element element16 = document2.prependElement("hi! ");
        boolean boolean18 = element16.hasAttr("\n<hi!>\n</hi!>");
        org.jsoup.select.Elements elements19 = element16.children();
        org.jsoup.select.Elements elements22 = element16.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n #roothi!\n</body>\n</html>", "\n<&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>\n</&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element4 = document2.removeClass("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexGreaterThan((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element4.getElementsByAttributeValueEnding("", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>body");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi! hi!hi!", "<hi! #document>\n</hi! #document>");
        org.jsoup.nodes.Element element4 = document2.toggleClass("<html> \n<head> \n</head> \n<body>\n  hi!  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element9 = document2.appendText("hi! ");
        org.jsoup.nodes.Element element11 = element9.removeClass("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.select.Elements elements13 = element9.select("body");
        org.jsoup.nodes.Element element15 = element9.prependText("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        boolean boolean16 = element15.hasText();
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str20 = document19.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = document19.childNodes();
        boolean boolean23 = document19.hasAttr("#root");
        org.jsoup.parser.Tag tag24 = document19.tag();
        java.lang.String str25 = document19.data();
        org.jsoup.select.Elements elements27 = document19.getElementsByIndexLessThan((int) (byte) 1);
        org.jsoup.select.Elements elements29 = document19.getElementsByClass("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>body");
        org.jsoup.nodes.Element element30 = element15.prependChild((org.jsoup.nodes.Node) document19);
        java.lang.String str31 = document19.baseUri();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
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
        org.jsoup.nodes.Element element33 = element31.removeClass("hi! ");
        org.jsoup.nodes.Element element36 = element33.attr("#document", "");
        java.lang.String str37 = element33.id();
        org.jsoup.select.Elements elements39 = element33.getElementsByAttribute("<html> <head> </head> <body> hi! </body> </html>#root<#root> <html> <head> </head> <body> hi! </body> </html> </#root>");
        java.util.Set<java.lang.String> strSet40 = element33.classNames();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(strSet40);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", " #root");
        org.jsoup.nodes.Element element4 = document2.getElementById("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.jsoup.nodes.Element element6 = document2.prependText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! #document");
        java.lang.String str7 = element6.id();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        org.jsoup.select.Elements elements15 = document10.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.nodes.Element element17 = document10.text("");
        org.jsoup.nodes.Element element19 = element17.prepend("");
        java.lang.String str21 = element19.attr("hi!");
        org.jsoup.select.Elements elements23 = element19.getElementsByIndexLessThan((int) '4');
        org.jsoup.nodes.Element element24 = element6.appendChild((org.jsoup.nodes.Node) element19);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
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
        org.jsoup.nodes.Element element22 = element20.prepend("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.jsoup.select.Elements elements25 = element22.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        boolean boolean26 = element22.isBlock();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
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
        java.lang.Object obj46 = null;
        boolean boolean47 = tag7.equals(obj46);
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element(tag7, "html");
        org.jsoup.nodes.Element element51 = element49.appendElement("body#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>\n</#root>");
        org.jsoup.select.Elements elements54 = element51.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n <hi> \n </hi> \n <html> \n  <head> \n  </head> \n  <body>\n    hi!  \n  </body>\n </html>\n</body>\n</html>", " <html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#root" + "'", str33, "#root");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#root" + "'", str34, "#root");
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#root" + "'", str38, "#root");
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(elements54);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        java.lang.String str17 = element16.nodeName();
        org.jsoup.nodes.Element element19 = element16.append("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element21 = element16.removeClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n</#root>");
        org.jsoup.nodes.Element element23 = element21.prependText("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    body  #root\n  </body>\n </html>\n</body>\n</html>");
        boolean boolean24 = element23.isBlock();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
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
        java.lang.String[] strArray36 = new java.lang.String[] { "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi! ", "#root", "body" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        org.jsoup.nodes.Element element39 = element31.classNames((java.util.Set<java.lang.String>) strSet37);
        java.util.List<org.jsoup.nodes.Node> nodeList40 = element31.siblingNodes();
        org.jsoup.nodes.Element element41 = element31.empty();
        java.lang.String str42 = element31.text();
        org.jsoup.select.Elements elements44 = element31.getElementsByClass("<html> <head> </head> <body> </body> </html> hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi! ", "#root", "body" });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(elements44);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValue("hi! ", "#root");
        org.jsoup.nodes.Element element16 = element9.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element19 = element9.attr("hi! #document", "#root");
        java.lang.String str20 = element19.tagName();
        org.jsoup.nodes.Element element22 = element19.text("#root hi! #root hi! hi! #root");
        org.jsoup.nodes.Attributes attributes23 = element22.attributes();
        org.jsoup.nodes.Element element25 = element22.appendElement("\n<html value=\"hi! \">\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements27 = element22.getElementsByIndexLessThan((int) (short) 0);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
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
        java.lang.String str19 = tag17.toString();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag17, "hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element24 = element21.attr("hi! #document", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        java.util.Set<java.lang.String> strSet25 = element24.classNames();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(strSet25);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element4 = document2.appendText("#root");
        org.jsoup.nodes.Element element6 = document2.prepend("#root");
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
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
        boolean boolean21 = tag17.isData();
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str25 = document24.tagName();
        document24.setBaseUri("");
        org.jsoup.nodes.Element element29 = document24.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element31 = document24.appendText("hi! ");
        java.lang.String str32 = element31.html();
        org.jsoup.nodes.Document document35 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node37 = document35.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = document35.childNodes();
        org.jsoup.nodes.Attributes attributes39 = document35.attributes();
        java.lang.String str41 = document35.attr("#root");
        org.jsoup.select.Elements elements44 = document35.getElementsByAttributeValueEnding("#root", "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.nodes.Element element45 = element31.appendChild((org.jsoup.nodes.Node) document35);
        boolean boolean46 = tag17.equals((java.lang.Object) element45);
        boolean boolean47 = tag17.isEmpty();
        boolean boolean48 = tag17.preserveWhitespace();
        org.jsoup.nodes.Document document52 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str53 = document52.tagName();
        document52.setBaseUri("");
        document52.setBaseUri("");
        org.jsoup.nodes.Document document60 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str61 = document60.tagName();
        document60.setBaseUri("");
        document60.setBaseUri("");
        org.jsoup.nodes.Element element66 = document52.appendChild((org.jsoup.nodes.Node) document60);
        org.jsoup.nodes.Element element67 = document52.empty();
        org.jsoup.nodes.Node node69 = document52.removeAttr("#root");
        org.jsoup.nodes.Element element71 = document52.addClass("hi!");
        org.jsoup.nodes.Document document74 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node76 = document74.removeAttr("hi!");
        org.jsoup.nodes.Element element78 = document74.addClass("");
        org.jsoup.nodes.Element element79 = document52.prependChild((org.jsoup.nodes.Node) element78);
        java.lang.String str80 = element79.nodeName();
        org.jsoup.select.Elements elements82 = element79.select("body");
        org.jsoup.nodes.Element element84 = element79.child(0);
        boolean boolean86 = element84.hasAttr("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements88 = element84.getElementsByTag("<html>\n<head>\n</head>\n<body>\n body\n</body>\n</html>#root");
        java.lang.String str89 = element84.outerHtml();
        java.lang.String str90 = element84.outerHtml();
        org.jsoup.nodes.Element element93 = element84.attr("hi! hi!", "#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>\n</#root>");
        org.jsoup.nodes.Attributes attributes94 = element93.attributes();
        org.jsoup.nodes.Element element95 = new org.jsoup.nodes.Element(tag17, "", attributes94);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#root" + "'", str25, "#root");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!" + "'", str32, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "#root" + "'", str53, "#root");
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "#root" + "'", str61, "#root");
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(element71);
        org.junit.Assert.assertNotNull(document74);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(element78);
        org.junit.Assert.assertNotNull(element79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "#document" + "'", str80, "#document");
        org.junit.Assert.assertNotNull(elements82);
        org.junit.Assert.assertNotNull(element84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(elements88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>" + "'", str89, "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>" + "'", str90, "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.junit.Assert.assertNotNull(element93);
        org.junit.Assert.assertNotNull(attributes94);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("<html>\n<head>\n</head>\n<body> \n</body>\n</html><#root value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\" hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        boolean boolean2 = tag1.isData();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str2 = tag1.getName();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        boolean boolean4 = tag1.isEmpty();
        java.lang.String str5 = tag1.toString();
        java.lang.String str6 = tag1.getName();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str10 = document9.tagName();
        document9.setBaseUri("");
        org.jsoup.nodes.Element element14 = document9.addClass("");
        org.jsoup.nodes.Element element16 = document9.toggleClass("");
        org.jsoup.nodes.Element element18 = document9.addClass("hi!");
        org.jsoup.parser.Tag tag19 = document9.tag();
        org.jsoup.nodes.Element element21 = document9.addClass("");
        org.jsoup.nodes.Element element23 = document9.prependElement("hi!");
        org.jsoup.parser.Tag tag24 = document9.tag();
        java.lang.String str25 = tag24.getName();
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str29 = document28.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = document28.childNodes();
        boolean boolean32 = document28.hasAttr("#root");
        org.jsoup.parser.Tag tag33 = document28.tag();
        java.lang.String str34 = tag33.toString();
        boolean boolean35 = tag24.canContain(tag33);
        boolean boolean36 = tag1.canContain(tag24);
        boolean boolean37 = tag24.isInline();
        org.jsoup.nodes.Document document40 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str41 = document40.tagName();
        document40.setBaseUri("");
        org.jsoup.nodes.Element element45 = document40.addClass("");
        org.jsoup.select.Elements elements46 = element45.parents();
        org.jsoup.nodes.Element element48 = element45.toggleClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        boolean boolean49 = tag24.equals((java.lang.Object) element48);
        boolean boolean50 = tag24.isBlock();
        org.jsoup.nodes.Element element52 = new org.jsoup.nodes.Element(tag24, "hi! <#root class=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n hi! \n&lt;/body&gt;\n&lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; hi! &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;hi!\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>\n</#root><<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document>\n</<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#root" + "'", str25, "#root");
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#root" + "'", str29, "#root");
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#root" + "'", str34, "#root");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#root" + "'", str41, "#root");
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
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
        java.lang.String str55 = element50.text();
        java.lang.String str56 = element50.className();
        boolean boolean58 = element50.hasClass("<#root>\n<html>\n <head>\n </head>\n <body>\n  body \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "body", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#root" + "'", str32, "#root");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "#document" + "'", str51, "#document");
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi! #document" + "'", str55, "hi! #document");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + " hi!" + "'", str56, " hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
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
        org.jsoup.nodes.Element element47 = element45.toggleClass("hi! ");
        org.jsoup.nodes.Element element49 = element47.prepend("<html>\n<head>\n</head>\n<body>\n &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   #document \n  </body>\n </html>\n</body>\n</html>");
        java.lang.String str50 = element47.className();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#root" + "'", str33, "#root");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#root" + "'", str34, "#root");
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#root" + "'", str38, "#root");
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + " hi! " + "'", str50, " hi! ");
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
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
        org.jsoup.nodes.Element element22 = element20.prepend("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        java.lang.String str23 = element22.text();
        org.jsoup.nodes.Element element25 = element22.toggleClass("hi! <html> <head> </head> <body> hi! </body> </html>hi! hi! hi! <html> <head> </head> <body> &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; <html> <head> </head> <body> hi! #document </body> </html> </body> </html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! <#root> hi!" + "'", str23, "hi! <#root> hi!");
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
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
        org.jsoup.nodes.Element element59 = element57.appendElement("body#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root");
        java.lang.String str60 = element59.id();
        org.jsoup.nodes.Document document63 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element65 = document63.appendText("#root");
        org.jsoup.nodes.Element element67 = document63.prepend("#root");
        org.jsoup.nodes.Element element69 = element67.prependText("body");
        org.jsoup.parser.Tag tag70 = element69.tag();
        element69.setBaseUri(" hi! #document");
        org.jsoup.nodes.Element element74 = element69.appendElement("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Document document77 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str78 = document77.tagName();
        document77.setBaseUri("");
        org.jsoup.nodes.Element element82 = document77.addClass("");
        org.jsoup.nodes.Element element84 = document77.toggleClass("");
        org.jsoup.nodes.Element element86 = document77.addClass("hi!");
        org.jsoup.parser.Tag tag87 = document77.tag();
        org.jsoup.nodes.Element element89 = document77.addClass("");
        org.jsoup.nodes.Node node91 = document77.removeAttr("\n<hi!>\n</hi!>");
        org.jsoup.nodes.Element element92 = element74.prependChild(node91);
        org.jsoup.nodes.Element element93 = element74.parent();
        org.jsoup.nodes.Element element95 = element74.val("<html>\n<head>\n</head>\n<body>\n body\n</body>\n</html>#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element96 = element59.appendChild((org.jsoup.nodes.Node) element74);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "body", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#root" + "'", str32, "#root");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "#document" + "'", str51, "#document");
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>" + "'", str55, "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(document63);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertNotNull(element74);
        org.junit.Assert.assertNotNull(document77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "#root" + "'", str78, "#root");
        org.junit.Assert.assertNotNull(element82);
        org.junit.Assert.assertNotNull(element84);
        org.junit.Assert.assertNotNull(element86);
        org.junit.Assert.assertNotNull(tag87);
        org.junit.Assert.assertNotNull(element89);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertNotNull(element92);
        org.junit.Assert.assertNotNull(element93);
        org.junit.Assert.assertNotNull(element95);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        java.lang.String str9 = document2.attr("#root");
        java.lang.String str10 = document2.text();
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        java.lang.Integer int13 = element12.elementSiblingIndex();
        org.jsoup.select.Elements elements16 = element12.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n #root \n <html> \n  <head> \n  </head> \n  <body>\n    hi!  #root&lt;#root&gt; \n   <html> \n    <head> \n    </head> \n    <body>\n      hi!  &lt;#root&gt; \n     <html> \n      <head> \n      </head> \n      <body>\n        hi!  #root  \n      </body>\n     </html>\n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root><hi> \n</hi> \n<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str2 = tag1.getName();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        boolean boolean4 = tag1.isInline();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "<hi! #document>\n</hi! #document>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements4 = document2.getElementsByAttribute("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document");
        org.jsoup.nodes.Element element6 = document2.html("body#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document", "hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int3 = document2.elementSiblingIndex();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root><#document>\n</#document>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root><#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.jsoup.nodes.Element element7 = document2.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.select.Elements elements9 = document2.getElementsByTag("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n  <html> \n   <head> \n   </head> \n   <body>\n     hi!   #document \n   </body>\n  </html>\n </body>\n</html>\n</#root>\n<html> \n<head> \n</head> \n<body>  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
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
        org.jsoup.nodes.Element element33 = document10.prependElement("<html> \n<head> \n</head> \n<body>\n  &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi! #document    \n  </body>\n </html>\n</body>\n</html><<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element33);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        boolean boolean18 = document10.hasClass("#root");
        org.jsoup.select.Elements elements21 = document10.getElementsByAttributeValueNot("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi! ");
        java.lang.String str22 = document10.baseUri();
        org.jsoup.select.Elements elements24 = document10.getElementsByTag("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element26 = document10.getElementById("\n<hi!>\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = document10.siblingNodes();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNull(element26);
        org.junit.Assert.assertNotNull(nodeList27);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
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
        java.lang.String str23 = element22.data();
        org.jsoup.select.Elements elements24 = element22.children();
        java.lang.String str26 = element22.attr("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
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
        java.lang.String str32 = element20.data();
        org.jsoup.nodes.Node node34 = element20.childNode((int) (short) 0);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
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
        org.jsoup.nodes.Document document41 = org.jsoup.parser.Parser.parseBodyFragment("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        java.lang.String str42 = document41.baseUri();
        org.jsoup.nodes.Element element43 = element38.prependChild((org.jsoup.nodes.Node) document41);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element46 = element38.attr("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "body", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!" + "'", str42, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        org.junit.Assert.assertNotNull(element43);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
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
        org.jsoup.nodes.Element element40 = element38.appendText(" body hi!");
        org.jsoup.nodes.Element element42 = element38.prependElement("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>hi!");
        org.jsoup.select.Elements elements43 = element38.getAllElements();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "body", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements43);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean4 = document2.hasAttr("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        java.lang.Object obj5 = null;
        boolean boolean6 = document2.equals(obj5);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = document2.previousElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element10 = document2.toggleClass("hi!");
        org.jsoup.nodes.Element element12 = document2.val("<#root>\n</#root>");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexEquals((int) (byte) 1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        java.lang.String str12 = document2.outerHtml();
        org.jsoup.nodes.Element element14 = document2.child(0);
        org.jsoup.nodes.Element element16 = element14.text("");
        org.jsoup.nodes.Element element17 = element16.parent();
        java.lang.String str18 = element16.data();
        org.jsoup.nodes.Element element20 = element16.getElementById(" hi! <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element22 = element16.addClass("<html>\n<head>\n</head>\n<body>\n body\n</body>\n</html>#root");
        boolean boolean23 = element16.hasText();
        element16.remove();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>" + "'", str12, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf(" hi!");
        org.jsoup.parser.Tag tag2 = tag1.getImplicitParent();
        java.lang.String str3 = tag2.toString();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "body" + "'", str3, "body");
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str2 = tag1.getName();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        java.lang.String str4 = tag1.toString();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf(" hi! #document");
        java.lang.String str7 = tag6.getName();
        org.jsoup.parser.Tag tag8 = tag6.getImplicitParent();
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str12 = document11.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document11.childNodes();
        boolean boolean15 = document11.hasAttr("#root");
        org.jsoup.parser.Tag tag16 = document11.tag();
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str20 = document19.tagName();
        document19.setBaseUri("");
        document19.setBaseUri("");
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str28 = document27.tagName();
        document27.setBaseUri("");
        document27.setBaseUri("");
        org.jsoup.nodes.Element element34 = document27.appendText("#root");
        org.jsoup.nodes.Element element35 = document19.appendChild((org.jsoup.nodes.Node) document27);
        boolean boolean36 = tag16.equals((java.lang.Object) element35);
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
        boolean boolean56 = tag16.canContain(tag54);
        org.jsoup.parser.Tag tag58 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str59 = tag58.getName();
        boolean boolean60 = tag58.isData();
        java.lang.String str61 = tag58.toString();
        org.jsoup.nodes.Element element63 = new org.jsoup.nodes.Element(tag58, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str64 = tag58.toString();
        boolean boolean65 = tag58.preserveWhitespace();
        boolean boolean66 = tag16.isValidParent(tag58);
        boolean boolean67 = tag6.canContain(tag58);
        boolean boolean68 = tag1.isValidParent(tag6);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! #document" + "'", str7, "hi! #document");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#root" + "'", str28, "#root");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "#root" + "'", str40, "#root");
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(tag54);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "#root" + "'", str59, "#root");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "#root" + "'", str61, "#root");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "#root" + "'", str64, "#root");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        java.lang.String str8 = tag7.toString();
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str11 = tag10.getName();
        org.jsoup.parser.Tag tag12 = tag10.getImplicitParent();
        boolean boolean13 = tag10.isEmpty();
        java.lang.String str14 = tag10.toString();
        boolean boolean15 = tag7.isValidParent(tag10);
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str20 = document19.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = document19.childNodes();
        boolean boolean23 = document19.hasAttr("#root");
        org.jsoup.parser.Tag tag24 = document19.tag();
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str28 = document27.tagName();
        document27.setBaseUri("");
        document27.setBaseUri("");
        org.jsoup.nodes.Document document35 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str36 = document35.tagName();
        document35.setBaseUri("");
        document35.setBaseUri("");
        org.jsoup.nodes.Element element42 = document35.appendText("#root");
        org.jsoup.nodes.Element element43 = document27.appendChild((org.jsoup.nodes.Node) document35);
        boolean boolean44 = tag24.equals((java.lang.Object) element43);
        org.jsoup.parser.Tag tag46 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str47 = tag46.getName();
        org.jsoup.parser.Tag tag48 = tag46.getImplicitParent();
        boolean boolean49 = tag24.canContain(tag48);
        boolean boolean50 = tag48.isBlock();
        org.jsoup.nodes.Document document53 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str54 = document53.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList55 = document53.childNodes();
        boolean boolean57 = document53.hasAttr("#root");
        org.jsoup.parser.Tag tag58 = document53.tag();
        java.lang.String str59 = tag58.toString();
        org.jsoup.parser.Tag tag61 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str62 = tag61.getName();
        org.jsoup.parser.Tag tag63 = tag61.getImplicitParent();
        boolean boolean64 = tag61.isEmpty();
        java.lang.String str65 = tag61.toString();
        boolean boolean66 = tag58.isValidParent(tag61);
        boolean boolean67 = tag48.isValidParent(tag58);
        org.jsoup.nodes.Document document71 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str72 = document71.tagName();
        document71.setBaseUri("");
        org.jsoup.nodes.Element element76 = document71.addClass("");
        org.jsoup.nodes.Element element78 = document71.toggleClass("");
        org.jsoup.nodes.Element element80 = element78.html("");
        boolean boolean81 = element78.isBlock();
        org.jsoup.nodes.Attributes attributes82 = element78.attributes();
        org.jsoup.nodes.Element element83 = new org.jsoup.nodes.Element(tag48, "<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", attributes82);
        org.jsoup.nodes.Element element84 = new org.jsoup.nodes.Element(tag10, "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>", attributes82);
        org.jsoup.select.Elements elements86 = element84.getElementsByIndexGreaterThan((-1));
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#root" + "'", str28, "#root");
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#root" + "'", str36, "#root");
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "#root" + "'", str47, "#root");
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "#root" + "'", str54, "#root");
        org.junit.Assert.assertNotNull(nodeList55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "#root" + "'", str59, "#root");
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "#root" + "'", str62, "#root");
        org.junit.Assert.assertNotNull(tag63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "#root" + "'", str65, "#root");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(document71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "#root" + "'", str72, "#root");
        org.junit.Assert.assertNotNull(element76);
        org.junit.Assert.assertNotNull(element78);
        org.junit.Assert.assertNotNull(element80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(attributes82);
        org.junit.Assert.assertNotNull(elements86);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
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
        java.lang.String str16 = tag3.toString();
        boolean boolean17 = tag3.isInline();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "body" + "'", str13, "body");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "body" + "'", str16, "body");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals((int) (byte) 1);
        org.jsoup.select.Elements elements9 = document2.getElementsByIndexLessThan(10);
        org.jsoup.nodes.Element element11 = document2.appendElement("<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>", "#root");
        java.lang.String str15 = document14.html();
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document14);
        org.jsoup.nodes.Element element18 = document2.prepend("#document");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n<head>\n</head>\n<body>\n &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   #document \n  </body>\n </html>\n</body>\n</html>" + "'", str15, "<html>\n<head>\n</head>\n<body>\n &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   #document \n  </body>\n </html>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
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
        org.jsoup.nodes.Element element25 = element23.prependText("body");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str2 = tag1.getName();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node9 = document7.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document7.childNodes();
        org.jsoup.nodes.Attributes attributes11 = document7.attributes();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag3, "#root", attributes11);
        java.lang.String str13 = tag3.toString();
        boolean boolean14 = tag3.preserveWhitespace();
        boolean boolean15 = tag3.isBlock();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str19 = document18.tagName();
        document18.setBaseUri("");
        document18.setBaseUri("");
        org.jsoup.nodes.Element element25 = document18.appendText("#root");
        document18.setBaseUri("");
        org.jsoup.nodes.Element element28 = document18.empty();
        org.jsoup.nodes.Element element30 = document18.removeClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element32 = element30.toggleClass("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        boolean boolean33 = tag3.equals((java.lang.Object) element32);
        boolean boolean34 = tag3.isEmpty();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "body" + "'", str13, "body");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "hi! hi!hi!");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        boolean boolean12 = element9.isBlock();
        org.jsoup.select.Elements elements15 = element9.getElementsByAttributeValueEnding("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>", "#document");
        java.lang.String str16 = element9.tagName();
        org.jsoup.parser.Tag tag18 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str19 = tag18.getName();
        org.jsoup.parser.Tag tag20 = tag18.getImplicitParent();
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node26 = document24.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = document24.childNodes();
        org.jsoup.nodes.Attributes attributes28 = document24.attributes();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag20, "#root", attributes28);
        org.jsoup.select.Elements elements32 = element29.getElementsByAttributeValueStarting("#document", "hi! #document");
        java.lang.String str33 = element29.baseUri();
        org.jsoup.nodes.Element element34 = element9.appendChild((org.jsoup.nodes.Node) element29);
        org.jsoup.parser.Tag tag35 = element29.tag();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#root" + "'", str33, "#root");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(tag35);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi! hi!hi!", "<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n  <html> \n   <head> \n   </head> \n   <body>\n     hi!   #document \n   </body>\n  </html>\n </body>\n</html>\n</#root>\n<html> \n<head> \n</head> \n<body>  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        java.lang.Integer int5 = document2.elementSiblingIndex();
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexGreaterThan((int) (short) -1);
        document2.setBaseUri("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root><#document>\n</#document>");
        org.jsoup.nodes.Element element11 = document2.prependElement(" hi! <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = element11.empty();
        org.jsoup.nodes.Element element13 = element11.previousElementSibling();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str2 = tag1.getName();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node9 = document7.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document7.childNodes();
        org.jsoup.nodes.Attributes attributes11 = document7.attributes();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag3, "#root", attributes11);
        java.lang.String str13 = tag3.toString();
        boolean boolean14 = tag3.preserveWhitespace();
        org.jsoup.parser.Tag tag15 = tag3.getImplicitParent();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "body" + "'", str13, "body");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tag15);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
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
        org.jsoup.nodes.Element element21 = element18.firstElementSibling();
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str25 = document24.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = document24.childNodes();
        boolean boolean28 = document24.hasAttr("#root");
        document24.setBaseUri("");
        org.jsoup.nodes.Element element32 = document24.child((int) (short) 0);
        org.jsoup.nodes.Element element35 = element32.attr("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>", "&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        org.jsoup.nodes.Node node36 = element35.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            element21.replaceWith(node36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#root" + "'", str25, "#root");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNull(node36);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
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
        org.jsoup.nodes.Node node20 = document10.nextSibling();
        java.lang.String str21 = document10.val();
        org.jsoup.select.Elements elements24 = document10.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n hi! hi!\n</body>\n</html>", " hi! <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements26 = document10.getElementsByClass(" hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
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
        org.jsoup.nodes.Document document25 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str26 = document25.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = document25.childNodes();
        boolean boolean29 = document25.hasAttr("#root");
        org.jsoup.parser.Tag tag30 = document25.tag();
        java.lang.String str32 = document25.attr("#root");
        org.jsoup.nodes.Element element34 = document25.text("");
        java.lang.String str35 = document25.nodeName();
        org.jsoup.select.Elements elements37 = document25.getElementsByIndexEquals((int) (short) 0);
        org.jsoup.nodes.Element element39 = document25.getElementById("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element41 = document25.toggleClass("body");
        boolean boolean42 = element22.equals((java.lang.Object) "body");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#root" + "'", str26, "#root");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#document" + "'", str35, "#document");
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
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
        org.jsoup.nodes.Element element32 = element30.child(1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! " + "'", str25, "hi! ");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str11 = document10.tagName();
        document10.setBaseUri("");
        document10.setBaseUri("");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document10);
        boolean boolean18 = document10.hasClass("#root");
        org.jsoup.select.Elements elements21 = document10.getElementsByAttributeValueNot("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi! ");
        java.lang.String str22 = document10.baseUri();
        org.jsoup.select.Elements elements24 = document10.getElementsByTag("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str25 = document10.className();
        org.jsoup.nodes.Element element27 = document10.text("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str31 = document30.tagName();
        document30.setBaseUri("");
        org.jsoup.nodes.Element element35 = document30.addClass("");
        org.jsoup.nodes.Element element37 = document30.toggleClass("");
        org.jsoup.nodes.Element element40 = element37.attr("hi! #document", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element42 = element37.appendText("hi! hi!");
        org.jsoup.nodes.Element element44 = element37.addClass("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        java.util.Set<java.lang.String> strSet45 = element37.classNames();
        org.jsoup.nodes.Element element46 = element27.classNames(strSet45);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#root" + "'", str31, "#root");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNotNull(element46);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
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
        org.jsoup.nodes.Element element32 = element26.lastElementSibling();
        org.jsoup.nodes.Element element33 = element26.firstElementSibling();
        org.jsoup.nodes.Node node34 = element33.previousSibling();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNull(node34);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = element23.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.nodes.Element element9 = document2.text("");
        org.jsoup.nodes.Element element11 = element9.prepend("");
        org.jsoup.select.Elements elements13 = element9.getElementsByIndexGreaterThan((int) (byte) 10);
        org.jsoup.nodes.Element element15 = element9.appendText("hi! #document");
        java.lang.Integer int16 = element9.elementSiblingIndex();
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str20 = document19.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = document19.childNodes();
        boolean boolean23 = document19.hasAttr("#root");
        org.jsoup.parser.Tag tag24 = document19.tag();
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str28 = document27.tagName();
        document27.setBaseUri("");
        document27.setBaseUri("");
        org.jsoup.nodes.Document document35 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str36 = document35.tagName();
        document35.setBaseUri("");
        document35.setBaseUri("");
        org.jsoup.nodes.Element element42 = document35.appendText("#root");
        org.jsoup.nodes.Element element43 = document27.appendChild((org.jsoup.nodes.Node) document35);
        boolean boolean44 = tag24.equals((java.lang.Object) element43);
        org.jsoup.parser.Tag tag46 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str47 = tag46.getName();
        org.jsoup.parser.Tag tag48 = tag46.getImplicitParent();
        boolean boolean49 = tag24.canContain(tag48);
        java.lang.String str50 = tag24.toString();
        boolean boolean51 = tag24.isEmpty();
        boolean boolean52 = tag24.canContainBlock();
        boolean boolean53 = element9.equals((java.lang.Object) tag24);
        org.jsoup.nodes.Document document56 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str57 = document56.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList58 = document56.childNodes();
        boolean boolean60 = document56.hasAttr("#root");
        document56.setBaseUri("");
        org.jsoup.nodes.Element element64 = document56.child((int) (short) 0);
        org.jsoup.nodes.Element element67 = element64.attr("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>", "&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        boolean boolean69 = element67.hasAttr("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str70 = element67.val();
        org.jsoup.parser.Tag tag71 = element67.tag();
        boolean boolean72 = tag24.isValidParent(tag71);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#root" + "'", str28, "#root");
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#root" + "'", str36, "#root");
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "#root" + "'", str47, "#root");
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "#root" + "'", str50, "#root");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(document56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "#root" + "'", str57, "#root");
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(tag71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
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
        org.jsoup.nodes.Element element46 = element44.appendElement("<#document>\n</#document>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        java.lang.String str47 = element44.className();
        org.jsoup.select.Elements elements50 = element44.getElementsByAttributeValueStarting(" body hi!", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        java.lang.Class<?> wildcardClass51 = elements50.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#root" + "'", str23, "#root");
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#root" + "'", str31, "#root");
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "#document" + "'", str40, "#document");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
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
        org.jsoup.select.Elements elements46 = element44.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Element element48 = element44.wrap("hi! hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements51 = element48.getElementsByAttributeValue(" <html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<html> \n<head> \n</head> \n<body>\n  hi!  hi!&lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   \n  </body>\n </html>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#root" + "'", str35, "#root");
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNull(element48);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.nodes.Element element9 = document2.text("");
        org.jsoup.nodes.Element element11 = document2.appendElement(" hi! <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements13 = element11.getElementsByIndexEquals(4);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("\n<body>\n</body>", "body");
        org.jsoup.nodes.Element element4 = document2.appendElement("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.nodes.Element element5 = document2.empty();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        document2.setBaseUri("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        java.lang.String str12 = document2.nodeName();
        org.jsoup.nodes.Element element14 = document2.text("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str15 = element14.id();
        org.jsoup.nodes.Element element17 = element14.appendElement("\n<html>\n &lt;html value=&quot;hi! &quot;&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
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
        java.lang.String str34 = element31.outerHtml();
        org.jsoup.nodes.Element element36 = element31.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>\n</#root>" + "'", str34, "hi!#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>\n</#root>");
        org.junit.Assert.assertNotNull(element36);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.html("hi! ");
        org.jsoup.select.Elements elements12 = element10.getElementsByAttribute("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.parser.Tag tag13 = element10.tag();
        boolean boolean14 = tag13.isData();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag13, "<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
        boolean boolean17 = tag13.isData();
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str21 = document20.tagName();
        document20.setBaseUri("");
        org.jsoup.nodes.Element element25 = document20.addClass("");
        org.jsoup.nodes.Element element27 = document20.toggleClass("");
        org.jsoup.nodes.Element element29 = document20.addClass("hi!");
        org.jsoup.parser.Tag tag30 = document20.tag();
        org.jsoup.nodes.Element element32 = document20.addClass("");
        org.jsoup.nodes.Element element34 = document20.prependElement("hi!");
        org.jsoup.parser.Tag tag35 = document20.tag();
        java.lang.String str36 = tag35.getName();
        org.jsoup.parser.Tag tag37 = tag35.getImplicitParent();
        java.lang.String str38 = tag35.toString();
        java.lang.String str39 = tag35.getName();
        java.lang.String str40 = tag35.getName();
        boolean boolean41 = tag35.isEmpty();
        boolean boolean42 = tag35.isEmpty();
        boolean boolean43 = tag35.isData();
        boolean boolean44 = tag13.isValidParent(tag35);
        boolean boolean45 = tag35.isBlock();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#root" + "'", str21, "#root");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#root" + "'", str36, "#root");
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#root" + "'", str38, "#root");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "#root" + "'", str39, "#root");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "#root" + "'", str40, "#root");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
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
        document22.setBaseUri("");
        document22.setBaseUri("");
        org.jsoup.nodes.Element element29 = document22.appendText("#root");
        document22.setBaseUri("");
        org.jsoup.nodes.Element element32 = document22.empty();
        org.jsoup.nodes.Element element33 = element32.empty();
        boolean boolean34 = tag18.equals((java.lang.Object) element32);
        java.lang.String str35 = tag18.toString();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#root" + "'", str23, "#root");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "body" + "'", str35, "body");
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        java.lang.String str12 = element11.html();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.Integer int3 = document2.elementSiblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        java.lang.String str5 = document2.val();
        org.jsoup.nodes.Element element7 = document2.addClass("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#roothi!<&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>\n</&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
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
        java.lang.String str33 = element31.val();
        org.jsoup.select.Elements elements36 = element31.getElementsByAttributeValueEnding("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi! #document\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>#root");
        java.lang.Integer int37 = element31.siblingIndex();
        org.jsoup.parser.Tag tag38 = element31.tag();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(tag38);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
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
        org.jsoup.nodes.Element element33 = element29.attr("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root><#document>\n</#document>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(element33);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.appendText("hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int12 = document2.elementSiblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes();
        org.jsoup.nodes.Element element15 = document2.prependElement(" <html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        java.lang.String str9 = document2.attr("#root");
        java.lang.String str10 = document2.text();
        java.lang.String str11 = document2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = document2.childNodes();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>" + "'", str11, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
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
        org.jsoup.nodes.Element element56 = element51.previousElementSibling();
        java.lang.Integer int57 = element51.elementSiblingIndex();
        boolean boolean59 = element51.hasAttr("body");
        org.jsoup.select.Elements elements61 = element51.getElementsByIndexLessThan((int) '#');
        org.jsoup.select.Elements elements64 = element51.getElementsByAttributeValueContaining("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi! hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList65 = element51.siblingNodes();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#document" + "'", str30, "#document");
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#root" + "'", str34, "#root");
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#root" + "'", str42, "#root");
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNull(element56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertNotNull(elements64);
        org.junit.Assert.assertNotNull(nodeList65);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
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
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str22 = document21.tagName();
        document21.setBaseUri("");
        org.jsoup.nodes.Element element26 = document21.addClass("");
        org.jsoup.nodes.Element element28 = document21.toggleClass("");
        org.jsoup.nodes.Element element31 = element28.attr("hi! #document", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String[] strArray34 = new java.lang.String[] { "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        org.jsoup.nodes.Element element37 = element31.classNames((java.util.Set<java.lang.String>) strSet35);
        org.jsoup.nodes.Element element38 = document2.classNames((java.util.Set<java.lang.String>) strSet35);
        org.jsoup.select.Elements elements40 = document2.getElementsByIndexEquals((int) (byte) 100);
        java.lang.String str41 = document2.toString();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>" + "'", str41, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = element9.html("");
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValue("hi! ", "#root");
        org.jsoup.nodes.Element element16 = element9.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element17 = element9.empty();
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str21 = document20.tagName();
        document20.setBaseUri("");
        document20.setBaseUri("");
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str29 = document28.tagName();
        document28.setBaseUri("");
        document28.setBaseUri("");
        org.jsoup.nodes.Element element34 = document20.appendChild((org.jsoup.nodes.Node) document28);
        org.jsoup.nodes.Element element35 = document20.empty();
        org.jsoup.nodes.Node node37 = document20.removeAttr("#root");
        org.jsoup.nodes.Element element39 = document20.addClass("hi!");
        org.jsoup.nodes.Document document42 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node44 = document42.removeAttr("hi!");
        org.jsoup.nodes.Element element46 = document42.addClass("");
        org.jsoup.nodes.Element element47 = document20.prependChild((org.jsoup.nodes.Node) element46);
        org.jsoup.nodes.Element element49 = element46.prependElement("#document");
        element49.remove();
        org.jsoup.nodes.Element element51 = element9.appendChild((org.jsoup.nodes.Node) element49);
        java.lang.String str52 = element49.html();
        org.jsoup.select.Elements elements55 = element49.getElementsByAttributeValue("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>", "html");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#root" + "'", str21, "#root");
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#root" + "'", str29, "#root");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(elements55);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
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
        java.lang.Object obj37 = null;
        boolean boolean38 = tag7.equals(obj37);
        boolean boolean39 = tag7.isEmpty();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#root" + "'", str33, "#root");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        java.lang.String str7 = document2.id();
        org.jsoup.select.Elements elements10 = document2.getElementsByAttributeValueContaining("hi! <html> <head> </head> <body> hi! </body> </html>hi! hi! hi! <html> <head> </head> <body> &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; <html> <head> </head> <body> hi! #document </body> </html> </body> </html>", "\n<body class=\" body hi!\">\n</body>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
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
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element21 = element17.html("hi! hi!hi!");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "body" + "'", str13, "body");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "body" + "'", str14, "body");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.html("hi! ");
        org.jsoup.nodes.Element element12 = element10.addClass("#root");
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node17 = document15.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = document15.childNodes();
        org.jsoup.nodes.Attributes attributes19 = document15.attributes();
        org.jsoup.select.Elements elements21 = document15.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element23 = document15.prepend("body");
        org.jsoup.nodes.Element element25 = document15.addClass("#document");
        org.jsoup.nodes.Element element27 = element25.removeClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        boolean boolean28 = element27.isBlock();
        org.jsoup.nodes.Element element29 = element12.prependChild((org.jsoup.nodes.Node) element27);
        org.jsoup.nodes.Node node31 = element27.removeAttr("body");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
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
        org.jsoup.parser.Tag tag18 = element16.tag();
        java.lang.Object obj19 = null;
        boolean boolean20 = tag18.equals(obj19);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "body" + "'", str13, "body");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "body" + "'", str14, "body");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<body>\n</body>" + "'", str17, "\n<body>\n</body>");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
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
        org.jsoup.nodes.Element element33 = element31.removeClass("hi! ");
        org.jsoup.select.Elements elements35 = element33.getElementsByIndexLessThan(0);
        boolean boolean37 = element33.hasClass("<html> <head> </head> <body> body </body> </html>");
        org.jsoup.nodes.Element element39 = element33.getElementById("\n<&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>\n</&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(element39);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
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
        org.jsoup.select.Elements elements20 = element12.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.nodes.Element element22 = element12.prepend("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi! <#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>hi!");
        org.jsoup.nodes.Element element24 = element12.appendText("hi! #root hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
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
        java.lang.String str51 = document28.id();
        org.jsoup.nodes.Element element53 = document28.prependText("<#root class=\"\">\n</#root>");
        boolean boolean55 = document28.hasClass(" hi! hi!hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!" + "'", str10, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#root" + "'", str29, "#root");
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>" + "'", str48, "<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
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
        org.jsoup.nodes.Element element74 = new org.jsoup.nodes.Element(tag7, "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>body");
        org.jsoup.nodes.Element element76 = element74.removeClass("hi! #document<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.jsoup.select.Elements elements77 = element74.parents();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#root" + "'", str36, "#root");
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#root" + "'", str42, "#root");
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "#root" + "'", str46, "#root");
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "#root" + "'", str54, "#root");
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "#root" + "'", str62, "#root");
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(element76);
        org.junit.Assert.assertNotNull(elements77);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", " <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element4 = document2.prepend("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! #document");
        org.jsoup.select.Elements elements6 = document2.getElementsByTag("hi! hi! #root\n<html>\n<head>\n</head>\n<body>\n hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
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
        java.lang.String str38 = element31.baseUri();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNull(element36);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
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
        org.jsoup.select.Elements elements55 = element54.getAllElements();
        java.lang.String str56 = element54.className();
        org.jsoup.nodes.Element element58 = element54.prependElement("hi! ");
        org.jsoup.parser.Tag tag59 = element58.tag();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#root" + "'", str26, "#root");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#root" + "'", str37, "#root");
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!" });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + " #root" + "'", str56, " #root");
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(tag59);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.html("hi! ");
        org.jsoup.nodes.Element element12 = document2.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = element12.getElementById("\n<&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>\n</&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document");
        org.jsoup.nodes.Element element4 = document2.addClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.nodes.Element element6 = element4.prependElement("body\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element8 = element4.appendText("hi! #document\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element8.select("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    body  #root\n  </body>\n </html>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html>?<head>?</head>?<body>? <html> ?  <head> ?  </head> ?  <body>?    body  #root?  </body>? </html>?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
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
        org.jsoup.nodes.Element element26 = element14.val("\n<#document class=\"\">\n</#document>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("hi!");
        org.jsoup.nodes.Element element6 = document2.addClass("");
        org.jsoup.select.Elements elements8 = document2.getElementsByTag("#root");
        java.lang.String str9 = document2.tagName();
        org.jsoup.nodes.Element element11 = document2.toggleClass("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.jsoup.nodes.Element element13 = document2.addClass("<html>\n<head>\n</head>\n<body>\n body\n</body>\n</html>#root");
        java.util.Set<java.lang.String> strSet14 = element13.classNames();
        boolean boolean15 = element13.isBlock();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
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
        java.lang.String[] strArray36 = new java.lang.String[] { "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi! ", "#root", "body" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        org.jsoup.nodes.Element element39 = element31.classNames((java.util.Set<java.lang.String>) strSet37);
        element31.setBaseUri("hi! #document");
        java.util.List<org.jsoup.nodes.Node> nodeList42 = element31.childNodes();
        org.jsoup.nodes.Element element44 = element31.prepend("#root hi! #root hi! hi! #root");
        org.jsoup.select.Elements elements46 = element44.getElementsByIndexEquals((int) ' ');
        java.lang.Integer int47 = element44.siblingIndex();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi! ", "#root", "body" });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        org.jsoup.parser.Tag tag2 = tag1.getImplicitParent();
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str6 = document5.tagName();
        document5.setBaseUri("");
        org.jsoup.nodes.Element element10 = document5.addClass("");
        org.jsoup.nodes.Element element12 = document5.toggleClass("");
        org.jsoup.nodes.Element element14 = document5.addClass("hi!");
        org.jsoup.parser.Tag tag15 = document5.tag();
        org.jsoup.nodes.Element element17 = document5.addClass("");
        org.jsoup.nodes.Element element19 = document5.prependElement("hi!");
        org.jsoup.parser.Tag tag20 = document5.tag();
        org.jsoup.parser.Tag tag21 = tag20.getImplicitParent();
        org.jsoup.parser.Tag tag22 = tag21.getImplicitParent();
        org.jsoup.nodes.Document document25 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str26 = document25.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = document25.childNodes();
        boolean boolean29 = document25.hasAttr("#root");
        org.jsoup.parser.Tag tag30 = document25.tag();
        org.jsoup.nodes.Document document33 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str34 = document33.tagName();
        document33.setBaseUri("");
        document33.setBaseUri("");
        org.jsoup.nodes.Document document41 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str42 = document41.tagName();
        document41.setBaseUri("");
        document41.setBaseUri("");
        org.jsoup.nodes.Element element48 = document41.appendText("#root");
        org.jsoup.nodes.Element element49 = document33.appendChild((org.jsoup.nodes.Node) document41);
        boolean boolean50 = tag30.equals((java.lang.Object) element49);
        org.jsoup.parser.Tag tag52 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str53 = tag52.getName();
        org.jsoup.parser.Tag tag54 = tag52.getImplicitParent();
        boolean boolean55 = tag30.canContain(tag54);
        org.jsoup.nodes.Document document58 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str59 = document58.tagName();
        document58.setBaseUri("");
        org.jsoup.nodes.Element element63 = document58.addClass("");
        boolean boolean64 = tag30.equals((java.lang.Object) "");
        boolean boolean65 = tag30.canContainBlock();
        boolean boolean66 = tag22.isValidParent(tag30);
        boolean boolean67 = tag1.isValidParent(tag22);
        boolean boolean68 = tag1.canContainBlock();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#root" + "'", str26, "#root");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#root" + "'", str34, "#root");
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#root" + "'", str42, "#root");
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "#root" + "'", str53, "#root");
        org.junit.Assert.assertNotNull(tag54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "#root" + "'", str59, "#root");
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
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
        org.jsoup.nodes.Element element20 = element18.append("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi> \n</hi> \n<html> \n <head> \n </head> \n <body>\n   hi!  hi!\n </body>\n</html>");
        org.jsoup.select.Elements elements21 = element20.getAllElements();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str2 = tag1.getName();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        boolean boolean4 = tag1.isEmpty();
        java.lang.String str5 = tag1.toString();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("", "hi!");
        org.jsoup.nodes.Element element11 = document9.prepend("hi! ");
        java.lang.String str12 = element11.outerHtml();
        org.jsoup.nodes.Attributes attributes13 = element11.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", attributes13);
        org.jsoup.select.Elements elements16 = element14.getElementsByIndexEquals(10);
        org.jsoup.nodes.Element element18 = element14.getElementById("<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = element18.absUrl("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &amp;lt;#root class=&amp;quot; hi!&amp;quot;&amp;gt; &amp;lt;#root class=&amp;quot;&amp;quot;&amp;gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! #document &lt;/body&gt; &lt;/html&gt; &lt;/body&gt; &lt;/html&gt; &lt;/body&gt; &lt;/html&gt;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str12, "hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNull(element18);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
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
        java.lang.String str20 = tag18.toString();
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str24 = document23.tagName();
        document23.setBaseUri("");
        org.jsoup.nodes.Element element28 = document23.addClass("");
        org.jsoup.nodes.Element element30 = document23.toggleClass("");
        org.jsoup.nodes.Element element32 = document23.addClass("hi!");
        org.jsoup.parser.Tag tag33 = document23.tag();
        org.jsoup.nodes.Element element35 = document23.addClass("");
        org.jsoup.nodes.Element element37 = document23.prependElement("hi!");
        org.jsoup.parser.Tag tag38 = document23.tag();
        java.lang.String str39 = tag38.getName();
        org.jsoup.parser.Tag tag40 = tag38.getImplicitParent();
        boolean boolean41 = tag38.isBlock();
        boolean boolean42 = tag18.canContain(tag38);
        org.jsoup.parser.Tag tag43 = tag38.getImplicitParent();
        java.lang.String str44 = tag38.getName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "body" + "'", str20, "body");
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "#root" + "'", str39, "#root");
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "#root" + "'", str44, "#root");
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
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
        java.lang.String str32 = element31.html();
        org.jsoup.nodes.Element element33 = element31.empty();
        org.jsoup.select.Elements elements34 = element33.siblingElements();
        java.lang.String str35 = element33.outerHtml();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\n<#document>\n</#document>" + "'", str35, "\n<#document>\n</#document>");
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
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
        java.lang.String str34 = element33.nodeName();
        org.jsoup.select.Elements elements37 = element33.getElementsByAttributeValue("\n<&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>\n</&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.jsoup.nodes.Element element39 = element33.prependText("\n<#document class=\"\">\n</#document>");
        org.jsoup.select.Elements elements42 = element33.getElementsByAttributeValueNot("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n  <html> \n   <head> \n   </head> \n   <body>\n     hi!   #document \n   </body>\n  </html>\n </body>\n</html>\n</#root>\n<html> \n<head> \n</head> \n<body>  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;", "#root");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#document" + "'", str34, "#document");
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(elements42);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse(" body hi!", "<html> <head> </head> <body> </body> </html> hi! hi!");
        boolean boolean3 = document2.isBlock();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
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
        org.jsoup.nodes.Element element32 = element30.prepend("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n</#root>");
        org.jsoup.nodes.Element element34 = element32.addClass("<#root>\n<html> \n<head> \n</head> \n<body>\n  hi!  &lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   \n  </body>\n </html>\n</body>\n</html>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
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
        org.jsoup.select.Elements elements37 = element34.getElementsByAttributeValueContaining("hi! <html> <head> </head> <body> hi! </body> </html>hi! hi!", "<html>\n<head>\n</head>\n<body>\n body \n</body>\n</html>");
        org.jsoup.select.Elements elements40 = element34.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! #document", "<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>hi! hi!body#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#document" + "'", str30, "#document");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(elements40);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element9 = document2.appendText("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element12 = document2.empty();
        org.jsoup.select.Elements elements14 = document2.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Element element16 = document2.prependElement("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.nodes.Element element18 = document2.val("");
        org.jsoup.select.Elements elements21 = document2.getElementsByAttributeValue("<html>\n <head>\n </head>\n <body>\n  #root \n </body>\n</html><#root>\n #root\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root<#root>\n  <html>\n   <head>\n   </head>\n   <body>\n    hi! \n   </body>\n  </html><#root>\n   <html>\n    <head>\n    </head>\n    <body>\n     hi! \n    </body>\n   </html>#root\n  </#root>\n </#root>\n</#root>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;", "<#root class=\"\">\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi> \n</hi> \n<html> \n <head> \n </head> \n <body>\n   hi!  hi!\n </body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
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
        java.lang.String[] strArray36 = new java.lang.String[] { "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi! ", "#root", "body" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        org.jsoup.nodes.Element element39 = element31.classNames((java.util.Set<java.lang.String>) strSet37);
        element31.setBaseUri("hi! #document");
        org.jsoup.nodes.Document document44 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str45 = document44.tagName();
        document44.setBaseUri("");
        document44.setBaseUri("");
        org.jsoup.nodes.Document document52 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str53 = document52.tagName();
        document52.setBaseUri("");
        document52.setBaseUri("");
        org.jsoup.nodes.Element element58 = document44.appendChild((org.jsoup.nodes.Node) document52);
        java.lang.String str59 = document44.baseUri();
        org.jsoup.parser.Tag tag60 = document44.tag();
        org.jsoup.select.Elements elements62 = document44.getElementsByAttribute("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document");
        java.util.Set<java.lang.String> strSet63 = document44.classNames();
        org.jsoup.nodes.Element element64 = element31.classNames(strSet63);
        boolean boolean66 = element64.hasAttr("<html>\n<head>\n</head>\n<body>\n #root \n <html> \n  <head> \n  </head> \n  <body>\n    hi!  #root&lt;#root&gt; \n   <html> \n    <head> \n    </head> \n    <body>\n      hi!  &lt;#root&gt; \n     <html> \n      <head> \n      </head> \n      <body>\n        hi!  #root  \n      </body>\n     </html>\n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi! ", "#root", "body" });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "#root" + "'", str45, "#root");
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "#root" + "'", str53, "#root");
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(tag60);
        org.junit.Assert.assertNotNull(elements62);
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
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
        java.lang.String str56 = element20.toString();
        org.jsoup.nodes.Document document59 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str60 = document59.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList61 = document59.childNodes();
        org.jsoup.nodes.Node node63 = document59.childNode(0);
        org.jsoup.nodes.Element element65 = document59.val("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#roothi!<&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>\n</&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>");
        org.jsoup.nodes.Element element66 = element20.appendChild((org.jsoup.nodes.Node) element65);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#root" + "'", str32, "#root");
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "#root" + "'", str44, "#root");
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNull(element52);
        org.junit.Assert.assertNotNull(strSet54);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "<hi! #document>\n</hi! #document>" + "'", str56, "<hi! #document>\n</hi! #document>");
        org.junit.Assert.assertNotNull(document59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "#root" + "'", str60, "#root");
        org.junit.Assert.assertNotNull(nodeList61);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(element66);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
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
        document20.setBaseUri("");
        org.jsoup.nodes.Element element25 = document20.addClass("");
        org.jsoup.select.Elements elements26 = element25.parents();
        org.jsoup.select.Elements elements27 = element25.getAllElements();
        org.jsoup.nodes.Attributes attributes28 = element25.attributes();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag3, "hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", attributes28);
        org.jsoup.nodes.Element element31 = element29.toggleClass("<html>\n <head>\n </head>\n <body>\n  #root \n </body>\n</html><#root>\n #root\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root<#root>\n  <html>\n   <head>\n   </head>\n   <body>\n    hi! \n   </body>\n  </html><#root>\n   <html>\n    <head>\n    </head>\n    <body>\n     hi! \n    </body>\n   </html>#root\n  </#root>\n </#root>\n</#root>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element33 = element29.prepend("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "body" + "'", str13, "body");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "body" + "'", str14, "body");
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#root" + "'", str21, "#root");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#roothi!<&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>\n</&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!>");
        boolean boolean2 = tag1.preserveWhitespace();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        org.jsoup.select.Elements elements9 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element10 = document2.parent();
        boolean boolean12 = document2.hasAttr(" body hi!");
        document2.setBaseUri("<#root class=\" #root\">\n</#root><#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
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
        org.jsoup.select.Elements elements39 = element33.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            element33.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#document" + "'", str32, "#document");
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements39);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
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
        org.jsoup.nodes.Element element21 = document10.removeClass("hi! ");
        org.jsoup.select.Elements elements22 = document10.children();
        org.jsoup.select.Elements elements24 = document10.getElementsByIndexGreaterThan((int) ' ');
        org.jsoup.select.Elements elements27 = document10.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body> &lt;#document&gt; \n</body>\n</html><#root hi!=\"#document\" class=\" body hi!\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>#root\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
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
        boolean boolean20 = tag18.isEmpty();
        java.lang.String str21 = tag18.toString();
        boolean boolean22 = tag18.preserveWhitespace();
        boolean boolean23 = tag18.isInline();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "body" + "'", str21, "body");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
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
        org.jsoup.nodes.Element element22 = document14.append("body");
        org.jsoup.nodes.Element element24 = document14.html("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.parser.Tag tag25 = document14.tag();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(tag25);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean4 = document2.hasAttr("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        org.jsoup.nodes.Element element6 = document2.appendElement("<html> \n<head> \n</head> \n<body>\n  hi!  hi!&lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.nodes.Element element8 = document2.removeClass("");
        org.jsoup.select.Elements elements10 = element8.getElementsByIndexGreaterThan((int) (byte) 1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "hi!");
        java.lang.String str3 = document2.toString();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str7 = document6.tagName();
        document6.setBaseUri("");
        org.jsoup.nodes.Element element11 = document6.addClass("");
        org.jsoup.nodes.Element element13 = document6.toggleClass("");
        org.jsoup.nodes.Element element15 = document6.addClass("hi!");
        org.jsoup.parser.Tag tag16 = document6.tag();
        org.jsoup.nodes.Element element18 = document6.addClass("");
        org.jsoup.nodes.Element element20 = document6.prependElement("hi!");
        org.jsoup.nodes.Element element22 = element20.wrap("\n<body>\n</body>");
        boolean boolean23 = document2.equals((java.lang.Object) element20);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
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
        java.lang.String str33 = element32.toString();
        element32.setBaseUri("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! #document");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<#root>\n<html> \n<head> \n</head> \n<body>\n  hi!  &lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   \n  </body>\n </html>\n</body>\n</html>\n</#root>" + "'", str33, "<#root>\n<html> \n<head> \n</head> \n<body>\n  hi!  &lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   \n  </body>\n </html>\n</body>\n</html>\n</#root>");
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str2 = tag1.getName();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        boolean boolean4 = tag1.isEmpty();
        java.lang.String str5 = tag1.toString();
        boolean boolean6 = tag1.isBlock();
        boolean boolean7 = tag1.isData();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
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
        org.jsoup.select.Elements elements30 = element27.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str32 = element27.attr("body#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>\n</#root>");
        org.jsoup.nodes.Element element34 = element27.appendText("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &amp;lt;#root class=&amp;quot; hi!&amp;quot;&amp;gt; &amp;lt;#root class=&amp;quot;&amp;quot;&amp;gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! #document &lt;/body&gt; &lt;/html&gt; &lt;/body&gt; &lt;/html&gt; &lt;/body&gt; &lt;/html&gt;");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element36 = element27.child(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element34);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
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
        boolean boolean23 = tag17.isInline();
        boolean boolean24 = tag17.isData();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#root" + "'", str21, "#root");
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("\n<<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! #document>\n</<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! #document>", "");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str2 = tag1.getName();
        boolean boolean3 = tag1.isData();
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str6 = tag5.getName();
        org.jsoup.parser.Tag tag7 = tag5.getImplicitParent();
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node13 = document11.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document11.childNodes();
        org.jsoup.nodes.Attributes attributes15 = document11.attributes();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag7, "#root", attributes15);
        java.lang.String str17 = tag7.getName();
        java.lang.String str18 = tag7.toString();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag7, "");
        org.jsoup.select.Elements elements21 = element20.parents();
        boolean boolean22 = tag1.equals((java.lang.Object) elements21);
        java.lang.String str23 = tag1.getName();
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
        org.jsoup.nodes.Node node43 = document26.removeAttr("#root");
        java.lang.String str44 = document26.nodeName();
        java.lang.String str45 = document26.outerHtml();
        document26.setBaseUri("");
        boolean boolean49 = document26.hasClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        java.lang.String str51 = document26.attr("hi!");
        org.jsoup.parser.Tag tag52 = document26.tag();
        boolean boolean53 = tag1.canContain(tag52);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "body" + "'", str17, "body");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "body" + "'", str18, "body");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#root" + "'", str23, "#root");
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#root" + "'", str27, "#root");
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#root" + "'", str35, "#root");
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "#document" + "'", str44, "#document");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        java.lang.String str8 = element7.className();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
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
        boolean boolean20 = document2.hasClass("body#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>\n</#root>");
        org.jsoup.nodes.Element element22 = document2.html("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        java.lang.String str23 = element22.html();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<html> \n<head> \n</head> \n<body>\n  hi!  &lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   \n  </body>\n </html>\n</body>\n</html>" + "'", str23, "<html> \n<head> \n</head> \n<body>\n  hi!  &lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   \n  </body>\n </html>\n</body>\n</html>");
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", " hi! #document");
        org.jsoup.select.Elements elements3 = document2.getAllElements();
        java.lang.String str5 = document2.attr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi! <#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        java.lang.String str6 = document2.text();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! <#root> hi!" + "'", str6, "hi! <#root> hi!");
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
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
        org.jsoup.nodes.Document document51 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str52 = document51.tagName();
        document51.setBaseUri("");
        org.jsoup.nodes.Element element56 = document51.addClass("");
        boolean boolean57 = tag23.equals((java.lang.Object) "");
        java.lang.String str58 = tag23.getName();
        boolean boolean59 = tag3.isValidParent(tag23);
        boolean boolean60 = tag23.isInline();
        org.jsoup.nodes.Document document63 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str64 = document63.tagName();
        document63.setBaseUri("");
        document63.setBaseUri("");
        org.jsoup.nodes.Element element70 = document63.appendText("#root");
        document63.setBaseUri("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Document document75 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element element77 = document75.child(0);
        java.util.Set<java.lang.String> strSet78 = element77.classNames();
        org.jsoup.nodes.Element element79 = document63.classNames(strSet78);
        java.lang.String str80 = element79.val();
        java.lang.String str81 = element79.toString();
        org.jsoup.nodes.Element element83 = element79.removeClass("");
        boolean boolean84 = tag23.equals((java.lang.Object) element83);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "body" + "'", str13, "body");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "body" + "'", str14, "body");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#root" + "'", str27, "#root");
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#root" + "'", str35, "#root");
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "#root" + "'", str46, "#root");
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "#root" + "'", str52, "#root");
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "#root" + "'", str58, "#root");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(document63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "#root" + "'", str64, "#root");
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertNotNull(document75);
        org.junit.Assert.assertNotNull(element77);
        org.junit.Assert.assertNotNull(strSet78);
        org.junit.Assert.assertNotNull(element79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root" + "'", str81, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root");
        org.junit.Assert.assertNotNull(element83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
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
        java.lang.String str16 = tag3.getName();
        java.lang.String str17 = tag3.toString();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "body" + "'", str13, "body");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "body" + "'", str16, "body");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "body" + "'", str17, "body");
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node53 = element20.childNode(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#root" + "'", str35, "#root");
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element51);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
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
        java.lang.String str45 = element42.absUrl("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.jsoup.nodes.Document document48 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str49 = document48.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = document48.childNodes();
        java.lang.Integer int51 = document48.elementSiblingIndex();
        org.jsoup.select.Elements elements53 = document48.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element55 = document48.html("\n<body>\n</body>");
        org.jsoup.nodes.Element element56 = element42.appendChild((org.jsoup.nodes.Node) document48);
        org.jsoup.select.Elements elements57 = document48.children();
        java.util.List<org.jsoup.nodes.Node> nodeList58 = document48.siblingNodes();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#root" + "'", str33, "#root");
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "#root" + "'", str49, "#root");
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(elements57);
        org.junit.Assert.assertNotNull(nodeList58);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        document2.setBaseUri("");
        org.jsoup.nodes.Element element10 = document2.toggleClass("hi!");
        org.jsoup.nodes.Element element12 = element10.toggleClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = element12.addClass(" body hi!");
        org.jsoup.nodes.Element element16 = element14.prepend("<html> \n<head> \n</head> \n<body>  \n</body>\n</html>body#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element9 = element7.appendText("hi! ");
        org.jsoup.nodes.Element element11 = element7.addClass("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root><#document>\n</#document>");
        org.jsoup.select.Elements elements13 = element11.getElementsByAttribute("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Element element15 = element11.appendElement("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root");
        org.jsoup.nodes.Element element17 = element15.html("<#root class=\" hi!\"> <#root class=\"\"> hi! #document");
        org.jsoup.nodes.Element element19 = element17.toggleClass("<html> \n<head> \n</head> \n<body>  \n</body>\n</html>body#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>\n</#root>");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = element17.childNodes();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
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
        org.jsoup.nodes.Element element56 = element51.previousElementSibling();
        org.jsoup.select.Elements elements59 = element51.getElementsByAttributeValueNot("hi! #document", "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.nodes.Element element60 = element51.empty();
        java.lang.String str61 = element51.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#document" + "'", str30, "#document");
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#root" + "'", str34, "#root");
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#root" + "'", str42, "#root");
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNull(element56);
        org.junit.Assert.assertNotNull(elements59);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "#document" + "'", str61, "#document");
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.select.Elements elements8 = document2.getElementsByAttributeValueNot("hi! ", "body");
        org.jsoup.select.Elements elements9 = document2.parents();
        java.lang.String str10 = document2.nodeName();
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str14 = document13.tagName();
        document13.setBaseUri("");
        document13.setBaseUri("");
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str22 = document21.tagName();
        document21.setBaseUri("");
        document21.setBaseUri("");
        org.jsoup.nodes.Element element27 = document13.appendChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Element element28 = document13.empty();
        org.jsoup.nodes.Node node30 = document13.removeAttr("#root");
        org.jsoup.nodes.Element element32 = document13.addClass("hi!");
        org.jsoup.nodes.Document document35 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node37 = document35.removeAttr("hi!");
        org.jsoup.nodes.Element element39 = document35.addClass("");
        org.jsoup.nodes.Element element40 = document13.prependChild((org.jsoup.nodes.Node) element39);
        org.jsoup.nodes.Element element42 = element39.prependElement("#document");
        java.lang.String str44 = element42.absUrl("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element45 = document2.prependChild((org.jsoup.nodes.Node) element42);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
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
        org.jsoup.nodes.Element element24 = document2.appendElement("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>#document");
        org.jsoup.nodes.Element element26 = element24.toggleClass("hi! #document<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = element26.childNode(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
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
        org.jsoup.select.Elements elements38 = element31.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        org.jsoup.nodes.Document document41 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str42 = document41.tagName();
        document41.setBaseUri("");
        document41.setBaseUri("");
        org.jsoup.nodes.Element element48 = document41.appendText("#root");
        document41.setBaseUri("");
        org.jsoup.nodes.Element element51 = document41.empty();
        org.jsoup.select.Elements elements53 = element51.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element54 = element31.appendChild((org.jsoup.nodes.Node) element51);
        java.lang.String str55 = element54.val();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "body", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#root" + "'", str42, "#root");
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
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
        java.lang.String[] strArray36 = new java.lang.String[] { "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi! ", "#root", "body" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        org.jsoup.nodes.Element element39 = element31.classNames((java.util.Set<java.lang.String>) strSet37);
        element31.setBaseUri("hi! #document");
        boolean boolean42 = element31.hasText();
        org.jsoup.nodes.Element element44 = element31.addClass("<hi! #document>\n</hi! #document>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str45 = element31.nodeName();
        org.jsoup.nodes.Element element46 = element31.lastElementSibling();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi! ", "#root", "body" });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "#document" + "'", str45, "#document");
        org.junit.Assert.assertNull(element46);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
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
        java.lang.String str23 = element18.val();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! hi!hi!" + "'", str23, "hi! hi!hi!");
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.append("hi!");
        org.jsoup.nodes.Element element13 = document2.addClass("\n<body>\n</body>");
        boolean boolean15 = document2.hasAttr("<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str19 = document18.tagName();
        document18.setBaseUri("");
        org.jsoup.nodes.Element element23 = document18.addClass("");
        org.jsoup.nodes.Element element25 = document18.toggleClass("");
        org.jsoup.nodes.Element element27 = element25.html("");
        org.jsoup.select.Elements elements30 = element25.getElementsByAttributeValue("hi! ", "#root");
        org.jsoup.nodes.Element element32 = element25.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str33 = element32.className();
        org.jsoup.nodes.Element element35 = element32.prependElement("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        org.jsoup.nodes.Element element36 = element35.nextElementSibling();
        org.jsoup.nodes.Element element37 = element36.empty();
        boolean boolean38 = document2.equals((java.lang.Object) element37);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        java.lang.String str9 = document2.attr("#root");
        org.jsoup.nodes.Element element11 = document2.text("");
        boolean boolean13 = element11.hasAttr("#document");
        java.lang.String str14 = element11.className();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
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
        org.jsoup.select.Elements elements30 = element27.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str32 = element27.attr("body#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>\n</#root>");
        java.lang.String str33 = element27.val();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
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
        java.lang.Integer int24 = document2.elementSiblingIndex();
        org.jsoup.select.Elements elements25 = document2.parents();
        org.jsoup.select.Elements elements27 = document2.getElementsByIndexGreaterThan((int) 'a');
        java.lang.String str28 = document2.tagName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#root" + "'", str28, "#root");
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("<#document>\n</#document>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("#root", "hi!");
        java.util.Set<java.lang.String> strSet6 = document5.classNames();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element11 = document9.appendText("#root");
        org.jsoup.nodes.Element element13 = document9.prepend("#root");
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str17 = document16.tagName();
        document16.setBaseUri("");
        document16.setBaseUri("");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str25 = document24.tagName();
        document24.setBaseUri("");
        document24.setBaseUri("");
        org.jsoup.nodes.Element element31 = document24.appendText("#root");
        org.jsoup.nodes.Element element32 = document16.appendChild((org.jsoup.nodes.Node) document24);
        java.lang.String str33 = element32.baseUri();
        org.jsoup.nodes.Element element34 = document9.appendChild((org.jsoup.nodes.Node) element32);
        org.jsoup.nodes.Element element35 = document5.appendChild((org.jsoup.nodes.Node) element34);
        org.jsoup.nodes.Element element37 = document5.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element39 = document5.toggleClass("\n<body>\n</body>");
        org.jsoup.nodes.Element element40 = element39.empty();
        org.jsoup.nodes.Attributes attributes41 = element40.attributes();
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element(tag1, "&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!", attributes41);
        boolean boolean43 = tag1.isInline();
        boolean boolean44 = tag1.isEmpty();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#root" + "'", str17, "#root");
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#root" + "'", str25, "#root");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "hi!");
        org.jsoup.nodes.Element element4 = document2.appendElement("body#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>\n</#root>");
        org.jsoup.nodes.Element element6 = document2.appendText("<html>\n<head>\n</head>\n<body>\n body\n</body>\n</html>");
        org.jsoup.select.Elements elements9 = document2.getElementsByAttributeValueStarting("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root><#document>\n</#document>", "<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>hi! hi!body#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element element4 = document2.child(0);
        org.jsoup.nodes.Element element5 = element4.parent();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Element element8 = element4.prependElement("body");
        org.jsoup.nodes.Element element9 = element4.parent();
        org.jsoup.parser.Tag tag10 = element4.tag();
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str14 = document13.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document13.childNodes();
        boolean boolean17 = document13.hasAttr("#root");
        org.jsoup.parser.Tag tag18 = document13.tag();
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str22 = document21.tagName();
        document21.setBaseUri("");
        document21.setBaseUri("");
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str30 = document29.tagName();
        document29.setBaseUri("");
        document29.setBaseUri("");
        org.jsoup.nodes.Element element36 = document29.appendText("#root");
        org.jsoup.nodes.Element element37 = document21.appendChild((org.jsoup.nodes.Node) document29);
        boolean boolean38 = tag18.equals((java.lang.Object) element37);
        org.jsoup.parser.Tag tag40 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str41 = tag40.getName();
        org.jsoup.parser.Tag tag42 = tag40.getImplicitParent();
        boolean boolean43 = tag18.canContain(tag42);
        java.lang.String str44 = tag18.toString();
        java.lang.String str45 = tag18.getName();
        org.jsoup.nodes.Document document48 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str49 = document48.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = document48.childNodes();
        boolean boolean52 = document48.hasAttr("#root");
        org.jsoup.parser.Tag tag53 = document48.tag();
        org.jsoup.nodes.Document document56 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str57 = document56.tagName();
        document56.setBaseUri("");
        document56.setBaseUri("");
        org.jsoup.nodes.Document document64 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str65 = document64.tagName();
        document64.setBaseUri("");
        document64.setBaseUri("");
        org.jsoup.nodes.Element element71 = document64.appendText("#root");
        org.jsoup.nodes.Element element72 = document56.appendChild((org.jsoup.nodes.Node) document64);
        boolean boolean73 = tag53.equals((java.lang.Object) element72);
        org.jsoup.parser.Tag tag75 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str76 = tag75.getName();
        org.jsoup.parser.Tag tag77 = tag75.getImplicitParent();
        boolean boolean78 = tag53.canContain(tag77);
        org.jsoup.nodes.Document document81 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str82 = document81.tagName();
        document81.setBaseUri("");
        org.jsoup.nodes.Element element86 = document81.addClass("");
        boolean boolean87 = tag53.equals((java.lang.Object) "");
        boolean boolean88 = tag53.canContainBlock();
        boolean boolean89 = tag18.canContain(tag53);
        boolean boolean90 = tag10.isValidParent(tag53);
        boolean boolean91 = tag10.canContainBlock();
        boolean boolean92 = tag10.isEmpty();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#root" + "'", str41, "#root");
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "#root" + "'", str44, "#root");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "#root" + "'", str45, "#root");
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "#root" + "'", str49, "#root");
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNotNull(document56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "#root" + "'", str57, "#root");
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "#root" + "'", str65, "#root");
        org.junit.Assert.assertNotNull(element71);
        org.junit.Assert.assertNotNull(element72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(tag75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "#root" + "'", str76, "#root");
        org.junit.Assert.assertNotNull(tag77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(document81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "#root" + "'", str82, "#root");
        org.junit.Assert.assertNotNull(element86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("<#root class=\"\">\n</#root>");
        org.jsoup.parser.Tag tag2 = tag1.getImplicitParent();
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str6 = document5.tagName();
        document5.setBaseUri("");
        org.jsoup.nodes.Element element10 = document5.addClass("");
        org.jsoup.nodes.Element element12 = document5.toggleClass("");
        org.jsoup.nodes.Element element14 = document5.addClass("hi!");
        org.jsoup.parser.Tag tag15 = document5.tag();
        org.jsoup.nodes.Element element17 = document5.addClass("");
        org.jsoup.nodes.Element element19 = document5.prependElement("hi!");
        org.jsoup.parser.Tag tag20 = document5.tag();
        java.lang.String str21 = tag20.getName();
        org.jsoup.parser.Tag tag22 = tag20.getImplicitParent();
        java.lang.String str23 = tag20.toString();
        boolean boolean24 = tag20.isData();
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str28 = document27.tagName();
        document27.setBaseUri("");
        org.jsoup.nodes.Element element32 = document27.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element34 = document27.appendText("hi! ");
        java.lang.String str35 = element34.html();
        org.jsoup.nodes.Document document38 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node40 = document38.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList41 = document38.childNodes();
        org.jsoup.nodes.Attributes attributes42 = document38.attributes();
        java.lang.String str44 = document38.attr("#root");
        org.jsoup.select.Elements elements47 = document38.getElementsByAttributeValueEnding("#root", "<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root>");
        org.jsoup.nodes.Element element48 = element34.appendChild((org.jsoup.nodes.Node) document38);
        boolean boolean49 = tag20.equals((java.lang.Object) element48);
        java.lang.String str50 = tag20.getName();
        boolean boolean51 = tag2.canContain(tag20);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#root" + "'", str21, "#root");
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#root" + "'", str23, "#root");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#root" + "'", str28, "#root");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!" + "'", str35, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi!");
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "#root" + "'", str50, "#root");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node63 = node60.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#root" + "'", str36, "#root");
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#root" + "'", str42, "#root");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "#root" + "'", str43, "#root");
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "#root" + "'", str47, "#root");
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
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
        java.lang.String str35 = element34.val();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#root" + "'", str23, "#root");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNull(element31);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
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
        java.util.List<org.jsoup.nodes.Node> nodeList30 = document2.childNodes();
        org.jsoup.nodes.Element element32 = document2.addClass("\n<<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! #document>\n</<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi! #document>");
        org.jsoup.nodes.Element element33 = document2.parent();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNull(element33);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
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
        org.jsoup.nodes.Element element33 = element31.removeClass("hi! ");
        org.jsoup.select.Elements elements35 = element33.getElementsByIndexLessThan(0);
        org.jsoup.nodes.Element element37 = element33.text("<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.select.Elements elements39 = element37.getElementsByAttribute("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><<body>\n</body>>\n</<body>\n</body>>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements39);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html> <head> </head> <body> hi! </body> </html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;hi! <#root> <html> <head> </head> <body> hi! </body> </html> </#root>", "<#root class=\"\">\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
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
        org.jsoup.nodes.Element element35 = element33.prepend("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>#root\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "body", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
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
        org.jsoup.select.Elements elements35 = element33.getElementsByTag(" hi! #document");
        org.jsoup.nodes.Element element36 = element33.firstElementSibling();
        java.lang.String str37 = element33.baseUri();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNull(element36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str2 = tag1.getName();
        boolean boolean3 = tag1.isData();
        java.lang.String str4 = tag1.toString();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str7 = element6.val();
        org.jsoup.nodes.Element element9 = element6.appendText("#document");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element14 = document12.appendText("#root");
        org.jsoup.nodes.Element element16 = document12.prepend("#root");
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str20 = document19.tagName();
        document19.setBaseUri("");
        document19.setBaseUri("");
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str28 = document27.tagName();
        document27.setBaseUri("");
        document27.setBaseUri("");
        org.jsoup.nodes.Element element34 = document27.appendText("#root");
        org.jsoup.nodes.Element element35 = document19.appendChild((org.jsoup.nodes.Node) document27);
        java.lang.String str36 = element35.baseUri();
        org.jsoup.nodes.Element element37 = document12.appendChild((org.jsoup.nodes.Node) element35);
        org.jsoup.nodes.Element element39 = document12.prependText("hi!");
        org.jsoup.nodes.Element element41 = document12.removeClass("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList42 = element41.childNodes();
        java.lang.String str43 = element41.data();
        java.lang.String str44 = element41.outerHtml();
        org.jsoup.nodes.Element element46 = element41.addClass("<html>\n<head>\n</head>\n<body>\n &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   #document \n  </body>\n </html>\n</body>\n</html>");
        boolean boolean47 = element9.equals((java.lang.Object) "<html>\n<head>\n</head>\n<body>\n &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   #document \n  </body>\n </html>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#root" + "'", str28, "#root");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>\n</#root>" + "'", str44, "hi!#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>#root<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>#root\n</#root>\n</#root>");
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root \n<html> \n <head> \n </head> \n <body>\n   hi!  #roothi!&lt;&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi> \n  </hi> \n  <html> \n   <head> \n   </head> \n   <body>\n     hi!  hi!&gt;   \n    <html> \n     <head> \n     </head> \n     <body>\n       hi!  hi!&gt;\n     </body>\n    </html>\n   </body>\n  </html>\n </body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; hi! &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;hi!");
        boolean boolean2 = tag1.isEmpty();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
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
        org.jsoup.nodes.Attributes attributes23 = element20.attributes();
        java.lang.String str25 = element20.attr("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>#document\n</#root>\n<html> \n<head> \n</head> \n<body>\n  hi! #document\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
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
        java.lang.String str32 = element31.html();
        org.jsoup.nodes.Element element33 = element31.empty();
        org.jsoup.nodes.Element element34 = element31.nextElementSibling();
        org.jsoup.nodes.Element element36 = element31.text("<html> \n<head> \n</head> \n<body>\n  &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi! #document    \n  </body>\n </html>\n</body>\n</html><<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html><#root>\n</#root>", "<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    hi!  \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str6 = document5.tagName();
        document5.setBaseUri("");
        org.jsoup.nodes.Element element10 = document5.addClass("");
        org.jsoup.nodes.Element element12 = document5.toggleClass("");
        boolean boolean13 = element12.isBlock();
        org.jsoup.nodes.Element element14 = document2.prependChild((org.jsoup.nodes.Node) element12);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("body", "body");
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str9 = document8.tagName();
        document8.setBaseUri("");
        document8.setBaseUri("");
        java.lang.String str15 = document8.attr("#root");
        org.jsoup.nodes.Element element16 = document2.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element18 = document2.appendElement("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>body");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.nodes.Element element9 = document2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document2.childNodes();
        org.jsoup.select.Elements elements12 = document2.getElementsByTag("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Element element15 = document2.attr(" <html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n  <html> \n   <head> \n   </head> \n   <body>\n     hi!   #document \n   </body>\n  </html>\n </body>\n</html>\n</#root>\n<html> \n<head> \n</head> \n<body>  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
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
        org.jsoup.select.Elements elements70 = element68.getAllElements();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#root" + "'", str37, "#root");
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#root" + "'", str42, "#root");
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "#root" + "'", str45, "#root");
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "#root" + "'", str48, "#root");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "#root" + "'", str55, "#root");
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(attributes65);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(elements70);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        java.lang.Integer int5 = document2.elementSiblingIndex();
        java.lang.String str6 = document2.text();
        org.jsoup.nodes.Element element8 = document2.val("<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
        org.jsoup.select.Elements elements9 = element8.children();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        java.lang.String str2 = tag1.getName();
        boolean boolean3 = tag1.isData();
        java.lang.String str4 = tag1.toString();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.parser.Tag tag7 = tag1.getImplicitParent();
        java.lang.String str8 = tag1.getName();
        java.lang.String str9 = tag1.getName();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        boolean boolean6 = document2.hasAttr("#root");
        org.jsoup.parser.Tag tag7 = document2.tag();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Element element12 = document10.appendText("#root");
        org.jsoup.nodes.Element element14 = document10.prepend("#root");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str18 = document17.tagName();
        document17.setBaseUri("");
        document17.setBaseUri("");
        org.jsoup.nodes.Document document25 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str26 = document25.tagName();
        document25.setBaseUri("");
        document25.setBaseUri("");
        org.jsoup.nodes.Element element32 = document25.appendText("#root");
        org.jsoup.nodes.Element element33 = document17.appendChild((org.jsoup.nodes.Node) document25);
        java.lang.String str34 = element33.baseUri();
        org.jsoup.nodes.Element element35 = document10.appendChild((org.jsoup.nodes.Node) element33);
        org.jsoup.select.Elements elements38 = element35.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean39 = tag7.equals((java.lang.Object) "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#root" + "'", str26, "#root");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "hi!");
        java.util.Set<java.lang.String> strSet3 = document2.classNames();
        org.jsoup.nodes.Element element5 = document2.val("#document");
        org.jsoup.nodes.Element element7 = element5.prependText("");
        java.lang.String str8 = element7.baseUri();
        org.jsoup.nodes.Element element10 = element7.text("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.jsoup.select.Elements elements11 = element7.getAllElements();
        org.jsoup.nodes.Element element12 = element7.parent();
        org.jsoup.nodes.Element element14 = element7.getElementById(" hi!");
        org.jsoup.select.Elements elements15 = element7.children();
        java.lang.String str16 = element7.data();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
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
        org.jsoup.nodes.Element element71 = element66.empty();
        java.util.Set<java.lang.String> strSet72 = element66.classNames();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#root" + "'", str37, "#root");
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#root" + "'", str42, "#root");
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "#root" + "'", str45, "#root");
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "#root" + "'", str48, "#root");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "#root" + "'", str55, "#root");
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(attributes65);
        org.junit.Assert.assertNotNull(elements67);
        org.junit.Assert.assertNotNull(elements70);
        org.junit.Assert.assertNotNull(element71);
        org.junit.Assert.assertNotNull(strSet72);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        document2.setBaseUri("");
        org.jsoup.nodes.Element element7 = document2.addClass("");
        org.jsoup.nodes.Element element9 = document2.toggleClass("");
        org.jsoup.nodes.Element element11 = document2.addClass("hi!");
        java.lang.String str12 = document2.outerHtml();
        org.jsoup.nodes.Element element14 = document2.child(0);
        org.jsoup.nodes.Element element16 = element14.text("");
        org.jsoup.nodes.Element element17 = element16.parent();
        java.lang.String str18 = element16.data();
        org.jsoup.nodes.Element element20 = element16.getElementById(" hi! <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element22 = element16.addClass("<html>\n<head>\n</head>\n<body>\n body\n</body>\n</html>#root");
        org.jsoup.parser.Tag tag23 = element16.tag();
        java.lang.String str24 = element16.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = element16.childNodes();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>" + "'", str12, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "html" + "'", str24, "html");
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
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
        java.lang.String str55 = element50.text();
        org.jsoup.nodes.Attributes attributes56 = element50.attributes();
        org.jsoup.parser.Tag tag57 = element50.tag();
        boolean boolean58 = tag57.isEmpty();
        org.jsoup.nodes.Document document61 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str62 = document61.tagName();
        document61.setBaseUri("");
        document61.setBaseUri("");
        org.jsoup.nodes.Document document69 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str70 = document69.tagName();
        document69.setBaseUri("");
        document69.setBaseUri("");
        org.jsoup.nodes.Element element75 = document61.appendChild((org.jsoup.nodes.Node) document69);
        org.jsoup.nodes.Element element76 = document61.empty();
        org.jsoup.nodes.Node node78 = document61.removeAttr("#root");
        org.jsoup.nodes.Element element80 = document61.addClass("hi!");
        org.jsoup.nodes.Document document83 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node85 = document83.removeAttr("hi!");
        org.jsoup.nodes.Element element87 = document83.addClass("");
        org.jsoup.nodes.Element element88 = document61.prependChild((org.jsoup.nodes.Node) element87);
        org.jsoup.nodes.Element element90 = element87.prependElement("#document");
        org.jsoup.nodes.Element element92 = element87.append("hi! ");
        org.jsoup.select.Elements elements94 = element92.getElementsByTag(" hi! #document");
        org.jsoup.nodes.Element element96 = element92.val("html");
        org.jsoup.nodes.Element element97 = element96.lastElementSibling();
        boolean boolean98 = tag57.equals((java.lang.Object) element97);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "body", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#root" + "'", str32, "#root");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "#document" + "'", str51, "#document");
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi! #document" + "'", str55, "hi! #document");
        org.junit.Assert.assertNotNull(attributes56);
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "#root" + "'", str62, "#root");
        org.junit.Assert.assertNotNull(document69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "#root" + "'", str70, "#root");
        org.junit.Assert.assertNotNull(element75);
        org.junit.Assert.assertNotNull(element76);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(element80);
        org.junit.Assert.assertNotNull(document83);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(element87);
        org.junit.Assert.assertNotNull(element88);
        org.junit.Assert.assertNotNull(element90);
        org.junit.Assert.assertNotNull(element92);
        org.junit.Assert.assertNotNull(elements94);
        org.junit.Assert.assertNotNull(element96);
        org.junit.Assert.assertNull(element97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi! #document", "hi! ");
        org.jsoup.nodes.Element element4 = document2.text("<html>\n<head>\n</head>\n<body>\n &lt;#root class=&quot; hi!&quot;&gt; &lt;#root class=&quot;&quot;&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   #document \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttributeValueStarting(" body hi!", "<#document>\n</#document>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>", "hi! \n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean12 = document10.hasAttr("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!");
        org.jsoup.nodes.Element element14 = document10.appendElement("<html> \n<head> \n</head> \n<body>\n  hi!  hi!&lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!   \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = document10.prepend("<html> <head> </head> <body> </body> </html> hi! hi!");
        java.util.Set<java.lang.String> strSet17 = document10.classNames();
        org.jsoup.nodes.Element element18 = document2.classNames(strSet17);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
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
        java.lang.String str16 = tag3.toString();
        java.lang.String str17 = tag3.toString();
        boolean boolean18 = tag3.isInline();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "body" + "'", str13, "body");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "body" + "'", str16, "body");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "body" + "'", str17, "body");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
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
        java.lang.String str30 = element20.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#document" + "'", str30, "#document");
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("<html>\n<head>\n</head>\n<body>\n body\n</body>\n</html>");
        java.lang.String str2 = tag1.getName();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<html>\n<head>\n</head>\n<body>\n body\n</body>\n</html>" + "'", str2, "<html>\n<head>\n</head>\n<body>\n body\n</body>\n</html>");
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.lang.String str4 = document2.baseUri();
        org.jsoup.nodes.Element element6 = document2.appendElement("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>hi!<#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.childNodes();
        org.jsoup.nodes.Node node6 = document2.childNode(0);
        boolean boolean8 = document2.hasClass("#root");
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexLessThan((int) (short) 10);
        boolean boolean12 = document2.hasAttr("<#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>");
        java.lang.String str14 = document2.absUrl("<#root class=\" hi!\">\n<#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi! \n  </body>\n </html>\n</#root>#document\n</#root><#document>\n</#document>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
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
        org.jsoup.parser.Tag tag51 = tag31.getImplicitParent();
        org.jsoup.nodes.Document document54 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str55 = document54.tagName();
        document54.setBaseUri("");
        org.jsoup.nodes.Element element59 = document54.addClass("");
        org.jsoup.nodes.Element element61 = document54.toggleClass("");
        org.jsoup.nodes.Element element63 = document54.addClass("hi!");
        org.jsoup.parser.Tag tag64 = document54.tag();
        org.jsoup.nodes.Element element66 = document54.addClass("");
        org.jsoup.nodes.Element element68 = document54.prependElement("hi!");
        org.jsoup.parser.Tag tag69 = document54.tag();
        org.jsoup.select.Elements elements71 = document54.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element74 = document54.attr("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "#root");
        org.jsoup.nodes.Element element75 = document54.parent();
        org.jsoup.parser.Tag tag76 = document54.tag();
        boolean boolean77 = tag76.preserveWhitespace();
        boolean boolean78 = tag51.canContain(tag76);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#root" + "'", str37, "#root");
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#root" + "'", str42, "#root");
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "#root" + "'", str45, "#root");
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "#root" + "'", str48, "#root");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "#root" + "'", str55, "#root");
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(tag64);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(tag69);
        org.junit.Assert.assertNotNull(elements71);
        org.junit.Assert.assertNotNull(element74);
        org.junit.Assert.assertNull(element75);
        org.junit.Assert.assertNotNull(tag76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }
}

